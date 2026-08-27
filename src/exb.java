import javax.annotation.Nullable;

public interface exb {
   static exb a(ezm $$0) {
      return new exb.a($$0);
   }

   @Nullable
   static exb a(ezl $$0, @Nullable exb $$1) {
      return $$1 == null ? null : new exb.b($$0, $$1);
   }

   static exb a(ezm $$0, ezl... $$1) {
      exb $$2 = a($$0);

      for (ezl $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ezm a();

   void a(boolean var1);

   public static record a(ezm a) implements exb {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(ezl a, exb b) implements exb {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public ezl b() {
         return this.a;
      }

      public exb c() {
         return this.b;
      }
   }
}
