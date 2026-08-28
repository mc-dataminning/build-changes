import java.util.EnumSet;

public class cdh extends ccc {
   private final bwb a;

   public cdh(bwb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.c, ccc.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gv();
   }

   @Override
   public boolean b() {
      if (!this.a.q()) {
         return false;
      } else if (this.a.bo()) {
         return false;
      } else if (!this.a.aL()) {
         return false;
      } else {
         bve $$0 = this.a.T_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bui)$$0) < 144.0 && $$0.et() != null ? false : this.a.gv();
         }
      }
   }

   @Override
   public void d() {
      this.a.P().o();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
