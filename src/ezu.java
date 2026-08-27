import javax.annotation.Nullable;

public interface ezu {
   static ezu a(fcg $$0) {
      return new ezu.a($$0);
   }

   @Nullable
   static ezu a(fcf $$0, @Nullable ezu $$1) {
      return $$1 == null ? null : new ezu.b($$0, $$1);
   }

   static ezu a(fcg $$0, fcf... $$1) {
      ezu $$2 = a($$0);

      for (fcf $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fcg a();

   void a(boolean var1);

   public static record a(fcg a) implements ezu {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fcf a, ezu b) implements ezu {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fcf b() {
         return this.a;
      }

      public ezu c() {
         return this.b;
      }
   }
}
