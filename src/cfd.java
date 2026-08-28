import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfd extends cdv {
   private static final cho c = cho.b().d();
   private final cho d;
   protected final bxh a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cqs b;
   private int k;
   private boolean l;
   private final Predicate<cys> m;
   private final boolean n;

   public cfd(bxh $$0, double $$1, Predicate<cys> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      this.d = c.c().a(($$0x, $$1x) -> this.a($$0x));
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = a(this.a).a(this.d.a(this.a.h(byf.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(bwz $$0) {
      return this.m.test($$0.fa()) || this.m.test($$0.fb());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dN() - this.i) > 5.0 || Math.abs((double)this.b.dL() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dA();
            this.g = this.b.dC();
            this.h = this.b.dG();
         }

         this.i = (double)this.b.dN();
         this.j = (double)this.b.dL();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dA();
      this.g = this.b.dC();
      this.h = this.b.dG();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.O().m();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.J().a(this.b, (float)(this.a.ad() + 20), (float)this.a.ac());
      if (this.a.g(this.b) < 6.25) {
         this.a.O().m();
      } else {
         this.a.O().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
