import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdz extends cdp implements bsz<cdz.v> {
   private static final ajm<Integer> cc = ajq.a(cdz.class, ajo.b);
   private static final ajm<Byte> cd = ajq.a(cdz.class, ajo.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajm<Optional<UUID>> ci = ajq.a(cdz.class, ajo.r);
   private static final ajm<Optional<UUID>> cj = ajq.a(cdz.class, ajo.r);
   static final Predicate<chr> ck = $$0 -> !$$0.y() && $$0.bB();
   private static final Predicate<brh> cl = $$0 -> !($$0 instanceof bsa $$1) ? false : $$1.em() != null && $$1.en() < $$1.ai + 600;
   static final Predicate<brh> cm = $$0 -> $$0 instanceof cdu || $$0 instanceof cej;
   private static final Predicate<brh> cn = $$0 -> !$$0.bW() && brm.e.test($$0);
   private static final int co = 600;
   private static final brk cp = brn.Q.n().a(0.5F).b(0.2975F);
   private byx cq;
   private byx cr;
   private byx cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cdz(brn<? extends cdz> $$0, dad $$1) {
      super($$0, $$1);
      this.bO = new cdz.k();
      this.bP = new cdz.m();
      this.a(emr.p, 0.0F);
      this.a(emr.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new caq<>(this, cdp.class, 10, false, false, $$0 -> $$0 instanceof cdu || $$0 instanceof cej);
      this.cr = new caq<>(this, ceq.class, 10, false, false, ceq.bY);
      this.cs = new caq<>(this, cdm.class, 20, false, false, $$0 -> $$0 instanceof cdo);
      this.bS.a(0, new cdz.g());
      this.bS.a(0, new bym(this, this.dN()));
      this.bS.a(1, new cdz.b());
      this.bS.a(2, new cdz.n(2.2));
      this.bS.a(3, new cdz.e(1.0));
      this.bS.a(4, new bye<>(this, clh.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cx()) && !this.gB()));
      this.bS.a(4, new bye<>(this, ces.class, 8.0F, 1.6, 1.4, $$0 -> !((ces)$$0).r() && !this.gB()));
      this.bS.a(4, new bye<>(this, ceh.class, 8.0F, 1.6, 1.4, $$0 -> !this.gB()));
      this.bS.a(5, new cdz.u());
      this.bS.a(6, new cdz.o());
      this.bS.a(6, new cdz.s(1.25));
      this.bS.a(7, new cdz.l(1.2F, true));
      this.bS.a(7, new cdz.t());
      this.bS.a(8, new cdz.h(this, 1.25));
      this.bS.a(9, new cdz.q(32, 200));
      this.bS.a(10, new cdz.f(1.2F, 12, 1));
      this.bS.a(10, new bzd(this, 0.4F));
      this.bS.a(11, new cak(this, 1.0));
      this.bS.a(11, new cdz.p());
      this.bS.a(12, new cdz.j(this, clh.class, 24.0F));
      this.bS.a(13, new cdz.r());
      this.bT.a(3, new cdz.a(bsa.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cx())));
   }

   @Override
   public avb d(csz $$0) {
      return avc.je;
   }

   @Override
   public void n_() {
      if (!this.dN().B && this.bB() && this.cZ()) {
         this.cx++;
         csz $$0 = this.d(bro.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               csz $$1 = $$0.a(this.dN(), this);
               if (!$$1.d()) {
                  this.a(bro.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dN().a(this, (byte)45);
            }
         }

         bsa $$2 = this.p();
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
         this.a(avc.ja, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fe() {
      return this.ez();
   }

   private boolean n(csz $$0) {
      return $$0.b(ka.t) && this.p() == null && this.aC() && !this.fJ();
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         csz $$3;
         if ($$2 < 0.05F) {
            $$3 = new csz(ctc.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new csz(ctc.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new csz(ctc.uD) : new csz(ctc.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new csz(ctc.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new csz(ctc.qD);
         } else {
            $$3 = new csz(ctc.pt);
         }

         this.a(bro.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         csz $$1 = this.d(bro.a);
         if (!$$1.d()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               etp $$3 = new etp(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dF() * (float) (Math.PI / 180.0))
                  .b(-this.dD() * (float) (Math.PI / 180.0));
               this.dN().a(new kt(kx.Q, $$1), this.ds() + this.bJ().c / 2.0, this.du(), this.dy() + this.bJ().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static btg.a r() {
      return bsc.A().a(bth.r, 0.3F).a(bth.q, 10.0).a(bth.k, 32.0).a(bth.c, 2.0);
   }

   @Nullable
   public cdz b(aqh $$0, brb $$1) {
      cdz $$2 = brn.Q.a((dad)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cdz)$$1).u());
      }

      return $$2;
   }

   public static boolean c(brn<cdz> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      iw<dbc> $$4 = $$0.t(this.dn());
      cdz.v $$5 = cdz.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cdz.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cdz.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqh) {
         this.gz();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gz() {
      if (this.u() == cdz.v.a) {
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
   protected void a(clh $$0, bpl $$1, csz $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cdz.v u() {
      return cdz.v.a(this.ao.a(cc));
   }

   public void a(cdz.v $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gA();
      ug $$2 = new ug();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(up.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fJ());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bY());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);

      for (ux $$2 : $$0.c("Trusted", 11)) {
         this.b(up.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cdz.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dN() instanceof aqh) {
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
   public boolean f(csz $$0) {
      bro $$1 = bsc.h($$0);
      return !this.d($$1).d() ? false : $$1 == bro.a && super.f($$0);
   }

   @Override
   public boolean j(csz $$0) {
      csz $$1 = this.d(bro.a);
      return $$1.d() || this.cx > 0 && $$0.b(ka.t) && !$$1.b(ka.t);
   }

   private void p(csz $$0) {
      if (!$$0.d() && !this.dN().B) {
         chr $$1 = new chr(this.dN(), this.ds() + this.bJ().c, this.du() + 1.0, this.dy() + this.bJ().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avc.jj, 1.0F, 1.0F);
         this.dN().b($$1);
      }
   }

   private void q(csz $$0) {
      chr $$1 = new chr(this.dN(), this.ds(), this.du(), this.dy(), $$0);
      this.dN().b($$1);
   }

   @Override
   protected void b(chr $$0) {
      csz $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.G();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bro.a));
         this.a($$0);
         this.a(bro.a, $$1.a(1));
         this.f(bro.a);
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
            in $$1 = this.dn();
            dqh $$2 = this.dN().a_($$1);
            this.dN().c(2001, $$1, dde.i($$2));
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
   public boolean o(csz $$0) {
      return $$0.a(avz.Z);
   }

   @Override
   protected void a(clh $$0, bsc $$1) {
      ((cdz)$$1).b($$0.cx());
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
      return axz.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axz.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bsa $$0) {
      if (this.gB() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axz.f(($$0 - 5.0F) * $$1);
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
      avb $$0 = this.v();
      if ($$0 == avc.jg) {
         this.a($$0, 2.0F, this.fd());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected avb v() {
      if (this.fJ()) {
         return avc.jh;
      } else {
         if (!this.dN().Q() && this.ah.i() < 0.1F) {
            List<clh> $$0 = this.dN().a(clh.class, this.cI().c(16.0, 16.0, 16.0), brm.f);
            if ($$0.isEmpty()) {
               return avc.jg;
            }
         }

         return avc.jb;
      }
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return avc.jf;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.jd;
   }

   boolean c(UUID $$0) {
      return this.gA().contains($$0);
   }

   @Override
   protected void g(bqf $$0) {
      csz $$1 = this.d(bro.a);
      if (!$$1.d()) {
         this.b($$1);
         this.a(bro.a, csz.i);
      }

      super.g($$0);
   }

   public static boolean a(cdz $$0, bsa $$1) {
      double $$2 = $$1.dy() - $$0.dy();
      double $$3 = $$1.ds() - $$0.ds();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dN().a_(in.a($$0.ds() + $$8, $$0.du() + (double)$$9, $$0.dy() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.55F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   class a extends caq<bsa> {
      @Nullable
      private bsa j;
      @Nullable
      private bsa k;
      private int l;

      public a(Class<bsa> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bsa> $$3) {
         super(cdz.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ej().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cdz.this.gA()) {
               if ($$0 != null && cdz.this.dN() instanceof aqh && ((aqh)cdz.this.dN()).a($$0) instanceof bsa $$2) {
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

         cdz.this.a(avc.ja, 1.0F, 1.0F);
         cdz.this.B(true);
         cdz.this.gC();
         super.c();
      }
   }

   class b extends byx {
      int a;

      public b() {
         this.a(EnumSet.of(byx.a.b, byx.a.c, byx.a.a));
      }

      @Override
      public boolean a() {
         return cdz.this.gp();
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
         cdz.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bsa> {
      public boolean a(bsa $$0) {
         if ($$0 instanceof cdz) {
            return false;
         } else if ($$0 instanceof cdu || $$0 instanceof cej || $$0 instanceof cin) {
            return true;
         } else if ($$0 instanceof bsw) {
            return !((bsw)$$0).r();
         } else if (!($$0 instanceof clh) || !$$0.N_() && !((clh)$$0).f()) {
            return cdz.this.c($$0.cx()) ? false : !$$0.fJ() && !$$0.bW();
         } else {
            return false;
         }
      }
   }

   abstract class d extends byx {
      private final ccq b = ccq.a().a(12.0).d().a(cdz.this.new c());

      protected boolean h() {
         in $$0 = in.a(cdz.this.ds(), cdz.this.cI().e, cdz.this.dy());
         return !cdz.this.dN().h($$0) && cdz.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cdz.this.dN().a(bsa.class, this.b, cdz.this, cdz.this.cI().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends byj {
      public e(double $$0) {
         super(cdz.this, $$0);
      }

      @Override
      public void c() {
         ((cdz)this.a).gD();
         ((cdz)this.c).gD();
         super.c();
      }

      @Override
      protected void g() {
         aqh $$0 = (aqh)this.b;
         cdz $$1 = (cdz)this.a.a($$0, (brb)this.c);
         if ($$1 != null) {
            aqi $$2 = this.a.gs();
            aqi $$3 = this.c.gs();
            aqi $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cx());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cx());
            }

            if ($$4 != null) {
               $$4.a(avm.P);
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
            if (this.b.aa().b(czz.f)) {
               this.b.b(new brq(this.b, this.a.ds(), this.a.du(), this.a.dy(), this.a.ej().a(7) + 1));
            }
         }
      }
   }

   public class f extends bzk {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(cdz.this, $$1, $$2, $$3);
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
      protected boolean a(dag $$0, in $$1) {
         dqh $$2 = $$0.a_($$1);
         return $$2.a(ddg.oi) && $$2.c(dlh.c) >= 2 || dea.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cdz.this.ah.i() < 0.05F) {
            cdz.this.a(avc.ji, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cdz.this.dN().aa().b(czz.c)) {
            dqh $$0 = cdz.this.dN().a_(this.e);
            if ($$0.a(ddg.oi)) {
               this.b($$0);
            } else if (dea.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dqh $$0) {
         dea.a(cdz.this, $$0, cdz.this.dN(), this.e);
      }

      private void b(dqh $$0) {
         int $$1 = $$0.c(dlh.c);
         $$0.a(dlh.c, Integer.valueOf(1));
         int $$2 = 1 + cdz.this.dN().z.a(2) + ($$1 == 3 ? 1 : 0);
         csz $$3 = cdz.this.d(bro.a);
         if ($$3.d()) {
            cdz.this.a(bro.a, new csz(ctc.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dde.a(cdz.this.dN(), this.e, new csz(ctc.wr, $$2));
         }

         cdz.this.a(avc.ze, 1.0F, 1.0F);
         cdz.this.dN().a(this.e, $$0.a(dlh.c, Integer.valueOf(1)), 2);
         cdz.this.dN().a(dva.c, this.e, dva.a.a(cdz.this));
      }

      @Override
      public boolean a() {
         return !cdz.this.fJ() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cdz.this.w(false);
         super.c();
      }
   }

   class g extends byr {
      public g() {
         super(cdz.this);
      }

      @Override
      public void c() {
         super.c();
         cdz.this.gD();
      }

      @Override
      public boolean a() {
         return cdz.this.bc() && cdz.this.b(avw.a) > 0.25 || cdz.this.bq();
      }
   }

   class h extends byw {
      private final cdz e;

      public h(cdz $$0, double $$1) {
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

   public static class i extends brb.a {
      public final cdz.v a;

      public i(cdz.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bzf {
      public j(bsc $$0, Class<? extends bsa> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cdz.this.gp() && !cdz.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && !cdz.this.gp() && !cdz.this.gy();
      }
   }

   public class k extends bxz {
      public k() {
         super(cdz.this);
      }

      @Override
      public void a() {
         if (!cdz.this.fJ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cdz.this.gv() && !cdz.this.bY() && !cdz.this.gy() && !cdz.this.gp();
      }
   }

   class l extends bzh {
      public l(double $$0, boolean $$1) {
         super(cdz.this, $$0, $$1);
      }

      @Override
      protected void a(bsa $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cdz.this.a(avc.jc, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cdz.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cdz.this.y() && !cdz.this.fJ() && !cdz.this.bY() && !cdz.this.gp() && super.a();
      }
   }

   class m extends bya {
      public m() {
         super(cdz.this);
      }

      @Override
      public void a() {
         if (cdz.this.gE()) {
            super.a();
         }
      }
   }

   class n extends bzq {
      public n(double $$0) {
         super(cdz.this, $$0);
      }

      @Override
      public boolean h() {
         return !cdz.this.gB() && super.h();
      }
   }

   public class o extends bzb {
      @Override
      public boolean a() {
         if (!cdz.this.gx()) {
            return false;
         } else {
            bsa $$0 = cdz.this.p();
            if ($$0 != null && $$0.bB()) {
               if ($$0.cG() != $$0.cF()) {
                  return false;
               } else {
                  boolean $$1 = cdz.a(cdz.this, $$0);
                  if (!$$1) {
                     cdz.this.K().a($$0, 0);
                     cdz.this.y(false);
                     cdz.this.z(false);
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
         bsa $$0 = cdz.this.p();
         if ($$0 != null && $$0.bB()) {
            double $$1 = cdz.this.dq().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cdz.this.dF()) < 15.0F) || !cdz.this.aC()) && !cdz.this.gp();
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
         cdz.this.s(true);
         cdz.this.x(true);
         cdz.this.z(false);
         bsa $$0 = cdz.this.p();
         if ($$0 != null) {
            cdz.this.G().a($$0, 60.0F, 30.0F);
            etp $$1 = new etp($$0.ds() - cdz.this.ds(), $$0.du() - cdz.this.du(), $$0.dy() - cdz.this.dy()).d();
            cdz.this.g(cdz.this.dq().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cdz.this.K().n();
      }

      @Override
      public void d() {
         cdz.this.y(false);
         cdz.this.cv = 0.0F;
         cdz.this.cw = 0.0F;
         cdz.this.z(false);
         cdz.this.x(false);
      }

      @Override
      public void e() {
         bsa $$0 = cdz.this.p();
         if ($$0 != null) {
            cdz.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cdz.this.gp()) {
            etp $$1 = cdz.this.dq();
            if ($$1.d * $$1.d < 0.03F && cdz.this.dF() != 0.0F) {
               cdz.this.s(axz.j(0.2F, cdz.this.dF(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cdz.this.s((float)$$3);
            }
         }

         if ($$0 != null && cdz.this.f($$0) <= 2.0F) {
            cdz.this.C($$0);
         } else if (cdz.this.dF() > 0.0F && cdz.this.aC() && (float)cdz.this.dq().d != 0.0F && cdz.this.dN().a_(cdz.this.dn()).a(ddg.dN)) {
            cdz.this.s(60.0F);
            cdz.this.h(null);
            cdz.this.A(true);
         }
      }
   }

   class p extends byx {
      public p() {
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         if (!cdz.this.d(bro.a).d()) {
            return false;
         } else if (cdz.this.p() != null || cdz.this.ek() != null) {
            return false;
         } else if (!cdz.this.gE()) {
            return false;
         } else if (cdz.this.ej().a(b(10)) != 0) {
            return false;
         } else {
            List<chr> $$0 = cdz.this.dN().a(chr.class, cdz.this.cI().c(8.0, 8.0, 8.0), cdz.ck);
            return !$$0.isEmpty() && cdz.this.d(bro.a).d();
         }
      }

      @Override
      public void e() {
         List<chr> $$0 = cdz.this.dN().a(chr.class, cdz.this.cI().c(8.0, 8.0, 8.0), cdz.ck);
         csz $$1 = cdz.this.d(bro.a);
         if ($$1.d() && !$$0.isEmpty()) {
            cdz.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<chr> $$0 = cdz.this.dN().a(chr.class, cdz.this.cI().c(8.0, 8.0, 8.0), cdz.ck);
         if (!$$0.isEmpty()) {
            cdz.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cad {
      public q(int $$0, int $$1) {
         super(cdz.this, $$1);
      }

      @Override
      public void c() {
         cdz.this.gD();
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
         return !cdz.this.fJ() && !cdz.this.y() && !cdz.this.gB() && cdz.this.p() == null;
      }
   }

   class r extends cdz.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         return cdz.this.ek() == null
            && cdz.this.ej().i() < 0.02F
            && !cdz.this.fJ()
            && cdz.this.p() == null
            && cdz.this.K().l()
            && !this.i()
            && !cdz.this.gv()
            && !cdz.this.bY();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cdz.this.ej().a(3);
         cdz.this.w(true);
         cdz.this.K().n();
      }

      @Override
      public void d() {
         cdz.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cdz.this.G().a(cdz.this.ds() + this.c, cdz.this.dw(), cdz.this.dy() + this.d, (float)cdz.this.aa(), (float)cdz.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cdz.this.ej().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cdz.this.ej().a(20));
      }
   }

   class s extends byq {
      private int c = b(100);

      public s(double $$0) {
         super(cdz.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cdz.this.fJ() && this.a.p() == null) {
            if (cdz.this.dN().ab() && cdz.this.dN().h(this.a.dn())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               in $$0 = this.a.dn();
               return cdz.this.dN().Q() && cdz.this.dN().h($$0) && !((aqh)cdz.this.dN()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cdz.this.gD();
         super.c();
      }
   }

   class t extends cdz.d {
      private static final int c = b(140);
      private int d = cdz.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(byx.a.a, byx.a.b, byx.a.c));
      }

      @Override
      public boolean a() {
         return cdz.this.bp == 0.0F && cdz.this.bq == 0.0F && cdz.this.br == 0.0F ? this.k() || cdz.this.fJ() : false;
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
            return cdz.this.dN().Q() && this.h() && !this.i() && !cdz.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cdz.this.ah.a(c);
         cdz.this.gD();
      }

      @Override
      public void c() {
         cdz.this.w(false);
         cdz.this.y(false);
         cdz.this.z(false);
         cdz.this.s(false);
         cdz.this.C(true);
         cdz.this.K().n();
         cdz.this.H().a(cdz.this.ds(), cdz.this.du(), cdz.this.dy(), 0.0);
      }
   }

   class u extends byx {
      public u() {
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         if (cdz.this.fJ()) {
            return false;
         } else {
            bsa $$0 = cdz.this.p();
            return $$0 != null && $$0.bB() && cdz.cm.test($$0) && cdz.this.g($$0) > 36.0 && !cdz.this.bY() && !cdz.this.gy() && !cdz.this.bo;
         }
      }

      @Override
      public void c() {
         cdz.this.w(false);
         cdz.this.A(false);
      }

      @Override
      public void d() {
         bsa $$0 = cdz.this.p();
         if ($$0 != null && cdz.a(cdz.this, $$0)) {
            cdz.this.z(true);
            cdz.this.y(true);
            cdz.this.K().n();
            cdz.this.G().a($$0, (float)cdz.this.aa(), (float)cdz.this.Z());
         } else {
            cdz.this.z(false);
            cdz.this.y(false);
         }
      }

      @Override
      public void e() {
         bsa $$0 = cdz.this.p();
         if ($$0 != null) {
            cdz.this.G().a($$0, (float)cdz.this.aa(), (float)cdz.this.Z());
            if (cdz.this.g($$0) <= 36.0) {
               cdz.this.z(true);
               cdz.this.y(true);
               cdz.this.K().n();
            } else {
               cdz.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ayt {
      a(0, "red"),
      b(1, "snow");

      public static final ayt.a<cdz.v> c = ayt.a(cdz.v::values);
      private static final IntFunction<cdz.v> d = awq.a(cdz.v::a, values(), awq.a.a);
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

      public static cdz.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cdz.v a(int $$0) {
         return d.apply($$0);
      }

      public static cdz.v a(iw<dbc> $$0) {
         return $$0.a(avq.ar) ? b : a;
      }
   }
}
