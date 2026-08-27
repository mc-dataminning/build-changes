import javax.annotation.Nullable;

public interface eyr {
   static eyr a(fbd $$0) {
      return new eyr.a($$0);
   }

   @Nullable
   static eyr a(fbc $$0, @Nullable eyr $$1) {
      return $$1 == null ? null : new eyr.b($$0, $$1);
   }

   static eyr a(fbd $$0, fbc... $$1) {
      eyr $$2 = a($$0);

      for (fbc $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fbd a();

   void a(boolean var1);

   public static record a(fbd a) implements eyr {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fbc a, eyr b) implements eyr {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fbc b() {
         return this.a;
      }

      public eyr c() {
         return this.b;
      }
   }
}
