import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chi extends cgy implements bwh<chi.v> {
   private static final akm<Integer> cc = akq.a(chi.class, ako.b);
   private static final akm<Byte> cd = akq.a(chi.class, ako.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akm<Optional<UUID>> ci = akq.a(chi.class, ako.r);
   private static final akm<Optional<UUID>> cj = akq.a(chi.class, ako.r);
   static final Predicate<clc> ck = $$0 -> !$$0.t() && $$0.bL();
   private static final Predicate<bul> cl = $$0 -> !($$0 instanceof bvh $$1) ? false : $$1.er() != null && $$1.es() < $$1.af + 600;
   static final Predicate<bul> cm = $$0 -> $$0 instanceof chd || $$0 instanceof chs;
   private static final Predicate<bul> cn = $$0 -> !$$0.cg() && buq.e.test($$0);
   private static final int co = 600;
   private static final buo cp = bus.Z.n().a(0.5F).b(0.2975F);
   private ccf cq;
   private ccf cr;
   private ccf cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chi(bus<? extends chi> $$0, dfm $$1) {
      super($$0, $$1);
      this.bO = new chi.k();
      this.bP = new chi.m();
      this.a(esm.p, 0.0F);
      this.a(esm.q, 0.0F);
      this.a_(true);
      this.L().a(32.0F);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void B() {
      this.cq = new cdy<>(this, cgy.class, 10, false, false, ($$0, $$1) -> $$0 instanceof chd || $$0 instanceof chs);
      this.cr = new cdy<>(this, chz.class, 10, false, false, chz.bY);
      this.cs = new cdy<>(this, cgu.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cgw);
      this.bS.a(0, new chi.g());
      this.bS.a(0, new cbu(this, this.dV()));
      this.bS.a(1, new chi.b());
      this.bS.a(2, new chi.n(2.2));
      this.bS.a(3, new chi.e(1.0));
      this.bS.a(4, new cbm<>(this, cou.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cG()) && !this.gA()));
      this.bS.a(4, new cbm<>(this, cib.class, 8.0F, 1.6, 1.4, $$0 -> !((cib)$$0).n() && !this.gA()));
      this.bS.a(4, new cbm<>(this, chq.class, 8.0F, 1.6, 1.4, $$0 -> !this.gA()));
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
      this.bS.a(12, new chi.j(this, cou.class, 24.0F));
      this.bS.a(13, new chi.r());
      this.bT.a(3, new chi.a(bvh.class, false, false, ($$0, $$1) -> cl.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL() && this.dj()) {
         this.cx++;
         cwm $$0 = this.a(but.a);
         if (this.i($$0)) {
            if (this.cx > 600) {
               cwm $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(but.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ae.i() < 0.1F) {
               this.gs();
               this.dV().a(this, (byte)45);
            }
         }

         bvh $$2 = this.aa_();
         if ($$2 == null || !$$2.bL()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fP() || this.fg()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      }

      super.d_();
      if (this.gA() && this.ae.i() < 0.05F) {
         this.a(awn.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eE();
   }

   private boolean i(cwm $$0) {
      return $$0.b(ku.w) && this.aa_() == null && this.aJ() && !this.fP();
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cwm $$3;
         if ($$2 < 0.05F) {
            $$3 = new cwm(cwq.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cwm(cwq.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cwm(cwq.uV) : new cwm(cwq.uW);
         } else if ($$2 < 0.6F) {
            $$3 = new cwm(cwq.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cwm(cwq.qE);
         } else {
            $$3 = new cwm(cwq.pu);
         }

         this.a(but.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwm $$1 = this.a(but.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ezy $$3 = new ezy(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lo(ls.S, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.v, 0.3F).a(bwp.s, 10.0).a(bwp.c, 2.0).a(bwp.x, 5.0).a(bwp.m, 32.0);
   }

   @Nullable
   public chi b(arp $$0, buc $$1) {
      chi $$2 = bus.Z.a($$0, bur.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.q() : ((chi)$$1).q());
      }

      return $$2;
   }

   public static boolean c(bus<chi> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      jq<dgo> $$4 = $$0.t(this.dv());
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

      if ($$0 instanceof arp) {
         this.gy();
      }

      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gy() {
      if (this.q() == chi.v.a) {
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
   protected void gs() {
      this.a(awn.jk, 1.0F, 1.0F);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? cp : super.e($$0);
   }

   public chi.v q() {
      return chi.v.a(this.al.a(cc));
   }

   public void a(chi.v $$0) {
      this.al.a(cc, $$0.a());
   }

   List<UUID> gz() {
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
   public void b(ul $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gz();
      ur $$2 = new ur();

      for (UUID $$3 : $$1) {
         $$2.add(va.a($$3));
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fP());
      $$0.a("Type", this.q().c());
      $$0.a("Sitting", this.v());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);

      for (vi $$2 : $$0.c("Trusted", 11)) {
         this.b(va.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(chi.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dV() instanceof arp) {
         this.gy();
      }
   }

   public boolean v() {
      return this.s(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gm() {
      return this.s(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gA() {
      return this.s(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fP() {
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
      return $$0 == but.a && this.fL();
   }

   @Override
   public boolean g(cwm $$0) {
      cwm $$1 = this.a(but.a);
      return $$1.f() || this.cx > 0 && $$0.b(ku.w) && !$$1.b(ku.w);
   }

   private void k(cwm $$0) {
      if (!$$0.f() && !this.dV().C) {
         clc $$1 = new clc(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awn.jp, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(cwm $$0) {
      clc $$1 = new clc(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      cwm $$2 = $$1.j();
      if (this.g($$2)) {
         int $$3 = $$2.L();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(but.a));
         this.a($$1);
         this.a(but.a, $$2.a(1));
         this.g(but.a);
         this.a($$1, $$2.L());
         $$1.at();
         this.cx = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bj();
         if ($$0 || this.aa_() != null || this.dV().ad()) {
            this.gB();
         }

         if ($$0 || this.fP()) {
            this.x(false);
         }

         if (this.gm() && this.dV().A.i() < 0.2F) {
            jh $$1 = this.dv();
            dvv $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, diq.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gq()) {
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
   public boolean j(cwm $$0) {
      return $$0.a(axl.ad);
   }

   @Override
   protected void a(cou $$0, bvj $$1) {
      ((chi)$$1).b($$0.cG());
   }

   public boolean gn() {
      return this.s(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean go() {
      return this.bm;
   }

   public boolean gp() {
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

   public boolean gq() {
      return this.s(8);
   }

   public float J(float $$0) {
      return azm.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azm.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bvh $$0) {
      if (this.gA() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gB() {
      this.D(false);
   }

   void gC() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gD() {
      return !this.fP() && !this.v() && !this.gm();
   }

   @Override
   public void R() {
      awm $$0 = this.t();
      if ($$0 == awn.jm) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected awm t() {
      if (this.fP()) {
         return awn.jn;
      } else {
         if (!this.dV().T() && this.ae.i() < 0.1F) {
            List<cou> $$0 = this.dV().a(cou.class, this.cR().c(16.0, 16.0, 16.0), buq.f);
            if ($$0.isEmpty()) {
               return awn.jm;
            }
         }

         return awn.jh;
      }
   }

   @Nullable
   @Override
   protected awm e(btb $$0) {
      return awn.jl;
   }

   @Nullable
   @Override
   protected awm n_() {
      return awn.jj;
   }

   boolean c(UUID $$0) {
      return this.gz().contains($$0);
   }

   @Override
   protected void b(arp $$0, btb $$1) {
      cwm $$2 = this.a(but.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(but.a, cwm.k);
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
            if (!$$0.dV().a_(jh.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
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
            arp $$0 = a(chi.this.dV());

            for (UUID $$1 : chi.this.gz()) {
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

         chi.this.a(awn.jg, 1.0F, 1.0F);
         chi.this.C(true);
         chi.this.gB();
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
         return chi.this.gm();
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
      public boolean test(bvh $$0, arp $$1) {
         if ($$0 instanceof chi) {
            return false;
         } else if ($$0 instanceof chd || $$0 instanceof chs || $$0 instanceof cly) {
            return true;
         } else if ($$0 instanceof bwe) {
            return !((bwe)$$0).n();
         } else if (!($$0 instanceof cou) || !$$0.Y_() && !((cou)$$0).b()) {
            return chi.this.c($$0.cG()) ? false : !$$0.fP() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends ccf {
      private final cfy b = cfy.a().a(12.0).d().a(chi.this.new c());

      protected boolean h() {
         jh $$0 = jh.a(chi.this.dA(), chi.this.cR().e, chi.this.dG());
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
         ((chi)this.a).gC();
         ((chi)this.c).gC();
         super.d();
      }

      @Override
      protected void g() {
         arp $$0 = this.b;
         chi $$1 = (chi)this.a.a($$0, (buc)this.c);
         if ($$1 != null) {
            arq $$2 = this.a.gv();
            arq $$3 = this.c.gv();
            arq $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cG());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cG());
            }

            if ($$4 != null) {
               $$4.a(awx.P);
               ao.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gx();
            this.c.gx();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.N().b(dfi.f)) {
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
      protected boolean a(dfp $$0, jh $$1) {
         dvv $$2 = $$0.a_($$1);
         return $$2.a(dis.oi) && $$2.c(dqt.c) >= 2 || djm.j_($$2);
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
            chi.this.a(awn.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(chi.this.dV()).N().b(dfi.c)) {
            dvv $$0 = chi.this.dV().a_(this.e);
            if ($$0.a(dis.oi)) {
               this.b($$0);
            } else if (djm.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dvv $$0) {
         djm.a(chi.this, $$0, chi.this.dV(), this.e);
      }

      private void b(dvv $$0) {
         int $$1 = $$0.c(dqt.c);
         $$0.b(dqt.c, Integer.valueOf(1));
         int $$2 = 1 + chi.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwm $$3 = chi.this.a(but.a);
         if ($$3.f()) {
            chi.this.a(but.a, new cwm(cwq.wN));
            $$2--;
         }

         if ($$2 > 0) {
            diq.a(chi.this.dV(), this.e, new cwm(cwq.wN, $$2));
         }

         chi.this.a(awn.zw, 1.0F, 1.0F);
         chi.this.dV().a(this.e, $$0.b(dqt.c, Integer.valueOf(1)), 2);
         chi.this.dV().a(ear.c, this.e, ear.a.a(chi.this));
      }

      @Override
      public boolean b() {
         return !chi.this.fP() && super.b();
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
         chi.this.gC();
      }

      @Override
      public boolean b() {
         return chi.this.bj() && chi.this.b(axi.a) > 0.25 || chi.this.bx();
      }
   }

   class h extends cce {
      private final chi d;

      public h(final chi $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gA() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gA() && super.c();
      }

      @Override
      public void d() {
         this.d.gC();
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
         return super.b() && !chi.this.gm() && !chi.this.gq();
      }

      @Override
      public boolean c() {
         return super.c() && !chi.this.gm() && !chi.this.gq();
      }
   }

   public class k extends cbh {
      public k() {
         super(chi.this);
      }

      @Override
      public void a() {
         if (!chi.this.fP()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chi.this.gn() && !chi.this.ci() && !chi.this.gq() && !chi.this.gm();
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
            chi.this.a(awn.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chi.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chi.this.v() && !chi.this.fP() && !chi.this.ci() && !chi.this.gm() && super.b();
      }
   }

   class m extends cbi {
      public m() {
         super(chi.this);
      }

      @Override
      public void a() {
         if (chi.this.gD()) {
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
         return !chi.this.gA() && super.h();
      }
   }

   public class o extends ccj {
      @Override
      public boolean b() {
         if (!chi.this.gp()) {
            return false;
         } else {
            bvh $$0 = chi.this.aa_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = chi.a(chi.this, $$0);
                  if (!$$1) {
                     chi.this.L().a($$0, 0);
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
         bvh $$0 = chi.this.aa_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = chi.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chi.this.dN()) < 15.0F) || !chi.this.aJ()) && !chi.this.gm();
         } else {
            return false;
         }
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public void d() {
         chi.this.t(true);
         chi.this.y(true);
         chi.this.A(false);
         bvh $$0 = chi.this.aa_();
         if ($$0 != null) {
            chi.this.H().a($$0, 60.0F, 30.0F);
            ezy $$1 = new ezy($$0.dA() - chi.this.dA(), $$0.dC() - chi.this.dC(), $$0.dG() - chi.this.dG()).d();
            chi.this.h(chi.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chi.this.L().o();
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
         bvh $$0 = chi.this.aa_();
         if ($$0 != null) {
            chi.this.H().a($$0, 60.0F, 30.0F);
         }

         if (!chi.this.gm()) {
            ezy $$1 = chi.this.dy();
            if ($$1.e * $$1.e < 0.03F && chi.this.dN() != 0.0F) {
               chi.this.w(azm.i(0.2F, chi.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chi.this.w((float)$$3);
            }
         }

         if ($$0 != null && chi.this.f($$0) <= 2.0F) {
            chi.this.c(a(chi.this.dV()), $$0);
         } else if (chi.this.dN() > 0.0F && chi.this.aJ() && (float)chi.this.dy().e != 0.0F && chi.this.dV().a_(chi.this.dv()).a(dis.dN)) {
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
         } else if (chi.this.aa_() != null || chi.this.ep() != null) {
            return false;
         } else if (!chi.this.gD()) {
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
         cwm $$1 = chi.this.a(but.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chi.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<clc> $$0 = chi.this.dV().a(clc.class, chi.this.cR().c(8.0, 8.0, 8.0), chi.ck);
         if (!$$0.isEmpty()) {
            chi.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cdl {
      public q(final int $$0, final int $$1) {
         super(chi.this, $$1);
      }

      @Override
      public void d() {
         chi.this.gC();
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
         return !chi.this.fP() && !chi.this.v() && !chi.this.gA() && chi.this.aa_() == null;
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
            && !chi.this.fP()
            && chi.this.aa_() == null
            && chi.this.L().m()
            && !this.i()
            && !chi.this.gn()
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
         chi.this.L().o();
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

         chi.this.H().a(chi.this.dA() + this.c, chi.this.dE(), chi.this.dG() + this.d, (float)chi.this.aa(), (float)chi.this.Z());
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
         if (!chi.this.fP() && this.a.aa_() == null) {
            if (chi.this.dV().ad() && chi.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jh $$0 = this.a.dv();
               return chi.this.dV().T() && chi.this.dV().h($$0) && !((arp)chi.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chi.this.gC();
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
         return chi.this.bn == 0.0F && chi.this.bo == 0.0F && chi.this.bp == 0.0F ? this.k() || chi.this.fP() : false;
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
            return chi.this.dV().T() && this.h() && !this.i() && !chi.this.av;
         }
      }

      @Override
      public void e() {
         this.d = chi.this.ae.a(c);
         chi.this.gC();
      }

      @Override
      public void d() {
         chi.this.x(false);
         chi.this.z(false);
         chi.this.A(false);
         chi.this.t(false);
         chi.this.D(true);
         chi.this.L().o();
         chi.this.I().a(chi.this.dA(), chi.this.dC(), chi.this.dG(), 0.0);
      }
   }

   class u extends ccf {
      public u() {
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         if (chi.this.fP()) {
            return false;
         } else {
            bvh $$0 = chi.this.aa_();
            return $$0 != null && $$0.bL() && chi.cm.test($$0) && chi.this.g($$0) > 36.0 && !chi.this.ci() && !chi.this.gq() && !chi.this.bm;
         }
      }

      @Override
      public void d() {
         chi.this.x(false);
         chi.this.B(false);
      }

      @Override
      public void e() {
         bvh $$0 = chi.this.aa_();
         if ($$0 != null && chi.a(chi.this, $$0)) {
            chi.this.A(true);
            chi.this.z(true);
            chi.this.L().o();
            chi.this.H().a($$0, (float)chi.this.aa(), (float)chi.this.Z());
         } else {
            chi.this.A(false);
            chi.this.z(false);
         }
      }

      @Override
      public void a() {
         bvh $$0 = chi.this.aa_();
         if ($$0 != null) {
            chi.this.H().a($$0, (float)chi.this.aa(), (float)chi.this.Z());
            if (chi.this.g($$0) <= 36.0) {
               chi.this.A(true);
               chi.this.z(true);
               chi.this.L().o();
            } else {
               chi.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bai {
      a(0, "red"),
      b(1, "snow");

      public static final bai.a<chi.v> c = bai.a(chi.v::values);
      private static final IntFunction<chi.v> d = ayd.a(chi.v::a, values(), ayd.a.a);
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

      public static chi.v a(jq<dgo> $$0) {
         return $$0.a(axb.ar) ? b : a;
      }
   }
}
