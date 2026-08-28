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
   private static final kh cc = new kh(1, 1, 1);
   private static final int cd = 5;
   private static final float ce = 55.0F;
   private static final float cf = 15.0F;
   private static final cyw cg = cyw.a(cut.oD);
   private static final int ch = 6000;
   private static final int ci = 3;
   private static final ajw<Boolean> cj = aka.a(cgk.class, ajy.k);
   private static final ajw<Boolean> ck = aka.a(cgk.class, ajy.k);
   protected static final ImmutableList<cdz<? extends cdy<? super cgk>>> b = ImmutableList.of(cdz.c, cdz.d, cdz.f, cdz.b);
   protected static final ImmutableList<ccs<?>> c = ImmutableList.of(
      ccs.t, ccs.n, ccs.h, ccs.m, ccs.E, ccs.x, ccs.L, ccs.aM, ccs.aN, ccs.aO, ccs.aP, ccs.Z, new ccs[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dxw<dyi.b> cl;
   private dyi.a cm;
   private final dyi.d cn;
   private final dxw<cgk.a> co;
   private final bra cp = new bra(1);
   @Nullable
   private jd cq;
   private long cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;

   public cgk(bsx<? extends cgk> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new bzm(this, 20, true);
      this.a_(this.fS());
      this.cn = new cgk.b();
      this.cm = new dyi.a();
      this.cl = new dxw<>(new dyi.b(this));
      this.co = new dxw<>(new cgk.a(this.cn.b(), dxz.E.a().a()));
   }

   @Override
   protected buq.b<cgk> dU() {
      return buq.a(c, b);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgl.a(this.dU().a($$0));
   }

   @Override
   public buq<cgk> dT() {
      return (buq<cgk>)super.dT();
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
      $$0.a(cj, false);
      $$0.a(ck, true);
   }

   @Override
   public void a(exc $$0) {
      if (this.da()) {
         if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.dr());
            this.i(this.dr().a(0.8F));
         } else if (this.bt()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.dr());
            this.i(this.dr().a(0.5));
         } else {
            this.a(this.fj(), $$0);
            this.a(bts.a, this.dr());
            this.i(this.dr().a(0.91F));
         }
      }

      this.s(false);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if ($$0.d() instanceof cmx $$2) {
         Optional<UUID> $$3 = this.dT().c(ccs.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
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
   protected float fa() {
      return 0.4F;
   }

   @Override
   protected void ab() {
      this.dO().ag().a("allayBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.dO().ag().a("allayActivityUpdate");
      cgl.a(this);
      this.dO().ag().c();
      super.ab();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dO().B && this.bE() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gk() && this.gp() && this.ai % 20 == 0) {
         this.x(false);
         this.cq = null;
      }

      this.gq();
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().B) {
         this.ct = this.cs;
         if (this.t()) {
            this.cs = ayo.a(this.cs + 1.0F, 0.0F, 5.0F);
         } else {
            this.cs = ayo.a(this.cs - 1.0F, 0.0F, 5.0F);
         }

         if (this.gk()) {
            this.cu++;
            this.cw = this.cv;
            if (this.gl()) {
               this.cv++;
            } else {
               this.cv--;
            }

            this.cv = ayo.a(this.cv, 0.0F, 15.0F);
         } else {
            this.cu = 0.0F;
            this.cv = 0.0F;
            this.cw = 0.0F;
         }
      } else {
         dyi.c.a(this.dO(), this.cm, this.cn);
         if (this.gh()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fS() {
      return !this.go() && this.t();
   }

   public boolean t() {
      return !this.b(bqq.a).e();
   }

   @Override
   public boolean f(cuq $$0) {
      return false;
   }

   private boolean go() {
      return this.dT().a(ccs.aP, cct.a);
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      cuq $$3 = this.b(bqq.a);
      if (this.gk() && this.n($$2) && this.gt()) {
         this.gr();
         this.dO().a(this, (byte)18);
         this.dO().a($$0, this, avp.E, avq.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqr.a;
      } else if ($$3.e() && !$$2.e()) {
         cuq $$4 = $$2.c(1);
         this.a(bqq.a, $$4);
         this.a($$0, $$2);
         this.dO().a($$0, this, avp.e, avq.g, 2.0F, 1.0F);
         this.dT().a(ccs.aM, $$0.cz());
         return bqr.a;
      } else if (!$$3.e() && $$1 == bqq.a && $$2.e()) {
         this.a(bsy.a, cuq.l);
         this.dO().a($$0, this, avp.f, avq.g, 2.0F, 1.0F);
         this.a(bqq.a);

         for (cuq $$5 : this.x().f()) {
            bvj.a(this, $$5, this.dm());
         }

         this.dT().b(ccs.aM);
         $$0.i($$3);
         return bqr.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jd $$0, boolean $$1) {
      if ($$1) {
         if (!this.gk()) {
            this.cq = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cq) || this.cq == null) {
         this.cq = null;
         this.x(false);
      }
   }

   @Override
   public bra x() {
      return this.cp;
   }

   @Override
   protected kh X() {
      return cc;
   }

   @Override
   public boolean k(cuq $$0) {
      cuq $$1 = this.b(bqq.a);
      return !$$1.e() && this.dO().ab().b(dcs.c) && this.cp.c($$0) && this.d($$1, $$0);
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
      if (this.dO() instanceof aqu $$1) {
         $$0.accept(this.cl, $$1);
         $$0.accept(this.co, $$1);
      }
   }

   public boolean gk() {
      return this.ao.a(cj);
   }

   public void x(boolean $$0) {
      if (!this.dO().B && this.db() && (!$$0 || !this.gh())) {
         this.ao.a(cj, $$0);
      }
   }

   private boolean gp() {
      return this.cq == null || !this.cq.a(this.dm(), (double)dxz.E.a().a()) || !this.dO().a_(this.cq).a(dga.dT);
   }

   public float H(float $$0) {
      return ayo.i($$0, this.ct, this.cs) / 5.0F;
   }

   public boolean gl() {
      float $$0 = this.cu % 55.0F;
      return $$0 < 15.0F;
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cw, this.cv) / 15.0F;
   }

   @Override
   public boolean a(cuq $$0, cuq $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ez() {
      super.ez();
      this.cp.f().forEach(this::b);
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
      this.b($$0, this.dQ());
      akp<uy> $$1 = this.dQ().a(up.a);
      dyi.a.a
         .encodeStart($$1, this.cm)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cr);
      $$0.a("CanDuplicate", this.gt());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a($$0, this.dQ());
      akp<uy> $$1 = this.dQ().a(up.a);
      if ($$0.b("listener", 10)) {
         dyi.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.cm = $$0x);
      }

      this.cr = (long)$$0.h("DuplicationCooldown");
      this.ao.a(ck, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gi() {
      return false;
   }

   private void gq() {
      if (this.cr > 0L) {
         this.cr--;
      }

      if (!this.dO().x_() && this.cr == 0L && !this.gt()) {
         this.ao.a(ck, true);
      }
   }

   private boolean n(cuq $$0) {
      return cg.a($$0);
   }

   private void gr() {
      cgk $$0 = bsx.a.a(this.dO());
      if ($$0 != null) {
         $$0.f(this.dm());
         $$0.fR();
         $$0.gs();
         this.gs();
         this.dO().b($$0);
      }
   }

   private void gs() {
      this.cr = 6000L;
      this.ao.a(ck, false);
   }

   private boolean gt() {
      return this.ao.a(ck);
   }

   private void a(cmx $$0, cuq $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gu();
         }
      } else {
         super.b($$0);
      }
   }

   private void gu() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dO().a(lm.Q, this.d(1.0), this.dw() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dyi.a gm() {
      return this.cm;
   }

   @Override
   public dyi.d gn() {
      return this.cn;
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
      public boolean a(aqu $$0, jm<dxz> $$1, dxz.a $$2, exc $$3) {
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
      private final dyd c = new dxx(cgk.this, cgk.this.cL());

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
         if (cgk.this.fZ()) {
            return false;
         } else {
            Optional<jl> $$4 = cgk.this.dT().c(ccs.aN);
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
