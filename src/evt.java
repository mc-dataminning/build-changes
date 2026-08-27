import javax.annotation.Nullable;

public interface evt {
   static evt a(eyc $$0) {
      return new evt.a($$0);
   }

   @Nullable
   static evt a(eyb $$0, @Nullable evt $$1) {
      return $$1 == null ? null : new evt.b($$0, $$1);
   }

   static evt a(eyc $$0, eyb... $$1) {
      evt $$2 = a($$0);

      for (eyb $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   eyc a();

   void a(boolean var1);

   public static record a(eyc a) implements evt {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(eyb a, evt b) implements evt {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public eyb b() {
         return this.a;
      }

      public evt c() {
         return this.b;
      }
   }
}
