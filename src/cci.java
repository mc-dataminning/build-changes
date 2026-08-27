import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cci extends bpx implements cif, dry {
   private static final Logger e = LogUtils.getLogger();
   private static final jg bX = new jg(1, 1, 1);
   private static final int bY = 5;
   private static final float bZ = 55.0F;
   private static final float ca = 15.0F;
   private static final ctm cb = ctm.a(cqp.oB);
   private static final int cc = 6000;
   private static final int cd = 3;
   private static final aim<Boolean> ce = aiq.a(cci.class, aio.k);
   private static final aim<Boolean> cf = aiq.a(cci.class, aio.k);
   protected static final ImmutableList<bzz<? extends bzy<? super cci>>> b = ImmutableList.of(bzz.c, bzz.d, bzz.f, bzz.b);
   protected static final ImmutableList<bys<?>> c = ImmutableList.of(
      bys.t, bys.n, bys.h, bys.m, bys.E, bys.x, bys.L, bys.aM, bys.aN, bys.aO, bys.aP, bys.Z, new bys[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final drm<dry.b> cg;
   private dry.a ch;
   private final dry.d ci;
   private final drm<cci.a> cj;
   private final bnm ck = new bnm(1);
   @Nullable
   private ib cl;
   private long cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;

   public cci(bpd<? extends cci> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new bvm(this, 20, true);
      this.s(this.fT());
      this.ci = new cci.b();
      this.ch = new dry.a();
      this.cg = new drm<>(new dry.b(this));
      this.cj = new drm<>(new cci.a(this.ci.b(), drp.E.a().a()));
   }

   @Override
   protected bqq.b<cci> dQ() {
      return bqq.a(c, b);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return ccj.a(this.dQ().a($$0));
   }

   @Override
   public bqq<cci> dP() {
      return (bqq<cci>)super.dP();
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 20.0).a(bqw.j, 0.1F).a(bqw.r, 0.1F).a(bqw.c, 2.0).a(bqw.k, 48.0);
   }

   @Override
   protected bza b(cxb $$0) {
      byy $$1 = new byy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, true);
   }

   @Override
   public void a(ept $$0) {
      if (this.cX()) {
         if (this.bc()) {
            this.a(0.02F, $$0);
            this.a(bpu.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bq()) {
            this.a(0.02F, $$0);
            this.a(bpu.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.fk(), $$0);
            this.a(bpu.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if ($$0.d() instanceof ciu $$2) {
         Optional<UUID> $$3 = this.dP().c(bys.aM);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dnb $$2, ib $$3) {
   }

   @Override
   protected atx v() {
      return this.b(bpe.a) ? aty.a : aty.b;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.d;
   }

   @Override
   protected atx n_() {
      return aty.c;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("allayBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("allayActivityUpdate");
      ccj.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   public void m_() {
      super.m_();
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
         if (this.s()) {
            this.cn = aww.a(this.cn + 1.0F, 0.0F, 5.0F);
         } else {
            this.cn = aww.a(this.cn - 1.0F, 0.0F, 5.0F);
         }

         if (this.gn()) {
            this.cp++;
            this.cr = this.cq;
            if (this.go()) {
               this.cq++;
            } else {
               this.cq--;
            }

            this.cq = aww.a(this.cq, 0.0F, 15.0F);
         } else {
            this.cp = 0.0F;
            this.cq = 0.0F;
            this.cr = 0.0F;
         }
      } else {
         dry.c.a(this.dM(), this.ch, this.ci);
         if (this.gk()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fT() {
      return !this.gr() && this.s();
   }

   public boolean s() {
      return !this.b(bnc.a).b();
   }

   @Override
   public boolean f(cqm $$0) {
      return false;
   }

   private boolean gr() {
      return this.dP().a(bys.aP, byt.a);
   }

   @Override
   protected bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      cqm $$3 = this.b(bnc.a);
      if (this.gn() && this.n($$2) && this.gw()) {
         this.gu();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, aty.E, atz.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bnd.a;
      } else if ($$3.b() && !$$2.b()) {
         cqm $$4 = $$2.c(1);
         this.a(bnc.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, aty.e, atz.g, 2.0F, 1.0F);
         this.dP().a(bys.aM, $$0.cw());
         return bnd.a;
      } else if (!$$3.b() && $$1 == bnc.a && $$2.b()) {
         this.a(bpe.a, cqm.h);
         this.dM().a($$0, this, aty.f, atz.g, 2.0F, 1.0F);
         this.a(bnc.a);

         for (cqm $$5 : this.y().f()) {
            brj.a(this, $$5, this.dk());
         }

         this.dP().b(bys.aM);
         $$0.i($$3);
         return bnd.a;
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
   public bnm y() {
      return this.ck;
   }

   @Override
   protected jg U() {
      return bX;
   }

   @Override
   public boolean k(cqm $$0) {
      cqm $$1 = this.b(bnc.a);
      return !$$1.b() && this.dM().Z().b(cwx.c) && this.ck.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cqm $$0, cqm $$1) {
      return cqm.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cqm $$0, cqm $$1) {
      ta $$2 = $$0.w();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         ta $$4 = $$1.w();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tx $$6 = $$2.c("Potion");
            tx $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cfe $$0) {
      cif.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<drm<?>, apf> $$0) {
      if (this.dM() instanceof apf $$1) {
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
      return this.cl == null || !this.cl.a(this.dk(), (double)drp.E.a().a()) || !this.dM().a_(this.cl).a(dae.dT);
   }

   public float G(float $$0) {
      return aww.i($$0, this.co, this.cn) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cp % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return aww.i($$0, this.cr, this.cq) / 15.0F;
   }

   @Override
   public boolean a(cqm $$0, cqm $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eA() {
      super.eA();
      this.ck.f().forEach(this::b);
      cqm $$0 = this.d(bpe.a);
      if (!$$0.b() && !cux.e($$0)) {
         this.b($$0);
         this.a(bpe.a, cqm.h);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      this.a_($$0);
      dry.a.a.encodeStart(to.a, this.ch).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cm);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dry.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ch = $$0x);
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

   private boolean n(cqm $$0) {
      return cb.a($$0);
   }

   private void gu() {
      cci $$0 = bpd.b.a(this.dM());
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

   private void a(ciu $$0, cqm $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
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
      this.dM().a(kc.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dry.a gp() {
      return this.ch;
   }

   @Override
   public dry.d gq() {
      return this.ci;
   }

   class a implements drr {
      private final drt b;
      private final int c;

      public a(drt $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public drt a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(apf $$0, il<drp> $$1, drp.a $$2, ept $$3) {
         if ($$1.a(drp.E)) {
            cci.this.b(ib.a($$3), true);
            return true;
         } else if ($$1.a(drp.F)) {
            cci.this.b(ib.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dry.d {
      private static final int b = 16;
      private final drt c = new drn(cci.this, cci.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public drt b() {
         return this.c;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drp> $$2, drp.a $$3) {
         if (cci.this.gd()) {
            return false;
         } else {
            Optional<ik> $$4 = cci.this.dP().c(bys.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ik $$5 = $$4.get();
               return $$5.a().equals($$0.ad()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(apf $$0, ib $$1, il<drp> $$2, @Nullable box $$3, @Nullable box $$4, float $$5) {
         if ($$2.a(drp.H)) {
            ccj.a(cci.this, new ib($$1));
         }
      }

      @Override
      public avd<drp> c() {
         return aut.e;
      }
   }
}
