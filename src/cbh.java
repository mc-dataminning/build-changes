import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbh extends caa {
   private final cjd a;
   @Nullable
   private btc b;

   public cbh(cjd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.a));
   }

   @Override
   public boolean a() {
      btc $$0 = this.a.p();
      return this.a.t() > 0 || $$0 != null && this.a.g((bsh)$$0) < 9.0;
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
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((bsh)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.L().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
