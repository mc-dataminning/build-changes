import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brv extends brl implements bgy<brv.v> {
   private static final aby<Integer> bX = acb.a(brv.class, aca.b);
   private static final aby<Byte> bY = acb.a(brv.class, aca.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final aby<Optional<UUID>> cd = acb.a(brv.class, aca.q);
   private static final aby<Optional<UUID>> ce = acb.a(brv.class, aca.q);
   static final Predicate<bvh> cf = $$0 -> !$$0.r() && $$0.bs();
   private static final Predicate<bfj> cg = $$0 -> !($$0 instanceof bfz $$1) ? false : $$1.ef() != null && $$1.eg() < $$1.ag + 600;
   static final Predicate<bfj> ch = $$0 -> $$0 instanceof brq || $$0 instanceof bsf;
   private static final Predicate<bfj> ci = $$0 -> !$$0.bS() && bfm.e.test($$0);
   private static final int cj = 600;
   private bmv ck;
   private bmv cl;
   private bmv cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public brv(bfn<? extends brv> $$0, cmm $$1) {
      super($$0, $$1);
      this.bK = new brv.k();
      this.bL = new brv.m();
      this.a(dxp.p, 0.0F);
      this.a(dxp.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(cd, Optional.empty());
      this.am.a(ce, Optional.empty());
      this.am.a(bX, 0);
      this.am.a(bY, (byte)0);
   }

   @Override
   protected void x() {
      this.ck = new boo<>(this, brl.class, 10, false, false, $$0 -> $$0 instanceof brq || $$0 instanceof bsf);
      this.cl = new boo<>(this, bsm.class, 10, false, false, bsm.bU);
      this.cm = new boo<>(this, bri.class, 20, false, false, $$0 -> $$0 instanceof brk);
      this.bO.a(0, new brv.g());
      this.bO.a(0, new bmk(this, this.dI()));
      this.bO.a(1, new brv.b());
      this.bO.a(2, new brv.n(2.2));
      this.bO.a(3, new brv.e(1.0));
      this.bO.a(4, new bmc<>(this, byo.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.ct()) && !this.gk()));
      this.bO.a(4, new bmc<>(this, bso.class, 8.0F, 1.6, 1.4, $$0 -> !((bso)$$0).q() && !this.gk()));
      this.bO.a(4, new bmc<>(this, bsd.class, 8.0F, 1.6, 1.4, $$0 -> !this.gk()));
      this.bO.a(5, new brv.u());
      this.bO.a(6, new brv.o());
      this.bO.a(6, new brv.s(1.25));
      this.bO.a(7, new brv.l(1.2F, true));
      this.bO.a(7, new brv.t());
      this.bO.a(8, new brv.h(this, 1.25));
      this.bO.a(9, new brv.q(32, 200));
      this.bO.a(10, new brv.f(1.2F, 12, 1));
      this.bO.a(10, new bnb(this, 0.4F));
      this.bO.a(11, new boi(this, 1.0));
      this.bO.a(11, new brv.p());
      this.bO.a(12, new brv.j(this, byo.class, 24.0F));
      this.bO.a(13, new brv.r());
      this.bP.a(3, new brv.a(bfz.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.ct())));
   }

   @Override
   public amg d(cfz $$0) {
      return amh.ic;
   }

   @Override
   public void b_() {
      if (!this.dI().B && this.bs() && this.cV()) {
         this.cr++;
         cfz $$0 = this.c(bfo.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cfz $$1 = $$0.a(this.dI(), this);
               if (!$$1.b()) {
                  this.a(bfo.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.af.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dI().a(this, (byte)45);
            }
         }

         bfz $$2 = this.j();
         if ($$2 == null || !$$2.bs()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fy() || this.eT()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      }

      super.b_();
      if (this.gk() && this.af.i() < 0.05F) {
         this.a(amh.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eT() {
      return this.es();
   }

   private boolean l(cfz $$0) {
      return $$0.d().u() && this.j() == null && this.ay() && !this.fy();
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cfz $$3;
         if ($$2 < 0.05F) {
            $$3 = new cfz(cgc.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new cfz(cgc.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cfz(cgc.tJ) : new cfz(cgc.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new cfz(cgc.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new cfz(cgc.pP);
         } else {
            $$3 = new cfz(cgc.oF);
         }

         this.a(bfo.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cfz $$1 = this.c(bfo.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eei $$3 = new eei(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dA() * (float) (Math.PI / 180.0))
                  .b(-this.dy() * (float) (Math.PI / 180.0));
               this.dI().a(new ir(iv.O, $$1), this.dn() + this.bD().c / 2.0, this.dp(), this.dt() + this.bD().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.d, 0.3F).a(bhg.a, 10.0).a(bhg.b, 32.0).a(bhg.f, 2.0);
   }

   @Nullable
   public brv b(aif $$0, bfe $$1) {
      brv $$2 = bfn.N.a((cmm)$$0);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.r() : ((brv)$$1).r());
      }

      return $$2;
   }

   public static boolean c(bfn<brv> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.a_($$3.d()).a(amw.bU) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      he<cnk> $$5 = $$0.s(this.di());
      brv.v $$6 = brv.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof brv.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new brv.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof aif) {
         this.gi();
      }

      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gi() {
      if (this.r() == brv.v.a) {
         this.bP.a(4, this.ck);
         this.bP.a(4, this.cl);
         this.bP.a(6, this.cm);
      } else {
         this.bP.a(4, this.cm);
         this.bP.a(6, this.ck);
         this.bP.a(6, this.cl);
      }
   }

   @Override
   protected void a(byo $$0, bdw $$1, cfz $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return this.h_() ? $$1.b * 0.85F : 0.4F;
   }

   public brv.v r() {
      return brv.v.a(this.am.b(bX));
   }

   public void a(brv.v $$0) {
      this.am.b(bX, $$0.a());
   }

   List<UUID> gj() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.am.b(cd).orElse(null));
      $$0.add(this.am.b(ce).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.am.b(cd).isPresent()) {
         this.am.b(ce, Optional.ofNullable($$0));
      } else {
         this.am.b(cd, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gj();
      qx $$2 = new qx();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(rd.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fy());
      $$0.a("Type", this.r().c());
      $$0.a("Sitting", this.w());
      $$0.a("Crouching", this.bU());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      qx $$1 = $$0.c("Trusted", 11);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b(rd.a($$1.k($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(brv.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dI() instanceof aif) {
         this.gi();
      }
   }

   public boolean w() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean fY() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gk() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fy() {
      return this.t(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.b(bY, (byte)(this.am.b(bY) | $$0));
      } else {
         this.am.b(bY, (byte)(this.am.b(bY) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.am.b(bY) & $$0) != 0;
   }

   @Override
   public boolean f(cfz $$0) {
      bfo $$1 = bgb.h($$0);
      return !this.c($$1).b() ? false : $$1 == bfo.a && super.f($$0);
   }

   @Override
   public boolean j(cfz $$0) {
      cfu $$1 = $$0.d();
      cfz $$2 = this.c(bfo.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cfz $$0) {
      if (!$$0.b() && !this.dI().B) {
         bvh $$1 = new bvh(this.dI(), this.dn() + this.bD().c, this.dp() + 1.0, this.dt() + this.bD().e, $$0);
         $$1.b(40);
         $$1.c(this.ct());
         this.a(amh.ih, 1.0F, 1.0F);
         this.dI().b($$1);
      }
   }

   private void o(cfz $$0) {
      bvh $$1 = new bvh(this.dI(), this.dn(), this.dp(), this.dt(), $$0);
      this.dI().b($$1);
   }

   @Override
   protected void b(bvh $$0) {
      cfz $$1 = $$0.j();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bfo.a));
         this.a($$0);
         this.a(bfo.a, $$1.a(1));
         this.e(bfo.a);
         this.a($$0, $$1.L());
         $$0.ai();
         this.cr = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cV()) {
         boolean $$0 = this.aV();
         if ($$0 || this.j() != null || this.dI().Y()) {
            this.gl();
         }

         if ($$0 || this.fy()) {
            this.w(false);
         }

         if (this.fY() && this.dI().z.i() < 0.2F) {
            gu $$1 = this.di();
            dcb $$2 = this.dI().a_($$1);
            this.dI().c(2001, $$1, cpn.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gh()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F;
      } else {
         this.cn = this.cn + (0.0F - this.cn) * 0.4F;
      }

      this.cq = this.cp;
      if (this.bU()) {
         this.cp += 0.2F;
         if (this.cp > 3.0F) {
            this.cp = 3.0F;
         }
      } else {
         this.cp = 0.0F;
      }
   }

   @Override
   public boolean m(cfz $$0) {
      return $$0.a(ane.X);
   }

   @Override
   protected void a(byo $$0, bgb $$1) {
      ((brv)$$1).b($$0.ct());
   }

   public boolean ge() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gf() {
      return this.bk;
   }

   public boolean gg() {
      return this.cp == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bU() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gh() {
      return this.t(8);
   }

   public float D(float $$0) {
      return apa.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float E(float $$0) {
      return apa.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bfz $$0) {
      if (this.gk() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return apa.f(($$0 - 5.0F) * $$1);
   }

   void gl() {
      this.C(false);
   }

   void gm() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gn() {
      return !this.fy() && !this.w() && !this.fY();
   }

   @Override
   public void N() {
      amg $$0 = this.s();
      if ($$0 == amh.ie) {
         this.a($$0, 2.0F, this.eS());
      } else {
         super.N();
      }
   }

   @Nullable
   @Override
   protected amg s() {
      if (this.fy()) {
         return amh.if;
      } else {
         if (!this.dI().N() && this.af.i() < 0.1F) {
            List<byo> $$0 = this.dI().a(byo.class, this.cE().c(16.0, 16.0, 16.0), bfm.f);
            if ($$0.isEmpty()) {
               return amh.ie;
            }
         }

         return amh.hZ;
      }
   }

   @Nullable
   @Override
   protected amg d(ben $$0) {
      return amh.id;
   }

   @Nullable
   @Override
   protected amg g_() {
      return amh.ib;
   }

   boolean c(UUID $$0) {
      return this.gj().contains($$0);
   }

   @Override
   protected void g(ben $$0) {
      cfz $$1 = this.c(bfo.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bfo.a, cfz.b);
      }

      super.g($$0);
   }

   public static boolean a(brv $$0, bfz $$1) {
      double $$2 = $$1.dt() - $$0.dt();
      double $$3 = $$1.dn() - $$0.dn();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dI().a_(gu.a($$0.dn() + $$8, $$0.dp() + (double)$$9, $$0.dt() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)(0.55F * this.cF()), (double)(this.dd() * 0.4F));
   }

   class a extends boo<bfz> {
      @Nullable
      private bfz j;
      @Nullable
      private bfz k;
      private int l;

      public a(Class<bfz> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bfz> $$3) {
         super(brv.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ec().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : brv.this.gj()) {
               if ($$0 != null && brv.this.dI() instanceof aif && ((aif)brv.this.dI()).a($$0) instanceof bfz $$2) {
                  this.k = $$2;
                  this.j = $$2.ed();
                  int $$3 = $$2.ee();
                  return $$3 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void c() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.ee();
         }

         brv.this.a(amh.hY, 1.0F, 1.0F);
         brv.this.B(true);
         brv.this.gl();
         super.c();
      }
   }

   class b extends bmv {
      int a;

      public b() {
         this.a(EnumSet.of(bmv.a.b, bmv.a.c, bmv.a.a));
      }

      @Override
      public boolean a() {
         return brv.this.fY();
      }

      @Override
      public boolean b() {
         return this.a() && this.a > 0;
      }

      @Override
      public void c() {
         this.a = this.a(40);
      }

      @Override
      public void d() {
         brv.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bfz> {
      public boolean a(bfz $$0) {
         if ($$0 instanceof brv) {
            return false;
         } else if ($$0 instanceof brq || $$0 instanceof bsf || $$0 instanceof bwc) {
            return true;
         } else if ($$0 instanceof bgv) {
            return !((bgv)$$0).q();
         } else if (!($$0 instanceof byo) || !$$0.G_() && !((byo)$$0).f()) {
            return brv.this.c($$0.ct()) ? false : !$$0.fy() && !$$0.bS();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bmv {
      private final bqm b = bqm.a().a(12.0).d().a(brv.this.new c());

      protected boolean h() {
         gu $$0 = gu.a(brv.this.dn(), brv.this.cE().e, brv.this.dt());
         return !brv.this.dI().g($$0) && brv.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !brv.this.dI().a(bfz.class, this.b, brv.this, brv.this.cE().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bmh {
      public e(double $$0) {
         super(brv.this, $$0);
      }

      @Override
      public void c() {
         ((brv)this.a).gm();
         ((brv)this.c).gm();
         super.c();
      }

      @Override
      protected void g() {
         aif $$0 = (aif)this.b;
         brv $$1 = (brv)this.a.a($$0, (bfe)this.c);
         if ($$1 != null) {
            aig $$2 = this.a.gb();
            aig $$3 = this.c.gb();
            aig $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.ct());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.ct());
            }

            if ($$4 != null) {
               $$4.a(amr.P);
               ai.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gd();
            this.c.gd();
            $$1.c_(-24000);
            $$1.b(this.a.dn(), this.a.dp(), this.a.dt(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cmi.f)) {
               this.b.b(new bfp(this.b, this.a.dn(), this.a.dp(), this.a.dt(), this.a.ec().a(7) + 1));
            }
         }
      }
   }

   public class f extends bni {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(brv.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(cmp $$0, gu $$1) {
         dcb $$2 = $$0.a_($$1);
         return $$2.a(cpo.oi) && $$2.c(cxr.b) >= 2 || cqi.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && brv.this.af.i() < 0.05F) {
            brv.this.a(amh.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (brv.this.dI().X().b(cmi.c)) {
            dcb $$0 = brv.this.dI().a_(this.e);
            if ($$0.a(cpo.oi)) {
               this.b($$0);
            } else if (cqi.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dcb $$0) {
         cqi.a(brv.this, $$0, brv.this.dI(), this.e);
      }

      private void b(dcb $$0) {
         int $$1 = $$0.c(cxr.b);
         $$0.a(cxr.b, Integer.valueOf(1));
         int $$2 = 1 + brv.this.dI().z.a(2) + ($$1 == 3 ? 1 : 0);
         cfz $$3 = brv.this.c(bfo.a);
         if ($$3.b()) {
            brv.this.a(bfo.a, new cfz(cgc.vv));
            $$2--;
         }

         if ($$2 > 0) {
            cpn.a(brv.this.dI(), this.e, new cfz(cgc.vv, $$2));
         }

         brv.this.a(amh.xz, 1.0F, 1.0F);
         brv.this.dI().a(this.e, $$0.a(cxr.b, Integer.valueOf(1)), 2);
      }

      @Override
      public boolean a() {
         return !brv.this.fy() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         brv.this.w(false);
         super.c();
      }
   }

   class g extends bmp {
      public g() {
         super(brv.this);
      }

      @Override
      public void c() {
         super.c();
         brv.this.gm();
      }

      @Override
      public boolean a() {
         return brv.this.aV() && brv.this.b(anb.a) > 0.25 || brv.this.bi();
      }
   }

   class h extends bmu {
      private final brv e;

      public h(brv $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gk() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gk() && super.b();
      }

      @Override
      public void c() {
         this.e.gm();
         super.c();
      }
   }

   public static class i extends bfe.a {
      public final brv.v a;

      public i(brv.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bnd {
      public j(bgb $$0, Class<? extends bfz> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !brv.this.fY() && !brv.this.gh();
      }

      @Override
      public boolean b() {
         return super.b() && !brv.this.fY() && !brv.this.gh();
      }
   }

   public class k extends blx {
      public k() {
         super(brv.this);
      }

      @Override
      public void a() {
         if (!brv.this.fy()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !brv.this.ge() && !brv.this.bU() && !brv.this.gh() && !brv.this.fY();
      }
   }

   class l extends bnf {
      public l(double $$0, boolean $$1) {
         super(brv.this, $$0, $$1);
      }

      @Override
      protected void a(bfz $$0, double $$1) {
         double $$2 = this.a($$0);
         if ($$1 <= $$2 && this.i()) {
            this.h();
            this.a.z($$0);
            brv.this.a(amh.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         brv.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !brv.this.w() && !brv.this.fy() && !brv.this.bU() && !brv.this.fY() && super.a();
      }
   }

   class m extends bly {
      public m() {
         super(brv.this);
      }

      @Override
      public void a() {
         if (brv.this.gn()) {
            super.a();
         }
      }
   }

   class n extends bno {
      public n(double $$0) {
         super(brv.this, $$0);
      }

      @Override
      public boolean h() {
         return !brv.this.gk() && super.h();
      }
   }

   public class o extends bmz {
      @Override
      public boolean a() {
         if (!brv.this.gg()) {
            return false;
         } else {
            bfz $$0 = brv.this.j();
            if ($$0 != null && $$0.bs()) {
               if ($$0.cC() != $$0.cB()) {
                  return false;
               } else {
                  boolean $$1 = brv.a(brv.this, $$0);
                  if (!$$1) {
                     brv.this.J().a($$0, 0);
                     brv.this.y(false);
                     brv.this.z(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean b() {
         bfz $$0 = brv.this.j();
         if ($$0 != null && $$0.bs()) {
            double $$1 = brv.this.dl().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(brv.this.dA()) < 15.0F) || !brv.this.ay()) && !brv.this.fY();
         } else {
            return false;
         }
      }

      @Override
      public boolean J_() {
         return false;
      }

      @Override
      public void c() {
         brv.this.r(true);
         brv.this.x(true);
         brv.this.z(false);
         bfz $$0 = brv.this.j();
         if ($$0 != null) {
            brv.this.E().a($$0, 60.0F, 30.0F);
            eei $$1 = new eei($$0.dn() - brv.this.dn(), $$0.dp() - brv.this.dp(), $$0.dt() - brv.this.dt()).d();
            brv.this.f(brv.this.dl().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         brv.this.J().n();
      }

      @Override
      public void d() {
         brv.this.y(false);
         brv.this.cp = 0.0F;
         brv.this.cq = 0.0F;
         brv.this.z(false);
         brv.this.x(false);
      }

      @Override
      public void e() {
         bfz $$0 = brv.this.j();
         if ($$0 != null) {
            brv.this.E().a($$0, 60.0F, 30.0F);
         }

         if (!brv.this.fY()) {
            eei $$1 = brv.this.dl();
            if ($$1.d * $$1.d < 0.03F && brv.this.dA() != 0.0F) {
               brv.this.b_(apa.j(0.2F, brv.this.dA(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               brv.this.b_((float)$$3);
            }
         }

         if ($$0 != null && brv.this.e((bfj)$$0) <= 2.0F) {
            brv.this.z($$0);
         } else if (brv.this.dA() > 0.0F && brv.this.ay() && (float)brv.this.dl().d != 0.0F && brv.this.dI().a_(brv.this.di()).a(cpo.dN)) {
            brv.this.b_(60.0F);
            brv.this.h(null);
            brv.this.A(true);
         }
      }
   }

   class p extends bmv {
      public p() {
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         if (!brv.this.c(bfo.a).b()) {
            return false;
         } else if (brv.this.j() != null || brv.this.ed() != null) {
            return false;
         } else if (!brv.this.gn()) {
            return false;
         } else if (brv.this.ec().a(b(10)) != 0) {
            return false;
         } else {
            List<bvh> $$0 = brv.this.dI().a(bvh.class, brv.this.cE().c(8.0, 8.0, 8.0), brv.cf);
            return !$$0.isEmpty() && brv.this.c(bfo.a).b();
         }
      }

      @Override
      public void e() {
         List<bvh> $$0 = brv.this.dI().a(bvh.class, brv.this.cE().c(8.0, 8.0, 8.0), brv.cf);
         cfz $$1 = brv.this.c(bfo.a);
         if ($$1.b() && !$$0.isEmpty()) {
            brv.this.J().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<bvh> $$0 = brv.this.dI().a(bvh.class, brv.this.cE().c(8.0, 8.0, 8.0), brv.cf);
         if (!$$0.isEmpty()) {
            brv.this.J().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bob {
      public q(int $$0, int $$1) {
         super(brv.this, $$1);
      }

      @Override
      public void c() {
         brv.this.gm();
         super.c();
      }

      @Override
      public boolean a() {
         return super.a() && this.h();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      private boolean h() {
         return !brv.this.fy() && !brv.this.w() && !brv.this.gk() && brv.this.j() == null;
      }
   }

   class r extends brv.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      }

      @Override
      public boolean a() {
         return brv.this.ed() == null
            && brv.this.ec().i() < 0.02F
            && !brv.this.fy()
            && brv.this.j() == null
            && brv.this.J().l()
            && !this.i()
            && !brv.this.ge()
            && !brv.this.bU();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + brv.this.ec().a(3);
         brv.this.w(true);
         brv.this.J().n();
      }

      @Override
      public void d() {
         brv.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         brv.this.E().a(brv.this.dn() + this.c, brv.this.dr(), brv.this.dt() + this.d, (float)brv.this.fC(), (float)brv.this.X());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * brv.this.ec().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + brv.this.ec().a(20));
      }
   }

   class s extends bmo {
      private int c = b(100);

      public s(double $$0) {
         super(brv.this, $$0);
      }

      @Override
      public boolean a() {
         if (!brv.this.fy() && this.a.j() == null) {
            if (brv.this.dI().Y() && brv.this.dI().g(this.a.di())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gu $$0 = this.a.di();
               return brv.this.dI().N() && brv.this.dI().g($$0) && !((aif)brv.this.dI()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         brv.this.gm();
         super.c();
      }
   }

   class t extends brv.d {
      private static final int c = b(140);
      private int d = brv.this.af.a(c);

      public t() {
         this.a(EnumSet.of(bmv.a.a, bmv.a.b, bmv.a.c));
      }

      @Override
      public boolean a() {
         return brv.this.bl == 0.0F && brv.this.bm == 0.0F && brv.this.bn == 0.0F ? this.k() || brv.this.fy() : false;
      }

      @Override
      public boolean b() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return brv.this.dI().N() && this.h() && !this.i() && !brv.this.az;
         }
      }

      @Override
      public void d() {
         this.d = brv.this.af.a(c);
         brv.this.gm();
      }

      @Override
      public void c() {
         brv.this.w(false);
         brv.this.y(false);
         brv.this.z(false);
         brv.this.r(false);
         brv.this.C(true);
         brv.this.J().n();
         brv.this.G().a(brv.this.dn(), brv.this.dp(), brv.this.dt(), 0.0);
      }
   }

   class u extends bmv {
      public u() {
         this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      }

      @Override
      public boolean a() {
         if (brv.this.fy()) {
            return false;
         } else {
            bfz $$0 = brv.this.j();
            return $$0 != null && $$0.bs() && brv.ch.test($$0) && brv.this.f($$0) > 36.0 && !brv.this.bU() && !brv.this.gh() && !brv.this.bk;
         }
      }

      @Override
      public void c() {
         brv.this.w(false);
         brv.this.A(false);
      }

      @Override
      public void d() {
         bfz $$0 = brv.this.j();
         if ($$0 != null && brv.a(brv.this, $$0)) {
            brv.this.z(true);
            brv.this.y(true);
            brv.this.J().n();
            brv.this.E().a($$0, (float)brv.this.fC(), (float)brv.this.X());
         } else {
            brv.this.z(false);
            brv.this.y(false);
         }
      }

      @Override
      public void e() {
         bfz $$0 = brv.this.j();
         if ($$0 != null) {
            brv.this.E().a($$0, (float)brv.this.fC(), (float)brv.this.X());
            if (brv.this.f($$0) <= 36.0) {
               brv.this.z(true);
               brv.this.y(true);
               brv.this.J().n();
            } else {
               brv.this.J().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements apr {
      a(0, "red"),
      b(1, "snow");

      public static final apr.a<brv.v> c = apr.a(brv.v::values);
      private static final IntFunction<brv.v> d = anu.a(brv.v::a, values(), anu.a.a);
      private final int e;
      private final String f;

      private v(int $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }

      public int a() {
         return this.e;
      }

      public static brv.v a(String $$0) {
         return c.a($$0, a);
      }

      public static brv.v a(int $$0) {
         return d.apply($$0);
      }

      public static brv.v a(he<cnk> $$0) {
         return $$0.a(amv.aq) ? b : a;
      }
   }
}
