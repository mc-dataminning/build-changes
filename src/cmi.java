public interface cmi {
   boolean a(csa var1, dgm var2, boolean var3, cdu var4);

   default boolean a(dgn $$0, cdu $$1) {
      return $$0.a($$1);
   }
}
