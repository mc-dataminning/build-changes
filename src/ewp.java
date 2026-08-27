import javax.annotation.Nullable;

public interface ewp {
   static ewp a(eyz $$0) {
      return new ewp.a($$0);
   }

   @Nullable
   static ewp a(eyy $$0, @Nullable ewp $$1) {
      return $$1 == null ? null : new ewp.b($$0, $$1);
   }

   static ewp a(eyz $$0, eyy... $$1) {
      ewp $$2 = a($$0);

      for (eyy $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eyz a();

   void a(boolean var1);

   public static record a(eyz a) implements ewp {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(eyy a, ewp b) implements ewp {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eyy b() {
         return this.a;
      }

      public ewp c() {
         return this.b;
      }
   }
}
