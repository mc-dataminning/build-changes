import javax.annotation.Nullable;

public interface fju {
   static fju a(fmh $$0) {
      return new fju.a($$0);
   }

   @Nullable
   static fju a(fmg $$0, @Nullable fju $$1) {
      return $$1 == null ? null : new fju.b($$0, $$1);
   }

   static fju a(fmh $$0, fmg... $$1) {
      fju $$2 = a($$0);

      for (fmg $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fmh a();

   void a(boolean var1);

   public static record a(fmh a) implements fju {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fmg a, fju b) implements fju {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fmg b() {
         return this.a;
      }

      public fju c() {
         return this.b;
      }
   }
}
