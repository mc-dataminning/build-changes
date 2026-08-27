import javax.annotation.Nullable;

public interface esv {
   static esv a(eve $$0) {
      return new esv.a($$0);
   }

   @Nullable
   static esv a(evd $$0, @Nullable esv $$1) {
      return $$1 == null ? null : new esv.b($$0, $$1);
   }

   static esv a(eve $$0, evd... $$1) {
      esv $$2 = a($$0);

      for (evd $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eve a();

   void a(boolean var1);

   public static record a(eve a) implements esv {
      @Override
      public void a(boolean $$0) {
         this.a.b_($$0);
      }
   }

   public static record b(evd a, esv b) implements esv {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public evd b() {
         return this.a;
      }

      public esv c() {
         return this.b;
      }
   }
}
