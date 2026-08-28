import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgm extends btz implements cmj, dxf {
   private static final Logger e = LogUtils.getLogger();
   private static final kd bY = new kd(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cyt cc = cyt.a(cut.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akk<Boolean> cf = ako.a(cgm.class, akm.k);
   private static final akk<Boolean> cg = ako.a(cgm.class, akm.k);
   protected static final ImmutableList<ceb<? extends cea<? super cgm>>> b = ImmutableList.of(ceb.c, ceb.d, ceb.f, ceb.b);
   protected static final ImmutableList<ccu<?>> c = ImmutableList.of(
      ccu.t, ccu.n, ccu.h, ccu.m, ccu.E, ccu.x, ccu.L, ccu.aM, ccu.aN, ccu.aO, ccu.aP, ccu.Z, new ccu[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dwt<dxf.b> ch;
   private dxf.a ci;
   private final dxf.d cj;
   private final dwt<cgm.a> ck;
   private final bre cl = new bre(1);
   @Nullable
   private iz cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cgm(btb<? extends cgm> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new bzo(this, 20, true);
      this.a_(this.fV());
      this.cj = new cgm.b();
      this.ci = new dxf.a();
      this.ch = new dwt<>(new dxf.b(this));
      this.ck = new dwt<>(new cgm.a(this.cj.b(), dww.E.a().a()));
   }

   @Override
   protected bus.b<cgm> dT() {
      return bus.a(c, b);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return cgn.a(this.dT().a($$0));
   }

   @Override
   public bus<cgm> dS() {
      return (bus<cgm>)super.dS();
   }

   public static bux.a s() {
      return bts.A().a(buy.q, 20.0).a(buy.j, 0.1F).a(buy.r, 0.1F).a(buy.c, 2.0).a(buy.k, 48.0);
   }

   @Override
   protected cdc b(dbz $$0) {
      cda $$1 = new cda(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(evs $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(btv.a, this.ds());
            this.h(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(btv.a, this.ds());
            this.h(this.ds().a(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(btv.a, this.ds());
            this.h(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if ($$0.d() instanceof cmy $$2) {
         Optional<UUID> $$3 = this.dS().c(ccu.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dsd $$2, iz $$3) {
   }

   @Override
   protected avz v() {
      return this.c(btc.a) ? awa.a : awa.b;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.d;
   }

   @Override
   protected avz o_() {
      return awa.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("allayBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("allayActivityUpdate");
      cgn.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.bD() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gq() && this.gv() && this.ai % 20 == 0) {
         this.w(false);
         this.cm = null;
      }

      this.gw();
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.cp = this.co;
         if (this.u()) {
            this.co = ayz.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayz.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gq()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gr()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayz.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dxf.c.a(this.dP(), this.ci, this.cj);
         if (this.gn()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fV() {
      return !this.gu() && this.u();
   }

   public boolean u() {
      return !this.b(bqu.a).e();
   }

   @Override
   public boolean f(cuq $$0) {
      return false;
   }

   private boolean gu() {
      return this.dS().a(ccu.aP, ccv.a);
   }

   @Override
   protected bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      cuq $$3 = this.b(bqu.a);
      if (this.gq() && this.n($$2) && this.gz()) {
         this.gx();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, awa.E, awb.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqv.a;
      } else if ($$3.e() && !$$2.e()) {
         cuq $$4 = $$2.c(1);
         this.a(bqu.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, awa.e, awb.g, 2.0F, 1.0F);
         this.dS().a(ccu.aM, $$0.cz());
         return bqv.a;
      } else if (!$$3.e() && $$1 == bqu.a && $$2.e()) {
         this.a(btc.a, cuq.l);
         this.dP().a($$0, this, awa.f, awb.g, 2.0F, 1.0F);
         this.a(bqu.a);

         for (cuq $$5 : this.y().f()) {
            bvl.a(this, $$5, this.dn());
         }

         this.dS().b(ccu.aM);
         $$0.i($$3);
         return bqv.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iz $$0, boolean $$1) {
      if ($$1) {
         if (!this.gq()) {
            this.cm = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.w(false);
      }
   }

   @Override
   public bre y() {
      return this.cl;
   }

   @Override
   protected kd V() {
      return bY;
   }

   @Override
   public boolean k(cuq $$0) {
      cuq $$1 = this.b(bqu.a);
      return !$$1.e() && this.dP().ab().b(dbv.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuq $$0, cuq $$1) {
      return cuq.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuq $$0, cuq $$1) {
      cwr $$2 = $$0.a(km.G);
      cwr $$3 = $$1.a(km.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cji $$0) {
      cmj.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public boolean aV() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dwt<?>, arf> $$0) {
      if (this.dP() instanceof arf $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gq() {
      return this.ao.a(cf);
   }

   public void w(boolean $$0) {
      if (!this.dP().B && this.db() && (!$$0 || !this.gn())) {
         this.ao.a(cf, $$0);
      }
   }

   private boolean gv() {
      return this.cm == null || !this.cm.a(this.dn(), (double)dww.E.a().a()) || !this.dP().a_(this.cm).a(dfc.dT);
   }

   public float G(float $$0) {
      return ayz.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gr() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return ayz.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cuq $$0, cuq $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      cuq $$0 = this.a(btc.a);
      if (!$$0.e() && !dac.g($$0)) {
         this.b($$0);
         this.a(btc.a, cuq.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      dxf.a.a.encodeStart(vg.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gz());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dxf.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.ao.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean go() {
      return false;
   }

   private void gw() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dP().x_() && this.cn == 0L && !this.gz()) {
         this.ao.a(cg, true);
      }
   }

   private boolean n(cuq $$0) {
      return cc.a($$0);
   }

   private void gx() {
      cgm $$0 = btb.a.a(this.dP());
      if ($$0 != null) {
         $$0.e(this.dn());
         $$0.fU();
         $$0.gy();
         this.gy();
         this.dP().b($$0);
      }
   }

   private void gy() {
      this.cn = 6000L;
      this.ao.a(cg, false);
   }

   private boolean gz() {
      return this.ao.a(cg);
   }

   private void a(cmy $$0, cuq $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public evs cM() {
      return new evs(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gA();
         }
      } else {
         super.b($$0);
      }
   }

   private void gA() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dP().a(li.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dxf.a gs() {
      return this.ci;
   }

   @Override
   public dxf.d gt() {
      return this.cj;
   }

   class a implements dwy {
      private final dxa b;
      private final int c;

      public a(final dxa $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dxa a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arf $$0, ji<dww> $$1, dww.a $$2, evs $$3) {
         if ($$1.a(dww.E)) {
            cgm.this.b(iz.a($$3), true);
            return true;
         } else if ($$1.a(dww.F)) {
            cgm.this.b(iz.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dxf.d {
      private static final int b = 16;
      private final dxa c = new dwu(cgm.this, cgm.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxa b() {
         return this.c;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dww> $$2, dww.a $$3) {
         if (cgm.this.gg()) {
            return false;
         } else {
            Optional<jh> $$4 = cgm.this.dS().c(ccu.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jh $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dww> $$2, @Nullable bsv $$3, @Nullable bsv $$4, float $$5) {
         if ($$2.a(dww.H)) {
            cgn.a(cgm.this, new iz($$1));
         }
      }

      @Override
      public axf<dww> c() {
         return aww.e;
      }
   }
}
