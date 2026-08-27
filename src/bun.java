import java.util.EnumSet;
import javax.annotation.Nullable;

public class bun extends btg {
   private final cca a;
   @Nullable
   private bmk b;

   public bun(cca $$0) {
      this.a = $$0;
      this.a(EnumSet.of(btg.a.a));
   }

   @Override
   public boolean a() {
      bmk $$0 = this.a.q();
      return this.a.w() > 0 || $$0 != null && this.a.f((blu)$$0) < 9.0;
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
      } else if (this.a.f((blu)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.O().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
