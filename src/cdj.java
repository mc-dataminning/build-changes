import java.util.EnumSet;

public class cdj extends cce {
   private final bwd a;

   public cdj(bwd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cce.a.c, cce.a.a));
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
         bvg $$0 = this.a.ag_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((buk)$$0) < 144.0 && $$0.ep() != null ? false : this.a.gs();
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
