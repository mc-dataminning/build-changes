import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvq extends bjk implements cba, djx {
   private static final Logger e = LogUtils.getLogger();
   private static final ib bT = new ib(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cmb bX = cmb.a(cjd.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final aec<Boolean> ca = aef.a(bvq.class, aee.k);
   private static final aec<Boolean> cb = aef.a(bvq.class, aee.k);
   protected static final ImmutableList<bth<? extends btg<? super bvq>>> b = ImmutableList.of(bth.c, bth.d, bth.f, bth.b);
   protected static final ImmutableList<bsc<?>> c = ImmutableList.of(
      bsc.t, bsc.n, bsc.h, bsc.m, bsc.E, bsc.x, bsc.K, bsc.aL, bsc.aM, bsc.aN, bsc.aO, bsc.Y, new bsc[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final djl<djx.b> cc;
   private djx.a cd;
   private final djx.d ce;
   private final djl<bvq.a> cf;
   private final bha cg = new bha(1);
   @Nullable
   private gw ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bvq(bip<? extends bvq> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bow(this, 20, true);
      this.s(this.fG());
      this.ce = new bvq.b();
      this.cd = new djx.a();
      this.cc = new djl<>(new djx.b(this));
      this.cf = new djl<>(new bvq.a(this.ce.b(), djo.E.a()));
   }

   @Override
   protected bkb.b<bvq> dN() {
      return bkb.a(c, b);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return bvr.a(this.dN().a($$0));
   }

   @Override
   public bkb<bvq> dM() {
      return (bkb<bvq>)super.dM();
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 20.0).a(bkh.e, 0.1F).a(bkh.d, 0.1F).a(bkh.f, 2.0).a(bkh.b, 48.0);
   }

   @Override
   protected bsk b(cpq $$0) {
      bsi $$1 = new bsi(this, $$0);
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
   public void h(ehi $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bjh.a, this.dn());
            this.f(this.dn().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bjh.a, this.dn());
            this.f(this.dn().a(0.5));
         } else {
            this.a(this.fd(), $$0);
            this.a(bjh.a, this.dn());
            this.f(this.dn().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if ($$0.d() instanceof cbp $$2) {
         Optional<UUID> $$3 = this.dM().c(bsc.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
   }

   @Override
   protected aoy r() {
      return this.b(biq.a) ? aoz.a : aoz.b;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.d;
   }

   @Override
   protected aoy h_() {
      return aoz.c;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   protected void V() {
      this.dK().ad().a("allayBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("allayActivityUpdate");
      bvr.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B && this.bv() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.ga() && this.gf() && this.ah % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gg();
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B) {
         this.ck = this.cj;
         if (this.q()) {
            this.cj = ars.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = ars.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ga()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gb()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = ars.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         djx.c.a(this.dK(), this.cd, this.ce);
         if (this.fX()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fG() {
      return !this.ge() && this.q();
   }

   public boolean q() {
      return !this.b(bgs.a).b();
   }

   @Override
   public boolean f(cja $$0) {
      return false;
   }

   private boolean ge() {
      return this.dM().a(bsc.aO, bsd.a);
   }

   @Override
   protected bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      cja $$3 = this.b(bgs.a);
      if (this.ga() && this.l($$2) && this.gj()) {
         this.gh();
         this.dK().a(this, (byte)18);
         this.dK().a($$0, this, aoz.E, apa.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bgt.a;
      } else if ($$3.b() && !$$2.b()) {
         cja $$4 = $$2.c(1);
         this.a(bgs.a, $$4);
         this.a($$0, $$2);
         this.dK().a($$0, this, aoz.e, apa.g, 2.0F, 1.0F);
         this.dM().a(bsc.aL, $$0.cv());
         return bgt.a;
      } else if (!$$3.b() && $$1 == bgs.a && $$2.b()) {
         this.a(biq.a, cja.b);
         this.dK().a($$0, this, aoz.f, apa.g, 2.0F, 1.0F);
         this.a(bgs.a);

         for (cja $$5 : this.t().f()) {
            bku.a(this, $$5, this.di());
         }

         this.dM().b(bsc.aL);
         $$0.i($$3);
         return bgt.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gw $$0, boolean $$1) {
      if ($$1) {
         if (!this.ga()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bha t() {
      return this.cg;
   }

   @Override
   protected ib Q() {
      return bT;
   }

   @Override
   public boolean k(cja $$0) {
      cja $$1 = this.b(bgs.a);
      return !$$1.b() && this.dK().X().b(cpm.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cja $$0, cja $$1) {
      return cja.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cja $$0, cja $$1) {
      qu $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qu $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rn $$6 = $$2.c("Potion");
            rn $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(byi $$0) {
      cba.a(this, this, $$0);
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<djl<?>, akn> $$0) {
      if (this.dK() instanceof akn $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean ga() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dK().B && this.cX() && (!$$0 || !this.fX())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gf() {
      return this.ch == null || !this.ch.a(this.di(), (double)djo.E.a()) || !this.dK().a_(this.ch).a(csr.dT);
   }

   public float E(float $$0) {
      return ars.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gb() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return ars.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cja $$0, cja $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ew() {
      super.ew();
      this.cg.f().forEach(this::b);
      cja $$0 = this.c(biq.a);
      if (!$$0.b() && !cnl.e($$0)) {
         this.b($$0);
         this.a(biq.a, cja.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      this.a_($$0);
      djx.a.a.encodeStart(rf.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gj());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         djx.a.a.parse(new Dynamic(rf.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.an.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean fY() {
      return false;
   }

   private void gg() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dK().r_() && this.ci == 0L && !this.gj()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(cja $$0) {
      return bX.a($$0);
   }

   private void gh() {
      bvq $$0 = bip.b.a(this.dK());
      if ($$0 != null) {
         $$0.d(this.di());
         $$0.fF();
         $$0.gi();
         this.gi();
         this.dK().b($$0);
      }
   }

   private void gi() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gj() {
      return this.an.b(cb);
   }

   private void a(cbp $$0, cja $$1) {
      if (!$$0.fR().d) {
         $$1.h(1);
      }
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(bil $$0) {
      return 0.04F;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gk();
         }
      } else {
         super.b($$0);
      }
   }

   private void gk() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dK().a(ix.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public djx.a gc() {
      return this.cd;
   }

   @Override
   public djx.d gd() {
      return this.ce;
   }

   class a implements djq {
      private final djs b;
      private final int c;

      public a(djs $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public djs a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(akn $$0, djo $$1, djo.a $$2, ehi $$3) {
         if ($$1 == djo.E) {
            bvq.this.b(gw.a($$3), true);
            return true;
         } else if ($$1 == djo.F) {
            bvq.this.b(gw.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements djx.d {
      private static final int b = 16;
      private final djs c = new djm(bvq.this, bvq.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djs b() {
         return this.c;
      }

      @Override
      public boolean a(akn $$0, gw $$1, djo $$2, djo.a $$3) {
         if (bvq.this.fQ()) {
            return false;
         } else {
            Optional<hf> $$4 = bvq.this.dM().c(bsc.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               hf $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(akn $$0, gw $$1, djo $$2, @Nullable bil $$3, @Nullable bil $$4, float $$5) {
         if ($$2 == djo.H) {
            bvr.a(bvq.this, new gw($$1));
         }
      }

      @Override
      public aqd<djo> c() {
         return apu.e;
      }
   }
}
