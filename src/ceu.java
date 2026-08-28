import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceu extends cdn {
   private final cmv a;
   @Nullable
   private bwr b;

   public ceu(cmv $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdn.a.a));
   }

   @Override
   public boolean b() {
      bwr $$0 = this.a.f();
      return this.a.n() > 0 || $$0 != null && this.a.g((bvs)$$0) < 9.0;
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
      } else if (this.a.g((bvs)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.P().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
