import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzc extends bmu implements cet, doa {
   private static final Logger e = LogUtils.getLogger();
   private static final jb bT = new jb(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cpz bX = cpz.a(cnb.oz);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final agm<Boolean> ca = agp.a(bzc.class, ago.k);
   private static final agm<Boolean> cb = agp.a(bzc.class, ago.k);
   protected static final ImmutableList<bwt<? extends bws<? super bzc>>> b = ImmutableList.of(bwt.c, bwt.d, bwt.f, bwt.b);
   protected static final ImmutableList<bvn<?>> c = ImmutableList.of(
      bvn.t, bvn.n, bvn.h, bvn.m, bvn.E, bvn.x, bvn.K, bvn.aL, bvn.aM, bvn.aN, bvn.aO, bvn.Y, new bvn[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dno<doa.b> cc;
   private doa.a cd;
   private final doa.d ce;
   private final dno<bzc.a> cf;
   private final bkj cg = new bkj(1);
   @Nullable
   private hx ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bzc(blz<? extends bzc> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new bsh(this, 20, true);
      this.s(this.fK());
      this.ce = new bzc.b();
      this.cd = new doa.a();
      this.cc = new dno<>(new doa.b(this));
      this.cf = new dno<>(new bzc.a(this.ce.b(), dnr.E.a()));
   }

   @Override
   protected bnl.b<bzc> dP() {
      return bnl.a(c, b);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return bzd.a(this.dP().a($$0));
   }

   @Override
   public bnl<bzc> dO() {
      return (bnl<bzc>)super.dO();
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 20.0).a(bnr.f, 0.1F).a(bnr.m, 0.1F).a(bnr.c, 2.0).a(bnr.g, 48.0);
   }

   @Override
   protected bvv b(ctp $$0) {
      bvt $$1 = new bvt(this, $$0);
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
   public void a(elt $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bmr.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bmr.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.ff(), $$0);
            this.a(bmr.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if ($$0.d() instanceof cfi $$2) {
         Optional<UUID> $$3 = this.dO().c(bvn.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hx $$0, djh $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
   }

   @Override
   protected arr y() {
      return this.b(bma.a) ? ars.a : ars.b;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.d;
   }

   @Override
   protected arr n_() {
      return ars.c;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dM().af().a("allayBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("allayActivityUpdate");
      bzd.a(this);
      this.dM().af().c();
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
            this.cj = auo.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = auo.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = auo.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         doa.c.a(this.dM(), this.cd, this.ce);
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
      return !this.b(bka.a).b();
   }

   @Override
   public boolean f(cmy $$0) {
      return false;
   }

   private boolean gi() {
      return this.dO().a(bvn.aO, bvo.a);
   }

   @Override
   protected bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      cmy $$3 = this.b(bka.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, ars.E, art.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bkb.a;
      } else if ($$3.b() && !$$2.b()) {
         cmy $$4 = $$2.c(1);
         this.a(bka.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, ars.e, art.g, 2.0F, 1.0F);
         this.dO().a(bvn.aL, $$0.cw());
         return bkb.a;
      } else if (!$$3.b() && $$1 == bka.a && $$2.b()) {
         this.a(bma.a, cmy.f);
         this.dM().a($$0, this, ars.f, art.g, 2.0F, 1.0F);
         this.a(bka.a);

         for (cmy $$5 : this.A().f()) {
            boe.a(this, $$5, this.dk());
         }

         this.dO().b(bvn.aL);
         $$0.i($$3);
         return bkb.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(hx $$0, boolean $$1) {
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
   public bkj A() {
      return this.cg;
   }

   @Override
   protected jb V() {
      return bT;
   }

   @Override
   public boolean k(cmy $$0) {
      cmy $$1 = this.b(bka.a);
      return !$$1.b() && this.dM().Z().b(ctl.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cmy $$0, cmy $$1) {
      return cmy.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cmy $$0, cmy $$1) {
      sn $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sn $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tk $$6 = $$2.c("Potion");
            tk $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cbu $$0) {
      cet.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dno<?>, and> $$0) {
      if (this.dM() instanceof and $$1) {
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
      return this.ch == null || !this.ch.a(this.dk(), (double)dnr.E.a()) || !this.dM().a_(this.ch).a(cws.dT);
   }

   public float E(float $$0) {
      return auo.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return auo.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cmy $$0, cmy $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ey() {
      super.ey();
      this.cg.f().forEach(this::b);
      cmy $$0 = this.c(bma.a);
      if (!$$0.b() && !crl.e($$0)) {
         this.b($$0);
         this.a(bma.a, cmy.f);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      this.a_($$0);
      doa.a.a.encodeStart(tb.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         doa.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

   private boolean l(cmy $$0) {
      return bX.a($$0);
   }

   private void gl() {
      bzc $$0 = blz.b.a(this.dM());
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

   private void a(cfi $$0, cmy $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   protected float l(blv $$0) {
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
      this.dM().a(jx.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public doa.a gg() {
      return this.cd;
   }

   @Override
   public doa.d gh() {
      return this.ce;
   }

   class a implements dnt {
      private final dnv b;
      private final int c;

      public a(dnv $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dnv a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(and $$0, dnr $$1, dnr.a $$2, elt $$3) {
         if ($$1 == dnr.E) {
            bzc.this.b(hx.a($$3), true);
            return true;
         } else if ($$1 == dnr.F) {
            bzc.this.b(hx.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements doa.d {
      private static final int b = 16;
      private final dnv c = new dnp(bzc.this, bzc.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dnv b() {
         return this.c;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnr $$2, dnr.a $$3) {
         if (bzc.this.fU()) {
            return false;
         } else {
            Optional<ig> $$4 = bzc.this.dO().c(bvn.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ig $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(and $$0, hx $$1, dnr $$2, @Nullable blv $$3, @Nullable blv $$4, float $$5) {
         if ($$2 == dnr.H) {
            bzd.a(bzc.this, new hx($$1));
         }
      }

      @Override
      public asw<dnr> c() {
         return asn.e;
      }
   }
}
