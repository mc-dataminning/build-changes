import javax.annotation.Nullable;

public interface ftw {
   static ftw a(fwk $$0) {
      return new ftw.a($$0);
   }

   @Nullable
   static ftw a(fwj $$0, @Nullable ftw $$1) {
      return $$1 == null ? null : new ftw.b($$0, $$1);
   }

   static ftw a(fwk $$0, fwj... $$1) {
      ftw $$2 = a($$0);

      for (fwj $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fwk a();

   void a(boolean var1);

   public static record a(fwk a) implements ftw {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fwj a, ftw b) implements ftw {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fwj b() {
         return this.a;
      }

      public ftw c() {
         return this.b;
      }
   }
}
