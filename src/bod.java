import java.util.EnumSet;
import javax.annotation.Nullable;

public class bod extends bmv {
   private static final bqm c = bqm.b().a(10.0).d();
   private final bqm d;
   protected final bgi a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected byo b;
   private int k;
   private boolean l;
   private final ciz m;
   private final boolean n;

   public bod(bgi $$0, double $$1, ciz $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dI().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(bfz $$0) {
      return this.m.a($$0.eO()) || this.m.a($$0.eP());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.f(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dA() - this.i) > 5.0 || Math.abs((double)this.b.dy() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dn();
            this.g = this.b.dp();
            this.h = this.b.dt();
         }

         this.i = (double)this.b.dA();
         this.j = (double)this.b.dy();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.dn();
      this.g = this.b.dp();
      this.h = this.b.dt();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.J().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.E().a(this.b, (float)(this.a.fC() + 20), (float)this.a.X());
      if (this.a.f(this.b) < 6.25) {
         this.a.J().n();
      } else {
         this.a.J().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
