import javax.annotation.Nullable;

public interface ewr {
   static ewr a(ezb $$0) {
      return new ewr.a($$0);
   }

   @Nullable
   static ewr a(eza $$0, @Nullable ewr $$1) {
      return $$1 == null ? null : new ewr.b($$0, $$1);
   }

   static ewr a(ezb $$0, eza... $$1) {
      ewr $$2 = a($$0);

      for (eza $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   ezb a();

   void a(boolean var1);

   public static record a(ezb a) implements ewr {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(eza a, ewr b) implements ewr {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eza b() {
         return this.a;
      }

      public ewr c() {
         return this.b;
      }
   }
}
