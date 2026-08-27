import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccn extends ccd implements brn<ccn.v> {
   private static final aiy<Integer> cb = ajc.a(ccn.class, aja.b);
   private static final aiy<Byte> cc = ajc.a(ccn.class, aja.a);
   private static final int cd = 1;
   public static final int bX = 4;
   public static final int bY = 8;
   public static final int ca = 16;
   private static final int ce = 32;
   private static final int cf = 64;
   private static final int cg = 128;
   private static final aiy<Optional<UUID>> ch = ajc.a(ccn.class, aja.q);
   private static final aiy<Optional<UUID>> ci = ajc.a(ccn.class, aja.q);
   static final Predicate<cgd> cj = $$0 -> !$$0.y() && $$0.bA();
   private static final Predicate<bpv> ck = $$0 -> !($$0 instanceof bqo $$1) ? false : $$1.el() != null && $$1.em() < $$1.ah + 600;
   static final Predicate<bpv> cl = $$0 -> $$0 instanceof cci || $$0 instanceof ccx;
   private static final Predicate<bpv> cm = $$0 -> !$$0.bV() && bqa.e.test($$0);
   private static final int cn = 600;
   private static final bpy co = bqb.Q.n().a(0.5F).b(0.2975F);
   private bxl cp;
   private bxl cq;
   private bxl cr;
   private float cs;
   private float ct;
   float cu;
   float cv;
   private int cw;

   public ccn(bqb<? extends ccn> $$0, cyx $$1) {
      super($$0, $$1);
      this.bN = new ccn.k();
      this.bO = new ccn.m();
      this.a(elj.p, 0.0F);
      this.a(elj.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ch, Optional.empty());
      $$0.a(ci, Optional.empty());
      $$0.a(cb, 0);
      $$0.a(cc, (byte)0);
   }

   @Override
   protected void z() {
      this.cp = new bze<>(this, ccd.class, 10, false, false, $$0 -> $$0 instanceof cci || $$0 instanceof ccx);
      this.cq = new bze<>(this, cde.class, 10, false, false, cde.bY);
      this.cr = new bze<>(this, cca.class, 20, false, false, $$0 -> $$0 instanceof ccc);
      this.bR.a(0, new ccn.g());
      this.bR.a(0, new bxa(this, this.dM()));
      this.bR.a(1, new ccn.b());
      this.bR.a(2, new ccn.n(2.2));
      this.bR.a(3, new ccn.e(1.0));
      this.bR.a(4, new bws<>(this, cjt.class, 16.0F, 1.6, 1.4, $$0 -> cm.test($$0) && !this.c($$0.cw()) && !this.gz()));
      this.bR.a(4, new bws<>(this, cdg.class, 8.0F, 1.6, 1.4, $$0 -> !((cdg)$$0).r() && !this.gz()));
      this.bR.a(4, new bws<>(this, ccv.class, 8.0F, 1.6, 1.4, $$0 -> !this.gz()));
      this.bR.a(5, new ccn.u());
      this.bR.a(6, new ccn.o());
      this.bR.a(6, new ccn.s(1.25));
      this.bR.a(7, new ccn.l(1.2F, true));
      this.bR.a(7, new ccn.t());
      this.bR.a(8, new ccn.h(this, 1.25));
      this.bR.a(9, new ccn.q(32, 200));
      this.bR.a(10, new ccn.f(1.2F, 12, 1));
      this.bR.a(10, new bxr(this, 0.4F));
      this.bR.a(11, new byy(this, 1.0));
      this.bR.a(11, new ccn.p());
      this.bR.a(12, new ccn.j(this, cjt.class, 24.0F));
      this.bR.a(13, new ccn.r());
      this.bS.a(3, new ccn.a(bqo.class, false, false, $$0 -> ck.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public aul d(crj $$0) {
      return aum.je;
   }

   @Override
   public void n_() {
      if (!this.dM().B && this.bA() && this.cY()) {
         this.cw++;
         crj $$0 = this.d(bqc.a);
         if (this.n($$0)) {
            if (this.cw > 600) {
               crj $$1 = $$0.a(this.dM(), this);
               if (!$$1.d()) {
                  this.a(bqc.a, $$1);
               }

               this.cw = 0;
            } else if (this.cw > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bqo $$2 = this.p();
         if ($$2 == null || !$$2.bA()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fI() || this.fd()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      }

      super.n_();
      if (this.gz() && this.ag.i() < 0.05F) {
         this.a(aum.ja, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fd() {
      return this.ey();
   }

   private boolean n(crj $$0) {
      return $$0.f().y() && this.p() == null && this.aC() && !this.fI();
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         crj $$3;
         if ($$2 < 0.05F) {
            $$3 = new crj(crm.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new crj(crm.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new crj(crm.uB) : new crj(crm.uC);
         } else if ($$2 < 0.6F) {
            $$3 = new crj(crm.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new crj(crm.qC);
         } else {
            $$3 = new crj(crm.ps);
         }

         this.a(bqc.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         crj $$1 = this.d(bqc.a);
         if (!$$1.d()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               esa $$3 = new esa(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new kh(kl.R, $$1), this.dr() + this.bI().c / 2.0, this.dt(), this.dx() + this.bI().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bru.a r() {
      return bqq.A().a(brv.r, 0.3F).a(brv.q, 10.0).a(brv.k, 32.0).a(brv.c, 2.0);
   }

   @Nullable
   public ccn b(aps $$0, bpp $$1) {
      ccn $$2 = bqb.Q.a((cyx)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.u() : ((ccn)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bqb<ccn> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bY) && a($$1, $$3);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      il<czw> $$4 = $$0.t(this.dm());
      ccn.v $$5 = ccn.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ccn.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ccn.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aps) {
         this.gx();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gx() {
      if (this.u() == ccn.v.a) {
         this.bS.a(4, this.cp);
         this.bS.a(4, this.cq);
         this.bS.a(6, this.cr);
      } else {
         this.bS.a(4, this.cr);
         this.bS.a(6, this.cp);
         this.bS.a(6, this.cq);
      }
   }

   @Override
   protected void a(cjt $$0, bnz $$1, crj $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? co : super.e($$0);
   }

   public ccn.v u() {
      return ccn.v.a(this.an.a(cb));
   }

   public void a(ccn.v $$0) {
      this.an.a(cb, $$0.a());
   }

   List<UUID> gy() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.an.a(ch).orElse(null));
      $$0.add(this.an.a(ci).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.an.a(ch).isPresent()) {
         this.an.a(ci, Optional.ofNullable($$0));
      } else {
         this.an.a(ch, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gy();
      ts $$2 = new ts();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(ub.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fI());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);

      for (uj $$2 : $$0.c("Trusted", 11)) {
         this.b(ub.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(ccn.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof aps) {
         this.gx();
      }
   }

   public boolean y() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gn() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gz() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fI() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.a(cc, (byte)(this.an.a(cc) | $$0));
      } else {
         this.an.a(cc, (byte)(this.an.a(cc) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.an.a(cc) & $$0) != 0;
   }

   @Override
   public boolean f(crj $$0) {
      bqc $$1 = bqq.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqc.a && super.f($$0);
   }

   @Override
   public boolean j(crj $$0) {
      cre $$1 = $$0.f();
      crj $$2 = this.d(bqc.a);
      return $$2.d() || this.cw > 0 && $$1.y() && !$$2.f().y();
   }

   private void p(crj $$0) {
      if (!$$0.d() && !this.dM().B) {
         cgd $$1 = new cgd(this.dM(), this.dr() + this.bI().c, this.dt() + 1.0, this.dx() + this.bI().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(aum.jj, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void q(crj $$0) {
      cgd $$1 = new cgd(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cgd $$0) {
      crj $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.G();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bqc.a));
         this.a($$0);
         this.a(bqc.a, $$1.a(1));
         this.f(bqc.a);
         this.a($$0, $$1.G());
         $$0.am();
         this.cw = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cY()) {
         boolean $$0 = this.bc();
         if ($$0 || this.p() != null || this.dM().ab()) {
            this.gA();
         }

         if ($$0 || this.fI()) {
            this.w(false);
         }

         if (this.gn() && this.dM().z.i() < 0.2F) {
            ib $$1 = this.dm();
            doz $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, dby.i($$2));
         }
      }

      this.ct = this.cs;
      if (this.gw()) {
         this.cs = this.cs + (1.0F - this.cs) * 0.4F;
      } else {
         this.cs = this.cs + (0.0F - this.cs) * 0.4F;
      }

      this.cv = this.cu;
      if (this.bX()) {
         this.cu += 0.2F;
         if (this.cu > 3.0F) {
            this.cu = 3.0F;
         }
      } else {
         this.cu = 0.0F;
      }
   }

   @Override
   public boolean o(crj $$0) {
      return $$0.a(avk.X);
   }

   @Override
   protected void a(cjt $$0, bqq $$1) {
      ((ccn)$$1).b($$0.cw());
   }

   public boolean gt() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.bm;
   }

   public boolean gv() {
      return this.cu == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bX() {
      return this.u(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gw() {
      return this.u(8);
   }

   public float G(float $$0) {
      return axk.i($$0, this.ct, this.cs) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axk.i($$0, this.cv, this.cu);
   }

   @Override
   public void h(@Nullable bqo $$0) {
      if (this.gz() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axk.f(($$0 - 5.0F) * $$1);
   }

   void gA() {
      this.C(false);
   }

   void gB() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gC() {
      return !this.fI() && !this.y() && !this.gn();
   }

   @Override
   public void P() {
      aul $$0 = this.v();
      if ($$0 == aum.jg) {
         this.a($$0, 2.0F, this.fc());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected aul v() {
      if (this.fI()) {
         return aum.jh;
      } else {
         if (!this.dM().Q() && this.ag.i() < 0.1F) {
            List<cjt> $$0 = this.dM().a(cjt.class, this.cH().c(16.0, 16.0, 16.0), bqa.f);
            if ($$0.isEmpty()) {
               return aum.jg;
            }
         }

         return aum.jb;
      }
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return aum.jf;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.jd;
   }

   boolean c(UUID $$0) {
      return this.gy().contains($$0);
   }

   @Override
   protected void g(bot $$0) {
      crj $$1 = this.d(bqc.a);
      if (!$$1.d()) {
         this.b($$1);
         this.a(bqc.a, crj.i);
      }

      super.g($$0);
   }

   public static boolean a(ccn $$0, bqo $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(ib.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bze<bqo> {
      @Nullable
      private bqo j;
      @Nullable
      private bqo k;
      private int l;

      public a(Class<bqo> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bqo> $$3) {
         super(ccn.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ei().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : ccn.this.gy()) {
               if ($$0 != null && ccn.this.dM() instanceof aps && ((aps)ccn.this.dM()).a($$0) instanceof bqo $$2) {
                  this.k = $$2;
                  this.j = $$2.ej();
                  int $$3 = $$2.ek();
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
            this.l = this.k.ek();
         }

         ccn.this.a(aum.ja, 1.0F, 1.0F);
         ccn.this.B(true);
         ccn.this.gA();
         super.c();
      }
   }

   class b extends bxl {
      int a;

      public b() {
         this.a(EnumSet.of(bxl.a.b, bxl.a.c, bxl.a.a));
      }

      @Override
      public boolean a() {
         return ccn.this.gn();
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
         ccn.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bqo> {
      public boolean a(bqo $$0) {
         if ($$0 instanceof ccn) {
            return false;
         } else if ($$0 instanceof cci || $$0 instanceof ccx || $$0 instanceof cgz) {
            return true;
         } else if ($$0 instanceof brk) {
            return !((brk)$$0).r();
         } else if (!($$0 instanceof cjt) || !$$0.N_() && !((cjt)$$0).f()) {
            return ccn.this.c($$0.cw()) ? false : !$$0.fI() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bxl {
      private final cbe b = cbe.a().a(12.0).d().a(ccn.this.new c());

      protected boolean h() {
         ib $$0 = ib.a(ccn.this.dr(), ccn.this.cH().e, ccn.this.dx());
         return !ccn.this.dM().h($$0) && ccn.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !ccn.this.dM().a(bqo.class, this.b, ccn.this, ccn.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bwx {
      public e(double $$0) {
         super(ccn.this, $$0);
      }

      @Override
      public void c() {
         ((ccn)this.a).gB();
         ((ccn)this.c).gB();
         super.c();
      }

      @Override
      protected void g() {
         aps $$0 = (aps)this.b;
         ccn $$1 = (ccn)this.a.a($$0, (bpp)this.c);
         if ($$1 != null) {
            apt $$2 = this.a.gq();
            apt $$3 = this.c.gq();
            apt $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(auw.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gs();
            this.c.gs();
            $$1.c_(-24000);
            $$1.b(this.a.dr(), this.a.dt(), this.a.dx(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.aa().b(cyt.f)) {
               this.b.b(new bqe(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.ei().a(7) + 1));
            }
         }
      }
   }

   public class f extends bxy {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(ccn.this, $$1, $$2, $$3);
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
      protected boolean a(cza $$0, ib $$1) {
         doz $$2 = $$0.a_($$1);
         return $$2.a(dca.oi) && $$2.c(dka.c) >= 2 || dcu.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ccn.this.ag.i() < 0.05F) {
            ccn.this.a(aum.ji, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (ccn.this.dM().aa().b(cyt.c)) {
            doz $$0 = ccn.this.dM().a_(this.e);
            if ($$0.a(dca.oi)) {
               this.b($$0);
            } else if (dcu.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(doz $$0) {
         dcu.a(ccn.this, $$0, ccn.this.dM(), this.e);
      }

      private void b(doz $$0) {
         int $$1 = $$0.c(dka.c);
         $$0.a(dka.c, Integer.valueOf(1));
         int $$2 = 1 + ccn.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         crj $$3 = ccn.this.d(bqc.a);
         if ($$3.d()) {
            ccn.this.a(bqc.a, new crj(crm.wn));
            $$2--;
         }

         if ($$2 > 0) {
            dby.a(ccn.this.dM(), this.e, new crj(crm.wn, $$2));
         }

         ccn.this.a(aum.yW, 1.0F, 1.0F);
         ccn.this.dM().a(this.e, $$0.a(dka.c, Integer.valueOf(1)), 2);
         ccn.this.dM().a(dts.c, this.e, dts.a.a(ccn.this));
      }

      @Override
      public boolean a() {
         return !ccn.this.fI() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         ccn.this.w(false);
         super.c();
      }
   }

   class g extends bxf {
      public g() {
         super(ccn.this);
      }

      @Override
      public void c() {
         super.c();
         ccn.this.gB();
      }

      @Override
      public boolean a() {
         return ccn.this.bc() && ccn.this.b(avh.a) > 0.25 || ccn.this.bq();
      }
   }

   class h extends bxk {
      private final ccn e;

      public h(ccn $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gz() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gz() && super.b();
      }

      @Override
      public void c() {
         this.e.gB();
         super.c();
      }
   }

   public static class i extends bpp.a {
      public final ccn.v a;

      public i(ccn.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bxt {
      public j(bqq $$0, Class<? extends bqo> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !ccn.this.gn() && !ccn.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && !ccn.this.gn() && !ccn.this.gw();
      }
   }

   public class k extends bwn {
      public k() {
         super(ccn.this);
      }

      @Override
      public void a() {
         if (!ccn.this.fI()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ccn.this.gt() && !ccn.this.bX() && !ccn.this.gw() && !ccn.this.gn();
      }
   }

   class l extends bxv {
      public l(double $$0, boolean $$1) {
         super(ccn.this, $$0, $$1);
      }

      @Override
      protected void a(bqo $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ccn.this.a(aum.jc, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         ccn.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !ccn.this.y() && !ccn.this.fI() && !ccn.this.bX() && !ccn.this.gn() && super.a();
      }
   }

   class m extends bwo {
      public m() {
         super(ccn.this);
      }

      @Override
      public void a() {
         if (ccn.this.gC()) {
            super.a();
         }
      }
   }

   class n extends bye {
      public n(double $$0) {
         super(ccn.this, $$0);
      }

      @Override
      public boolean h() {
         return !ccn.this.gz() && super.h();
      }
   }

   public class o extends bxp {
      @Override
      public boolean a() {
         if (!ccn.this.gv()) {
            return false;
         } else {
            bqo $$0 = ccn.this.p();
            if ($$0 != null && $$0.bA()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = ccn.a(ccn.this, $$0);
                  if (!$$1) {
                     ccn.this.K().a($$0, 0);
                     ccn.this.y(false);
                     ccn.this.z(false);
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
         bqo $$0 = ccn.this.p();
         if ($$0 != null && $$0.bA()) {
            double $$1 = ccn.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ccn.this.dE()) < 15.0F) || !ccn.this.aC()) && !ccn.this.gn();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void c() {
         ccn.this.r(true);
         ccn.this.x(true);
         ccn.this.z(false);
         bqo $$0 = ccn.this.p();
         if ($$0 != null) {
            ccn.this.G().a($$0, 60.0F, 30.0F);
            esa $$1 = new esa($$0.dr() - ccn.this.dr(), $$0.dt() - ccn.this.dt(), $$0.dx() - ccn.this.dx()).d();
            ccn.this.g(ccn.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         ccn.this.K().n();
      }

      @Override
      public void d() {
         ccn.this.y(false);
         ccn.this.cu = 0.0F;
         ccn.this.cv = 0.0F;
         ccn.this.z(false);
         ccn.this.x(false);
      }

      @Override
      public void e() {
         bqo $$0 = ccn.this.p();
         if ($$0 != null) {
            ccn.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!ccn.this.gn()) {
            esa $$1 = ccn.this.dp();
            if ($$1.d * $$1.d < 0.03F && ccn.this.dE() != 0.0F) {
               ccn.this.s(axk.j(0.2F, ccn.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               ccn.this.s((float)$$3);
            }
         }

         if ($$0 != null && ccn.this.f($$0) <= 2.0F) {
            ccn.this.C($$0);
         } else if (ccn.this.dE() > 0.0F && ccn.this.aC() && (float)ccn.this.dp().d != 0.0F && ccn.this.dM().a_(ccn.this.dm()).a(dca.dN)) {
            ccn.this.s(60.0F);
            ccn.this.h(null);
            ccn.this.A(true);
         }
      }
   }

   class p extends bxl {
      public p() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         if (!ccn.this.d(bqc.a).d()) {
            return false;
         } else if (ccn.this.p() != null || ccn.this.ej() != null) {
            return false;
         } else if (!ccn.this.gC()) {
            return false;
         } else if (ccn.this.ei().a(b(10)) != 0) {
            return false;
         } else {
            List<cgd> $$0 = ccn.this.dM().a(cgd.class, ccn.this.cH().c(8.0, 8.0, 8.0), ccn.cj);
            return !$$0.isEmpty() && ccn.this.d(bqc.a).d();
         }
      }

      @Override
      public void e() {
         List<cgd> $$0 = ccn.this.dM().a(cgd.class, ccn.this.cH().c(8.0, 8.0, 8.0), ccn.cj);
         crj $$1 = ccn.this.d(bqc.a);
         if ($$1.d() && !$$0.isEmpty()) {
            ccn.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cgd> $$0 = ccn.this.dM().a(cgd.class, ccn.this.cH().c(8.0, 8.0, 8.0), ccn.cj);
         if (!$$0.isEmpty()) {
            ccn.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends byr {
      public q(int $$0, int $$1) {
         super(ccn.this, $$1);
      }

      @Override
      public void c() {
         ccn.this.gB();
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
         return !ccn.this.fI() && !ccn.this.y() && !ccn.this.gz() && ccn.this.p() == null;
      }
   }

   class r extends ccn.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean a() {
         return ccn.this.ej() == null
            && ccn.this.ei().i() < 0.02F
            && !ccn.this.fI()
            && ccn.this.p() == null
            && ccn.this.K().l()
            && !this.i()
            && !ccn.this.gt()
            && !ccn.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + ccn.this.ei().a(3);
         ccn.this.w(true);
         ccn.this.K().n();
      }

      @Override
      public void d() {
         ccn.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ccn.this.G().a(ccn.this.dr() + this.c, ccn.this.dv(), ccn.this.dx() + this.d, (float)ccn.this.aa(), (float)ccn.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ccn.this.ei().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ccn.this.ei().a(20));
      }
   }

   class s extends bxe {
      private int c = b(100);

      public s(double $$0) {
         super(ccn.this, $$0);
      }

      @Override
      public boolean a() {
         if (!ccn.this.fI() && this.a.p() == null) {
            if (ccn.this.dM().ab() && ccn.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ib $$0 = this.a.dm();
               return ccn.this.dM().Q() && ccn.this.dM().h($$0) && !((aps)ccn.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         ccn.this.gB();
         super.c();
      }
   }

   class t extends ccn.d {
      private static final int c = b(140);
      private int d = ccn.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bxl.a.a, bxl.a.b, bxl.a.c));
      }

      @Override
      public boolean a() {
         return ccn.this.bn == 0.0F && ccn.this.bo == 0.0F && ccn.this.bp == 0.0F ? this.k() || ccn.this.fI() : false;
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
            return ccn.this.dM().Q() && this.h() && !this.i() && !ccn.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = ccn.this.ag.a(c);
         ccn.this.gB();
      }

      @Override
      public void c() {
         ccn.this.w(false);
         ccn.this.y(false);
         ccn.this.z(false);
         ccn.this.r(false);
         ccn.this.C(true);
         ccn.this.K().n();
         ccn.this.H().a(ccn.this.dr(), ccn.this.dt(), ccn.this.dx(), 0.0);
      }
   }

   class u extends bxl {
      public u() {
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean a() {
         if (ccn.this.fI()) {
            return false;
         } else {
            bqo $$0 = ccn.this.p();
            return $$0 != null && $$0.bA() && ccn.cl.test($$0) && ccn.this.g($$0) > 36.0 && !ccn.this.bX() && !ccn.this.gw() && !ccn.this.bm;
         }
      }

      @Override
      public void c() {
         ccn.this.w(false);
         ccn.this.A(false);
      }

      @Override
      public void d() {
         bqo $$0 = ccn.this.p();
         if ($$0 != null && ccn.a(ccn.this, $$0)) {
            ccn.this.z(true);
            ccn.this.y(true);
            ccn.this.K().n();
            ccn.this.G().a($$0, (float)ccn.this.aa(), (float)ccn.this.Z());
         } else {
            ccn.this.z(false);
            ccn.this.y(false);
         }
      }

      @Override
      public void e() {
         bqo $$0 = ccn.this.p();
         if ($$0 != null) {
            ccn.this.G().a($$0, (float)ccn.this.aa(), (float)ccn.this.Z());
            if (ccn.this.g($$0) <= 36.0) {
               ccn.this.z(true);
               ccn.this.y(true);
               ccn.this.K().n();
            } else {
               ccn.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements aye {
      a(0, "red"),
      b(1, "snow");

      public static final aye.a<ccn.v> c = aye.a(ccn.v::values);
      private static final IntFunction<ccn.v> d = awb.a(ccn.v::a, values(), awb.a.a);
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

      public static ccn.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ccn.v a(int $$0) {
         return d.apply($$0);
      }

      public static ccn.v a(il<czw> $$0) {
         return $$0.a(avb.ar) ? b : a;
      }
   }
}
