import java.util.EnumSet;
import javax.annotation.Nullable;

public class bsu extends bsb {
   public static final int a = 1;
   protected final blp b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bsu(blp $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bsb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bN()) {
            ht $$0 = this.a(this.b.dN(), this.b, 5);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.b.ei() != null || this.b.dC() || this.b.bN();
   }

   protected boolean i() {
      eju $$0 = bvw.a(this.b, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.d = $$0.c;
         this.e = $$0.d;
         this.f = $$0.e;
         return true;
      }
   }

   public boolean k() {
      return this.g;
   }

   @Override
   public void c() {
      this.b.N().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.N().l();
   }

   @Nullable
   protected ht a(crg $$0, bkq $$1, int $$2) {
      ht $$3 = $$1.dn();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : ht.a($$1.dn(), $$2, 1, $$1x -> $$0.b_($$1x).a(arl.a)).orElse(null);
   }
}
