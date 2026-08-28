import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccr extends cbk {
   private final ckp a;
   @Nullable
   private bun b;

   public ccr(ckp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      bun $$0 = this.a.m();
      return this.a.y() > 0 || $$0 != null && this.a.g((btr)$$0) < 9.0;
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
   public boolean U_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((btr)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.Q().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
