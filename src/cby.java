import java.util.List;
import javax.annotation.Nullable;

public class cby extends ccd {
   private int a;
   private final bvn b;
   @Nullable
   private cov c;
   private cbm d;

   public cby(bvn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cqs> $$0 = this.b.dW().a(cqs.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (cqs $$2 : $$0) {
         buj $$3 = $$2.cX();
         if ($$3 instanceof cov && (ayy.e(((cov)$$3).bn) > 0.0F || ayy.e(((cov)$$3).bp) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayy.e(this.c.bn) > 0.0F || ayy.e(this.c.bp) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (ayy.e(this.c.bn) > 0.0F || ayy.e(this.c.bp) > 0.0F);
   }

   @Override
   public void d() {
      for (cqs $$1 : this.b.dW().a(cqs.class, this.b.cR().g(5.0))) {
         if ($$1.cX() instanceof cov $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cbm.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = ayy.e(this.c.bn) > 0.0F || ayy.e(this.c.bp) > 0.0F;
      float $$1 = this.d == cbm.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fay((double)this.b.bn, (double)this.b.bo, (double)this.b.bp));
      this.b.a(bvj.a, this.b.dz());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cbm.a) {
            ji $$2 = this.c.dw().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cbm.b;
            }
         } else if (this.d == cbm.b) {
            jn $$3 = this.c.cP();
            ji $$4 = this.c.dw().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cbm.a;
            }
         }
      }
   }
}
