import java.util.EnumSet;
import java.util.function.Predicate;

public class ccv extends cdd {
   private static final int a = 40;
   private static final Predicate<dxu> b = dyd.a(dkn.bA);
   private final bwh c;
   private final dhh d;
   private int e;

   public ccv(bwh $$0) {
      this.c = $$0;
      this.d = $$0.dW();
      this.a(EnumSet.of(cdd.a.a, cdd.a.b, cdd.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dZ().a(this.c.e_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jh $$0 = this.c.dw();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dkn.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.L().o();
   }

   @Override
   public void e() {
      this.e = 0;
   }

   @Override
   public boolean c() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void a() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         jh $$0 = this.c.dw();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).N().b(dhd.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            jh $$1 = $$0.e();
            if (this.d.a_($$1).a(dkn.i)) {
               if (a(this.d).N().b(dhd.c)) {
                  this.d.c(2001, $$1, dkl.j(dkn.i.m()));
                  this.d.a($$1, dkn.j.m(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
