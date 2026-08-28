import javax.annotation.Nullable;

public interface cxt {
   cxt a = new cxt() {
      @Override
      public void a(wb $$0) {
      }

      @Override
      public void a(dak $$0) {
      }

      @Override
      public boolean b(dak $$0) {
         return true;
      }
   };

   void a(dak var1);

   void a(wb var1);

   boolean b(dak var1);

   public static class a implements cxt {
      private final wa.a b;
      @Nullable
      private dak c = null;
      @Nullable
      private wb d = null;

      public a(wa.a $$0) {
         this.b = $$0;
      }

      @Override
      public void a(dak $$0) {
         this.c = $$0.v();
         this.d = null;
      }

      @Override
      public void a(wb $$0) {
         this.c = null;
         this.d = $$0;
      }

      @Override
      public boolean b(dak $$0) {
         if (this.c != null) {
            return dak.a(this.c, $$0);
         } else if (this.d != null && this.d.a($$0, this.b)) {
            this.c = $$0.v();
            return true;
         } else {
            return false;
         }
      }

      public void a(cxt.a $$0) {
         this.c = $$0.c;
         this.d = $$0.d;
      }
   }
}
