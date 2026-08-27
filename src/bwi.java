import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwi extends bvb {
   private final cdz a;
   @Nullable
   private bog b;

   public bwi(cdz $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.a));
   }

   @Override
   public boolean a() {
      bog $$0 = this.a.q();
      return this.a.w() > 0 || $$0 != null && this.a.f((bno)$$0) < 9.0;
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
      } else if (this.a.f((bno)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.O().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
