import javax.annotation.Nullable;

public interface foa {
   static foa a(fqp $$0) {
      return new foa.a($$0);
   }

   @Nullable
   static foa a(fqo $$0, @Nullable foa $$1) {
      return $$1 == null ? null : new foa.b($$0, $$1);
   }

   static foa a(fqp $$0, fqo... $$1) {
      foa $$2 = a($$0);

      for (fqo $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fqp a();

   void a(boolean var1);

   public static record a(fqp a) implements foa {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fqo a, foa b) implements foa {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fqo b() {
         return this.a;
      }

      public foa c() {
         return this.b;
      }
   }
}
