import javax.annotation.Nullable;

public interface fsj {
   static fsj a(fux $$0) {
      return new fsj.a($$0);
   }

   @Nullable
   static fsj a(fuw $$0, @Nullable fsj $$1) {
      return $$1 == null ? null : new fsj.b($$0, $$1);
   }

   static fsj a(fux $$0, fuw... $$1) {
      fsj $$2 = a($$0);

      for (fuw $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fux a();

   void a(boolean var1);

   public static record a(fux a) implements fsj {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public static record b(fuw a, fsj b) implements fsj {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fuw b() {
         return this.a;
      }

      public fsj c() {
         return this.b;
      }
   }
}
