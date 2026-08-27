import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccn extends cbz implements bms {
   public static final float b = 45.836624F;
   public static final int c = aty.f((float) (Math.PI * 5.0 / 4.0));
   protected static final afz<Byte> d = agc.a(ccn.class, agb.a);
   private static final int e = 1;
   @Nullable
   blx bT;
   @Nullable
   private hv bU;
   private boolean bV;
   private int bW;

   public ccn(blj<? extends ccn> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new ccn.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bmb $$0, elb $$1) {
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
      this.bO.a(0, new bsl(this));
      this.bO.a(4, new ccn.a());
      this.bO.a(8, new ccn.d());
      this.bO.a(9, new bsz(this, cer.class, 3.0F, 1.0F));
      this.bO.a(10, new bsz(this, blx.class, 8.0F));
      this.bP.a(1, new buj(this, cga.class).a());
      this.bP.a(2, new ccn.b(this));
      this.bP.a(3, new buk<>(this, cer.class, true));
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 14.0).a(bnb.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new hv($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(blf $$0) {
      super.w($$0);
      if ($$0 instanceof ccn $$1) {
         this.bT = $$1.A();
      }
   }

   @Override
   public void b(sj $$0) {
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
   public blx A() {
      return this.bT;
   }

   @Nullable
   public hv ge() {
      return this.bU;
   }

   public void i(@Nullable hv $$0) {
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

   public void a(blx $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected arb y() {
      return arc.zD;
   }

   @Override
   protected arb n_() {
      return arc.zF;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.zG;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      this.a(blk.a, new cmh(cmk.oX));
      this.a(blk.a, 0.0F);
   }

   @Override
   protected float l(blf $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bsr {
      public a() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         blv $$0 = ccn.this.q();
         return $$0 != null && $$0.bx() && !ccn.this.K().b() && ccn.this.ag.a(b(7)) == 0 ? ccn.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ccn.this.K().b() && ccn.this.gf() && ccn.this.q() != null && ccn.this.q().bx();
      }

      @Override
      public void c() {
         blv $$0 = ccn.this.q();
         if ($$0 != null) {
            elb $$1 = $$0.br();
            ccn.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ccn.this.w(true);
         ccn.this.a(arc.zE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ccn.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         blv $$0 = ccn.this.q();
         if ($$0 != null) {
            if (ccn.this.cH().c($$0.cH())) {
               ccn.this.C($$0);
               ccn.this.w(false);
            } else {
               double $$1 = ccn.this.f($$0);
               if ($$1 < 9.0) {
                  elb $$2 = $$0.br();
                  ccn.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bur {
      private final bwj b = bwj.b().d().e();

      public b(bme $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ccn.this.bT != null && ccn.this.bT.q() != null && this.a(ccn.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         ccn.this.h(ccn.this.bT.q());
         super.c();
      }
   }

   class c extends bru {
      public c(ccn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bru.a.b) {
            elb $$0 = new elb(this.e - ccn.this.dr(), this.f - ccn.this.dt(), this.g - ccn.this.dx());
            double $$1 = $$0.f();
            if ($$1 < ccn.this.cH().a()) {
               this.k = bru.a.a;
               ccn.this.g(ccn.this.dp().a(0.5));
            } else {
               ccn.this.g(ccn.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (ccn.this.q() == null) {
                  elb $$2 = ccn.this.dp();
                  ccn.this.r(-((float)aty.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ccn.this.aU = ccn.this.dC();
               } else {
                  double $$3 = ccn.this.q().dr() - ccn.this.dr();
                  double $$4 = ccn.this.q().dx() - ccn.this.dx();
                  ccn.this.r(-((float)aty.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ccn.this.aU = ccn.this.dC();
               }
            }
         }
      }
   }

   class d extends bsr {
      public d() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         return !ccn.this.K().b() && ccn.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hv $$0 = ccn.this.ge();
         if ($$0 == null) {
            $$0 = ccn.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hv $$2 = $$0.b(ccn.this.ag.a(15) - 7, ccn.this.ag.a(11) - 5, ccn.this.ag.a(15) - 7);
            if (ccn.this.dM().t($$2)) {
               ccn.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ccn.this.q() == null) {
                  ccn.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
