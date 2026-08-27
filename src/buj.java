import java.util.EnumSet;
import javax.annotation.Nullable;

public class buj extends bvb {
   private final caw a;
   @Nullable
   private chh b;
   private final cvn c;
   private final float d;
   private int e;
   private final byu f;

   public buj(caw $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dM();
      this.d = $$1;
      this.f = byu.b().a((double)$$1);
      this.a(EnumSet.of(bvb.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bx()) {
         return false;
      } else {
         return this.a.f((bno)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.B(true);
      this.e = this.a(40 + this.a.eh().a(40));
   }

   @Override
   public void d() {
      this.a.B(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.I().a(this.b.dr(), this.b.dv(), this.b.dx(), 10.0F, (float)this.a.ab());
      this.e--;
   }

   private boolean a(chh $$0) {
      for (blt $$1 : blt.values()) {
         coz $$2 = $$0.b($$1);
         if (this.a.u() && $$2.a(cpc.ry)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
