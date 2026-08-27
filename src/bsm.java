import java.util.List;
import javax.annotation.Nullable;

public class bsm extends bsr {
   private int a;
   private final bme b;
   @Nullable
   private cer c;
   private bsa d;

   public bsm(bme $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cgl> $$0 = this.b.dM().a(cgl.class, this.b.cH().g(5.0));
      boolean $$1 = false;

      for (cgl $$2 : $$0) {
         blf $$3 = $$2.cN();
         if ($$3 instanceof cer && (aty.e(((cer)$$3).bk) > 0.0F || aty.e(((cer)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (aty.e(this.c.bk) > 0.0F || aty.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bO() && (aty.e(this.c.bk) > 0.0F || aty.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cgl $$1 : this.b.dM().a(cgl.class, this.b.cH().g(5.0))) {
         if ($$1.cN() instanceof cer $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bsa.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = aty.e(this.c.bk) > 0.0F || aty.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bsa.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new elb((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bmb.a, this.b.dp());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bsa.a) {
            hv $$2 = this.c.dm().a(this.c.cE().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((blf)this.c) < 4.0F) {
               this.a = 0;
               this.d = bsa.b;
            }
         } else if (this.d == bsa.b) {
            ia $$3 = this.c.cF();
            hv $$4 = this.c.dm().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((blf)this.c) > 12.0F) {
               this.a = 0;
               this.d = bsa.a;
            }
         }
      }
   }
}
