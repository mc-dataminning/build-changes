import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgi extends btu implements cmg, dyf {
   private static final Logger e = LogUtils.getLogger();
   private static final kh ca = new kh(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final cyu ce = cyu.a(cur.oD);
   private static final int cf = 6000;
   private static final int cg = 3;
   private static final ajv<Boolean> ch = ajz.a(cgi.class, ajx.k);
   private static final ajv<Boolean> ci = ajz.a(cgi.class, ajx.k);
   protected static final ImmutableList<cdx<? extends cdw<? super cgi>>> b = ImmutableList.of(cdx.c, cdx.d, cdx.f, cdx.b);
   protected static final ImmutableList<ccq<?>> c = ImmutableList.of(
      ccq.t, ccq.n, ccq.h, ccq.m, ccq.E, ccq.x, ccq.L, ccq.aM, ccq.aN, ccq.aO, ccq.aP, ccq.Z, new ccq[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dxt<dyf.b> cj;
   private dyf.a ck;
   private final dyf.d cl;
   private final dxt<cgi.a> cm;
   private final bqz cn = new bqz(1);
   @Nullable
   private jd co;
   private long cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;

   public cgi(bsw<? extends cgi> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new bzk(this, 20, true);
      this.a_(this.fQ());
      this.cl = new cgi.b();
      this.ck = new dyf.a();
      this.cj = new dxt<>(new dyf.b(this));
      this.cm = new dxt<>(new cgi.a(this.cl.b(), dxw.E.a().a()));
   }

   @Override
   protected buo.b<cgi> dV() {
      return buo.a(c, b);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cgj.a(this.dV().a($$0));
   }

   @Override
   public buo<cgi> dU() {
      return (buo<cgi>)super.dU();
   }

   public static but.a s() {
      return btn.A().a(buu.s, 20.0).a(buu.l, 0.1F).a(buu.v, 0.1F).a(buu.c, 2.0).a(buu.m, 48.0);
   }

   @Override
   protected ccy b(dcu $$0) {
      ccw $$1 = new ccw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
   }

   @Override
   public void a(eww $$0) {
      if (this.db()) {
         if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(btq.a, this.dt());
            this.i(this.dt().a(0.8F));
         } else if (this.bt()) {
            this.a(0.02F, $$0);
            this.a(btq.a, this.dt());
            this.i(this.dt().a(0.5));
         } else {
            this.a(this.fk(), $$0);
            this.a(btq.a, this.dt());
            this.i(this.dt().a(0.91F));
         }
      }

      this.s(false);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if ($$0.d() instanceof cmv $$2) {
         Optional<UUID> $$3 = this.dU().c(ccq.aM);
         if ($$3.isPresent() && $$2.cA().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(jd $$0, dta $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
   }

   @Override
   protected avn v() {
      return this.c(bsx.a) ? avo.a : avo.b;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.d;
   }

   @Override
   protected avn n_() {
      return avo.c;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("allayBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("allayActivityUpdate");
      cgj.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B && this.bE() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gm() && this.gr() && this.ai % 20 == 0) {
         this.w(false);
         this.co = null;
      }

      this.gs();
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         this.cr = this.cq;
         if (this.t()) {
            this.cq = ayn.a(this.cq + 1.0F, 0.0F, 5.0F);
         } else {
            this.cq = ayn.a(this.cq - 1.0F, 0.0F, 5.0F);
         }

         if (this.gm()) {
            this.cs++;
            this.cu = this.ct;
            if (this.gn()) {
               this.ct++;
            } else {
               this.ct--;
            }

            this.ct = ayn.a(this.ct, 0.0F, 15.0F);
         } else {
            this.cs = 0.0F;
            this.ct = 0.0F;
            this.cu = 0.0F;
         }
      } else {
         dyf.c.a(this.dQ(), this.ck, this.cl);
         if (this.gj()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fQ() {
      return !this.gq() && this.t();
   }

   public boolean t() {
      return !this.b(bqp.a).e();
   }

   @Override
   public boolean f(cuo $$0) {
      return false;
   }

   private boolean gq() {
      return this.dU().a(ccq.aP, ccr.a);
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      cuo $$3 = this.b(bqp.a);
      if (this.gm() && this.n($$2) && this.gv()) {
         this.gt();
         this.dQ().a(this, (byte)18);
         this.dQ().a($$0, this, avo.E, avp.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqq.a;
      } else if ($$3.e() && !$$2.e()) {
         cuo $$4 = $$2.c(1);
         this.a(bqp.a, $$4);
         this.a($$0, $$2);
         this.dQ().a($$0, this, avo.e, avp.g, 2.0F, 1.0F);
         this.dU().a(ccq.aM, $$0.cA());
         return bqq.a;
      } else if (!$$3.e() && $$1 == bqp.a && $$2.e()) {
         this.a(bsx.a, cuo.l);
         this.dQ().a($$0, this, avo.f, avp.g, 2.0F, 1.0F);
         this.a(bqp.a);

         for (cuo $$5 : this.x().f()) {
            bvh.a(this, $$5, this.do());
         }

         this.dU().b(ccq.aM);
         $$0.i($$3);
         return bqq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jd $$0, boolean $$1) {
      if ($$1) {
         if (!this.gm()) {
            this.co = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.co) || this.co == null) {
         this.co = null;
         this.w(false);
      }
   }

   @Override
   public bqz x() {
      return this.cn;
   }

   @Override
   protected kh V() {
      return ca;
   }

   @Override
   public boolean k(cuo $$0) {
      cuo $$1 = this.b(bqp.a);
      return !$$1.e() && this.dQ().ab().b(dcq.c) && this.cn.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuo $$0, cuo $$1) {
      return cuo.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuo $$0, cuo $$1) {
      cws $$2 = $$0.a(kq.G);
      cws $$3 = $$1.a(kq.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cjf $$0) {
      cmg.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public boolean aW() {
      return !this.aF();
   }

   @Override
   public void a(BiConsumer<dxt<?>, aqt> $$0) {
      if (this.dQ() instanceof aqt $$1) {
         $$0.accept(this.cj, $$1);
         $$0.accept(this.cm, $$1);
      }
   }

   public boolean gm() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      if (!this.dQ().B && this.dc() && (!$$0 || !this.gj())) {
         this.ao.a(ch, $$0);
      }
   }

   private boolean gr() {
      return this.co == null || !this.co.a(this.do(), (double)dxw.E.a().a()) || !this.dQ().a_(this.co).a(dfy.dT);
   }

   public float H(float $$0) {
      return ayn.i($$0, this.cr, this.cq) / 5.0F;
   }

   public boolean gn() {
      float $$0 = this.cs % 55.0F;
      return $$0 < 15.0F;
   }

   public float I(float $$0) {
      return ayn.i($$0, this.cu, this.ct) / 15.0F;
   }

   @Override
   public boolean a(cuo $$0, cuo $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eA() {
      super.eA();
      this.cn.f().forEach(this::b);
      cuo $$0 = this.a(bsx.a);
      if (!$$0.e() && !dac.a($$0, dab.D)) {
         this.b($$0);
         this.a(bsx.a, cuo.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dS());
      dyf.a.a.encodeStart(uo.a, this.ck).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cp);
      $$0.a("CanDuplicate", this.gv());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dS());
      if ($$0.b("listener", 10)) {
         dyf.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ck = $$0x);
      }

      this.cp = (long)$$0.h("DuplicationCooldown");
      this.ao.a(ci, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gk() {
      return false;
   }

   private void gs() {
      if (this.cp > 0L) {
         this.cp--;
      }

      if (!this.dQ().x_() && this.cp == 0L && !this.gv()) {
         this.ao.a(ci, true);
      }
   }

   private boolean n(cuo $$0) {
      return ce.a($$0);
   }

   private void gt() {
      cgi $$0 = bsw.a.a(this.dQ());
      if ($$0 != null) {
         $$0.f(this.do());
         $$0.fP();
         $$0.gu();
         this.gu();
         this.dQ().b($$0);
      }
   }

   private void gu() {
      this.cp = 6000L;
      this.ao.a(ci, false);
   }

   private boolean gv() {
      return this.ao.a(ci);
   }

   private void a(cmv $$0, cuo $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)this.cM() * 0.6, (double)this.dk() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gw();
         }
      } else {
         super.b($$0);
      }
   }

   private void gw() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dQ().a(lm.Q, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dyf.a go() {
      return this.ck;
   }

   @Override
   public dyf.d gp() {
      return this.cl;
   }

   class a implements dxy {
      private final dya b;
      private final int c;

      public a(final dya $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dya a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqt $$0, jm<dxw> $$1, dxw.a $$2, eww $$3) {
         if ($$1.a(dxw.E)) {
            cgi.this.b(jd.a((jw)$$3), true);
            return true;
         } else if ($$1.a(dxw.F)) {
            cgi.this.b(jd.a((jw)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dyf.d {
      private static final int b = 16;
      private final dya c = new dxu(cgi.this, cgi.this.cM());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dya b() {
         return this.c;
      }

      @Override
      public boolean a(aqt $$0, jd $$1, jm<dxw> $$2, dxw.a $$3) {
         if (cgi.this.gb()) {
            return false;
         } else {
            Optional<jl> $$4 = cgi.this.dU().c(ccq.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jl $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqt $$0, jd $$1, jm<dxw> $$2, @Nullable bsq $$3, @Nullable bsq $$4, float $$5) {
         if ($$2.a(dxw.H)) {
            cgj.a(cgi.this, new jd($$1));
         }
      }

      @Override
      public awt<dxw> c() {
         return awk.e;
      }
   }
}
