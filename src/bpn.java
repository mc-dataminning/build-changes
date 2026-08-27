import java.util.List;
import javax.annotation.Nullable;

public class bpn extends bps {
   private int a;
   private final bjf b;
   @Nullable
   private cbl c;
   private bpb d;

   public bpn(bjf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cde> $$0 = this.b.dK().a(cde.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cde $$2 : $$0) {
         big $$3 = $$2.cN();
         if ($$3 instanceof cbl && (aro.e(((cbl)$$3).bk) > 0.0F || aro.e(((cbl)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (aro.e(this.c.bk) > 0.0F || aro.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean J_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (aro.e(this.c.bk) > 0.0F || aro.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cde $$1 : this.b.dK().a(cde.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cbl $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bpb.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = aro.e(this.c.bk) > 0.0F || aro.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bpb.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ehf((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bjc.a, this.b.dn());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bpb.a) {
            gv $$2 = this.c.dk().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.H().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((big)this.c) < 4.0F) {
               this.a = 0;
               this.d = bpb.b;
            }
         } else if (this.d == bpb.b) {
            hb $$3 = this.c.cE();
            gv $$4 = this.c.dk().a($$3, 10);
            this.b.H().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((big)this.c) > 12.0F) {
               this.a = 0;
               this.d = bpb.a;
            }
         }
      }
   }
}
