import javax.annotation.Nullable;

public interface ety {
   static ety a(ewh $$0) {
      return new ety.a($$0);
   }

   @Nullable
   static ety a(ewg $$0, @Nullable ety $$1) {
      return $$1 == null ? null : new ety.b($$0, $$1);
   }

   static ety a(ewh $$0, ewg... $$1) {
      ety $$2 = a($$0);

      for (ewg $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ewh a();

   void a(boolean var1);

   public static record a(ewh a) implements ety {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(ewg a, ety b) implements ety {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public ewg b() {
         return this.a;
      }

      public ety c() {
         return this.b;
      }
   }
}
