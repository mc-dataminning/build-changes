@FunctionalInterface
public interface aoa {
   void perform(ej var1, bwi var2);

   public static record a(bwi a, ev.a b) implements aoa {
      @Override
      public void perform(ej $$0, bwi $$1) {
         if ($$1 instanceof arr $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(ffc a) implements aoa {
      @Override
      public void perform(ej $$0, bwi $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
