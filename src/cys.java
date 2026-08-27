import javax.annotation.Nullable;

public class cys extends csq {
   public static final dfv a = cyt.a;

   public cys(dfd.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
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
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(a) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(a), 2);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }
}
