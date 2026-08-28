import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdn extends ccg {
   private final cll a;
   @Nullable
   private bvi b;

   public cdn(cll $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccg.a.a));
   }

   @Override
   public boolean b() {
      bvi $$0 = this.a.O_();
      return this.a.t() > 0 || $$0 != null && this.a.g((bum)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.P().m();
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
      } else if (this.a.g((bum)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.Q().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
