@FunctionalInterface
public interface aos {
   void perform(ew var1, bvj var2);

   public static record a(bvj a, fi.a b) implements aos {
      @Override
      public void perform(ew $$0, bvj $$1) {
         if ($$1 instanceof asi $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fbx a) implements aos {
      @Override
      public void perform(ew $$0, bvj $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
