import javax.annotation.Nullable;

public class csc extends csi {
   public static final dgd a = dfz.P;
   public static final dga b = dfz.u;

   public csc(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         dcv $$6 = $$1.c_($$2);
         if ($$6 instanceof dco) {
            $$3.a((dco)$$6);
            $$3.a(apo.ar);
            cal.a($$3, true);
         }

         return bgy.b;
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof bgr) {
            bgu.a($$1, $$2, (bgr)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      dcv $$4 = $$1.c_($$2);
      if ($$4 instanceof dco) {
         ((dco)$$4).i();
      }
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dco($$0, $$1);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof dco) {
            ((dco)$$5).a($$4.y());
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

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
