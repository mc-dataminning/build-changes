import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzg extends bmx implements cfb, doi {
   private static final Logger e = LogUtils.getLogger();
   private static final jb bU = new jb(1, 1, 1);
   private static final int bV = 5;
   private static final float bW = 55.0F;
   private static final float bX = 15.0F;
   private static final cqh bY = cqh.a(cnj.oB);
   private static final int bZ = 6000;
   private static final int ca = 3;
   private static final agn<Boolean> cb = agq.a(bzg.class, agp.k);
   private static final agn<Boolean> cc = agq.a(bzg.class, agp.k);
   protected static final ImmutableList<bwx<? extends bww<? super bzg>>> b = ImmutableList.of(bwx.c, bwx.d, bwx.f, bwx.b);
   protected static final ImmutableList<bvq<?>> c = ImmutableList.of(
      bvq.t, bvq.n, bvq.h, bvq.m, bvq.E, bvq.x, bvq.L, bvq.aM, bvq.aN, bvq.aO, bvq.aP, bvq.Z, new bvq[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dnw<doi.b> cd;
   private doi.a ce;
   private final doi.d cf;
   private final dnw<bzg.a> cg;
   private final bkl ch = new bkl(1);
   @Nullable
   private hx ci;
   private long cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;

   public bzg(bmc<? extends bzg> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bsk(this, 20, true);
      this.s(this.fL());
      this.cf = new bzg.b();
      this.ce = new doi.a();
      this.cd = new dnw<>(new doi.b(this));
      this.cg = new dnw<>(new bzg.a(this.cf.b(), dnz.E.a().a()));
   }

   @Override
   protected bno.b<bzg> dO() {
      return bno.a(c, b);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return bzh.a(this.dO().a($$0));
   }

   @Override
   public bno<bzg> dN() {
      return (bno<bzg>)super.dN();
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 20.0).a(bnu.h, 0.1F).a(bnu.o, 0.1F).a(bnu.c, 2.0).a(bnu.i, 48.0);
   }

   @Override
   protected bvy b(ctx $$0) {
      bvw $$1 = new bvw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cb, false);
      this.an.a(cc, true);
   }

   @Override
   public void a(emc $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bmu.a, this.do());
            this.g(this.do().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bmu.a, this.do());
            this.g(this.do().a(0.5));
         } else {
            this.a(this.ff(), $$0);
            this.a(bmu.a, this.do());
            this.g(this.do().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if ($$0.d() instanceof cfq $$2) {
         Optional<UUID> $$3 = this.dN().c(bvq.aM);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hx $$0, djp $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
   }

   @Override
   protected ars y() {
      return this.b(bmd.a) ? art.a : art.b;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.d;
   }

   @Override
   protected ars n_() {
      return art.c;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected void aa() {
      this.dL().af().a("allayBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("allayActivityUpdate");
      bzh.a(this);
      this.dL().af().c();
      super.aa();
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B && this.bx() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.gf() && this.gk() && this.ah % 20 == 0) {
         this.w(false);
         this.ci = null;
      }

      this.gl();
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         this.cl = this.ck;
         if (this.w()) {
            this.ck = aup.a(this.ck + 1.0F, 0.0F, 5.0F);
         } else {
            this.ck = aup.a(this.ck - 1.0F, 0.0F, 5.0F);
         }

         if (this.gf()) {
            this.cm++;
            this.co = this.cn;
            if (this.gg()) {
               this.cn++;
            } else {
               this.cn--;
            }

            this.cn = aup.a(this.cn, 0.0F, 15.0F);
         } else {
            this.cm = 0.0F;
            this.cn = 0.0F;
            this.co = 0.0F;
         }
      } else {
         doi.c.a(this.dL(), this.ce, this.cf);
         if (this.gc()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fL() {
      return !this.gj() && this.w();
   }

   public boolean w() {
      return !this.b(bkb.a).b();
   }

   @Override
   public boolean f(cng $$0) {
      return false;
   }

   private boolean gj() {
      return this.dN().a(bvq.aP, bvr.a);
   }

   @Override
   protected bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      cng $$3 = this.b(bkb.a);
      if (this.gf() && this.l($$2) && this.go()) {
         this.gm();
         this.dL().a(this, (byte)18);
         this.dL().a($$0, this, art.E, aru.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bkc.a;
      } else if ($$3.b() && !$$2.b()) {
         cng $$4 = $$2.c(1);
         this.a(bkb.a, $$4);
         this.a($$0, $$2);
         this.dL().a($$0, this, art.e, aru.g, 2.0F, 1.0F);
         this.dN().a(bvq.aM, $$0.cw());
         return bkc.a;
      } else if (!$$3.b() && $$1 == bkb.a && $$2.b()) {
         this.a(bmd.a, cng.f);
         this.dL().a($$0, this, art.f, aru.g, 2.0F, 1.0F);
         this.a(bkb.a);

         for (cng $$5 : this.A().f()) {
            boh.a(this, $$5, this.dj());
         }

         this.dN().b(bvq.aM);
         $$0.i($$3);
         return bkc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(hx $$0, boolean $$1) {
      if ($$1) {
         if (!this.gf()) {
            this.ci = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ci) || this.ci == null) {
         this.ci = null;
         this.w(false);
      }
   }

   @Override
   public bkl A() {
      return this.ch;
   }

   @Override
   protected jb W() {
      return bU;
   }

   @Override
   public boolean k(cng $$0) {
      cng $$1 = this.b(bkb.a);
      return !$$1.b() && this.dL().Z().b(ctt.c) && this.ch.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cng $$0, cng $$1) {
      return cng.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cng $$0, cng $$1) {
      so $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         so $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tl $$6 = $$2.c("Potion");
            tl $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(ccb $$0) {
      cfb.a(this, this, $$0);
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dnw<?>, ane> $$0) {
      if (this.dL() instanceof ane $$1) {
         $$0.accept(this.cd, $$1);
         $$0.accept(this.cg, $$1);
      }
   }

   public boolean gf() {
      return this.an.b(cb);
   }

   public void w(boolean $$0) {
      if (!this.dL().B && this.cY() && (!$$0 || !this.gc())) {
         this.an.b(cb, $$0);
      }
   }

   private boolean gk() {
      return this.ci == null || !this.ci.a(this.dj(), (double)dnz.E.a().a()) || !this.dL().a_(this.ci).a(cxa.dT);
   }

   public float D(float $$0) {
      return aup.i($$0, this.cl, this.ck) / 5.0F;
   }

   public boolean gg() {
      float $$0 = this.cm % 55.0F;
      return $$0 < 15.0F;
   }

   public float E(float $$0) {
      return aup.i($$0, this.co, this.cn) / 15.0F;
   }

   @Override
   public boolean a(cng $$0, cng $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ey() {
      super.ey();
      this.ch.f().forEach(this::b);
      cng $$0 = this.c(bmd.a);
      if (!$$0.b() && !crt.e($$0)) {
         this.b($$0);
         this.a(bmd.a, cng.f);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      this.a_($$0);
      doi.a.a.encodeStart(tc.a, this.ce).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cj);
      $$0.a("CanDuplicate", this.go());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         doi.a.a.parse(new Dynamic(tc.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ce = $$0x);
      }

      this.cj = (long)$$0.h("DuplicationCooldown");
      this.an.b(cc, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gd() {
      return false;
   }

   private void gl() {
      if (this.cj > 0L) {
         this.cj--;
      }

      if (!this.dL().y_() && this.cj == 0L && !this.go()) {
         this.an.b(cc, true);
      }
   }

   private boolean l(cng $$0) {
      return bY.a($$0);
   }

   private void gm() {
      bzg $$0 = bmc.b.a(this.dL());
      if ($$0 != null) {
         $$0.e(this.dj());
         $$0.fK();
         $$0.gn();
         this.gn();
         this.dL().b($$0);
      }
   }

   private void gn() {
      this.cj = 6000L;
      this.an.b(cc, false);
   }

   private boolean go() {
      return this.an.b(cc);
   }

   private void a(cfq $$0, cng $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gp();
         }
      } else {
         super.b($$0);
      }
   }

   private void gp() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dL().a(jx.O, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public doi.a gh() {
      return this.ce;
   }

   @Override
   public doi.d gi() {
      return this.cf;
   }

   class a implements dob {
      private final dod b;
      private final int c;

      public a(dod $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dod a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ane $$0, ih<dnz> $$1, dnz.a $$2, emc $$3) {
         if ($$1.a(dnz.E)) {
            bzg.this.b(hx.a($$3), true);
            return true;
         } else if ($$1.a(dnz.F)) {
            bzg.this.b(hx.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements doi.d {
      private static final int b = 16;
      private final dod c = new dnx(bzg.this, bzg.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dod b() {
         return this.c;
      }

      @Override
      public boolean a(ane $$0, hx $$1, ih<dnz> $$2, dnz.a $$3) {
         if (bzg.this.fV()) {
            return false;
         } else {
            Optional<ig> $$4 = bzg.this.dN().c(bvq.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ig $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ane $$0, hx $$1, ih<dnz> $$2, @Nullable blw $$3, @Nullable blw $$4, float $$5) {
         if ($$2.a(dnz.H)) {
            bzh.a(bzg.this, new hx($$1));
         }
      }

      @Override
      public asx<dnz> c() {
         return aso.e;
      }
   }
}
