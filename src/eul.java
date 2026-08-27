import javax.annotation.Nullable;

public interface eul {
   static eul a(ewu $$0) {
      return new eul.a($$0);
   }

   @Nullable
   static eul a(ewt $$0, @Nullable eul $$1) {
      return $$1 == null ? null : new eul.b($$0, $$1);
   }

   static eul a(ewu $$0, ewt... $$1) {
      eul $$2 = a($$0);

      for (ewt $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ewu a();

   void a(boolean var1);

   public static record a(ewu a) implements eul {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(ewt a, eul b) implements eul {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public ewt b() {
         return this.a;
      }

      public eul c() {
         return this.b;
      }
   }
}
