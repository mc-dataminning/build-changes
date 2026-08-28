import java.util.EnumSet;
import java.util.function.Predicate;

public class cbw extends cce {
   private static final int a = 40;
   private static final Predicate<dww> b = dxf.a(djn.bA);
   private final bvi c;
   private final dgh d;
   private int e;

   public cbw(bvi $$0) {
      this.c = $$0;
      this.d = $$0.dV();
      this.a(EnumSet.of(cce.a.a, cce.a.b, cce.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dY().a(this.c.e_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ji $$0 = this.c.dv();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(djn.i);
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
            if (a(this.d).O().b(dgd.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            ji $$1 = $$0.e();
            if (this.d.a_($$1).a(djn.i)) {
               if (a(this.d).O().b(dgd.c)) {
                  this.d.c(2001, $$1, djl.j(djn.i.m()));
                  this.d.a($$1, djn.j.m(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
