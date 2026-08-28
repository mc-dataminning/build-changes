import java.util.EnumSet;

public class cei extends cdd {
   private final bxc a;

   public cei(bxc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.c, cdd.a.a));
   }

   @Override
   public boolean c() {
      return this.a.go();
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
         bwf $$0 = this.a.ah_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bvj)$$0) < 144.0 && $$0.eq() != null ? false : this.a.go();
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
