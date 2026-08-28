import javax.annotation.Nullable;

public interface fjk {
   static fjk a(flx $$0) {
      return new fjk.a($$0);
   }

   @Nullable
   static fjk a(flw $$0, @Nullable fjk $$1) {
      return $$1 == null ? null : new fjk.b($$0, $$1);
   }

   static fjk a(flx $$0, flw... $$1) {
      fjk $$2 = a($$0);

      for (flw $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   flx a();

   void a(boolean var1);

   public static record a(flx a) implements fjk {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(flw a, fjk b) implements fjk {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public flw b() {
         return this.a;
      }

      public fjk c() {
         return this.b;
      }
   }
}
