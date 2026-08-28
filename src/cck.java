import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cck extends cbc {
   private static final cev c = cev.b().d();
   private final cev d;
   protected final bun a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cnp b;
   private int k;
   private boolean l;
   private final Predicate<cvl> m;
   private final boolean n;

   public cck(bun $$0, double $$1, Predicate<cvl> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dS().a(this.d.a(this.a.h(bvm.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(buf $$0) {
      return this.m.test($$0.eW()) || this.m.test($$0.eX());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dK() - this.i) > 5.0 || Math.abs((double)this.b.dI() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dx();
            this.g = this.b.dz();
            this.h = this.b.dD();
         }

         this.i = (double)this.b.dK();
         this.j = (double)this.b.dI();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dx();
      this.g = this.b.dz();
      this.h = this.b.dD();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.P().o();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.K().a(this.b, (float)(this.a.ag() + 20), (float)this.a.ae());
      if (this.a.g(this.b) < 6.25) {
         this.a.P().o();
      } else {
         this.a.P().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
