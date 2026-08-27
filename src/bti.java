import java.util.EnumSet;
import javax.annotation.Nullable;

public class bti extends bsb {
   private final cau a;
   @Nullable
   private blg b;

   public bti(cau $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsb.a.a));
   }

   @Override
   public boolean a() {
      blg $$0 = this.a.q();
      return this.a.w() > 0 || $$0 != null && this.a.f((bkq)$$0) < 9.0;
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
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.f((bkq)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.O().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
