import java.util.EnumSet;

public class cau extends cax {
   private final bsw a;
   private bsa b;
   private int c;

   public cau(bsw $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(byx.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.r() && !this.a.gp()) {
         bsa $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, ccq.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bsa $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.c();
   }
}
