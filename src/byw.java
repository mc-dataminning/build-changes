import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class byw extends bmo implements cem, dnt {
   private static final Logger e = LogUtils.getLogger();
   private static final jb bT = new jb(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cps bX = cps.a(cmu.oz);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final agj<Boolean> ca = agm.a(byw.class, agl.k);
   private static final agj<Boolean> cb = agm.a(byw.class, agl.k);
   protected static final ImmutableList<bwn<? extends bwm<? super byw>>> b = ImmutableList.of(bwn.c, bwn.d, bwn.f, bwn.b);
   protected static final ImmutableList<bvh<?>> c = ImmutableList.of(
      bvh.t, bvh.n, bvh.h, bvh.m, bvh.E, bvh.x, bvh.K, bvh.aL, bvh.aM, bvh.aN, bvh.aO, bvh.Y, new bvh[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dnh<dnt.b> cc;
   private dnt.a cd;
   private final dnt.d ce;
   private final dnh<byw.a> cf;
   private final bkd cg = new bkd(1);
   @Nullable
   private hx ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public byw(blt<? extends byw> $$0, cti $$1) {
      super($$0, $$1);
      this.bL = new bsb(this, 20, true);
      this.s(this.fK());
      this.ce = new byw.b();
      this.cd = new dnt.a();
      this.cc = new dnh<>(new dnt.b(this));
      this.cf = new dnh<>(new byw.a(this.ce.b(), dnk.E.a()));
   }

   @Override
   protected bnf.b<byw> dP() {
      return bnf.a(c, b);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return byx.a(this.dP().a($$0));
   }

   @Override
   public bnf<byw> dO() {
      return (bnf<byw>)super.dO();
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 20.0).a(bnl.f, 0.1F).a(bnl.m, 0.1F).a(bnl.c, 2.0).a(bnl.g, 48.0);
   }

   @Override
   protected bvp b(cti $$0) {
      bvn $$1 = new bvn(this, $$0);
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
   public void a(elm $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bml.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bml.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.ff(), $$0);
            this.a(bml.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if ($$0.d() instanceof cfb $$2) {
         Optional<UUID> $$3 = this.dO().c(bvh.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hx $$0, dja $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dja $$2, hx $$3) {
   }

   @Override
   protected arl y() {
      return this.b(blu.a) ? arm.a : arm.b;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.d;
   }

   @Override
   protected arl n_() {
      return arm.c;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dM().af().a("allayBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("allayActivityUpdate");
      byx.a(this);
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
            this.cj = aui.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = aui.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = aui.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dnt.c.a(this.dM(), this.cd, this.ce);
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
      return !this.b(bju.a).b();
   }

   @Override
   public boolean f(cmr $$0) {
      return false;
   }

   private boolean gi() {
      return this.dO().a(bvh.aO, bvi.a);
   }

   @Override
   protected bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      cmr $$3 = this.b(bju.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, arm.E, arn.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bjv.a;
      } else if ($$3.b() && !$$2.b()) {
         cmr $$4 = $$2.c(1);
         this.a(bju.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, arm.e, arn.g, 2.0F, 1.0F);
         this.dO().a(bvh.aL, $$0.cw());
         return bjv.a;
      } else if (!$$3.b() && $$1 == bju.a && $$2.b()) {
         this.a(blu.a, cmr.f);
         this.dM().a($$0, this, arm.f, arn.g, 2.0F, 1.0F);
         this.a(bju.a);

         for (cmr $$5 : this.A().f()) {
            bny.a(this, $$5, this.dk());
         }

         this.dO().b(bvh.aL);
         $$0.i($$3);
         return bjv.a;
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
   public bkd A() {
      return this.cg;
   }

   @Override
   protected jb V() {
      return bT;
   }

   @Override
   public boolean k(cmr $$0) {
      cmr $$1 = this.b(bju.a);
      return !$$1.b() && this.dM().Z().b(cte.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cmr $$0, cmr $$1) {
      return cmr.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cmr $$0, cmr $$1) {
      sl $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sl $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            ti $$6 = $$2.c("Potion");
            ti $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cbo $$0) {
      cem.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dnh<?>, amz> $$0) {
      if (this.dM() instanceof amz $$1) {
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
      return this.ch == null || !this.ch.a(this.dk(), (double)dnk.E.a()) || !this.dM().a_(this.ch).a(cwl.dT);
   }

   public float E(float $$0) {
      return aui.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return aui.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cmr $$0, cmr $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ey() {
      super.ey();
      this.cg.f().forEach(this::b);
      cmr $$0 = this.c(blu.a);
      if (!$$0.b() && !cre.e($$0)) {
         this.b($$0);
         this.a(blu.a, cmr.f);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      this.a_($$0);
      dnt.a.a.encodeStart(sz.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dnt.a.a.parse(new Dynamic(sz.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

   private boolean l(cmr $$0) {
      return bX.a($$0);
   }

   private void gl() {
      byw $$0 = blt.b.a(this.dM());
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

   private void a(cfb $$0, cmr $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   protected float l(blp $$0) {
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
   public dnt.a gg() {
      return this.cd;
   }

   @Override
   public dnt.d gh() {
      return this.ce;
   }

   class a implements dnm {
      private final dno b;
      private final int c;

      public a(dno $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dno a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(amz $$0, dnk $$1, dnk.a $$2, elm $$3) {
         if ($$1 == dnk.E) {
            byw.this.b(hx.a($$3), true);
            return true;
         } else if ($$1 == dnk.F) {
            byw.this.b(hx.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dnt.d {
      private static final int b = 16;
      private final dno c = new dni(byw.this, byw.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dno b() {
         return this.c;
      }

      @Override
      public boolean a(amz $$0, hx $$1, dnk $$2, dnk.a $$3) {
         if (byw.this.fU()) {
            return false;
         } else {
            Optional<ig> $$4 = byw.this.dO().c(bvh.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ig $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(amz $$0, hx $$1, dnk $$2, @Nullable blp $$3, @Nullable blp $$4, float $$5) {
         if ($$2 == dnk.H) {
            byx.a(byw.this, new hx($$1));
         }
      }

      @Override
      public asq<dnk> c() {
         return ash.e;
      }
   }
}
