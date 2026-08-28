import javax.annotation.Nullable;

public interface fhq {
   static fhq a(fkc $$0) {
      return new fhq.a($$0);
   }

   @Nullable
   static fhq a(fkb $$0, @Nullable fhq $$1) {
      return $$1 == null ? null : new fhq.b($$0, $$1);
   }

   static fhq a(fkc $$0, fkb... $$1) {
      fhq $$2 = a($$0);

      for (fkb $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fkc a();

   void a(boolean var1);

   public static record a(fkc a) implements fhq {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fkb a, fhq b) implements fhq {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fkb b() {
         return this.a;
      }

      public fhq c() {
         return this.b;
      }
   }
}
