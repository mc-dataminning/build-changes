import javax.annotation.Nullable;

public class crm extends crv {
   public crm(cqh.a $$0, dac $$1, dac $$2) {
      super($$1, $$2, $$0, ih.a);
   }

   public crm(cqh.a $$0, dac $$1, dac $$2, ih $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ib $$0, cxb $$1, @Nullable ciu $$2, cqm $$3, dnb $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dlr $$6 && $$1.a_($$0).b() instanceof dhb $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
