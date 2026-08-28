import java.util.EnumSet;
import java.util.function.Predicate;

public class cbq extends cby {
   private static final int a = 40;
   private static final Predicate<dvj> b = dvs.a(dig.bt);
   private final bvc c;
   private final dfb d;
   private int e;

   public cbq(bvc $$0) {
      this.c = $$0;
      this.d = $$0.dX();
      this.a(EnumSet.of(cby.a.a, cby.a.b, cby.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.ea().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jh $$0 = this.c.dx();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dig.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.P().o();
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
         jh $$0 = this.c.dx();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ac().b(dex.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            jh $$1 = $$0.e();
            if (this.d.a_($$1).a(dig.i)) {
               if (this.d.ac().b(dex.c)) {
                  this.d.c(2001, $$1, die.j(dig.i.m()));
                  this.d.a($$1, dig.j.m(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
