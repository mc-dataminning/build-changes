import javax.annotation.Nullable;

public interface fgm {
   static fgm a(fiy $$0) {
      return new fgm.a($$0);
   }

   @Nullable
   static fgm a(fix $$0, @Nullable fgm $$1) {
      return $$1 == null ? null : new fgm.b($$0, $$1);
   }

   static fgm a(fiy $$0, fix... $$1) {
      fgm $$2 = a($$0);

      for (fix $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fiy a();

   void a(boolean var1);

   public static record a(fiy a) implements fgm {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fix a, fgm b) implements fgm {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fix b() {
         return this.a;
      }

      public fgm c() {
         return this.b;
      }
   }
}
