import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdz extends brm implements cjw, dva {
   private static final Logger e = LogUtils.getLogger();
   private static final jq bY = new jq(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cwd cc = cwd.a(csg.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final ajk<Boolean> cf = ajo.a(cdz.class, ajm.k);
   private static final ajk<Boolean> cg = ajo.a(cdz.class, ajm.k);
   protected static final ImmutableList<cbo<? extends cbn<? super cdz>>> b = ImmutableList.of(cbo.c, cbo.d, cbo.f, cbo.b);
   protected static final ImmutableList<cah<?>> c = ImmutableList.of(
      cah.t, cah.n, cah.h, cah.m, cah.E, cah.x, cah.L, cah.aM, cah.aN, cah.aO, cah.aP, cah.Z, new cah[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final duo<dva.b> ch;
   private dva.a ci;
   private final dva.d cj;
   private final duo<cdz.a> ck;
   private final boz cl = new boz(1);
   @Nullable
   private im cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cdz(bqr<? extends cdz> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new bxb(this, 20, true);
      this.a_(this.fU());
      this.cj = new cdz.b();
      this.ci = new dva.a();
      this.ch = new duo<>(new dva.b(this));
      this.ck = new duo<>(new cdz.a(this.cj.b(), dur.E.a().a()));
   }

   @Override
   protected bsf.b<cdz> dR() {
      return bsf.a(c, b);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cea.a(this.dR().a($$0));
   }

   @Override
   public bsf<cdz> dQ() {
      return (bsf<cdz>)super.dQ();
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 20.0).a(bsl.j, 0.1F).a(bsl.r, 0.1F).a(bsl.c, 2.0).a(bsl.k, 48.0);
   }

   @Override
   protected cap b(czu $$0) {
      can $$1 = new can(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(etf $$0) {
      if (this.cY()) {
         if (this.bc()) {
            this.a(0.02F, $$0);
            this.a(brj.a, this.dq());
            this.g(this.dq().a(0.8F));
         } else if (this.bq()) {
            this.a(0.02F, $$0);
            this.a(brj.a, this.dq());
            this.g(this.dq().a(0.5));
         } else {
            this.a(this.fl(), $$0);
            this.a(brj.a, this.dq());
            this.g(this.dq().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if ($$0.d() instanceof ckl $$2) {
         Optional<UUID> $$3 = this.dQ().c(cah.aM);
         if ($$3.isPresent() && $$2.cx().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(im $$0, dpy $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
   }

   @Override
   protected auy v() {
      return this.b(bqs.a) ? auz.a : auz.b;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.d;
   }

   @Override
   protected auy o_() {
      return auz.c;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dN().af().a("allayBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("allayActivityUpdate");
      cea.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B && this.bB() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gp() && this.gu() && this.ai % 20 == 0) {
         this.w(false);
         this.cm = null;
      }

      this.gv();
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         this.cp = this.co;
         if (this.u()) {
            this.co = axw.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = axw.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gp()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gq()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = axw.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dva.c.a(this.dN(), this.ci, this.cj);
         if (this.gm()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fU() {
      return !this.gt() && this.u();
   }

   public boolean u() {
      return !this.b(bop.a).d();
   }

   @Override
   public boolean f(csd $$0) {
      return false;
   }

   private boolean gt() {
      return this.dQ().a(cah.aP, cai.a);
   }

   @Override
   protected boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      csd $$3 = this.b(bop.a);
      if (this.gp() && this.n($$2) && this.gy()) {
         this.gw();
         this.dN().a(this, (byte)18);
         this.dN().a($$0, this, auz.E, ava.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return boq.a;
      } else if ($$3.d() && !$$2.d()) {
         csd $$4 = $$2.c(1);
         this.a(bop.a, $$4);
         this.a($$0, $$2);
         this.dN().a($$0, this, auz.e, ava.g, 2.0F, 1.0F);
         this.dQ().a(cah.aM, $$0.cx());
         return boq.a;
      } else if (!$$3.d() && $$1 == bop.a && $$2.d()) {
         this.a(bqs.a, csd.i);
         this.dN().a($$0, this, auz.f, ava.g, 2.0F, 1.0F);
         this.a(bop.a);

         for (csd $$5 : this.y().f()) {
            bsy.a(this, $$5, this.dl());
         }

         this.dQ().b(cah.aM);
         $$0.i($$3);
         return boq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(im $$0, boolean $$1) {
      if ($$1) {
         if (!this.gp()) {
            this.cm = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.w(false);
      }
   }

   @Override
   public boz y() {
      return this.cl;
   }

   @Override
   protected jq U() {
      return bY;
   }

   @Override
   public boolean k(csd $$0) {
      csd $$1 = this.b(bop.a);
      return !$$1.d() && this.dN().aa().b(czq.c) && this.cl.b($$0) && this.d($$1, $$0);
   }

   private boolean d(csd $$0, csd $$1) {
      return csd.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(csd $$0, csd $$1) {
      cuc $$2 = $$0.a(jz.x);
      cuc $$3 = $$1.a(jz.x);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cgv $$0) {
      cjw.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<duo<?>, aqe> $$0) {
      if (this.dN() instanceof aqe $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gp() {
      return this.ao.a(cf);
   }

   public void w(boolean $$0) {
      if (!this.dN().B && this.cZ() && (!$$0 || !this.gm())) {
         this.ao.a(cf, $$0);
      }
   }

   private boolean gu() {
      return this.cm == null || !this.cm.a(this.dl(), (double)dur.E.a().a()) || !this.dN().a_(this.cm).a(dcx.dT);
   }

   public float G(float $$0) {
      return axw.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gq() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return axw.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(csd $$0, csd $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eB() {
      super.eB();
      this.cl.f().forEach(this::b);
      csd $$0 = this.d(bqs.a);
      if (!$$0.d() && !cxo.g($$0)) {
         this.b($$0);
         this.a(bqs.a, csd.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      this.b($$0, this.dP());
      dva.a.a.encodeStart(um.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gy());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a($$0, this.dP());
      if ($$0.b("listener", 10)) {
         dva.a.a.parse(new Dynamic(um.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.ao.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gn() {
      return false;
   }

   private void gv() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dN().x_() && this.cn == 0L && !this.gy()) {
         this.ao.a(cg, true);
      }
   }

   private boolean n(csd $$0) {
      return cc.a($$0);
   }

   private void gw() {
      cdz $$0 = bqr.a.a(this.dN());
      if ($$0 != null) {
         $$0.e(this.dl());
         $$0.fT();
         $$0.gx();
         this.gx();
         this.dN().b($$0);
      }
   }

   private void gx() {
      this.cn = 6000L;
      this.ao.a(cg, false);
   }

   private boolean gy() {
      return this.ao.a(cg);
   }

   private void a(ckl $$0, csd $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)this.cJ() * 0.6, (double)this.dh() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gz();
         }
      } else {
         super.b($$0);
      }
   }

   private void gz() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dN().a(kw.O, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dva.a gr() {
      return this.ci;
   }

   @Override
   public dva.d gs() {
      return this.cj;
   }

   class a implements dut {
      private final duv b;
      private final int c;

      public a(duv $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public duv a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqe $$0, iv<dur> $$1, dur.a $$2, etf $$3) {
         if ($$1.a(dur.E)) {
            cdz.this.b(im.a($$3), true);
            return true;
         } else if ($$1.a(dur.F)) {
            cdz.this.b(im.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dva.d {
      private static final int b = 16;
      private final duv c = new dup(cdz.this, cdz.this.cJ());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public duv b() {
         return this.c;
      }

      @Override
      public boolean a(aqe $$0, im $$1, iv<dur> $$2, dur.a $$3) {
         if (cdz.this.gf()) {
            return false;
         } else {
            Optional<iu> $$4 = cdz.this.dQ().c(cah.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               iu $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqe $$0, im $$1, iv<dur> $$2, @Nullable bql $$3, @Nullable bql $$4, float $$5) {
         if ($$2.a(dur.H)) {
            cea.a(cdz.this, new im($$1));
         }
      }

      @Override
      public awd<dur> c() {
         return avu.e;
      }
   }
}
