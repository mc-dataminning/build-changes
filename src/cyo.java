import javax.annotation.Nullable;

public class cyo extends csm {
   public static final dfr a = cyp.a;

   public cyo(dez.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
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
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(a), 2);
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
