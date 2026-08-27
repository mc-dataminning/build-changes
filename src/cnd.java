public interface cnd extends cmp<bgx> {
   @Override
   default cmt<?> e() {
      return cmt.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cjl g() {
      return new cjl(cte.ob);
   }

   boolean a(cjl var1);

   boolean b(cjl var1);

   boolean c(cjl var1);
}
