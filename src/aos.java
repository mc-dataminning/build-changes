@FunctionalInterface
public interface aos {
   void perform(ew var1, bvf var2);

   public static record a(bvf a, fi.a b) implements aos {
      @Override
      public void perform(ew $$0, bvf $$1) {
         if ($$1 instanceof asi $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fbs a) implements aos {
      @Override
      public void perform(ew $$0, bvf $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
