import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccj extends cbc {
   private final ckh a;
   @Nullable
   private buf b;

   public ccj(ckh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.a));
   }

   @Override
   public boolean b() {
      buf $$0 = this.a.m();
      return this.a.y() > 0 || $$0 != null && this.a.g((btj)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.P().o();
      this.b = this.a.m();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((btj)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.Q().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
