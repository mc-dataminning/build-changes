import javax.annotation.Nullable;

public class csd extends cry implements csc {
   public csd(dey.d $$0) {
      super($$0);
   }

   @Override
   public chl a() {
      return chl.a;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.o, dcg::a);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcl $$6 = $$1.c_($$2);
         if ($$6 instanceof dcg) {
            $$3.a((dcg)$$6);
            $$3.a(apg.ab);
         }

         return bgq.b;
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dcg) {
            ((dcg)$$5).a($$4.y());
         }
      }
   }
}
