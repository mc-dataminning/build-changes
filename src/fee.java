import javax.annotation.Nullable;

public interface fee {
   static fee a(fgq $$0) {
      return new fee.a($$0);
   }

   @Nullable
   static fee a(fgp $$0, @Nullable fee $$1) {
      return $$1 == null ? null : new fee.b($$0, $$1);
   }

   static fee a(fgq $$0, fgp... $$1) {
      fee $$2 = a($$0);

      for (fgp $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fgq a();

   void a(boolean var1);

   public static record a(fgq a) implements fee {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fgp a, fee b) implements fee {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fgp b() {
         return this.a;
      }

      public fee c() {
         return this.b;
      }
   }
}
