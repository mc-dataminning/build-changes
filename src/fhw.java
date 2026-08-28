import javax.annotation.Nullable;

public interface fhw {
   static fhw a(fki $$0) {
      return new fhw.a($$0);
   }

   @Nullable
   static fhw a(fkh $$0, @Nullable fhw $$1) {
      return $$1 == null ? null : new fhw.b($$0, $$1);
   }

   static fhw a(fki $$0, fkh... $$1) {
      fhw $$2 = a($$0);

      for (fkh $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fki a();

   void a(boolean var1);

   public static record a(fki a) implements fhw {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fkh a, fhw b) implements fhw {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fkh b() {
         return this.a;
      }

      public fhw c() {
         return this.b;
      }
   }
}
