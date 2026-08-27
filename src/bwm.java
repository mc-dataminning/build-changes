import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwm extends bvf {
   private final ced a;
   @Nullable
   private boi b;

   public bwm(ced $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvf.a.a));
   }

   @Override
   public boolean a() {
      boi $$0 = this.a.q();
      return this.a.w() > 0 || $$0 != null && this.a.f((bnq)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.N().n();
      this.b = this.a.q();
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.f((bnq)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.O().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
