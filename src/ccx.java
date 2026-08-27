import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccx extends ccj implements bnc {
   public static final float b = 45.836624F;
   public static final int c = aui.f((float) (Math.PI * 5.0 / 4.0));
   protected static final agj<Byte> d = agm.a(ccx.class, agl.a);
   private static final int e = 1;
   @Nullable
   bmh bT;
   @Nullable
   private hx bU;
   private boolean bV;
   private int bW;

   public ccx(blt<? extends ccx> $$0, cti $$1) {
      super($$0, $$1);
      this.bL = new ccx.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bml $$0, elm $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.af = true;
      super.l();
      this.af = false;
      this.e(true);
      if (this.bV && --this.bW <= 0) {
         this.bW = 20;
         this.a(this.dN().i(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsv(this));
      this.bO.a(4, new ccx.a());
      this.bO.a(8, new ccx.d());
      this.bO.a(9, new btj(this, cfb.class, 3.0F, 1.0F));
      this.bO.a(10, new btj(this, bmh.class, 8.0F));
      this.bP.a(1, new but(this, cgk.class).a());
      this.bP.a(2, new ccx.b(this));
      this.bP.a(3, new buu<>(this, cfb.class, true));
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 14.0).a(bnl.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new hx($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(blp $$0) {
      super.w($$0);
      if ($$0 instanceof ccx $$1) {
         this.bT = $$1.A();
      }
   }

   @Override
   public void b(sl $$0) {
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
   public bmh A() {
      return this.bT;
   }

   @Nullable
   public hx ge() {
      return this.bU;
   }

   public void i(@Nullable hx $$0) {
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

   public boolean gf() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bmh $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected arl y() {
      return arm.zD;
   }

   @Override
   protected arl n_() {
      return arm.zF;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.zG;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      this.a(blu.a, new cmr(cmu.oX));
      this.a(blu.a, 0.0F);
   }

   @Override
   protected float l(blp $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends btb {
      public a() {
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         bmf $$0 = ccx.this.q();
         return $$0 != null && $$0.bx() && !ccx.this.K().b() && ccx.this.ag.a(b(7)) == 0 ? ccx.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ccx.this.K().b() && ccx.this.gf() && ccx.this.q() != null && ccx.this.q().bx();
      }

      @Override
      public void c() {
         bmf $$0 = ccx.this.q();
         if ($$0 != null) {
            elm $$1 = $$0.br();
            ccx.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ccx.this.w(true);
         ccx.this.a(arm.zE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ccx.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmf $$0 = ccx.this.q();
         if ($$0 != null) {
            if (ccx.this.cH().c($$0.cH())) {
               ccx.this.C($$0);
               ccx.this.w(false);
            } else {
               double $$1 = ccx.this.f($$0);
               if ($$1 < 9.0) {
                  elm $$2 = $$0.br();
                  ccx.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bvb {
      private final bwt b = bwt.b().d().e();

      public b(bmo $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ccx.this.bT != null && ccx.this.bT.q() != null && this.a(ccx.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         ccx.this.h(ccx.this.bT.q());
         super.c();
      }
   }

   class c extends bse {
      public c(ccx $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bse.a.b) {
            elm $$0 = new elm(this.e - ccx.this.dr(), this.f - ccx.this.dt(), this.g - ccx.this.dx());
            double $$1 = $$0.f();
            if ($$1 < ccx.this.cH().a()) {
               this.k = bse.a.a;
               ccx.this.g(ccx.this.dp().a(0.5));
            } else {
               ccx.this.g(ccx.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (ccx.this.q() == null) {
                  elm $$2 = ccx.this.dp();
                  ccx.this.r(-((float)aui.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ccx.this.aU = ccx.this.dC();
               } else {
                  double $$3 = ccx.this.q().dr() - ccx.this.dr();
                  double $$4 = ccx.this.q().dx() - ccx.this.dx();
                  ccx.this.r(-((float)aui.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ccx.this.aU = ccx.this.dC();
               }
            }
         }
      }
   }

   class d extends btb {
      public d() {
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         return !ccx.this.K().b() && ccx.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hx $$0 = ccx.this.ge();
         if ($$0 == null) {
            $$0 = ccx.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hx $$2 = $$0.b(ccx.this.ag.a(15) - 7, ccx.this.ag.a(11) - 5, ccx.this.ag.a(15) - 7);
            if (ccx.this.dM().u($$2)) {
               ccx.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ccx.this.q() == null) {
                  ccx.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
