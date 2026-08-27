import javax.annotation.Nullable;

public interface eyy {
   static eyy a(fbk $$0) {
      return new eyy.a($$0);
   }

   @Nullable
   static eyy a(fbj $$0, @Nullable eyy $$1) {
      return $$1 == null ? null : new eyy.b($$0, $$1);
   }

   static eyy a(fbk $$0, fbj... $$1) {
      eyy $$2 = a($$0);

      for (fbj $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fbk a();

   void a(boolean var1);

   public static record a(fbk a) implements eyy {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fbj a, eyy b) implements eyy {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fbj b() {
         return this.a;
      }

      public eyy c() {
         return this.b;
      }
   }
}
