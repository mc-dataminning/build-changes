import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqj {
   private final aqx b;
   private final dcy c;
   @Nullable
   private dwx d = null;
   public final dwx a;
   private volatile boolean e;
   private final List<CompletableFuture<aqn<dvw>>> f = new ArrayList<>();
   private final azw<aqy> g;
   private boolean h;

   private aqj(aqx $$0, dwx $$1, dcy $$2, azw<aqy> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqj a(aqx $$0, dwx $$1, dcy $$2) {
      int $$3 = dww.a.a($$1).a(dwx.c);
      azw<aqy> $$4 = azw.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(dcy.c($$1x, $$2x)));
      return new aqj($$0, $$1, $$2, $$4);
   }

   @Nullable
   public CompletableFuture<?> a() {
      while (true) {
         CompletableFuture<?> $$0 = this.g();
         if ($$0 != null) {
            return $$0;
         }

         if (this.e || this.d == this.a) {
            this.e();
            return null;
         }

         this.d();
      }
   }

   private void d() {
      dwx $$0;
      if (this.d == null) {
         $$0 = dwx.c;
      } else if (!this.h && this.d == dwx.c && !this.f()) {
         this.h = true;
         $$0 = dwx.c;
      } else {
         $$0 = dwx.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqy $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dwx.c) {
         return true;
      } else {
         dwx $$0 = this.g.a(this.c.e, this.c.f).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dwv $$1 = dww.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dwx $$6 = $$1.a($$5);
                  dwx $$7 = this.g.a($$3, $$4).q();
                  if ($$7 == null || $$7.d($$6)) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public aqy c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dwx $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            aqy $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dwx $$0, boolean $$1) {
      dww $$2 = $$1 ? dww.a : dww.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dwx $$0, boolean $$1, aqy $$2) {
      dwx $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dww $$5 = $$4 ? dww.a : dww.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqn<dvw>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqn<dvw> $$7 = $$6.getNow(null);
         if ($$7 == null) {
            this.f.add($$6);
            return true;
         } else if ($$7.a()) {
            return true;
         } else {
            this.b();
            return false;
         }
      }
   }

   @Nullable
   private CompletableFuture<?> g() {
      while (!this.f.isEmpty()) {
         CompletableFuture<aqn<dvw>> $$0 = this.f.getLast();
         aqn<dvw> $$1 = $$0.getNow(null);
         if ($$1 == null) {
            return $$0;
         }

         this.f.removeLast();
         if (!$$1.a()) {
            this.b();
         }
      }

      return null;
   }
}
