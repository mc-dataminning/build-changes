import javax.annotation.Nullable;

public interface fqz {
   static fqz a(ftn $$0) {
      return new fqz.a($$0);
   }

   @Nullable
   static fqz a(ftm $$0, @Nullable fqz $$1) {
      return $$1 == null ? null : new fqz.b($$0, $$1);
   }

   static fqz a(ftn $$0, ftm... $$1) {
      fqz $$2 = a($$0);

      for (ftm $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ftn a();

   void a(boolean var1);

   public static record a(ftn a) implements fqz {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(ftm a, fqz b) implements fqz {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public ftm b() {
         return this.a;
      }

      public fqz c() {
         return this.b;
      }
   }
}
