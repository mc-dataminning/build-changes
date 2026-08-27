import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzw extends bzi implements bkd {
   public static final float b = 45.836624F;
   public static final int c = arw.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aee<Byte> d = aeh.a(bzw.class, aeg.a);
   private static final int e = 1;
   @Nullable
   bji bT;
   @Nullable
   private gw bU;
   private boolean bV;
   private int bW;

   public bzw(biu<? extends bzw> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bzw.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aR() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bjm $$0, ehn $$1) {
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
         this.a(this.dM().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(4, new bzw.a());
      this.bO.a(8, new bzw.d());
      this.bO.a(9, new bqj(this, cbu.class, 3.0F, 1.0F));
      this.bO.a(10, new bqj(this, bji.class, 8.0F));
      this.bP.a(1, new brt(this, cdc.class).a());
      this.bP.a(2, new bzw.b(this));
      this.bP.a(3, new bru<>(this, cbu.class, true));
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 14.0).a(bkm.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new gw($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void b(qw $$0) {
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
   public bji t() {
      return this.bT;
   }

   @Nullable
   public gw y() {
      return this.bU;
   }

   public void i(@Nullable gw $$0) {
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

   public boolean gd() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bji $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected apc w() {
      return apd.yD;
   }

   @Override
   protected apc l_() {
      return apd.yF;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.yG;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      asc $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      this.a(biv.a, new cjf(cji.om));
      this.a(biv.a, 0.0F);
   }

   @Override
   protected float l(biq $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bqb {
      public a() {
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         bjg $$0 = bzw.this.q();
         return $$0 != null && $$0.bv() && !bzw.this.I().b() && bzw.this.ag.a(b(7)) == 0 ? bzw.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return bzw.this.I().b() && bzw.this.gd() && bzw.this.q() != null && bzw.this.q().bv();
      }

      @Override
      public void c() {
         bjg $$0 = bzw.this.q();
         if ($$0 != null) {
            ehn $$1 = $$0.bp();
            bzw.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bzw.this.w(true);
         bzw.this.a(apd.yE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bzw.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bjg $$0 = bzw.this.q();
         if ($$0 != null) {
            if (bzw.this.cG().c($$0.cG())) {
               bzw.this.C($$0);
               bzw.this.w(false);
            } else {
               double $$1 = bzw.this.f($$0);
               if ($$1 < 9.0) {
                  ehn $$2 = $$0.bp();
                  bzw.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bsb {
      private final bts b = bts.b().d().e();

      public b(bjp $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bzw.this.bT != null && bzw.this.bT.q() != null && this.a(bzw.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         bzw.this.h(bzw.this.bT.q());
         super.c();
      }
   }

   class c extends bpe {
      public c(bzw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bpe.a.b) {
            ehn $$0 = new ehn(this.e - bzw.this.dq(), this.f - bzw.this.ds(), this.g - bzw.this.dw());
            double $$1 = $$0.f();
            if ($$1 < bzw.this.cG().a()) {
               this.k = bpe.a.a;
               bzw.this.f(bzw.this.do().a(0.5));
            } else {
               bzw.this.f(bzw.this.do().e($$0.a(this.h * 0.05 / $$1)));
               if (bzw.this.q() == null) {
                  ehn $$2 = bzw.this.do();
                  bzw.this.r(-((float)arw.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  bzw.this.aU = bzw.this.dB();
               } else {
                  double $$3 = bzw.this.q().dq() - bzw.this.dq();
                  double $$4 = bzw.this.q().dw() - bzw.this.dw();
                  bzw.this.r(-((float)arw.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  bzw.this.aU = bzw.this.dB();
               }
            }
         }
      }
   }

   class d extends bqb {
      public d() {
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         return !bzw.this.I().b() && bzw.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gw $$0 = bzw.this.y();
         if ($$0 == null) {
            $$0 = bzw.this.dl();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = $$0.b(bzw.this.ag.a(15) - 7, bzw.this.ag.a(11) - 5, bzw.this.ag.a(15) - 7);
            if (bzw.this.dL().t($$2)) {
               bzw.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bzw.this.q() == null) {
                  bzw.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
