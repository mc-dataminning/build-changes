import javax.annotation.Nullable;

public interface fgj {
   static fgj a(fiv $$0) {
      return new fgj.a($$0);
   }

   @Nullable
   static fgj a(fiu $$0, @Nullable fgj $$1) {
      return $$1 == null ? null : new fgj.b($$0, $$1);
   }

   static fgj a(fiv $$0, fiu... $$1) {
      fgj $$2 = a($$0);

      for (fiu $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fiv a();

   void a(boolean var1);

   public static record a(fiv a) implements fgj {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fiu a, fgj b) implements fgj {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fiu b() {
         return this.a;
      }

      public fgj c() {
         return this.b;
      }
   }
}
