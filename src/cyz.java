import javax.annotation.Nullable;

public class cyz extends csx {
   public static final dgc a = cza.a;

   public cyz(dfk.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(a);
         if ($$6 != $$1.B($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(a), 2);
            }
         }
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(a) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(a), 2);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }
}
