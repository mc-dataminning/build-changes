public interface ddj extends ddu<ddi> {
   @Override
   default def<ddj> b() {
      return def.a;
   }

   @Override
   dee<? extends ddj> a();

   ddh c();

   default jn<czd> a(ddi $$0) {
      return b($$0);
   }

   static jn<czd> b(ddi $$0) {
      jn<czd> $$1 = jn.a($$0.a(), czd.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cyz $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default ddx h() {
      return switch (this.c()) {
         case a -> ddw.a;
         case c -> ddw.c;
         case b -> ddw.b;
         case d -> ddw.d;
      };
   }
}
