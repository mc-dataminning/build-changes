import java.util.List;
import javax.annotation.Nullable;

public class ccy extends cdd {
   private int a;
   private final bwn b;
   @Nullable
   private cpw c;
   private ccm d;

   public ccy(bwn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<crt> $$0 = this.b.dV().a(crt.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (crt $$2 : $$0) {
         bvj $$3 = $$2.cX();
         if ($$3 instanceof cpw && (bae.e(((cpw)$$3).bo) > 0.0F || bae.e(((cpw)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (bae.e(this.c.bo) > 0.0F || bae.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (bae.e(this.c.bo) > 0.0F || bae.e(this.c.bq) > 0.0F);
   }

   @Override
   public void d() {
      for (crt $$1 : this.b.dV().a(crt.class, this.b.cR().g(5.0))) {
         if ($$1.cX() instanceof cpw $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = ccm.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = bae.e(this.c.bo) > 0.0F || bae.e(this.c.bq) > 0.0F;
      float $$1 = this.d == ccm.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fbx((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bwj.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == ccm.a) {
            jh $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = ccm.b;
            }
         } else if (this.d == ccm.b) {
            jm $$3 = this.c.cP();
            jh $$4 = this.c.dv().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = ccm.a;
            }
         }
      }
   }
}
