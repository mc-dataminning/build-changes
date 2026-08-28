import javax.annotation.Nullable;

public interface fni {
   static fni a(fpw $$0) {
      return new fni.a($$0);
   }

   @Nullable
   static fni a(fpv $$0, @Nullable fni $$1) {
      return $$1 == null ? null : new fni.b($$0, $$1);
   }

   static fni a(fpw $$0, fpv... $$1) {
      fni $$2 = a($$0);

      for (fpv $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fpw a();

   void a(boolean var1);

   public static record a(fpw a) implements fni {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fpv a, fni b) implements fni {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fpv b() {
         return this.a;
      }

      public fni c() {
         return this.b;
      }
   }
}
