import java.util.List;
import javax.annotation.Nullable;

public class cdi extends cdn {
   private int a;
   private final bwz b;
   @Nullable
   private cqi c;
   private ccw d;

   public cdi(bwz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<csf> $$0 = this.b.dV().a(csf.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (csf $$2 : $$0) {
         bvs $$3 = $$2.cW();
         if ($$3 instanceof cqi $$4 && (azk.e($$4.bf) > 0.0F || azk.e($$4.bh) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azk.e(this.c.bf) > 0.0F || azk.e(this.c.bh) > 0.0F) || $$1;
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (azk.e(this.c.bf) > 0.0F || azk.e(this.c.bh) > 0.0F);
   }

   @Override
   public void d() {
      for (csf $$1 : this.b.dV().a(csf.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof cqi $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = ccw.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azk.e(this.c.bf) > 0.0F || azk.e(this.c.bh) > 0.0F;
      float $$1 = this.d == ccw.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fcu((double)this.b.bf, (double)this.b.bg, (double)this.b.bh));
      this.b.a(bwv.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == ccw.a) {
            jj $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = ccw.b;
            }
         } else if (this.d == ccw.b) {
            jo $$3 = this.c.cP();
            jj $$4 = this.c.dv().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = ccw.a;
            }
         }
      }
   }
}
