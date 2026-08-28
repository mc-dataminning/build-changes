import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ckb extends cjm {
   private static final akn<Integer> bM = akr.a(ckb.class, akp.b);
   private static final akn<Byte> bN = akr.a(ckb.class, akp.a);
   private static final int bO = 1;
   public static final int bI = 4;
   public static final int bJ = 8;
   public static final int bK = 16;
   private static final int bP = 32;
   private static final int bQ = 64;
   private static final int bR = 128;
   private static final akn<Optional<bxb<bxw>>> bS = akr.a(ckb.class, akp.r);
   private static final akn<Optional<bxb<bxw>>> bT = akr.a(ckb.class, akp.r);
   static final Predicate<coe> bU = $$0 -> !$$0.o() && $$0.bJ();
   private static final Predicate<bwv> bV = $$0 -> !($$0 instanceof bxw $$1) ? false : $$1.eu() != null && $$1.ev() < $$1.af + 600;
   static final Predicate<bwv> bW = $$0 -> $$0 instanceof cjs || $$0 instanceof ckm;
   private static final Predicate<bwv> bX = $$0 -> !$$0.cf() && bxc.e.test($$0);
   private static final int bY = 600;
   private static final bwy bZ = bxe.ab.n().a(0.5F).b(0.2975F);
   private static final Codec<List<bxb<bxw>>> ca = bxb.a().listOf();
   private static final boolean cb = false;
   private static final boolean cc = false;
   private static final boolean cd = false;
   private ces ce;
   private ces cf;
   private ces cg;
   private float ch;
   private float ci;
   float cj;
   float ck;
   private int cl;

   public ckb(bxe<? extends ckb> $$0, djz $$1) {
      super($$0, $$1);
      this.bB = new ckb.k();
      this.bC = new ckb.m();
      this.a(eyh.p, 0.0F);
      this.a(eyh.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bS, Optional.empty());
      $$0.a(bT, Optional.empty());
      $$0.a(bM, ckb.v.c.a());
      $$0.a(bN, (byte)0);
   }

   @Override
   protected void D() {
      this.ce = new cgl<>(this, cjm.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cjs || $$0 instanceof ckm);
      this.cf = new cgl<>(this, ckt.class, 10, false, false, ckt.bI);
      this.cg = new cgl<>(this, cji.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cjk);
      this.bF.a(0, new ckb.g());
      this.bF.a(0, new ceh(this, this.dV()));
      this.bF.a(1, new ckb.b());
      this.bF.a(2, new ckb.n(2.2));
      this.bF.a(3, new ckb.e(1.0));
      this.bF.a(4, new cdz<>(this, crz.class, 16.0F, 1.6, 1.4, $$0 -> bX.test($$0) && !this.j($$0) && !this.gJ()));
      this.bF.a(4, new cdz<>(this, cmo.class, 8.0F, 1.6, 1.4, $$0 -> !((cmo)$$0).q() && !this.gJ()));
      this.bF.a(4, new cdz<>(this, ckk.class, 8.0F, 1.6, 1.4, $$0 -> !this.gJ()));
      this.bF.a(5, new ckb.u());
      this.bF.a(6, new ckb.o());
      this.bF.a(6, new ckb.s(1.25));
      this.bF.a(7, new ckb.l(1.2F, true));
      this.bF.a(7, new ckb.t());
      this.bF.a(8, new ckb.h(this, 1.25));
      this.bF.a(9, new ckb.q(32, 200));
      this.bF.a(10, new ckb.f(1.2F, 12, 1));
      this.bF.a(10, new cey(this, 0.4F));
      this.bF.a(11, new cgf(this, 1.0));
      this.bF.a(11, new ckb.p());
      this.bF.a(12, new ckb.j(this, crz.class, 24.0F));
      this.bF.a(13, new ckb.r());
      this.bG.a(3, new ckb.a(bxw.class, false, false, ($$0, $$1) -> bV.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bJ() && this.dj()) {
         this.cl++;
         daa $$0 = this.a(bxf.a);
         if (this.j($$0)) {
            if (this.cl > 600) {
               daa $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bxf.a, $$1);
               }

               this.cl = 0;
            } else if (this.cl > 560 && this.ae.i() < 0.1F) {
               this.gA();
               this.dV().a(this, (byte)45);
            }
         }

         bxw $$2 = this.f();
         if ($$2 == null || !$$2.bJ()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fR() || this.fg()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      }

      super.k_();
      if (this.gJ() && this.ae.i() < 0.05F) {
         this.a(awr.jJ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eH();
   }

   private boolean j(daa $$0) {
      return $$0.c(kl.v) && this.f() == null && this.aH() && !this.fR();
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         daa $$3;
         if ($$2 < 0.05F) {
            $$3 = new daa(dae.po);
         } else if ($$2 < 0.2F) {
            $$3 = new daa(dae.rH);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new daa(dae.vO) : new daa(dae.vP);
         } else if ($$2 < 0.6F) {
            $$3 = new daa(dae.qk);
         } else if ($$2 < 0.8F) {
            $$3 = new daa(dae.rt);
         } else {
            $$3 = new daa(dae.qh);
         }

         this.a(bxf.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         daa $$1 = this.a(bxf.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ffs $$3 = new ffs(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lv(lz.U, $$1), this.dA() + this.bS().d / 2.0, this.dC(), this.dG() + this.bS().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.v, 0.3F).a(bzc.s, 10.0).a(bzc.c, 2.0).a(bzc.x, 5.0).a(bzc.m, 32.0);
   }

   @Nullable
   public ckb b(aru $$0, bwl $$1) {
      ckb $$2 = bxe.ab.a($$0, bxd.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((ckb)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bxe<ckb> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.ci) && a($$1, $$3);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      jg<dlc> $$4 = $$0.u(this.dv());
      ckb.v $$5 = ckb.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ckb.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ckb.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aru) {
         this.gG();
      }

      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gG() {
      if (this.t() == ckb.v.a) {
         this.bG.a(4, this.ce);
         this.bG.a(4, this.cf);
         this.bG.a(6, this.cg);
      } else {
         this.bG.a(4, this.cg);
         this.bG.a(6, this.ce);
         this.bG.a(6, this.cf);
      }
   }

   @Override
   protected void gA() {
      this.a(awr.jN, 1.0F, 1.0F);
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bZ : super.e($$0);
   }

   public ckb.v t() {
      return ckb.v.a(this.al.a(bM));
   }

   private void a(ckb.v $$0) {
      this.al.a(bM, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.az ? c((kk<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.az) {
         this.a(c(kl.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bxb<bxw>> gH() {
      return Stream.concat(this.al.a(bS).stream(), this.al.a(bT).stream());
   }

   void i(bxw $$0) {
      this.a(new bxb<>($$0));
   }

   private void a(bxb<bxw> $$0) {
      if (this.al.a(bS).isPresent()) {
         this.al.a(bT, Optional.of($$0));
      } else {
         this.al.a(bS, Optional.of($$0));
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Trusted", ca, this.gH().toList());
      $$0.a("Sleeping", this.fR());
      $$0.a("Type", ckb.v.d, this.t());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ch());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.gI();
      $$0.<List>a("Trusted", ca).orElse(List.of()).forEach(this::a);
      this.C($$0.b("Sleeping", false));
      this.a($$0.<ckb.v>a("Type", ckb.v.d).orElse(ckb.v.c));
      this.w($$0.b("Sitting", false));
      this.y($$0.b("Crouching", false));
      if (this.dV() instanceof aru) {
         this.gG();
      }
   }

   private void gI() {
      this.al.a(bS, Optional.empty());
      this.al.a(bT, Optional.empty());
   }

   public boolean x() {
      return this.s(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gu() {
      return this.s(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gJ() {
      return this.s(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fR() {
      return this.s(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bN, (byte)(this.al.a(bN) | $$0));
      } else {
         this.al.a(bN, (byte)(this.al.a(bN) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bN) & $$0) != 0;
   }

   @Override
   protected boolean f(bxf $$0) {
      return $$0 == bxf.a && this.fN();
   }

   @Override
   public boolean g(daa $$0) {
      daa $$1 = this.a(bxf.a);
      return $$1.f() || this.cl > 0 && $$0.c(kl.v) && !$$1.c(kl.v);
   }

   private void k(daa $$0) {
      if (!$$0.f() && !this.dV().C) {
         coe $$1 = new coe(this.dV(), this.dA() + this.bS().d, this.dC() + 1.0, this.dG() + this.bS().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awr.jS, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(daa $$0) {
      coe $$1 = new coe(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(aru $$0, coe $$1) {
      daa $$2 = $$1.f();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bxf.a));
         this.a($$1);
         this.a(bxf.a, $$2.a(1));
         this.g(bxf.a);
         this.a($$1, $$2.M());
         $$1.aq();
         this.cl = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bi();
         if ($$0 || this.f() != null || this.dV().ag()) {
            this.gK();
         }

         if ($$0 || this.fR()) {
            this.w(false);
         }

         if (this.gu() && this.dV().A.i() < 0.2F) {
            iw $$1 = this.dv();
            ebg $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dne.j($$2));
         }
      }

      this.ci = this.ch;
      if (this.gy()) {
         this.ch = this.ch + (1.0F - this.ch) * 0.4F;
      } else {
         this.ch = this.ch + (0.0F - this.ch) * 0.4F;
      }

      this.ck = this.cj;
      if (this.ch()) {
         this.cj += 0.2F;
         if (this.cj > 3.0F) {
            this.cj = 3.0F;
         }
      } else {
         this.cj = 0.0F;
      }
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ae);
   }

   @Override
   protected void a(crz $$0, bxy $$1) {
      ((ckb)$$1).i($$0);
   }

   public boolean gv() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.bf;
   }

   public boolean gx() {
      return this.cj == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ch() {
      return this.s(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gy() {
      return this.s(8);
   }

   public float J(float $$0) {
      return azq.h($$0, this.ci, this.ch) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azq.h($$0, this.ck, this.cj);
   }

   @Override
   public void g(@Nullable bxw $$0) {
      if (this.gJ() && $$0 == null) {
         this.B(false);
      }

      super.g($$0);
   }

   void gK() {
      this.C(false);
   }

   void gL() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gM() {
      return !this.fR() && !this.x() && !this.gu();
   }

   @Override
   public void T() {
      awq $$0 = this.u();
      if ($$0 == awr.jP) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awq u() {
      if (this.fR()) {
         return awr.jQ;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<crz> $$0 = this.dV().a(crz.class, this.cR().c(16.0, 16.0, 16.0), bxc.f);
            if ($$0.isEmpty()) {
               return awr.jP;
            }
         }

         return awr.jK;
      }
   }

   @Nullable
   @Override
   protected awq e(bvk $$0) {
      return awr.jO;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.jM;
   }

   boolean j(bxw $$0) {
      return this.gH().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(aru $$0, bvk $$1) {
      daa $$2 = this.a(bxf.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bxf.a, daa.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(ckb $$0, bxw $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(iw.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cgl<bxw> {
      @Nullable
      private bxw j;
      @Nullable
      private bxw k;
      private int l;

      public a(final Class<bxw> $$0, final boolean $$1, final boolean $$2, @Nullable final cil.a $$3) {
         super(ckb.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            aru $$0 = a(ckb.this.dV());

            for (bxb<bxw> $$1 : ckb.this.gH().toList()) {
               bxw $$2 = $$1.a($$0, bxw.class);
               if ($$2 != null) {
                  this.k = $$2;
                  this.j = $$2.er();
                  int $$3 = $$2.et();
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
            this.l = this.k.et();
         }

         ckb.this.a(awr.jJ, 1.0F, 1.0F);
         ckb.this.B(true);
         ckb.this.gK();
         super.d();
      }
   }

   class b extends ces {
      int a;

      public b() {
         this.a(EnumSet.of(ces.a.b, ces.a.c, ces.a.a));
      }

      @Override
      public boolean b() {
         return ckb.this.gu();
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
         ckb.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cil.a {
      @Override
      public boolean test(bxw $$0, aru $$1) {
         if ($$0 instanceof ckb) {
            return false;
         } else if ($$0 instanceof cjs || $$0 instanceof ckm || $$0 instanceof cpb) {
            return true;
         } else if ($$0 instanceof bys) {
            return !((bys)$$0).q();
         } else {
            if ($$0 instanceof crz $$2 && ($$2.Z_() || $$2.b())) {
               return false;
            }

            return ckb.this.j($$0) ? false : !$$0.fR() && !$$0.cf();
         }
      }
   }

   abstract class d extends ces {
      private final cil b = cil.a().a(12.0).d().a(ckb.this.new c());

      protected boolean h() {
         iw $$0 = iw.a(ckb.this.dA(), ckb.this.cR().e, ckb.this.dG());
         return !ckb.this.dV().h($$0) && ckb.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(ckb.this.dV()).a(bxw.class, this.b, ckb.this, ckb.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cee {
      public e(final double $$0) {
         super(ckb.this, $$0);
      }

      @Override
      public void d() {
         ((ckb)this.a).gL();
         ((ckb)this.c).gL();
         super.d();
      }

      @Override
      protected void g() {
         aru $$0 = this.b;
         ckb $$1 = (ckb)this.a.a($$0, (bwl)this.c);
         if ($$1 != null) {
            arv $$2 = this.a.gD();
            arv $$3 = this.c.gD();
            arv $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(axb.P);
               aq.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gF();
            this.c.gF();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().c(djv.g)) {
               this.b.b(new bxj(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cff {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(ckb.this, $$1, $$2, $$3);
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
      protected boolean a(dkc $$0, iw $$1) {
         ebg $$2 = $$0.a_($$1);
         return $$2.a(dng.oO) && $$2.c(dvr.c) >= 2 || doc.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ckb.this.ae.i() < 0.05F) {
            ckb.this.a(awr.jR, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(ckb.this.dV()).O().c(djv.d)) {
            ebg $$0 = ckb.this.dV().a_(this.e);
            if ($$0.a(dng.oO)) {
               this.b($$0);
            } else if (doc.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(ebg $$0) {
         doc.a(ckb.this, $$0, ckb.this.dV(), this.e);
      }

      private void b(ebg $$0) {
         int $$1 = $$0.c(dvr.c);
         $$0.b(dvr.c, Integer.valueOf(1));
         int $$2 = 1 + ckb.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         daa $$3 = ckb.this.a(bxf.a);
         if ($$3.f()) {
            ckb.this.a(bxf.a, new daa(dae.xG));
            $$2--;
         }

         if ($$2 > 0) {
            dne.a(ckb.this.dV(), this.e, new daa(dae.xG, $$2));
         }

         ckb.this.a(awr.Aw, 1.0F, 1.0F);
         ckb.this.dV().a(this.e, $$0.b(dvr.c, Integer.valueOf(1)), 2);
         ckb.this.dV().a(egg.c, this.e, egg.a.a(ckb.this));
      }

      @Override
      public boolean b() {
         return !ckb.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         ckb.this.w(false);
         super.d();
      }
   }

   class g extends cem {
      public g() {
         super(ckb.this);
      }

      @Override
      public void d() {
         super.d();
         ckb.this.gL();
      }

      @Override
      public boolean b() {
         return ckb.this.bi() && ckb.this.b(axl.a) > 0.25 || ckb.this.bv();
      }
   }

   static class h extends cer {
      private final ckb d;

      public h(ckb $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gJ() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gJ() && super.c();
      }

      @Override
      public void d() {
         this.d.gL();
         super.d();
      }
   }

   public static class i extends bwl.a {
      public final ckb.v a;

      public i(ckb.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cfa {
      public j(final bxy $$0, final Class<? extends bxw> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !ckb.this.gu() && !ckb.this.gy();
      }

      @Override
      public boolean c() {
         return super.c() && !ckb.this.gu() && !ckb.this.gy();
      }
   }

   public class k extends cdu {
      public k() {
         super(ckb.this);
      }

      @Override
      public void a() {
         if (!ckb.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ckb.this.gv() && !ckb.this.ch() && !ckb.this.gy() && !ckb.this.gu();
      }
   }

   class l extends cfc {
      public l(final double $$0, final boolean $$1) {
         super(ckb.this, $$0, $$1);
      }

      @Override
      protected void a(bxw $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            ckb.this.a(awr.jL, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         ckb.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !ckb.this.x() && !ckb.this.fR() && !ckb.this.ch() && !ckb.this.gu() && super.b();
      }
   }

   class m extends cdv {
      public m() {
         super(ckb.this);
      }

      @Override
      public void a() {
         if (ckb.this.gM()) {
            super.a();
         }
      }
   }

   class n extends cfl {
      public n(final double $$0) {
         super(ckb.this, $$0);
      }

      @Override
      public boolean h() {
         return !ckb.this.gJ() && super.h();
      }
   }

   public class o extends cew {
      @Override
      public boolean b() {
         if (!ckb.this.gx()) {
            return false;
         } else {
            bxw $$0 = ckb.this.f();
            if ($$0 != null && $$0.bJ()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = ckb.a(ckb.this, $$0);
                  if (!$$1) {
                     ckb.this.O().a($$0, 0);
                     ckb.this.y(false);
                     ckb.this.z(false);
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
         bxw $$0 = ckb.this.f();
         if ($$0 != null && $$0.bJ()) {
            double $$1 = ckb.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ckb.this.dN()) < 15.0F) || !ckb.this.aH()) && !ckb.this.gu();
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
         ckb.this.s(true);
         ckb.this.x(true);
         ckb.this.z(false);
         bxw $$0 = ckb.this.f();
         if ($$0 != null) {
            ckb.this.J().a($$0, 60.0F, 30.0F);
            ffs $$1 = new ffs($$0.dA() - ckb.this.dA(), $$0.dC() - ckb.this.dC(), $$0.dG() - ckb.this.dG()).d();
            ckb.this.i(ckb.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         ckb.this.O().m();
      }

      @Override
      public void e() {
         ckb.this.y(false);
         ckb.this.cj = 0.0F;
         ckb.this.ck = 0.0F;
         ckb.this.z(false);
         ckb.this.x(false);
      }

      @Override
      public void a() {
         bxw $$0 = ckb.this.f();
         if ($$0 != null) {
            ckb.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!ckb.this.gu()) {
            ffs $$1 = ckb.this.dy();
            if ($$1.e * $$1.e < 0.03F && ckb.this.dN() != 0.0F) {
               ckb.this.x(azq.i(0.2F, ckb.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               ckb.this.x((float)$$3);
            }
         }

         if ($$0 != null && ckb.this.f($$0) <= 2.0F) {
            ckb.this.c(a(ckb.this.dV()), $$0);
         } else if (ckb.this.dN() > 0.0F && ckb.this.aH() && (float)ckb.this.dy().e != 0.0F && ckb.this.dV().a_(ckb.this.dv()).a(dng.ed)) {
            ckb.this.x(60.0F);
            ckb.this.g(null);
            ckb.this.A(true);
         }
      }
   }

   class p extends ces {
      public p() {
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         if (!ckb.this.a(bxf.a).f()) {
            return false;
         } else if (ckb.this.f() != null || ckb.this.er() != null) {
            return false;
         } else if (!ckb.this.gM()) {
            return false;
         } else if (ckb.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<coe> $$0 = ckb.this.dV().a(coe.class, ckb.this.cR().c(8.0, 8.0, 8.0), ckb.bU);
            return !$$0.isEmpty() && ckb.this.a(bxf.a).f();
         }
      }

      @Override
      public void a() {
         List<coe> $$0 = ckb.this.dV().a(coe.class, ckb.this.cR().c(8.0, 8.0, 8.0), ckb.bU);
         daa $$1 = ckb.this.a(bxf.a);
         if ($$1.f() && !$$0.isEmpty()) {
            ckb.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<coe> $$0 = ckb.this.dV().a(coe.class, ckb.this.cR().c(8.0, 8.0, 8.0), ckb.bU);
         if (!$$0.isEmpty()) {
            ckb.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cfy {
      public q(final int $$0, final int $$1) {
         super(ckb.this, $$1);
      }

      @Override
      public void d() {
         ckb.this.gL();
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
         return !ckb.this.fR() && !ckb.this.x() && !ckb.this.gJ() && ckb.this.f() == null;
      }
   }

   class r extends ckb.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ces.a.a, ces.a.b));
      }

      @Override
      public boolean b() {
         return ckb.this.er() == null
            && ckb.this.dY().i() < 0.02F
            && !ckb.this.fR()
            && ckb.this.f() == null
            && ckb.this.O().k()
            && !this.i()
            && !ckb.this.gv()
            && !ckb.this.ch();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + ckb.this.dY().a(3);
         ckb.this.w(true);
         ckb.this.O().m();
      }

      @Override
      public void e() {
         ckb.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ckb.this.J().a(ckb.this.dA() + this.c, ckb.this.dE(), ckb.this.dG() + this.d, (float)ckb.this.af(), (float)ckb.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ckb.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ckb.this.dY().a(20));
      }
   }

   class s extends cel {
      private int c = b(100);

      public s(final double $$0) {
         super(ckb.this, $$0);
      }

      @Override
      public boolean b() {
         if (!ckb.this.fR() && this.a.f() == null) {
            if (ckb.this.dV().ag() && ckb.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iw $$0 = this.a.dv();
               return ckb.this.dV().V() && ckb.this.dV().h($$0) && !((aru)ckb.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         ckb.this.gL();
         super.d();
      }
   }

   class t extends ckb.d {
      private static final int c = b(140);
      private int d = ckb.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ces.a.a, ces.a.b, ces.a.c));
      }

      @Override
      public boolean b() {
         return ckb.this.bg == 0.0F && ckb.this.bh == 0.0F && ckb.this.bi == 0.0F ? this.k() || ckb.this.fR() : false;
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
            return ckb.this.dV().V() && this.h() && !this.i() && !ckb.this.av;
         }
      }

      @Override
      public void e() {
         this.d = ckb.this.ae.a(c);
         ckb.this.gL();
      }

      @Override
      public void d() {
         ckb.this.w(false);
         ckb.this.y(false);
         ckb.this.z(false);
         ckb.this.s(false);
         ckb.this.C(true);
         ckb.this.O().m();
         ckb.this.L().a(ckb.this.dA(), ckb.this.dC(), ckb.this.dG(), 0.0);
      }
   }

   class u extends ces {
      public u() {
         this.a(EnumSet.of(ces.a.a, ces.a.b));
      }

      @Override
      public boolean b() {
         if (ckb.this.fR()) {
            return false;
         } else {
            bxw $$0 = ckb.this.f();
            return $$0 != null && $$0.bJ() && ckb.bW.test($$0) && ckb.this.g((bwv)$$0) > 36.0 && !ckb.this.ch() && !ckb.this.gy() && !ckb.this.bf;
         }
      }

      @Override
      public void d() {
         ckb.this.w(false);
         ckb.this.A(false);
      }

      @Override
      public void e() {
         bxw $$0 = ckb.this.f();
         if ($$0 != null && ckb.a(ckb.this, $$0)) {
            ckb.this.z(true);
            ckb.this.y(true);
            ckb.this.O().m();
            ckb.this.J().a($$0, (float)ckb.this.af(), (float)ckb.this.ad());
         } else {
            ckb.this.z(false);
            ckb.this.y(false);
         }
      }

      @Override
      public void a() {
         bxw $$0 = ckb.this.f();
         if ($$0 != null) {
            ckb.this.J().a($$0, (float)ckb.this.af(), (float)ckb.this.ad());
            if (ckb.this.g((bwv)$$0) <= 36.0) {
               ckb.this.z(true);
               ckb.this.y(true);
               ckb.this.O().m();
            } else {
               ckb.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bao {
      a(0, "red"),
      b(1, "snow");

      public static final ckb.v c = a;
      public static final bao.a<ckb.v> d = bao.a(ckb.v::values);
      private static final IntFunction<ckb.v> f = ayg.a(ckb.v::a, values(), ayg.a.a);
      public static final za<ByteBuf, ckb.v> e = yy.a(f, ckb.v::a);
      private final int g;
      private final String h;

      private v(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      @Override
      public String c() {
         return this.h;
      }

      public int a() {
         return this.g;
      }

      public static ckb.v a(int $$0) {
         return f.apply($$0);
      }

      public static ckb.v a(jg<dlc> $$0) {
         return $$0.a(axf.at) ? b : a;
      }
   }
}
