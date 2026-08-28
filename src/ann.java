@FunctionalInterface
public interface ann {
   void perform(ex var1, bva var2);

   public static record a(bva a, fj.a b) implements ann {
      @Override
      public void perform(ex $$0, bva $$1) {
         if ($$1 instanceof are $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fbx a) implements ann {
      @Override
      public void perform(ex $$0, bva $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
