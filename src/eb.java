@FunctionalInterface
public interface eb {
   eb a = new eb() {
      @Override
      public void onResult(boolean $$0, int $$1) {
      }

      @Override
      public String toString() {
         return "<empty>";
      }
   };

   void onResult(boolean var1, int var2);

   default void onSuccess(int $$0) {
      this.onResult(true, $$0);
   }

   default void onFailure() {
      this.onResult(false, 0);
   }

   static eb chain(eb $$0, eb $$1) {
      if ($$0 == a) {
         return $$1;
      } else {
         return $$1 == a ? $$0 : ($$2, $$3) -> {
            $$0.onResult($$2, $$3);
            $$1.onResult($$2, $$3);
         };
      }
   }
}
