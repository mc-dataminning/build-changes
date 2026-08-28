import javax.annotation.Nullable;

public interface fhc {
   static fhc a(fjo $$0) {
      return new fhc.a($$0);
   }

   @Nullable
   static fhc a(fjn $$0, @Nullable fhc $$1) {
      return $$1 == null ? null : new fhc.b($$0, $$1);
   }

   static fhc a(fjo $$0, fjn... $$1) {
      fhc $$2 = a($$0);

      for (fjn $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fjo a();

   void a(boolean var1);

   public static record a(fjo a) implements fhc {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fjn a, fhc b) implements fhc {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fjn b() {
         return this.a;
      }

      public fhc c() {
         return this.b;
      }
   }
}
