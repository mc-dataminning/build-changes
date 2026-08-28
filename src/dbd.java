import javax.annotation.Nullable;

public class dbd extends dbl {
   public dbd(dne $$0, dne $$1, czw.a $$2) {
      super($$0, $$1, jc.a, $$2);
   }

   public dbd(czw.a $$0, dne $$1, dne $$2, jc $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iw $$0, djz $$1, @Nullable crz $$2, daa $$3, ebg $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dzs $$6 && $$1.a_($$0).b() instanceof duo $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
