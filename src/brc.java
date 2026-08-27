import java.util.EnumSet;

public class brc extends bre {
   public static final int a = 12;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 1;
   private final ble e;
   private bkj f;
   private final crc g;
   private final double h;
   private final bts i;
   private int j;
   private final float k;
   private final float l;
   private float m;
   private final boolean n;

   public brc(ble $$0, double $$1, float $$2, float $$3, boolean $$4) {
      this.e = $$0;
      this.g = $$0.dL();
      this.h = $$1;
      this.i = $$0.L();
      this.l = $$2;
      this.k = $$3;
      this.n = $$4;
      this.a(EnumSet.of(bre.a.a, bre.a.b));
      if (!($$0.L() instanceof btr) && !($$0.L() instanceof btq)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean a() {
      bkj $$0 = this.e.P_();
      if ($$0 == null) {
         return false;
      } else if ($$0.N_()) {
         return false;
      } else if (this.h()) {
         return false;
      } else if (this.e.f($$0) < (double)(this.l * this.l)) {
         return false;
      } else {
         this.f = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (this.i.l()) {
         return false;
      } else {
         return this.h() ? false : !(this.e.f(this.f) <= (double)(this.k * this.k));
      }
   }

   private boolean h() {
      return this.e.ge() || this.e.bN() || this.e.fS();
   }

   @Override
   public void c() {
      this.j = 0;
      this.m = this.e.a(ebp.j);
      this.e.a(ebp.j, 0.0F);
   }

   @Override
   public void d() {
      this.f = null;
      this.i.n();
      this.e.a(ebp.j, this.m);
   }

   @Override
   public void e() {
      this.e.G().a(this.f, 10.0F, (float)this.e.Y());
      if (--this.j <= 0) {
         this.j = this.a(10);
         if (this.e.f(this.f) >= 144.0) {
            this.i();
         } else {
            this.i.a(this.f, this.h);
         }
      }
   }

   private void i() {
      ht $$0 = this.f.dl();

      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.a(-3, 3);
         int $$3 = this.a(-1, 1);
         int $$4 = this.a(-3, 3);
         boolean $$5 = this.a($$0.u() + $$2, $$0.v() + $$3, $$0.w() + $$4);
         if ($$5) {
            return;
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (Math.abs((double)$$0 - this.f.dq()) < 2.0 && Math.abs((double)$$2 - this.f.dw()) < 2.0) {
         return false;
      } else if (!this.a(new ht($$0, $$1, $$2))) {
         return false;
      } else {
         this.e.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.e.dB(), this.e.dD());
         this.i.n();
         return true;
      }
   }

   private boolean a(ht $$0) {
      ebp $$1 = eby.a(this.g, $$0.j());
      if ($$1 != ebp.c) {
         return false;
      } else {
         dgb $$2 = this.g.a_($$0.d());
         if (!this.n && $$2.b() instanceof cyi) {
            return false;
         } else {
            ht $$3 = $$0.b(this.e.dl());
            return this.g.a(this.e, this.e.cG().a($$3));
         }
      }
   }

   private int a(int $$0, int $$1) {
      return this.e.ef().a($$1 - $$0 + 1) + $$0;
   }
}
