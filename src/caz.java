import java.util.EnumSet;

public abstract class caz extends cam {
   private static final int g = 1200;
   private static final int h = 1200;
   private static final int i = 200;
   protected final btx a;
   public final double b;
   protected int c;
   protected int d;
   private int j;
   protected iz e = iz.c;
   private boolean k;
   private final int l;
   private final int m;
   protected int f;

   public caz(btx $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, 1);
   }

   public caz(btx $$0, double $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.l = $$2;
      this.f = 0;
      this.m = $$3;
      this.a(EnumSet.of(cam.a.a, cam.a.c));
   }

   @Override
   public boolean a() {
      if (this.c > 0) {
         this.c--;
         return false;
      } else {
         this.c = this.a(this.a);
         return this.n();
      }
   }

   protected int a(btx $$0) {
      return b(200 + $$0.el().a(200));
   }

   @Override
   public boolean b() {
      return this.d >= -this.j && this.d <= 1200 && this.a(this.a.dP(), this.e);
   }

   @Override
   public void c() {
      this.h();
      this.d = 0;
      this.j = this.a.el().a(this.a.el().a(1200) + 1200) + 1200;
   }

   protected void h() {
      this.a.K().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, this.b);
   }

   public double i() {
      return 1.0;
   }

   protected iz k() {
      return this.e.c();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      iz $$0 = this.k();
      if (!$$0.a(this.a.dn(), this.i())) {
         this.k = false;
         this.d++;
         if (this.l()) {
            this.a.K().a((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, this.b);
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
      iz $$2 = this.a.dp();
      iz.a $$3 = new iz.a();

      for (int $$4 = this.f; $$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
               for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                  $$3.a($$2, $$6, $$4 - 1, $$7);
                  if (this.a.a($$3) && this.a(this.a.dP(), $$3)) {
                     this.e = $$3;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   protected abstract boolean a(dca var1, iz var2);
}
