import javax.annotation.Nullable;

public interface ewq {
   static ewq a(eza $$0) {
      return new ewq.a($$0);
   }

   @Nullable
   static ewq a(eyz $$0, @Nullable ewq $$1) {
      return $$1 == null ? null : new ewq.b($$0, $$1);
   }

   static ewq a(eza $$0, eyz... $$1) {
      ewq $$2 = a($$0);

      for (eyz $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eza a();

   void a(boolean var1);

   public static record a(eza a) implements ewq {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(eyz a, ewq b) implements ewq {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eyz b() {
         return this.a;
      }

      public ewq c() {
         return this.b;
      }
   }
}
