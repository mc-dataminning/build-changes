import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfh extends btl implements bsu, bto<ix<cfi>> {
   private static final ajr<Boolean> cc = ajv.a(cfh.class, ajt.k);
   private static final ajr<Integer> cd = ajv.a(cfh.class, ajt.b);
   private static final ajr<Integer> ce = ajv.a(cfh.class, ajt.b);
   private static final ajr<ix<cfi>> cf = ajv.a(cfh.class, ajt.y);
   public static final Predicate<bso> cb = $$0 -> {
      bsa<?> $$1 = $$0.ak();
      return $$1 == bsa.aJ || $$1 == bsa.aG || $$1 == bsa.Q;
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
   private static final bpf cp = azc.a(20, 39);
   @Nullable
   private UUID cq;

   public cfh(bsa<? extends cfh> $$0, dax $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(enl.f, -1.0F);
      this.a(enl.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzg(this));
      this.bS.a(1, new cfh.c(1.5));
      this.bS.a(2, new car(this));
      this.bS.a(3, new cfh.a<>(this, cgl.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new bzs(this, 0.4F));
      this.bS.a(5, new bzw(this, 1.0, true));
      this.bS.a(6, new bzk(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new byy(this, 1.0));
      this.bS.a(8, new caz(this, 1.0));
      this.bS.a(9, new byu(this, 8.0F));
      this.bS.a(10, new bzu(this, clw.class, 8.0F));
      this.bS.a(10, new cah(this));
      this.bT.a(1, new cbj(this));
      this.bT.a(2, new cbk(this));
      this.bT.a(3, new cbe(this).a());
      this.bT.a(4, new cbf<>(this, clw.class, 10, true, false, this::a_));
      this.bT.a(5, new cbi<>(this, cee.class, false, cb));
      this.bT.a(6, new cbi<>(this, cff.class, false, cff.bY));
      this.bT.a(7, new cbf<>(this, cik.class, false));
      this.bT.a(8, new cbl<>(this, true));
   }

   public akm gv() {
      cfi $$0 = this.gw().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public ix<cfi> gw() {
      return this.ao.a(cf);
   }

   @Override
   public void i(ix<cfi> $$0) {
      this.ao.a(cf, $$0);
   }

   public static btv.a gx() {
      return bsq.A().a(btw.r, 0.3F).a(btw.q, 8.0).a(btw.c, 4.0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dR().d(lf.m).g(cfj.a));
      $$0.a(cc, false);
      $$0.a(cd, csh.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.CP, 0.15F, 1.0F);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gA().a());
      $$0.a("variant", this.gw().e().orElse(cfj.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      Optional.ofNullable(akm.a($$0.l("variant"))).map($$0x -> akl.a(lf.m, $$0x)).flatMap($$0x -> this.dR().d(lf.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csh.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ix<dbw> $$4 = $$0.t(this.dp());
      ix<cfi> $$6;
      if ($$3 instanceof cfh.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cfj.a(this.dR(), $$4);
         $$3 = new cfh.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avg v() {
      if (this.Z_()) {
         return avh.CK;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.eA() < 20.0F ? avh.CQ : avh.CN;
      } else {
         return avh.CI;
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return this.h($$0) ? avh.CG : avh.CM;
   }

   @Override
   protected avg o_() {
      return avh.CJ;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.cl && !this.cm && !this.gl() && this.aE()) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
         this.dP().a(this, (byte)8);
      }

      if (!this.dP().B) {
         this.a((aqm)this.dP(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bD()) {
         this.ck = this.cj;
         if (this.gC()) {
            this.cj = this.cj + (1.0F - this.cj) * 0.4F;
         } else {
            this.cj = this.cj + (0.0F - this.cj) * 0.4F;
         }

         if (this.bg()) {
            this.cl = true;
            if (this.cm && !this.dP().B) {
               this.dP().a(this, (byte)56);
               this.gD();
            }
         } else if ((this.cl || this.cm) && this.cm) {
            if (this.cn == 0.0F) {
               this.a(avh.CO, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dvu.u);
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
               float $$0 = (float)this.dw();
               int $$1 = (int)(ayd.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               euk $$2 = this.ds();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  this.dP().a(ky.am, this.du() + (double)$$4, (double)($$0 + 0.8F), this.dA() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bqn $$0) {
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
      return Math.min(0.5F + ayd.i($$0, this.co, this.cn) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ayd.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayd.a($$2 * (float) Math.PI) * ayd.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayd.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(bqn $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cto $$2 = this.fQ();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayd.f($$1), this, bsb.g);
         if (brs.b.a($$3, $$4) != brs.b.a(this.fQ())) {
            this.a(avh.CF);
            if (this.dP() instanceof aqm $$5) {
               $$5.a(new ku(ky.S, ctr.oq.v()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bqn $$0) {
      return this.gB() && !$$0.a(avy.D);
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bso)this), (float)((int)this.g(btw.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(btw.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(btw.q).a(8.0);
      }
   }

   @Override
   protected void b(bqn $$0, float $$1) {
      this.a($$0, $$1, new bsb[]{bsb.g});
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      ctj $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.eA() < this.eR()) {
               $$2.a(1, $$0);
               coq $$5 = $$2.a(kb.u);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bpu.a(this.dP().x_());
            } else {
               if ($$3 instanceof csi $$7 && this.j($$0)) {
                  csh $$8 = $$7.c();
                  if ($$8 != this.gA()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bpu.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(ctr.or) && this.j($$0) && !this.gB() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bpu.a;
               } else if ($$2.a(ctr.rV) && this.j($$0) && this.gB() && !cza.f(this.fQ())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avh.az);
                  cto $$9 = this.fQ();
                  this.m(cto.i);
                  this.b($$9);
                  return bpu.a;
               } else if (crf.h.a().d().get().a($$2) && this.y() && this.gB() && this.j($$0) && this.fQ().m()) {
                  $$2.h(1);
                  this.a(avh.CH);
                  cto $$10 = this.fQ();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bpu.a;
               } else {
                  bpu $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gp());
                     this.bo = false;
                     this.bR.n();
                     this.h(null);
                     return bpu.a;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(ctr.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bpu.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(ctr.rz) && !this.s() && !this.Z_();
         return $$4 ? bpu.b : bpu.d;
      }
   }

   private void h(clw $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bR.n();
         this.h(null);
         this.y(true);
         this.dP().a(this, (byte)7);
      } else {
         this.dP().a(this, (byte)6);
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
      } else if (this.s()) {
         float $$0 = this.eR();
         float $$1 = ($$0 - this.eA()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ad);
   }

   @Override
   public int ae() {
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

   public csh gA() {
      return csh.a(this.ao.a(cd));
   }

   public boolean gB() {
      return !this.fQ().e();
   }

   private void a(csh $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cfh b(aqm $$0, bro $$1) {
      cfh $$2 = bsa.bs.a((dax)$$0);
      if ($$2 != null && $$1 instanceof cfh $$3) {
         if (this.ah.h()) {
            $$2.i(this.gw());
         } else {
            $$2.i($$3.gw());
         }

         if (this.s()) {
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
   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cfh $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.y() ? false : this.gt() && $$1.gt();
      }
   }

   public boolean gC() {
      return this.ao.a(cc);
   }

   @Override
   public boolean a(bso $$0, bso $$1) {
      if ($$0 instanceof cio || $$0 instanceof ciw || $$0 instanceof chw) {
         return false;
      } else if ($$0 instanceof cfh $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof clw $$3 && $$1 instanceof clw $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cgi $$5 && $$5.gE()) {
            return false;
         }

         if ($$0 instanceof btl $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(clw $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsa<cfh> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.cf) && a($$1, $$3);
   }

   class a<T extends bso> extends byt<T> {
      private final cfh j;

      public a(cfh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cgl ? !this.j.s() && this.a((cgl)this.b) : false;
      }

      private boolean a(cgl $$0) {
         return $$0.gz() >= cfh.this.ah.a(5);
      }

      @Override
      public void c() {
         cfh.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cfh.this.h(null);
         super.e();
      }
   }

   public static class b extends bro.a {
      public final ix<cfi> a;

      public b(ix<cfi> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends caf {
      public c(double $$0) {
         super(cfh.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
