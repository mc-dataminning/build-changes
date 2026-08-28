import javax.annotation.Nullable;

public interface fgw {
   static fgw a(fji $$0) {
      return new fgw.a($$0);
   }

   @Nullable
   static fgw a(fjh $$0, @Nullable fgw $$1) {
      return $$1 == null ? null : new fgw.b($$0, $$1);
   }

   static fgw a(fji $$0, fjh... $$1) {
      fgw $$2 = a($$0);

      for (fjh $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fji a();

   void a(boolean var1);

   public static record a(fji a) implements fgw {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fjh a, fgw b) implements fgw {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fjh b() {
         return this.a;
      }

      public fgw c() {
         return this.b;
      }
   }
}
