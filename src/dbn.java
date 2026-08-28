import javax.annotation.Nullable;

public class dbn extends dbv {
   public dbn(dno $$0, dno $$1, dag.a $$2) {
      super($$0, $$1, jc.a, $$2);
   }

   public dbn(dag.a $$0, dno $$1, dno $$2, jc $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iw $$0, dkj $$1, @Nullable csi $$2, dak $$3, ebq $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof eac $$6 && $$1.a_($$0).b() instanceof duy $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
