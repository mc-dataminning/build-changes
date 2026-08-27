import javax.annotation.Nullable;

public interface ffj {
   static ffj a(fhv $$0) {
      return new ffj.a($$0);
   }

   @Nullable
   static ffj a(fhu $$0, @Nullable ffj $$1) {
      return $$1 == null ? null : new ffj.b($$0, $$1);
   }

   static ffj a(fhv $$0, fhu... $$1) {
      ffj $$2 = a($$0);

      for (fhu $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fhv a();

   void a(boolean var1);

   public static record a(fhv a) implements ffj {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fhu a, ffj b) implements ffj {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fhu b() {
         return this.a;
      }

      public ffj c() {
         return this.b;
      }
   }
}
