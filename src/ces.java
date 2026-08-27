import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ces extends bsw implements bsg, bsz<iw<cet>> {
   private static final ajm<Boolean> cc = ajq.a(ces.class, ajo.k);
   private static final ajm<Integer> cd = ajq.a(ces.class, ajo.b);
   private static final ajm<Integer> ce = ajq.a(ces.class, ajo.b);
   private static final ajm<iw<cet>> cf = ajq.a(ces.class, ajo.y);
   public static final Predicate<bsa> cb = $$0 -> {
      brn<?> $$1 = $$0.ai();
      return $$1 == brn.aI || $$1 == brn.aF || $$1 == brn.Q;
   };
   private static final float cg = 8.0F;
   private static final float ch = 40.0F;
   private static final float ci = 0.125F;
   private float cj;
   private float ck;
   private boolean cl;
   private boolean cm;
   private float cn;
   private float co;
   private static final box cp = ayy.a(20, 39);
   @Nullable
   private UUID cq;

   public ces(brn<? extends ces> $$0, dad $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(emr.f, -1.0F);
      this.a(emr.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new byr(this));
      this.bS.a(1, new ces.c(1.5));
      this.bS.a(2, new cac(this));
      this.bS.a(3, new ces.a<>(this, cfw.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new bzd(this, 0.4F));
      this.bS.a(5, new bzh(this, 1.0, true));
      this.bS.a(6, new byv(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new byj(this, 1.0));
      this.bS.a(8, new cak(this, 1.0));
      this.bS.a(9, new byf(this, 8.0F));
      this.bS.a(10, new bzf(this, clh.class, 8.0F));
      this.bS.a(10, new bzs(this));
      this.bT.a(1, new cau(this));
      this.bT.a(2, new cav(this));
      this.bT.a(3, new cap(this).a());
      this.bT.a(4, new caq<>(this, clh.class, 10, true, false, this::a_));
      this.bT.a(5, new cat<>(this, cdp.class, false, cb));
      this.bT.a(6, new cat<>(this, ceq.class, false, ceq.bY));
      this.bT.a(7, new caq<>(this, chv.class, false));
      this.bT.a(8, new caw<>(this, true));
   }

   public akh gv() {
      cet $$0 = this.gw().a();
      if (this.r()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public iw<cet> gw() {
      return this.ao.a(cf);
   }

   @Override
   public void i(iw<cet> $$0) {
      this.ao.a(cf, $$0);
   }

   public static btg.a gx() {
      return bsc.A().a(bth.r, 0.3F).a(bth.q, 8.0).a(bth.c, 4.0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dP().d(le.m).g(ceu.a));
      $$0.a(cc, false);
      $$0.a(cd, crs.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.CE, 0.15F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gA().a());
      $$0.a("variant", this.gw().e().orElse(ceu.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      Optional.ofNullable(akh.a($$0.l("variant"))).map($$0x -> akg.a(le.m, $$0x)).flatMap($$0x -> this.dP().d(le.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(crs.a($$0.h("CollarColor")));
      }

      this.a(this.dN(), $$0);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      iw<dbc> $$4 = $$0.t(this.dn());
      iw<cet> $$6;
      if ($$3 instanceof ces.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = ceu.a(this.dP(), $$4);
         $$3 = new ces.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avb v() {
      if (this.Z_()) {
         return avc.Cz;
      } else if (this.ah.a(3) == 0) {
         return this.r() && this.ey() < 20.0F ? avc.CF : avc.CC;
      } else {
         return avc.Cx;
      }
   }

   @Override
   protected avb d(bqf $$0) {
      return this.h($$0) ? avc.Cv : avc.CB;
   }

   @Override
   protected avb o_() {
      return avc.Cy;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B && this.cl && !this.cm && !this.gl() && this.aC()) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
         this.dN().a(this, (byte)8);
      }

      if (!this.dN().B) {
         this.a((aqh)this.dN(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bB()) {
         this.ck = this.cj;
         if (this.gC()) {
            this.cj = this.cj + (1.0F - this.cj) * 0.4F;
         } else {
            this.cj = this.cj + (0.0F - this.cj) * 0.4F;
         }

         if (this.be()) {
            this.cl = true;
            if (this.cm && !this.dN().B) {
               this.dN().a(this, (byte)56);
               this.gD();
            }
         } else if ((this.cl || this.cm) && this.cm) {
            if (this.cn == 0.0F) {
               this.a(avc.CD, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dva.u);
            }

            this.co = this.cn;
            this.cn += 0.05F;
            if (this.co >= 2.0F) {
               this.cl = false;
               this.cm = false;
               this.co = 0.0F;
               this.cn = 0.0F;
            }

            if (this.cn > 0.4F) {
               float $$0 = (float)this.du();
               int $$1 = (int)(axz.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               etp $$2 = this.dq();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  this.dN().a(kx.aj, this.ds() + (double)$$4, (double)($$0 + 0.8F), this.dy() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gD() {
      this.cm = false;
      this.cn = 0.0F;
      this.co = 0.0F;
   }

   @Override
   public void a(bqf $$0) {
      this.cl = false;
      this.cm = false;
      this.co = 0.0F;
      this.cn = 0.0F;
      super.a($$0);
   }

   public boolean gy() {
      return this.cl;
   }

   public float G(float $$0) {
      return Math.min(0.5F + axz.i($$0, this.co, this.cn) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (axz.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return axz.a($$2 * (float) Math.PI) * axz.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axz.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(bqf $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         csz $$2 = this.fQ();
         int $$3 = $$2.m();
         int $$4 = $$2.n();
         $$2.a(axz.f($$1), this, bro.g);
         if (brf.b.a($$3, $$4) != brf.b.a(this.fQ())) {
            this.a(avc.Cu);
            if (this.dN() instanceof aqh $$5) {
               $$5.a(new kt(kx.Q, ctc.oq.v()), this.ds(), this.du() + 1.0, this.dy(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bqf $$0) {
      return this.gB() && !$$0.a(avt.D);
   }

   @Override
   public boolean C(brh $$0) {
      boolean $$1 = $$0.a(this.dO().b((bsa)this), (float)((int)this.g(bth.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.r()) {
         this.f(bth.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(bth.q).a(8.0);
      }
   }

   @Override
   protected void b(bqf $$0, float $$1) {
      this.a($$0, $$1, new bro[]{bro.g});
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      csu $$3 = $$2.f();
      if (!this.dN().B || this.p_() && this.o($$2)) {
         if (this.r()) {
            if (this.o($$2) && this.ey() < this.eP()) {
               $$2.a(1, $$0);
               coa $$5 = $$2.a(ka.t);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bpm.a(this.dN().x_());
            } else {
               if ($$3 instanceof crt $$7 && this.j($$0)) {
                  crs $$8 = $$7.c();
                  if ($$8 != this.gA()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bpm.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(ctc.or) && this.j($$0) && !this.gB() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bpm.a;
               } else if ($$2.a(ctc.rV) && this.j($$0) && this.gB() && !cyh.f(this.fQ())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avc.az);
                  csz $$9 = this.fQ();
                  this.m(csz.i);
                  this.b($$9);
                  return bpm.a;
               } else if (cqq.h.a().d().get().a($$2) && this.y() && this.gB() && this.j($$0) && this.fQ().l()) {
                  $$2.h(1);
                  this.a(avc.Cw);
                  csz $$10 = this.fQ();
                  int $$11 = (int)((float)$$10.n() * 0.125F);
                  $$10.b(Math.max(0, $$10.m() - $$11));
                  return bpm.a;
               } else {
                  bpm $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gp());
                     this.bo = false;
                     this.bR.n();
                     this.h(null);
                     return bpm.a;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(ctc.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bpm.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.r() || $$2.a(ctc.rz) && !this.r() && !this.Z_();
         return $$4 ? bpm.b : bpm.d;
      }
   }

   private void h(clh $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bR.n();
         this.h(null);
         this.y(true);
         this.dN().a(this, (byte)7);
      } else {
         this.dN().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
      } else if ($$0 == 56) {
         this.gD();
      } else {
         super.b($$0);
      }
   }

   public float gz() {
      if (this.Z_()) {
         return 1.5393804F;
      } else if (this.r()) {
         float $$0 = this.eP();
         float $$1 = ($$0 - this.ey()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ad);
   }

   @Override
   public int fP() {
      return 8;
   }

   @Override
   public int a() {
      return this.ao.a(ce);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void c() {
      this.a(cp.a(this.ah));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cq;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cq = $$0;
   }

   public crs gA() {
      return crs.a(this.ao.a(cd));
   }

   public boolean gB() {
      return !this.fQ().d();
   }

   private void a(crs $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public ces b(aqh $$0, brb $$1) {
      ces $$2 = brn.br.a((dad)$$0);
      if ($$2 != null && $$1 instanceof ces $$3) {
         if (this.ah.h()) {
            $$2.i(this.gw());
         } else {
            $$2.i($$3.gw());
         }

         if (this.r()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gA());
            } else {
               $$2.a($$3.gA());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public boolean a(cdp $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.r()) {
         return false;
      } else if (!($$0 instanceof ces $$1)) {
         return false;
      } else if (!$$1.r()) {
         return false;
      } else {
         return $$1.y() ? false : this.gt() && $$1.gt();
      }
   }

   public boolean gC() {
      return this.ao.a(cc);
   }

   @Override
   public boolean a(bsa $$0, bsa $$1) {
      if ($$0 instanceof chz || $$0 instanceof cih || $$0 instanceof chh) {
         return false;
      } else if ($$0 instanceof ces $$2) {
         return !$$2.r() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof clh $$3 && $$1 instanceof clh $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cft $$5 && $$5.gE()) {
            return false;
         }

         if ($$0 instanceof bsw $$6 && $$6.r()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(clh $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   public static boolean c(brn<ces> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.cf) && a($$1, $$3);
   }

   class a<T extends bsa> extends bye<T> {
      private final ces j;

      public a(ces $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cfw ? !this.j.r() && this.a((cfw)this.b) : false;
      }

      private boolean a(cfw $$0) {
         return $$0.gz() >= ces.this.ah.a(5);
      }

      @Override
      public void c() {
         ces.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         ces.this.h(null);
         super.e();
      }
   }

   public static class b extends brb.a {
      public final iw<cet> a;

      public b(iw<cet> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends bzq {
      public c(double $$0) {
         super(ces.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bO();
      }
   }
}
