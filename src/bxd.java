import java.util.EnumSet;
import java.util.function.Predicate;

public class bxd extends bxl {
   private static final int a = 40;
   private static final Predicate<doz> b = dpi.a(dca.bt);
   private final bqq c;
   private final cyx d;
   private int e;

   public bxd(bqq $$0) {
      this.c = $$0;
      this.d = $$0.dM();
      this.a(EnumSet.of(bxl.a.a, bxl.a.b, bxl.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ei().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ib $$0 = this.c.dm();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dca.i);
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
         ib $$0 = this.c.dm();
         if (b.test(this.d.a_($$0))) {
            if (this.d.aa().b(cyt.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            ib $$1 = $$0.d();
            if (this.d.a_($$1).a(dca.i)) {
               if (this.d.aa().b(cyt.c)) {
                  this.d.c(2001, $$1, dby.i(dca.i.n()));
                  this.d.a($$1, dca.j.n(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
