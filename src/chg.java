import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chg extends cgw implements bwf<chg.v> {
   private static final ajx<Integer> cc = akb.a(chg.class, ajz.b);
   private static final ajx<Byte> cd = akb.a(chg.class, ajz.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajx<Optional<UUID>> ci = akb.a(chg.class, ajz.r);
   private static final ajx<Optional<UUID>> cj = akb.a(chg.class, ajz.r);
   static final Predicate<cla> ck = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<buj> cl = $$0 -> !($$0 instanceof bvf $$1) ? false : $$1.es() != null && $$1.et() < $$1.af + 600;
   static final Predicate<buj> cm = $$0 -> $$0 instanceof chb || $$0 instanceof chq;
   private static final Predicate<buj> cn = $$0 -> !$$0.cg() && buo.e.test($$0);
   private static final int co = 600;
   private static final bum cp = buq.aa.n().a(0.5F).b(0.2975F);
   private ccd cq;
   private ccd cr;
   private ccd cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chg(buq<? extends chg> $$0, dgg $$1) {
      super($$0, $$1);
      this.bO = new chg.k();
      this.bP = new chg.m();
      this.a(eto.p, 0.0F);
      this.a(eto.q, 0.0F);
      this.a_(true);
      this.L().a(32.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void B() {
      this.cq = new cdw<>(this, cgw.class, 10, false, false, ($$0, $$1) -> $$0 instanceof chb || $$0 instanceof chq);
      this.cr = new cdw<>(this, chx.class, 10, false, false, chx.bY);
      this.cs = new cdw<>(this, cgs.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cgu);
      this.bS.a(0, new chg.g());
      this.bS.a(0, new cbs(this, this.dW()));
      this.bS.a(1, new chg.b());
      this.bS.a(2, new chg.n(2.2));
      this.bS.a(3, new chg.e(1.0));
      this.bS.a(4, new cbk<>(this, cov.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cG()) && !this.gD()));
      this.bS.a(4, new cbk<>(this, chz.class, 8.0F, 1.6, 1.4, $$0 -> !((chz)$$0).p() && !this.gD()));
      this.bS.a(4, new cbk<>(this, cho.class, 8.0F, 1.6, 1.4, $$0 -> !this.gD()));
      this.bS.a(5, new chg.u());
      this.bS.a(6, new chg.o());
      this.bS.a(6, new chg.s(1.25));
      this.bS.a(7, new chg.l(1.2F, true));
      this.bS.a(7, new chg.t());
      this.bS.a(8, new chg.h(this, 1.25));
      this.bS.a(9, new chg.q(32, 200));
      this.bS.a(10, new chg.f(1.2F, 12, 1));
      this.bS.a(10, new ccj(this, 0.4F));
      this.bS.a(11, new cdq(this, 1.0));
      this.bS.a(11, new chg.p());
      this.bS.a(12, new chg.j(this, cov.class, 24.0F));
      this.bS.a(13, new chg.r());
      this.bT.a(3, new chg.a(bvf.class, false, false, ($$0, $$1) -> cl.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dW().C && this.bL() && this.dk()) {
         this.cx++;
         cwn $$0 = this.a(bur.a);
         if (this.i($$0)) {
            if (this.cx > 600) {
               cwn $$1 = $$0.a(this.dW(), this);
               if (!$$1.f()) {
                  this.a(bur.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ae.i() < 0.1F) {
               this.gv();
               this.dW().a(this, (byte)45);
            }
         }

         bvf $$2 = this.O_();
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
      if (this.gD() && this.ae.i() < 0.05F) {
         this.a(avz.jF, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fi() {
      return this.eF();
   }

   private boolean i(cwn $$0) {
      return $$0.b(kv.w) && this.O_() == null && this.aJ() && !this.fR();
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cwn $$3;
         if ($$2 < 0.05F) {
            $$3 = new cwn(cwr.pf);
         } else if ($$2 < 0.2F) {
            $$3 = new cwn(cwr.ry);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cwn(cwr.vD) : new cwn(cwr.vE);
         } else if ($$2 < 0.6F) {
            $$3 = new cwn(cwr.qb);
         } else if ($$2 < 0.8F) {
            $$3 = new cwn(cwr.rk);
         } else {
            $$3 = new cwn(cwr.pY);
         }

         this.a(bur.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwn $$1 = this.a(bur.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fay $$3 = new fay(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dO() * (float) (Math.PI / 180.0))
                  .b(-this.dM() * (float) (Math.PI / 180.0));
               this.dW().a(new lp(lt.T, $$1), this.dB() + this.bT().d / 2.0, this.dD(), this.dH() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.v, 0.3F).a(bwn.s, 10.0).a(bwn.c, 2.0).a(bwn.x, 5.0).a(bwn.m, 32.0);
   }

   @Nullable
   public chg b(arc $$0, bua $$1) {
      chg $$2 = buq.aa.a($$0, bup.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((chg)$$1).t());
      }

      return $$2;
   }

   public static boolean c(buq<chg> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      jr<dhi> $$4 = $$0.t(this.dw());
      chg.v $$5 = chg.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chg.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chg.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arc) {
         this.gB();
      }

      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gB() {
      if (this.t() == chg.v.a) {
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
   protected void gv() {
      this.a(avz.jJ, 1.0F, 1.0F);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? cp : super.e($$0);
   }

   public chg.v t() {
      return chg.v.a(this.al.a(cc));
   }

   public void a(chg.v $$0) {
      this.al.a(cc, $$0.a());
   }

   List<UUID> gC() {
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
      List<UUID> $$1 = this.gC();
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
      this.a(chg.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dW() instanceof arc) {
         this.gB();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gp() {
      return this.s(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gD() {
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
   protected boolean f(bur $$0) {
      return $$0 == bur.a && this.fN();
   }

   @Override
   public boolean g(cwn $$0) {
      cwn $$1 = this.a(bur.a);
      return $$1.f() || this.cx > 0 && $$0.b(kv.w) && !$$1.b(kv.w);
   }

   private void k(cwn $$0) {
      if (!$$0.f() && !this.dW().C) {
         cla $$1 = new cla(this.dW(), this.dB() + this.bT().d, this.dD() + 1.0, this.dH() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avz.jO, 1.0F, 1.0F);
         this.dW().b($$1);
      }
   }

   private void l(cwn $$0) {
      cla $$1 = new cla(this.dW(), this.dB(), this.dD(), this.dH(), $$0);
      this.dW().b($$1);
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      cwn $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bur.a));
         this.a($$1);
         this.a(bur.a, $$2.a(1));
         this.g(bur.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.cx = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dk()) {
         boolean $$0 = this.bj();
         if ($$0 || this.O_() != null || this.dW().af()) {
            this.gE();
         }

         if ($$0 || this.fR()) {
            this.x(false);
         }

         if (this.gp() && this.dW().A.i() < 0.2F) {
            ji $$1 = this.dw();
            dwv $$2 = this.dW().a_($$1);
            this.dW().c(2001, $$1, djk.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gt()) {
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
   public boolean j(cwn $$0) {
      return $$0.a(awx.ac);
   }

   @Override
   protected void a(cov $$0, bvh $$1) {
      ((chg)$$1).b($$0.cG());
   }

   public boolean gq() {
      return this.s(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gr() {
      return this.bm;
   }

   public boolean gs() {
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

   public boolean gt() {
      return this.s(8);
   }

   public float J(float $$0) {
      return ayy.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bvf $$0) {
      if (this.gD() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gE() {
      this.D(false);
   }

   void gF() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gG() {
      return !this.fR() && !this.x() && !this.gp();
   }

   @Override
   public void R() {
      avy $$0 = this.u();
      if ($$0 == avz.jL) {
         this.a($$0, 2.0F, this.fh());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected avy u() {
      if (this.fR()) {
         return avz.jM;
      } else {
         if (!this.dW().V() && this.ae.i() < 0.1F) {
            List<cov> $$0 = this.dW().a(cov.class, this.cR().c(16.0, 16.0, 16.0), buo.f);
            if ($$0.isEmpty()) {
               return avz.jL;
            }
         }

         return avz.jG;
      }
   }

   @Nullable
   @Override
   protected avy e(bsz $$0) {
      return avz.jK;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.jI;
   }

   boolean c(UUID $$0) {
      return this.gC().contains($$0);
   }

   @Override
   protected void b(arc $$0, bsz $$1) {
      cwn $$2 = this.a(bur.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bur.a, cwn.j);
      }

      super.b($$0, $$1);
   }

   public static boolean a(chg $$0, bvf $$1) {
      double $$2 = $$1.dH() - $$0.dH();
      double $$3 = $$1.dB() - $$0.dB();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dW().a_(ji.a($$0.dB() + $$8, $$0.dD() + (double)$$9, $$0.dH() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.55F * this.cS()), (double)(this.dr() * 0.4F));
   }

   class a extends cdw<bvf> {
      @Nullable
      private bvf j;
      @Nullable
      private bvf k;
      private int l;

      public a(final Class<bvf> $$0, final boolean $$1, final boolean $$2, @Nullable final cfw.a $$3) {
         super(chg.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dZ().a(this.b) != 0) {
            return false;
         } else {
            arc $$0 = a(chg.this.dW());

            for (UUID $$1 : chg.this.gC()) {
               if ($$0.a($$1) instanceof bvf $$3) {
                  this.k = $$3;
                  this.j = $$3.eq();
                  int $$4 = $$3.er();
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
            this.l = this.k.er();
         }

         chg.this.a(avz.jF, 1.0F, 1.0F);
         chg.this.C(true);
         chg.this.gE();
         super.d();
      }
   }

   class b extends ccd {
      int a;

      public b() {
         this.a(EnumSet.of(ccd.a.b, ccd.a.c, ccd.a.a));
      }

      @Override
      public boolean b() {
         return chg.this.gp();
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
         chg.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cfw.a {
      @Override
      public boolean test(bvf $$0, arc $$1) {
         if ($$0 instanceof chg) {
            return false;
         } else if ($$0 instanceof chb || $$0 instanceof chq || $$0 instanceof clw) {
            return true;
         } else if ($$0 instanceof bwc) {
            return !((bwc)$$0).p();
         } else if (!($$0 instanceof cov) || !$$0.Z_() && !((cov)$$0).b()) {
            return chg.this.c($$0.cG()) ? false : !$$0.fR() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends ccd {
      private final cfw b = cfw.a().a(12.0).d().a(chg.this.new c());

      protected boolean h() {
         ji $$0 = ji.a(chg.this.dB(), chg.this.cR().e, chg.this.dH());
         return !chg.this.dW().h($$0) && chg.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(chg.this.dW()).a(bvf.class, this.b, chg.this, chg.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbp {
      public e(final double $$0) {
         super(chg.this, $$0);
      }

      @Override
      public void d() {
         ((chg)this.a).gF();
         ((chg)this.c).gF();
         super.d();
      }

      @Override
      protected void g() {
         arc $$0 = this.b;
         chg $$1 = (chg)this.a.a($$0, (bua)this.c);
         if ($$1 != null) {
            ard $$2 = this.a.gy();
            ard $$3 = this.c.gy();
            ard $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cG());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cG());
            }

            if ($$4 != null) {
               $$4.a(awj.P);
               ap.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gA();
            this.c.gA();
            $$1.c_(-24000);
            $$1.b(this.a.dB(), this.a.dD(), this.a.dH(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().b(dgc.f)) {
               this.b.b(new buv(this.b, this.a.dB(), this.a.dD(), this.a.dH(), this.a.dZ().a(7) + 1));
            }
         }
      }
   }

   public class f extends ccq {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chg.this, $$1, $$2, $$3);
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
      protected boolean a(dgj $$0, ji $$1) {
         dwv $$2 = $$0.a_($$1);
         return $$2.a(djm.oK) && $$2.c(drs.c) >= 2 || dkh.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && chg.this.ae.i() < 0.05F) {
            chg.this.a(avz.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(chg.this.dW()).O().b(dgc.c)) {
            dwv $$0 = chg.this.dW().a_(this.e);
            if ($$0.a(djm.oK)) {
               this.b($$0);
            } else if (dkh.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dwv $$0) {
         dkh.a(chg.this, $$0, chg.this.dW(), this.e);
      }

      private void b(dwv $$0) {
         int $$1 = $$0.c(drs.c);
         $$0.b(drs.c, Integer.valueOf(1));
         int $$2 = 1 + chg.this.dW().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwn $$3 = chg.this.a(bur.a);
         if ($$3.f()) {
            chg.this.a(bur.a, new cwn(cwr.xv));
            $$2--;
         }

         if ($$2 > 0) {
            djk.a(chg.this.dW(), this.e, new cwn(cwr.xv, $$2));
         }

         chg.this.a(avz.Ag, 1.0F, 1.0F);
         chg.this.dW().a(this.e, $$0.b(drs.c, Integer.valueOf(1)), 2);
         chg.this.dW().a(ebr.c, this.e, ebr.a.a(chg.this));
      }

      @Override
      public boolean b() {
         return !chg.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chg.this.x(false);
         super.d();
      }
   }

   class g extends cbx {
      public g() {
         super(chg.this);
      }

      @Override
      public void d() {
         super.d();
         chg.this.gF();
      }

      @Override
      public boolean b() {
         return chg.this.bj() && chg.this.b(awu.a) > 0.25 || chg.this.bx();
      }
   }

   static class h extends ccc {
      private final chg d;

      public h(chg $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gD() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gD() && super.c();
      }

      @Override
      public void d() {
         this.d.gF();
         super.d();
      }
   }

   public static class i extends bua.a {
      public final chg.v a;

      public i(chg.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ccl {
      public j(final bvh $$0, final Class<? extends bvf> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chg.this.gp() && !chg.this.gt();
      }

      @Override
      public boolean c() {
         return super.c() && !chg.this.gp() && !chg.this.gt();
      }
   }

   public class k extends cbf {
      public k() {
         super(chg.this);
      }

      @Override
      public void a() {
         if (!chg.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chg.this.gq() && !chg.this.ci() && !chg.this.gt() && !chg.this.gp();
      }
   }

   class l extends ccn {
      public l(final double $$0, final boolean $$1) {
         super(chg.this, $$0, $$1);
      }

      @Override
      protected void a(bvf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chg.this.a(avz.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chg.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chg.this.x() && !chg.this.fR() && !chg.this.ci() && !chg.this.gp() && super.b();
      }
   }

   class m extends cbg {
      public m() {
         super(chg.this);
      }

      @Override
      public void a() {
         if (chg.this.gG()) {
            super.a();
         }
      }
   }

   class n extends ccw {
      public n(final double $$0) {
         super(chg.this, $$0);
      }

      @Override
      public boolean h() {
         return !chg.this.gD() && super.h();
      }
   }

   public class o extends cch {
      @Override
      public boolean b() {
         if (!chg.this.gs()) {
            return false;
         } else {
            bvf $$0 = chg.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = chg.a(chg.this, $$0);
                  if (!$$1) {
                     chg.this.L().a($$0, 0);
                     chg.this.z(false);
                     chg.this.A(false);
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
         bvf $$0 = chg.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = chg.this.dz().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chg.this.dO()) < 15.0F) || !chg.this.aJ()) && !chg.this.gp();
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
         chg.this.t(true);
         chg.this.y(true);
         chg.this.A(false);
         bvf $$0 = chg.this.O_();
         if ($$0 != null) {
            chg.this.H().a($$0, 60.0F, 30.0F);
            fay $$1 = new fay($$0.dB() - chg.this.dB(), $$0.dD() - chg.this.dD(), $$0.dH() - chg.this.dH()).d();
            chg.this.h(chg.this.dz().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chg.this.L().m();
      }

      @Override
      public void e() {
         chg.this.z(false);
         chg.this.cv = 0.0F;
         chg.this.cw = 0.0F;
         chg.this.A(false);
         chg.this.y(false);
      }

      @Override
      public void a() {
         bvf $$0 = chg.this.O_();
         if ($$0 != null) {
            chg.this.H().a($$0, 60.0F, 30.0F);
         }

         if (!chg.this.gp()) {
            fay $$1 = chg.this.dz();
            if ($$1.e * $$1.e < 0.03F && chg.this.dO() != 0.0F) {
               chg.this.w(ayy.i(0.2F, chg.this.dO(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chg.this.w((float)$$3);
            }
         }

         if ($$0 != null && chg.this.f($$0) <= 2.0F) {
            chg.this.c(a(chg.this.dW()), $$0);
         } else if (chg.this.dO() > 0.0F && chg.this.aJ() && (float)chg.this.dz().e != 0.0F && chg.this.dW().a_(chg.this.dw()).a(djm.ea)) {
            chg.this.w(60.0F);
            chg.this.h(null);
            chg.this.B(true);
         }
      }
   }

   class p extends ccd {
      public p() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         if (!chg.this.a(bur.a).f()) {
            return false;
         } else if (chg.this.O_() != null || chg.this.eq() != null) {
            return false;
         } else if (!chg.this.gG()) {
            return false;
         } else if (chg.this.dZ().a(b(10)) != 0) {
            return false;
         } else {
            List<cla> $$0 = chg.this.dW().a(cla.class, chg.this.cR().c(8.0, 8.0, 8.0), chg.ck);
            return !$$0.isEmpty() && chg.this.a(bur.a).f();
         }
      }

      @Override
      public void a() {
         List<cla> $$0 = chg.this.dW().a(cla.class, chg.this.cR().c(8.0, 8.0, 8.0), chg.ck);
         cwn $$1 = chg.this.a(bur.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chg.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cla> $$0 = chg.this.dW().a(cla.class, chg.this.cR().c(8.0, 8.0, 8.0), chg.ck);
         if (!$$0.isEmpty()) {
            chg.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cdj {
      public q(final int $$0, final int $$1) {
         super(chg.this, $$1);
      }

      @Override
      public void d() {
         chg.this.gF();
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
         return !chg.this.fR() && !chg.this.x() && !chg.this.gD() && chg.this.O_() == null;
      }
   }

   class r extends chg.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean b() {
         return chg.this.eq() == null
            && chg.this.dZ().i() < 0.02F
            && !chg.this.fR()
            && chg.this.O_() == null
            && chg.this.L().k()
            && !this.i()
            && !chg.this.gq()
            && !chg.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chg.this.dZ().a(3);
         chg.this.x(true);
         chg.this.L().m();
      }

      @Override
      public void e() {
         chg.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chg.this.H().a(chg.this.dB() + this.c, chg.this.dF(), chg.this.dH() + this.d, (float)chg.this.ab(), (float)chg.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chg.this.dZ().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chg.this.dZ().a(20));
      }
   }

   class s extends cbw {
      private int c = b(100);

      public s(final double $$0) {
         super(chg.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chg.this.fR() && this.a.O_() == null) {
            if (chg.this.dW().af() && chg.this.dW().h(this.a.dw())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ji $$0 = this.a.dw();
               return chg.this.dW().V() && chg.this.dW().h($$0) && !((arc)chg.this.dW()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chg.this.gF();
         super.d();
      }
   }

   class t extends chg.d {
      private static final int c = b(140);
      private int d = chg.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ccd.a.a, ccd.a.b, ccd.a.c));
      }

      @Override
      public boolean b() {
         return chg.this.bn == 0.0F && chg.this.bo == 0.0F && chg.this.bp == 0.0F ? this.k() || chg.this.fR() : false;
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
            return chg.this.dW().V() && this.h() && !this.i() && !chg.this.av;
         }
      }

      @Override
      public void e() {
         this.d = chg.this.ae.a(c);
         chg.this.gF();
      }

      @Override
      public void d() {
         chg.this.x(false);
         chg.this.z(false);
         chg.this.A(false);
         chg.this.t(false);
         chg.this.D(true);
         chg.this.L().m();
         chg.this.I().a(chg.this.dB(), chg.this.dD(), chg.this.dH(), 0.0);
      }
   }

   class u extends ccd {
      public u() {
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean b() {
         if (chg.this.fR()) {
            return false;
         } else {
            bvf $$0 = chg.this.O_();
            return $$0 != null && $$0.bL() && chg.cm.test($$0) && chg.this.g($$0) > 36.0 && !chg.this.ci() && !chg.this.gt() && !chg.this.bm;
         }
      }

      @Override
      public void d() {
         chg.this.x(false);
         chg.this.B(false);
      }

      @Override
      public void e() {
         bvf $$0 = chg.this.O_();
         if ($$0 != null && chg.a(chg.this, $$0)) {
            chg.this.A(true);
            chg.this.z(true);
            chg.this.L().m();
            chg.this.H().a($$0, (float)chg.this.ab(), (float)chg.this.aa());
         } else {
            chg.this.A(false);
            chg.this.z(false);
         }
      }

      @Override
      public void a() {
         bvf $$0 = chg.this.O_();
         if ($$0 != null) {
            chg.this.H().a($$0, (float)chg.this.ab(), (float)chg.this.aa());
            if (chg.this.g($$0) <= 36.0) {
               chg.this.A(true);
               chg.this.z(true);
               chg.this.L().m();
            } else {
               chg.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azu {
      a(0, "red"),
      b(1, "snow");

      public static final azu.a<chg.v> c = azu.a(chg.v::values);
      private static final IntFunction<chg.v> d = axp.a(chg.v::a, values(), axp.a.a);
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

      public static chg.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chg.v a(int $$0) {
         return d.apply($$0);
      }

      public static chg.v a(jr<dhi> $$0) {
         return $$0.a(awn.ar) ? b : a;
      }
   }
}
