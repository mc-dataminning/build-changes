import java.util.EnumSet;
import javax.annotation.Nullable;

public class cce extends ccw {
   private final civ a;
   @Nullable
   private cpr b;
   private final ard c;
   private final float d;
   private int e;
   private final cgp f;

   public cce(civ $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = cgp.b().a((double)$$1);
      this.a(EnumSet.of(ccw.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bJ()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dX().a(40));
   }

   @Override
   public void e() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.J().a(this.b.dz(), this.b.dD(), this.b.dF(), 10.0F, (float)this.a.ac());
      this.e--;
   }

   private boolean a(cpr $$0) {
      for (bsx $$1 : bsx.values()) {
         cxh $$2 = $$0.b($$1);
         if ($$2.a(cxl.sy) || this.a.j($$2)) {
            return true;
         }
      }

      return false;
   }
}
