import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgk extends btw implements cmi, dyi {
   private static final Logger e = LogUtils.getLogger();
   private static final kh ca = new kh(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final cyw ce = cyw.a(cut.oD);
   private static final int cf = 6000;
   private static final int cg = 3;
   private static final ajw<Boolean> ch = aka.a(cgk.class, ajy.k);
   private static final ajw<Boolean> ci = aka.a(cgk.class, ajy.k);
   protected static final ImmutableList<cdz<? extends cdy<? super cgk>>> b = ImmutableList.of(cdz.c, cdz.d, cdz.f, cdz.b);
   protected static final ImmutableList<ccs<?>> c = ImmutableList.of(
      ccs.t, ccs.n, ccs.h, ccs.m, ccs.E, ccs.x, ccs.L, ccs.aM, ccs.aN, ccs.aO, ccs.aP, ccs.Z, new ccs[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dxw<dyi.b> cj;
   private dyi.a ck;
   private final dyi.d cl;
   private final dxw<cgk.a> cm;
   private final bra cn = new bra(1);
   @Nullable
   private jd co;
   private long cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;

   public cgk(bsx<? extends cgk> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new bzm(this, 20, true);
      this.a_(this.fT());
      this.cl = new cgk.b();
      this.ck = new dyi.a();
      this.cj = new dxw<>(new dyi.b(this));
      this.cm = new dxw<>(new cgk.a(this.cl.b(), dxz.E.a().a()));
   }

   @Override
   protected buq.b<cgk> dV() {
      return buq.a(c, b);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgl.a(this.dV().a($$0));
   }

   @Override
   public buq<cgk> dU() {
      return (buq<cgk>)super.dU();
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 20.0).a(buw.l, 0.1F).a(buw.v, 0.1F).a(buw.c, 2.0).a(buw.m, 48.0);
   }

   @Override
   protected cda b(dcw $$0) {
      ccy $$1 = new ccy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
   }

   @Override
   public void a(exa $$0) {
      if (this.db()) {
         if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.ds());
            this.i(this.ds().a(0.8F));
         } else if (this.bt()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.ds());
            this.i(this.ds().a(0.5));
         } else {
            this.a(this.fk(), $$0);
            this.a(bts.a, this.ds());
            this.i(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if ($$0.d() instanceof cmx $$2) {
         Optional<UUID> $$3 = this.dU().c(ccs.aM);
         if ($$3.isPresent() && $$2.cA().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
   }

   @Override
   protected avo v() {
      return this.c(bsy.a) ? avp.a : avp.b;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.d;
   }

   @Override
   protected avo n_() {
      return avp.c;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected void ab() {
      this.dP().ag().a("allayBrain");
      this.dU().a((aqu)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("allayActivityUpdate");
      cgl.a(this);
      this.dP().ag().c();
      super.ab();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dP().B && this.bE() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gl() && this.gq() && this.ai % 20 == 0) {
         this.w(false);
         this.co = null;
      }

      this.gr();
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.cr = this.cq;
         if (this.t()) {
            this.cq = ayo.a(this.cq + 1.0F, 0.0F, 5.0F);
         } else {
            this.cq = ayo.a(this.cq - 1.0F, 0.0F, 5.0F);
         }

         if (this.gl()) {
            this.cs++;
            this.cu = this.ct;
            if (this.gm()) {
               this.ct++;
            } else {
               this.ct--;
            }

            this.ct = ayo.a(this.ct, 0.0F, 15.0F);
         } else {
            this.cs = 0.0F;
            this.ct = 0.0F;
            this.cu = 0.0F;
         }
      } else {
         dyi.c.a(this.dP(), this.ck, this.cl);
         if (this.gi()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fT() {
      return !this.gp() && this.t();
   }

   public boolean t() {
      return !this.b(bqq.a).e();
   }

   @Override
   public boolean f(cuq $$0) {
      return false;
   }

   private boolean gp() {
      return this.dU().a(ccs.aP, cct.a);
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      cuq $$3 = this.b(bqq.a);
      if (this.gl() && this.n($$2) && this.gu()) {
         this.gs();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avp.E, avq.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqr.a;
      } else if ($$3.e() && !$$2.e()) {
         cuq $$4 = $$2.c(1);
         this.a(bqq.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avp.e, avq.g, 2.0F, 1.0F);
         this.dU().a(ccs.aM, $$0.cA());
         return bqr.a;
      } else if (!$$3.e() && $$1 == bqq.a && $$2.e()) {
         this.a(bsy.a, cuq.l);
         this.dP().a($$0, this, avp.f, avq.g, 2.0F, 1.0F);
         this.a(bqq.a);

         for (cuq $$5 : this.x().f()) {
            bvj.a(this, $$5, this.dn());
         }

         this.dU().b(ccs.aM);
         $$0.i($$3);
         return bqr.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jd $$0, boolean $$1) {
      if ($$1) {
         if (!this.gl()) {
            this.co = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.co) || this.co == null) {
         this.co = null;
         this.w(false);
      }
   }

   @Override
   public bra x() {
      return this.cn;
   }

   @Override
   protected kh X() {
      return ca;
   }

   @Override
   public boolean k(cuq $$0) {
      cuq $$1 = this.b(bqq.a);
      return !$$1.e() && this.dP().ab().b(dcs.c) && this.cn.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuq $$0, cuq $$1) {
      return cuq.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuq $$0, cuq $$1) {
      cwu $$2 = $$0.a(kq.G);
      cwu $$3 = $$1.a(kq.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cjh $$0) {
      cmi.a(this, this, $$0);
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public boolean aW() {
      return !this.aF();
   }

   @Override
   public void a(BiConsumer<dxw<?>, aqu> $$0) {
      if (this.dP() instanceof aqu $$1) {
         $$0.accept(this.cj, $$1);
         $$0.accept(this.cm, $$1);
      }
   }

   public boolean gl() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      if (!this.dP().B && this.dc() && (!$$0 || !this.gi())) {
         this.ao.a(ch, $$0);
      }
   }

   private boolean gq() {
      return this.co == null || !this.co.a(this.dn(), (double)dxz.E.a().a()) || !this.dP().a_(this.co).a(dga.dT);
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cr, this.cq) / 5.0F;
   }

   public boolean gm() {
      float $$0 = this.cs % 55.0F;
      return $$0 < 15.0F;
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cu, this.ct) / 15.0F;
   }

   @Override
   public boolean a(cuq $$0, cuq $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eA() {
      super.eA();
      this.cn.f().forEach(this::b);
      cuq $$0 = this.a(bsy.a);
      if (!$$0.e() && !dae.a($$0, dad.D)) {
         this.b($$0);
         this.a(bsy.a, cuq.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      akp<uy> $$1 = this.dR().a(up.a);
      dyi.a.a
         .encodeStart($$1, this.ck)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cp);
      $$0.a("CanDuplicate", this.gu());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      akp<uy> $$1 = this.dR().a(up.a);
      if ($$0.b("listener", 10)) {
         dyi.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ck = $$0x);
      }

      this.cp = (long)$$0.h("DuplicationCooldown");
      this.ao.a(ci, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gj() {
      return false;
   }

   private void gr() {
      if (this.cp > 0L) {
         this.cp--;
      }

      if (!this.dP().x_() && this.cp == 0L && !this.gu()) {
         this.ao.a(ci, true);
      }
   }

   private boolean n(cuq $$0) {
      return ce.a($$0);
   }

   private void gs() {
      cgk $$0 = bsx.a.a(this.dP());
      if ($$0 != null) {
         $$0.f(this.dn());
         $$0.fS();
         $$0.gt();
         this.gt();
         this.dP().b($$0);
      }
   }

   private void gt() {
      this.cp = 6000L;
      this.ao.a(ci, false);
   }

   private boolean gu() {
      return this.ao.a(ci);
   }

   private void a(cmx $$0, cuq $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public exa cN() {
      return new exa(0.0, (double)this.cM() * 0.6, (double)this.dk() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gv();
         }
      } else {
         super.b($$0);
      }
   }

   private void gv() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dP().a(lm.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dyi.a gn() {
      return this.ck;
   }

   @Override
   public dyi.d go() {
      return this.cl;
   }

   class a implements dyb {
      private final dyd b;
      private final int c;

      public a(final dyd $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dyd a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqu $$0, jm<dxz> $$1, dxz.a $$2, exa $$3) {
         if ($$1.a(dxz.E)) {
            cgk.this.b(jd.a((jw)$$3), true);
            return true;
         } else if ($$1.a(dxz.F)) {
            cgk.this.b(jd.a((jw)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dyi.d {
      private static final int b = 16;
      private final dyd c = new dxx(cgk.this, cgk.this.cM());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dyd b() {
         return this.c;
      }

      @Override
      public boolean a(aqu $$0, jd $$1, jm<dxz> $$2, dxz.a $$3) {
         if (cgk.this.ga()) {
            return false;
         } else {
            Optional<jl> $$4 = cgk.this.dU().c(ccs.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jl $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqu $$0, jd $$1, jm<dxz> $$2, @Nullable bsr $$3, @Nullable bsr $$4, float $$5) {
         if ($$2.a(dxz.H)) {
            cgl.a(cgk.this, new jd($$1));
         }
      }

      @Override
      public awu<dxz> c() {
         return awl.e;
      }
   }
}
