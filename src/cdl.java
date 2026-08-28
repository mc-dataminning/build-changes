import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdl extends cce {
   private final clj a;
   @Nullable
   private bvg b;

   public cdl(clj $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cce.a.a));
   }

   @Override
   public boolean b() {
      bvg $$0 = this.a.O_();
      return this.a.t() > 0 || $$0 != null && this.a.g((buk)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.P().m();
      this.b = this.a.O_();
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
      } else if (this.a.g((buk)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.Q().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
