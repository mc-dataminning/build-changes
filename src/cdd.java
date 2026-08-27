import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdd extends cct implements bsd<cdd.v> {
   private static final ajk<Integer> cc = ajo.a(cdd.class, ajm.b);
   private static final ajk<Byte> cd = ajo.a(cdd.class, ajm.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajk<Optional<UUID>> ci = ajo.a(cdd.class, ajm.r);
   private static final ajk<Optional<UUID>> cj = ajo.a(cdd.class, ajm.r);
   static final Predicate<cgv> ck = $$0 -> !$$0.y() && $$0.bB();
   private static final Predicate<bql> cl = $$0 -> !($$0 instanceof bre $$1) ? false : $$1.em() != null && $$1.en() < $$1.ai + 600;
   static final Predicate<bql> cm = $$0 -> $$0 instanceof ccy || $$0 instanceof cdn;
   private static final Predicate<bql> cn = $$0 -> !$$0.bW() && bqq.e.test($$0);
   private static final int co = 600;
   private static final bqo cp = bqr.Q.n().a(0.5F).b(0.2975F);
   private byb cq;
   private byb cr;
   private byb cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cdd(bqr<? extends cdd> $$0, czu $$1) {
      super($$0, $$1);
      this.bO = new cdd.k();
      this.bP = new cdd.m();
      this.a(emi.p, 0.0F);
      this.a(emi.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new bzu<>(this, cct.class, 10, false, false, $$0 -> $$0 instanceof ccy || $$0 instanceof cdn);
      this.cr = new bzu<>(this, cdu.class, 10, false, false, cdu.bZ);
      this.cs = new bzu<>(this, ccq.class, 20, false, false, $$0 -> $$0 instanceof ccs);
      this.bS.a(0, new cdd.g());
      this.bS.a(0, new bxq(this, this.dN()));
      this.bS.a(1, new cdd.b());
      this.bS.a(2, new cdd.n(2.2));
      this.bS.a(3, new cdd.e(1.0));
      this.bS.a(4, new bxi<>(this, ckl.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cx()) && !this.gB()));
      this.bS.a(4, new bxi<>(this, cdw.class, 8.0F, 1.6, 1.4, $$0 -> !((cdw)$$0).r() && !this.gB()));
      this.bS.a(4, new bxi<>(this, cdl.class, 8.0F, 1.6, 1.4, $$0 -> !this.gB()));
      this.bS.a(5, new cdd.u());
      this.bS.a(6, new cdd.o());
      this.bS.a(6, new cdd.s(1.25));
      this.bS.a(7, new cdd.l(1.2F, true));
      this.bS.a(7, new cdd.t());
      this.bS.a(8, new cdd.h(this, 1.25));
      this.bS.a(9, new cdd.q(32, 200));
      this.bS.a(10, new cdd.f(1.2F, 12, 1));
      this.bS.a(10, new byh(this, 0.4F));
      this.bS.a(11, new bzo(this, 1.0));
      this.bS.a(11, new cdd.p());
      this.bS.a(12, new cdd.j(this, ckl.class, 24.0F));
      this.bS.a(13, new cdd.r());
      this.bT.a(3, new cdd.a(bre.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cx())));
   }

   @Override
   public auy d(csd $$0) {
      return auz.je;
   }

   @Override
   public void n_() {
      if (!this.dN().B && this.bB() && this.cZ()) {
         this.cx++;
         csd $$0 = this.d(bqs.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               csd $$1 = $$0.a(this.dN(), this);
               if (!$$1.d()) {
                  this.a(bqs.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dN().a(this, (byte)45);
            }
         }

         bre $$2 = this.p();
         if ($$2 == null || !$$2.bB()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fJ() || this.fe()) {
         this.bo = false;
         this.bp = 0.0F;
         this.br = 0.0F;
      }

      super.n_();
      if (this.gB() && this.ah.i() < 0.05F) {
         this.a(auz.ja, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fe() {
      return this.ez();
   }

   private boolean n(csd $$0) {
      return $$0.f().y() && this.p() == null && this.aC() && !this.fJ();
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         csd $$3;
         if ($$2 < 0.05F) {
            $$3 = new csd(csg.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new csd(csg.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new csd(csg.uD) : new csd(csg.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new csd(csg.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new csd(csg.qD);
         } else {
            $$3 = new csd(csg.pt);
         }

         this.a(bqs.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         csd $$1 = this.d(bqs.a);
         if (!$$1.d()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               etf $$3 = new etf(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dF() * (float) (Math.PI / 180.0))
                  .b(-this.dD() * (float) (Math.PI / 180.0));
               this.dN().a(new ks(kw.Q, $$1), this.ds() + this.bJ().c / 2.0, this.du(), this.dy() + this.bJ().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bsk.a r() {
      return brg.A().a(bsl.r, 0.3F).a(bsl.q, 10.0).a(bsl.k, 32.0).a(bsl.c, 2.0);
   }

   @Nullable
   public cdd b(aqe $$0, bqf $$1) {
      cdd $$2 = bqr.Q.a((czu)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cdd)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bqr<cdd> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bY) && a($$1, $$3);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      iv<dat> $$4 = $$0.t(this.dn());
      cdd.v $$5 = cdd.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cdd.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cdd.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqe) {
         this.gz();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gz() {
      if (this.u() == cdd.v.a) {
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
   protected void a(ckl $$0, bop $$1, csd $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cdd.v u() {
      return cdd.v.a(this.ao.a(cc));
   }

   public void a(cdd.v $$0) {
      this.ao.a(cc, $$0.a());
   }

   List<UUID> gA() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.ao.a(ci).orElse(null));
      $$0.add(this.ao.a(cj).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.ao.a(ci).isPresent()) {
         this.ao.a(cj, Optional.ofNullable($$0));
      } else {
         this.ao.a(ci, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gA();
      ue $$2 = new ue();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(un.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fJ());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bY());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);

      for (uv $$2 : $$0.c("Trusted", 11)) {
         this.b(un.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cdd.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dN() instanceof aqe) {
         this.gz();
      }
   }

   public boolean y() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gp() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gB() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fJ() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cd, (byte)(this.ao.a(cd) | $$0));
      } else {
         this.ao.a(cd, (byte)(this.ao.a(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(cd) & $$0) != 0;
   }

   @Override
   public boolean f(csd $$0) {
      bqs $$1 = brg.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqs.a && super.f($$0);
   }

   @Override
   public boolean j(csd $$0) {
      cry $$1 = $$0.f();
      csd $$2 = this.d(bqs.a);
      return $$2.d() || this.cx > 0 && $$1.y() && !$$2.f().y();
   }

   private void p(csd $$0) {
      if (!$$0.d() && !this.dN().B) {
         cgv $$1 = new cgv(this.dN(), this.ds() + this.bJ().c, this.du() + 1.0, this.dy() + this.bJ().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(auz.jj, 1.0F, 1.0F);
         this.dN().b($$1);
      }
   }

   private void q(csd $$0) {
      cgv $$1 = new cgv(this.dN(), this.ds(), this.du(), this.dy(), $$0);
      this.dN().b($$1);
   }

   @Override
   protected void b(cgv $$0) {
      csd $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.G();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bqs.a));
         this.a($$0);
         this.a(bqs.a, $$1.a(1));
         this.f(bqs.a);
         this.a($$0, $$1.G());
         $$0.am();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cZ()) {
         boolean $$0 = this.bc();
         if ($$0 || this.p() != null || this.dN().ab()) {
            this.gC();
         }

         if ($$0 || this.fJ()) {
            this.w(false);
         }

         if (this.gp() && this.dN().z.i() < 0.2F) {
            im $$1 = this.dn();
            dpy $$2 = this.dN().a_($$1);
            this.dN().c(2001, $$1, dcv.i($$2));
         }
      }

      this.cu = this.ct;
      if (this.gy()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.bY()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean o(csd $$0) {
      return $$0.a(avw.X);
   }

   @Override
   protected void a(ckl $$0, brg $$1) {
      ((cdd)$$1).b($$0.cx());
   }

   public boolean gv() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.bo;
   }

   public boolean gx() {
      return this.cv == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bY() {
      return this.u(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gy() {
      return this.u(8);
   }

   public float G(float $$0) {
      return axw.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axw.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bre $$0) {
      if (this.gB() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axw.f(($$0 - 5.0F) * $$1);
   }

   void gC() {
      this.C(false);
   }

   void gD() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gE() {
      return !this.fJ() && !this.y() && !this.gp();
   }

   @Override
   public void P() {
      auy $$0 = this.v();
      if ($$0 == auz.jg) {
         this.a($$0, 2.0F, this.fd());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected auy v() {
      if (this.fJ()) {
         return auz.jh;
      } else {
         if (!this.dN().Q() && this.ah.i() < 0.1F) {
            List<ckl> $$0 = this.dN().a(ckl.class, this.cI().c(16.0, 16.0, 16.0), bqq.f);
            if ($$0.isEmpty()) {
               return auz.jg;
            }
         }

         return auz.jb;
      }
   }

   @Nullable
   @Override
   protected auy d(bpj $$0) {
      return auz.jf;
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.jd;
   }

   boolean c(UUID $$0) {
      return this.gA().contains($$0);
   }

   @Override
   protected void g(bpj $$0) {
      csd $$1 = this.d(bqs.a);
      if (!$$1.d()) {
         this.b($$1);
         this.a(bqs.a, csd.i);
      }

      super.g($$0);
   }

   public static boolean a(cdd $$0, bre $$1) {
      double $$2 = $$1.dy() - $$0.dy();
      double $$3 = $$1.ds() - $$0.ds();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dN().a_(im.a($$0.ds() + $$8, $$0.du() + (double)$$9, $$0.dy() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.55F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   class a extends bzu<bre> {
      @Nullable
      private bre j;
      @Nullable
      private bre k;
      private int l;

      public a(Class<bre> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bre> $$3) {
         super(cdd.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ej().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cdd.this.gA()) {
               if ($$0 != null && cdd.this.dN() instanceof aqe && ((aqe)cdd.this.dN()).a($$0) instanceof bre $$2) {
                  this.k = $$2;
                  this.j = $$2.ek();
                  int $$3 = $$2.el();
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
            this.l = this.k.el();
         }

         cdd.this.a(auz.ja, 1.0F, 1.0F);
         cdd.this.B(true);
         cdd.this.gC();
         super.c();
      }
   }

   class b extends byb {
      int a;

      public b() {
         this.a(EnumSet.of(byb.a.b, byb.a.c, byb.a.a));
      }

      @Override
      public boolean a() {
         return cdd.this.gp();
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
         cdd.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bre> {
      public boolean a(bre $$0) {
         if ($$0 instanceof cdd) {
            return false;
         } else if ($$0 instanceof ccy || $$0 instanceof cdn || $$0 instanceof chr) {
            return true;
         } else if ($$0 instanceof bsa) {
            return !((bsa)$$0).r();
         } else if (!($$0 instanceof ckl) || !$$0.N_() && !((ckl)$$0).f()) {
            return cdd.this.c($$0.cx()) ? false : !$$0.fJ() && !$$0.bW();
         } else {
            return false;
         }
      }
   }

   abstract class d extends byb {
      private final cbu b = cbu.a().a(12.0).d().a(cdd.this.new c());

      protected boolean h() {
         im $$0 = im.a(cdd.this.ds(), cdd.this.cI().e, cdd.this.dy());
         return !cdd.this.dN().h($$0) && cdd.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cdd.this.dN().a(bre.class, this.b, cdd.this, cdd.this.cI().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bxn {
      public e(double $$0) {
         super(cdd.this, $$0);
      }

      @Override
      public void c() {
         ((cdd)this.a).gD();
         ((cdd)this.c).gD();
         super.c();
      }

      @Override
      protected void g() {
         aqe $$0 = (aqe)this.b;
         cdd $$1 = (cdd)this.a.a($$0, (bqf)this.c);
         if ($$1 != null) {
            aqf $$2 = this.a.gs();
            aqf $$3 = this.c.gs();
            aqf $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cx());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cx());
            }

            if ($$4 != null) {
               $$4.a(avj.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gu();
            this.c.gu();
            $$1.c_(-24000);
            $$1.b(this.a.ds(), this.a.du(), this.a.dy(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.aa().b(czq.f)) {
               this.b.b(new bqu(this.b, this.a.ds(), this.a.du(), this.a.dy(), this.a.ej().a(7) + 1));
            }
         }
      }
   }

   public class f extends byo {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(cdd.this, $$1, $$2, $$3);
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
      protected boolean a(czx $$0, im $$1) {
         dpy $$2 = $$0.a_($$1);
         return $$2.a(dcx.oi) && $$2.c(dky.c) >= 2 || ddr.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cdd.this.ah.i() < 0.05F) {
            cdd.this.a(auz.ji, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cdd.this.dN().aa().b(czq.c)) {
            dpy $$0 = cdd.this.dN().a_(this.e);
            if ($$0.a(dcx.oi)) {
               this.b($$0);
            } else if (ddr.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dpy $$0) {
         ddr.a(cdd.this, $$0, cdd.this.dN(), this.e);
      }

      private void b(dpy $$0) {
         int $$1 = $$0.c(dky.c);
         $$0.a(dky.c, Integer.valueOf(1));
         int $$2 = 1 + cdd.this.dN().z.a(2) + ($$1 == 3 ? 1 : 0);
         csd $$3 = cdd.this.d(bqs.a);
         if ($$3.d()) {
            cdd.this.a(bqs.a, new csd(csg.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dcv.a(cdd.this.dN(), this.e, new csd(csg.wr, $$2));
         }

         cdd.this.a(auz.zd, 1.0F, 1.0F);
         cdd.this.dN().a(this.e, $$0.a(dky.c, Integer.valueOf(1)), 2);
         cdd.this.dN().a(dur.c, this.e, dur.a.a(cdd.this));
      }

      @Override
      public boolean a() {
         return !cdd.this.fJ() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cdd.this.w(false);
         super.c();
      }
   }

   class g extends bxv {
      public g() {
         super(cdd.this);
      }

      @Override
      public void c() {
         super.c();
         cdd.this.gD();
      }

      @Override
      public boolean a() {
         return cdd.this.bc() && cdd.this.b(avt.a) > 0.25 || cdd.this.bq();
      }
   }

   class h extends bya {
      private final cdd e;

      public h(cdd $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gB() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gB() && super.b();
      }

      @Override
      public void c() {
         this.e.gD();
         super.c();
      }
   }

   public static class i extends bqf.a {
      public final cdd.v a;

      public i(cdd.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends byj {
      public j(brg $$0, Class<? extends bre> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cdd.this.gp() && !cdd.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && !cdd.this.gp() && !cdd.this.gy();
      }
   }

   public class k extends bxd {
      public k() {
         super(cdd.this);
      }

      @Override
      public void a() {
         if (!cdd.this.fJ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cdd.this.gv() && !cdd.this.bY() && !cdd.this.gy() && !cdd.this.gp();
      }
   }

   class l extends byl {
      public l(double $$0, boolean $$1) {
         super(cdd.this, $$0, $$1);
      }

      @Override
      protected void a(bre $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cdd.this.a(auz.jc, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cdd.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cdd.this.y() && !cdd.this.fJ() && !cdd.this.bY() && !cdd.this.gp() && super.a();
      }
   }

   class m extends bxe {
      public m() {
         super(cdd.this);
      }

      @Override
      public void a() {
         if (cdd.this.gE()) {
            super.a();
         }
      }
   }

   class n extends byu {
      public n(double $$0) {
         super(cdd.this, $$0);
      }

      @Override
      public boolean h() {
         return !cdd.this.gB() && super.h();
      }
   }

   public class o extends byf {
      @Override
      public boolean a() {
         if (!cdd.this.gx()) {
            return false;
         } else {
            bre $$0 = cdd.this.p();
            if ($$0 != null && $$0.bB()) {
               if ($$0.cG() != $$0.cF()) {
                  return false;
               } else {
                  boolean $$1 = cdd.a(cdd.this, $$0);
                  if (!$$1) {
                     cdd.this.K().a($$0, 0);
                     cdd.this.y(false);
                     cdd.this.z(false);
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
         bre $$0 = cdd.this.p();
         if ($$0 != null && $$0.bB()) {
            double $$1 = cdd.this.dq().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cdd.this.dF()) < 15.0F) || !cdd.this.aC()) && !cdd.this.gp();
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
         cdd.this.s(true);
         cdd.this.x(true);
         cdd.this.z(false);
         bre $$0 = cdd.this.p();
         if ($$0 != null) {
            cdd.this.G().a($$0, 60.0F, 30.0F);
            etf $$1 = new etf($$0.ds() - cdd.this.ds(), $$0.du() - cdd.this.du(), $$0.dy() - cdd.this.dy()).d();
            cdd.this.g(cdd.this.dq().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cdd.this.K().n();
      }

      @Override
      public void d() {
         cdd.this.y(false);
         cdd.this.cv = 0.0F;
         cdd.this.cw = 0.0F;
         cdd.this.z(false);
         cdd.this.x(false);
      }

      @Override
      public void e() {
         bre $$0 = cdd.this.p();
         if ($$0 != null) {
            cdd.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cdd.this.gp()) {
            etf $$1 = cdd.this.dq();
            if ($$1.d * $$1.d < 0.03F && cdd.this.dF() != 0.0F) {
               cdd.this.s(axw.j(0.2F, cdd.this.dF(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cdd.this.s((float)$$3);
            }
         }

         if ($$0 != null && cdd.this.f($$0) <= 2.0F) {
            cdd.this.C($$0);
         } else if (cdd.this.dF() > 0.0F && cdd.this.aC() && (float)cdd.this.dq().d != 0.0F && cdd.this.dN().a_(cdd.this.dn()).a(dcx.dN)) {
            cdd.this.s(60.0F);
            cdd.this.h(null);
            cdd.this.A(true);
         }
      }
   }

   class p extends byb {
      public p() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         if (!cdd.this.d(bqs.a).d()) {
            return false;
         } else if (cdd.this.p() != null || cdd.this.ek() != null) {
            return false;
         } else if (!cdd.this.gE()) {
            return false;
         } else if (cdd.this.ej().a(b(10)) != 0) {
            return false;
         } else {
            List<cgv> $$0 = cdd.this.dN().a(cgv.class, cdd.this.cI().c(8.0, 8.0, 8.0), cdd.ck);
            return !$$0.isEmpty() && cdd.this.d(bqs.a).d();
         }
      }

      @Override
      public void e() {
         List<cgv> $$0 = cdd.this.dN().a(cgv.class, cdd.this.cI().c(8.0, 8.0, 8.0), cdd.ck);
         csd $$1 = cdd.this.d(bqs.a);
         if ($$1.d() && !$$0.isEmpty()) {
            cdd.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cgv> $$0 = cdd.this.dN().a(cgv.class, cdd.this.cI().c(8.0, 8.0, 8.0), cdd.ck);
         if (!$$0.isEmpty()) {
            cdd.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bzh {
      public q(int $$0, int $$1) {
         super(cdd.this, $$1);
      }

      @Override
      public void c() {
         cdd.this.gD();
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
         return !cdd.this.fJ() && !cdd.this.y() && !cdd.this.gB() && cdd.this.p() == null;
      }
   }

   class r extends cdd.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean a() {
         return cdd.this.ek() == null
            && cdd.this.ej().i() < 0.02F
            && !cdd.this.fJ()
            && cdd.this.p() == null
            && cdd.this.K().l()
            && !this.i()
            && !cdd.this.gv()
            && !cdd.this.bY();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cdd.this.ej().a(3);
         cdd.this.w(true);
         cdd.this.K().n();
      }

      @Override
      public void d() {
         cdd.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cdd.this.G().a(cdd.this.ds() + this.c, cdd.this.dw(), cdd.this.dy() + this.d, (float)cdd.this.aa(), (float)cdd.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cdd.this.ej().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cdd.this.ej().a(20));
      }
   }

   class s extends bxu {
      private int c = b(100);

      public s(double $$0) {
         super(cdd.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cdd.this.fJ() && this.a.p() == null) {
            if (cdd.this.dN().ab() && cdd.this.dN().h(this.a.dn())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               im $$0 = this.a.dn();
               return cdd.this.dN().Q() && cdd.this.dN().h($$0) && !((aqe)cdd.this.dN()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cdd.this.gD();
         super.c();
      }
   }

   class t extends cdd.d {
      private static final int c = b(140);
      private int d = cdd.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(byb.a.a, byb.a.b, byb.a.c));
      }

      @Override
      public boolean a() {
         return cdd.this.bp == 0.0F && cdd.this.bq == 0.0F && cdd.this.br == 0.0F ? this.k() || cdd.this.fJ() : false;
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
            return cdd.this.dN().Q() && this.h() && !this.i() && !cdd.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cdd.this.ah.a(c);
         cdd.this.gD();
      }

      @Override
      public void c() {
         cdd.this.w(false);
         cdd.this.y(false);
         cdd.this.z(false);
         cdd.this.s(false);
         cdd.this.C(true);
         cdd.this.K().n();
         cdd.this.H().a(cdd.this.ds(), cdd.this.du(), cdd.this.dy(), 0.0);
      }
   }

   class u extends byb {
      public u() {
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean a() {
         if (cdd.this.fJ()) {
            return false;
         } else {
            bre $$0 = cdd.this.p();
            return $$0 != null && $$0.bB() && cdd.cm.test($$0) && cdd.this.g($$0) > 36.0 && !cdd.this.bY() && !cdd.this.gy() && !cdd.this.bo;
         }
      }

      @Override
      public void c() {
         cdd.this.w(false);
         cdd.this.A(false);
      }

      @Override
      public void d() {
         bre $$0 = cdd.this.p();
         if ($$0 != null && cdd.a(cdd.this, $$0)) {
            cdd.this.z(true);
            cdd.this.y(true);
            cdd.this.K().n();
            cdd.this.G().a($$0, (float)cdd.this.aa(), (float)cdd.this.Z());
         } else {
            cdd.this.z(false);
            cdd.this.y(false);
         }
      }

      @Override
      public void e() {
         bre $$0 = cdd.this.p();
         if ($$0 != null) {
            cdd.this.G().a($$0, (float)cdd.this.aa(), (float)cdd.this.Z());
            if (cdd.this.g($$0) <= 36.0) {
               cdd.this.z(true);
               cdd.this.y(true);
               cdd.this.K().n();
            } else {
               cdd.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ayq {
      a(0, "red"),
      b(1, "snow");

      public static final ayq.a<cdd.v> c = ayq.a(cdd.v::values);
      private static final IntFunction<cdd.v> d = awn.a(cdd.v::a, values(), awn.a.a);
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

      public static cdd.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cdd.v a(int $$0) {
         return d.apply($$0);
      }

      public static cdd.v a(iv<dat> $$0) {
         return $$0.a(avn.ar) ? b : a;
      }
   }
}
