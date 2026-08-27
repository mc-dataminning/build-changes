import javax.annotation.Nullable;

public interface ffk {
   static ffk a(fhw $$0) {
      return new ffk.a($$0);
   }

   @Nullable
   static ffk a(fhv $$0, @Nullable ffk $$1) {
      return $$1 == null ? null : new ffk.b($$0, $$1);
   }

   static ffk a(fhw $$0, fhv... $$1) {
      ffk $$2 = a($$0);

      for (fhv $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fhw a();

   void a(boolean var1);

   public static record a(fhw a) implements ffk {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fhv a, ffk b) implements ffk {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fhv b() {
         return this.a;
      }

      public ffk c() {
         return this.b;
      }
   }
}
