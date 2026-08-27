import java.util.List;
import javax.annotation.Nullable;

public class bpr extends bpw {
   private int a;
   private final bjk b;
   @Nullable
   private cbp c;
   private bpf d;

   public bpr(bjk $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cdi> $$0 = this.b.dK().a(cdi.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cdi $$2 : $$0) {
         bil $$3 = $$2.cN();
         if ($$3 instanceof cbp && (ars.e(((cbp)$$3).bk) > 0.0F || ars.e(((cbp)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ars.e(this.c.bk) > 0.0F || ars.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean J_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (ars.e(this.c.bk) > 0.0F || ars.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cdi $$1 : this.b.dK().a(cdi.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cbp $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bpf.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ars.e(this.c.bk) > 0.0F || ars.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bpf.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ehi((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bjh.a, this.b.dn());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bpf.a) {
            gw $$2 = this.c.dk().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.H().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bil)this.c) < 4.0F) {
               this.a = 0;
               this.d = bpf.b;
            }
         } else if (this.d == bpf.b) {
            hc $$3 = this.c.cE();
            gw $$4 = this.c.dk().a($$3, 10);
            this.b.H().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bil)this.c) > 12.0F) {
               this.a = 0;
               this.d = bpf.a;
            }
         }
      }
   }
}
