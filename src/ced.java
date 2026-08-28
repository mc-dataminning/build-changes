import java.util.EnumSet;

public class ced extends cef {
   private final bwe a;
   private bvh b;
   private int c;

   public ced(bwe $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.n() && !this.a.gm()) {
         bvh $$0 = this.a.ag_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.er();
            int $$1 = $$0.es();
            return $$1 != this.c && this.a(this.b, cfy.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bvh $$0 = this.a.ag_();
      if ($$0 != null) {
         this.c = $$0.es();
      }

      super.d();
   }
}
