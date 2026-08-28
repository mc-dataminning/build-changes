import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgh extends bul implements btu, buo<ji<cgi>> {
   private static final akj<Boolean> cc = akn.a(cgh.class, akl.k);
   private static final akj<Integer> cd = akn.a(cgh.class, akl.b);
   private static final akj<Integer> ce = akn.a(cgh.class, akl.b);
   private static final akj<ji<cgi>> cf = akn.a(cgh.class, akl.y);
   public static final Predicate<bto> cb = $$0 -> {
      bsz<?> $$1 = $$0.ak();
      return $$1 == bsz.aJ || $$1 == bsz.aG || $$1 == bsz.Q;
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
   private static final bqe cp = azy.a(20, 39);
   @Nullable
   private UUID cq;

   public cgh(bsz<? extends cgh> $$0, dbx $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eol.f, -1.0F);
      this.a(eol.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cag(this));
      this.bS.a(1, new cgh.c(1.5));
      this.bS.a(2, new cbr(this));
      this.bS.a(3, new cgh.a<>(this, chl.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cas(this, 0.4F));
      this.bS.a(5, new caw(this, 1.0, true));
      this.bS.a(6, new cak(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new bzy(this, 1.0));
      this.bS.a(8, new cbz(this, 1.0));
      this.bS.a(9, new bzu(this, 8.0F));
      this.bS.a(10, new cau(this, cmw.class, 8.0F));
      this.bS.a(10, new cbh(this));
      this.bT.a(1, new ccj(this));
      this.bT.a(2, new cck(this));
      this.bT.a(3, new cce(this).a());
      this.bT.a(4, new ccf<>(this, cmw.class, 10, true, false, this::a_));
      this.bT.a(5, new cci<>(this, cfe.class, false, cb));
      this.bT.a(6, new cci<>(this, cgf.class, false, cgf.bY));
      this.bT.a(7, new ccf<>(this, cjk.class, false));
      this.bT.a(8, new ccl<>(this, true));
   }

   public ale gw() {
      cgi $$0 = this.gx().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public ji<cgi> gx() {
      return this.ao.a(cf);
   }

   @Override
   public void i(ji<cgi> $$0) {
      this.ao.a(cf, $$0);
   }

   public static buv.a gy() {
      return btq.A().a(buw.r, 0.3F).a(buw.q, 8.0).a(buw.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dR().d(lq.m).g(cgj.a));
      $$0.a(cc, false);
      $$0.a(cd, cth.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.CP, 0.15F, 1.0F);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gB().a());
      $$0.a("variant", this.gx().e().orElse(cgj.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      Optional.ofNullable(ale.a($$0.l("variant"))).map($$0x -> ald.a(lq.m, $$0x)).flatMap($$0x -> this.dR().d(lq.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cth.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      ji<dcw> $$4 = $$0.t(this.dp());
      ji<cgi> $$6;
      if ($$3 instanceof cgh.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cgj.a(this.dR(), $$4);
         $$3 = new cgh.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avy v() {
      if (this.Z_()) {
         return avz.CK;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.eA() < 20.0F ? avz.CQ : avz.CN;
      } else {
         return avz.CI;
      }
   }

   @Override
   protected avy d(brm $$0) {
      return this.h($$0) ? avz.CG : avz.CM;
   }

   @Override
   protected avy o_() {
      return avz.CJ;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.cl && !this.cm && !this.gm() && this.aE()) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
         this.dP().a(this, (byte)8);
      }

      if (!this.dP().B) {
         this.a((are)this.dP(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bD()) {
         this.ck = this.cj;
         if (this.gD()) {
            this.cj = this.cj + (1.0F - this.cj) * 0.4F;
         } else {
            this.cj = this.cj + (0.0F - this.cj) * 0.4F;
         }

         if (this.bg()) {
            this.cl = true;
            if (this.cm && !this.dP().B) {
               this.dP().a(this, (byte)56);
               this.gE();
            }
         } else if ((this.cl || this.cm) && this.cm) {
            if (this.cn == 0.0F) {
               this.a(avz.CO, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dwu.u);
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
               int $$1 = (int)(ayy.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               evq $$2 = this.ds();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  this.dP().a(li.am, this.du() + (double)$$4, (double)($$0 + 0.8F), this.dA() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gE() {
      this.cm = false;
      this.cn = 0.0F;
      this.co = 0.0F;
   }

   @Override
   public void a(brm $$0) {
      this.cl = false;
      this.cm = false;
      this.co = 0.0F;
      this.cn = 0.0F;
      super.a($$0);
   }

   public boolean gz() {
      return this.cl;
   }

   public float G(float $$0) {
      return Math.min(0.75F + ayy.i($$0, this.co, this.cn) / 2.0F * 0.25F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ayy.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayy.a($$2 * (float) Math.PI) * ayy.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayy.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.y() ? 20 : super.aa();
   }

   @Override
   public boolean a(brm $$0, float $$1) {
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
   protected void f(brm $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cuo $$2 = this.fR();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayy.f($$1), this, bta.g);
         if (bsr.b.a($$3, $$4) != bsr.b.a(this.fR())) {
            this.a(avz.CF);
            if (this.dP() instanceof are $$5) {
               $$5.a(new le(li.S, cur.oq.w()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(brm $$0) {
      return this.gC() && !$$0.a(awq.D);
   }

   @Override
   public boolean C(bst $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bto)this), (float)((int)this.g(buw.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(buw.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(buw.q).a(8.0);
      }
   }

   @Override
   protected void b(brm $$0, float $$1) {
      this.a($$0, $$1, new bta[]{bta.g});
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      cuj $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.eA() < this.eR()) {
               $$2.a(1, $$0);
               cpq $$5 = $$2.a(km.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqt.a(this.dP().x_());
            } else {
               if ($$3 instanceof cti $$7 && this.j($$0)) {
                  cth $$8 = $$7.c();
                  if ($$8 != this.gB()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqt.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cur.or) && this.j($$0) && !this.gC() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqt.a;
               } else if ($$2.a(cur.rV) && this.j($$0) && this.gC() && (!daa.f(this.fR()) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avz.az);
                  cuo $$9 = this.fR();
                  this.m(cuo.l);
                  this.b($$9);
                  return bqt.a;
               } else if (csf.h.a().d().get().a($$2) && this.y() && this.gC() && this.j($$0) && this.fR().m()) {
                  $$2.h(1);
                  this.a(avz.CH);
                  cuo $$10 = this.fR();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqt.a;
               } else {
                  bqt $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gq());
                     this.bn = false;
                     this.bR.n();
                     this.h(null);
                     return bqt.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cur.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqt.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cur.rz) && !this.s() && !this.Z_();
         return $$4 ? bqt.c : bqt.e;
      }
   }

   private void h(cmw $$0) {
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
         this.gE();
      } else {
         super.b($$0);
      }
   }

   public float gA() {
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
   public boolean o(cuo $$0) {
      return $$0.a(awx.ad);
   }

   @Override
   public int fQ() {
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

   public cth gB() {
      return cth.a(this.ao.a(cd));
   }

   public boolean gC() {
      return !this.fR().e();
   }

   private void a(cth $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cgh b(are $$0, bsn $$1) {
      cgh $$2 = bsz.bs.a((dbx)$$0);
      if ($$2 != null && $$1 instanceof cgh $$3) {
         if (this.ah.h()) {
            $$2.i(this.gx());
         } else {
            $$2.i($$3.gx());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gB());
            } else {
               $$2.a($$3.gB());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.ao.a(cc, $$0);
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
         return $$1.y() ? false : this.gu() && $$1.gu();
      }
   }

   public boolean gD() {
      return this.ao.a(cc);
   }

   @Override
   public boolean a(bto $$0, bto $$1) {
      if ($$0 instanceof cjo || $$0 instanceof cjw || $$0 instanceof ciw) {
         return false;
      } else if ($$0 instanceof cgh $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cmw $$3 && $$1 instanceof cmw $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof chi $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof bul $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsz<cgh> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.cf) && a($$1, $$3);
   }

   class a<T extends bto> extends bzt<T> {
      private final cgh j;

      public a(final cgh $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof chl ? !this.j.s() && this.a((chl)this.b) : false;
      }

      private boolean a(chl $$0) {
         return $$0.gA() >= cgh.this.ah.a(5);
      }

      @Override
      public void c() {
         cgh.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cgh.this.h(null);
         super.e();
      }
   }

   public static class b extends bsn.a {
      public final ji<cgi> a;

      public b(ji<cgi> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cbf {
      public c(final double $$0) {
         super(cgh.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
