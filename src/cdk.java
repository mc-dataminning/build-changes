import java.util.EnumSet;

public class cdk extends ccf {
   private final bwe a;

   public cdk(bwe $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.c, ccf.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gs();
   }

   @Override
   public boolean b() {
      if (!this.a.p()) {
         return false;
      } else if (this.a.bm()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else {
         bvh $$0 = this.a.ag_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bul)$$0) < 144.0 && $$0.ep() != null ? false : this.a.gs();
         }
      }
   }

   @Override
   public void d() {
      this.a.P().m();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
