import javax.annotation.Nullable;

public interface fdi {
   static fdi a(ffu $$0) {
      return new fdi.a($$0);
   }

   @Nullable
   static fdi a(fft $$0, @Nullable fdi $$1) {
      return $$1 == null ? null : new fdi.b($$0, $$1);
   }

   static fdi a(ffu $$0, fft... $$1) {
      fdi $$2 = a($$0);

      for (fft $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ffu a();

   void a(boolean var1);

   public static record a(ffu a) implements fdi {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fft a, fdi b) implements fdi {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fft b() {
         return this.a;
      }

      public fdi c() {
         return this.b;
      }
   }
}
