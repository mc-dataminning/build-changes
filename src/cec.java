import java.util.EnumSet;
import javax.annotation.Nullable;

public class cec extends ccv {
   private final cma a;
   @Nullable
   private bvx b;

   public cec(cma $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.a));
   }

   @Override
   public boolean b() {
      bvx $$0 = this.a.O_();
      return this.a.t() > 0 || $$0 != null && this.a.g((bvb)$$0) < 9.0;
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
      } else if (this.a.g((bvb)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.N().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
