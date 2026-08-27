import java.util.EnumSet;
import java.util.function.Predicate;

public class bzd extends bzl {
   private static final int a = 40;
   private static final Predicate<dtc> b = dtl.a(dfe.cd);
   private final bsq c;
   private final dca d;
   private int e;

   public bzd(bsq $$0) {
      this.c = $$0;
      this.d = $$0.dU();
      this.a(EnumSet.of(bzl.a.a, bzl.a.b, bzl.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.et().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ir $$0 = this.c.du();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(awe.bZ);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.J().n();
   }

   @Override
   public void d() {
      this.e = 0;
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void e() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         ir $$0 = this.c.du();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ab().b(dbw.c)) {
               this.d.b($$0, false);
            }

            this.c.M();
         } else {
            ir $$1 = $$0.d();
            dtc $$2 = this.d.a_($$1);
            if ($$2.a(awe.bZ)) {
               if (this.d.ab().b(dbw.c)) {
                  this.d.c(2001, $$1, dfc.i($$2));
                  this.d.a($$1, (this.d.z_() ? dfe.n : dfe.m).n(), 2);
               }

               if ($$2.a(dfe.l)) {
                  this.c.b(new brh(brj.s, 20));
               }

               this.c.M();
            }
         }
      }
   }
}
