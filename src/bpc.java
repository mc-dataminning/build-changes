import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpc extends bpu {
   private final bvn a;
   @Nullable
   private cbn b;
   private final cpm c;
   private final float d;
   private int e;
   private final btl f;

   public bpc(bvn $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dK();
      this.d = $$1;
      this.f = btl.b().a((double)$$1);
      this.a(EnumSet.of(bpu.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bv()) {
         return false;
      } else {
         return this.a.f((bii)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.A(true);
      this.e = this.a(40 + this.a.ee().a(40));
   }

   @Override
   public void d() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.D().a(this.b.dp(), this.b.dt(), this.b.dv(), 10.0F, (float)this.a.W());
      this.e--;
   }

   private boolean a(cbn $$0) {
      for (bgp $$1 : bgp.values()) {
         ciy $$2 = $$0.b($$1);
         if (this.a.p() && $$2.a(cjb.qL)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
