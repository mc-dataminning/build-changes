import javax.annotation.Nullable;

public interface fpw {
   static fpw a(fsk $$0) {
      return new fpw.a($$0);
   }

   @Nullable
   static fpw a(fsj $$0, @Nullable fpw $$1) {
      return $$1 == null ? null : new fpw.b($$0, $$1);
   }

   static fpw a(fsk $$0, fsj... $$1) {
      fpw $$2 = a($$0);

      for (fsj $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fsk a();

   void a(boolean var1);

   public static record a(fsk a) implements fpw {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fsj a, fpw b) implements fpw {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fsj b() {
         return this.a;
      }

      public fpw c() {
         return this.b;
      }
   }
}
