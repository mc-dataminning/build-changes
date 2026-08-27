public interface enm {
   void a(tf var1);

   default void a(Exception $$0) {
      if ($$0 instanceof enj $$1) {
         this.a($$1.a.b());
      } else {
         this.a(tf.b($$0.getMessage()));
      }
   }

   default void a(enj $$0) {
      this.a($$0.a.b());
   }
}
