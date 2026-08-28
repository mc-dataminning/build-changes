import javax.annotation.Nullable;

public interface fkr {
   static fkr a(fne $$0) {
      return new fkr.a($$0);
   }

   @Nullable
   static fkr a(fnd $$0, @Nullable fkr $$1) {
      return $$1 == null ? null : new fkr.b($$0, $$1);
   }

   static fkr a(fne $$0, fnd... $$1) {
      fkr $$2 = a($$0);

      for (fnd $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fne a();

   void a(boolean var1);

   public static record a(fne a) implements fkr {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fnd a, fkr b) implements fkr {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fnd b() {
         return this.a;
      }

      public fkr c() {
         return this.b;
      }
   }
}
