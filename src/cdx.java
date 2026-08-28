import java.util.EnumSet;
import java.util.function.Predicate;

public class cdx extends cef {
   private static final int a = 40;
   private static final Predicate<eao> b = $$0 -> $$0.a(axc.bd);
   private final bxl c;
   private final djh d;
   private int e;

   public cdx(bxl $$0) {
      this.c = $$0;
      this.d = $$0.dU();
      this.a(EnumSet.of(cef.a.a, cef.a.b, cef.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dX().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         iv $$0 = this.c.du();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dmo.i);
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
         iv $$0 = this.c.du();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).O().c(djd.d)) {
               this.d.b($$0, false);
            }

            this.c.R();
         } else {
            iv $$1 = $$0.e();
            if (this.d.a_($$1).a(dmo.i)) {
               if (a(this.d).O().c(djd.d)) {
                  this.d.c(2001, $$1, dmm.j(dmo.i.m()));
                  this.d.a($$1, dmo.j.m(), 2);
               }

               this.c.R();
            }
         }
      }
   }
}
