import javax.annotation.Nullable;

public class dbb extends dbj {
   public dbb(dnc $$0, dnc $$1, czu.a $$2) {
      super($$0, $$1, jb.a, $$2);
   }

   public dbb(czu.a $$0, dnc $$1, dnc $$2, jb $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iv $$0, djx $$1, @Nullable crx $$2, czy $$3, ebe $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dzq $$6 && $$1.a_($$0).b() instanceof dum $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
