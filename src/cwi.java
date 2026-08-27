public interface cwi extends cvs<bny> {
   @Override
   default cvx<?> e() {
      return cvx.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default crs g() {
      return new crs(dcj.ob);
   }

   boolean a(crs var1);

   boolean b(crs var1);

   boolean c(crs var1);
}
