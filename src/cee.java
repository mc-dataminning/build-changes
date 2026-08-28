import java.util.EnumSet;

public class cee extends ccz {
   private final bwy a;

   public cee(bwy $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccz.a.c, ccz.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gm();
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
         bwb $$0 = this.a.ah_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bvf)$$0) < 144.0 && $$0.ep() != null ? false : this.a.gm();
         }
      }
   }

   @Override
   public void d() {
      this.a.L().o();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
