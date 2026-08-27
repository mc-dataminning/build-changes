import javax.annotation.Nullable;

public class cnx extends cog {
   public cnx(cms.a $$0, cwp $$1, cwp $$2) {
      super($$1, $$2, $$0, ic.a);
   }

   public cnx(cms.a $$0, cwp $$1, cwp $$2, ic $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hx $$0, cto $$1, @Nullable cfh $$2, cmx $$3, djg $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof did $$6 && $$1.a_($$0).b() instanceof ddo $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
