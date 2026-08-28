import java.util.EnumSet;
import javax.annotation.Nullable;

public class cel extends cde {
   private final cmj a;
   @Nullable
   private bwg b;

   public cel(cmj $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cde.a.a));
   }

   @Override
   public boolean b() {
      bwg $$0 = this.a.O_();
      return this.a.t() > 0 || $$0 != null && this.a.g((bvk)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.L().o();
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
      } else if (this.a.g((bvk)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.N().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
