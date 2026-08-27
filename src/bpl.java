import java.util.EnumSet;
import java.util.function.Predicate;

public class bpl extends bpt {
   private static final int a = 40;
   private static final Predicate<dez> b = dfi.a(csm.bt);
   private final bja c;
   private final cpl d;
   private int e;

   public bpl(bja $$0) {
      this.c = $$0;
      this.d = $$0.dK();
      this.a(EnumSet.of(bpt.a.a, bpt.a.b, bpt.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ee().a(this.c.i_() ? 50 : 1000) != 0) {
         return false;
      } else {
         gu $$0 = this.c.dk();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(csm.i);
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
            if (this.d.X().b(cph.c)) {
               this.d.b($$0, false);
            }

            this.c.K();
         } else {
            gu $$1 = $$0.d();
            if (this.d.a_($$1).a(csm.i)) {
               if (this.d.X().b(cph.c)) {
                  this.d.c(2001, $$1, csl.i(csm.i.n()));
                  this.d.a($$1, csm.j.n(), 2);
               }

               this.c.K();
            }
         }
      }
   }
}
