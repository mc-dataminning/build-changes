import javax.annotation.Nullable;

public interface fob {
   static fob a(fqq $$0) {
      return new fob.a($$0);
   }

   @Nullable
   static fob a(fqp $$0, @Nullable fob $$1) {
      return $$1 == null ? null : new fob.b($$0, $$1);
   }

   static fob a(fqq $$0, fqp... $$1) {
      fob $$2 = a($$0);

      for (fqp $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fqq a();

   void a(boolean var1);

   public static record a(fqq a) implements fob {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fqp a, fob b) implements fob {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fqp b() {
         return this.a;
      }

      public fob c() {
         return this.b;
      }
   }
}
