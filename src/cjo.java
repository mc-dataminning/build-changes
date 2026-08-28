import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cjo extends ciz {
   private static final akj<Integer> bK = akn.a(cjo.class, akl.b);
   private static final akj<Byte> bL = akn.a(cjo.class, akl.a);
   private static final int bM = 1;
   public static final int bG = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   private static final int bN = 32;
   private static final int bO = 64;
   private static final int bP = 128;
   private static final akj<Optional<bwo<bxj>>> bQ = akn.a(cjo.class, akl.r);
   private static final akj<Optional<bwo<bxj>>> bR = akn.a(cjo.class, akl.r);
   static final Predicate<cnr> bS = $$0 -> !$$0.o() && $$0.bI();
   private static final Predicate<bwi> bT = $$0 -> !($$0 instanceof bxj $$1) ? false : $$1.et() != null && $$1.eu() < $$1.af + 600;
   static final Predicate<bwi> bU = $$0 -> $$0 instanceof cjf || $$0 instanceof cjz;
   private static final Predicate<bwi> bV = $$0 -> !$$0.ce() && bwp.e.test($$0);
   private static final int bW = 600;
   private static final bwl bX = bwr.aa.n().a(0.5F).b(0.2975F);
   private static final Codec<List<bwo<bxj>>> bY = bwo.a().listOf();
   private cef bZ;
   private cef ca;
   private cef cb;
   private float cc;
   private float cd;
   float ce;
   float cf;
   private int cg;

   public cjo(bwr<? extends cjo> $$0, djm $$1) {
      super($$0, $$1);
      this.bz = new cjo.k();
      this.bA = new cjo.m();
      this.a(exr.p, 0.0F);
      this.a(exr.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bQ, Optional.empty());
      $$0.a(bR, Optional.empty());
      $$0.a(bK, 0);
      $$0.a(bL, (byte)0);
   }

   @Override
   protected void D() {
      this.bZ = new cfy<>(this, ciz.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cjf || $$0 instanceof cjz);
      this.ca = new cfy<>(this, ckg.class, 10, false, false, ckg.bG);
      this.cb = new cfy<>(this, civ.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cix);
      this.bD.a(0, new cjo.g());
      this.bD.a(0, new cdu(this, this.dU()));
      this.bD.a(1, new cjo.b());
      this.bD.a(2, new cjo.n(2.2));
      this.bD.a(3, new cjo.e(1.0));
      this.bD.a(4, new cdm<>(this, crm.class, 16.0F, 1.6, 1.4, $$0 -> bV.test($$0) && !this.j($$0) && !this.gI()));
      this.bD.a(4, new cdm<>(this, cmb.class, 8.0F, 1.6, 1.4, $$0 -> !((cmb)$$0).q() && !this.gI()));
      this.bD.a(4, new cdm<>(this, cjx.class, 8.0F, 1.6, 1.4, $$0 -> !this.gI()));
      this.bD.a(5, new cjo.u());
      this.bD.a(6, new cjo.o());
      this.bD.a(6, new cjo.s(1.25));
      this.bD.a(7, new cjo.l(1.2F, true));
      this.bD.a(7, new cjo.t());
      this.bD.a(8, new cjo.h(this, 1.25));
      this.bD.a(9, new cjo.q(32, 200));
      this.bD.a(10, new cjo.f(1.2F, 12, 1));
      this.bD.a(10, new cel(this, 0.4F));
      this.bD.a(11, new cfs(this, 1.0));
      this.bD.a(11, new cjo.p());
      this.bD.a(12, new cjo.j(this, crm.class, 24.0F));
      this.bD.a(13, new cjo.r());
      this.bE.a(3, new cjo.a(bxj.class, false, false, ($$0, $$1) -> bT.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dU().C && this.bI() && this.di()) {
         this.cg++;
         czn $$0 = this.a(bws.a);
         if (this.j($$0)) {
            if (this.cg > 600) {
               czn $$1 = $$0.a(this.dU(), this);
               if (!$$1.f()) {
                  this.a(bws.a, $$1);
               }

               this.cg = 0;
            } else if (this.cg > 560 && this.ae.i() < 0.1F) {
               this.gz();
               this.dU().a(this, (byte)45);
            }
         }

         bxj $$2 = this.f();
         if ($$2 == null || !$$2.bI()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fQ() || this.ff()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      }

      super.k_();
      if (this.gI() && this.ae.i() < 0.05F) {
         this.a(awn.jJ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eG();
   }

   private boolean j(czn $$0) {
      return $$0.c(kk.v) && this.f() == null && this.aH() && !this.fQ();
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         czn $$3;
         if ($$2 < 0.05F) {
            $$3 = new czn(czr.po);
         } else if ($$2 < 0.2F) {
            $$3 = new czn(czr.rH);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new czn(czr.vO) : new czn(czr.vP);
         } else if ($$2 < 0.6F) {
            $$3 = new czn(czr.qk);
         } else if ($$2 < 0.8F) {
            $$3 = new czn(czr.rt);
         } else {
            $$3 = new czn(czr.qh);
         }

         this.a(bws.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         czn $$1 = this.a(bws.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ffc $$3 = new ffc(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dM() * (float) (Math.PI / 180.0))
                  .b(-this.dK() * (float) (Math.PI / 180.0));
               this.dU().a(new lu(ly.U, $$1), this.dz() + this.bR().d / 2.0, this.dB(), this.dF() + this.bR().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static byo.a q() {
      return ciz.gy().a(byp.v, 0.3F).a(byp.s, 10.0).a(byp.c, 2.0).a(byp.x, 5.0).a(byp.m, 32.0);
   }

   @Nullable
   public cjo b(arq $$0, bvy $$1) {
      cjo $$2 = bwr.aa.a($$0, bwq.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cjo)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bwr<cjo> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ci) && a($$1, $$3);
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      jf<dkp> $$4 = $$0.u(this.du());
      cjo.v $$5 = cjo.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cjo.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cjo.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arq) {
         this.gF();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gF() {
      if (this.t() == cjo.v.a) {
         this.bE.a(4, this.bZ);
         this.bE.a(4, this.ca);
         this.bE.a(6, this.cb);
      } else {
         this.bE.a(4, this.cb);
         this.bE.a(6, this.bZ);
         this.bE.a(6, this.ca);
      }
   }

   @Override
   protected void gz() {
      this.a(awn.jN, 1.0F, 1.0F);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bX : super.e($$0);
   }

   public cjo.v t() {
      return cjo.v.a(this.al.a(bK));
   }

   private void a(cjo.v $$0) {
      this.al.a(bK, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.az ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.az) {
         this.a(c(kk.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bwo<bxj>> gG() {
      return Stream.concat(this.al.a(bQ).stream(), this.al.a(bR).stream());
   }

   void i(bxj $$0) {
      this.a(new bwo<>($$0));
   }

   private void a(bwo<bxj> $$0) {
      if (this.al.a(bQ).isPresent()) {
         this.al.a(bR, Optional.of($$0));
      } else {
         this.al.a(bQ, Optional.of($$0));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Trusted", bY, this.gG().toList());
      $$0.a("Sleeping", this.fQ());
      $$0.a("Type", cjo.v.c, this.t());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.cg());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.gH();
      $$0.<List>a("Trusted", bY).orElse(List.of()).forEach(this::a);
      this.C($$0.o("Sleeping"));
      this.a($$0.<cjo.v>a("Type", cjo.v.c).orElse(cjo.v.a));
      this.w($$0.o("Sitting"));
      this.y($$0.o("Crouching"));
      if (this.dU() instanceof arq) {
         this.gF();
      }
   }

   private void gH() {
      this.al.a(bQ, Optional.empty());
      this.al.a(bR, Optional.empty());
   }

   public boolean x() {
      return this.s(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gt() {
      return this.s(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gI() {
      return this.s(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fQ() {
      return this.s(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bL, (byte)(this.al.a(bL) | $$0));
      } else {
         this.al.a(bL, (byte)(this.al.a(bL) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bL) & $$0) != 0;
   }

   @Override
   protected boolean f(bws $$0) {
      return $$0 == bws.a && this.fM();
   }

   @Override
   public boolean g(czn $$0) {
      czn $$1 = this.a(bws.a);
      return $$1.f() || this.cg > 0 && $$0.c(kk.v) && !$$1.c(kk.v);
   }

   private void k(czn $$0) {
      if (!$$0.f() && !this.dU().C) {
         cnr $$1 = new cnr(this.dU(), this.dz() + this.bR().d, this.dB() + 1.0, this.dF() + this.bR().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awn.jS, 1.0F, 1.0F);
         this.dU().b($$1);
      }
   }

   private void l(czn $$0) {
      cnr $$1 = new cnr(this.dU(), this.dz(), this.dB(), this.dF(), $$0);
      this.dU().b($$1);
   }

   @Override
   protected void a(arq $$0, cnr $$1) {
      czn $$2 = $$1.f();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bws.a));
         this.a($$1);
         this.a(bws.a, $$2.a(1));
         this.g(bws.a);
         this.a($$1, $$2.M());
         $$1.aq();
         this.cg = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.di()) {
         boolean $$0 = this.bh();
         if ($$0 || this.f() != null || this.dU().ag()) {
            this.gJ();
         }

         if ($$0 || this.fQ()) {
            this.w(false);
         }

         if (this.gt() && this.dU().A.i() < 0.2F) {
            iv $$1 = this.du();
            eat $$2 = this.dU().a_($$1);
            this.dU().c(2001, $$1, dmr.j($$2));
         }
      }

      this.cd = this.cc;
      if (this.gx()) {
         this.cc = this.cc + (1.0F - this.cc) * 0.4F;
      } else {
         this.cc = this.cc + (0.0F - this.cc) * 0.4F;
      }

      this.cf = this.ce;
      if (this.cg()) {
         this.ce += 0.2F;
         if (this.ce > 3.0F) {
            this.ce = 3.0F;
         }
      } else {
         this.ce = 0.0F;
      }
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.ad);
   }

   @Override
   protected void a(crm $$0, bxl $$1) {
      ((cjo)$$1).i($$0);
   }

   public boolean gu() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gv() {
      return this.bf;
   }

   public boolean gw() {
      return this.ce == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cg() {
      return this.s(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gx() {
      return this.s(8);
   }

   public float J(float $$0) {
      return azm.h($$0, this.cd, this.cc) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azm.h($$0, this.cf, this.ce);
   }

   @Override
   public void g(@Nullable bxj $$0) {
      if (this.gI() && $$0 == null) {
         this.B(false);
      }

      super.g($$0);
   }

   void gJ() {
      this.C(false);
   }

   void gK() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gL() {
      return !this.fQ() && !this.x() && !this.gt();
   }

   @Override
   public void T() {
      awm $$0 = this.u();
      if ($$0 == awn.jP) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.fQ()) {
         return awn.jQ;
      } else {
         if (!this.dU().V() && this.ae.i() < 0.1F) {
            List<crm> $$0 = this.dU().a(crm.class, this.cQ().c(16.0, 16.0, 16.0), bwp.f);
            if ($$0.isEmpty()) {
               return awn.jP;
            }
         }

         return awn.jK;
      }
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return awn.jO;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.jM;
   }

   boolean j(bxj $$0) {
      return this.gG().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(arq $$0, bux $$1) {
      czn $$2 = this.a(bws.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bws.a, czn.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cjo $$0, bxj $$1) {
      double $$2 = $$1.dF() - $$0.dF();
      double $$3 = $$1.dz() - $$0.dz();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dU().a_(iv.a($$0.dz() + $$8, $$0.dB() + (double)$$9, $$0.dF() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ffc cS() {
      return new ffc(0.0, (double)(0.55F * this.cR()), (double)(this.dp() * 0.4F));
   }

   class a extends cfy<bxj> {
      @Nullable
      private bxj j;
      @Nullable
      private bxj k;
      private int l;

      public a(final Class<bxj> $$0, final boolean $$1, final boolean $$2, @Nullable final chy.a $$3) {
         super(cjo.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dX().a(this.b) != 0) {
            return false;
         } else {
            arq $$0 = a(cjo.this.dU());

            for (bwo<bxj> $$1 : cjo.this.gG().toList()) {
               bxj $$2 = $$1.a($$0, bxj.class);
               if ($$2 != null) {
                  this.k = $$2;
                  this.j = $$2.eq();
                  int $$3 = $$2.es();
                  return $$3 != this.l && this.a(this.j, this.d);
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
            this.l = this.k.es();
         }

         cjo.this.a(awn.jJ, 1.0F, 1.0F);
         cjo.this.B(true);
         cjo.this.gJ();
         super.d();
      }
   }

   class b extends cef {
      int a;

      public b() {
         this.a(EnumSet.of(cef.a.b, cef.a.c, cef.a.a));
      }

      @Override
      public boolean b() {
         return cjo.this.gt();
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
         cjo.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements chy.a {
      @Override
      public boolean test(bxj $$0, arq $$1) {
         if ($$0 instanceof cjo) {
            return false;
         } else if ($$0 instanceof cjf || $$0 instanceof cjz || $$0 instanceof coo) {
            return true;
         } else if ($$0 instanceof byf) {
            return !((byf)$$0).q();
         } else {
            if ($$0 instanceof crm $$2 && ($$2.V_() || $$2.b())) {
               return false;
            }

            return cjo.this.j($$0) ? false : !$$0.fQ() && !$$0.ce();
         }
      }
   }

   abstract class d extends cef {
      private final chy b = chy.a().a(12.0).d().a(cjo.this.new c());

      protected boolean h() {
         iv $$0 = iv.a(cjo.this.dz(), cjo.this.cQ().e, cjo.this.dF());
         return !cjo.this.dU().h($$0) && cjo.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cjo.this.dU()).a(bxj.class, this.b, cjo.this, cjo.this.cQ().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cdr {
      public e(final double $$0) {
         super(cjo.this, $$0);
      }

      @Override
      public void d() {
         ((cjo)this.a).gK();
         ((cjo)this.c).gK();
         super.d();
      }

      @Override
      protected void g() {
         arq $$0 = this.b;
         cjo $$1 = (cjo)this.a.a($$0, (bvy)this.c);
         if ($$1 != null) {
            arr $$2 = this.a.gC();
            arr $$3 = this.c.gC();
            arr $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(awx.P);
               aq.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gE();
            this.c.gE();
            $$1.c_(-24000);
            $$1.b(this.a.dz(), this.a.dB(), this.a.dF(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().c(dji.g)) {
               this.b.b(new bww(this.b, this.a.dz(), this.a.dB(), this.a.dF(), this.a.dX().a(7) + 1));
            }
         }
      }
   }

   public class f extends ces {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cjo.this, $$1, $$2, $$3);
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
      protected boolean a(djp $$0, iv $$1) {
         eat $$2 = $$0.a_($$1);
         return $$2.a(dmt.oO) && $$2.c(dve.c) >= 2 || dnp.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cjo.this.ae.i() < 0.05F) {
            cjo.this.a(awn.jR, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cjo.this.dU()).O().c(dji.d)) {
            eat $$0 = cjo.this.dU().a_(this.e);
            if ($$0.a(dmt.oO)) {
               this.b($$0);
            } else if (dnp.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(eat $$0) {
         dnp.a(cjo.this, $$0, cjo.this.dU(), this.e);
      }

      private void b(eat $$0) {
         int $$1 = $$0.c(dve.c);
         $$0.b(dve.c, Integer.valueOf(1));
         int $$2 = 1 + cjo.this.dU().A.a(2) + ($$1 == 3 ? 1 : 0);
         czn $$3 = cjo.this.a(bws.a);
         if ($$3.f()) {
            cjo.this.a(bws.a, new czn(czr.xG));
            $$2--;
         }

         if ($$2 > 0) {
            dmr.a(cjo.this.dU(), this.e, new czn(czr.xG, $$2));
         }

         cjo.this.a(awn.Aw, 1.0F, 1.0F);
         cjo.this.dU().a(this.e, $$0.b(dve.c, Integer.valueOf(1)), 2);
         cjo.this.dU().a(eft.c, this.e, eft.a.a(cjo.this));
      }

      @Override
      public boolean b() {
         return !cjo.this.fQ() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cjo.this.w(false);
         super.d();
      }
   }

   class g extends cdz {
      public g() {
         super(cjo.this);
      }

      @Override
      public void d() {
         super.d();
         cjo.this.gK();
      }

      @Override
      public boolean b() {
         return cjo.this.bh() && cjo.this.b(axh.a) > 0.25 || cjo.this.bu();
      }
   }

   static class h extends cee {
      private final cjo d;

      public h(cjo $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gI() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gI() && super.c();
      }

      @Override
      public void d() {
         this.d.gK();
         super.d();
      }
   }

   public static class i extends bvy.a {
      public final cjo.v a;

      public i(cjo.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cen {
      public j(final bxl $$0, final Class<? extends bxj> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cjo.this.gt() && !cjo.this.gx();
      }

      @Override
      public boolean c() {
         return super.c() && !cjo.this.gt() && !cjo.this.gx();
      }
   }

   public class k extends cdh {
      public k() {
         super(cjo.this);
      }

      @Override
      public void a() {
         if (!cjo.this.fQ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjo.this.gu() && !cjo.this.cg() && !cjo.this.gx() && !cjo.this.gt();
      }
   }

   class l extends cep {
      public l(final double $$0, final boolean $$1) {
         super(cjo.this, $$0, $$1);
      }

      @Override
      protected void a(bxj $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjo.this.a(awn.jL, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cjo.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cjo.this.x() && !cjo.this.fQ() && !cjo.this.cg() && !cjo.this.gt() && super.b();
      }
   }

   class m extends cdi {
      public m() {
         super(cjo.this);
      }

      @Override
      public void a() {
         if (cjo.this.gL()) {
            super.a();
         }
      }
   }

   class n extends cey {
      public n(final double $$0) {
         super(cjo.this, $$0);
      }

      @Override
      public boolean h() {
         return !cjo.this.gI() && super.h();
      }
   }

   public class o extends cej {
      @Override
      public boolean b() {
         if (!cjo.this.gw()) {
            return false;
         } else {
            bxj $$0 = cjo.this.f();
            if ($$0 != null && $$0.bI()) {
               if ($$0.cO() != $$0.cN()) {
                  return false;
               } else {
                  boolean $$1 = cjo.a(cjo.this, $$0);
                  if (!$$1) {
                     cjo.this.O().a($$0, 0);
                     cjo.this.y(false);
                     cjo.this.z(false);
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
         bxj $$0 = cjo.this.f();
         if ($$0 != null && $$0.bI()) {
            double $$1 = cjo.this.dx().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cjo.this.dM()) < 15.0F) || !cjo.this.aH()) && !cjo.this.gt();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void d() {
         cjo.this.s(true);
         cjo.this.x(true);
         cjo.this.z(false);
         bxj $$0 = cjo.this.f();
         if ($$0 != null) {
            cjo.this.J().a($$0, 60.0F, 30.0F);
            ffc $$1 = new ffc($$0.dz() - cjo.this.dz(), $$0.dB() - cjo.this.dB(), $$0.dF() - cjo.this.dF()).d();
            cjo.this.i(cjo.this.dx().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cjo.this.O().m();
      }

      @Override
      public void e() {
         cjo.this.y(false);
         cjo.this.ce = 0.0F;
         cjo.this.cf = 0.0F;
         cjo.this.z(false);
         cjo.this.x(false);
      }

      @Override
      public void a() {
         bxj $$0 = cjo.this.f();
         if ($$0 != null) {
            cjo.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!cjo.this.gt()) {
            ffc $$1 = cjo.this.dx();
            if ($$1.e * $$1.e < 0.03F && cjo.this.dM() != 0.0F) {
               cjo.this.x(azm.i(0.2F, cjo.this.dM(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cjo.this.x((float)$$3);
            }
         }

         if ($$0 != null && cjo.this.f($$0) <= 2.0F) {
            cjo.this.c(a(cjo.this.dU()), $$0);
         } else if (cjo.this.dM() > 0.0F && cjo.this.aH() && (float)cjo.this.dx().e != 0.0F && cjo.this.dU().a_(cjo.this.du()).a(dmt.ed)) {
            cjo.this.x(60.0F);
            cjo.this.g(null);
            cjo.this.A(true);
         }
      }
   }

   class p extends cef {
      public p() {
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         if (!cjo.this.a(bws.a).f()) {
            return false;
         } else if (cjo.this.f() != null || cjo.this.eq() != null) {
            return false;
         } else if (!cjo.this.gL()) {
            return false;
         } else if (cjo.this.dX().a(b(10)) != 0) {
            return false;
         } else {
            List<cnr> $$0 = cjo.this.dU().a(cnr.class, cjo.this.cQ().c(8.0, 8.0, 8.0), cjo.bS);
            return !$$0.isEmpty() && cjo.this.a(bws.a).f();
         }
      }

      @Override
      public void a() {
         List<cnr> $$0 = cjo.this.dU().a(cnr.class, cjo.this.cQ().c(8.0, 8.0, 8.0), cjo.bS);
         czn $$1 = cjo.this.a(bws.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cjo.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cnr> $$0 = cjo.this.dU().a(cnr.class, cjo.this.cQ().c(8.0, 8.0, 8.0), cjo.bS);
         if (!$$0.isEmpty()) {
            cjo.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cfl {
      public q(final int $$0, final int $$1) {
         super(cjo.this, $$1);
      }

      @Override
      public void d() {
         cjo.this.gK();
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
         return !cjo.this.fQ() && !cjo.this.x() && !cjo.this.gI() && cjo.this.f() == null;
      }
   }

   class r extends cjo.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         return cjo.this.eq() == null
            && cjo.this.dX().i() < 0.02F
            && !cjo.this.fQ()
            && cjo.this.f() == null
            && cjo.this.O().k()
            && !this.i()
            && !cjo.this.gu()
            && !cjo.this.cg();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cjo.this.dX().a(3);
         cjo.this.w(true);
         cjo.this.O().m();
      }

      @Override
      public void e() {
         cjo.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cjo.this.J().a(cjo.this.dz() + this.c, cjo.this.dD(), cjo.this.dF() + this.d, (float)cjo.this.af(), (float)cjo.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cjo.this.dX().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cjo.this.dX().a(20));
      }
   }

   class s extends cdy {
      private int c = b(100);

      public s(final double $$0) {
         super(cjo.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cjo.this.fQ() && this.a.f() == null) {
            if (cjo.this.dU().ag() && cjo.this.dU().h(this.a.du())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iv $$0 = this.a.du();
               return cjo.this.dU().V() && cjo.this.dU().h($$0) && !((arq)cjo.this.dU()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cjo.this.gK();
         super.d();
      }
   }

   class t extends cjo.d {
      private static final int c = b(140);
      private int d = cjo.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cef.a.a, cef.a.b, cef.a.c));
      }

      @Override
      public boolean b() {
         return cjo.this.bg == 0.0F && cjo.this.bh == 0.0F && cjo.this.bi == 0.0F ? this.k() || cjo.this.fQ() : false;
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
            return cjo.this.dU().V() && this.h() && !this.i() && !cjo.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cjo.this.ae.a(c);
         cjo.this.gK();
      }

      @Override
      public void d() {
         cjo.this.w(false);
         cjo.this.y(false);
         cjo.this.z(false);
         cjo.this.s(false);
         cjo.this.C(true);
         cjo.this.O().m();
         cjo.this.L().a(cjo.this.dz(), cjo.this.dB(), cjo.this.dF(), 0.0);
      }
   }

   class u extends cef {
      public u() {
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         if (cjo.this.fQ()) {
            return false;
         } else {
            bxj $$0 = cjo.this.f();
            return $$0 != null && $$0.bI() && cjo.bU.test($$0) && cjo.this.g((bwi)$$0) > 36.0 && !cjo.this.cg() && !cjo.this.gx() && !cjo.this.bf;
         }
      }

      @Override
      public void d() {
         cjo.this.w(false);
         cjo.this.A(false);
      }

      @Override
      public void e() {
         bxj $$0 = cjo.this.f();
         if ($$0 != null && cjo.a(cjo.this, $$0)) {
            cjo.this.z(true);
            cjo.this.y(true);
            cjo.this.O().m();
            cjo.this.J().a($$0, (float)cjo.this.af(), (float)cjo.this.ad());
         } else {
            cjo.this.z(false);
            cjo.this.y(false);
         }
      }

      @Override
      public void a() {
         bxj $$0 = cjo.this.f();
         if ($$0 != null) {
            cjo.this.J().a($$0, (float)cjo.this.af(), (float)cjo.this.ad());
            if (cjo.this.g((bwi)$$0) <= 36.0) {
               cjo.this.z(true);
               cjo.this.y(true);
               cjo.this.O().m();
            } else {
               cjo.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bak {
      a(0, "red"),
      b(1, "snow");

      public static final bak.a<cjo.v> c = bak.a(cjo.v::values);
      private static final IntFunction<cjo.v> e = ayc.a(cjo.v::a, values(), ayc.a.a);
      public static final yw<ByteBuf, cjo.v> d = yu.a(e, cjo.v::a);
      private final int f;
      private final String g;

      private v(final int $$0, final String $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.g;
      }

      public int a() {
         return this.f;
      }

      public static cjo.v a(int $$0) {
         return e.apply($$0);
      }

      public static cjo.v a(jf<dkp> $$0) {
         return $$0.a(axb.at) ? b : a;
      }
   }
}
