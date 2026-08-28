import javax.annotation.Nullable;

public interface fhu {
   static fhu a(fkg $$0) {
      return new fhu.a($$0);
   }

   @Nullable
   static fhu a(fkf $$0, @Nullable fhu $$1) {
      return $$1 == null ? null : new fhu.b($$0, $$1);
   }

   static fhu a(fkg $$0, fkf... $$1) {
      fhu $$2 = a($$0);

      for (fkf $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fkg a();

   void a(boolean var1);

   public static record a(fkg a) implements fhu {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fkf a, fhu b) implements fhu {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fkf b() {
         return this.a;
      }

      public fhu c() {
         return this.b;
      }
   }
}
