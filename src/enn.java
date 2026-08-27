public interface enn {
   void a(te var1);

   default void a(Exception $$0) {
      if ($$0 instanceof enk $$1) {
         this.a($$1.a.b());
      } else {
         this.a(te.b($$0.getMessage()));
      }
   }

   default void a(enk $$0) {
      this.a($$0.a.b());
   }
}
