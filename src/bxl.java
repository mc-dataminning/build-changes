import java.util.List;
import javax.annotation.Nullable;

public class bxl extends bxq {
   private int a;
   private final brb b;
   @Nullable
   private cka c;
   private bwz d;

   public bxl(brb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<clx> $$0 = this.b.dM().a(clx.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (clx $$2 : $$0) {
         bqa $$3 = $$2.cN();
         if ($$3 instanceof cka && (axm.e(((cka)$$3).bn) > 0.0F || axm.e(((cka)$$3).bp) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (axm.e(this.c.bn) > 0.0F || axm.e(this.c.bp) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (axm.e(this.c.bn) > 0.0F || axm.e(this.c.bp) > 0.0F);
   }

   @Override
   public void c() {
      for (clx $$1 : this.b.dM().a(clx.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof cka $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bwz.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = axm.e(this.c.bn) > 0.0F || axm.e(this.c.bp) > 0.0F;
      float $$1 = this.d == bwz.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new esj((double)this.b.bn, (double)this.b.bo, (double)this.b.bp));
      this.b.a(bqy.a, this.b.dp());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bwz.a) {
            id $$2 = this.c.dm().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bwz.b;
            }
         } else if (this.d == bwz.b) {
            ij $$3 = this.c.cF();
            id $$4 = this.c.dm().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bwz.a;
            }
         }
      }
   }
}
