import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cev extends bsi implements cks, dvj {
   private static final Logger e = LogUtils.getLogger();
   private static final jr bY = new jr(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cxa cc = cxa.a(ctc.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final ajm<Boolean> cf = ajq.a(cev.class, ajo.k);
   private static final ajm<Boolean> cg = ajq.a(cev.class, ajo.k);
   protected static final ImmutableList<cck<? extends ccj<? super cev>>> b = ImmutableList.of(cck.c, cck.d, cck.f, cck.b);
   protected static final ImmutableList<cbd<?>> c = ImmutableList.of(
      cbd.t, cbd.n, cbd.h, cbd.m, cbd.E, cbd.x, cbd.L, cbd.aM, cbd.aN, cbd.aO, cbd.aP, cbd.Z, new cbd[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dux<dvj.b> ch;
   private dvj.a ci;
   private final dvj.d cj;
   private final dux<cev.a> ck;
   private final bpv cl = new bpv(1);
   @Nullable
   private in cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cev(brn<? extends cev> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new bxx(this, 20, true);
      this.a_(this.fU());
      this.cj = new cev.b();
      this.ci = new dvj.a();
      this.ch = new dux<>(new dvj.b(this));
      this.ck = new dux<>(new cev.a(this.cj.b(), dva.E.a().a()));
   }

   @Override
   protected btb.b<cev> dR() {
      return btb.a(c, b);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cew.a(this.dR().a($$0));
   }

   @Override
   public btb<cev> dQ() {
      return (btb<cev>)super.dQ();
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 20.0).a(bth.j, 0.1F).a(bth.r, 0.1F).a(bth.c, 2.0).a(bth.k, 48.0);
   }

   @Override
   protected cbl b(dad $$0) {
      cbj $$1 = new cbj(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(etp $$0) {
      if (this.cY()) {
         if (this.bc()) {
            this.a(0.02F, $$0);
            this.a(bsf.a, this.dq());
            this.g(this.dq().a(0.8F));
         } else if (this.bq()) {
            this.a(0.02F, $$0);
            this.a(bsf.a, this.dq());
            this.g(this.dq().a(0.5));
         } else {
            this.a(this.fl(), $$0);
            this.a(bsf.a, this.dq());
            this.g(this.dq().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if ($$0.d() instanceof clh $$2) {
         Optional<UUID> $$3 = this.dQ().c(cbd.aM);
         if ($$3.isPresent() && $$2.cx().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(in $$0, dqh $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dqh $$2, in $$3) {
   }

   @Override
   protected avb v() {
      return this.b(bro.a) ? avc.a : avc.b;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.d;
   }

   @Override
   protected avb o_() {
      return avc.c;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dN().af().a("allayBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("allayActivityUpdate");
      cew.a(this);
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
            this.co = axz.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = axz.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gp()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gq()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = axz.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dvj.c.a(this.dN(), this.ci, this.cj);
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
      return !this.b(bpl.a).d();
   }

   @Override
   public boolean f(csz $$0) {
      return false;
   }

   private boolean gt() {
      return this.dQ().a(cbd.aP, cbe.a);
   }

   @Override
   protected bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      csz $$3 = this.b(bpl.a);
      if (this.gp() && this.n($$2) && this.gy()) {
         this.gw();
         this.dN().a(this, (byte)18);
         this.dN().a($$0, this, avc.E, avd.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bpm.a;
      } else if ($$3.d() && !$$2.d()) {
         csz $$4 = $$2.c(1);
         this.a(bpl.a, $$4);
         this.a($$0, $$2);
         this.dN().a($$0, this, avc.e, avd.g, 2.0F, 1.0F);
         this.dQ().a(cbd.aM, $$0.cx());
         return bpm.a;
      } else if (!$$3.d() && $$1 == bpl.a && $$2.d()) {
         this.a(bro.a, csz.i);
         this.dN().a($$0, this, avc.f, avd.g, 2.0F, 1.0F);
         this.a(bpl.a);

         for (csz $$5 : this.y().f()) {
            btu.a(this, $$5, this.dl());
         }

         this.dQ().b(cbd.aM);
         $$0.i($$3);
         return bpm.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(in $$0, boolean $$1) {
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
   public bpv y() {
      return this.cl;
   }

   @Override
   protected jr U() {
      return bY;
   }

   @Override
   public boolean k(csz $$0) {
      csz $$1 = this.b(bpl.a);
      return !$$1.d() && this.dN().aa().b(czz.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(csz $$0, csz $$1) {
      return csz.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(csz $$0, csz $$1) {
      cuy $$2 = $$0.a(ka.E);
      cuy $$3 = $$1.a(ka.E);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(chr $$0) {
      cks.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dux<?>, aqh> $$0) {
      if (this.dN() instanceof aqh $$1) {
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
      return this.cm == null || !this.cm.a(this.dl(), (double)dva.E.a().a()) || !this.dN().a_(this.cm).a(ddg.dT);
   }

   public float G(float $$0) {
      return axz.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gq() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return axz.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(csz $$0, csz $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eB() {
      super.eB();
      this.cl.f().forEach(this::b);
      csz $$0 = this.d(bro.a);
      if (!$$0.d() && !cyh.g($$0)) {
         this.b($$0);
         this.a(bro.a, csz.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dP());
      dvj.a.a.encodeStart(uo.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gy());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dP());
      if ($$0.b("listener", 10)) {
         dvj.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
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

   private boolean n(csz $$0) {
      return cc.a($$0);
   }

   private void gw() {
      cev $$0 = brn.a.a(this.dN());
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

   private void a(clh $$0, csz $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)this.cJ() * 0.6, (double)this.dh() * 0.1);
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
      this.dN().a(kx.O, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dvj.a gr() {
      return this.ci;
   }

   @Override
   public dvj.d gs() {
      return this.cj;
   }

   class a implements dvc {
      private final dve b;
      private final int c;

      public a(dve $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dve a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqh $$0, iw<dva> $$1, dva.a $$2, etp $$3) {
         if ($$1.a(dva.E)) {
            cev.this.b(in.a($$3), true);
            return true;
         } else if ($$1.a(dva.F)) {
            cev.this.b(in.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dvj.d {
      private static final int b = 16;
      private final dve c = new duy(cev.this, cev.this.cJ());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dve b() {
         return this.c;
      }

      @Override
      public boolean a(aqh $$0, in $$1, iw<dva> $$2, dva.a $$3) {
         if (cev.this.gf()) {
            return false;
         } else {
            Optional<iv> $$4 = cev.this.dQ().c(cbd.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               iv $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqh $$0, in $$1, iw<dva> $$2, @Nullable brh $$3, @Nullable brh $$4, float $$5) {
         if ($$2.a(dva.H)) {
            cew.a(cev.this, new in($$1));
         }
      }

      @Override
      public awg<dva> c() {
         return avx.e;
      }
   }
}
