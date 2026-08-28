import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgg extends btt implements cmd, dwz {
   private static final Logger e = LogUtils.getLogger();
   private static final kd bY = new kd(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cyn cc = cyn.a(cun.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akg<Boolean> cf = akk.a(cgg.class, aki.k);
   private static final akg<Boolean> cg = akk.a(cgg.class, aki.k);
   protected static final ImmutableList<cdv<? extends cdu<? super cgg>>> b = ImmutableList.of(cdv.c, cdv.d, cdv.f, cdv.b);
   protected static final ImmutableList<cco<?>> c = ImmutableList.of(
      cco.t, cco.n, cco.h, cco.m, cco.E, cco.x, cco.L, cco.aM, cco.aN, cco.aO, cco.aP, cco.Z, new cco[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dwn<dwz.b> ch;
   private dwz.a ci;
   private final dwz.d cj;
   private final dwn<cgg.a> ck;
   private final bqy cl = new bqy(1);
   @Nullable
   private iz cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cgg(bsv<? extends cgg> $$0, dbt $$1) {
      super($$0, $$1);
      this.bP = new bzi(this, 20, true);
      this.a_(this.fV());
      this.cj = new cgg.b();
      this.ci = new dwz.a();
      this.ch = new dwn<>(new dwz.b(this));
      this.ck = new dwn<>(new cgg.a(this.cj.b(), dwq.E.a().a()));
   }

   @Override
   protected bum.b<cgg> dT() {
      return bum.a(c, b);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return cgh.a(this.dT().a($$0));
   }

   @Override
   public bum<cgg> dS() {
      return (bum<cgg>)super.dS();
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 20.0).a(bus.j, 0.1F).a(bus.r, 0.1F).a(bus.c, 2.0).a(bus.k, 48.0);
   }

   @Override
   protected ccw b(dbt $$0) {
      ccu $$1 = new ccu(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(evm $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(btp.a, this.ds());
            this.h(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(btp.a, this.ds());
            this.h(this.ds().a(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(btp.a, this.ds());
            this.h(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if ($$0.d() instanceof cms $$2) {
         Optional<UUID> $$3 = this.dS().c(cco.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(iz $$0, drx $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, drx $$2, iz $$3) {
   }

   @Override
   protected avv v() {
      return this.c(bsw.a) ? avw.a : avw.b;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.d;
   }

   @Override
   protected avv o_() {
      return avw.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("allayBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("allayActivityUpdate");
      cgh.a(this);
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
            this.co = ayu.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayu.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gq()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gr()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayu.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dwz.c.a(this.dP(), this.ci, this.cj);
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
      return !this.b(bqo.a).e();
   }

   @Override
   public boolean f(cuk $$0) {
      return false;
   }

   private boolean gu() {
      return this.dS().a(cco.aP, ccp.a);
   }

   @Override
   protected bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      cuk $$3 = this.b(bqo.a);
      if (this.gq() && this.n($$2) && this.gz()) {
         this.gx();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avw.E, avx.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqp.a;
      } else if ($$3.e() && !$$2.e()) {
         cuk $$4 = $$2.c(1);
         this.a(bqo.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avw.e, avx.g, 2.0F, 1.0F);
         this.dS().a(cco.aM, $$0.cz());
         return bqp.a;
      } else if (!$$3.e() && $$1 == bqo.a && $$2.e()) {
         this.a(bsw.a, cuk.l);
         this.dP().a($$0, this, avw.f, avx.g, 2.0F, 1.0F);
         this.a(bqo.a);

         for (cuk $$5 : this.y().f()) {
            bvf.a(this, $$5, this.dn());
         }

         this.dS().b(cco.aM);
         $$0.i($$3);
         return bqp.a;
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
   public bqy y() {
      return this.cl;
   }

   @Override
   protected kd V() {
      return bY;
   }

   @Override
   public boolean k(cuk $$0) {
      cuk $$1 = this.b(bqo.a);
      return !$$1.e() && this.dP().ab().b(dbp.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuk $$0, cuk $$1) {
      return cuk.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuk $$0, cuk $$1) {
      cwl $$2 = $$0.a(km.F);
      cwl $$3 = $$1.a(km.F);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cjc $$0) {
      cmd.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   public boolean aV() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dwn<?>, arb> $$0) {
      if (this.dP() instanceof arb $$1) {
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
      return this.cm == null || !this.cm.a(this.dn(), (double)dwq.E.a().a()) || !this.dP().a_(this.cm).a(dew.dT);
   }

   public float G(float $$0) {
      return ayu.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gr() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return ayu.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cuk $$0, cuk $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      cuk $$0 = this.a(bsw.a);
      if (!$$0.e() && !czw.g($$0)) {
         this.b($$0);
         this.a(bsw.a, cuk.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      dwz.a.a.encodeStart(vf.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gz());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dwz.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
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

   private boolean n(cuk $$0) {
      return cc.a($$0);
   }

   private void gx() {
      cgg $$0 = bsv.a.a(this.dP());
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

   private void a(cms $$0, cuk $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
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
      this.dP().a(lj.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dwz.a gs() {
      return this.ci;
   }

   @Override
   public dwz.d gt() {
      return this.cj;
   }

   class a implements dws {
      private final dwu b;
      private final int c;

      public a(final dwu $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dwu a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arb $$0, ji<dwq> $$1, dwq.a $$2, evm $$3) {
         if ($$1.a(dwq.E)) {
            cgg.this.b(iz.a($$3), true);
            return true;
         } else if ($$1.a(dwq.F)) {
            cgg.this.b(iz.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dwz.d {
      private static final int b = 16;
      private final dwu c = new dwo(cgg.this, cgg.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwu b() {
         return this.c;
      }

      @Override
      public boolean a(arb $$0, iz $$1, ji<dwq> $$2, dwq.a $$3) {
         if (cgg.this.gg()) {
            return false;
         } else {
            Optional<jh> $$4 = cgg.this.dS().c(cco.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jh $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arb $$0, iz $$1, ji<dwq> $$2, @Nullable bsp $$3, @Nullable bsp $$4, float $$5) {
         if ($$2.a(dwq.H)) {
            cgh.a(cgg.this, new iz($$1));
         }
      }

      @Override
      public axb<dwq> c() {
         return aws.e;
      }
   }
}
