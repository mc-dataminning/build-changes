import java.util.List;
import javax.annotation.Nullable;

public class bro extends brt {
   private int a;
   private final blh b;
   @Nullable
   private cdm c;
   private brc d;

   public bro(blh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cff> $$0 = this.b.dL().a(cff.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cff $$2 : $$0) {
         bki $$3 = $$2.cN();
         if ($$3 instanceof cdm && (ati.e(((cdm)$$3).bk) > 0.0F || ati.e(((cdm)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ati.e(this.c.bk) > 0.0F || ati.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (ati.e(this.c.bk) > 0.0F || ati.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cff $$1 : this.b.dL().a(cff.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cdm $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = brc.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ati.e(this.c.bk) > 0.0F || ati.e(this.c.bm) > 0.0F;
      float $$1 = this.d == brc.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eji((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(ble.a, this.b.do());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == brc.a) {
            ht $$2 = this.c.dl().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bki)this.c) < 4.0F) {
               this.a = 0;
               this.d = brc.b;
            }
         } else if (this.d == brc.b) {
            hx $$3 = this.c.cE();
            ht $$4 = this.c.dl().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bki)this.c) > 12.0F) {
               this.a = 0;
               this.d = brc.a;
            }
         }
      }
   }
}
