import javax.annotation.Nullable;

public interface frl {
   static frl a(ftz $$0) {
      return new frl.a($$0);
   }

   @Nullable
   static frl a(fty $$0, @Nullable frl $$1) {
      return $$1 == null ? null : new frl.b($$0, $$1);
   }

   static frl a(ftz $$0, fty... $$1) {
      frl $$2 = a($$0);

      for (fty $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ftz a();

   void a(boolean var1);

   public static record a(ftz a) implements frl {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fty a, frl b) implements frl {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fty b() {
         return this.a;
      }

      public frl c() {
         return this.b;
      }
   }
}
