import javax.annotation.Nullable;

public class csp extends csk implements cso {
   public csp(dfk.d $$0) {
      super($$0);
   }

   @Override
   public chv a() {
      return chv.a;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dcs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.o, dcs::a);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         dcx $$6 = $$1.c_($$2);
         if ($$6 instanceof dcs) {
            $$3.a((dcs)$$6);
            $$3.a(app.ab);
         }

         return bha.b;
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof dcs) {
            ((dcs)$$5).a($$4.y());
         }
      }
   }
}
