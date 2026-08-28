public class dbj extends dbm {
   public dbj(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.zU, aws.h, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }

   @Override
   protected csj a(aru $$0, bxw $$1, daa $$2) {
      return new cth($$0, $$1, $$2);
   }

   @Override
   protected csj a(djz $$0, jq $$1, daa $$2) {
      return new cth($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
