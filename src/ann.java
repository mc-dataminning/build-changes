@FunctionalInterface
public interface ann {
   void perform(ex var1, buj var2);

   public static record a(buj a, fj.a b) implements ann {
      @Override
      public void perform(ex $$0, buj $$1) {
         if ($$1 instanceof ard $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fay a) implements ann {
      @Override
      public void perform(ex $$0, buj $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
