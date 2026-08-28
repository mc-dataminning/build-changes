import javax.annotation.Nullable;

public interface fgq {
   static fgq a(fjc $$0) {
      return new fgq.a($$0);
   }

   @Nullable
   static fgq a(fjb $$0, @Nullable fgq $$1) {
      return $$1 == null ? null : new fgq.b($$0, $$1);
   }

   static fgq a(fjc $$0, fjb... $$1) {
      fgq $$2 = a($$0);

      for (fjb $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fjc a();

   void a(boolean var1);

   public static record a(fjc a) implements fgq {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fjb a, fgq b) implements fgq {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fjb b() {
         return this.a;
      }

      public fgq c() {
         return this.b;
      }
   }
}
