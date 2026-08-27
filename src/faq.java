import javax.annotation.Nullable;

public interface faq {
   static faq a(fdc $$0) {
      return new faq.a($$0);
   }

   @Nullable
   static faq a(fdb $$0, @Nullable faq $$1) {
      return $$1 == null ? null : new faq.b($$0, $$1);
   }

   static faq a(fdc $$0, fdb... $$1) {
      faq $$2 = a($$0);

      for (fdb $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fdc a();

   void a(boolean var1);

   public static record a(fdc a) implements faq {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fdb a, faq b) implements faq {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fdb b() {
         return this.a;
      }

      public faq c() {
         return this.b;
      }
   }
}
