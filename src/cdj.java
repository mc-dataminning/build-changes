import java.util.EnumSet;

public abstract class cdj extends ccw {
   private static final int g = 1200;
   private static final int h = 1200;
   private static final int i = 200;
   protected final bwg a;
   public final double b;
   protected int c;
   protected int d;
   private int j;
   protected ji e = ji.c;
   private boolean k;
   private final int l;
   private final int m;
   protected int f;

   public cdj(bwg $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, 1);
   }

   public cdj(bwg $$0, double $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.l = $$2;
      this.f = 0;
      this.m = $$3;
      this.a(EnumSet.of(ccw.a.a, ccw.a.c));
   }

   @Override
   public boolean b() {
      if (this.c > 0) {
         this.c--;
         return false;
      } else {
         this.c = this.a(this.a);
         return this.n();
      }
   }

   protected int a(bwg $$0) {
      return b(200 + $$0.dX().a(200));
   }

   @Override
   public boolean c() {
      return this.d >= -this.j && this.d <= 1200 && this.a(this.a.dU(), this.e);
   }

   @Override
   public void d() {
      this.h();
      this.d = 0;
      this.j = this.a.dX().a(this.a.dX().a(1200) + 1200) + 1200;
   }

   protected void h() {
      this.a.O().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, this.b);
   }

   public double i() {
      return 1.0;
   }

   protected ji k() {
      return this.e.d();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      ji $$0 = this.k();
      if (!$$0.a(this.a.ds(), this.i())) {
         this.k = false;
         this.d++;
         if (this.l()) {
            this.a.O().a((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, this.b);
         }
      } else {
         this.k = true;
         this.d--;
      }
   }

   public boolean l() {
      return this.d % 40 == 0;
   }

   protected boolean m() {
      return this.k;
   }

   protected boolean n() {
      int $$0 = this.l;
      int $$1 = this.m;
      ji $$2 = this.a.du();
      ji.a $$3 = new ji.a();

      for (int $$4 = this.f; $$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
               for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                  $$3.a($$2, $$6, $$4 - 1, $$7);
                  if (this.a.a($$3) && this.a(this.a.dU(), $$3)) {
                     this.e = $$3;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   protected abstract boolean a(dhc var1, ji var2);
}
