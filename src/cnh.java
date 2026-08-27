import javax.annotation.Nullable;

public class cnh extends cnq {
   public cnh(cmc.a $$0, cvz $$1, cvz $$2) {
      super($$1, $$2, $$0, ia.a);
   }

   public cnh(cmc.a $$0, cvz $$1, cvz $$2, ia $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hv $$0, csy $$1, @Nullable cer $$2, cmh $$3, dip $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dhm $$6 && $$1.a_($$0).b() instanceof dcy $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
