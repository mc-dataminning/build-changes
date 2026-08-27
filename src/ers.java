import javax.annotation.Nullable;

public interface ers {
   static ers a(eua $$0) {
      return new ers.a($$0);
   }

   @Nullable
   static ers a(etz $$0, @Nullable ers $$1) {
      return $$1 == null ? null : new ers.b($$0, $$1);
   }

   static ers a(eua $$0, etz... $$1) {
      ers $$2 = a($$0);

      for (etz $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eua a();

   void a(boolean var1);

   public static record a(eua a) implements ers {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(etz a, ers b) implements ers {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public etz b() {
         return this.a;
      }

      public ers c() {
         return this.b;
      }
   }
}
