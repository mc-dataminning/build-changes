import javax.annotation.Nullable;

public interface eru {
   static eru a(etw $$0) {
      return new eru.a($$0);
   }

   @Nullable
   static eru a(etv $$0, @Nullable eru $$1) {
      return $$1 == null ? null : new eru.b($$0, $$1);
   }

   static eru a(etw $$0, etv... $$1) {
      eru $$2 = a($$0);

      for (etv $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   etw a();

   void a(boolean var1);

   public static record a(etw a) implements eru {
      @Override
      public void a(boolean $$0) {
         this.a.c_($$0);
      }
   }

   public static record b(etv a, eru b) implements eru {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public etv b() {
         return this.a;
      }

      public eru c() {
         return this.b;
      }
   }
}
