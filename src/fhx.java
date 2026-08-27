import javax.annotation.Nullable;

public interface fhx {
   static fhx a(fkj $$0) {
      return new fhx.a($$0);
   }

   @Nullable
   static fhx a(fki $$0, @Nullable fhx $$1) {
      return $$1 == null ? null : new fhx.b($$0, $$1);
   }

   static fhx a(fkj $$0, fki... $$1) {
      fhx $$2 = a($$0);

      for (fki $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fkj a();

   void a(boolean var1);

   public static record a(fkj a) implements fhx {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fki a, fhx b) implements fhx {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fki b() {
         return this.a;
      }

      public fhx c() {
         return this.b;
      }
   }
}
