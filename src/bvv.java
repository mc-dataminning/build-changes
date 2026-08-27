import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvv extends bjp implements cbf, dkc {
   private static final Logger e = LogUtils.getLogger();
   private static final ib bT = new ib(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cmg bX = cmg.a(cji.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final aef<Boolean> ca = aei.a(bvv.class, aeh.k);
   private static final aef<Boolean> cb = aei.a(bvv.class, aeh.k);
   protected static final ImmutableList<btm<? extends btl<? super bvv>>> b = ImmutableList.of(btm.c, btm.d, btm.f, btm.b);
   protected static final ImmutableList<bsh<?>> c = ImmutableList.of(
      bsh.t, bsh.n, bsh.h, bsh.m, bsh.E, bsh.x, bsh.K, bsh.aL, bsh.aM, bsh.aN, bsh.aO, bsh.Y, new bsh[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final djq<dkc.b> cc;
   private dkc.a cd;
   private final dkc.d ce;
   private final djq<bvv.a> cf;
   private final bhf cg = new bhf(1);
   @Nullable
   private gw ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bvv(biu<? extends bvv> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bpb(this, 20, true);
      this.s(this.fJ());
      this.ce = new bvv.b();
      this.cd = new dkc.a();
      this.cc = new djq<>(new dkc.b(this));
      this.cf = new djq<>(new bvv.a(this.ce.b(), djt.E.a()));
   }

   @Override
   protected bkg.b<bvv> dO() {
      return bkg.a(c, b);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bvw.a(this.dO().a($$0));
   }

   @Override
   public bkg<bvv> dN() {
      return (bkg<bvv>)super.dN();
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 20.0).a(bkm.e, 0.1F).a(bkm.d, 0.1F).a(bkm.f, 2.0).a(bkm.b, 48.0);
   }

   @Override
   protected bsp b(cpv $$0) {
      bsn $$1 = new bsn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, false);
      this.an.a(cb, true);
   }

   @Override
   public void h(ehn $$0) {
      if (this.cX()) {
         if (this.aY()) {
            this.a(0.02F, $$0);
            this.a(bjm.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bm()) {
            this.a(0.02F, $$0);
            this.a(bjm.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            this.a(this.fe(), $$0);
            this.a(bjm.a, this.do());
            this.f(this.do().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if ($$0.d() instanceof cbu $$2) {
         Optional<UUID> $$3 = this.dN().c(bsh.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
   }

   @Override
   protected apd w() {
      return this.b(biv.a) ? ape.a : ape.b;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.d;
   }

   @Override
   protected apd l_() {
      return ape.c;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dL().ad().a("allayBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("allayActivityUpdate");
      bvw.a(this);
      this.dL().ad().c();
      super.Y();
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B && this.bw() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.gd() && this.gi() && this.ah % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gj();
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         this.ck = this.cj;
         if (this.t()) {
            this.cj = arx.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = arx.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.gd()) {
            this.cl++;
            this.cn = this.cm;
            if (this.ge()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = arx.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dkc.c.a(this.dL(), this.cd, this.ce);
         if (this.ga()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fJ() {
      return !this.gh() && this.t();
   }

   public boolean t() {
      return !this.b(bgx.a).b();
   }

   @Override
   public boolean f(cjf $$0) {
      return false;
   }

   private boolean gh() {
      return this.dN().a(bsh.aO, bsi.a);
   }

   @Override
   protected bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      cjf $$3 = this.b(bgx.a);
      if (this.gd() && this.l($$2) && this.gm()) {
         this.gk();
         this.dL().a(this, (byte)18);
         this.dL().a($$0, this, ape.E, apf.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bgy.a;
      } else if ($$3.b() && !$$2.b()) {
         cjf $$4 = $$2.c(1);
         this.a(bgx.a, $$4);
         this.a($$0, $$2);
         this.dL().a($$0, this, ape.e, apf.g, 2.0F, 1.0F);
         this.dN().a(bsh.aL, $$0.cw());
         return bgy.a;
      } else if (!$$3.b() && $$1 == bgx.a && $$2.b()) {
         this.a(biv.a, cjf.b);
         this.dL().a($$0, this, ape.f, apf.g, 2.0F, 1.0F);
         this.a(bgx.a);

         for (cjf $$5 : this.y().f()) {
            bkz.a(this, $$5, this.dj());
         }

         this.dN().b(bsh.aL);
         $$0.i($$3);
         return bgy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gw $$0, boolean $$1) {
      if ($$1) {
         if (!this.gd()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bhf y() {
      return this.cg;
   }

   @Override
   protected ib T() {
      return bT;
   }

   @Override
   public boolean k(cjf $$0) {
      cjf $$1 = this.b(bgx.a);
      return !$$1.b() && this.dL().X().b(cpr.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cjf $$0, cjf $$1) {
      return cjf.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cjf $$0, cjf $$1) {
      qx $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qx $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rq $$6 = $$2.c("Potion");
            rq $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(byn $$0) {
      cbf.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   @Override
   public boolean aS() {
      return !this.aB();
   }

   @Override
   public void a(BiConsumer<djq<?>, akr> $$0) {
      if (this.dL() instanceof akr $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean gd() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dL().B && this.cY() && (!$$0 || !this.ga())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gi() {
      return this.ch == null || !this.ch.a(this.dj(), (double)djt.E.a()) || !this.dL().a_(this.ch).a(csw.dT);
   }

   public float E(float $$0) {
      return arx.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean ge() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return arx.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cjf $$0, cjf $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ex() {
      super.ex();
      this.cg.f().forEach(this::b);
      cjf $$0 = this.c(biv.a);
      if (!$$0.b() && !cnq.e($$0)) {
         this.b($$0);
         this.a(biv.a, cjf.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      this.a_($$0);
      dkc.a.a.encodeStart(ri.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gm());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dkc.a.a.parse(new Dynamic(ri.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.an.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gb() {
      return false;
   }

   private void gj() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dL().w_() && this.ci == 0L && !this.gm()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(cjf $$0) {
      return bX.a($$0);
   }

   private void gk() {
      bvv $$0 = biu.b.a(this.dL());
      if ($$0 != null) {
         $$0.d(this.dj());
         $$0.fI();
         $$0.gl();
         this.gl();
         this.dL().b($$0);
      }
   }

   private void gl() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gm() {
      return this.an.b(cb);
   }

   private void a(cbu $$0, cjf $$1) {
      if (!$$0.fS().d) {
         $$1.h(1);
      }
   }

   @Override
   public ehn cJ() {
      return new ehn(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   protected float l(biq $$0) {
      return 0.04F;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gn();
         }
      } else {
         super.b($$0);
      }
   }

   private void gn() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dL().a(ix.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dkc.a gf() {
      return this.cd;
   }

   @Override
   public dkc.d gg() {
      return this.ce;
   }

   class a implements djv {
      private final djx b;
      private final int c;

      public a(djx $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public djx a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(akr $$0, djt $$1, djt.a $$2, ehn $$3) {
         if ($$1 == djt.E) {
            bvv.this.b(gw.a($$3), true);
            return true;
         } else if ($$1 == djt.F) {
            bvv.this.b(gw.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dkc.d {
      private static final int b = 16;
      private final djx c = new djr(bvv.this, bvv.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djx b() {
         return this.c;
      }

      @Override
      public boolean a(akr $$0, gw $$1, djt $$2, djt.a $$3) {
         if (bvv.this.fT()) {
            return false;
         } else {
            Optional<hf> $$4 = bvv.this.dN().c(bsh.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               hf $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(akr $$0, gw $$1, djt $$2, @Nullable biq $$3, @Nullable biq $$4, float $$5) {
         if ($$2 == djt.H) {
            bvw.a(bvv.this, new gw($$1));
         }
      }

      @Override
      public aqi<djt> c() {
         return apz.e;
      }
   }
}
