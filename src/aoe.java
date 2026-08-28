@FunctionalInterface
public interface aoe {
   void perform(ek var1, bwv var2);

   public static record a(bwv a, ew.a b) implements aoe {
      @Override
      public void perform(ek $$0, bwv $$1) {
         if ($$1 instanceof arv $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(ffs a) implements aoe {
      @Override
      public void perform(ek $$0, bwv $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
