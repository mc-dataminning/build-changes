import java.util.EnumSet;

public class cfc extends cfe {
   private final bxd a;
   private bwg b;
   private int c;

   public cfc(bxd $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cde.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.p() && !this.a.go()) {
         bwg $$0 = this.a.ah_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.es();
            int $$1 = $$0.et();
            return $$1 != this.c && this.a(this.b, cgx.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bwg $$0 = this.a.ah_();
      if ($$0 != null) {
         this.c = $$0.et();
      }

      super.d();
   }
}
