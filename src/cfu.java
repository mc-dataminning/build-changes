import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfu extends bty implements bth, bub<jj<cfv>> {
   private static final ajp<Boolean> ce = ajt.a(cfu.class, ajr.k);
   private static final ajp<Integer> cf = ajt.a(cfu.class, ajr.b);
   private static final ajp<Integer> cg = ajt.a(cfu.class, ajr.b);
   private static final ajp<jj<cfv>> ch = ajt.a(cfu.class, ajr.y);
   public static final Predicate<btb> cd = $$0 -> {
      bsm<?> $$1 = $$0.al();
      return $$1 == bsm.aJ || $$1 == bsm.aG || $$1 == bsm.Q;
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
   private static final bpr cr = azh.a(20, 39);
   @Nullable
   private UUID cs;

   public cfu(bsm<? extends cfu> $$0, dcf $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eoy.f, -1.0F);
      this.a(eoy.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzt(this));
      this.bU.a(1, new cfu.c(1.5));
      this.bU.a(2, new cbe(this));
      this.bU.a(3, new cfu.a<>(this, cgy.class, 24.0F, 1.5, 1.5));
      this.bU.a(4, new caf(this, 0.4F));
      this.bU.a(5, new caj(this, 1.0, true));
      this.bU.a(6, new bzx(this, 1.0, 10.0F, 2.0F, false));
      this.bU.a(7, new bzl(this, 1.0));
      this.bU.a(8, new cbm(this, 1.0));
      this.bU.a(9, new bzh(this, 8.0F));
      this.bU.a(10, new cah(this, cmk.class, 8.0F));
      this.bU.a(10, new cau(this));
      this.bV.a(1, new cbw(this));
      this.bV.a(2, new cbx(this));
      this.bV.a(3, new cbr(this).a());
      this.bV.a(4, new cbs<>(this, cmk.class, 10, true, false, this::a_));
      this.bV.a(5, new cbv<>(this, cer.class, false, cd));
      this.bV.a(6, new cbv<>(this, cfs.class, false, cfs.ca));
      this.bV.a(7, new cbs<>(this, ciy.class, false));
      this.bV.a(8, new cby<>(this, true));
   }

   public akk gu() {
      cfv $$0 = this.gv().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public jj<cfv> gv() {
      return this.ao.a(ch);
   }

   @Override
   public void i(jj<cfv> $$0) {
      this.ao.a(ch, $$0);
   }

   public static bui.a gw() {
      return btd.A().a(buj.v, 0.3F).a(buj.s, 8.0).a(buj.c, 4.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      jx $$1 = this.dS();
      jw<cfv> $$2 = $$1.d(lr.m);
      $$0.a(ch, $$2.b(cfw.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, csv.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.CS, 0.15F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gz().a());
      this.gv().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.m, $$0x)).flatMap($$0x -> this.dS().d(lr.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csv.a($$0.h("CollarColor")));
      }

      this.a(this.dQ(), $$0);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      jj<ddf> $$4 = $$0.t(this.dq());
      jj<cfv> $$6;
      if ($$3 instanceof cfu.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cfw.a(this.dS(), $$4);
         $$3 = new cfu.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avg v() {
      if (this.Z_()) {
         return avh.CN;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.ex() < 20.0F ? avh.CT : avh.CQ;
      } else {
         return avh.CL;
      }
   }

   @Override
   protected avg d(bqz $$0) {
      return this.h($$0) ? avh.CJ : avh.CP;
   }

   @Override
   protected avg o_() {
      return avh.CM;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dQ().B && this.cn && !this.co && !this.gk() && this.aF()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dQ().a(this, (byte)8);
      }

      if (!this.dQ().B) {
         this.a((aqm)this.dQ(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bE()) {
         this.cm = this.cl;
         if (this.gB()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bh()) {
            this.cn = true;
            if (this.co && !this.dQ().B) {
               this.dQ().a(this, (byte)56);
               this.gC();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(avh.CR, this.fb(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dxg.u);
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
               float $$0 = (float)this.dx();
               int $$1 = (int)(ayg.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               ewf $$2 = this.dt();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dk() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dk() * 0.5F;
                  this.dQ().a(lj.am, this.dv() + (double)$$4, (double)($$0 + 0.8F), this.dB() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gC() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bqz $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public boolean gx() {
      return this.cn;
   }

   public float H(float $$0) {
      return Math.min(0.75F + ayg.i($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float f(float $$0, float $$1) {
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
      return this.y() ? 20 : super.aa();
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(bqz $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cuc $$2 = this.fO();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayg.f($$1), this, bsn.g);
         if (bse.b.a($$3, $$4) != bse.b.a(this.fO())) {
            this.a(avh.CI);
            if (this.dQ() instanceof aqm $$5) {
               $$5.a(new lf(lj.S, cuf.oq.w()), this.dv(), this.dx() + 1.0, this.dB(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bqz $$0) {
      return this.gA() && !$$0.a(avy.D);
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(buj.s).a(40.0);
         this.u(40.0F);
      } else {
         this.f(buj.s).a(8.0);
      }
   }

   @Override
   protected void b(bqz $$0, float $$1) {
      this.a($$0, $$1, new bsn[]{bsn.g});
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      ctx $$3 = $$2.g();
      if (!this.dQ().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.ex() < this.eO()) {
               $$2.a(1, $$0);
               cpe $$5 = $$2.a(kn.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqg.a(this.dQ().x_());
            } else {
               if ($$3 instanceof csw $$7 && this.j($$0)) {
                  csv $$8 = $$7.c();
                  if ($$8 != this.gz()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqg.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cuf.or) && this.j($$0) && !this.gA() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqg.a;
               } else if ($$2.a(cuf.rV) && this.j($$0) && this.gA() && (!czn.a(this.fO(), czm.E) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avh.az);
                  cuc $$9 = this.fO();
                  this.m(cuc.l);
                  this.b($$9);
                  return bqg.a;
               } else if (cru.h.a().d().get().a($$2) && this.y() && this.gA() && this.j($$0) && this.fO().m()) {
                  $$2.h(1);
                  this.a(avh.CK);
                  cuc $$10 = this.fO();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqg.a;
               } else {
                  bqg $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.go());
                     this.bn = false;
                     this.bT.n();
                     this.h(null);
                     return bqg.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cuf.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqg.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cuf.rz) && !this.s() && !this.Z_();
         return $$4 ? bqg.c : bqg.e;
      }
   }

   private void h(cmk $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bT.n();
         this.h(null);
         this.y(true);
         this.dQ().a(this, (byte)7);
      } else {
         this.dQ().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gC();
      } else {
         super.b($$0);
      }
   }

   public float gy() {
      if (this.Z_()) {
         return 1.5393804F;
      } else if (this.s()) {
         float $$0 = this.eO();
         float $$1 = ($$0 - this.ex()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ad);
   }

   @Override
   public int fN() {
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

   public csv gz() {
      return csv.a(this.ao.a(cf));
   }

   public boolean gA() {
      return !this.fO().e();
   }

   private void a(csv $$0) {
      this.ao.a(cf, $$0.a());
   }

   @Nullable
   public cfu b(aqm $$0, bsa $$1) {
      cfu $$2 = bsm.bs.a((dcf)$$0);
      if ($$2 != null && $$1 instanceof cfu $$3) {
         if (this.ah.h()) {
            $$2.i(this.gv());
         } else {
            $$2.i($$3.gv());
         }

         if (this.s()) {
            $$2.b(this.W_());
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

   public void z(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public boolean a(cer $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cfu $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.y() ? false : this.gs() && $$1.gs();
      }
   }

   public boolean gB() {
      return this.ao.a(ce);
   }

   @Override
   public boolean a(btb $$0, btb $$1) {
      if ($$0 instanceof cjc || $$0 instanceof cjk || $$0 instanceof cij) {
         return false;
      } else if ($$0 instanceof cfu $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cmk $$3 && $$1 instanceof cmk $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cgv $$5 && $$5.gD()) {
            return false;
         }

         if ($$0 instanceof bty $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   public static boolean c(bsm<cfu> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cf) && a($$1, $$3);
   }

   class a<T extends btb> extends bzg<T> {
      private final cfu j;

      public a(final cfu $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cgy ? !this.j.s() && this.a((cgy)this.b) : false;
      }

      private boolean a(cgy $$0) {
         return $$0.gy() >= cfu.this.ah.a(5);
      }

      @Override
      public void c() {
         cfu.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cfu.this.h(null);
         super.e();
      }
   }

   public static class b extends bsa.a {
      public final jj<cfv> a;

      public b(jj<cfv> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cas {
      public c(final double $$0) {
         super(cfu.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dF() || this.b.bR();
      }
   }
}
