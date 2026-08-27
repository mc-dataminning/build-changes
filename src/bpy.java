import java.util.List;
import javax.annotation.Nullable;

public class bpy extends bqd {
   private int a;
   private final bjr b;
   @Nullable
   private cbw c;
   private bpm d;

   public bpy(bjr $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cdp> $$0 = this.b.dL().a(cdp.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (cdp $$2 : $$0) {
         bis $$3 = $$2.cN();
         if ($$3 instanceof cbw && (ary.e(((cbw)$$3).bk) > 0.0F || ary.e(((cbw)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ary.e(this.c.bk) > 0.0F || ary.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (ary.e(this.c.bk) > 0.0F || ary.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (cdp $$1 : this.b.dL().a(cdp.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof cbw $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bpm.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ary.e(this.c.bk) > 0.0F || ary.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bpm.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ehp((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bjo.a, this.b.do());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bpm.a) {
            gw $$2 = this.c.dl().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bis)this.c) < 4.0F) {
               this.a = 0;
               this.d = bpm.b;
            }
         } else if (this.d == bpm.b) {
            hc $$3 = this.c.cE();
            gw $$4 = this.c.dl().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bis)this.c) > 12.0F) {
               this.a = 0;
               this.d = bpm.a;
            }
         }
      }
   }
}
