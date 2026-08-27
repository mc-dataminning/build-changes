import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwy extends bks implements cci, dku {
   private static final Logger e = LogUtils.getLogger();
   private static final iw bT = new iw(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cnk bX = cnk.a(ckm.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final afc<Boolean> ca = aff.a(bwy.class, afe.k);
   private static final afc<Boolean> cb = aff.a(bwy.class, afe.k);
   protected static final ImmutableList<bup<? extends buo<? super bwy>>> b = ImmutableList.of(bup.c, bup.d, bup.f, bup.b);
   protected static final ImmutableList<btk<?>> c = ImmutableList.of(
      btk.t, btk.n, btk.h, btk.m, btk.E, btk.x, btk.K, btk.aL, btk.aM, btk.aN, btk.aO, btk.Y, new btk[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dki<dku.b> cc;
   private dku.a cd;
   private final dku.d ce;
   private final dki<bwy.a> cf;
   private final bii cg = new bii(1);
   @Nullable
   private ht ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bwy(bjx<? extends bwy> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bqe(this, 20, true);
      this.s(this.fK());
      this.ce = new bwy.b();
      this.cd = new dku.a();
      this.cc = new dki<>(new dku.b(this));
      this.cf = new dki<>(new bwy.a(this.ce.b(), dkl.E.a()));
   }

   @Override
   protected blj.b<bwy> dO() {
      return blj.a(c, b);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return bwz.a(this.dO().a($$0));
   }

   @Override
   public blj<bwy> dN() {
      return (blj<bwy>)super.dN();
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 20.0).a(blp.f, 0.1F).a(blp.m, 0.1F).a(blp.c, 2.0).a(blp.g, 48.0);
   }

   @Override
   protected bts b(cqz $$0) {
      btq $$1 = new btq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, false);
      this.an.a(cb, true);
   }

   @Override
   public void h(eif $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bkp.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bkp.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            this.a(this.fe(), $$0);
            this.a(bkp.a, this.do());
            this.f(this.do().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if ($$0.d() instanceof ccx $$2) {
         Optional<UUID> $$3 = this.dN().c(btk.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
   }

   @Override
   protected aqc w() {
      return this.b(bjy.a) ? aqd.a : aqd.b;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.d;
   }

   @Override
   protected aqc m_() {
      return aqd.c;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   protected void X() {
      this.dL().ad().a("allayBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("allayActivityUpdate");
      bwz.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B && this.bv() && this.ah % 10 == 0) {
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
      if (this.dL().B) {
         this.ck = this.cj;
         if (this.t()) {
            this.cj = asy.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = asy.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = asy.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dku.c.a(this.dL(), this.cd, this.ce);
         if (this.gb()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fK() {
      return !this.gi() && this.t();
   }

   public boolean t() {
      return !this.b(bia.a).b();
   }

   @Override
   public boolean f(ckj $$0) {
      return false;
   }

   private boolean gi() {
      return this.dN().a(btk.aO, btl.a);
   }

   @Override
   protected bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      ckj $$3 = this.b(bia.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dL().a(this, (byte)18);
         this.dL().a($$0, this, aqd.E, aqe.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bib.a;
      } else if ($$3.b() && !$$2.b()) {
         ckj $$4 = $$2.c(1);
         this.a(bia.a, $$4);
         this.a($$0, $$2);
         this.dL().a($$0, this, aqd.e, aqe.g, 2.0F, 1.0F);
         this.dN().a(btk.aL, $$0.cv());
         return bib.a;
      } else if (!$$3.b() && $$1 == bia.a && $$2.b()) {
         this.a(bjy.a, ckj.b);
         this.dL().a($$0, this, aqd.f, aqe.g, 2.0F, 1.0F);
         this.a(bia.a);

         for (ckj $$5 : this.y().f()) {
            bmc.a(this, $$5, this.dj());
         }

         this.dN().b(btk.aL);
         $$0.i($$3);
         return bib.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ht $$0, boolean $$1) {
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
   public bii y() {
      return this.cg;
   }

   @Override
   protected iw T() {
      return bT;
   }

   @Override
   public boolean k(ckj $$0) {
      ckj $$1 = this.b(bia.a);
      return !$$1.b() && this.dL().X().b(cqv.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(ckj $$0, ckj $$1) {
      return ckj.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(ckj $$0, ckj $$1) {
      rt $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         rt $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            sn $$6 = $$2.c("Potion");
            sn $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(bzq $$0) {
      cci.a(this, this, $$0);
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<dki<?>, alq> $$0) {
      if (this.dL() instanceof alq $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean ge() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dL().B && this.cX() && (!$$0 || !this.gb())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gj() {
      return this.ch == null || !this.ch.a(this.dj(), (double)dkl.E.a()) || !this.dL().a_(this.ch).a(cuc.dT);
   }

   public float E(float $$0) {
      return asy.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return asy.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(ckj $$0, ckj $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ex() {
      super.ex();
      this.cg.f().forEach(this::b);
      ckj $$0 = this.c(bjy.a);
      if (!$$0.b() && !cov.e($$0)) {
         this.b($$0);
         this.a(bjy.a, ckj.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      this.a_($$0);
      dku.a.a.encodeStart(sf.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dku.a.a.parse(new Dynamic(sf.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

      if (!this.dL().x_() && this.ci == 0L && !this.gn()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(ckj $$0) {
      return bX.a($$0);
   }

   private void gl() {
      bwy $$0 = bjx.b.a(this.dL());
      if ($$0 != null) {
         $$0.d(this.dj());
         $$0.fJ();
         $$0.gm();
         this.gm();
         this.dL().b($$0);
      }
   }

   private void gm() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gn() {
      return this.an.b(cb);
   }

   private void a(ccx $$0, ckj $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(bjt $$0) {
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
      this.dL().a(js.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dku.a gg() {
      return this.cd;
   }

   @Override
   public dku.d gh() {
      return this.ce;
   }

   class a implements dkn {
      private final dkp b;
      private final int c;

      public a(dkp $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dkp a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(alq $$0, dkl $$1, dkl.a $$2, eif $$3) {
         if ($$1 == dkl.E) {
            bwy.this.b(ht.a($$3), true);
            return true;
         } else if ($$1 == dkl.F) {
            bwy.this.b(ht.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dku.d {
      private static final int b = 16;
      private final dkp c = new dkj(bwy.this, bwy.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dkp b() {
         return this.c;
      }

      @Override
      public boolean a(alq $$0, ht $$1, dkl $$2, dkl.a $$3) {
         if (bwy.this.fU()) {
            return false;
         } else {
            Optional<ia> $$4 = bwy.this.dN().c(btk.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ia $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(alq $$0, ht $$1, dkl $$2, @Nullable bjt $$3, @Nullable bjt $$4, float $$5) {
         if ($$2 == dkl.H) {
            bwz.a(bwy.this, new ht($$1));
         }
      }

      @Override
      public arh<dkl> c() {
         return aqy.e;
      }
   }
}
