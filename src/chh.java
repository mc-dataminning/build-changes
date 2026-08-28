import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chh extends cgx implements bwg<chh.v> {
   private static final ajx<Integer> cc = akb.a(chh.class, ajz.b);
   private static final ajx<Byte> cd = akb.a(chh.class, ajz.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajx<Optional<UUID>> ci = akb.a(chh.class, ajz.r);
   private static final ajx<Optional<UUID>> cj = akb.a(chh.class, ajz.r);
   static final Predicate<clb> ck = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<buk> cl = $$0 -> !($$0 instanceof bvg $$1) ? false : $$1.es() != null && $$1.et() < $$1.af + 600;
   static final Predicate<buk> cm = $$0 -> $$0 instanceof chc || $$0 instanceof chr;
   private static final Predicate<buk> cn = $$0 -> !$$0.cg() && bup.e.test($$0);
   private static final int co = 600;
   private static final bun cp = bur.ab.n().a(0.5F).b(0.2975F);
   private cce cq;
   private cce cr;
   private cce cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chh(bur<? extends chh> $$0, dgi $$1) {
      super($$0, $$1);
      this.bO = new chh.k();
      this.bP = new chh.m();
      this.a(etq.p, 0.0F);
      this.a(etq.q, 0.0F);
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
      this.cq = new cdx<>(this, cgx.class, 10, false, false, ($$0, $$1) -> $$0 instanceof chc || $$0 instanceof chr);
      this.cr = new cdx<>(this, chy.class, 10, false, false, chy.bY);
      this.cs = new cdx<>(this, cgt.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cgv);
      this.bS.a(0, new chh.g());
      this.bS.a(0, new cbt(this, this.dW()));
      this.bS.a(1, new chh.b());
      this.bS.a(2, new chh.n(2.2));
      this.bS.a(3, new chh.e(1.0));
      this.bS.a(4, new cbl<>(this, cox.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cG()) && !this.gD()));
      this.bS.a(4, new cbl<>(this, cia.class, 8.0F, 1.6, 1.4, $$0 -> !((cia)$$0).p() && !this.gD()));
      this.bS.a(4, new cbl<>(this, chp.class, 8.0F, 1.6, 1.4, $$0 -> !this.gD()));
      this.bS.a(5, new chh.u());
      this.bS.a(6, new chh.o());
      this.bS.a(6, new chh.s(1.25));
      this.bS.a(7, new chh.l(1.2F, true));
      this.bS.a(7, new chh.t());
      this.bS.a(8, new chh.h(this, 1.25));
      this.bS.a(9, new chh.q(32, 200));
      this.bS.a(10, new chh.f(1.2F, 12, 1));
      this.bS.a(10, new cck(this, 0.4F));
      this.bS.a(11, new cdr(this, 1.0));
      this.bS.a(11, new chh.p());
      this.bS.a(12, new chh.j(this, cox.class, 24.0F));
      this.bS.a(13, new chh.r());
      this.bT.a(3, new chh.a(bvg.class, false, false, ($$0, $$1) -> cl.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dW().C && this.bL() && this.dk()) {
         this.cx++;
         cwp $$0 = this.a(bus.a);
         if (this.i($$0)) {
            if (this.cx > 600) {
               cwp $$1 = $$0.a(this.dW(), this);
               if (!$$1.f()) {
                  this.a(bus.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ae.i() < 0.1F) {
               this.gv();
               this.dW().a(this, (byte)45);
            }
         }

         bvg $$2 = this.O_();
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
         this.a(awa.jF, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fi() {
      return this.eF();
   }

   private boolean i(cwp $$0) {
      return $$0.b(kv.w) && this.O_() == null && this.aJ() && !this.fR();
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cwp $$3;
         if ($$2 < 0.05F) {
            $$3 = new cwp(cwt.pf);
         } else if ($$2 < 0.2F) {
            $$3 = new cwp(cwt.ry);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cwp(cwt.vD) : new cwp(cwt.vE);
         } else if ($$2 < 0.6F) {
            $$3 = new cwp(cwt.qb);
         } else if ($$2 < 0.8F) {
            $$3 = new cwp(cwt.rk);
         } else {
            $$3 = new cwp(cwt.pY);
         }

         this.a(bus.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwp $$1 = this.a(bus.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fba $$3 = new fba(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dO() * (float) (Math.PI / 180.0))
                  .b(-this.dM() * (float) (Math.PI / 180.0));
               this.dW().a(new lp(lt.T, $$1), this.dB() + this.bT().d / 2.0, this.dD(), this.dH() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwn.a p() {
      return cgx.gu().a(bwo.v, 0.3F).a(bwo.s, 10.0).a(bwo.c, 2.0).a(bwo.x, 5.0).a(bwo.m, 32.0);
   }

   @Nullable
   public chh b(arc $$0, bub $$1) {
      chh $$2 = bur.ab.a($$0, buq.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((chh)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bur<chh> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      jr<dhk> $$4 = $$0.t(this.dw());
      chh.v $$5 = chh.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chh.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chh.i($$5);
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
      if (this.t() == chh.v.a) {
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
      this.a(awa.jJ, 1.0F, 1.0F);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? cp : super.e($$0);
   }

   public chh.v t() {
      return chh.v.a(this.al.a(cc));
   }

   public void a(chh.v $$0) {
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
      this.a(chh.v.a($$0.l("Type")));
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
   protected boolean f(bus $$0) {
      return $$0 == bus.a && this.fN();
   }

   @Override
   public boolean g(cwp $$0) {
      cwp $$1 = this.a(bus.a);
      return $$1.f() || this.cx > 0 && $$0.b(kv.w) && !$$1.b(kv.w);
   }

   private void k(cwp $$0) {
      if (!$$0.f() && !this.dW().C) {
         clb $$1 = new clb(this.dW(), this.dB() + this.bT().d, this.dD() + 1.0, this.dH() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jO, 1.0F, 1.0F);
         this.dW().b($$1);
      }
   }

   private void l(cwp $$0) {
      clb $$1 = new clb(this.dW(), this.dB(), this.dD(), this.dH(), $$0);
      this.dW().b($$1);
   }

   @Override
   protected void a(arc $$0, clb $$1) {
      cwp $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bus.a));
         this.a($$1);
         this.a(bus.a, $$2.a(1));
         this.g(bus.a);
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
            dwx $$2 = this.dW().a_($$1);
            this.dW().c(2001, $$1, djm.j($$2));
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
   public boolean j(cwp $$0) {
      return $$0.a(awy.ac);
   }

   @Override
   protected void a(cox $$0, bvi $$1) {
      ((chh)$$1).b($$0.cG());
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
      return ayz.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bvg $$0) {
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
      avz $$0 = this.u();
      if ($$0 == awa.jL) {
         this.a($$0, 2.0F, this.fh());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.fR()) {
         return awa.jM;
      } else {
         if (!this.dW().V() && this.ae.i() < 0.1F) {
            List<cox> $$0 = this.dW().a(cox.class, this.cR().c(16.0, 16.0, 16.0), bup.f);
            if ($$0.isEmpty()) {
               return awa.jL;
            }
         }

         return awa.jG;
      }
   }

   @Nullable
   @Override
   protected avz e(bta $$0) {
      return awa.jK;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.jI;
   }

   boolean c(UUID $$0) {
      return this.gC().contains($$0);
   }

   @Override
   protected void b(arc $$0, bta $$1) {
      cwp $$2 = this.a(bus.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bus.a, cwp.j);
      }

      super.b($$0, $$1);
   }

   public static boolean a(chh $$0, bvg $$1) {
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
   public fba cT() {
      return new fba(0.0, (double)(0.55F * this.cS()), (double)(this.dr() * 0.4F));
   }

   class a extends cdx<bvg> {
      @Nullable
      private bvg j;
      @Nullable
      private bvg k;
      private int l;

      public a(final Class<bvg> $$0, final boolean $$1, final boolean $$2, @Nullable final cfx.a $$3) {
         super(chh.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dZ().a(this.b) != 0) {
            return false;
         } else {
            arc $$0 = a(chh.this.dW());

            for (UUID $$1 : chh.this.gC()) {
               if ($$0.a($$1) instanceof bvg $$3) {
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

         chh.this.a(awa.jF, 1.0F, 1.0F);
         chh.this.C(true);
         chh.this.gE();
         super.d();
      }
   }

   class b extends cce {
      int a;

      public b() {
         this.a(EnumSet.of(cce.a.b, cce.a.c, cce.a.a));
      }

      @Override
      public boolean b() {
         return chh.this.gp();
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
         chh.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cfx.a {
      @Override
      public boolean test(bvg $$0, arc $$1) {
         if ($$0 instanceof chh) {
            return false;
         } else if ($$0 instanceof chc || $$0 instanceof chr || $$0 instanceof clx) {
            return true;
         } else if ($$0 instanceof bwd) {
            return !((bwd)$$0).p();
         } else if (!($$0 instanceof cox) || !$$0.Z_() && !((cox)$$0).b()) {
            return chh.this.c($$0.cG()) ? false : !$$0.fR() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cce {
      private final cfx b = cfx.a().a(12.0).d().a(chh.this.new c());

      protected boolean h() {
         ji $$0 = ji.a(chh.this.dB(), chh.this.cR().e, chh.this.dH());
         return !chh.this.dW().h($$0) && chh.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(chh.this.dW()).a(bvg.class, this.b, chh.this, chh.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbq {
      public e(final double $$0) {
         super(chh.this, $$0);
      }

      @Override
      public void d() {
         ((chh)this.a).gF();
         ((chh)this.c).gF();
         super.d();
      }

      @Override
      protected void g() {
         arc $$0 = this.b;
         chh $$1 = (chh)this.a.a($$0, (bub)this.c);
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
               $$4.a(awk.P);
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
            if ($$0.O().b(dge.f)) {
               this.b.b(new buw(this.b, this.a.dB(), this.a.dD(), this.a.dH(), this.a.dZ().a(7) + 1));
            }
         }
      }
   }

   public class f extends ccr {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chh.this, $$1, $$2, $$3);
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
      protected boolean a(dgl $$0, ji $$1) {
         dwx $$2 = $$0.a_($$1);
         return $$2.a(djo.oK) && $$2.c(dru.c) >= 2 || dkj.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && chh.this.ae.i() < 0.05F) {
            chh.this.a(awa.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(chh.this.dW()).O().b(dge.c)) {
            dwx $$0 = chh.this.dW().a_(this.e);
            if ($$0.a(djo.oK)) {
               this.b($$0);
            } else if (dkj.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dwx $$0) {
         dkj.a(chh.this, $$0, chh.this.dW(), this.e);
      }

      private void b(dwx $$0) {
         int $$1 = $$0.c(dru.c);
         $$0.b(dru.c, Integer.valueOf(1));
         int $$2 = 1 + chh.this.dW().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwp $$3 = chh.this.a(bus.a);
         if ($$3.f()) {
            chh.this.a(bus.a, new cwp(cwt.xv));
            $$2--;
         }

         if ($$2 > 0) {
            djm.a(chh.this.dW(), this.e, new cwp(cwt.xv, $$2));
         }

         chh.this.a(awa.Ah, 1.0F, 1.0F);
         chh.this.dW().a(this.e, $$0.b(dru.c, Integer.valueOf(1)), 2);
         chh.this.dW().a(ebt.c, this.e, ebt.a.a(chh.this));
      }

      @Override
      public boolean b() {
         return !chh.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chh.this.x(false);
         super.d();
      }
   }

   class g extends cby {
      public g() {
         super(chh.this);
      }

      @Override
      public void d() {
         super.d();
         chh.this.gF();
      }

      @Override
      public boolean b() {
         return chh.this.bj() && chh.this.b(awv.a) > 0.25 || chh.this.bx();
      }
   }

   static class h extends ccd {
      private final chh d;

      public h(chh $$0, double $$1) {
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

   public static class i extends bub.a {
      public final chh.v a;

      public i(chh.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ccm {
      public j(final bvi $$0, final Class<? extends bvg> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chh.this.gp() && !chh.this.gt();
      }

      @Override
      public boolean c() {
         return super.c() && !chh.this.gp() && !chh.this.gt();
      }
   }

   public class k extends cbg {
      public k() {
         super(chh.this);
      }

      @Override
      public void a() {
         if (!chh.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chh.this.gq() && !chh.this.ci() && !chh.this.gt() && !chh.this.gp();
      }
   }

   class l extends cco {
      public l(final double $$0, final boolean $$1) {
         super(chh.this, $$0, $$1);
      }

      @Override
      protected void a(bvg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chh.this.a(awa.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chh.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chh.this.x() && !chh.this.fR() && !chh.this.ci() && !chh.this.gp() && super.b();
      }
   }

   class m extends cbh {
      public m() {
         super(chh.this);
      }

      @Override
      public void a() {
         if (chh.this.gG()) {
            super.a();
         }
      }
   }

   class n extends ccx {
      public n(final double $$0) {
         super(chh.this, $$0);
      }

      @Override
      public boolean h() {
         return !chh.this.gD() && super.h();
      }
   }

   public class o extends cci {
      @Override
      public boolean b() {
         if (!chh.this.gs()) {
            return false;
         } else {
            bvg $$0 = chh.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = chh.a(chh.this, $$0);
                  if (!$$1) {
                     chh.this.L().a($$0, 0);
                     chh.this.z(false);
                     chh.this.A(false);
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
         bvg $$0 = chh.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = chh.this.dz().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chh.this.dO()) < 15.0F) || !chh.this.aJ()) && !chh.this.gp();
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
         chh.this.t(true);
         chh.this.y(true);
         chh.this.A(false);
         bvg $$0 = chh.this.O_();
         if ($$0 != null) {
            chh.this.H().a($$0, 60.0F, 30.0F);
            fba $$1 = new fba($$0.dB() - chh.this.dB(), $$0.dD() - chh.this.dD(), $$0.dH() - chh.this.dH()).d();
            chh.this.h(chh.this.dz().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chh.this.L().m();
      }

      @Override
      public void e() {
         chh.this.z(false);
         chh.this.cv = 0.0F;
         chh.this.cw = 0.0F;
         chh.this.A(false);
         chh.this.y(false);
      }

      @Override
      public void a() {
         bvg $$0 = chh.this.O_();
         if ($$0 != null) {
            chh.this.H().a($$0, 60.0F, 30.0F);
         }

         if (!chh.this.gp()) {
            fba $$1 = chh.this.dz();
            if ($$1.e * $$1.e < 0.03F && chh.this.dO() != 0.0F) {
               chh.this.w(ayz.i(0.2F, chh.this.dO(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chh.this.w((float)$$3);
            }
         }

         if ($$0 != null && chh.this.f($$0) <= 2.0F) {
            chh.this.c(a(chh.this.dW()), $$0);
         } else if (chh.this.dO() > 0.0F && chh.this.aJ() && (float)chh.this.dz().e != 0.0F && chh.this.dW().a_(chh.this.dw()).a(djo.ea)) {
            chh.this.w(60.0F);
            chh.this.h(null);
            chh.this.B(true);
         }
      }
   }

   class p extends cce {
      public p() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         if (!chh.this.a(bus.a).f()) {
            return false;
         } else if (chh.this.O_() != null || chh.this.eq() != null) {
            return false;
         } else if (!chh.this.gG()) {
            return false;
         } else if (chh.this.dZ().a(b(10)) != 0) {
            return false;
         } else {
            List<clb> $$0 = chh.this.dW().a(clb.class, chh.this.cR().c(8.0, 8.0, 8.0), chh.ck);
            return !$$0.isEmpty() && chh.this.a(bus.a).f();
         }
      }

      @Override
      public void a() {
         List<clb> $$0 = chh.this.dW().a(clb.class, chh.this.cR().c(8.0, 8.0, 8.0), chh.ck);
         cwp $$1 = chh.this.a(bus.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chh.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<clb> $$0 = chh.this.dW().a(clb.class, chh.this.cR().c(8.0, 8.0, 8.0), chh.ck);
         if (!$$0.isEmpty()) {
            chh.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cdk {
      public q(final int $$0, final int $$1) {
         super(chh.this, $$1);
      }

      @Override
      public void d() {
         chh.this.gF();
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
         return !chh.this.fR() && !chh.this.x() && !chh.this.gD() && chh.this.O_() == null;
      }
   }

   class r extends chh.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         return chh.this.eq() == null
            && chh.this.dZ().i() < 0.02F
            && !chh.this.fR()
            && chh.this.O_() == null
            && chh.this.L().k()
            && !this.i()
            && !chh.this.gq()
            && !chh.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chh.this.dZ().a(3);
         chh.this.x(true);
         chh.this.L().m();
      }

      @Override
      public void e() {
         chh.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chh.this.H().a(chh.this.dB() + this.c, chh.this.dF(), chh.this.dH() + this.d, (float)chh.this.ab(), (float)chh.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chh.this.dZ().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chh.this.dZ().a(20));
      }
   }

   class s extends cbx {
      private int c = b(100);

      public s(final double $$0) {
         super(chh.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chh.this.fR() && this.a.O_() == null) {
            if (chh.this.dW().af() && chh.this.dW().h(this.a.dw())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ji $$0 = this.a.dw();
               return chh.this.dW().V() && chh.this.dW().h($$0) && !((arc)chh.this.dW()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chh.this.gF();
         super.d();
      }
   }

   class t extends chh.d {
      private static final int c = b(140);
      private int d = chh.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cce.a.a, cce.a.b, cce.a.c));
      }

      @Override
      public boolean b() {
         return chh.this.bn == 0.0F && chh.this.bo == 0.0F && chh.this.bp == 0.0F ? this.k() || chh.this.fR() : false;
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
            return chh.this.dW().V() && this.h() && !this.i() && !chh.this.av;
         }
      }

      @Override
      public void e() {
         this.d = chh.this.ae.a(c);
         chh.this.gF();
      }

      @Override
      public void d() {
         chh.this.x(false);
         chh.this.z(false);
         chh.this.A(false);
         chh.this.t(false);
         chh.this.D(true);
         chh.this.L().m();
         chh.this.I().a(chh.this.dB(), chh.this.dD(), chh.this.dH(), 0.0);
      }
   }

   class u extends cce {
      public u() {
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         if (chh.this.fR()) {
            return false;
         } else {
            bvg $$0 = chh.this.O_();
            return $$0 != null && $$0.bL() && chh.cm.test($$0) && chh.this.g($$0) > 36.0 && !chh.this.ci() && !chh.this.gt() && !chh.this.bm;
         }
      }

      @Override
      public void d() {
         chh.this.x(false);
         chh.this.B(false);
      }

      @Override
      public void e() {
         bvg $$0 = chh.this.O_();
         if ($$0 != null && chh.a(chh.this, $$0)) {
            chh.this.A(true);
            chh.this.z(true);
            chh.this.L().m();
            chh.this.H().a($$0, (float)chh.this.ab(), (float)chh.this.aa());
         } else {
            chh.this.A(false);
            chh.this.z(false);
         }
      }

      @Override
      public void a() {
         bvg $$0 = chh.this.O_();
         if ($$0 != null) {
            chh.this.H().a($$0, (float)chh.this.ab(), (float)chh.this.aa());
            if (chh.this.g($$0) <= 36.0) {
               chh.this.A(true);
               chh.this.z(true);
               chh.this.L().m();
            } else {
               chh.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azv {
      a(0, "red"),
      b(1, "snow");

      public static final azv.a<chh.v> c = azv.a(chh.v::values);
      private static final IntFunction<chh.v> d = axq.a(chh.v::a, values(), axq.a.a);
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

      public static chh.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chh.v a(int $$0) {
         return d.apply($$0);
      }

      public static chh.v a(jr<dhk> $$0) {
         return $$0.a(awo.ar) ? b : a;
      }
   }
}
