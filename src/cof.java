public interface cof {
   boolean a(ctx var1, dim var2, boolean var3, cfq var4);

   default boolean a(din $$0, cfq $$1) {
      return $$0.a($$1);
   }
}
