import java.util.EnumSet;
import java.util.function.Predicate;

public class brt extends bsb {
   private static final int a = 40;
   private static final Predicate<dhi> b = dhr.a(cvc.bt);
   private final bli c;
   private final csa d;
   private int e;

   public brt(bli $$0) {
      this.c = $$0;
      this.d = $$0.dN();
      this.a(EnumSet.of(bsb.a.a, bsb.a.b, bsb.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.eh().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ht $$0 = this.c.dn();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cvc.i);
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
         ht $$0 = this.c.dn();
         if (b.test(this.d.a_($$0))) {
            if (this.d.Y().b(crw.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            ht $$1 = $$0.d();
            if (this.d.a_($$1).a(cvc.i)) {
               if (this.d.Y().b(crw.c)) {
                  this.d.c(2001, $$1, cva.i(cvc.i.o()));
                  this.d.a($$1, cvc.j.o(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
