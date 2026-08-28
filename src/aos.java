@FunctionalInterface
public interface aos {
   void perform(ew var1, bvk var2);

   public static record a(bvk a, fi.a b) implements aos {
      @Override
      public void perform(ew $$0, bvk $$1) {
         if ($$1 instanceof asi $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fby a) implements aos {
      @Override
      public void perform(ew $$0, bvk $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
