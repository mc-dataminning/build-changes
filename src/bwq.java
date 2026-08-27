import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwq extends bwc implements bgx {
   public static final float b = 45.836624F;
   public static final int c = apa.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aby<Byte> d = acb.a(bwq.class, aca.a);
   private static final int e = 1;
   private static final double bT = 0.4;
   @Nullable
   bgb bU;
   @Nullable
   private gu bV;
   private boolean bW;
   private int bX;

   public bwq(bfn<? extends bwq> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new bwq.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aP() {
      return this.ag % c == 0;
   }

   @Override
   public void a(bgf $$0, eei $$1) {
      super.a($$0, $$1);
      this.aM();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.e(true);
      if (this.bW && --this.bX <= 0) {
         this.bX = 20;
         this.a(this.dJ().i(), 1.0F);
      }
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(0, new bmp(this));
      this.bO.a(4, new bwq.a());
      this.bO.a(8, new bwq.d());
      this.bO.a(9, new bnd(this, byo.class, 3.0F, 1.0F));
      this.bO.a(10, new bnd(this, bgb.class, 8.0F));
      this.bP.a(1, new bon(this, bzw.class).a());
      this.bP.a(2, new bwq.b(this));
      this.bP.a(3, new boo<>(this, byo.class, true));
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.a, 14.0).a(bhg.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(d, (byte)0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bV = new gu($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.bV != null) {
         $$0.a("BoundX", this.bV.u());
         $$0.a("BoundY", this.bV.v());
         $$0.a("BoundZ", this.bV.w());
      }

      if (this.bW) {
         $$0.a("LifeTicks", this.bX);
      }
   }

   @Nullable
   public bgb r() {
      return this.bU;
   }

   @Nullable
   public gu w() {
      return this.bV;
   }

   public void i(@Nullable gu $$0) {
      this.bV = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.am.b(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.am.b(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.b(d, (byte)($$2 & 0xFF));
   }

   public boolean fY() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bgb $$0) {
      this.bU = $$0;
   }

   public void b(int $$0) {
      this.bW = true;
      this.bX = $$0;
   }

   @Override
   protected amg s() {
      return amh.yx;
   }

   @Override
   protected amg g_() {
      return amh.yz;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.yA;
   }

   @Override
   public float bj() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      this.a(bfo.a, new cfz(cgc.om));
      this.a(bfo.a, 0.0F);
   }

   @Override
   public double bw() {
      return 0.4;
   }

   class a extends bmv {
      public a() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         bfz $$0 = bwq.this.j();
         return $$0 != null && $$0.bs() && !bwq.this.G().b() && bwq.this.af.a(b(7)) == 0 ? bwq.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bwq.this.G().b() && bwq.this.fY() && bwq.this.j() != null && bwq.this.j().bs();
      }

      @Override
      public void c() {
         bfz $$0 = bwq.this.j();
         if ($$0 != null) {
            eei $$1 = $$0.bm();
            bwq.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bwq.this.w(true);
         bwq.this.a(amh.yy, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bwq.this.w(false);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         bfz $$0 = bwq.this.j();
         if ($$0 != null) {
            if (bwq.this.cE().c($$0.cE())) {
               bwq.this.z($$0);
               bwq.this.w(false);
            } else {
               double $$1 = bwq.this.f($$0);
               if ($$1 < 9.0) {
                  eei $$2 = $$0.bm();
                  bwq.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bov {
      private final bqm b = bqm.b().d().e();

      public b(bgi $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bwq.this.bU != null && bwq.this.bU.j() != null && this.a(bwq.this.bU.j(), this.b);
      }

      @Override
      public void c() {
         bwq.this.h(bwq.this.bU.j());
         super.c();
      }
   }

   class c extends bly {
      public c(bwq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bly.a.b) {
            eei $$0 = new eei(this.e - bwq.this.dn(), this.f - bwq.this.dp(), this.g - bwq.this.dt());
            double $$1 = $$0.f();
            if ($$1 < bwq.this.cE().a()) {
               this.k = bly.a.a;
               bwq.this.f(bwq.this.dl().a(0.5));
            } else {
               bwq.this.f(bwq.this.dl().e($$0.a(this.h * 0.05 / $$1)));
               if (bwq.this.j() == null) {
                  eei $$2 = bwq.this.dl();
                  bwq.this.a_(-((float)apa.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bwq.this.aV = bwq.this.dy();
               } else {
                  double $$3 = bwq.this.j().dn() - bwq.this.dn();
                  double $$4 = bwq.this.j().dt() - bwq.this.dt();
                  bwq.this.a_(-((float)apa.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bwq.this.aV = bwq.this.dy();
               }
            }
         }
      }
   }

   class d extends bmv {
      public d() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         return !bwq.this.G().b() && bwq.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gu $$0 = bwq.this.w();
         if ($$0 == null) {
            $$0 = bwq.this.di();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gu $$2 = $$0.b(bwq.this.af.a(15) - 7, bwq.this.af.a(11) - 5, bwq.this.af.a(15) - 7);
            if (bwq.this.dI().t($$2)) {
               bwq.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bwq.this.j() == null) {
                  bwq.this.E().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
