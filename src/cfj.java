import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfj extends btn implements bsw, btq<ix<cfk>> {
   private static final ajs<Boolean> cc = ajw.a(cfj.class, aju.k);
   private static final ajs<Integer> cd = ajw.a(cfj.class, aju.b);
   private static final ajs<Integer> ce = ajw.a(cfj.class, aju.b);
   private static final ajs<ix<cfk>> cf = ajw.a(cfj.class, aju.y);
   public static final Predicate<bsq> cb = $$0 -> {
      bsc<?> $$1 = $$0.ak();
      return $$1 == bsc.aJ || $$1 == bsc.aG || $$1 == bsc.Q;
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
   private static final bph cp = aze.a(20, 39);
   @Nullable
   private UUID cq;

   public cfj(bsc<? extends cfj> $$0, daz $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(enn.f, -1.0F);
      this.a(enn.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzi(this));
      this.bS.a(1, new cfj.c(1.5));
      this.bS.a(2, new cat(this));
      this.bS.a(3, new cfj.a<>(this, cgn.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new bzu(this, 0.4F));
      this.bS.a(5, new bzy(this, 1.0, true));
      this.bS.a(6, new bzm(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new bza(this, 1.0));
      this.bS.a(8, new cbb(this, 1.0));
      this.bS.a(9, new byw(this, 8.0F));
      this.bS.a(10, new bzw(this, cly.class, 8.0F));
      this.bS.a(10, new caj(this));
      this.bT.a(1, new cbl(this));
      this.bT.a(2, new cbm(this));
      this.bT.a(3, new cbg(this).a());
      this.bT.a(4, new cbh<>(this, cly.class, 10, true, false, this::a_));
      this.bT.a(5, new cbk<>(this, ceg.class, false, cb));
      this.bT.a(6, new cbk<>(this, cfh.class, false, cfh.bY));
      this.bT.a(7, new cbh<>(this, cim.class, false));
      this.bT.a(8, new cbn<>(this, true));
   }

   public akn gv() {
      cfk $$0 = this.gw().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public ix<cfk> gw() {
      return this.ao.a(cf);
   }

   @Override
   public void i(ix<cfk> $$0) {
      this.ao.a(cf, $$0);
   }

   public static btx.a gx() {
      return bss.A().a(bty.r, 0.3F).a(bty.q, 8.0).a(bty.c, 4.0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dR().d(lf.m).g(cfl.a));
      $$0.a(cc, false);
      $$0.a(cd, csj.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.CP, 0.15F, 1.0F);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gA().a());
      $$0.a("variant", this.gw().e().orElse(cfl.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      Optional.ofNullable(akn.a($$0.l("variant"))).map($$0x -> akm.a(lf.m, $$0x)).flatMap($$0x -> this.dR().d(lf.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csj.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      ix<dby> $$4 = $$0.t(this.dp());
      ix<cfk> $$6;
      if ($$3 instanceof cfj.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cfl.a(this.dR(), $$4);
         $$3 = new cfj.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avh v() {
      if (this.Z_()) {
         return avi.CK;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.eA() < 20.0F ? avi.CQ : avi.CN;
      } else {
         return avi.CI;
      }
   }

   @Override
   protected avh d(bqp $$0) {
      return this.h($$0) ? avi.CG : avi.CM;
   }

   @Override
   protected avh o_() {
      return avi.CJ;
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
         this.a((aqn)this.dP(), true);
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
               this.a(avi.CO, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dvw.u);
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
               int $$1 = (int)(ayf.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               eum $$2 = this.ds();

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
   public void a(bqp $$0) {
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
      return Math.min(0.5F + ayf.i($$0, this.co, this.cn) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ayf.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayf.a($$2 * (float) Math.PI) * ayf.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayf.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
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
   protected void f(bqp $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         ctq $$2 = this.fQ();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayf.f($$1), this, bsd.g);
         if (bru.b.a($$3, $$4) != bru.b.a(this.fQ())) {
            this.a(avi.CF);
            if (this.dP() instanceof aqn $$5) {
               $$5.a(new ku(ky.S, ctt.oq.w()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bqp $$0) {
      return this.gB() && !$$0.a(avz.D);
   }

   @Override
   public boolean C(brw $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bsq)this), (float)((int)this.g(bty.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(bty.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(bty.q).a(8.0);
      }
   }

   @Override
   protected void b(bqp $$0, float $$1) {
      this.a($$0, $$1, new bsd[]{bsd.g});
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      ctl $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.eA() < this.eR()) {
               $$2.a(1, $$0);
               cos $$5 = $$2.a(kb.u);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bpw.a(this.dP().x_());
            } else {
               if ($$3 instanceof csk $$7 && this.j($$0)) {
                  csj $$8 = $$7.c();
                  if ($$8 != this.gA()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bpw.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(ctt.or) && this.j($$0) && !this.gB() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bpw.a;
               } else if ($$2.a(ctt.rV) && this.j($$0) && this.gB() && !czc.f(this.fQ())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avi.az);
                  ctq $$9 = this.fQ();
                  this.m(ctq.i);
                  this.b($$9);
                  return bpw.a;
               } else if (crh.h.a().d().get().a($$2) && this.y() && this.gB() && this.j($$0) && this.fQ().m()) {
                  $$2.h(1);
                  this.a(avi.CH);
                  ctq $$10 = this.fQ();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bpw.a;
               } else {
                  bpw $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gp());
                     this.bn = false;
                     this.bR.n();
                     this.h(null);
                     return bpw.a;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(ctt.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bpw.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(ctt.rz) && !this.s() && !this.Z_();
         return $$4 ? bpw.b : bpw.d;
      }
   }

   private void h(cly $$0) {
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
   public boolean o(ctq $$0) {
      return $$0.a(awf.ad);
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

   public csj gA() {
      return csj.a(this.ao.a(cd));
   }

   public boolean gB() {
      return !this.fQ().e();
   }

   private void a(csj $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cfj b(aqn $$0, brq $$1) {
      cfj $$2 = bsc.bs.a((daz)$$0);
      if ($$2 != null && $$1 instanceof cfj $$3) {
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
   public boolean a(ceg $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cfj $$1)) {
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
   public boolean a(bsq $$0, bsq $$1) {
      if ($$0 instanceof ciq || $$0 instanceof ciy || $$0 instanceof chy) {
         return false;
      } else if ($$0 instanceof cfj $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cly $$3 && $$1 instanceof cly $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cgk $$5 && $$5.gE()) {
            return false;
         }

         if ($$0 instanceof btn $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cly $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsc<cfj> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.cf) && a($$1, $$3);
   }

   class a<T extends bsq> extends byv<T> {
      private final cfj j;

      public a(cfj $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cgn ? !this.j.s() && this.a((cgn)this.b) : false;
      }

      private boolean a(cgn $$0) {
         return $$0.gz() >= cfj.this.ah.a(5);
      }

      @Override
      public void c() {
         cfj.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cfj.this.h(null);
         super.e();
      }
   }

   public static class b extends brq.a {
      public final ix<cfk> a;

      public b(ix<cfk> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cah {
      public c(double $$0) {
         super(cfj.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
