import java.util.EnumSet;
import java.util.function.Predicate;

public class bsj extends bsr {
   private static final int a = 40;
   private static final Predicate<dip> b = diy.a(cwb.bt);
   private final blx c;
   private final csy d;
   private int e;

   public bsj(blx $$0) {
      this.c = $$0;
      this.d = $$0.dM();
      this.a(EnumSet.of(bsr.a.a, bsr.a.b, bsr.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.eg().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         hv $$0 = this.c.dm();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cwb.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.N().n();
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
         hv $$0 = this.c.dm();
         if (b.test(this.d.a_($$0))) {
            if (this.d.Y().b(csu.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            hv $$1 = $$0.d();
            if (this.d.a_($$1).a(cwb.i)) {
               if (this.d.Y().b(csu.c)) {
                  this.d.c(2001, $$1, cvz.i(cwb.i.o()));
                  this.d.a($$1, cwb.j.o(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
