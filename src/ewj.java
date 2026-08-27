import javax.annotation.Nullable;

public interface ewj {
   static ewj a(eyt $$0) {
      return new ewj.a($$0);
   }

   @Nullable
   static ewj a(eys $$0, @Nullable ewj $$1) {
      return $$1 == null ? null : new ewj.b($$0, $$1);
   }

   static ewj a(eyt $$0, eys... $$1) {
      ewj $$2 = a($$0);

      for (eys $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eyt a();

   void a(boolean var1);

   public static record a(eyt a) implements ewj {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(eys a, ewj b) implements ewj {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eys b() {
         return this.a;
      }

      public ewj c() {
         return this.b;
      }
   }
}
