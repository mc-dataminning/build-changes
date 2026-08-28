import java.util.EnumSet;
import java.util.function.Predicate;

public class cei extends ceq {
   private static final int a = 40;
   private static final Predicate<ebe> b = $$0 -> $$0.a(axe.bd);
   private final bxw c;
   private final djx d;
   private int e;

   public cei(bxw $$0) {
      this.c = $$0;
      this.d = $$0.dV();
      this.a(EnumSet.of(ceq.a.a, ceq.a.b, ceq.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dY().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         iv $$0 = this.c.dv();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dne.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.O().m();
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
         iv $$0 = this.c.dv();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).O().c(djt.d)) {
               this.d.b($$0, false);
            }

            this.c.R();
         } else {
            iv $$1 = $$0.e();
            if (this.d.a_($$1).a(dne.i)) {
               if (a(this.d).O().c(djt.d)) {
                  this.d.c(2001, $$1, dnc.j(dne.i.m()));
                  this.d.a($$1, dne.j.m(), 2);
               }

               this.c.R();
            }
         }
      }
   }
}
