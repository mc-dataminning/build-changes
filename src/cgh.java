import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgh extends bul implements btt, buo<jm<cgi>> {
   private static final ajw<Boolean> cf = aka.a(cgh.class, ajy.k);
   private static final ajw<Integer> cg = aka.a(cgh.class, ajy.b);
   private static final ajw<Integer> ch = aka.a(cgh.class, ajy.b);
   private static final ajw<jm<cgi>> ci = aka.a(cgh.class, ajy.y);
   public static final Predicate<btn> ce = $$0 -> {
      bsx<?> $$1 = $$0.am();
      return $$1 == bsx.aJ || $$1 == bsx.aG || $$1 == bsx.Q;
   };
   private static final float cj = 8.0F;
   private static final float ck = 40.0F;
   private static final float cl = 0.125F;
   private float cm;
   private float cn;
   private boolean co;
   private boolean cp;
   private float cq;
   private float cr;
   private static final bqc cs = azp.a(20, 39);
   @Nullable
   private UUID ct;

   public cgh(bsx<? extends cgh> $$0, dcw $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(epv.f, -1.0F);
      this.a(epv.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bU.a(1, new cag(this));
      this.bU.a(1, new bul.a(1.5, awg.G));
      this.bU.a(2, new cbr(this));
      this.bU.a(3, new cgh.a<>(this, chl.class, 24.0F, 1.5, 1.5));
      this.bU.a(4, new cas(this, 0.4F));
      this.bU.a(5, new caw(this, 1.0, true));
      this.bU.a(6, new cak(this, 1.0, 10.0F, 2.0F));
      this.bU.a(7, new bzy(this, 1.0));
      this.bU.a(8, new cbz(this, 1.0));
      this.bU.a(9, new bzu(this, 8.0F));
      this.bU.a(10, new cau(this, cmx.class, 8.0F));
      this.bU.a(10, new cbh(this));
      this.bV.a(1, new ccj(this));
      this.bV.a(2, new cck(this));
      this.bV.a(3, new cce(this).a());
      this.bV.a(4, new ccf<>(this, cmx.class, 10, true, false, this::a_));
      this.bV.a(5, new cci<>(this, cfe.class, false, ce));
      this.bV.a(6, new cci<>(this, cgf.class, false, cgf.ca));
      this.bV.a(7, new ccf<>(this, cjl.class, false));
      this.bV.a(8, new ccl<>(this, true));
   }

   public akr gu() {
      cgi $$0 = this.gv().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.ad_() ? $$0.c() : $$0.a();
      }
   }

   public jm<cgi> gv() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jm<cgi> $$0) {
      this.ao.a(ci, $$0);
   }

   public static buv.a gw() {
      return btp.C().a(buw.v, 0.3F).a(buw.s, 8.0).a(buw.c, 4.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      ka $$1 = this.dQ();
      jz<cgi> $$2 = $$1.d(lu.m);
      $$0.a(ci, $$2.b(cgj.j).or($$2::a).orElseThrow());
      $$0.a(cf, false);
      $$0.a(cg, cti.o.a());
      $$0.a(ch, 0);
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.CT, 0.15F, 1.0F);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gz().a());
      this.gv().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      Optional.ofNullable(akr.c($$0.l("variant"))).map($$0x -> akq.a(lu.m, $$0x)).flatMap($$0x -> this.dQ().d(lu.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cti.a($$0.h("CollarColor")));
      }

      this.a(this.dO(), $$0);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      jm<ddw> $$4 = $$0.t(this.do());
      jm<cgi> $$6;
      if ($$3 instanceof cgh.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cgj.a(this.dQ(), $$4);
         $$3 = new cgh.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avo v() {
      if (this.ad_()) {
         return avp.CO;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.ew() < 20.0F ? avp.CU : avp.CR;
      } else {
         return avp.CM;
      }
   }

   @Override
   protected avo d(brk $$0) {
      return this.g($$0) ? avp.CK : avp.CQ;
   }

   @Override
   protected avo n_() {
      return avp.CN;
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dO().B && this.co && !this.cp && !this.gg() && this.aF()) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
         this.dO().a(this, (byte)8);
      }

      if (!this.dO().B) {
         this.a((aqu)this.dO(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bE()) {
         this.cn = this.cm;
         if (this.gB()) {
            this.cm = this.cm + (1.0F - this.cm) * 0.4F;
         } else {
            this.cm = this.cm + (0.0F - this.cm) * 0.4F;
         }

         if (this.bh()) {
            this.co = true;
            if (this.cp && !this.dO().B) {
               this.dO().a(this, (byte)56);
               this.gC();
            }
         } else if ((this.co || this.cp) && this.cp) {
            if (this.cq == 0.0F) {
               this.a(avp.CS, this.fa(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dxz.u);
            }

            this.cr = this.cq;
            this.cq += 0.05F;
            if (this.cr >= 2.0F) {
               this.co = false;
               this.cp = false;
               this.cr = 0.0F;
               this.cq = 0.0F;
            }

            if (this.cq > 0.4F) {
               float $$0 = (float)this.dv();
               int $$1 = (int)(ayo.a((this.cq - 0.4F) * (float) Math.PI) * 7.0F);
               exc $$2 = this.dr();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  this.dO().a(lm.am, this.dt() + (double)$$4, (double)($$0 + 0.8F), this.dz() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gC() {
      this.cp = false;
      this.cq = 0.0F;
      this.cr = 0.0F;
   }

   @Override
   public void a(brk $$0) {
      this.co = false;
      this.cp = false;
      this.cr = 0.0F;
      this.cq = 0.0F;
      super.a($$0);
   }

   public boolean gx() {
      return this.co;
   }

   public float H(float $$0) {
      return Math.min(0.75F + ayo.i($$0, this.cr, this.cq) / 2.0F * 0.25F, 1.0F);
   }

   public float g(float $$0, float $$1) {
      float $$2 = (ayo.i($$0, this.cr, this.cq) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayo.a($$2 * (float) Math.PI) * ayo.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cn, this.cm) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ac() {
      return this.x() ? 20 : super.ac();
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dO().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean d(bsy $$0) {
      return true;
   }

   @Override
   protected void f(brk $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cuq $$2 = this.fO();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayo.f($$1), this, bsy.g);
         if (bsp.b.a($$3, $$4) != bsp.b.a(this.fO())) {
            this.a(avp.CJ);
            if (this.dO() instanceof aqu $$5) {
               $$5.a(new li(lm.S, cut.oq.w()), this.dt(), this.dv() + 1.0, this.dz(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(brk $$0) {
      return this.gA() && !$$0.a(awg.C);
   }

   @Override
   protected void t() {
      if (this.s()) {
         this.f(buw.s).a(40.0);
         this.v(40.0F);
      } else {
         this.f(buw.s).a(8.0);
      }
   }

   @Override
   protected void b(brk $$0, float $$1) {
      this.a($$0, $$1, new bsy[]{bsy.g});
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      cul $$3 = $$2.g();
      if (!this.dO().B || this.o_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.ew() < this.eN()) {
               $$2.a(1, $$0);
               cpr $$5 = $$2.a(kq.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqr.a(this.dO().x_());
            } else {
               if ($$3 instanceof ctj $$7 && this.j($$0)) {
                  cti $$8 = $$7.c();
                  if ($$8 != this.gz()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqr.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cut.or) && this.j($$0) && this.fO().e() && !this.o_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqr.a;
               } else if ($$2.a(cut.rV) && this.j($$0) && this.gA() && (!dae.a(this.fO(), dad.E) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avp.az);
                  cuq $$9 = this.fO();
                  this.m(cuq.l);
                  this.b($$9);
                  return bqr.a;
               } else if (csh.h.a().d().get().a($$2) && this.x() && this.gA() && this.j($$0) && this.fO().m()) {
                  $$2.h(1);
                  this.a(avp.CL);
                  cuq $$10 = this.fO();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqr.a;
               } else {
                  bqr $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.z(!this.gk());
                     this.bn = false;
                     this.bT.n();
                     this.h(null);
                     return bqr.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cut.rz) && !this.ad_()) {
            $$2.a(1, $$0);
            this.g($$0);
            return bqr.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cut.rz) && !this.s() && !this.ad_();
         return $$4 ? bqr.c : bqr.e;
      }
   }

   private void g(cmx $$0) {
      if (this.ah.a(3) == 0) {
         this.a($$0);
         this.bT.n();
         this.h(null);
         this.z(true);
         this.dO().a(this, (byte)7);
      } else {
         this.dO().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
      } else if ($$0 == 56) {
         this.gC();
      } else {
         super.b($$0);
      }
   }

   public float gy() {
      if (this.ad_()) {
         return 1.5393804F;
      } else if (this.s()) {
         float $$0 = this.eN();
         float $$1 = ($$0 - this.ew()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ad);
   }

   @Override
   public int fN() {
      return 8;
   }

   @Override
   public int a() {
      return this.ao.a(ch);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void c() {
      this.a(cs.a(this.ah));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ct;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ct = $$0;
   }

   public cti gz() {
      return cti.a(this.ao.a(cg));
   }

   public boolean gA() {
      return this.fO().a(cut.or);
   }

   private void a(cti $$0) {
      this.ao.a(cg, $$0.a());
   }

   @Nullable
   public cgh b(aqu $$0, bsl $$1) {
      cgh $$2 = bsx.bs.a((dcw)$$0);
      if ($$2 != null && $$1 instanceof cgh $$3) {
         if (this.ah.h()) {
            $$2.i(this.gv());
         } else {
            $$2.i($$3.gv());
         }

         if (this.s()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gz());
            } else {
               $$2.a($$3.gz());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   @Override
   public boolean a(cfe $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cgh $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.x() ? false : this.gs() && $$1.gs();
      }
   }

   public boolean gB() {
      return this.ao.a(cf);
   }

   @Override
   public boolean a(btn $$0, btn $$1) {
      if ($$0 instanceof cjp || $$0 instanceof cjx || $$0 instanceof ciw) {
         return false;
      } else if ($$0 instanceof cgh $$2) {
         return !$$2.s() || $$2.T_() != $$1;
      } else {
         if ($$0 instanceof cmx $$3 && $$1 instanceof cmx $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof chi $$5 && $$5.gz()) {
            return false;
         }

         if ($$0 instanceof bul $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean y() {
      return !this.ad_();
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsx<cgh> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.cg) && a($$1, $$3);
   }

   class a<T extends btn> extends bzt<T> {
      private final cgh j;

      public a(final cgh $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof chl ? !this.j.s() && this.a((chl)this.b) : false;
      }

      private boolean a(chl $$0) {
         return $$0.go() >= cgh.this.ah.a(5);
      }

      @Override
      public void d() {
         cgh.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cgh.this.h(null);
         super.a();
      }
   }

   public static class b extends bsl.a {
      public final jm<cgi> a;

      public b(jm<cgi> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
