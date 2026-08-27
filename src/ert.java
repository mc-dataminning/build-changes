import javax.annotation.Nullable;

public interface ert {
   static ert a(eua $$0) {
      return new ert.a($$0);
   }

   @Nullable
   static ert a(etz $$0, @Nullable ert $$1) {
      return $$1 == null ? null : new ert.b($$0, $$1);
   }

   static ert a(eua $$0, etz... $$1) {
      ert $$2 = a($$0);

      for (etz $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eua a();

   void a(boolean var1);

   public static record a(eua a) implements ert {
      @Override
      public void a(boolean $$0) {
         this.a.c_($$0);
      }
   }

   public static record b(etz a, ert b) implements ert {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public etz b() {
         return this.a;
      }

      public ert c() {
         return this.b;
      }
   }
}
