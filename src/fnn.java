import javax.annotation.Nullable;

public interface fnn {
   static fnn a(fqb $$0) {
      return new fnn.a($$0);
   }

   @Nullable
   static fnn a(fqa $$0, @Nullable fnn $$1) {
      return $$1 == null ? null : new fnn.b($$0, $$1);
   }

   static fnn a(fqb $$0, fqa... $$1) {
      fnn $$2 = a($$0);

      for (fqa $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fqb a();

   void a(boolean var1);

   public static record a(fqb a) implements fnn {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fqa a, fnn b) implements fnn {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fqa b() {
         return this.a;
      }

      public fnn c() {
         return this.b;
      }
   }
}
