import javax.annotation.Nullable;

public interface fhe {
   static fhe a(fjq $$0) {
      return new fhe.a($$0);
   }

   @Nullable
   static fhe a(fjp $$0, @Nullable fhe $$1) {
      return $$1 == null ? null : new fhe.b($$0, $$1);
   }

   static fhe a(fjq $$0, fjp... $$1) {
      fhe $$2 = a($$0);

      for (fjp $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fjq a();

   void a(boolean var1);

   public static record a(fjq a) implements fhe {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fjp a, fhe b) implements fhe {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fjp b() {
         return this.a;
      }

      public fhe c() {
         return this.b;
      }
   }
}
