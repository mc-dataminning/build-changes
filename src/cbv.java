import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbv extends cao {
   private final cjq a;
   @Nullable
   private btq b;

   public cbv(cjq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cao.a.a));
   }

   @Override
   public boolean a() {
      btq $$0 = this.a.p();
      return this.a.u() > 0 || $$0 != null && this.a.g((bsv)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.K().n();
      this.b = this.a.p();
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
      } else if (this.a.g((bsv)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.M().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
