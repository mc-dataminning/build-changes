import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfr extends btv implements bte, bty<jj<cfs>> {
   private static final ajp<Boolean> ce = ajt.a(cfr.class, ajr.k);
   private static final ajp<Integer> cf = ajt.a(cfr.class, ajr.b);
   private static final ajp<Integer> cg = ajt.a(cfr.class, ajr.b);
   private static final ajp<jj<cfs>> ch = ajt.a(cfr.class, ajr.y);
   public static final Predicate<bsy> cd = $$0 -> {
      bsj<?> $$1 = $$0.ak();
      return $$1 == bsj.aJ || $$1 == bsj.aG || $$1 == bsj.Q;
   };
   private static final float ci = 8.0F;
   private static final float cj = 40.0F;
   private static final float ck = 0.125F;
   private float cl;
   private float cm;
   private boolean cn;
   private boolean co;
   private float cp;
   private float cq;
   private static final bpo cr = aze.a(20, 39);
   @Nullable
   private UUID cs;

   public cfr(bsj<? extends cfr> $$0, dcd $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eos.f, -1.0F);
      this.a(eos.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzq(this));
      this.bU.a(1, new cfr.c(1.5));
      this.bU.a(2, new cbb(this));
      this.bU.a(3, new cfr.a<>(this, cgv.class, 24.0F, 1.5, 1.5));
      this.bU.a(4, new cac(this, 0.4F));
      this.bU.a(5, new cag(this, 1.0, true));
      this.bU.a(6, new bzu(this, 1.0, 10.0F, 2.0F, false));
      this.bU.a(7, new bzi(this, 1.0));
      this.bU.a(8, new cbj(this, 1.0));
      this.bU.a(9, new bze(this, 8.0F));
      this.bU.a(10, new cae(this, cmh.class, 8.0F));
      this.bU.a(10, new car(this));
      this.bV.a(1, new cbt(this));
      this.bV.a(2, new cbu(this));
      this.bV.a(3, new cbo(this).a());
      this.bV.a(4, new cbp<>(this, cmh.class, 10, true, false, this::a_));
      this.bV.a(5, new cbs<>(this, ceo.class, false, cd));
      this.bV.a(6, new cbs<>(this, cfp.class, false, cfp.ca));
      this.bV.a(7, new cbp<>(this, civ.class, false));
      this.bV.a(8, new cbv<>(this, true));
   }

   public akk gt() {
      cfs $$0 = this.gu().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public jj<cfs> gu() {
      return this.ao.a(ch);
   }

   @Override
   public void i(jj<cfs> $$0) {
      this.ao.a(ch, $$0);
   }

   public static buf.a gv() {
      return bta.A().a(bug.v, 0.3F).a(bug.s, 8.0).a(bug.c, 4.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      jx $$1 = this.dR();
      jw<cfs> $$2 = $$1.d(lr.m);
      $$0.a(ch, $$2.b(cft.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cst.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.CS, 0.15F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gy().a());
      this.gu().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.m, $$0x)).flatMap($$0x -> this.dR().d(lr.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cst.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      jj<ddd> $$4 = $$0.t(this.dp());
      jj<cfs> $$6;
      if ($$3 instanceof cfr.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cft.a(this.dR(), $$4);
         $$3 = new cfr.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected ave v() {
      if (this.Z_()) {
         return avf.CN;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.ew() < 20.0F ? avf.CT : avf.CQ;
      } else {
         return avf.CL;
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return this.h($$0) ? avf.CJ : avf.CP;
   }

   @Override
   protected ave o_() {
      return avf.CM;
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.cn && !this.co && !this.gj() && this.aE()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dP().a(this, (byte)8);
      }

      if (!this.dP().B) {
         this.a((aqk)this.dP(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bD()) {
         this.cm = this.cl;
         if (this.gA()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bg()) {
            this.cn = true;
            if (this.co && !this.dP().B) {
               this.dP().a(this, (byte)56);
               this.gB();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(avf.CR, this.fa(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dxa.u);
            }

            this.cq = this.cp;
            this.cp += 0.05F;
            if (this.cq >= 2.0F) {
               this.cn = false;
               this.co = false;
               this.cq = 0.0F;
               this.cp = 0.0F;
            }

            if (this.cp > 0.4F) {
               float $$0 = (float)this.dw();
               int $$1 = (int)(aye.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               evz $$2 = this.ds();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  this.dP().a(lj.am, this.du() + (double)$$4, (double)($$0 + 0.8F), this.dA() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gB() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bqw $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public boolean gw() {
      return this.cn;
   }

   public float H(float $$0) {
      return Math.min(0.75F + aye.i($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aye.i($$0, this.cq, this.cp) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aye.a($$2 * (float) Math.PI) * aye.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float I(float $$0) {
      return aye.i($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.y() ? 20 : super.aa();
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
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
   protected void f(bqw $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cua $$2 = this.fN();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(aye.f($$1), this, bsk.g);
         if (bsb.b.a($$3, $$4) != bsb.b.a(this.fN())) {
            this.a(avf.CI);
            if (this.dP() instanceof aqk $$5) {
               $$5.a(new lf(lj.S, cud.oq.w()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bqw $$0) {
      return this.gz() && !$$0.a(avw.D);
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(bug.s).a(40.0);
         this.u(40.0F);
      } else {
         this.f(bug.s).a(8.0);
      }
   }

   @Override
   protected void b(bqw $$0, float $$1) {
      this.a($$0, $$1, new bsk[]{bsk.g});
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      ctv $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.ew() < this.eN()) {
               $$2.a(1, $$0);
               cpb $$5 = $$2.a(kn.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqd.a(this.dP().x_());
            } else {
               if ($$3 instanceof csu $$7 && this.j($$0)) {
                  cst $$8 = $$7.c();
                  if ($$8 != this.gy()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqd.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cud.or) && this.j($$0) && !this.gz() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqd.a;
               } else if ($$2.a(cud.rV) && this.j($$0) && this.gz() && (!czl.a(this.fN(), czk.F) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avf.az);
                  cua $$9 = this.fN();
                  this.m(cua.l);
                  this.b($$9);
                  return bqd.a;
               } else if (crr.h.a().d().get().a($$2) && this.y() && this.gz() && this.j($$0) && this.fN().m()) {
                  $$2.h(1);
                  this.a(avf.CK);
                  cua $$10 = this.fN();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqd.a;
               } else {
                  bqd $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gn());
                     this.bn = false;
                     this.bT.n();
                     this.h(null);
                     return bqd.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cud.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqd.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cud.rz) && !this.s() && !this.Z_();
         return $$4 ? bqd.c : bqd.e;
      }
   }

   private void h(cmh $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bT.n();
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
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gB();
      } else {
         super.b($$0);
      }
   }

   public float gx() {
      if (this.Z_()) {
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
   public boolean o(cua $$0) {
      return $$0.a(awd.ad);
   }

   @Override
   public int fM() {
      return 8;
   }

   @Override
   public int a() {
      return this.ao.a(cg);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   public void c() {
      this.a(cr.a(this.ah));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cs;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cs = $$0;
   }

   public cst gy() {
      return cst.a(this.ao.a(cf));
   }

   public boolean gz() {
      return !this.fN().e();
   }

   private void a(cst $$0) {
      this.ao.a(cf, $$0.a());
   }

   @Nullable
   public cfr b(aqk $$0, brx $$1) {
      cfr $$2 = bsj.bs.a((dcd)$$0);
      if ($$2 != null && $$1 instanceof cfr $$3) {
         if (this.ah.h()) {
            $$2.i(this.gu());
         } else {
            $$2.i($$3.gu());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gy());
            } else {
               $$2.a($$3.gy());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public boolean a(ceo $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cfr $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.y() ? false : this.gr() && $$1.gr();
      }
   }

   public boolean gA() {
      return this.ao.a(ce);
   }

   @Override
   public boolean a(bsy $$0, bsy $$1) {
      if ($$0 instanceof ciz || $$0 instanceof cjh || $$0 instanceof cig) {
         return false;
      } else if ($$0 instanceof cfr $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cmh $$3 && $$1 instanceof cmh $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cgs $$5 && $$5.gC()) {
            return false;
         }

         if ($$0 instanceof btv $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsj<cfr> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.cf) && a($$1, $$3);
   }

   class a<T extends bsy> extends bzd<T> {
      private final cfr j;

      public a(final cfr $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cgv ? !this.j.s() && this.a((cgv)this.b) : false;
      }

      private boolean a(cgv $$0) {
         return $$0.gx() >= cfr.this.ah.a(5);
      }

      @Override
      public void c() {
         cfr.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cfr.this.h(null);
         super.e();
      }
   }

   public static class b extends brx.a {
      public final jj<cfs> a;

      public b(jj<cfs> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cap {
      public c(final double $$0) {
         super(cfr.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
