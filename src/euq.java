import javax.annotation.Nullable;

public interface euq {
   static euq a(ewz $$0) {
      return new euq.a($$0);
   }

   @Nullable
   static euq a(ewy $$0, @Nullable euq $$1) {
      return $$1 == null ? null : new euq.b($$0, $$1);
   }

   static euq a(ewz $$0, ewy... $$1) {
      euq $$2 = a($$0);

      for (ewy $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ewz a();

   void a(boolean var1);

   public static record a(ewz a) implements euq {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(ewy a, euq b) implements euq {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public ewy b() {
         return this.a;
      }

      public euq c() {
         return this.b;
      }
   }
}
