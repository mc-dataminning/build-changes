import javax.annotation.Nullable;

public interface fkj {
   static fkj a(fmw $$0) {
      return new fkj.a($$0);
   }

   @Nullable
   static fkj a(fmv $$0, @Nullable fkj $$1) {
      return $$1 == null ? null : new fkj.b($$0, $$1);
   }

   static fkj a(fmw $$0, fmv... $$1) {
      fkj $$2 = a($$0);

      for (fmv $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fmw a();

   void a(boolean var1);

   public static record a(fmw a) implements fkj {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fmv a, fkj b) implements fkj {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fmv b() {
         return this.a;
      }

      public fkj c() {
         return this.b;
      }
   }
}
