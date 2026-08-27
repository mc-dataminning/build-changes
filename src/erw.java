import javax.annotation.Nullable;

public interface erw {
   static erw a(euf $$0) {
      return new erw.a($$0);
   }

   @Nullable
   static erw a(eue $$0, @Nullable erw $$1) {
      return $$1 == null ? null : new erw.b($$0, $$1);
   }

   static erw a(euf $$0, eue... $$1) {
      erw $$2 = a($$0);

      for (eue $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   euf a();

   void a(boolean var1);

   public static record a(euf a) implements erw {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(eue a, erw b) implements erw {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eue b() {
         return this.a;
      }

      public erw c() {
         return this.b;
      }
   }
}
