import java.util.EnumSet;
import java.util.function.Predicate;

public class cdf extends cdn {
   private static final int a = 40;
   private static final Predicate<dym> b = dyv.a(dkw.bA);
   private final bwt c;
   private final dhp d;
   private int e;

   public cdf(bwt $$0) {
      this.c = $$0;
      this.d = $$0.dV();
      this.a(EnumSet.of(cdn.a.a, cdn.a.b, cdn.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dY().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jj $$0 = this.c.dv();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dkw.i);
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
         jj $$0 = this.c.dv();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).O().c(dhl.c)) {
               this.d.b($$0, false);
            }

            this.c.R();
         } else {
            jj $$1 = $$0.e();
            if (this.d.a_($$1).a(dkw.i)) {
               if (a(this.d).O().c(dhl.c)) {
                  this.d.c(2001, $$1, dku.j(dkw.i.m()));
                  this.d.a($$1, dkw.j.m(), 2);
               }

               this.c.R();
            }
         }
      }
   }
}
