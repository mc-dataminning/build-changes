import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdj extends ccc {
   private final clh a;
   @Nullable
   private bve b;

   public cdj(clh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      bve $$0 = this.a.m();
      return this.a.y() > 0 || $$0 != null && this.a.g((bui)$$0) < 9.0;
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
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((bui)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.Q().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
