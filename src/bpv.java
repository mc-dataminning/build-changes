import java.util.EnumSet;
import java.util.function.Predicate;

public class bpv extends bqd {
   private static final int a = 40;
   private static final Predicate<dfl> b = dfu.a(csy.bt);
   private final bjk c;
   private final cpx d;
   private int e;

   public bpv(bjk $$0) {
      this.c = $$0;
      this.d = $$0.dL();
      this.a(EnumSet.of(bqd.a.a, bqd.a.b, bqd.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ef().a(this.c.m_() ? 50 : 1000) != 0) {
         return false;
      } else {
         gw $$0 = this.c.dl();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(csy.i);
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
            if (this.d.X().b(cpt.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            gw $$1 = $$0.d();
            if (this.d.a_($$1).a(csy.i)) {
               if (this.d.X().b(cpt.c)) {
                  this.d.c(2001, $$1, csx.i(csy.i.n()));
                  this.d.a($$1, csy.j.n(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
