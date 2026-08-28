import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfh extends cea {
   private final cnp a;
   @Nullable
   private bxe b;

   public cfh(cnp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cea.a.a));
   }

   @Override
   public boolean b() {
      bxe $$0 = this.a.f();
      return this.a.n() > 0 || $$0 != null && this.a.g($$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.O().m();
      this.b = this.a.f();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g(this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.P().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
