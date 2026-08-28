import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfc extends cdv {
   private final cnf a;
   @Nullable
   private bwz b;

   public cfc(cnf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdv.a.a));
   }

   @Override
   public boolean b() {
      bwz $$0 = this.a.f();
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
   public boolean Q_() {
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
