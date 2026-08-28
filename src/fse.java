import javax.annotation.Nullable;

public interface fse {
   static fse a(fus $$0) {
      return new fse.a($$0);
   }

   @Nullable
   static fse a(fur $$0, @Nullable fse $$1) {
      return $$1 == null ? null : new fse.b($$0, $$1);
   }

   static fse a(fus $$0, fur... $$1) {
      fse $$2 = a($$0);

      for (fur $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fus a();

   void a(boolean var1);

   public static record a(fus a) implements fse {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fur a, fse b) implements fse {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fur b() {
         return this.a;
      }

      public fse c() {
         return this.b;
      }
   }
}
