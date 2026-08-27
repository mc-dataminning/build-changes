import javax.annotation.Nullable;

public class cyn extends csl {
   public static final dfq a = cyo.a;

   public cyn(dey.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
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
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(a), 2);
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }
}
