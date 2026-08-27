import java.util.EnumSet;

public class cbi extends cbl {
   private final btk a;
   private bso b;
   private int c;

   public cbi(btk $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.r() && !this.a.gy()) {
         bso $$0 = this.a.Q_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eu();
            int $$1 = $$0.ev();
            return $$1 != this.c && this.a(this.b, cde.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bso $$0 = this.a.Q_();
      if ($$0 != null) {
         this.c = $$0.ev();
      }

      super.c();
   }
}
