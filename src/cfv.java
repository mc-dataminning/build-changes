import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfv extends btz implements bti, buc<jj<cfw>> {
   private static final ajp<Boolean> ce = ajt.a(cfv.class, ajr.k);
   private static final ajp<Integer> cf = ajt.a(cfv.class, ajr.b);
   private static final ajp<Integer> cg = ajt.a(cfv.class, ajr.b);
   private static final ajp<jj<cfw>> ch = ajt.a(cfv.class, ajr.y);
   public static final Predicate<btc> cd = $$0 -> {
      bsn<?> $$1 = $$0.am();
      return $$1 == bsn.aJ || $$1 == bsn.aG || $$1 == bsn.Q;
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
   private static final bps cr = azh.a(20, 39);
   @Nullable
   private UUID cs;

   public cfv(bsn<? extends cfv> $$0, dcg $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(epa.f, -1.0F);
      this.a(epa.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzu(this));
      this.bU.a(1, new cfv.c(1.5));
      this.bU.a(2, new cbf(this));
      this.bU.a(3, new cfv.a<>(this, cgz.class, 24.0F, 1.5, 1.5));
      this.bU.a(4, new cag(this, 0.4F));
      this.bU.a(5, new cak(this, 1.0, true));
      this.bU.a(6, new bzy(this, 1.0, 10.0F, 2.0F, false));
      this.bU.a(7, new bzm(this, 1.0));
      this.bU.a(8, new cbn(this, 1.0));
      this.bU.a(9, new bzi(this, 8.0F));
      this.bU.a(10, new cai(this, cml.class, 8.0F));
      this.bU.a(10, new cav(this));
      this.bV.a(1, new cbx(this));
      this.bV.a(2, new cby(this));
      this.bV.a(3, new cbs(this).a());
      this.bV.a(4, new cbt<>(this, cml.class, 10, true, false, this::a_));
      this.bV.a(5, new cbw<>(this, ces.class, false, cd));
      this.bV.a(6, new cbw<>(this, cft.class, false, cft.ca));
      this.bV.a(7, new cbt<>(this, ciz.class, false));
      this.bV.a(8, new cbz<>(this, true));
   }

   public akk gt() {
      cfw $$0 = this.gu().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public jj<cfw> gu() {
      return this.ao.a(ch);
   }

   @Override
   public void i(jj<cfw> $$0) {
      this.ao.a(ch, $$0);
   }

   public static buj.a gv() {
      return bte.A().a(buk.v, 0.3F).a(buk.s, 8.0).a(buk.c, 4.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      jx $$1 = this.dT();
      jw<cfw> $$2 = $$1.d(lr.m);
      $$0.a(ch, $$2.b(cfx.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, csw.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.CS, 0.15F, 1.0F);
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
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.m, $$0x)).flatMap($$0x -> this.dT().d(lr.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csw.a($$0.h("CollarColor")));
      }

      this.a(this.dR(), $$0);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      jj<ddg> $$4 = $$0.t(this.dr());
      jj<cfw> $$6;
      if ($$3 instanceof cfv.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cfx.a(this.dT(), $$4);
         $$3 = new cfv.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avg v() {
      if (this.Z_()) {
         return avh.CN;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.ey() < 20.0F ? avh.CT : avh.CQ;
      } else {
         return avh.CL;
      }
   }

   @Override
   protected avg d(bra $$0) {
      return this.g($$0) ? avh.CJ : avh.CP;
   }

   @Override
   protected avg n_() {
      return avh.CM;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B && this.cn && !this.co && !this.gj() && this.aG()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dR().a(this, (byte)8);
      }

      if (!this.dR().B) {
         this.a((aqm)this.dR(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bF()) {
         this.cm = this.cl;
         if (this.gA()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bi()) {
            this.cn = true;
            if (this.co && !this.dR().B) {
               this.dR().a(this, (byte)56);
               this.gB();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(avh.CR, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dxh.u);
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
               float $$0 = (float)this.dy();
               int $$1 = (int)(ayg.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               ewh $$2 = this.du();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dl() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dl() * 0.5F;
                  this.dR().a(lj.am, this.dw() + (double)$$4, (double)($$0 + 0.8F), this.dC() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bra $$0) {
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
      return Math.min(0.75F + ayg.i($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float g(float $$0, float $$1) {
      float $$2 = (ayg.i($$0, this.cq, this.cp) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayg.a($$2 * (float) Math.PI) * ayg.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.x() ? 20 : super.aa();
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dR().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean d(bso $$0) {
      return true;
   }

   @Override
   protected void f(bra $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cud $$2 = this.fO();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayg.f($$1), this, bso.g);
         if (bsf.b.a($$3, $$4) != bsf.b.a(this.fO())) {
            this.a(avh.CI);
            if (this.dR() instanceof aqm $$5) {
               $$5.a(new lf(lj.S, cug.oq.w()), this.dw(), this.dy() + 1.0, this.dC(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bra $$0) {
      return this.gz() && !$$0.a(avy.D);
   }

   @Override
   protected void t() {
      if (this.s()) {
         this.f(buk.s).a(40.0);
         this.u(40.0F);
      } else {
         this.f(buk.s).a(8.0);
      }
   }

   @Override
   protected void b(bra $$0, float $$1) {
      this.a($$0, $$1, new bso[]{bso.g});
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      cty $$3 = $$2.g();
      if (!this.dR().B || this.o_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.ey() < this.eP()) {
               $$2.a(1, $$0);
               cpf $$5 = $$2.a(kn.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqh.a(this.dR().x_());
            } else {
               if ($$3 instanceof csx $$7 && this.j($$0)) {
                  csw $$8 = $$7.c();
                  if ($$8 != this.gy()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqh.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cug.or) && this.j($$0) && !this.gz() && !this.o_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqh.a;
               } else if ($$2.a(cug.rV) && this.j($$0) && this.gz() && (!czo.a(this.fO(), czn.E) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avh.az);
                  cud $$9 = this.fO();
                  this.m(cud.l);
                  this.b($$9);
                  return bqh.a;
               } else if (crv.h.a().d().get().a($$2) && this.x() && this.gz() && this.j($$0) && this.fO().m()) {
                  $$2.h(1);
                  this.a(avh.CK);
                  cud $$10 = this.fO();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqh.a;
               } else {
                  bqh $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gn());
                     this.bo = false;
                     this.bT.n();
                     this.h(null);
                     return bqh.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cug.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqh.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cug.rz) && !this.s() && !this.Z_();
         return $$4 ? bqh.c : bqh.e;
      }
   }

   private void h(cml $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bT.n();
         this.h(null);
         this.y(true);
         this.dR().a(this, (byte)7);
      } else {
         this.dR().a(this, (byte)6);
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
         float $$0 = this.eP();
         float $$1 = ($$0 - this.ey()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ad);
   }

   @Override
   public int af() {
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

   public csw gy() {
      return csw.a(this.ao.a(cf));
   }

   public boolean gz() {
      return !this.fO().e();
   }

   private void a(csw $$0) {
      this.ao.a(cf, $$0.a());
   }

   @Nullable
   public cfv b(aqm $$0, bsb $$1) {
      cfv $$2 = bsn.bs.a((dcg)$$0);
      if ($$2 != null && $$1 instanceof cfv $$3) {
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
   public boolean a(ces $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cfv $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.x() ? false : this.gr() && $$1.gr();
      }
   }

   public boolean gA() {
      return this.ao.a(ce);
   }

   @Override
   public boolean a(btc $$0, btc $$1) {
      if ($$0 instanceof cjd || $$0 instanceof cjl || $$0 instanceof cik) {
         return false;
      } else if ($$0 instanceof cfv $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cml $$3 && $$1 instanceof cml $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cgw $$5 && $$5.gC()) {
            return false;
         }

         if ($$0 instanceof btz $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cml $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.6F * this.cN()), (double)(this.dl() * 0.4F));
   }

   public static boolean c(bsn<cfv> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cf) && a($$1, $$3);
   }

   class a<T extends btc> extends bzh<T> {
      private final cfv j;

      public a(final cfv $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cgz ? !this.j.s() && this.a((cgz)this.b) : false;
      }

      private boolean a(cgz $$0) {
         return $$0.gx() >= cfv.this.ah.a(5);
      }

      @Override
      public void c() {
         cfv.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cfv.this.h(null);
         super.e();
      }
   }

   public static class b extends bsb.a {
      public final jj<cfw> a;

      public b(jj<cfw> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cat {
      public c(final double $$0) {
         super(cfv.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dG() || this.b.bS();
      }
   }
}
