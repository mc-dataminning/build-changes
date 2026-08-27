import javax.annotation.Nullable;

public class crx extends csd {
   public static final dfy a = dfu.P;
   public static final dfv b = dfu.u;

   public crx(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         dcq $$6 = $$1.c_($$2);
         if ($$6 instanceof dcj) {
            $$3.a((dcj)$$6);
            $$3.a(apj.ar);
            cag.a($$3, true);
         }

         return bgt.b;
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof bgm) {
            bgp.a($$1, $$2, (bgm)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      dcq $$4 = $$1.c_($$2);
      if ($$4 instanceof dcj) {
         ((dcj)$$4).i();
      }
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcj($$0, $$1);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof dcj) {
            ((dcj)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ceg.a($$1.c_($$2));
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
