import java.util.EnumSet;
import javax.annotation.Nullable;

public class bta extends brt {
   private final cam a;
   @Nullable
   private bky b;

   public bta(cam $$0) {
      this.a = $$0;
      this.a(EnumSet.of(brt.a.a));
   }

   @Override
   public boolean a() {
      bky $$0 = this.a.q();
      return this.a.t() > 0 || $$0 != null && this.a.f((bki)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.L().n();
      this.b = this.a.q();
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.f((bki)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.M().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
