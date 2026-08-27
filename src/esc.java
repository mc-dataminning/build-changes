import javax.annotation.Nullable;

public interface esc {
   static esc a(euk $$0) {
      return new esc.a($$0);
   }

   @Nullable
   static esc a(euj $$0, @Nullable esc $$1) {
      return $$1 == null ? null : new esc.b($$0, $$1);
   }

   static esc a(euk $$0, euj... $$1) {
      esc $$2 = a($$0);

      for (euj $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   euk a();

   void a(boolean var1);

   public static record a(euk a) implements esc {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(euj a, esc b) implements esc {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public euj b() {
         return this.a;
      }

      public esc c() {
         return this.b;
      }
   }
}
