public interface cxt extends cxd<bpf> {
   @Override
   default cxi<?> e() {
      return cxi.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default csz g() {
      return new csz(ddg.ob);
   }

   boolean a(csz var1);

   boolean b(csz var1);

   boolean c(csz var1);
}
