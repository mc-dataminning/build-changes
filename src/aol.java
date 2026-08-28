@FunctionalInterface
public interface aol {
   void perform(ek var1, bxe var2);

   public static record a(bxe a, ew.a b) implements aol {
      @Override
      public void perform(ek $$0, bxe $$1) {
         if ($$1 instanceof asc $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fgc a) implements aol {
      @Override
      public void perform(ek $$0, bxe $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
