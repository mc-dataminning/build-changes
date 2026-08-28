import javax.annotation.Nullable;

public interface fln {
   static fln a(foa $$0) {
      return new fln.a($$0);
   }

   @Nullable
   static fln a(fnz $$0, @Nullable fln $$1) {
      return $$1 == null ? null : new fln.b($$0, $$1);
   }

   static fln a(foa $$0, fnz... $$1) {
      fln $$2 = a($$0);

      for (fnz $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   foa a();

   void a(boolean var1);

   public static record a(foa a) implements fln {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fnz a, fln b) implements fln {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fnz b() {
         return this.a;
      }

      public fln c() {
         return this.b;
      }
   }
}
