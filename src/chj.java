import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chj extends cgz implements bwi<chj.v> {
   private static final ajy<Integer> cc = akc.a(chj.class, aka.b);
   private static final ajy<Byte> cd = akc.a(chj.class, aka.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajy<Optional<UUID>> ci = akc.a(chj.class, aka.r);
   private static final ajy<Optional<UUID>> cj = akc.a(chj.class, aka.r);
   static final Predicate<cld> ck = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<bum> cl = $$0 -> !($$0 instanceof bvi $$1) ? false : $$1.er() != null && $$1.es() < $$1.af + 600;
   static final Predicate<bum> cm = $$0 -> $$0 instanceof che || $$0 instanceof cht;
   private static final Predicate<bum> cn = $$0 -> !$$0.cg() && bur.e.test($$0);
   private static final int co = 600;
   private static final bup cp = but.aa.n().a(0.5F).b(0.2975F);
   private ccg cq;
   private ccg cr;
   private ccg cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chj(but<? extends chj> $$0, dgj $$1) {
      super($$0, $$1);
      this.bO = new chj.k();
      this.bP = new chj.m();
      this.a(etr.p, 0.0F);
      this.a(etr.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void E() {
      this.cq = new cdz<>(this, cgz.class, 10, false, false, ($$0, $$1) -> $$0 instanceof che || $$0 instanceof cht);
      this.cr = new cdz<>(this, cia.class, 10, false, false, cia.bY);
      this.cs = new cdz<>(this, cgv.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cgx);
      this.bS.a(0, new chj.g());
      this.bS.a(0, new cbv(this, this.dV()));
      this.bS.a(1, new chj.b());
      this.bS.a(2, new chj.n(2.2));
      this.bS.a(3, new chj.e(1.0));
      this.bS.a(4, new cbn<>(this, coy.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cG()) && !this.gG()));
      this.bS.a(4, new cbn<>(this, cic.class, 8.0F, 1.6, 1.4, $$0 -> !((cic)$$0).p() && !this.gG()));
      this.bS.a(4, new cbn<>(this, chr.class, 8.0F, 1.6, 1.4, $$0 -> !this.gG()));
      this.bS.a(5, new chj.u());
      this.bS.a(6, new chj.o());
      this.bS.a(6, new chj.s(1.25));
      this.bS.a(7, new chj.l(1.2F, true));
      this.bS.a(7, new chj.t());
      this.bS.a(8, new chj.h(this, 1.25));
      this.bS.a(9, new chj.q(32, 200));
      this.bS.a(10, new chj.f(1.2F, 12, 1));
      this.bS.a(10, new ccm(this, 0.4F));
      this.bS.a(11, new cdt(this, 1.0));
      this.bS.a(11, new chj.p());
      this.bS.a(12, new chj.j(this, coy.class, 24.0F));
      this.bS.a(13, new chj.r());
      this.bT.a(3, new chj.a(bvi.class, false, false, ($$0, $$1) -> cl.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL() && this.dj()) {
         this.cx++;
         cwq $$0 = this.a(buu.a);
         if (this.i($$0)) {
            if (this.cx > 600) {
               cwq $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(buu.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ae.i() < 0.1F) {
               this.gy();
               this.dV().a(this, (byte)45);
            }
         }

         bvi $$2 = this.O_();
         if ($$2 == null || !$$2.bL()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fR() || this.fi()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      }

      super.d_();
      if (this.gG() && this.ae.i() < 0.05F) {
         this.a(awa.jF, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fi() {
      return this.eE();
   }

   private boolean i(cwq $$0) {
      return $$0.b(kv.w) && this.O_() == null && this.aJ() && !this.fR();
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cwq $$3;
         if ($$2 < 0.05F) {
            $$3 = new cwq(cwu.pf);
         } else if ($$2 < 0.2F) {
            $$3 = new cwq(cwu.ry);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cwq(cwu.vD) : new cwq(cwu.vE);
         } else if ($$2 < 0.6F) {
            $$3 = new cwq(cwu.qb);
         } else if ($$2 < 0.8F) {
            $$3 = new cwq(cwu.rk);
         } else {
            $$3 = new cwq(cwu.pY);
         }

         this.a(buu.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwq $$1 = this.a(buu.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fbb $$3 = new fbb(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lp(lt.T, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.v, 0.3F).a(bwq.s, 10.0).a(bwq.c, 2.0).a(bwq.x, 5.0).a(bwq.m, 32.0);
   }

   @Nullable
   public chj b(ard $$0, bud $$1) {
      chj $$2 = but.aa.a($$0, bus.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((chj)$$1).t());
      }

      return $$2;
   }

   public static boolean c(but<chj> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      jr<dhl> $$4 = $$0.t(this.dv());
      chj.v $$5 = chj.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chj.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chj.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof ard) {
         this.gE();
      }

      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gE() {
      if (this.t() == chj.v.a) {
         this.bT.a(4, this.cq);
         this.bT.a(4, this.cr);
         this.bT.a(6, this.cs);
      } else {
         this.bT.a(4, this.cs);
         this.bT.a(6, this.cq);
         this.bT.a(6, this.cr);
      }
   }

   @Override
   protected void gy() {
      this.a(awa.jJ, 1.0F, 1.0F);
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? cp : super.e($$0);
   }

   public chj.v t() {
      return chj.v.a(this.al.a(cc));
   }

   public void a(chj.v $$0) {
      this.al.a(cc, $$0.a());
   }

   List<UUID> gF() {
      Optional<UUID> $$0 = this.al.a(ci);
      Optional<UUID> $$1 = this.al.a(cj);
      if ($$0.isPresent() && $$1.isPresent()) {
         return List.of($$0.get(), $$1.get());
      } else if ($$0.isPresent()) {
         return List.of($$0.get());
      } else {
         return $$1.isPresent() ? List.of($$1.get()) : List.of();
      }
   }

   void b(@Nullable UUID $$0) {
      if (this.al.a(ci).isPresent()) {
         this.al.a(cj, Optional.ofNullable($$0));
      } else {
         this.al.a(ci, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gF();
      tw $$2 = new tw();

      for (UUID $$3 : $$1) {
         $$2.add(uf.a($$3));
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fR());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);

      for (un $$2 : $$0.c("Trusted", 11)) {
         this.b(uf.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(chj.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dV() instanceof ard) {
         this.gE();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gs() {
      return this.s(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gG() {
      return this.s(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fR() {
      return this.s(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(cd, (byte)(this.al.a(cd) | $$0));
      } else {
         this.al.a(cd, (byte)(this.al.a(cd) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(cd) & $$0) != 0;
   }

   @Override
   protected boolean f(buu $$0) {
      return $$0 == buu.a && this.fN();
   }

   @Override
   public boolean g(cwq $$0) {
      cwq $$1 = this.a(buu.a);
      return $$1.f() || this.cx > 0 && $$0.b(kv.w) && !$$1.b(kv.w);
   }

   private void k(cwq $$0) {
      if (!$$0.f() && !this.dV().C) {
         cld $$1 = new cld(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jO, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(cwq $$0) {
      cld $$1 = new cld(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(ard $$0, cld $$1) {
      cwq $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(buu.a));
         this.a($$1);
         this.a(buu.a, $$2.a(1));
         this.g(buu.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.cx = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bj();
         if ($$0 || this.O_() != null || this.dV().af()) {
            this.gH();
         }

         if ($$0 || this.fR()) {
            this.x(false);
         }

         if (this.gs() && this.dV().A.i() < 0.2F) {
            ji $$1 = this.dv();
            dwy $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, djn.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gw()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.ci()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.ac);
   }

   @Override
   protected void a(coy $$0, bvk $$1) {
      ((chj)$$1).b($$0.cG());
   }

   public boolean gt() {
      return this.s(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.bm;
   }

   public boolean gv() {
      return this.cv == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ci() {
      return this.s(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gw() {
      return this.s(8);
   }

   public float J(float $$0) {
      return ayz.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bvi $$0) {
      if (this.gG() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gH() {
      this.D(false);
   }

   void gI() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gJ() {
      return !this.fR() && !this.x() && !this.gs();
   }

   @Override
   public void U() {
      avz $$0 = this.u();
      if ($$0 == awa.jL) {
         this.a($$0, 2.0F, this.fh());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.fR()) {
         return awa.jM;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<coy> $$0 = this.dV().a(coy.class, this.cR().c(16.0, 16.0, 16.0), bur.f);
            if ($$0.isEmpty()) {
               return awa.jL;
            }
         }

         return awa.jG;
      }
   }

   @Nullable
   @Override
   protected avz e(btc $$0) {
      return awa.jK;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.jI;
   }

   boolean c(UUID $$0) {
      return this.gF().contains($$0);
   }

   @Override
   protected void b(ard $$0, btc $$1) {
      cwq $$2 = this.a(buu.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(buu.a, cwq.j);
      }

      super.b($$0, $$1);
   }

   public static boolean a(chj $$0, bvi $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(ji.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cdz<bvi> {
      @Nullable
      private bvi j;
      @Nullable
      private bvi k;
      private int l;

      public a(final Class<bvi> $$0, final boolean $$1, final boolean $$2, @Nullable final cfz.a $$3) {
         super(chj.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            ard $$0 = a(chj.this.dV());

            for (UUID $$1 : chj.this.gF()) {
               if ($$0.a($$1) instanceof bvi $$3) {
                  this.k = $$3;
                  this.j = $$3.ep();
                  int $$4 = $$3.eq();
                  return $$4 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void d() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.eq();
         }

         chj.this.a(awa.jF, 1.0F, 1.0F);
         chj.this.C(true);
         chj.this.gH();
         super.d();
      }
   }

   class b extends ccg {
      int a;

      public b() {
         this.a(EnumSet.of(ccg.a.b, ccg.a.c, ccg.a.a));
      }

      @Override
      public boolean b() {
         return chj.this.gs();
      }

      @Override
      public boolean c() {
         return this.b() && this.a > 0;
      }

      @Override
      public void d() {
         this.a = this.a(40);
      }

      @Override
      public void e() {
         chj.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cfz.a {
      @Override
      public boolean test(bvi $$0, ard $$1) {
         if ($$0 instanceof chj) {
            return false;
         } else if ($$0 instanceof che || $$0 instanceof cht || $$0 instanceof clz) {
            return true;
         } else if ($$0 instanceof bwf) {
            return !((bwf)$$0).p();
         } else if (!($$0 instanceof coy) || !$$0.Z_() && !((coy)$$0).b()) {
            return chj.this.c($$0.cG()) ? false : !$$0.fR() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends ccg {
      private final cfz b = cfz.a().a(12.0).d().a(chj.this.new c());

      protected boolean h() {
         ji $$0 = ji.a(chj.this.dA(), chj.this.cR().e, chj.this.dG());
         return !chj.this.dV().h($$0) && chj.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(chj.this.dV()).a(bvi.class, this.b, chj.this, chj.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbs {
      public e(final double $$0) {
         super(chj.this, $$0);
      }

      @Override
      public void d() {
         ((chj)this.a).gI();
         ((chj)this.c).gI();
         super.d();
      }

      @Override
      protected void g() {
         ard $$0 = this.b;
         chj $$1 = (chj)this.a.a($$0, (bud)this.c);
         if ($$1 != null) {
            are $$2 = this.a.gB();
            are $$3 = this.c.gB();
            are $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cG());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cG());
            }

            if ($$4 != null) {
               $$4.a(awk.P);
               ap.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gD();
            this.c.gD();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().b(dgf.f)) {
               this.b.b(new buy(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cct {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chj.this, $$1, $$2, $$3);
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
      protected boolean a(dgm $$0, ji $$1) {
         dwy $$2 = $$0.a_($$1);
         return $$2.a(djp.oK) && $$2.c(drv.c) >= 2 || dkk.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && chj.this.ae.i() < 0.05F) {
            chj.this.a(awa.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(chj.this.dV()).O().b(dgf.c)) {
            dwy $$0 = chj.this.dV().a_(this.e);
            if ($$0.a(djp.oK)) {
               this.b($$0);
            } else if (dkk.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dwy $$0) {
         dkk.a(chj.this, $$0, chj.this.dV(), this.e);
      }

      private void b(dwy $$0) {
         int $$1 = $$0.c(drv.c);
         $$0.b(drv.c, Integer.valueOf(1));
         int $$2 = 1 + chj.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwq $$3 = chj.this.a(buu.a);
         if ($$3.f()) {
            chj.this.a(buu.a, new cwq(cwu.xv));
            $$2--;
         }

         if ($$2 > 0) {
            djn.a(chj.this.dV(), this.e, new cwq(cwu.xv, $$2));
         }

         chj.this.a(awa.Ag, 1.0F, 1.0F);
         chj.this.dV().a(this.e, $$0.b(drv.c, Integer.valueOf(1)), 2);
         chj.this.dV().a(ebu.c, this.e, ebu.a.a(chj.this));
      }

      @Override
      public boolean b() {
         return !chj.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chj.this.x(false);
         super.d();
      }
   }

   class g extends cca {
      public g() {
         super(chj.this);
      }

      @Override
      public void d() {
         super.d();
         chj.this.gI();
      }

      @Override
      public boolean b() {
         return chj.this.bj() && chj.this.b(awv.a) > 0.25 || chj.this.bx();
      }
   }

   static class h extends ccf {
      private final chj d;

      public h(chj $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gG() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gG() && super.c();
      }

      @Override
      public void d() {
         this.d.gI();
         super.d();
      }
   }

   public static class i extends bud.a {
      public final chj.v a;

      public i(chj.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cco {
      public j(final bvk $$0, final Class<? extends bvi> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chj.this.gs() && !chj.this.gw();
      }

      @Override
      public boolean c() {
         return super.c() && !chj.this.gs() && !chj.this.gw();
      }
   }

   public class k extends cbi {
      public k() {
         super(chj.this);
      }

      @Override
      public void a() {
         if (!chj.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chj.this.gt() && !chj.this.ci() && !chj.this.gw() && !chj.this.gs();
      }
   }

   class l extends ccq {
      public l(final double $$0, final boolean $$1) {
         super(chj.this, $$0, $$1);
      }

      @Override
      protected void a(bvi $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chj.this.a(awa.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chj.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chj.this.x() && !chj.this.fR() && !chj.this.ci() && !chj.this.gs() && super.b();
      }
   }

   class m extends cbj {
      public m() {
         super(chj.this);
      }

      @Override
      public void a() {
         if (chj.this.gJ()) {
            super.a();
         }
      }
   }

   class n extends ccz {
      public n(final double $$0) {
         super(chj.this, $$0);
      }

      @Override
      public boolean h() {
         return !chj.this.gG() && super.h();
      }
   }

   public class o extends cck {
      @Override
      public boolean b() {
         if (!chj.this.gv()) {
            return false;
         } else {
            bvi $$0 = chj.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = chj.a(chj.this, $$0);
                  if (!$$1) {
                     chj.this.P().a($$0, 0);
                     chj.this.z(false);
                     chj.this.A(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean c() {
         bvi $$0 = chj.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = chj.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chj.this.dN()) < 15.0F) || !chj.this.aJ()) && !chj.this.gs();
         } else {
            return false;
         }
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public void d() {
         chj.this.t(true);
         chj.this.y(true);
         chj.this.A(false);
         bvi $$0 = chj.this.O_();
         if ($$0 != null) {
            chj.this.L().a($$0, 60.0F, 30.0F);
            fbb $$1 = new fbb($$0.dA() - chj.this.dA(), $$0.dC() - chj.this.dC(), $$0.dG() - chj.this.dG()).d();
            chj.this.i(chj.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chj.this.P().m();
      }

      @Override
      public void e() {
         chj.this.z(false);
         chj.this.cv = 0.0F;
         chj.this.cw = 0.0F;
         chj.this.A(false);
         chj.this.y(false);
      }

      @Override
      public void a() {
         bvi $$0 = chj.this.O_();
         if ($$0 != null) {
            chj.this.L().a($$0, 60.0F, 30.0F);
         }

         if (!chj.this.gs()) {
            fbb $$1 = chj.this.dy();
            if ($$1.e * $$1.e < 0.03F && chj.this.dN() != 0.0F) {
               chj.this.w(ayz.i(0.2F, chj.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chj.this.w((float)$$3);
            }
         }

         if ($$0 != null && chj.this.f($$0) <= 2.0F) {
            chj.this.c(a(chj.this.dV()), $$0);
         } else if (chj.this.dN() > 0.0F && chj.this.aJ() && (float)chj.this.dy().e != 0.0F && chj.this.dV().a_(chj.this.dv()).a(djp.ea)) {
            chj.this.w(60.0F);
            chj.this.h(null);
            chj.this.B(true);
         }
      }
   }

   class p extends ccg {
      public p() {
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         if (!chj.this.a(buu.a).f()) {
            return false;
         } else if (chj.this.O_() != null || chj.this.ep() != null) {
            return false;
         } else if (!chj.this.gJ()) {
            return false;
         } else if (chj.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<cld> $$0 = chj.this.dV().a(cld.class, chj.this.cR().c(8.0, 8.0, 8.0), chj.ck);
            return !$$0.isEmpty() && chj.this.a(buu.a).f();
         }
      }

      @Override
      public void a() {
         List<cld> $$0 = chj.this.dV().a(cld.class, chj.this.cR().c(8.0, 8.0, 8.0), chj.ck);
         cwq $$1 = chj.this.a(buu.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chj.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cld> $$0 = chj.this.dV().a(cld.class, chj.this.cR().c(8.0, 8.0, 8.0), chj.ck);
         if (!$$0.isEmpty()) {
            chj.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cdm {
      public q(final int $$0, final int $$1) {
         super(chj.this, $$1);
      }

      @Override
      public void d() {
         chj.this.gI();
         super.d();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      @Override
      public boolean c() {
         return super.c() && this.h();
      }

      private boolean h() {
         return !chj.this.fR() && !chj.this.x() && !chj.this.gG() && chj.this.O_() == null;
      }
   }

   class r extends chj.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean b() {
         return chj.this.ep() == null
            && chj.this.dY().i() < 0.02F
            && !chj.this.fR()
            && chj.this.O_() == null
            && chj.this.P().k()
            && !this.i()
            && !chj.this.gt()
            && !chj.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chj.this.dY().a(3);
         chj.this.x(true);
         chj.this.P().m();
      }

      @Override
      public void e() {
         chj.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chj.this.L().a(chj.this.dA() + this.c, chj.this.dE(), chj.this.dG() + this.d, (float)chj.this.af(), (float)chj.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chj.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chj.this.dY().a(20));
      }
   }

   class s extends cbz {
      private int c = b(100);

      public s(final double $$0) {
         super(chj.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chj.this.fR() && this.a.O_() == null) {
            if (chj.this.dV().af() && chj.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ji $$0 = this.a.dv();
               return chj.this.dV().V() && chj.this.dV().h($$0) && !((ard)chj.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chj.this.gI();
         super.d();
      }
   }

   class t extends chj.d {
      private static final int c = b(140);
      private int d = chj.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ccg.a.a, ccg.a.b, ccg.a.c));
      }

      @Override
      public boolean b() {
         return chj.this.bn == 0.0F && chj.this.bo == 0.0F && chj.this.bp == 0.0F ? this.k() || chj.this.fR() : false;
      }

      @Override
      public boolean c() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return chj.this.dV().V() && this.h() && !this.i() && !chj.this.av;
         }
      }

      @Override
      public void e() {
         this.d = chj.this.ae.a(c);
         chj.this.gI();
      }

      @Override
      public void d() {
         chj.this.x(false);
         chj.this.z(false);
         chj.this.A(false);
         chj.this.t(false);
         chj.this.D(true);
         chj.this.P().m();
         chj.this.N().a(chj.this.dA(), chj.this.dC(), chj.this.dG(), 0.0);
      }
   }

   class u extends ccg {
      public u() {
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean b() {
         if (chj.this.fR()) {
            return false;
         } else {
            bvi $$0 = chj.this.O_();
            return $$0 != null && $$0.bL() && chj.cm.test($$0) && chj.this.g($$0) > 36.0 && !chj.this.ci() && !chj.this.gw() && !chj.this.bm;
         }
      }

      @Override
      public void d() {
         chj.this.x(false);
         chj.this.B(false);
      }

      @Override
      public void e() {
         bvi $$0 = chj.this.O_();
         if ($$0 != null && chj.a(chj.this, $$0)) {
            chj.this.A(true);
            chj.this.z(true);
            chj.this.P().m();
            chj.this.L().a($$0, (float)chj.this.af(), (float)chj.this.ad());
         } else {
            chj.this.A(false);
            chj.this.z(false);
         }
      }

      @Override
      public void a() {
         bvi $$0 = chj.this.O_();
         if ($$0 != null) {
            chj.this.L().a($$0, (float)chj.this.af(), (float)chj.this.ad());
            if (chj.this.g($$0) <= 36.0) {
               chj.this.A(true);
               chj.this.z(true);
               chj.this.P().m();
            } else {
               chj.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azv {
      a(0, "red"),
      b(1, "snow");

      public static final azv.a<chj.v> c = azv.a(chj.v::values);
      private static final IntFunction<chj.v> d = axq.a(chj.v::a, values(), axq.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
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

      public static chj.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chj.v a(int $$0) {
         return d.apply($$0);
      }

      public static chj.v a(jr<dhl> $$0) {
         return $$0.a(awo.ar) ? b : a;
      }
   }
}
