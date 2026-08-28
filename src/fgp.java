import javax.annotation.Nullable;

public interface fgp {
   static fgp a(fjb $$0) {
      return new fgp.a($$0);
   }

   @Nullable
   static fgp a(fja $$0, @Nullable fgp $$1) {
      return $$1 == null ? null : new fgp.b($$0, $$1);
   }

   static fgp a(fjb $$0, fja... $$1) {
      fgp $$2 = a($$0);

      for (fja $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fjb a();

   void a(boolean var1);

   public static record a(fjb a) implements fgp {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fja a, fgp b) implements fgp {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fja b() {
         return this.a;
      }

      public fgp c() {
         return this.b;
      }
   }
}
