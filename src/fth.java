import javax.annotation.Nullable;

public interface fth {
   static fth a(fvv $$0) {
      return new fth.a($$0);
   }

   @Nullable
   static fth a(fvu $$0, @Nullable fth $$1) {
      return $$1 == null ? null : new fth.b($$0, $$1);
   }

   static fth a(fvv $$0, fvu... $$1) {
      fth $$2 = a($$0);

      for (fvu $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fvv a();

   void a(boolean var1);

   public static record a(fvv a) implements fth {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fvu a, fth b) implements fth {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fvu b() {
         return this.a;
      }

      public fth c() {
         return this.b;
      }
   }
}
