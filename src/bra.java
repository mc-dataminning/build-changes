import java.util.EnumSet;
import javax.annotation.Nullable;

public class bra extends bpt {
   private final bym a;
   @Nullable
   private biy b;

   public bra(bym $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpt.a.a));
   }

   @Override
   public boolean a() {
      biy $$0 = this.a.j();
      return this.a.q() > 0 || $$0 != null && this.a.f((bii)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.H().n();
      this.b = this.a.j();
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.f((bii)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.J().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
