import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvx extends bjr implements cbh, dke {
   private static final Logger e = LogUtils.getLogger();
   private static final ib bT = new ib(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cmi bX = cmi.a(cjk.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final aeg<Boolean> ca = aej.a(bvx.class, aei.k);
   private static final aeg<Boolean> cb = aej.a(bvx.class, aei.k);
   protected static final ImmutableList<bto<? extends btn<? super bvx>>> b = ImmutableList.of(bto.c, bto.d, bto.f, bto.b);
   protected static final ImmutableList<bsj<?>> c = ImmutableList.of(
      bsj.t, bsj.n, bsj.h, bsj.m, bsj.E, bsj.x, bsj.K, bsj.aL, bsj.aM, bsj.aN, bsj.aO, bsj.Y, new bsj[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final djs<dke.b> cc;
   private dke.a cd;
   private final dke.d ce;
   private final djs<bvx.a> cf;
   private final bhh cg = new bhh(1);
   @Nullable
   private gw ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bvx(biw<? extends bvx> $$0, cpx $$1) {
      super($$0, $$1);
      this.bL = new bpd(this, 20, true);
      this.s(this.fJ());
      this.ce = new bvx.b();
      this.cd = new dke.a();
      this.cc = new djs<>(new dke.b(this));
      this.cf = new djs<>(new bvx.a(this.ce.b(), djv.E.a()));
   }

   @Override
   protected bki.b<bvx> dO() {
      return bki.a(c, b);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return bvy.a(this.dO().a($$0));
   }

   @Override
   public bki<bvx> dN() {
      return (bki<bvx>)super.dN();
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 20.0).a(bko.e, 0.1F).a(bko.d, 0.1F).a(bko.f, 2.0).a(bko.b, 48.0);
   }

   @Override
   protected bsr b(cpx $$0) {
      bsp $$1 = new bsp(this, $$0);
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
   public void h(ehp $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bjo.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bjo.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            this.a(this.fe(), $$0);
            this.a(bjo.a, this.do());
            this.f(this.do().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if ($$0.d() instanceof cbw $$2) {
         Optional<UUID> $$3 = this.dN().c(bsj.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dfl $$2, gw $$3) {
   }

   @Override
   protected ape w() {
      return this.b(bix.a) ? apf.a : apf.b;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.d;
   }

   @Override
   protected ape l_() {
      return apf.c;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   protected void X() {
      this.dL().ad().a("allayBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("allayActivityUpdate");
      bvy.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B && this.bv() && this.ah % 10 == 0) {
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
            this.cj = ary.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = ary.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.gd()) {
            this.cl++;
            this.cn = this.cm;
            if (this.ge()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = ary.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dke.c.a(this.dL(), this.cd, this.ce);
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
      return !this.b(bgz.a).b();
   }

   @Override
   public boolean f(cjh $$0) {
      return false;
   }

   private boolean gh() {
      return this.dN().a(bsj.aO, bsk.a);
   }

   @Override
   protected bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      cjh $$3 = this.b(bgz.a);
      if (this.gd() && this.l($$2) && this.gm()) {
         this.gk();
         this.dL().a(this, (byte)18);
         this.dL().a($$0, this, apf.E, apg.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bha.a;
      } else if ($$3.b() && !$$2.b()) {
         cjh $$4 = $$2.c(1);
         this.a(bgz.a, $$4);
         this.a($$0, $$2);
         this.dL().a($$0, this, apf.e, apg.g, 2.0F, 1.0F);
         this.dN().a(bsj.aL, $$0.cv());
         return bha.a;
      } else if (!$$3.b() && $$1 == bgz.a && $$2.b()) {
         this.a(bix.a, cjh.b);
         this.dL().a($$0, this, apf.f, apg.g, 2.0F, 1.0F);
         this.a(bgz.a);

         for (cjh $$5 : this.y().f()) {
            blb.a(this, $$5, this.dj());
         }

         this.dN().b(bsj.aL);
         $$0.i($$3);
         return bha.a;
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
   public bhh y() {
      return this.cg;
   }

   @Override
   protected ib T() {
      return bT;
   }

   @Override
   public boolean k(cjh $$0) {
      cjh $$1 = this.b(bgz.a);
      return !$$1.b() && this.dL().X().b(cpt.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cjh $$0, cjh $$1) {
      return cjh.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cjh $$0, cjh $$1) {
      qy $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qy $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rs $$6 = $$2.c("Potion");
            rs $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(byp $$0) {
      cbh.a(this, this, $$0);
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<djs<?>, aks> $$0) {
      if (this.dL() instanceof aks $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean gd() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dL().B && this.cX() && (!$$0 || !this.ga())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gi() {
      return this.ch == null || !this.ch.a(this.dj(), (double)djv.E.a()) || !this.dL().a_(this.ch).a(csy.dT);
   }

   public float E(float $$0) {
      return ary.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean ge() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return ary.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cjh $$0, cjh $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ex() {
      super.ex();
      this.cg.f().forEach(this::b);
      cjh $$0 = this.c(bix.a);
      if (!$$0.b() && !cns.e($$0)) {
         this.b($$0);
         this.a(bix.a, cjh.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      this.a_($$0);
      dke.a.a.encodeStart(rk.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gm());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dke.a.a.parse(new Dynamic(rk.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

   private boolean l(cjh $$0) {
      return bX.a($$0);
   }

   private void gk() {
      bvx $$0 = biw.b.a(this.dL());
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

   private void a(cbw $$0, cjh $$1) {
      if (!$$0.fS().d) {
         $$1.h(1);
      }
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(bis $$0) {
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
   public dke.a gf() {
      return this.cd;
   }

   @Override
   public dke.d gg() {
      return this.ce;
   }

   class a implements djx {
      private final djz b;
      private final int c;

      public a(djz $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public djz a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aks $$0, djv $$1, djv.a $$2, ehp $$3) {
         if ($$1 == djv.E) {
            bvx.this.b(gw.a($$3), true);
            return true;
         } else if ($$1 == djv.F) {
            bvx.this.b(gw.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dke.d {
      private static final int b = 16;
      private final djz c = new djt(bvx.this, bvx.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djz b() {
         return this.c;
      }

      @Override
      public boolean a(aks $$0, gw $$1, djv $$2, djv.a $$3) {
         if (bvx.this.fT()) {
            return false;
         } else {
            Optional<hf> $$4 = bvx.this.dN().c(bsj.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               hf $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aks $$0, gw $$1, djv $$2, @Nullable bis $$3, @Nullable bis $$4, float $$5) {
         if ($$2 == djv.H) {
            bvy.a(bvx.this, new gw($$1));
         }
      }

      @Override
      public aqj<djv> c() {
         return aqa.e;
      }
   }
}
