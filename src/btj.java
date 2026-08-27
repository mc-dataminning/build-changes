import java.util.EnumSet;
import javax.annotation.Nullable;

public class btj extends bsb {
   private static final bvs c = bvs.b().a(10.0).d();
   private final bvs d;
   protected final blp a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cdu b;
   private int k;
   private boolean l;
   private final cok m;
   private final boolean n;

   public btj(blp $$0, double $$1, cok $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dN().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(blg $$0) {
      return this.m.a($$0.eU()) || this.m.a($$0.eV());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.f(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dF() - this.i) > 5.0 || Math.abs((double)this.b.dD() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.ds();
            this.g = this.b.du();
            this.h = this.b.dy();
         }

         this.i = (double)this.b.dF();
         this.j = (double)this.b.dD();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.ds();
      this.g = this.b.du();
      this.h = this.b.dy();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.N().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.I().a(this.b, (float)(this.a.ab() + 20), (float)this.a.aa());
      if (this.a.f(this.b) < 6.25) {
         this.a.N().n();
      } else {
         this.a.N().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
