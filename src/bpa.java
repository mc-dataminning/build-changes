import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpa extends bps {
   private final bvl a;
   @Nullable
   private cbl b;
   private final cpk c;
   private final float d;
   private int e;
   private final btj f;

   public bpa(bvl $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dK();
      this.d = $$1;
      this.f = btj.b().a((double)$$1);
      this.a(EnumSet.of(bps.a.b));
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
         return this.a.f((big)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
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

   private boolean a(cbl $$0) {
      for (bgn $$1 : bgn.values()) {
         ciw $$2 = $$0.b($$1);
         if (this.a.p() && $$2.a(ciz.qL)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
