import javax.annotation.Nullable;

public interface fcz {
   static fcz a(ffl $$0) {
      return new fcz.a($$0);
   }

   @Nullable
   static fcz a(ffk $$0, @Nullable fcz $$1) {
      return $$1 == null ? null : new fcz.b($$0, $$1);
   }

   static fcz a(ffl $$0, ffk... $$1) {
      fcz $$2 = a($$0);

      for (ffk $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ffl a();

   void a(boolean var1);

   public static record a(ffl a) implements fcz {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(ffk a, fcz b) implements fcz {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public ffk b() {
         return this.a;
      }

      public fcz c() {
         return this.b;
      }
   }
}
