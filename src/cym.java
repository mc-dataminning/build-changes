import javax.annotation.Nullable;

public class cym extends csk {
   public static final dfp a = cyn.a;

   public cym(dex.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
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
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(a) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(a), 2);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }
}
