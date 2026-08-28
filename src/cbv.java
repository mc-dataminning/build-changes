import java.util.EnumSet;

public class cbv extends cam {
   private final cmf a;

   public cbv(cmf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.c, cam.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bE()) {
         return false;
      } else if (this.a.bf()) {
         return false;
      } else if (!this.a.aF()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cmx $$0 = this.a.gl();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.N().n();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
