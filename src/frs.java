import javax.annotation.Nullable;

public interface frs {
   static frs a(fug $$0) {
      return new frs.a($$0);
   }

   @Nullable
   static frs a(fuf $$0, @Nullable frs $$1) {
      return $$1 == null ? null : new frs.b($$0, $$1);
   }

   static frs a(fug $$0, fuf... $$1) {
      frs $$2 = a($$0);

      for (fuf $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fug a();

   void a(boolean var1);

   public static record a(fug a) implements frs {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fuf a, frs b) implements frs {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fuf b() {
         return this.a;
      }

      public frs c() {
         return this.b;
      }
   }
}
