import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccs extends cci implements brs<ccs.v> {
   private static final aja<Integer> cb = aje.a(ccs.class, ajc.b);
   private static final aja<Byte> cc = aje.a(ccs.class, ajc.a);
   private static final int cd = 1;
   public static final int bX = 4;
   public static final int bY = 8;
   public static final int ca = 16;
   private static final int ce = 32;
   private static final int cf = 64;
   private static final int cg = 128;
   private static final aja<Optional<UUID>> ch = aje.a(ccs.class, ajc.q);
   private static final aja<Optional<UUID>> ci = aje.a(ccs.class, ajc.q);
   static final Predicate<cgk> cj = $$0 -> !$$0.y() && $$0.bA();
   private static final Predicate<bqa> ck = $$0 -> !($$0 instanceof bqt $$1) ? false : $$1.el() != null && $$1.em() < $$1.ah + 600;
   static final Predicate<bqa> cl = $$0 -> $$0 instanceof ccn || $$0 instanceof cdc;
   private static final Predicate<bqa> cm = $$0 -> !$$0.bV() && bqf.e.test($$0);
   private static final int cn = 600;
   private static final bqd co = bqg.Q.n().a(0.5F).b(0.2975F);
   private bxq cp;
   private bxq cq;
   private bxq cr;
   private float cs;
   private float ct;
   float cu;
   float cv;
   private int cw;

   public ccs(bqg<? extends ccs> $$0, czg $$1) {
      super($$0, $$1);
      this.bN = new ccs.k();
      this.bO = new ccs.m();
      this.a(els.p, 0.0F);
      this.a(els.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ch, Optional.empty());
      $$0.a(ci, Optional.empty());
      $$0.a(cb, 0);
      $$0.a(cc, (byte)0);
   }

   @Override
   protected void z() {
      this.cp = new bzj<>(this, cci.class, 10, false, false, $$0 -> $$0 instanceof ccn || $$0 instanceof cdc);
      this.cq = new bzj<>(this, cdj.class, 10, false, false, cdj.bY);
      this.cr = new bzj<>(this, ccf.class, 20, false, false, $$0 -> $$0 instanceof cch);
      this.bR.a(0, new ccs.g());
      this.bR.a(0, new bxf(this, this.dM()));
      this.bR.a(1, new ccs.b());
      this.bR.a(2, new ccs.n(2.2));
      this.bR.a(3, new ccs.e(1.0));
      this.bR.a(4, new bwx<>(this, cka.class, 16.0F, 1.6, 1.4, $$0 -> cm.test($$0) && !this.c($$0.cw()) && !this.gz()));
      this.bR.a(4, new bwx<>(this, cdl.class, 8.0F, 1.6, 1.4, $$0 -> !((cdl)$$0).r() && !this.gz()));
      this.bR.a(4, new bwx<>(this, cda.class, 8.0F, 1.6, 1.4, $$0 -> !this.gz()));
      this.bR.a(5, new ccs.u());
      this.bR.a(6, new ccs.o());
      this.bR.a(6, new ccs.s(1.25));
      this.bR.a(7, new ccs.l(1.2F, true));
      this.bR.a(7, new ccs.t());
      this.bR.a(8, new ccs.h(this, 1.25));
      this.bR.a(9, new ccs.q(32, 200));
      this.bR.a(10, new ccs.f(1.2F, 12, 1));
      this.bR.a(10, new bxw(this, 0.4F));
      this.bR.a(11, new bzd(this, 1.0));
      this.bR.a(11, new ccs.p());
      this.bR.a(12, new ccs.j(this, cka.class, 24.0F));
      this.bR.a(13, new ccs.r());
      this.bS.a(3, new ccs.a(bqt.class, false, false, $$0 -> ck.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public aun d(crs $$0) {
      return auo.je;
   }

   @Override
   public void n_() {
      if (!this.dM().B && this.bA() && this.cY()) {
         this.cw++;
         crs $$0 = this.d(bqh.a);
         if (this.n($$0)) {
            if (this.cw > 600) {
               crs $$1 = $$0.a(this.dM(), this);
               if (!$$1.d()) {
                  this.a(bqh.a, $$1);
               }

               this.cw = 0;
            } else if (this.cw > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bqt $$2 = this.p();
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
         this.a(auo.ja, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fd() {
      return this.ey();
   }

   private boolean n(crs $$0) {
      return $$0.f().y() && this.p() == null && this.aC() && !this.fI();
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         crs $$3;
         if ($$2 < 0.05F) {
            $$3 = new crs(crv.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new crs(crv.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new crs(crv.uB) : new crs(crv.uC);
         } else if ($$2 < 0.6F) {
            $$3 = new crs(crv.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new crs(crv.qC);
         } else {
            $$3 = new crs(crv.ps);
         }

         this.a(bqh.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         crs $$1 = this.d(bqh.a);
         if (!$$1.d()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               esj $$3 = new esj(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new kj(kn.R, $$1), this.dr() + this.bI().c / 2.0, this.dt(), this.dx() + this.bI().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static brz.a r() {
      return bqv.A().a(bsa.r, 0.3F).a(bsa.q, 10.0).a(bsa.k, 32.0).a(bsa.c, 2.0);
   }

   @Nullable
   public ccs b(apu $$0, bpu $$1) {
      ccs $$2 = bqg.Q.a((czg)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.u() : ((ccs)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bqg<ccs> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bY) && a($$1, $$3);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      in<daf> $$4 = $$0.t(this.dm());
      ccs.v $$5 = ccs.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ccs.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ccs.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof apu) {
         this.gx();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gx() {
      if (this.u() == ccs.v.a) {
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
   protected void a(cka $$0, boe $$1, crs $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? co : super.e($$0);
   }

   public ccs.v u() {
      return ccs.v.a(this.an.a(cb));
   }

   public void a(ccs.v $$0) {
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
   public void b(to $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gy();
      tu $$2 = new tu();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(ud.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fI());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);

      for (ul $$2 : $$0.c("Trusted", 11)) {
         this.b(ud.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(ccs.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof apu) {
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
   public boolean f(crs $$0) {
      bqh $$1 = bqv.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqh.a && super.f($$0);
   }

   @Override
   public boolean j(crs $$0) {
      crn $$1 = $$0.f();
      crs $$2 = this.d(bqh.a);
      return $$2.d() || this.cw > 0 && $$1.y() && !$$2.f().y();
   }

   private void p(crs $$0) {
      if (!$$0.d() && !this.dM().B) {
         cgk $$1 = new cgk(this.dM(), this.dr() + this.bI().c, this.dt() + 1.0, this.dx() + this.bI().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(auo.jj, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void q(crs $$0) {
      cgk $$1 = new cgk(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cgk $$0) {
      crs $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.G();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bqh.a));
         this.a($$0);
         this.a(bqh.a, $$1.a(1));
         this.f(bqh.a);
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
            id $$1 = this.dm();
            dpi $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, dch.i($$2));
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
   public boolean o(crs $$0) {
      return $$0.a(avm.X);
   }

   @Override
   protected void a(cka $$0, bqv $$1) {
      ((ccs)$$1).b($$0.cw());
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
      return axm.i($$0, this.ct, this.cs) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axm.i($$0, this.cv, this.cu);
   }

   @Override
   public void h(@Nullable bqt $$0) {
      if (this.gz() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return axm.f(($$0 - 5.0F) * $$1);
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
      aun $$0 = this.v();
      if ($$0 == auo.jg) {
         this.a($$0, 2.0F, this.fc());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected aun v() {
      if (this.fI()) {
         return auo.jh;
      } else {
         if (!this.dM().Q() && this.ag.i() < 0.1F) {
            List<cka> $$0 = this.dM().a(cka.class, this.cH().c(16.0, 16.0, 16.0), bqf.f);
            if ($$0.isEmpty()) {
               return auo.jg;
            }
         }

         return auo.jb;
      }
   }

   @Nullable
   @Override
   protected aun d(boy $$0) {
      return auo.jf;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.jd;
   }

   boolean c(UUID $$0) {
      return this.gy().contains($$0);
   }

   @Override
   protected void g(boy $$0) {
      crs $$1 = this.d(bqh.a);
      if (!$$1.d()) {
         this.b($$1);
         this.a(bqh.a, crs.i);
      }

      super.g($$0);
   }

   public static boolean a(ccs $$0, bqt $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(id.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bzj<bqt> {
      @Nullable
      private bqt j;
      @Nullable
      private bqt k;
      private int l;

      public a(Class<bqt> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bqt> $$3) {
         super(ccs.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ei().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : ccs.this.gy()) {
               if ($$0 != null && ccs.this.dM() instanceof apu && ((apu)ccs.this.dM()).a($$0) instanceof bqt $$2) {
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

         ccs.this.a(auo.ja, 1.0F, 1.0F);
         ccs.this.B(true);
         ccs.this.gA();
         super.c();
      }
   }

   class b extends bxq {
      int a;

      public b() {
         this.a(EnumSet.of(bxq.a.b, bxq.a.c, bxq.a.a));
      }

      @Override
      public boolean a() {
         return ccs.this.gn();
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
         ccs.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bqt> {
      public boolean a(bqt $$0) {
         if ($$0 instanceof ccs) {
            return false;
         } else if ($$0 instanceof ccn || $$0 instanceof cdc || $$0 instanceof chg) {
            return true;
         } else if ($$0 instanceof brp) {
            return !((brp)$$0).r();
         } else if (!($$0 instanceof cka) || !$$0.N_() && !((cka)$$0).f()) {
            return ccs.this.c($$0.cw()) ? false : !$$0.fI() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bxq {
      private final cbj b = cbj.a().a(12.0).d().a(ccs.this.new c());

      protected boolean h() {
         id $$0 = id.a(ccs.this.dr(), ccs.this.cH().e, ccs.this.dx());
         return !ccs.this.dM().h($$0) && ccs.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !ccs.this.dM().a(bqt.class, this.b, ccs.this, ccs.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bxc {
      public e(double $$0) {
         super(ccs.this, $$0);
      }

      @Override
      public void c() {
         ((ccs)this.a).gB();
         ((ccs)this.c).gB();
         super.c();
      }

      @Override
      protected void g() {
         apu $$0 = (apu)this.b;
         ccs $$1 = (ccs)this.a.a($$0, (bpu)this.c);
         if ($$1 != null) {
            apv $$2 = this.a.gq();
            apv $$3 = this.c.gq();
            apv $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(auz.P);
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
            if (this.b.aa().b(czc.f)) {
               this.b.b(new bqj(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.ei().a(7) + 1));
            }
         }
      }
   }

   public class f extends byd {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(ccs.this, $$1, $$2, $$3);
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
      protected boolean a(czj $$0, id $$1) {
         dpi $$2 = $$0.a_($$1);
         return $$2.a(dcj.oi) && $$2.c(dkj.c) >= 2 || ddd.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ccs.this.ag.i() < 0.05F) {
            ccs.this.a(auo.ji, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (ccs.this.dM().aa().b(czc.c)) {
            dpi $$0 = ccs.this.dM().a_(this.e);
            if ($$0.a(dcj.oi)) {
               this.b($$0);
            } else if (ddd.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dpi $$0) {
         ddd.a(ccs.this, $$0, ccs.this.dM(), this.e);
      }

      private void b(dpi $$0) {
         int $$1 = $$0.c(dkj.c);
         $$0.a(dkj.c, Integer.valueOf(1));
         int $$2 = 1 + ccs.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         crs $$3 = ccs.this.d(bqh.a);
         if ($$3.d()) {
            ccs.this.a(bqh.a, new crs(crv.wn));
            $$2--;
         }

         if ($$2 > 0) {
            dch.a(ccs.this.dM(), this.e, new crs(crv.wn, $$2));
         }

         ccs.this.a(auo.yW, 1.0F, 1.0F);
         ccs.this.dM().a(this.e, $$0.a(dkj.c, Integer.valueOf(1)), 2);
         ccs.this.dM().a(dub.c, this.e, dub.a.a(ccs.this));
      }

      @Override
      public boolean a() {
         return !ccs.this.fI() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         ccs.this.w(false);
         super.c();
      }
   }

   class g extends bxk {
      public g() {
         super(ccs.this);
      }

      @Override
      public void c() {
         super.c();
         ccs.this.gB();
      }

      @Override
      public boolean a() {
         return ccs.this.bc() && ccs.this.b(avj.a) > 0.25 || ccs.this.bq();
      }
   }

   class h extends bxp {
      private final ccs e;

      public h(ccs $$0, double $$1) {
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

   public static class i extends bpu.a {
      public final ccs.v a;

      public i(ccs.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bxy {
      public j(bqv $$0, Class<? extends bqt> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !ccs.this.gn() && !ccs.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && !ccs.this.gn() && !ccs.this.gw();
      }
   }

   public class k extends bws {
      public k() {
         super(ccs.this);
      }

      @Override
      public void a() {
         if (!ccs.this.fI()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ccs.this.gt() && !ccs.this.bX() && !ccs.this.gw() && !ccs.this.gn();
      }
   }

   class l extends bya {
      public l(double $$0, boolean $$1) {
         super(ccs.this, $$0, $$1);
      }

      @Override
      protected void a(bqt $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ccs.this.a(auo.jc, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         ccs.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !ccs.this.y() && !ccs.this.fI() && !ccs.this.bX() && !ccs.this.gn() && super.a();
      }
   }

   class m extends bwt {
      public m() {
         super(ccs.this);
      }

      @Override
      public void a() {
         if (ccs.this.gC()) {
            super.a();
         }
      }
   }

   class n extends byj {
      public n(double $$0) {
         super(ccs.this, $$0);
      }

      @Override
      public boolean h() {
         return !ccs.this.gz() && super.h();
      }
   }

   public class o extends bxu {
      @Override
      public boolean a() {
         if (!ccs.this.gv()) {
            return false;
         } else {
            bqt $$0 = ccs.this.p();
            if ($$0 != null && $$0.bA()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = ccs.a(ccs.this, $$0);
                  if (!$$1) {
                     ccs.this.K().a($$0, 0);
                     ccs.this.y(false);
                     ccs.this.z(false);
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
         bqt $$0 = ccs.this.p();
         if ($$0 != null && $$0.bA()) {
            double $$1 = ccs.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ccs.this.dE()) < 15.0F) || !ccs.this.aC()) && !ccs.this.gn();
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
         ccs.this.r(true);
         ccs.this.x(true);
         ccs.this.z(false);
         bqt $$0 = ccs.this.p();
         if ($$0 != null) {
            ccs.this.G().a($$0, 60.0F, 30.0F);
            esj $$1 = new esj($$0.dr() - ccs.this.dr(), $$0.dt() - ccs.this.dt(), $$0.dx() - ccs.this.dx()).d();
            ccs.this.g(ccs.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         ccs.this.K().n();
      }

      @Override
      public void d() {
         ccs.this.y(false);
         ccs.this.cu = 0.0F;
         ccs.this.cv = 0.0F;
         ccs.this.z(false);
         ccs.this.x(false);
      }

      @Override
      public void e() {
         bqt $$0 = ccs.this.p();
         if ($$0 != null) {
            ccs.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!ccs.this.gn()) {
            esj $$1 = ccs.this.dp();
            if ($$1.d * $$1.d < 0.03F && ccs.this.dE() != 0.0F) {
               ccs.this.s(axm.j(0.2F, ccs.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               ccs.this.s((float)$$3);
            }
         }

         if ($$0 != null && ccs.this.f($$0) <= 2.0F) {
            ccs.this.C($$0);
         } else if (ccs.this.dE() > 0.0F && ccs.this.aC() && (float)ccs.this.dp().d != 0.0F && ccs.this.dM().a_(ccs.this.dm()).a(dcj.dN)) {
            ccs.this.s(60.0F);
            ccs.this.h(null);
            ccs.this.A(true);
         }
      }
   }

   class p extends bxq {
      public p() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean a() {
         if (!ccs.this.d(bqh.a).d()) {
            return false;
         } else if (ccs.this.p() != null || ccs.this.ej() != null) {
            return false;
         } else if (!ccs.this.gC()) {
            return false;
         } else if (ccs.this.ei().a(b(10)) != 0) {
            return false;
         } else {
            List<cgk> $$0 = ccs.this.dM().a(cgk.class, ccs.this.cH().c(8.0, 8.0, 8.0), ccs.cj);
            return !$$0.isEmpty() && ccs.this.d(bqh.a).d();
         }
      }

      @Override
      public void e() {
         List<cgk> $$0 = ccs.this.dM().a(cgk.class, ccs.this.cH().c(8.0, 8.0, 8.0), ccs.cj);
         crs $$1 = ccs.this.d(bqh.a);
         if ($$1.d() && !$$0.isEmpty()) {
            ccs.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cgk> $$0 = ccs.this.dM().a(cgk.class, ccs.this.cH().c(8.0, 8.0, 8.0), ccs.cj);
         if (!$$0.isEmpty()) {
            ccs.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends byw {
      public q(int $$0, int $$1) {
         super(ccs.this, $$1);
      }

      @Override
      public void c() {
         ccs.this.gB();
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
         return !ccs.this.fI() && !ccs.this.y() && !ccs.this.gz() && ccs.this.p() == null;
      }
   }

   class r extends ccs.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bxq.a.a, bxq.a.b));
      }

      @Override
      public boolean a() {
         return ccs.this.ej() == null
            && ccs.this.ei().i() < 0.02F
            && !ccs.this.fI()
            && ccs.this.p() == null
            && ccs.this.K().l()
            && !this.i()
            && !ccs.this.gt()
            && !ccs.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + ccs.this.ei().a(3);
         ccs.this.w(true);
         ccs.this.K().n();
      }

      @Override
      public void d() {
         ccs.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ccs.this.G().a(ccs.this.dr() + this.c, ccs.this.dv(), ccs.this.dx() + this.d, (float)ccs.this.aa(), (float)ccs.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ccs.this.ei().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ccs.this.ei().a(20));
      }
   }

   class s extends bxj {
      private int c = b(100);

      public s(double $$0) {
         super(ccs.this, $$0);
      }

      @Override
      public boolean a() {
         if (!ccs.this.fI() && this.a.p() == null) {
            if (ccs.this.dM().ab() && ccs.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               id $$0 = this.a.dm();
               return ccs.this.dM().Q() && ccs.this.dM().h($$0) && !((apu)ccs.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         ccs.this.gB();
         super.c();
      }
   }

   class t extends ccs.d {
      private static final int c = b(140);
      private int d = ccs.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bxq.a.a, bxq.a.b, bxq.a.c));
      }

      @Override
      public boolean a() {
         return ccs.this.bn == 0.0F && ccs.this.bo == 0.0F && ccs.this.bp == 0.0F ? this.k() || ccs.this.fI() : false;
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
            return ccs.this.dM().Q() && this.h() && !this.i() && !ccs.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = ccs.this.ag.a(c);
         ccs.this.gB();
      }

      @Override
      public void c() {
         ccs.this.w(false);
         ccs.this.y(false);
         ccs.this.z(false);
         ccs.this.r(false);
         ccs.this.C(true);
         ccs.this.K().n();
         ccs.this.H().a(ccs.this.dr(), ccs.this.dt(), ccs.this.dx(), 0.0);
      }
   }

   class u extends bxq {
      public u() {
         this.a(EnumSet.of(bxq.a.a, bxq.a.b));
      }

      @Override
      public boolean a() {
         if (ccs.this.fI()) {
            return false;
         } else {
            bqt $$0 = ccs.this.p();
            return $$0 != null && $$0.bA() && ccs.cl.test($$0) && ccs.this.g($$0) > 36.0 && !ccs.this.bX() && !ccs.this.gw() && !ccs.this.bm;
         }
      }

      @Override
      public void c() {
         ccs.this.w(false);
         ccs.this.A(false);
      }

      @Override
      public void d() {
         bqt $$0 = ccs.this.p();
         if ($$0 != null && ccs.a(ccs.this, $$0)) {
            ccs.this.z(true);
            ccs.this.y(true);
            ccs.this.K().n();
            ccs.this.G().a($$0, (float)ccs.this.aa(), (float)ccs.this.Z());
         } else {
            ccs.this.z(false);
            ccs.this.y(false);
         }
      }

      @Override
      public void e() {
         bqt $$0 = ccs.this.p();
         if ($$0 != null) {
            ccs.this.G().a($$0, (float)ccs.this.aa(), (float)ccs.this.Z());
            if (ccs.this.g($$0) <= 36.0) {
               ccs.this.z(true);
               ccs.this.y(true);
               ccs.this.K().n();
            } else {
               ccs.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ayg {
      a(0, "red"),
      b(1, "snow");

      public static final ayg.a<ccs.v> c = ayg.a(ccs.v::values);
      private static final IntFunction<ccs.v> d = awd.a(ccs.v::a, values(), awd.a.a);
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

      public static ccs.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ccs.v a(int $$0) {
         return d.apply($$0);
      }

      public static ccs.v a(in<daf> $$0) {
         return $$0.a(avd.ar) ? b : a;
      }
   }
}
