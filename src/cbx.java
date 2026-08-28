import java.util.EnumSet;

public class cbx extends cbz {
   private final bty a;
   private btb b;
   private int c;

   public cbx(bty $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.go()) {
         btb $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.el();
            int $$1 = $$0.em();
            return $$1 != this.c && this.a(this.b, cds.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      btb $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.em();
      }

      super.c();
   }
}
