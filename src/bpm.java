import java.util.EnumSet;
import java.util.function.Predicate;

public class bpm extends bpu {
   private static final int a = 40;
   private static final Predicate<dfa> b = dfj.a(csn.bt);
   private final bja c;
   private final cpm d;
   private int e;

   public bpm(bja $$0) {
      this.c = $$0;
      this.d = $$0.dK();
      this.a(EnumSet.of(bpu.a.a, bpu.a.b, bpu.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ee().a(this.c.i_() ? 50 : 1000) != 0) {
         return false;
      } else {
         gu $$0 = this.c.dk();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(csn.i);
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
         gu $$0 = this.c.dk();
         if (b.test(this.d.a_($$0))) {
            if (this.d.X().b(cpi.c)) {
               this.d.b($$0, false);
            }

            this.c.K();
         } else {
            gu $$1 = $$0.d();
            if (this.d.a_($$1).a(csn.i)) {
               if (this.d.X().b(cpi.c)) {
                  this.d.c(2001, $$1, csm.i(csn.i.n()));
                  this.d.a($$1, csn.j.n(), 2);
               }

               this.c.K();
            }
         }
      }
   }
}
