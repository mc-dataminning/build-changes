import java.util.EnumSet;
import java.util.function.Predicate;

public class bze extends bzm {
   private static final int a = 40;
   private static final Predicate<drb> b = drk.a(dea.bt);
   private final bsq c;
   private final dax d;
   private int e;

   public bze(bsq $$0) {
      this.c = $$0;
      this.d = $$0.dP();
      this.a(EnumSet.of(bzm.a.a, bzm.a.b, bzm.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.el().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         io $$0 = this.c.dp();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dea.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.K().n();
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
         io $$0 = this.c.dp();
         if (b.test(this.d.a_($$0))) {
            if (this.d.aa().b(dat.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            io $$1 = $$0.d();
            if (this.d.a_($$1).a(dea.i)) {
               if (this.d.aa().b(dat.c)) {
                  this.d.c(2001, $$1, ddy.i(dea.i.n()));
                  this.d.a($$1, dea.j.n(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
