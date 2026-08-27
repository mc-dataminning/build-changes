import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwb extends bjv implements cbl, djw {
   private static final Logger e = LogUtils.getLogger();
   private static final hy bT = new hy(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cmm bX = cmm.a(cjo.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final aef<Boolean> ca = aei.a(bwb.class, aeh.k);
   private static final aef<Boolean> cb = aei.a(bwb.class, aeh.k);
   protected static final ImmutableList<bts<? extends btr<? super bwb>>> b = ImmutableList.of(bts.c, bts.d, bts.f, bts.b);
   protected static final ImmutableList<bsn<?>> c = ImmutableList.of(
      bsn.t, bsn.n, bsn.h, bsn.m, bsn.E, bsn.x, bsn.K, bsn.aL, bsn.aM, bsn.aN, bsn.aO, bsn.Y, new bsn[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final djk<djw.b> cc;
   private djw.a cd;
   private final djw.d ce;
   private final djk<bwb.a> cf;
   private final bhl cg = new bhl(1);
   @Nullable
   private gw ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bwb(bja<? extends bwb> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new bph(this, 20, true);
      this.s(this.fK());
      this.ce = new bwb.b();
      this.cd = new djw.a();
      this.cc = new djk<>(new djw.b(this));
      this.cf = new djk<>(new bwb.a(this.ce.b(), djn.E.a()));
   }

   @Override
   protected bkm.b<bwb> dO() {
      return bkm.a(c, b);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return bwc.a(this.dO().a($$0));
   }

   @Override
   public bkm<bwb> dN() {
      return (bkm<bwb>)super.dN();
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 20.0).a(bks.f, 0.1F).a(bks.m, 0.1F).a(bks.c, 2.0).a(bks.g, 48.0);
   }

   @Override
   protected bsv b(cqb $$0) {
      bst $$1 = new bst(this, $$0);
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
   public void h(ehh $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bjs.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bjs.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            this.a(this.fe(), $$0);
            this.a(bjs.a, this.do());
            this.f(this.do().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if ($$0.d() instanceof cca $$2) {
         Optional<UUID> $$3 = this.dN().c(bsn.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
   }

   @Override
   protected apf w() {
      return this.b(bjb.a) ? apg.a : apg.b;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.d;
   }

   @Override
   protected apf l_() {
      return apg.c;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   protected void X() {
      this.dL().ad().a("allayBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("allayActivityUpdate");
      bwc.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void b_() {
      super.b_();
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
            this.cj = asb.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = asb.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = asb.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         djw.c.a(this.dL(), this.cd, this.ce);
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
      return !this.b(bhd.a).b();
   }

   @Override
   public boolean f(cjl $$0) {
      return false;
   }

   private boolean gi() {
      return this.dN().a(bsn.aO, bso.a);
   }

   @Override
   protected bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      cjl $$3 = this.b(bhd.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dL().a(this, (byte)18);
         this.dL().a($$0, this, apg.E, aph.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bhe.a;
      } else if ($$3.b() && !$$2.b()) {
         cjl $$4 = $$2.c(1);
         this.a(bhd.a, $$4);
         this.a($$0, $$2);
         this.dL().a($$0, this, apg.e, aph.g, 2.0F, 1.0F);
         this.dN().a(bsn.aL, $$0.cv());
         return bhe.a;
      } else if (!$$3.b() && $$1 == bhd.a && $$2.b()) {
         this.a(bjb.a, cjl.b);
         this.dL().a($$0, this, apg.f, aph.g, 2.0F, 1.0F);
         this.a(bhd.a);

         for (cjl $$5 : this.y().f()) {
            blf.a(this, $$5, this.dj());
         }

         this.dN().b(bsn.aL);
         $$0.i($$3);
         return bhe.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gw $$0, boolean $$1) {
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
   public bhl y() {
      return this.cg;
   }

   @Override
   protected hy T() {
      return bT;
   }

   @Override
   public boolean k(cjl $$0) {
      cjl $$1 = this.b(bhd.a);
      return !$$1.b() && this.dL().X().b(cpx.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cjl $$0, cjl $$1) {
      return cjl.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cjl $$0, cjl $$1) {
      qw $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qw $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rq $$6 = $$2.c("Potion");
            rq $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(byt $$0) {
      cbl.a(this, this, $$0);
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<djk<?>, akt> $$0) {
      if (this.dL() instanceof akt $$1) {
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
      return this.ch == null || !this.ch.a(this.dj(), (double)djn.E.a()) || !this.dL().a_(this.ch).a(cte.dT);
   }

   public float E(float $$0) {
      return asb.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return asb.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cjl $$0, cjl $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ex() {
      super.ex();
      this.cg.f().forEach(this::b);
      cjl $$0 = this.c(bjb.a);
      if (!$$0.b() && !cnw.e($$0)) {
         this.b($$0);
         this.a(bjb.a, cjl.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      this.a_($$0);
      djw.a.a.encodeStart(ri.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         djw.a.a.parse(new Dynamic(ri.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

      if (!this.dL().w_() && this.ci == 0L && !this.gn()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(cjl $$0) {
      return bX.a($$0);
   }

   private void gl() {
      bwb $$0 = bja.b.a(this.dL());
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

   private void a(cca $$0, cjl $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(biw $$0) {
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
      this.dL().a(iv.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public djw.a gg() {
      return this.cd;
   }

   @Override
   public djw.d gh() {
      return this.ce;
   }

   class a implements djp {
      private final djr b;
      private final int c;

      public a(djr $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public djr a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(akt $$0, djn $$1, djn.a $$2, ehh $$3) {
         if ($$1 == djn.E) {
            bwb.this.b(gw.a($$3), true);
            return true;
         } else if ($$1 == djn.F) {
            bwb.this.b(gw.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements djw.d {
      private static final int b = 16;
      private final djr c = new djl(bwb.this, bwb.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djr b() {
         return this.c;
      }

      @Override
      public boolean a(akt $$0, gw $$1, djn $$2, djn.a $$3) {
         if (bwb.this.fU()) {
            return false;
         } else {
            Optional<hd> $$4 = bwb.this.dN().c(bsn.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               hd $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(akt $$0, gw $$1, djn $$2, @Nullable biw $$3, @Nullable biw $$4, float $$5) {
         if ($$2 == djn.H) {
            bwc.a(bwb.this, new gw($$1));
         }
      }

      @Override
      public aqk<djn> c() {
         return aqb.e;
      }
   }
}
