import javax.annotation.Nullable;

public interface ese {
   static ese a(eum $$0) {
      return new ese.a($$0);
   }

   @Nullable
   static ese a(eul $$0, @Nullable ese $$1) {
      return $$1 == null ? null : new ese.b($$0, $$1);
   }

   static ese a(eum $$0, eul... $$1) {
      ese $$2 = a($$0);

      for (eul $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eum a();

   void a(boolean var1);

   public static record a(eum a) implements ese {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(eul a, ese b) implements ese {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eul b() {
         return this.a;
      }

      public ese c() {
         return this.b;
      }
   }
}
