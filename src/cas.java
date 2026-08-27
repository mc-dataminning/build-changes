import java.util.EnumSet;
import javax.annotation.Nullable;

public class cas extends bzl {
   private final cio a;
   @Nullable
   private bso b;

   public cas(cio $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      bso $$0 = this.a.p();
      return this.a.t() > 0 || $$0 != null && this.a.g((brv)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.J().n();
      this.b = this.a.p();
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
      } else if (this.a.g((brv)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.K().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
