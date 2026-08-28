import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbt extends cam {
   private final cjp a;
   @Nullable
   private btn b;

   public cbt(cjp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      btn $$0 = this.a.p();
      return this.a.t() > 0 || $$0 != null && this.a.g((bsr)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.N().n();
      this.b = this.a.p();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((bsr)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.O().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
