import java.util.EnumSet;

public abstract class bso extends bsb {
   private static final int g = 1200;
   private static final int h = 1200;
   private static final int i = 200;
   protected final blp a;
   public final double b;
   protected int c;
   protected int d;
   private int j;
   protected ht e = ht.b;
   private boolean k;
   private final int l;
   private final int m;
   protected int f;

   public bso(blp $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, 1);
   }

   public bso(blp $$0, double $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.l = $$2;
      this.f = 0;
      this.m = $$3;
      this.a(EnumSet.of(bsb.a.a, bsb.a.c));
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

   protected int a(blp $$0) {
      return b(200 + $$0.eh().a(200));
   }

   @Override
   public boolean b() {
      return this.d >= -this.j && this.d <= 1200 && this.a(this.a.dN(), this.e);
   }

   @Override
   public void c() {
      this.h();
      this.d = 0;
      this.j = this.a.eh().a(this.a.eh().a(1200) + 1200) + 1200;
   }

   protected void h() {
      this.a.N().a((double)((float)this.e.u()) + 0.5, (double)(this.e.v() + 1), (double)((float)this.e.w()) + 0.5, this.b);
   }

   public double i() {
      return 1.0;
   }

   protected ht k() {
      return this.e.c();
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      ht $$0 = this.k();
      if (!$$0.a(this.a.dl(), this.i())) {
         this.k = false;
         this.d++;
         if (this.l()) {
            this.a.N().a((double)((float)$$0.u()) + 0.5, (double)$$0.v(), (double)((float)$$0.w()) + 0.5, this.b);
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
      ht $$2 = this.a.dn();
      ht.a $$3 = new ht.a();

      for (int $$4 = this.f; $$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
               for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                  $$3.a($$2, $$6, $$4 - 1, $$7);
                  if (this.a.a($$3) && this.a(this.a.dN(), $$3)) {
                     this.e = $$3;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   protected abstract boolean a(csd var1, ht var2);
}
