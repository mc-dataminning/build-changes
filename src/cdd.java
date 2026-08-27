import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdd extends ccp implements bni {
   public static final float b = 45.836624F;
   public static final int c = auo.f((float) (Math.PI * 5.0 / 4.0));
   protected static final agm<Byte> d = agp.a(cdd.class, ago.a);
   private static final int e = 1;
   @Nullable
   bmn bT;
   @Nullable
   private hx bU;
   private boolean bV;
   private int bW;

   public cdd(blz<? extends cdd> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new cdd.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bmr $$0, elt $$1) {
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
      this.bO.a(0, new btb(this));
      this.bO.a(4, new cdd.a());
      this.bO.a(8, new cdd.d());
      this.bO.a(9, new btp(this, cfi.class, 3.0F, 1.0F));
      this.bO.a(10, new btp(this, bmn.class, 8.0F));
      this.bP.a(1, new buz(this, cgr.class).a());
      this.bP.a(2, new cdd.b(this));
      this.bP.a(3, new bva<>(this, cfi.class, true));
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.l, 14.0).a(bnr.c, 4.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, (byte)0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bU = new hx($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(blv $$0) {
      super.w($$0);
      if ($$0 instanceof cdd $$1) {
         this.bT = $$1.A();
      }
   }

   @Override
   public void b(sn $$0) {
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
   public bmn A() {
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

   public void a(bmn $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected arr y() {
      return ars.zD;
   }

   @Override
   protected arr n_() {
      return ars.zF;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.zG;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      this.a(bma.a, new cmy(cnb.oX));
      this.a(bma.a, 0.0F);
   }

   @Override
   protected float l(blv $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends bth {
      public a() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean a() {
         bml $$0 = cdd.this.q();
         return $$0 != null && $$0.bx() && !cdd.this.K().b() && cdd.this.ag.a(b(7)) == 0 ? cdd.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cdd.this.K().b() && cdd.this.gf() && cdd.this.q() != null && cdd.this.q().bx();
      }

      @Override
      public void c() {
         bml $$0 = cdd.this.q();
         if ($$0 != null) {
            elt $$1 = $$0.br();
            cdd.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cdd.this.w(true);
         cdd.this.a(ars.zE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cdd.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bml $$0 = cdd.this.q();
         if ($$0 != null) {
            if (cdd.this.cH().c($$0.cH())) {
               cdd.this.C($$0);
               cdd.this.w(false);
            } else {
               double $$1 = cdd.this.f($$0);
               if ($$1 < 9.0) {
                  elt $$2 = $$0.br();
                  cdd.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bvh {
      private final bwz b = bwz.b().d().e();

      public b(bmu $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cdd.this.bT != null && cdd.this.bT.q() != null && this.a(cdd.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cdd.this.h(cdd.this.bT.q());
         super.c();
      }
   }

   class c extends bsk {
      public c(cdd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bsk.a.b) {
            elt $$0 = new elt(this.e - cdd.this.dr(), this.f - cdd.this.dt(), this.g - cdd.this.dx());
            double $$1 = $$0.f();
            if ($$1 < cdd.this.cH().a()) {
               this.k = bsk.a.a;
               cdd.this.g(cdd.this.dp().a(0.5));
            } else {
               cdd.this.g(cdd.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (cdd.this.q() == null) {
                  elt $$2 = cdd.this.dp();
                  cdd.this.r(-((float)auo.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cdd.this.aU = cdd.this.dC();
               } else {
                  double $$3 = cdd.this.q().dr() - cdd.this.dr();
                  double $$4 = cdd.this.q().dx() - cdd.this.dx();
                  cdd.this.r(-((float)auo.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cdd.this.aU = cdd.this.dC();
               }
            }
         }
      }
   }

   class d extends bth {
      public d() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean a() {
         return !cdd.this.K().b() && cdd.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hx $$0 = cdd.this.ge();
         if ($$0 == null) {
            $$0 = cdd.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hx $$2 = $$0.b(cdd.this.ag.a(15) - 7, cdd.this.ag.a(11) - 5, cdd.this.ag.a(15) - 7);
            if (cdd.this.dM().u($$2)) {
               cdd.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cdd.this.q() == null) {
                  cdd.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
