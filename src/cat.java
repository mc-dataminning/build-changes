import java.util.EnumSet;
import javax.annotation.Nullable;

public class cat extends bzm {
   private final cio a;
   @Nullable
   private bso b;

   public cat(cio $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.a));
   }

   @Override
   public boolean a() {
      bso $$0 = this.a.p();
      return this.a.u() > 0 || $$0 != null && this.a.g((bru)$$0) < 9.0;
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
      } else if (this.a.g((bru)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.M().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
