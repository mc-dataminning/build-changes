import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvm extends bjf implements caw, djr {
   private static final Logger e = LogUtils.getLogger();
   private static final ia bT = new ia(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final clw bX = clw.a(ciz.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final adx<Boolean> ca = aea.a(bvm.class, adz.k);
   private static final adx<Boolean> cb = aea.a(bvm.class, adz.k);
   protected static final ImmutableList<btd<? extends btc<? super bvm>>> b = ImmutableList.of(btd.c, btd.d, btd.f, btd.b);
   protected static final ImmutableList<bry<?>> c = ImmutableList.of(
      bry.t, bry.n, bry.h, bry.m, bry.E, bry.x, bry.K, bry.aL, bry.aM, bry.aN, bry.aO, bry.Y, new bry[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final djf<djr.b> cc;
   private djr.a cd;
   private final djr.d ce;
   private final djf<bvm.a> cf;
   private final bgv cg = new bgv(1);
   @Nullable
   private gv ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bvm(bik<? extends bvm> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new bos(this, 20, true);
      this.s(this.fG());
      this.ce = new bvm.b();
      this.cd = new djr.a();
      this.cc = new djf<>(new djr.b(this));
      this.cf = new djf<>(new bvm.a(this.ce.b(), dji.E.a()));
   }

   @Override
   protected bjx.b<bvm> dN() {
      return bjx.a(c, b);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bvn.a(this.dN().a($$0));
   }

   @Override
   public bjx<bvm> dM() {
      return (bjx<bvm>)super.dM();
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 20.0).a(bkd.e, 0.1F).a(bkd.d, 0.1F).a(bkd.f, 2.0).a(bkd.b, 48.0);
   }

   @Override
   protected bsg b(cpk $$0) {
      bse $$1 = new bse(this, $$0);
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
   public void h(ehf $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bjc.a, this.dn());
            this.f(this.dn().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bjc.a, this.dn());
            this.f(this.dn().a(0.5));
         } else {
            this.a(this.fd(), $$0);
            this.a(bjc.a, this.dn());
            this.f(this.dn().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if ($$0.d() instanceof cbl $$2) {
         Optional<UUID> $$3 = this.dM().c(bry.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gv $$0, dey $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
   }

   @Override
   protected aot r() {
      return this.b(bil.a) ? aou.a : aou.b;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.d;
   }

   @Override
   protected aot h_() {
      return aou.c;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   protected void V() {
      this.dK().ad().a("allayBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("allayActivityUpdate");
      bvn.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B && this.bv() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.fZ() && this.ge() && this.ah % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gf();
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B) {
         this.ck = this.cj;
         if (this.q()) {
            this.cj = aro.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = aro.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.fZ()) {
            this.cl++;
            this.cn = this.cm;
            if (this.ga()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = aro.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         djr.c.a(this.dK(), this.cd, this.ce);
         if (this.fW()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fG() {
      return !this.gd() && this.q();
   }

   public boolean q() {
      return !this.b(bgn.a).b();
   }

   @Override
   public boolean f(ciw $$0) {
      return false;
   }

   private boolean gd() {
      return this.dM().a(bry.aO, brz.a);
   }

   @Override
   protected bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      ciw $$3 = this.b(bgn.a);
      if (this.fZ() && this.l($$2) && this.gi()) {
         this.gg();
         this.dK().a(this, (byte)18);
         this.dK().a($$0, this, aou.E, aov.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bgo.a;
      } else if ($$3.b() && !$$2.b()) {
         ciw $$4 = $$2.c(1);
         this.a(bgn.a, $$4);
         this.a($$0, $$2);
         this.dK().a($$0, this, aou.e, aov.g, 2.0F, 1.0F);
         this.dM().a(bry.aL, $$0.cv());
         return bgo.a;
      } else if (!$$3.b() && $$1 == bgn.a && $$2.b()) {
         this.a(bil.a, ciw.b);
         this.dK().a($$0, this, aou.f, aov.g, 2.0F, 1.0F);
         this.a(bgn.a);

         for (ciw $$5 : this.t().f()) {
            bkq.a(this, $$5, this.di());
         }

         this.dM().b(bry.aL);
         $$0.i($$3);
         return bgo.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gv $$0, boolean $$1) {
      if ($$1) {
         if (!this.fZ()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bgv t() {
      return this.cg;
   }

   @Override
   protected ia Q() {
      return bT;
   }

   @Override
   public boolean k(ciw $$0) {
      ciw $$1 = this.b(bgn.a);
      return !$$1.b() && this.dK().X().b(cpg.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(ciw $$0, ciw $$1) {
      return ciw.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(ciw $$0, ciw $$1) {
      qs $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qs $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rl $$6 = $$2.c("Potion");
            rl $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(bye $$0) {
      caw.a(this, this, $$0);
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<djf<?>, aki> $$0) {
      if (this.dK() instanceof aki $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean fZ() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dK().B && this.cX() && (!$$0 || !this.fW())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean ge() {
      return this.ch == null || !this.ch.a(this.di(), (double)dji.E.a()) || !this.dK().a_(this.ch).a(csl.dT);
   }

   public float E(float $$0) {
      return aro.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean ga() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return aro.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(ciw $$0, ciw $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ew() {
      super.ew();
      this.cg.f().forEach(this::b);
      ciw $$0 = this.c(bil.a);
      if (!$$0.b() && !cnf.e($$0)) {
         this.b($$0);
         this.a(bil.a, ciw.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      this.a_($$0);
      djr.a.a.encodeStart(rd.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gi());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         djr.a.a.parse(new Dynamic(rd.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.an.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean fX() {
      return false;
   }

   private void gf() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dK().r_() && this.ci == 0L && !this.gi()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(ciw $$0) {
      return bX.a($$0);
   }

   private void gg() {
      bvm $$0 = bik.b.a(this.dK());
      if ($$0 != null) {
         $$0.d(this.di());
         $$0.fF();
         $$0.gh();
         this.gh();
         this.dK().b($$0);
      }
   }

   private void gh() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gi() {
      return this.an.b(cb);
   }

   private void a(cbl $$0, ciw $$1) {
      if (!$$0.fR().d) {
         $$1.h(1);
      }
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(big $$0) {
      return 0.04F;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gj();
         }
      } else {
         super.b($$0);
      }
   }

   private void gj() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dK().a(iw.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public djr.a gb() {
      return this.cd;
   }

   @Override
   public djr.d gc() {
      return this.ce;
   }

   class a implements djk {
      private final djm b;
      private final int c;

      public a(djm $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public djm a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aki $$0, dji $$1, dji.a $$2, ehf $$3) {
         if ($$1 == dji.E) {
            bvm.this.b(gv.a($$3), true);
            return true;
         } else if ($$1 == dji.F) {
            bvm.this.b(gv.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements djr.d {
      private static final int b = 16;
      private final djm c = new djg(bvm.this, bvm.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djm b() {
         return this.c;
      }

      @Override
      public boolean a(aki $$0, gv $$1, dji $$2, dji.a $$3) {
         if (bvm.this.fQ()) {
            return false;
         } else {
            Optional<he> $$4 = bvm.this.dM().c(bry.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               he $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aki $$0, gv $$1, dji $$2, @Nullable big $$3, @Nullable big $$4, float $$5) {
         if ($$2 == dji.H) {
            bvn.a(bvm.this, new gv($$1));
         }
      }

      @Override
      public apy<dji> c() {
         return app.e;
      }
   }
}
