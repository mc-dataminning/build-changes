@FunctionalInterface
public interface aoi {
   void perform(ew var1, bvb var2);

   public static record a(bvb a, fi.a b) implements aoi {
      @Override
      public void perform(ew $$0, bvb $$1) {
         if ($$1 instanceof ary $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fbr a) implements aoi {
      @Override
      public void perform(ew $$0, bvb $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
