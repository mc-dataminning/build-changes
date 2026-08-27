import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvn extends bju implements bjf {
   private static final adz<Boolean> bX = aec.a(bvn.class, aeb.k);
   private static final adz<Integer> bY = aec.a(bvn.class, aeb.b);
   private static final adz<Integer> bZ = aec.a(bvn.class, aeb.b);
   public static final Predicate<biy> bW = $$0 -> {
      bim<?> $$1 = $$0.ag();
      return $$1 == bim.aF || $$1 == bim.aC || $$1 == bim.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bgb ci = asm.a(20, 39);
   @Nullable
   private UUID cj;

   public bvn(bim<? extends bvn> $$0, cpm $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eao.f, -1.0F);
      this.a(eao.g, -1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpo(this));
      this.bO.a(1, new bvn.b(1.5));
      this.bO.a(2, new bqz(this));
      this.bO.a(3, new bvn.a<>(this, bwm.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bqa(this, 0.4F));
      this.bO.a(5, new bqe(this, 1.0, true));
      this.bO.a(6, new bps(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bpg(this, 1.0));
      this.bO.a(8, new brh(this, 1.0));
      this.bO.a(9, new bpc(this, 8.0F));
      this.bO.a(10, new bqc(this, cbn.class, 8.0F));
      this.bO.a(10, new bqp(this));
      this.bP.a(1, new brr(this));
      this.bP.a(2, new brs(this));
      this.bP.a(3, new brm(this).a());
      this.bP.a(4, new brn<>(this, cbn.class, 10, true, false, this::a_));
      this.bP.a(5, new brq<>(this, buk.class, false, bW));
      this.bP.a(6, new brq<>(this, bvl.class, false, bvl.bU));
      this.bP.a(7, new brn<>(this, byk.class, false));
      this.bP.a(8, new brt<>(this, true));
   }

   public static bke.a gf() {
      return bja.x().a(bkf.d, 0.3F).a(bkf.a, 8.0).a(bkf.f, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, false);
      this.an.a(bY, chm.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.Aq, 0.15F, 1.0F);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gi().a());
      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(chm.a($$0.h("CollarColor")));
      }

      this.a(this.dK(), $$0);
   }

   @Override
   protected aov r() {
      if (this.S_()) {
         return aow.Al;
      } else if (this.ag.a(3) == 0) {
         return this.p() && this.et() < 10.0F ? aow.Ar : aow.Ao;
      } else {
         return aow.Aj;
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.An;
   }

   @Override
   protected aov h_() {
      return aow.Ak;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B && this.ce && !this.cf && !this.fV() && this.aA()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dK().a(this, (byte)8);
      }

      if (!this.dK().B) {
         this.a((akk)this.dK(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bv()) {
         this.cd = this.cc;
         if (this.gj()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.aZ()) {
            this.ce = true;
            if (this.cf && !this.dK().B) {
               this.dK().a(this, (byte)56);
               this.gk();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(aow.Ap, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(djk.u);
            }

            this.ch = this.cg;
            this.cg += 0.05F;
            if (this.ch >= 2.0F) {
               this.ce = false;
               this.cf = false;
               this.ch = 0.0F;
               this.cg = 0.0F;
            }

            if (this.cg > 0.4F) {
               float $$0 = (float)this.dr();
               int $$1 = (int)(arp.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ehe $$2 = this.dn();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dK().a(iv.ag, this.dp() + (double)$$4, (double)($$0 + 0.8F), this.dv() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gk() {
      this.cf = false;
      this.cg = 0.0F;
      this.ch = 0.0F;
   }

   @Override
   public void a(bhg $$0) {
      this.ce = false;
      this.cf = false;
      this.ch = 0.0F;
      this.cg = 0.0F;
      super.a($$0);
   }

   public boolean gg() {
      return this.ce;
   }

   public float E(float $$0) {
      return Math.min(0.5F + arp.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (arp.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return arp.a($$2 * (float) Math.PI) * arp.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return arp.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int W() {
      return this.t() ? 20 : super.W();
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bii $$2 = $$0.d();
         if (!this.dK().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cbn) && !($$2 instanceof cbt)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = $$0.a(this.dL().b((biy)this), (float)((int)this.b(bkf.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bkf.a).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bkf.a).a(8.0);
      }

      this.a(bkf.f).a(4.0);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      cit $$3 = $$2.d();
      if (this.dK().B) {
         boolean $$4 = this.l($$0) || this.p() || $$2.a(cjb.qL) && !this.p() && !this.S_();
         return $$4 ? bgq.b : bgq.d;
      } else if (this.p()) {
         if (this.m($$2) && this.et() < this.eK()) {
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bgq.a;
         } else {
            if ($$3 instanceof chn $$5 && this.l($$0)) {
               chm $$6 = $$5.d();
               if ($$6 != this.gi()) {
                  this.a($$6);
                  if (!$$0.fR().d) {
                     $$2.h(1);
                  }

                  return bgq.a;
               }

               return super.b($$0, $$1);
            }

            bgq $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.i_()) && this.l($$0)) {
               this.z(!this.fZ());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bgq.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cjb.qL) && !this.S_()) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h(null);
            this.z(true);
            this.dK().a(this, (byte)7);
         } else {
            this.dK().a(this, (byte)6);
         }

         return bgq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
      } else if ($$0 == 56) {
         this.gk();
      } else {
         super.b($$0);
      }
   }

   public float gh() {
      if (this.S_()) {
         return 1.5393804F;
      } else {
         return this.p() ? (0.55F - (this.eK() - this.et()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(ciy $$0) {
      cit $$1 = $$0.d();
      return $$1.u() && $$1.v().c();
   }

   @Override
   public int Z() {
      return 8;
   }

   @Override
   public int a() {
      return this.an.b(bZ);
   }

   @Override
   public void a(int $$0) {
      this.an.b(bZ, $$0);
   }

   @Override
   public void c() {
      this.a(ci.a(this.ag));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cj;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cj = $$0;
   }

   public chm gi() {
      return chm.a(this.an.b(bY));
   }

   public void a(chm $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bvn b(akk $$0, bid $$1) {
      bvn $$2 = bim.bn.a((cpm)$$0);
      if ($$2 != null) {
         UUID $$3 = this.U_();
         if ($$3 != null) {
            $$2.b($$3);
            $$2.x(true);
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(buk $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof bvn $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.t() ? false : this.gd() && $$1.gd();
      }
   }

   public boolean gj() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(biy $$0, biy $$1) {
      if ($$0 instanceof byn || $$0 instanceof byv) {
         return false;
      } else if ($$0 instanceof bvn $$2) {
         return !$$2.p() || $$2.I_() != $$1;
      } else if ($$0 instanceof cbn && $$1 instanceof cbn && !((cbn)$$1).a((cbn)$$0)) {
         return false;
      } else {
         return $$0 instanceof bwj && ((bwj)$$0).go() ? false : !($$0 instanceof bju) || !((bju)$$0).p();
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return !this.S_() && super.a($$0);
   }

   @Override
   public ehe cI() {
      return new ehe(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bim<bvn> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bX) && a($$1, $$3);
   }

   class a<T extends biy> extends bpb<T> {
      private final bvn j;

      public a(bvn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bwm ? !this.j.p() && this.a((bwm)this.b) : false;
      }

      private boolean a(bwm $$0) {
         return $$0.gj() >= bvn.this.ag.a(5);
      }

      @Override
      public void c() {
         bvn.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bvn.this.h(null);
         super.e();
      }
   }

   class b extends bqn {
      public b(double $$0) {
         super(bvn.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dz() || this.b.bM();
      }
   }
}
