@FunctionalInterface
public interface ano {
   void perform(ex var1, bul var2);

   public static record a(bul a, fj.a b) implements ano {
      @Override
      public void perform(ex $$0, bul $$1) {
         if ($$1 instanceof are $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public static record b(fba a) implements ano {
      @Override
      public void perform(ex $$0, bul $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
