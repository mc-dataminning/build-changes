import java.util.List;
import javax.annotation.Nullable;

public class ccb extends ccg {
   private int a;
   private final bvq b;
   @Nullable
   private coy c;
   private cbp d;

   public ccb(bvq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cqv> $$0 = this.b.dV().a(cqv.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (cqv $$2 : $$0) {
         bum $$3 = $$2.cW();
         if ($$3 instanceof coy && (ayz.e(((coy)$$3).bn) > 0.0F || ayz.e(((coy)$$3).bp) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayz.e(this.c.bn) > 0.0F || ayz.e(this.c.bp) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (ayz.e(this.c.bn) > 0.0F || ayz.e(this.c.bp) > 0.0F);
   }

   @Override
   public void d() {
      for (cqv $$1 : this.b.dV().a(cqv.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof coy $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cbp.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = ayz.e(this.c.bn) > 0.0F || ayz.e(this.c.bp) > 0.0F;
      float $$1 = this.d == cbp.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fbb((double)this.b.bn, (double)this.b.bo, (double)this.b.bp));
      this.b.a(bvm.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cbp.a) {
            ji $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.P().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cbp.b;
            }
         } else if (this.d == cbp.b) {
            jn $$3 = this.c.cP();
            ji $$4 = this.c.dv().a($$3, 10);
            this.b.P().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cbp.a;
            }
         }
      }
   }
}
