import java.util.EnumSet;

public class cdl extends ccg {
   private final bwf a;

   public cdl(bwf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccg.a.c, ccg.a.a));
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
         bvi $$0 = this.a.ag_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bum)$$0) < 144.0 && $$0.ep() != null ? false : this.a.gs();
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
