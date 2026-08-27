import javax.annotation.Nullable;

public interface erx {
   static erx a(euf $$0) {
      return new erx.a($$0);
   }

   @Nullable
   static erx a(eue $$0, @Nullable erx $$1) {
      return $$1 == null ? null : new erx.b($$0, $$1);
   }

   static erx a(euf $$0, eue... $$1) {
      erx $$2 = a($$0);

      for (eue $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   euf a();

   void a(boolean var1);

   public static record a(euf a) implements erx {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(eue a, erx b) implements erx {
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

      public erx c() {
         return this.b;
      }
   }
}
