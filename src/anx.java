@FunctionalInterface
public interface anx {
   void perform(ex var1, bvs var2);

   public static record a(bvs a, fj.a b) implements anx {
      @Override
      public void perform(ex $$0, bvs $$1) {
         if ($$1 instanceof aro $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fcu a) implements anx {
      @Override
      public void perform(ex $$0, bvs $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
