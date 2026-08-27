import java.util.EnumSet;
import java.util.function.Predicate;

public class bpt extends bqb {
   private static final int a = 40;
   private static final Predicate<dfj> b = dfs.a(csw.bt);
   private final bji c;
   private final cpv d;
   private int e;

   public bpt(bji $$0) {
      this.c = $$0;
      this.d = $$0.dL();
      this.a(EnumSet.of(bqb.a.a, bqb.a.b, bqb.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ef().a(this.c.m_() ? 50 : 1000) != 0) {
         return false;
      } else {
         gw $$0 = this.c.dl();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(csw.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.L().n();
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
         gw $$0 = this.c.dl();
         if (b.test(this.d.a_($$0))) {
            if (this.d.X().b(cpr.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            gw $$1 = $$0.d();
            if (this.d.a_($$1).a(csw.i)) {
               if (this.d.X().b(cpr.c)) {
                  this.d.c(2001, $$1, csv.i(csw.i.n()));
                  this.d.a($$1, csw.j.n(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
