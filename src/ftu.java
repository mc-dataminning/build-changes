import javax.annotation.Nullable;

public interface ftu {
   static ftu a(fwi $$0) {
      return new ftu.a($$0);
   }

   @Nullable
   static ftu a(fwh $$0, @Nullable ftu $$1) {
      return $$1 == null ? null : new ftu.b($$0, $$1);
   }

   static ftu a(fwi $$0, fwh... $$1) {
      ftu $$2 = a($$0);

      for (fwh $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fwi a();

   void a(boolean var1);

   public static record a(fwi a) implements ftu {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fwh a, ftu b) implements ftu {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fwh b() {
         return this.a;
      }

      public ftu c() {
         return this.b;
      }
   }
}
