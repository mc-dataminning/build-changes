import javax.annotation.Nullable;

public interface foz {
   static foz a(frn $$0) {
      return new foz.a($$0);
   }

   @Nullable
   static foz a(frm $$0, @Nullable foz $$1) {
      return $$1 == null ? null : new foz.b($$0, $$1);
   }

   static foz a(frn $$0, frm... $$1) {
      foz $$2 = a($$0);

      for (frm $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   frn a();

   void a(boolean var1);

   public static record a(frn a) implements foz {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(frm a, foz b) implements foz {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public frm b() {
         return this.a;
      }

      public foz c() {
         return this.b;
      }
   }
}
