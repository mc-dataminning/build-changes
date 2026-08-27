import java.util.EnumSet;
import java.util.function.Predicate;

public class bwe extends bwm {
   private static final int a = 40;
   private static final Predicate<dnb> b = dnk.a(dae.bt);
   private final bpr c;
   private final cxb d;
   private int e;

   public bwe(bpr $$0) {
      this.c = $$0;
      this.d = $$0.dM();
      this.a(EnumSet.of(bwm.a.a, bwm.a.b, bwm.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ei().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ib $$0 = this.c.dm();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dae.i);
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
            if (this.d.Z().b(cwx.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            ib $$1 = $$0.d();
            if (this.d.a_($$1).a(dae.i)) {
               if (this.d.Z().b(cwx.c)) {
                  this.d.c(2001, $$1, dac.i(dae.i.o()));
                  this.d.a($$1, dae.j.o(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
