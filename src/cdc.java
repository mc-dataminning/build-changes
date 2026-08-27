import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdc extends cco implements bnh {
   public static final float b = 45.836624F;
   public static final int c = aun.f((float) (Math.PI * 5.0 / 4.0));
   protected static final agm<Byte> d = agp.a(cdc.class, ago.a);
   private static final int e = 1;
   @Nullable
   bmm bT;
   @Nullable
   private hx bU;
   private boolean bV;
   private int bW;

   public cdc(bly<? extends cdc> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new cdc.c(this);
      this.bJ = 3;
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return $$1.b - 0.28125F;
   }

   @Override
   public boolean aT() {
      return this.ah % c == 0;
   }

   @Override
   public void a(bmq $$0, els $$1) {
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
      this.bO.a(0, new bta(this));
      this.bO.a(4, new cdc.a());
      this.bO.a(8, new cdc.d());
      this.bO.a(9, new bto(this, cfh.class, 3.0F, 1.0F));
      this.bO.a(10, new bto(this, bmm.class, 8.0F));
      this.bP.a(1, new buy(this, cgq.class).a());
      this.bP.a(2, new cdc.b(this));
      this.bP.a(3, new buz<>(this, cfh.class, true));
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 14.0).a(bnq.c, 4.0);
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
   public void w(blu $$0) {
      super.w($$0);
      if ($$0 instanceof cdc $$1) {
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
   public bmm A() {
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

   public void a(bmm $$0) {
      this.bT = $$0;
   }

   public void b(int $$0) {
      this.bV = true;
      this.bW = $$0;
   }

   @Override
   protected arq y() {
      return arr.zD;
   }

   @Override
   protected arq n_() {
      return arr.zF;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.zG;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      this.a(blz.a, new cmx(cna.oX));
      this.a(blz.a, 0.0F);
   }

   @Override
   protected float l(blu $$0) {
      return 0.04F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   class a extends btg {
      public a() {
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         bmk $$0 = cdc.this.q();
         return $$0 != null && $$0.bx() && !cdc.this.K().b() && cdc.this.ag.a(b(7)) == 0 ? cdc.this.f($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cdc.this.K().b() && cdc.this.gf() && cdc.this.q() != null && cdc.this.q().bx();
      }

      @Override
      public void c() {
         bmk $$0 = cdc.this.q();
         if ($$0 != null) {
            els $$1 = $$0.br();
            cdc.this.bL.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cdc.this.w(true);
         cdc.this.a(arr.zE, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cdc.this.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmk $$0 = cdc.this.q();
         if ($$0 != null) {
            if (cdc.this.cH().c($$0.cH())) {
               cdc.this.C($$0);
               cdc.this.w(false);
            } else {
               double $$1 = cdc.this.f($$0);
               if ($$1 < 9.0) {
                  els $$2 = $$0.br();
                  cdc.this.bL.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends bvg {
      private final bwy b = bwy.b().d().e();

      public b(bmt $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cdc.this.bT != null && cdc.this.bT.q() != null && this.a(cdc.this.bT.q(), this.b);
      }

      @Override
      public void c() {
         cdc.this.h(cdc.this.bT.q());
         super.c();
      }
   }

   class c extends bsj {
      public c(cdc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bsj.a.b) {
            els $$0 = new els(this.e - cdc.this.dr(), this.f - cdc.this.dt(), this.g - cdc.this.dx());
            double $$1 = $$0.f();
            if ($$1 < cdc.this.cH().a()) {
               this.k = bsj.a.a;
               cdc.this.g(cdc.this.dp().a(0.5));
            } else {
               cdc.this.g(cdc.this.dp().e($$0.a(this.h * 0.05 / $$1)));
               if (cdc.this.q() == null) {
                  els $$2 = cdc.this.dp();
                  cdc.this.r(-((float)aun.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cdc.this.aU = cdc.this.dC();
               } else {
                  double $$3 = cdc.this.q().dr() - cdc.this.dr();
                  double $$4 = cdc.this.q().dx() - cdc.this.dx();
                  cdc.this.r(-((float)aun.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cdc.this.aU = cdc.this.dC();
               }
            }
         }
      }
   }

   class d extends btg {
      public d() {
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         return !cdc.this.K().b() && cdc.this.ag.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         hx $$0 = cdc.this.ge();
         if ($$0 == null) {
            $$0 = cdc.this.dm();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            hx $$2 = $$0.b(cdc.this.ag.a(15) - 7, cdc.this.ag.a(11) - 5, cdc.this.ag.a(15) - 7);
            if (cdc.this.dM().u($$2)) {
               cdc.this.bL.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cdc.this.q() == null) {
                  cdc.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
