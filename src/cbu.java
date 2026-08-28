import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbu extends cam {
   private static final cef c = cef.b().a(10.0).d();
   private final cef d;
   protected final btw a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cmx b;
   private int k;
   private boolean l;
   private final Predicate<cuq> m;
   private final boolean n;

   public cbu(btw $$0, double $$1, Predicate<cuq> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dP().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(btn $$0) {
      return this.m.test($$0.eU()) || this.m.test($$0.eV());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dH() - this.i) > 5.0 || Math.abs((double)this.b.dF() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.du();
            this.g = this.b.dw();
            this.h = this.b.dA();
         }

         this.i = (double)this.b.dH();
         this.j = (double)this.b.dF();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.du();
      this.g = this.b.dw();
      this.h = this.b.dA();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.N().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.I().a(this.b, (float)(this.a.ae() + 20), (float)this.a.ac());
      if (this.a.g(this.b) < 6.25) {
         this.a.N().n();
      } else {
         this.a.N().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
