import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chi extends cgy implements bwh<chi.v> {
   private static final ajy<Integer> cc = akc.a(chi.class, aka.b);
   private static final ajy<Byte> cd = akc.a(chi.class, aka.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajy<Optional<UUID>> ci = akc.a(chi.class, aka.r);
   private static final ajy<Optional<UUID>> cj = akc.a(chi.class, aka.r);
   static final Predicate<clc> ck = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<bul> cl = $$0 -> !($$0 instanceof bvh $$1) ? false : $$1.er() != null && $$1.es() < $$1.af + 600;
   static final Predicate<bul> cm = $$0 -> $$0 instanceof chd || $$0 instanceof chs;
   private static final Predicate<bul> cn = $$0 -> !$$0.cg() && buq.e.test($$0);
   private static final int co = 600;
   private static final buo cp = bus.aa.n().a(0.5F).b(0.2975F);
   private ccf cq;
   private ccf cr;
   private ccf cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chi(bus<? extends chi> $$0, dgi $$1) {
      super($$0, $$1);
      this.bO = new chi.k();
      this.bP = new chi.m();
      this.a(etq.p, 0.0F);
      this.a(etq.q, 0.0F);
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
      this.cq = new cdy<>(this, cgy.class, 10, false, false, ($$0, $$1) -> $$0 instanceof chd || $$0 instanceof chs);
      this.cr = new cdy<>(this, chz.class, 10, false, false, chz.bY);
      this.cs = new cdy<>(this, cgu.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cgw);
      this.bS.a(0, new chi.g());
      this.bS.a(0, new cbu(this, this.dV()));
      this.bS.a(1, new chi.b());
      this.bS.a(2, new chi.n(2.2));
      this.bS.a(3, new chi.e(1.0));
      this.bS.a(4, new cbm<>(this, cox.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cG()) && !this.gG()));
      this.bS.a(4, new cbm<>(this, cib.class, 8.0F, 1.6, 1.4, $$0 -> !((cib)$$0).p() && !this.gG()));
      this.bS.a(4, new cbm<>(this, chq.class, 8.0F, 1.6, 1.4, $$0 -> !this.gG()));
      this.bS.a(5, new chi.u());
      this.bS.a(6, new chi.o());
      this.bS.a(6, new chi.s(1.25));
      this.bS.a(7, new chi.l(1.2F, true));
      this.bS.a(7, new chi.t());
      this.bS.a(8, new chi.h(this, 1.25));
      this.bS.a(9, new chi.q(32, 200));
      this.bS.a(10, new chi.f(1.2F, 12, 1));
      this.bS.a(10, new ccl(this, 0.4F));
      this.bS.a(11, new cds(this, 1.0));
      this.bS.a(11, new chi.p());
      this.bS.a(12, new chi.j(this, cox.class, 24.0F));
      this.bS.a(13, new chi.r());
      this.bT.a(3, new chi.a(bvh.class, false, false, ($$0, $$1) -> cl.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL() && this.dj()) {
         this.cx++;
         cwp $$0 = this.a(but.a);
         if (this.i($$0)) {
            if (this.cx > 600) {
               cwp $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(but.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ae.i() < 0.1F) {
               this.gy();
               this.dV().a(this, (byte)45);
            }
         }

         bvh $$2 = this.O_();
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

   private boolean i(cwp $$0) {
      return $$0.b(kv.w) && this.O_() == null && this.aJ() && !this.fR();
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
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

         this.a(but.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwp $$1 = this.a(but.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fba $$3 = new fba(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lp(lt.T, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwo.a p() {
      return cgy.gx().a(bwp.v, 0.3F).a(bwp.s, 10.0).a(bwp.c, 2.0).a(bwp.x, 5.0).a(bwp.m, 32.0);
   }

   @Nullable
   public chi b(ard $$0, buc $$1) {
      chi $$2 = bus.aa.a($$0, bur.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((chi)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bus<chi> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      jr<dhk> $$4 = $$0.t(this.dv());
      chi.v $$5 = chi.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chi.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chi.i($$5);
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
      if (this.t() == chi.v.a) {
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
   public buo e(bvt $$0) {
      return this.e_() ? cp : super.e($$0);
   }

   public chi.v t() {
      return chi.v.a(this.al.a(cc));
   }

   public void a(chi.v $$0) {
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
      this.a(chi.v.a($$0.l("Type")));
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
   protected boolean f(but $$0) {
      return $$0 == but.a && this.fN();
   }

   @Override
   public boolean g(cwp $$0) {
      cwp $$1 = this.a(but.a);
      return $$1.f() || this.cx > 0 && $$0.b(kv.w) && !$$1.b(kv.w);
   }

   private void k(cwp $$0) {
      if (!$$0.f() && !this.dV().C) {
         clc $$1 = new clc(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jO, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(cwp $$0) {
      clc $$1 = new clc(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(ard $$0, clc $$1) {
      cwp $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(but.a));
         this.a($$1);
         this.a(but.a, $$2.a(1));
         this.g(but.a);
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
            dwx $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, djm.j($$2));
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
   public boolean j(cwp $$0) {
      return $$0.a(awy.ac);
   }

   @Override
   protected void a(cox $$0, bvj $$1) {
      ((chi)$$1).b($$0.cG());
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
   public void h(@Nullable bvh $$0) {
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
            List<cox> $$0 = this.dV().a(cox.class, this.cR().c(16.0, 16.0, 16.0), buq.f);
            if ($$0.isEmpty()) {
               return awa.jL;
            }
         }

         return awa.jG;
      }
   }

   @Nullable
   @Override
   protected avz e(btb $$0) {
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
   protected void b(ard $$0, btb $$1) {
      cwp $$2 = this.a(but.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(but.a, cwp.j);
      }

      super.b($$0, $$1);
   }

   public static boolean a(chi $$0, bvh $$1) {
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
   public fba cT() {
      return new fba(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cdy<bvh> {
      @Nullable
      private bvh j;
      @Nullable
      private bvh k;
      private int l;

      public a(final Class<bvh> $$0, final boolean $$1, final boolean $$2, @Nullable final cfy.a $$3) {
         super(chi.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            ard $$0 = a(chi.this.dV());

            for (UUID $$1 : chi.this.gF()) {
               if ($$0.a($$1) instanceof bvh $$3) {
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

         chi.this.a(awa.jF, 1.0F, 1.0F);
         chi.this.C(true);
         chi.this.gH();
         super.d();
      }
   }

   class b extends ccf {
      int a;

      public b() {
         this.a(EnumSet.of(ccf.a.b, ccf.a.c, ccf.a.a));
      }

      @Override
      public boolean b() {
         return chi.this.gs();
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
         chi.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cfy.a {
      @Override
      public boolean test(bvh $$0, ard $$1) {
         if ($$0 instanceof chi) {
            return false;
         } else if ($$0 instanceof chd || $$0 instanceof chs || $$0 instanceof cly) {
            return true;
         } else if ($$0 instanceof bwe) {
            return !((bwe)$$0).p();
         } else if (!($$0 instanceof cox) || !$$0.Z_() && !((cox)$$0).b()) {
            return chi.this.c($$0.cG()) ? false : !$$0.fR() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends ccf {
      private final cfy b = cfy.a().a(12.0).d().a(chi.this.new c());

      protected boolean h() {
         ji $$0 = ji.a(chi.this.dA(), chi.this.cR().e, chi.this.dG());
         return !chi.this.dV().h($$0) && chi.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(chi.this.dV()).a(bvh.class, this.b, chi.this, chi.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbr {
      public e(final double $$0) {
         super(chi.this, $$0);
      }

      @Override
      public void d() {
         ((chi)this.a).gI();
         ((chi)this.c).gI();
         super.d();
      }

      @Override
      protected void g() {
         ard $$0 = this.b;
         chi $$1 = (chi)this.a.a($$0, (buc)this.c);
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
            if ($$0.O().b(dge.f)) {
               this.b.b(new bux(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends ccs {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chi.this, $$1, $$2, $$3);
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
         } else if (!this.m() && chi.this.ae.i() < 0.05F) {
            chi.this.a(awa.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(chi.this.dV()).O().b(dge.c)) {
            dwx $$0 = chi.this.dV().a_(this.e);
            if ($$0.a(djo.oK)) {
               this.b($$0);
            } else if (dkj.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dwx $$0) {
         dkj.a(chi.this, $$0, chi.this.dV(), this.e);
      }

      private void b(dwx $$0) {
         int $$1 = $$0.c(dru.c);
         $$0.b(dru.c, Integer.valueOf(1));
         int $$2 = 1 + chi.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwp $$3 = chi.this.a(but.a);
         if ($$3.f()) {
            chi.this.a(but.a, new cwp(cwt.xv));
            $$2--;
         }

         if ($$2 > 0) {
            djm.a(chi.this.dV(), this.e, new cwp(cwt.xv, $$2));
         }

         chi.this.a(awa.Ag, 1.0F, 1.0F);
         chi.this.dV().a(this.e, $$0.b(dru.c, Integer.valueOf(1)), 2);
         chi.this.dV().a(ebt.c, this.e, ebt.a.a(chi.this));
      }

      @Override
      public boolean b() {
         return !chi.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chi.this.x(false);
         super.d();
      }
   }

   class g extends cbz {
      public g() {
         super(chi.this);
      }

      @Override
      public void d() {
         super.d();
         chi.this.gI();
      }

      @Override
      public boolean b() {
         return chi.this.bj() && chi.this.b(awv.a) > 0.25 || chi.this.bx();
      }
   }

   static class h extends cce {
      private final chi d;

      public h(chi $$0, double $$1) {
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

   public static class i extends buc.a {
      public final chi.v a;

      public i(chi.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ccn {
      public j(final bvj $$0, final Class<? extends bvh> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chi.this.gs() && !chi.this.gw();
      }

      @Override
      public boolean c() {
         return super.c() && !chi.this.gs() && !chi.this.gw();
      }
   }

   public class k extends cbh {
      public k() {
         super(chi.this);
      }

      @Override
      public void a() {
         if (!chi.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chi.this.gt() && !chi.this.ci() && !chi.this.gw() && !chi.this.gs();
      }
   }

   class l extends ccp {
      public l(final double $$0, final boolean $$1) {
         super(chi.this, $$0, $$1);
      }

      @Override
      protected void a(bvh $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chi.this.a(awa.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chi.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chi.this.x() && !chi.this.fR() && !chi.this.ci() && !chi.this.gs() && super.b();
      }
   }

   class m extends cbi {
      public m() {
         super(chi.this);
      }

      @Override
      public void a() {
         if (chi.this.gJ()) {
            super.a();
         }
      }
   }

   class n extends ccy {
      public n(final double $$0) {
         super(chi.this, $$0);
      }

      @Override
      public boolean h() {
         return !chi.this.gG() && super.h();
      }
   }

   public class o extends ccj {
      @Override
      public boolean b() {
         if (!chi.this.gv()) {
            return false;
         } else {
            bvh $$0 = chi.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = chi.a(chi.this, $$0);
                  if (!$$1) {
                     chi.this.P().a($$0, 0);
                     chi.this.z(false);
                     chi.this.A(false);
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
         bvh $$0 = chi.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = chi.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chi.this.dN()) < 15.0F) || !chi.this.aJ()) && !chi.this.gs();
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
         chi.this.t(true);
         chi.this.y(true);
         chi.this.A(false);
         bvh $$0 = chi.this.O_();
         if ($$0 != null) {
            chi.this.L().a($$0, 60.0F, 30.0F);
            fba $$1 = new fba($$0.dA() - chi.this.dA(), $$0.dC() - chi.this.dC(), $$0.dG() - chi.this.dG()).d();
            chi.this.i(chi.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chi.this.P().m();
      }

      @Override
      public void e() {
         chi.this.z(false);
         chi.this.cv = 0.0F;
         chi.this.cw = 0.0F;
         chi.this.A(false);
         chi.this.y(false);
      }

      @Override
      public void a() {
         bvh $$0 = chi.this.O_();
         if ($$0 != null) {
            chi.this.L().a($$0, 60.0F, 30.0F);
         }

         if (!chi.this.gs()) {
            fba $$1 = chi.this.dy();
            if ($$1.e * $$1.e < 0.03F && chi.this.dN() != 0.0F) {
               chi.this.w(ayz.i(0.2F, chi.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chi.this.w((float)$$3);
            }
         }

         if ($$0 != null && chi.this.f($$0) <= 2.0F) {
            chi.this.c(a(chi.this.dV()), $$0);
         } else if (chi.this.dN() > 0.0F && chi.this.aJ() && (float)chi.this.dy().e != 0.0F && chi.this.dV().a_(chi.this.dv()).a(djo.ea)) {
            chi.this.w(60.0F);
            chi.this.h(null);
            chi.this.B(true);
         }
      }
   }

   class p extends ccf {
      public p() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (!chi.this.a(but.a).f()) {
            return false;
         } else if (chi.this.O_() != null || chi.this.ep() != null) {
            return false;
         } else if (!chi.this.gJ()) {
            return false;
         } else if (chi.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<clc> $$0 = chi.this.dV().a(clc.class, chi.this.cR().c(8.0, 8.0, 8.0), chi.ck);
            return !$$0.isEmpty() && chi.this.a(but.a).f();
         }
      }

      @Override
      public void a() {
         List<clc> $$0 = chi.this.dV().a(clc.class, chi.this.cR().c(8.0, 8.0, 8.0), chi.ck);
         cwp $$1 = chi.this.a(but.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chi.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<clc> $$0 = chi.this.dV().a(clc.class, chi.this.cR().c(8.0, 8.0, 8.0), chi.ck);
         if (!$$0.isEmpty()) {
            chi.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cdl {
      public q(final int $$0, final int $$1) {
         super(chi.this, $$1);
      }

      @Override
      public void d() {
         chi.this.gI();
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
         return !chi.this.fR() && !chi.this.x() && !chi.this.gG() && chi.this.O_() == null;
      }
   }

   class r extends chi.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         return chi.this.ep() == null
            && chi.this.dY().i() < 0.02F
            && !chi.this.fR()
            && chi.this.O_() == null
            && chi.this.P().k()
            && !this.i()
            && !chi.this.gt()
            && !chi.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chi.this.dY().a(3);
         chi.this.x(true);
         chi.this.P().m();
      }

      @Override
      public void e() {
         chi.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chi.this.L().a(chi.this.dA() + this.c, chi.this.dE(), chi.this.dG() + this.d, (float)chi.this.af(), (float)chi.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chi.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chi.this.dY().a(20));
      }
   }

   class s extends cby {
      private int c = b(100);

      public s(final double $$0) {
         super(chi.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chi.this.fR() && this.a.O_() == null) {
            if (chi.this.dV().af() && chi.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ji $$0 = this.a.dv();
               return chi.this.dV().V() && chi.this.dV().h($$0) && !((ard)chi.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chi.this.gI();
         super.d();
      }
   }

   class t extends chi.d {
      private static final int c = b(140);
      private int d = chi.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ccf.a.a, ccf.a.b, ccf.a.c));
      }

      @Override
      public boolean b() {
         return chi.this.bn == 0.0F && chi.this.bo == 0.0F && chi.this.bp == 0.0F ? this.k() || chi.this.fR() : false;
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
            return chi.this.dV().V() && this.h() && !this.i() && !chi.this.av;
         }
      }

      @Override
      public void e() {
         this.d = chi.this.ae.a(c);
         chi.this.gI();
      }

      @Override
      public void d() {
         chi.this.x(false);
         chi.this.z(false);
         chi.this.A(false);
         chi.this.t(false);
         chi.this.D(true);
         chi.this.P().m();
         chi.this.N().a(chi.this.dA(), chi.this.dC(), chi.this.dG(), 0.0);
      }
   }

   class u extends ccf {
      public u() {
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         if (chi.this.fR()) {
            return false;
         } else {
            bvh $$0 = chi.this.O_();
            return $$0 != null && $$0.bL() && chi.cm.test($$0) && chi.this.g($$0) > 36.0 && !chi.this.ci() && !chi.this.gw() && !chi.this.bm;
         }
      }

      @Override
      public void d() {
         chi.this.x(false);
         chi.this.B(false);
      }

      @Override
      public void e() {
         bvh $$0 = chi.this.O_();
         if ($$0 != null && chi.a(chi.this, $$0)) {
            chi.this.A(true);
            chi.this.z(true);
            chi.this.P().m();
            chi.this.L().a($$0, (float)chi.this.af(), (float)chi.this.ad());
         } else {
            chi.this.A(false);
            chi.this.z(false);
         }
      }

      @Override
      public void a() {
         bvh $$0 = chi.this.O_();
         if ($$0 != null) {
            chi.this.L().a($$0, (float)chi.this.af(), (float)chi.this.ad());
            if (chi.this.g($$0) <= 36.0) {
               chi.this.A(true);
               chi.this.z(true);
               chi.this.P().m();
            } else {
               chi.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azv {
      a(0, "red"),
      b(1, "snow");

      public static final azv.a<chi.v> c = azv.a(chi.v::values);
      private static final IntFunction<chi.v> d = axq.a(chi.v::a, values(), axq.a.a);
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

      public static chi.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chi.v a(int $$0) {
         return d.apply($$0);
      }

      public static chi.v a(jr<dhk> $$0) {
         return $$0.a(awo.ar) ? b : a;
      }
   }
}
