import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdh extends bqw implements cje, dub {
   private static final Logger e = LogUtils.getLogger();
   private static final jg bX = new jg(1, 1, 1);
   private static final int bY = 5;
   private static final float bZ = 55.0F;
   private static final float ca = 15.0F;
   private static final cvg cb = cvg.a(crm.oB);
   private static final int cc = 6000;
   private static final int cd = 3;
   private static final aiy<Boolean> ce = ajc.a(cdh.class, aja.k);
   private static final aiy<Boolean> cf = ajc.a(cdh.class, aja.k);
   protected static final ImmutableList<cay<? extends cax<? super cdh>>> b = ImmutableList.of(cay.c, cay.d, cay.f, cay.b);
   protected static final ImmutableList<bzr<?>> c = ImmutableList.of(
      bzr.t, bzr.n, bzr.h, bzr.m, bzr.E, bzr.x, bzr.L, bzr.aM, bzr.aN, bzr.aO, bzr.aP, bzr.Z, new bzr[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dtp<dub.b> cg;
   private dub.a ch;
   private final dub.d ci;
   private final dtp<cdh.a> cj;
   private final boj ck = new boj(1);
   @Nullable
   private ib cl;
   private long cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;

   public cdh(bqb<? extends cdh> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new bwl(this, 20, true);
      this.s(this.fT());
      this.ci = new cdh.b();
      this.ch = new dub.a();
      this.cg = new dtp<>(new dub.b(this));
      this.cj = new dtp<>(new cdh.a(this.ci.b(), dts.E.a().a()));
   }

   @Override
   protected brp.b<cdh> dQ() {
      return brp.a(c, b);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cdi.a(this.dQ().a($$0));
   }

   @Override
   public brp<cdh> dP() {
      return (brp<cdh>)super.dP();
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 20.0).a(brv.j, 0.1F).a(brv.r, 0.1F).a(brv.c, 2.0).a(brv.k, 48.0);
   }

   @Override
   protected bzz b(cyx $$0) {
      bzx $$1 = new bzx(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, true);
   }

   @Override
   public void a(esa $$0) {
      if (this.cX()) {
         if (this.bc()) {
            this.a(0.02F, $$0);
            this.a(bqt.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bq()) {
            this.a(0.02F, $$0);
            this.a(bqt.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.fk(), $$0);
            this.a(bqt.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if ($$0.d() instanceof cjt $$2) {
         Optional<UUID> $$3 = this.dP().c(bzr.aM);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ib $$0, doz $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
   }

   @Override
   protected aul v() {
      return this.b(bqc.a) ? aum.a : aum.b;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.d;
   }

   @Override
   protected aul o_() {
      return aum.c;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dM().af().a("allayBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("allayActivityUpdate");
      cdi.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B && this.bA() && this.ah % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gn() && this.gs() && this.ah % 20 == 0) {
         this.w(false);
         this.cl = null;
      }

      this.gt();
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         this.co = this.cn;
         if (this.u()) {
            this.cn = axk.a(this.cn + 1.0F, 0.0F, 5.0F);
         } else {
            this.cn = axk.a(this.cn - 1.0F, 0.0F, 5.0F);
         }

         if (this.gn()) {
            this.cp++;
            this.cr = this.cq;
            if (this.go()) {
               this.cq++;
            } else {
               this.cq--;
            }

            this.cq = axk.a(this.cq, 0.0F, 15.0F);
         } else {
            this.cp = 0.0F;
            this.cq = 0.0F;
            this.cr = 0.0F;
         }
      } else {
         dub.c.a(this.dM(), this.ch, this.ci);
         if (this.gk()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fT() {
      return !this.gr() && this.u();
   }

   public boolean u() {
      return !this.b(bnz.a).d();
   }

   @Override
   public boolean f(crj $$0) {
      return false;
   }

   private boolean gr() {
      return this.dP().a(bzr.aP, bzs.a);
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      crj $$3 = this.b(bnz.a);
      if (this.gn() && this.n($$2) && this.gw()) {
         this.gu();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, aum.E, aun.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return boa.a;
      } else if ($$3.d() && !$$2.d()) {
         crj $$4 = $$2.c(1);
         this.a(bnz.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, aum.e, aun.g, 2.0F, 1.0F);
         this.dP().a(bzr.aM, $$0.cw());
         return boa.a;
      } else if (!$$3.d() && $$1 == bnz.a && $$2.d()) {
         this.a(bqc.a, crj.i);
         this.dM().a($$0, this, aum.f, aun.g, 2.0F, 1.0F);
         this.a(bnz.a);

         for (crj $$5 : this.y().f()) {
            bsi.a(this, $$5, this.dk());
         }

         this.dP().b(bzr.aM);
         $$0.i($$3);
         return boa.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ib $$0, boolean $$1) {
      if ($$1) {
         if (!this.gn()) {
            this.cl = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cl) || this.cl == null) {
         this.cl = null;
         this.w(false);
      }
   }

   @Override
   public boj y() {
      return this.ck;
   }

   @Override
   protected jg U() {
      return bX;
   }

   @Override
   public boolean k(crj $$0) {
      crj $$1 = this.b(bnz.a);
      return !$$1.d() && this.dM().aa().b(cyt.c) && this.ck.b($$0) && this.d($$1, $$0);
   }

   private boolean d(crj $$0, crj $$1) {
      return crj.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(crj $$0, crj $$1) {
      cth $$2 = $$0.a(jp.x);
      cth $$3 = $$1.a(jp.x);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cgd $$0) {
      cje.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dtp<?>, aps> $$0) {
      if (this.dM() instanceof aps $$1) {
         $$0.accept(this.cg, $$1);
         $$0.accept(this.cj, $$1);
      }
   }

   public boolean gn() {
      return this.an.a(ce);
   }

   public void w(boolean $$0) {
      if (!this.dM().B && this.cY() && (!$$0 || !this.gk())) {
         this.an.a(ce, $$0);
      }
   }

   private boolean gs() {
      return this.cl == null || !this.cl.a(this.dk(), (double)dts.E.a().a()) || !this.dM().a_(this.cl).a(dca.dT);
   }

   public float G(float $$0) {
      return axk.i($$0, this.co, this.cn) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cp % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return axk.i($$0, this.cr, this.cq) / 15.0F;
   }

   @Override
   public boolean a(crj $$0, crj $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eA() {
      super.eA();
      this.ck.f().forEach(this::b);
      crj $$0 = this.d(bqc.a);
      if (!$$0.d() && !cwr.f($$0)) {
         this.b($$0);
         this.a(bqc.a, crj.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      this.b($$0, this.dO());
      dub.a.a.encodeStart(ua.a, this.ch).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cm);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a($$0, this.dO());
      if ($$0.b("listener", 10)) {
         dub.a.a.parse(new Dynamic(ua.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ch = $$0x);
      }

      this.cm = (long)$$0.h("DuplicationCooldown");
      this.an.a(cf, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gl() {
      return false;
   }

   private void gt() {
      if (this.cm > 0L) {
         this.cm--;
      }

      if (!this.dM().x_() && this.cm == 0L && !this.gw()) {
         this.an.a(cf, true);
      }
   }

   private boolean n(crj $$0) {
      return cb.a($$0);
   }

   private void gu() {
      cdh $$0 = bqb.a.a(this.dM());
      if ($$0 != null) {
         $$0.e(this.dk());
         $$0.fS();
         $$0.gv();
         this.gv();
         this.dM().b($$0);
      }
   }

   private void gv() {
      this.cm = 6000L;
      this.an.a(cf, false);
   }

   private boolean gw() {
      return this.an.a(cf);
   }

   private void a(cjt $$0, crj $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gx();
         }
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dM().a(kl.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dub.a gp() {
      return this.ch;
   }

   @Override
   public dub.d gq() {
      return this.ci;
   }

   class a implements dtu {
      private final dtw b;
      private final int c;

      public a(dtw $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dtw a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aps $$0, il<dts> $$1, dts.a $$2, esa $$3) {
         if ($$1.a(dts.E)) {
            cdh.this.b(ib.a($$3), true);
            return true;
         } else if ($$1.a(dts.F)) {
            cdh.this.b(ib.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dub.d {
      private static final int b = 16;
      private final dtw c = new dtq(cdh.this, cdh.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dtw b() {
         return this.c;
      }

      @Override
      public boolean a(aps $$0, ib $$1, il<dts> $$2, dts.a $$3) {
         if (cdh.this.gd()) {
            return false;
         } else {
            Optional<ik> $$4 = cdh.this.dP().c(bzr.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ik $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aps $$0, ib $$1, il<dts> $$2, @Nullable bpv $$3, @Nullable bpv $$4, float $$5) {
         if ($$2.a(dts.H)) {
            cdi.a(cdh.this, new ib($$1));
         }
      }

      @Override
      public avr<dts> c() {
         return avi.e;
      }
   }
}
