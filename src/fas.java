import javax.annotation.Nullable;

public interface fas {
   static fas a(fde $$0) {
      return new fas.a($$0);
   }

   @Nullable
   static fas a(fdd $$0, @Nullable fas $$1) {
      return $$1 == null ? null : new fas.b($$0, $$1);
   }

   static fas a(fde $$0, fdd... $$1) {
      fas $$2 = a($$0);

      for (fdd $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fde a();

   void a(boolean var1);

   public static record a(fde a) implements fas {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fdd a, fas b) implements fas {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fdd b() {
         return this.a;
      }

      public fas c() {
         return this.b;
      }
   }
}
