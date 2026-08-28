import java.util.EnumSet;
import java.util.function.Predicate;

public class cby extends ccg {
   private static final int a = 40;
   private static final Predicate<dwy> b = dxh.a(djp.bA);
   private final bvk c;
   private final dgj d;
   private int e;

   public cby(bvk $$0) {
      this.c = $$0;
      this.d = $$0.dV();
      this.a(EnumSet.of(ccg.a.a, ccg.a.b, ccg.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dY().a(this.c.e_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ji $$0 = this.c.dv();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(djp.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.P().m();
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
         ji $$0 = this.c.dv();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).O().b(dgf.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            ji $$1 = $$0.e();
            if (this.d.a_($$1).a(djp.i)) {
               if (a(this.d).O().b(dgf.c)) {
                  this.d.c(2001, $$1, djn.j(djp.i.m()));
                  this.d.a($$1, djp.j.m(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
