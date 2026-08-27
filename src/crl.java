import javax.annotation.Nullable;

public abstract class crl extends csd {
   public static final dfy a = cwj.aC;
   public static final dfv b = dfu.r;

   protected crl(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         this.a($$1, $$2, $$3);
         return bgt.b;
      }
   }

   protected abstract void a(cpq var1, gw var2, cbp var3);

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof dcf) {
            ((dcf)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof dcf) {
            if ($$1 instanceof akn) {
               bgp.a($$1, $$2, (dcf)$$5);
               ((dcf)$$5).a((akn)$$1, ehi.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
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
   public cyv b_(dfe $$0) {
      return cyv.c;
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

   @Nullable
   protected static <T extends dcq> dcr<T> a(cpq $$0, dcs<T> $$1, dcs<? extends dcf> $$2) {
      return $$0.B ? null : a($$1, $$2, dcf::a);
   }
}
