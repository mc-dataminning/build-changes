import javax.annotation.Nullable;

public interface feo {
   static feo a(fha $$0) {
      return new feo.a($$0);
   }

   @Nullable
   static feo a(fgz $$0, @Nullable feo $$1) {
      return $$1 == null ? null : new feo.b($$0, $$1);
   }

   static feo a(fha $$0, fgz... $$1) {
      feo $$2 = a($$0);

      for (fgz $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fha a();

   void a(boolean var1);

   public static record a(fha a) implements feo {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fgz a, feo b) implements feo {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fgz b() {
         return this.a;
      }

      public feo c() {
         return this.b;
      }
   }
}
