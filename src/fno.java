import javax.annotation.Nullable;

public interface fno {
   static fno a(fqc $$0) {
      return new fno.a($$0);
   }

   @Nullable
   static fno a(fqb $$0, @Nullable fno $$1) {
      return $$1 == null ? null : new fno.b($$0, $$1);
   }

   static fno a(fqc $$0, fqb... $$1) {
      fno $$2 = a($$0);

      for (fqb $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fqc a();

   void a(boolean var1);

   public static record a(fqc a) implements fno {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fqb a, fno b) implements fno {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fqb b() {
         return this.a;
      }

      public fno c() {
         return this.b;
      }
   }
}
