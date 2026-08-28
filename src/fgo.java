import javax.annotation.Nullable;

public interface fgo {
   static fgo a(fja $$0) {
      return new fgo.a($$0);
   }

   @Nullable
   static fgo a(fiz $$0, @Nullable fgo $$1) {
      return $$1 == null ? null : new fgo.b($$0, $$1);
   }

   static fgo a(fja $$0, fiz... $$1) {
      fgo $$2 = a($$0);

      for (fiz $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fja a();

   void a(boolean var1);

   public static record a(fja a) implements fgo {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fiz a, fgo b) implements fgo {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fiz b() {
         return this.a;
      }

      public fgo c() {
         return this.b;
      }
   }
}
