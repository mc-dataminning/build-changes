import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bym extends bme implements cec, dni {
   private static final Logger e = LogUtils.getLogger();
   private static final iz bT = new iz(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cpi bX = cpi.a(cmk.oz);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final afz<Boolean> ca = agc.a(bym.class, agb.k);
   private static final afz<Boolean> cb = agc.a(bym.class, agb.k);
   protected static final ImmutableList<bwd<? extends bwc<? super bym>>> b = ImmutableList.of(bwd.c, bwd.d, bwd.f, bwd.b);
   protected static final ImmutableList<bux<?>> c = ImmutableList.of(
      bux.t, bux.n, bux.h, bux.m, bux.E, bux.x, bux.K, bux.aL, bux.aM, bux.aN, bux.aO, bux.Y, new bux[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dmw<dni.b> cc;
   private dni.a cd;
   private final dni.d ce;
   private final dmw<bym.a> cf;
   private final bjt cg = new bjt(1);
   @Nullable
   private hv ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bym(blj<? extends bym> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new brr(this, 20, true);
      this.s(this.fK());
      this.ce = new bym.b();
      this.cd = new dni.a();
      this.cc = new dmw<>(new dni.b(this));
      this.cf = new dmw<>(new bym.a(this.ce.b(), dmz.E.a()));
   }

   @Override
   protected bmv.b<bym> dP() {
      return bmv.a(c, b);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return byn.a(this.dP().a($$0));
   }

   @Override
   public bmv<bym> dO() {
      return (bmv<bym>)super.dO();
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 20.0).a(bnb.f, 0.1F).a(bnb.m, 0.1F).a(bnb.c, 2.0).a(bnb.g, 48.0);
   }

   @Override
   protected bvf b(csy $$0) {
      bvd $$1 = new bvd(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, false);
      this.an.a(cb, true);
   }

   @Override
   public void a(elb $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bmb.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bmb.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.ff(), $$0);
            this.a(bmb.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if ($$0.d() instanceof cer $$2) {
         Optional<UUID> $$3 = this.dO().c(bux.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hv $$0, dip $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
   }

   @Override
   protected arb y() {
      return this.b(blk.a) ? arc.a : arc.b;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.d;
   }

   @Override
   protected arb n_() {
      return arc.c;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dM().ae().a("allayBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("allayActivityUpdate");
      byn.a(this);
      this.dM().ae().c();
      super.Z();
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B && this.bx() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.ge() && this.gj() && this.ah % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gk();
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         this.ck = this.cj;
         if (this.w()) {
            this.cj = aty.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = aty.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = aty.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dni.c.a(this.dM(), this.cd, this.ce);
         if (this.gb()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fK() {
      return !this.gi() && this.w();
   }

   public boolean w() {
      return !this.b(bjk.a).b();
   }

   @Override
   public boolean f(cmh $$0) {
      return false;
   }

   private boolean gi() {
      return this.dO().a(bux.aO, buy.a);
   }

   @Override
   protected bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      cmh $$3 = this.b(bjk.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, arc.E, ard.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bjl.a;
      } else if ($$3.b() && !$$2.b()) {
         cmh $$4 = $$2.c(1);
         this.a(bjk.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, arc.e, ard.g, 2.0F, 1.0F);
         this.dO().a(bux.aL, $$0.cw());
         return bjl.a;
      } else if (!$$3.b() && $$1 == bjk.a && $$2.b()) {
         this.a(blk.a, cmh.f);
         this.dM().a($$0, this, arc.f, ard.g, 2.0F, 1.0F);
         this.a(bjk.a);

         for (cmh $$5 : this.A().f()) {
            bno.a(this, $$5, this.dk());
         }

         this.dO().b(bux.aL);
         $$0.i($$3);
         return bjl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(hv $$0, boolean $$1) {
      if ($$1) {
         if (!this.ge()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bjt A() {
      return this.cg;
   }

   @Override
   protected iz V() {
      return bT;
   }

   @Override
   public boolean k(cmh $$0) {
      cmh $$1 = this.b(bjk.a);
      return !$$1.b() && this.dM().Y().b(csu.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cmh $$0, cmh $$1) {
      return cmh.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cmh $$0, cmh $$1) {
      sj $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sj $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tg $$6 = $$2.c("Potion");
            tg $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cbe $$0) {
      cec.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dmw<?>, amp> $$0) {
      if (this.dM() instanceof amp $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean ge() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dM().B && this.cY() && (!$$0 || !this.gb())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gj() {
      return this.ch == null || !this.ch.a(this.dk(), (double)dmz.E.a()) || !this.dM().a_(this.ch).a(cwb.dT);
   }

   public float E(float $$0) {
      return aty.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return aty.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cmh $$0, cmh $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ey() {
      super.ey();
      this.cg.f().forEach(this::b);
      cmh $$0 = this.c(blk.a);
      if (!$$0.b() && !cqu.e($$0)) {
         this.b($$0);
         this.a(blk.a, cmh.f);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      this.a_($$0);
      dni.a.a.encodeStart(sx.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dni.a.a.parse(new Dynamic(sx.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.an.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gc() {
      return false;
   }

   private void gk() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dM().y_() && this.ci == 0L && !this.gn()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(cmh $$0) {
      return bX.a($$0);
   }

   private void gl() {
      bym $$0 = blj.b.a(this.dM());
      if ($$0 != null) {
         $$0.e(this.dk());
         $$0.fJ();
         $$0.gm();
         this.gm();
         this.dM().b($$0);
      }
   }

   private void gm() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gn() {
      return this.an.b(cb);
   }

   private void a(cer $$0, cmh $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   protected float l(blf $$0) {
      return 0.04F;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.go();
         }
      } else {
         super.b($$0);
      }
   }

   private void go() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dM().a(jv.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dni.a gg() {
      return this.cd;
   }

   @Override
   public dni.d gh() {
      return this.ce;
   }

   class a implements dnb {
      private final dnd b;
      private final int c;

      public a(dnd $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dnd a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(amp $$0, dmz $$1, dmz.a $$2, elb $$3) {
         if ($$1 == dmz.E) {
            bym.this.b(hv.a($$3), true);
            return true;
         } else if ($$1 == dmz.F) {
            bym.this.b(hv.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dni.d {
      private static final int b = 16;
      private final dnd c = new dmx(bym.this, bym.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dnd b() {
         return this.c;
      }

      @Override
      public boolean a(amp $$0, hv $$1, dmz $$2, dmz.a $$3) {
         if (bym.this.fU()) {
            return false;
         } else {
            Optional<id> $$4 = bym.this.dO().c(bux.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               id $$5 = $$4.get();
               return $$5.a().equals($$0.ad()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(amp $$0, hv $$1, dmz $$2, @Nullable blf $$3, @Nullable blf $$4, float $$5) {
         if ($$2 == dmz.H) {
            byn.a(bym.this, new hv($$1));
         }
      }

      @Override
      public asg<dmz> c() {
         return arx.e;
      }
   }
}
