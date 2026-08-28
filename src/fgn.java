import javax.annotation.Nullable;

public interface fgn {
   static fgn a(fiz $$0) {
      return new fgn.a($$0);
   }

   @Nullable
   static fgn a(fiy $$0, @Nullable fgn $$1) {
      return $$1 == null ? null : new fgn.b($$0, $$1);
   }

   static fgn a(fiz $$0, fiy... $$1) {
      fgn $$2 = a($$0);

      for (fiy $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fiz a();

   void a(boolean var1);

   public static record a(fiz a) implements fgn {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fiy a, fgn b) implements fgn {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fiy b() {
         return this.a;
      }

      public fgn c() {
         return this.b;
      }
   }
}
