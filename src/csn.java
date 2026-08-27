import javax.annotation.Nullable;

public class csn extends csi implements csm {
   public csn(dfi.d $$0) {
      super($$0);
   }

   @Override
   public cht a() {
      return cht.a;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.o, dcq::a);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         dcv $$6 = $$1.c_($$2);
         if ($$6 instanceof dcq) {
            $$3.a((dcq)$$6);
            $$3.a(apn.ab);
         }

         return bgy.b;
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof dcq) {
            ((dcq)$$5).a($$4.y());
         }
      }
   }
}
