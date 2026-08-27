import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzo extends bza implements bjv {
   public static final float b = 45.836624F;
   public static final int c = arp.f((float) (Math.PI * 5.0 / 4.0));
   protected static final adz<Byte> d = aec.a(bzo.class, aeb.a);
   private static final int e = 1;
   @Nullable
   bja bT;
   @Nullable
   private gu bU;
   private boolean bV;
   private int bW;

   public bzo(bim<? extends bzo> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new bzo.c(this);
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
   public void a(bje $$0, ehd $$1) {
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
      this.bO.a(0, new bpn(this));
      this.bO.a(4, new bzo.a());
      this.bO.a(8, new bzo.d());
      this.bO.a(9, new bqb(this, cbm.class, 3.0F, 1.0F));
      this.bO.a(10, new bqb(this, bja.class, 8.0F));
      this.bP.a(1, new brl(this, ccu.class).a());
      this.bP.a(2, new bzo.b(this));
      this.bP.a(3, new brm<>(this, cbm.class, true));
   }

   public static bkd.a p() {
      return bza.gg().a(bke.a, 14.0).a(bke.f, 4.0);
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

   public boolean ga() {
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
      return aow.yD;
   }

   @Override
   protected aov h_() {
      return aow.yF;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.yG;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new cix(cja.om));
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

   class a extends bpt {
      public a() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         biy $$0 = bzo.this.j();
         return $$0 != null && $$0.bv() && !bzo.this.E().b() && bzo.this.ag.a(b(7)) == 0 ? bzo.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bzo.this.E().b() && bzo.this.ga() && bzo.this.j() != null && bzo.this.j().bv();
      }

      @Override
      public void c() {
         biy $$0 = bzo.this.j();
         if ($$0 != null) {
            ehd $$1 = $$0.bp();
            bzo.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bzo.this.w(true);
         bzo.this.a(aow.yE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bzo.this.w(false);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         biy $$0 = bzo.this.j();
         if ($$0 != null) {
            if (bzo.this.cG().c($$0.cG())) {
               bzo.this.C($$0);
               bzo.this.w(false);
            } else {
               double $$1 = bzo.this.f($$0);
               if ($$1 < 9.0) {
                  ehd $$2 = $$0.bp();
                  bzo.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends brt {
      private final btk b = btk.b().d().e();

      public b(bjh $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bzo.this.bT != null && bzo.this.bT.j() != null && this.a(bzo.this.bT.j(), this.b);
      }

      @Override
      public void c() {
         bzo.this.h(bzo.this.bT.j());
         super.c();
      }
   }

   class c extends bow {
      public c(bzo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bow.a.b) {
            ehd $$0 = new ehd(this.e - bzo.this.dp(), this.f - bzo.this.dr(), this.g - bzo.this.dv());
            double $$1 = $$0.f();
            if ($$1 < bzo.this.cG().a()) {
               this.k = bow.a.a;
               bzo.this.f(bzo.this.dn().a(0.5));
            } else {
               bzo.this.f(bzo.this.dn().e($$0.a(this.h * 0.05 / $$1)));
               if (bzo.this.j() == null) {
                  ehd $$2 = bzo.this.dn();
                  bzo.this.r(-((float)arp.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bzo.this.aU = bzo.this.dA();
               } else {
                  double $$3 = bzo.this.j().dp() - bzo.this.dp();
                  double $$4 = bzo.this.j().dv() - bzo.this.dv();
                  bzo.this.r(-((float)arp.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bzo.this.aU = bzo.this.dA();
               }
            }
         }
      }
   }

   class d extends bpt {
      public d() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         return !bzo.this.E().b() && bzo.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gu $$0 = bzo.this.t();
         if ($$0 == null) {
            $$0 = bzo.this.dk();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gu $$2 = $$0.b(bzo.this.ag.a(15) - 7, bzo.this.ag.a(11) - 5, bzo.this.ag.a(15) - 7);
            if (bzo.this.dK().t($$2)) {
               bzo.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bzo.this.j() == null) {
                  bzo.this.D().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
