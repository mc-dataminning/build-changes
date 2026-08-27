import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzp extends bzb implements bjw {
   public static final float b = 45.836624F;
   public static final int c = arp.f((float) (Math.PI * 5.0 / 4.0));
   protected static final adz<Byte> d = aec.a(bzp.class, aeb.a);
   private static final int e = 1;
   @Nullable
   bja bT;
   @Nullable
   private gu bU;
   private boolean bV;
   private int bW;

   public bzp(bim<? extends bzp> $$0, cpm $$1) {
      super($$0, $$1);
      this.bL = new bzp.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bje $$0, ehe $$1) {
      super.a($$0, $$1);
      this.aO();
   }

   @Override
   public void l() {
      this.af = true;
      super.l();
      this.af = false;
      this.e(true);
      if (this.bV && --this.bW <= 0) {
         this.bW = 20;
         this.a(this.dL().i(), 1.0F);
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpo(this));
      this.bO.a(4, new bzp.a());
      this.bO.a(8, new bzp.d());
      this.bO.a(9, new bqc(this, cbn.class, 3.0F, 1.0F));
      this.bO.a(10, new bqc(this, bja.class, 8.0F));
      this.bP.a(1, new brm(this, ccv.class).a());
      this.bP.a(2, new bzp.b(this));
      this.bP.a(3, new brn<>(this, cbn.class, true));
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.a, 14.0).a(bkf.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new gu($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.bU != null) {
         $$0.a("BoundX", this.bU.u());
         $$0.a("BoundY", this.bU.v());
         $$0.a("BoundZ", this.bU.w());
      }

      if (this.bV) {
         $$0.a("LifeTicks", this.bW);
      }
   }

   @Nullable
   public bja q() {
      return this.bT;
   }

   @Nullable
   public gu t() {
      return this.bU;
   }

   public void i(@Nullable gu $$0) {
      this.bU = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.an.b(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.an.b(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.an.b(d, (byte)($$2 & 0xFF));
   }

   public boolean fZ() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bja $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected aov r() {
      return aow.yy;
   }

   @Override
   protected aov h_() {
      return aow.yA;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.yB;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new ciy(cjb.om));
      this.a(bin.a, 0.0F);
   }

   @Override
   protected float l(bii $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bpu {
      public a() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         biy $$0 = bzp.this.j();
         return $$0 != null && $$0.bv() && !bzp.this.E().b() && bzp.this.ag.a(b(7)) == 0 ? bzp.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bzp.this.E().b() && bzp.this.fZ() && bzp.this.j() != null && bzp.this.j().bv();
      }

      @Override
      public void c() {
         biy $$0 = bzp.this.j();
         if ($$0 != null) {
            ehe $$1 = $$0.bp();
            bzp.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bzp.this.w(true);
         bzp.this.a(aow.yz, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bzp.this.w(false);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         biy $$0 = bzp.this.j();
         if ($$0 != null) {
            if (bzp.this.cG().c($$0.cG())) {
               bzp.this.C($$0);
               bzp.this.w(false);
            } else {
               double $$1 = bzp.this.f($$0);
               if ($$1 < 9.0) {
                  ehe $$2 = $$0.bp();
                  bzp.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bru {
      private final btl b = btl.b().d().e();

      public b(bjh $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bzp.this.bT != null && bzp.this.bT.j() != null && this.a(bzp.this.bT.j(), this.b);
      }

      @Override
      public void c() {
         bzp.this.h(bzp.this.bT.j());
         super.c();
      }
   }

   class c extends box {
      public c(bzp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == box.a.b) {
            ehe $$0 = new ehe(this.e - bzp.this.dp(), this.f - bzp.this.dr(), this.g - bzp.this.dv());
            double $$1 = $$0.f();
            if ($$1 < bzp.this.cG().a()) {
               this.k = box.a.a;
               bzp.this.f(bzp.this.dn().a(0.5));
            } else {
               bzp.this.f(bzp.this.dn().e($$0.a(this.h * 0.05 / $$1)));
               if (bzp.this.j() == null) {
                  ehe $$2 = bzp.this.dn();
                  bzp.this.r(-((float)arp.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bzp.this.aU = bzp.this.dA();
               } else {
                  double $$3 = bzp.this.j().dp() - bzp.this.dp();
                  double $$4 = bzp.this.j().dv() - bzp.this.dv();
                  bzp.this.r(-((float)arp.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bzp.this.aU = bzp.this.dA();
               }
            }
         }
      }
   }

   class d extends bpu {
      public d() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         return !bzp.this.E().b() && bzp.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gu $$0 = bzp.this.t();
         if ($$0 == null) {
            $$0 = bzp.this.dk();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gu $$2 = $$0.b(bzp.this.ag.a(15) - 7, bzp.this.ag.a(11) - 5, bzp.this.ag.a(15) - 7);
            if (bzp.this.dK().t($$2)) {
               bzp.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bzp.this.j() == null) {
                  bzp.this.D().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
