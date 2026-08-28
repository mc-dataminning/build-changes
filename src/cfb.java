import java.util.EnumSet;

public class cfb extends cfd {
   private final bxc a;
   private bwf b;
   private int c;

   public cfb(bxc $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.p() && !this.a.go()) {
         bwf $$0 = this.a.ah_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.es();
            int $$1 = $$0.et();
            return $$1 != this.c && this.a(this.b, cgw.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bwf $$0 = this.a.ah_();
      if ($$0 != null) {
         this.c = $$0.et();
      }

      super.d();
   }
}
