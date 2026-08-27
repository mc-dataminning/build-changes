import java.util.EnumSet;
import javax.annotation.Nullable;

public class bsl extends bre {
   private final bzx a;
   @Nullable
   private bkj b;

   public bsl(bzx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bre.a.a));
   }

   @Override
   public boolean a() {
      bkj $$0 = this.a.q();
      return this.a.t() > 0 || $$0 != null && this.a.f((bjt)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.L().n();
      this.b = this.a.q();
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
      } else if (this.a.f((bjt)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.M().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
