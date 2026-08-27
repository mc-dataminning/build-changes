import java.util.List;
import javax.annotation.Nullable;

public class bpw extends bqb {
   private int a;
   private final bjp b;
   @Nullable
   private cbu c;
   private bpk d;

   public bpw(bjp $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cdn> $$0 = this.b.dL().a(cdn.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cdn $$2 : $$0) {
         biq $$3 = $$2.cN();
         if ($$3 instanceof cbu && (arx.e(((cbu)$$3).bk) > 0.0F || arx.e(((cbu)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (arx.e(this.c.bk) > 0.0F || arx.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (arx.e(this.c.bk) > 0.0F || arx.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cdn $$1 : this.b.dL().a(cdn.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cbu $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bpk.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = arx.e(this.c.bk) > 0.0F || arx.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bpk.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ehn((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bjm.a, this.b.do());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bpk.a) {
            gw $$2 = this.c.dl().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((biq)this.c) < 4.0F) {
               this.a = 0;
               this.d = bpk.b;
            }
         } else if (this.d == bpk.b) {
            hc $$3 = this.c.cE();
            gw $$4 = this.c.dl().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((biq)this.c) > 12.0F) {
               this.a = 0;
               this.d = bpk.a;
            }
         }
      }
   }
}
