import java.util.EnumSet;
import javax.annotation.Nullable;

public class btb extends brt {
   private static final bvk c = bvk.b().a(10.0).d();
   private final bvk d;
   protected final blh a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cdm b;
   private int k;
   private boolean l;
   private final coc m;
   private final boolean n;

   public btb(blh $$0, double $$1, coc $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(brt.a.a, brt.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dL().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(bky $$0) {
      return this.m.a($$0.eS()) || this.m.a($$0.eT());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.f(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dD() - this.i) > 5.0 || Math.abs((double)this.b.dB() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dq();
            this.g = this.b.ds();
            this.h = this.b.dw();
         }

         this.i = (double)this.b.dD();
         this.j = (double)this.b.dB();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.dq();
      this.g = this.b.ds();
      this.h = this.b.dw();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.L().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.G().a(this.b, (float)(this.a.Z() + 20), (float)this.a.Y());
      if (this.a.f(this.b) < 6.25) {
         this.a.L().n();
      } else {
         this.a.L().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
