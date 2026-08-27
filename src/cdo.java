import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdo extends brb implements cjl, duk {
   private static final Logger e = LogUtils.getLogger();
   private static final ji bX = new ji(1, 1, 1);
   private static final int bY = 5;
   private static final float bZ = 55.0F;
   private static final float ca = 15.0F;
   private static final cvp cb = cvp.a(crv.oB);
   private static final int cc = 6000;
   private static final int cd = 3;
   private static final aja<Boolean> ce = aje.a(cdo.class, ajc.k);
   private static final aja<Boolean> cf = aje.a(cdo.class, ajc.k);
   protected static final ImmutableList<cbd<? extends cbc<? super cdo>>> b = ImmutableList.of(cbd.c, cbd.d, cbd.f, cbd.b);
   protected static final ImmutableList<bzw<?>> c = ImmutableList.of(
      bzw.t, bzw.n, bzw.h, bzw.m, bzw.E, bzw.x, bzw.L, bzw.aM, bzw.aN, bzw.aO, bzw.aP, bzw.Z, new bzw[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dty<duk.b> cg;
   private duk.a ch;
   private final duk.d ci;
   private final dty<cdo.a> cj;
   private final boo ck = new boo(1);
   @Nullable
   private id cl;
   private long cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;

   public cdo(bqg<? extends cdo> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new bwq(this, 20, true);
      this.s(this.fT());
      this.ci = new cdo.b();
      this.ch = new duk.a();
      this.cg = new dty<>(new duk.b(this));
      this.cj = new dty<>(new cdo.a(this.ci.b(), dub.E.a().a()));
   }

   @Override
   protected bru.b<cdo> dQ() {
      return bru.a(c, b);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cdp.a(this.dQ().a($$0));
   }

   @Override
   public bru<cdo> dP() {
      return (bru<cdo>)super.dP();
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 20.0).a(bsa.j, 0.1F).a(bsa.r, 0.1F).a(bsa.c, 2.0).a(bsa.k, 48.0);
   }

   @Override
   protected cae b(czg $$0) {
      cac $$1 = new cac(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, true);
   }

   @Override
   public void a(esj $$0) {
      if (this.cX()) {
         if (this.bc()) {
            this.a(0.02F, $$0);
            this.a(bqy.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bq()) {
            this.a(0.02F, $$0);
            this.a(bqy.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.fk(), $$0);
            this.a(bqy.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if ($$0.d() instanceof cka $$2) {
         Optional<UUID> $$3 = this.dP().c(bzw.aM);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(id $$0, dpi $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dpi $$2, id $$3) {
   }

   @Override
   protected aun v() {
      return this.b(bqh.a) ? auo.a : auo.b;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.d;
   }

   @Override
   protected aun o_() {
      return auo.c;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dM().af().a("allayBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("allayActivityUpdate");
      cdp.a(this);
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
            this.cn = axm.a(this.cn + 1.0F, 0.0F, 5.0F);
         } else {
            this.cn = axm.a(this.cn - 1.0F, 0.0F, 5.0F);
         }

         if (this.gn()) {
            this.cp++;
            this.cr = this.cq;
            if (this.go()) {
               this.cq++;
            } else {
               this.cq--;
            }

            this.cq = axm.a(this.cq, 0.0F, 15.0F);
         } else {
            this.cp = 0.0F;
            this.cq = 0.0F;
            this.cr = 0.0F;
         }
      } else {
         duk.c.a(this.dM(), this.ch, this.ci);
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
      return !this.b(boe.a).d();
   }

   @Override
   public boolean f(crs $$0) {
      return false;
   }

   private boolean gr() {
      return this.dP().a(bzw.aP, bzx.a);
   }

   @Override
   protected bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      crs $$3 = this.b(boe.a);
      if (this.gn() && this.n($$2) && this.gw()) {
         this.gu();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, auo.E, aup.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bof.a;
      } else if ($$3.d() && !$$2.d()) {
         crs $$4 = $$2.c(1);
         this.a(boe.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, auo.e, aup.g, 2.0F, 1.0F);
         this.dP().a(bzw.aM, $$0.cw());
         return bof.a;
      } else if (!$$3.d() && $$1 == boe.a && $$2.d()) {
         this.a(bqh.a, crs.i);
         this.dM().a($$0, this, auo.f, aup.g, 2.0F, 1.0F);
         this.a(boe.a);

         for (crs $$5 : this.y().f()) {
            bsn.a(this, $$5, this.dk());
         }

         this.dP().b(bzw.aM);
         $$0.i($$3);
         return bof.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(id $$0, boolean $$1) {
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
   public boo y() {
      return this.ck;
   }

   @Override
   protected ji U() {
      return bX;
   }

   @Override
   public boolean k(crs $$0) {
      crs $$1 = this.b(boe.a);
      return !$$1.d() && this.dM().aa().b(czc.c) && this.ck.b($$0) && this.d($$1, $$0);
   }

   private boolean d(crs $$0, crs $$1) {
      return crs.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(crs $$0, crs $$1) {
      ctq $$2 = $$0.a(jr.x);
      ctq $$3 = $$1.a(jr.x);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cgk $$0) {
      cjl.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dty<?>, apu> $$0) {
      if (this.dM() instanceof apu $$1) {
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
      return this.cl == null || !this.cl.a(this.dk(), (double)dub.E.a().a()) || !this.dM().a_(this.cl).a(dcj.dT);
   }

   public float G(float $$0) {
      return axm.i($$0, this.co, this.cn) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cp % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return axm.i($$0, this.cr, this.cq) / 15.0F;
   }

   @Override
   public boolean a(crs $$0, crs $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eA() {
      super.eA();
      this.ck.f().forEach(this::b);
      crs $$0 = this.d(bqh.a);
      if (!$$0.d() && !cxa.g($$0)) {
         this.b($$0);
         this.a(bqh.a, crs.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      this.b($$0, this.dO());
      duk.a.a.encodeStart(uc.a, this.ch).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cm);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a($$0, this.dO());
      if ($$0.b("listener", 10)) {
         duk.a.a.parse(new Dynamic(uc.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ch = $$0x);
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

   private boolean n(crs $$0) {
      return cb.a($$0);
   }

   private void gu() {
      cdo $$0 = bqg.a.a(this.dM());
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

   private void a(cka $$0, crs $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
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
      this.dM().a(kn.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public duk.a gp() {
      return this.ch;
   }

   @Override
   public duk.d gq() {
      return this.ci;
   }

   class a implements dud {
      private final duf b;
      private final int c;

      public a(duf $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public duf a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(apu $$0, in<dub> $$1, dub.a $$2, esj $$3) {
         if ($$1.a(dub.E)) {
            cdo.this.b(id.a($$3), true);
            return true;
         } else if ($$1.a(dub.F)) {
            cdo.this.b(id.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements duk.d {
      private static final int b = 16;
      private final duf c = new dtz(cdo.this, cdo.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public duf b() {
         return this.c;
      }

      @Override
      public boolean a(apu $$0, id $$1, in<dub> $$2, dub.a $$3) {
         if (cdo.this.gd()) {
            return false;
         } else {
            Optional<im> $$4 = cdo.this.dP().c(bzw.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               im $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(apu $$0, id $$1, in<dub> $$2, @Nullable bqa $$3, @Nullable bqa $$4, float $$5) {
         if ($$2.a(dub.H)) {
            cdp.a(cdo.this, new id($$1));
         }
      }

      @Override
      public avt<dub> c() {
         return avk.e;
      }
   }
}
