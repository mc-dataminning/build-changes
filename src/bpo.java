import java.util.EnumSet;
import java.util.function.Predicate;

public class bpo extends bpw {
   private static final int a = 40;
   private static final Predicate<dfe> b = dfn.a(csr.bt);
   private final bjd c;
   private final cpq d;
   private int e;

   public bpo(bjd $$0) {
      this.c = $$0;
      this.d = $$0.dK();
      this.a(EnumSet.of(bpw.a.a, bpw.a.b, bpw.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ee().a(this.c.i_() ? 50 : 1000) != 0) {
         return false;
      } else {
         gw $$0 = this.c.dk();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(csr.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.H().n();
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
         gw $$0 = this.c.dk();
         if (b.test(this.d.a_($$0))) {
            if (this.d.X().b(cpm.c)) {
               this.d.b($$0, false);
            }

            this.c.K();
         } else {
            gw $$1 = $$0.d();
            if (this.d.a_($$1).a(csr.i)) {
               if (this.d.X().b(cpm.c)) {
                  this.d.c(2001, $$1, csq.i(csr.i.n()));
                  this.d.a($$1, csr.j.n(), 2);
               }

               this.c.K();
            }
         }
      }
   }
}
