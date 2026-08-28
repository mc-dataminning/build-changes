import javax.annotation.Nullable;

public class cwr extends cwz {
   public cwr(cvg.a $$0, dgv $$1, dgv $$2) {
      super($$1, $$2, $$0, jj.a);
   }

   public cwr(cvg.a $$0, dgv $$1, dgv $$2, jj $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(je $$0, dds $$1, @Nullable cnp $$2, cvl $$3, dua $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dsq $$6 && $$1.a_($$0).b() instanceof dnw $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
