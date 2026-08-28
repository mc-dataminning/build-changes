@FunctionalInterface
public interface ano {
   void perform(ex var1, bum var2);

   public static record a(bum a, fj.a b) implements ano {
      @Override
      public void perform(ex $$0, bum $$1) {
         if ($$1 instanceof are $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fbb a) implements ano {
      @Override
      public void perform(ex $$0, bum $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
