import javax.annotation.Nullable;

public interface fjy {
   static fjy a(fml $$0) {
      return new fjy.a($$0);
   }

   @Nullable
   static fjy a(fmk $$0, @Nullable fjy $$1) {
      return $$1 == null ? null : new fjy.b($$0, $$1);
   }

   static fjy a(fml $$0, fmk... $$1) {
      fjy $$2 = a($$0);

      for (fmk $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fml a();

   void a(boolean var1);

   public static record a(fml a) implements fjy {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fmk a, fjy b) implements fjy {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fmk b() {
         return this.a;
      }

      public fjy c() {
         return this.b;
      }
   }
}
