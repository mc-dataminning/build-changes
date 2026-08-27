import java.util.List;
import javax.annotation.Nullable;

public class bqc extends bqh {
   private int a;
   private final bjv b;
   @Nullable
   private cca c;
   private bpq d;

   public bqc(bjv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cdt> $$0 = this.b.dL().a(cdt.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cdt $$2 : $$0) {
         biw $$3 = $$2.cN();
         if ($$3 instanceof cca && (asb.e(((cca)$$3).bk) > 0.0F || asb.e(((cca)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (asb.e(this.c.bk) > 0.0F || asb.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (asb.e(this.c.bk) > 0.0F || asb.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cdt $$1 : this.b.dL().a(cdt.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cca $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bpq.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = asb.e(this.c.bk) > 0.0F || asb.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bpq.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ehh((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bjs.a, this.b.do());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bpq.a) {
            gw $$2 = this.c.dl().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((biw)this.c) < 4.0F) {
               this.a = 0;
               this.d = bpq.b;
            }
         } else if (this.d == bpq.b) {
            ha $$3 = this.c.cE();
            gw $$4 = this.c.dl().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((biw)this.c) > 12.0F) {
               this.a = 0;
               this.d = bpq.a;
            }
         }
      }
   }
}
