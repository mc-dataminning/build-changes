import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbr extends cak {
   private final cjn a;
   @Nullable
   private btl b;

   public cbr(cjn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      btl $$0 = this.a.p();
      return this.a.t() > 0 || $$0 != null && this.a.g((bsq)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.J().n();
      this.b = this.a.p();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((bsq)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.L().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
