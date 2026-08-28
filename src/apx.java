import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class apx {
   private final aql b;
   private final dcb c;
   @Nullable
   private dvx d = null;
   public final dvx a;
   private volatile boolean e;
   private final List<CompletableFuture<aqb<duw>>> f = new ArrayList<>();
   private final azh<aqm> g;
   private boolean h;

   private apx(aql $$0, dvx $$1, dcb $$2, azh<aqm> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static apx a(aql $$0, dvx $$1, dcb $$2) {
      int $$3 = dvw.a.a($$1).a(dvx.c);
      azh<aqm> $$4 = azh.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(dcb.c($$1x, $$2x)));
      return new apx($$0, $$1, $$2, $$4);
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
      dvx $$0;
      if (this.d == null) {
         $$0 = dvx.c;
      } else if (!this.h && this.d == dvx.c && !this.f()) {
         this.h = true;
         $$0 = dvx.c;
      } else {
         $$0 = dvx.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqm $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dvx.c) {
         return true;
      } else {
         dvx $$0 = this.g.a(this.c.e, this.c.f).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dvv $$1 = dvw.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dvx $$6 = $$1.a($$5);
                  dvx $$7 = this.g.a($$3, $$4).q();
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

   public aqm c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dvx $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            aqm $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dvx $$0, boolean $$1) {
      dvw $$2 = $$1 ? dvw.a : dvw.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dvx $$0, boolean $$1, aqm $$2) {
      dvx $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dvw $$5 = $$4 ? dvw.a : dvw.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqb<duw>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqb<duw> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqb<duw>> $$0 = this.f.getLast();
         aqb<duw> $$1 = $$0.getNow(null);
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
