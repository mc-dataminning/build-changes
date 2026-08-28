import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqp {
   private final ard b;
   private final deb c;
   @Nullable
   private dya d = null;
   public final dya a;
   private volatile boolean e;
   private final List<CompletableFuture<aqt<dwz>>> f = new ArrayList<>();
   private final bad<are> g;
   private boolean h;

   private aqp(ard $$0, dya $$1, deb $$2, bad<are> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqp a(ard $$0, dya $$1, deb $$2) {
      int $$3 = dxz.a.a($$1).a(dya.c);
      bad<are> $$4 = bad.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(deb.c($$1x, $$2x)));
      return new aqp($$0, $$1, $$2, $$4);
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
      dya $$0;
      if (this.d == null) {
         $$0 = dya.c;
      } else if (!this.h && this.d == dya.c && !this.f()) {
         this.h = true;
         $$0 = dya.c;
      } else {
         $$0 = dya.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      are $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dya.c) {
         return true;
      } else {
         dya $$0 = this.g.a(this.c.e, this.c.f).p();
         if ($$0 != null && !$$0.d(this.a)) {
            dxy $$1 = dxz.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dya $$6 = $$1.a($$5);
                  dya $$7 = this.g.a($$3, $$4).p();
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

   public are c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dya $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            are $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dya $$0, boolean $$1) {
      dxz $$2 = $$1 ? dxz.a : dxz.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dya $$0, boolean $$1, are $$2) {
      dya $$3 = $$2.p();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dxz $$5 = $$4 ? dxz.a : dxz.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqt<dwz>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqt<dwz> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqt<dwz>> $$0 = this.f.getLast();
         aqt<dwz> $$1 = $$0.getNow(null);
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
