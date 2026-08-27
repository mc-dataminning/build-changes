import javax.annotation.Nullable;

public abstract class crn extends csd implements cib {
   public static final dfv a = dfu.w;
   private final czs.a b;

   public crn(czs.a $$0, dfd.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dea($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(csr.gO) || $$1.a(csr.gP) || $$1.a(csr.gQ) || $$1.a(csr.gR);
         if ($$3) {
            return a($$2, dcs.p, dea::a);
         }
      }

      return null;
   }

   public czs.a a() {
      return this.b;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public biq g() {
      return biq.f;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
