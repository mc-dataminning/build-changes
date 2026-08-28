public interface ddq extends deb<ddp> {
   @Override
   default dem<ddq> b() {
      return dem.a;
   }

   @Override
   del<? extends ddq> a();

   ddo c();

   default jo<czk> a(ddp $$0) {
      return b($$0);
   }

   static jo<czk> b(ddp $$0) {
      jo<czk> $$1 = jo.a($$0.a(), czk.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czg $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default dee h() {
      return switch (this.c()) {
         case a -> ded.a;
         case c -> ded.c;
         case b -> ded.b;
         case d -> ded.d;
      };
   }
}
