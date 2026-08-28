import java.util.List;
import javax.annotation.Nullable;

public class ccq extends ccv {
   private int a;
   private final bwf b;
   @Nullable
   private cpo c;
   private cce d;

   public ccq(bwf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<crl> $$0 = this.b.dW().a(crl.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (crl $$2 : $$0) {
         bvb $$3 = $$2.cX();
         if ($$3 instanceof cpo && (azu.e(((cpo)$$3).bo) > 0.0F || azu.e(((cpo)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azu.e(this.c.bo) > 0.0F || azu.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (azu.e(this.c.bo) > 0.0F || azu.e(this.c.bq) > 0.0F);
   }

   @Override
   public void d() {
      for (crl $$1 : this.b.dW().a(crl.class, this.b.cR().g(5.0))) {
         if ($$1.cX() instanceof cpo $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cce.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azu.e(this.c.bo) > 0.0F || azu.e(this.c.bq) > 0.0F;
      float $$1 = this.d == cce.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fbr((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bwb.a, this.b.dz());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cce.a) {
            jh $$2 = this.c.dw().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cce.b;
            }
         } else if (this.d == cce.b) {
            jm $$3 = this.c.cP();
            jh $$4 = this.c.dw().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cce.a;
            }
         }
      }
   }
}
