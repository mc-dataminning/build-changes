import javax.annotation.Nullable;

public interface foc {
   static foc a(fqr $$0) {
      return new foc.a($$0);
   }

   @Nullable
   static foc a(fqq $$0, @Nullable foc $$1) {
      return $$1 == null ? null : new foc.b($$0, $$1);
   }

   static foc a(fqr $$0, fqq... $$1) {
      foc $$2 = a($$0);

      for (fqq $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fqr a();

   void a(boolean var1);

   public static record a(fqr a) implements foc {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fqq a, foc b) implements foc {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fqq b() {
         return this.a;
      }

      public foc c() {
         return this.b;
      }
   }
}
