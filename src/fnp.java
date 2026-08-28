import javax.annotation.Nullable;

public interface fnp {
   static fnp a(fqd $$0) {
      return new fnp.a($$0);
   }

   @Nullable
   static fnp a(fqc $$0, @Nullable fnp $$1) {
      return $$1 == null ? null : new fnp.b($$0, $$1);
   }

   static fnp a(fqd $$0, fqc... $$1) {
      fnp $$2 = a($$0);

      for (fqc $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fqd a();

   void a(boolean var1);

   public static record a(fqd a) implements fnp {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fqc a, fnp b) implements fnp {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fqc b() {
         return this.a;
      }

      public fnp c() {
         return this.b;
      }
   }
}
