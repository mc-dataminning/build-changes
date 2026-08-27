import javax.annotation.Nullable;

public interface eou {
   static eou a(eqt $$0) {
      return new eou.a($$0);
   }

   @Nullable
   static eou a(eqs $$0, @Nullable eou $$1) {
      return $$1 == null ? null : new eou.b($$0, $$1);
   }

   static eou a(eqt $$0, eqs... $$1) {
      eou $$2 = a($$0);

      for (eqs $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eqt a();

   void a(boolean var1);

   public static record a(eqt a) implements eou {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(eqs a, eou b) implements eou {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eqs b() {
         return this.a;
      }

      public eou c() {
         return this.b;
      }
   }
}
