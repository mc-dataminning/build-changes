import javax.annotation.Nullable;

public abstract class crq extends csi {
   public static final dgd a = cwo.aC;
   public static final dga b = dfz.r;

   protected crq(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         this.a($$1, $$2, $$3);
         return bgy.b;
      }
   }

   protected abstract void a(cpv var1, gw var2, cbu var3);

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof dck) {
            ((dck)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof dck) {
            if ($$1 instanceof akq) {
               bgu.a($$1, $$2, (dck)$$5);
               ((dck)$$5).a((akq)$$1, ehn.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.a($$1.c_($$2));
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dcv> dcw<T> a(cpv $$0, dcx<T> $$1, dcx<? extends dck> $$2) {
      return $$0.B ? null : a($$1, $$2, dck::a);
   }
}
