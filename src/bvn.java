import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvn extends bjh implements cax, djs {
   private static final Logger e = LogUtils.getLogger();
   private static final hz bT = new hz(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final clx bX = clx.a(cja.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final adz<Boolean> ca = aec.a(bvn.class, aeb.k);
   private static final adz<Boolean> cb = aec.a(bvn.class, aeb.k);
   protected static final ImmutableList<bte<? extends btd<? super bvn>>> b = ImmutableList.of(bte.c, bte.d, bte.f, bte.b);
   protected static final ImmutableList<brz<?>> c = ImmutableList.of(
      brz.t, brz.n, brz.h, brz.m, brz.E, brz.x, brz.K, brz.aL, brz.aM, brz.aN, brz.aO, brz.Y, new brz[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final djg<djs.b> cc;
   private djs.a cd;
   private final djs.d ce;
   private final djg<bvn.a> cf;
   private final bgx cg = new bgx(1);
   @Nullable
   private gu ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bvn(bim<? extends bvn> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new bot(this, 20, true);
      this.s(this.fG());
      this.ce = new bvn.b();
      this.cd = new djs.a();
      this.cc = new djg<>(new djs.b(this));
      this.cf = new djg<>(new bvn.a(this.ce.b(), djj.E.a()));
   }

   @Override
   protected bjy.b<bvn> dN() {
      return bjy.a(c, b);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bvo.a(this.dN().a($$0));
   }

   @Override
   public bjy<bvn> dM() {
      return (bjy<bvn>)super.dM();
   }

   public static bkd.a p() {
      return bja.x().a(bke.a, 20.0).a(bke.e, 0.1F).a(bke.d, 0.1F).a(bke.f, 2.0).a(bke.b, 48.0);
   }

   @Override
   protected bsh b(cpl $$0) {
      bsf $$1 = new bsf(this, $$0);
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
   public void h(ehd $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bje.a, this.dn());
            this.f(this.dn().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bje.a, this.dn());
            this.f(this.dn().a(0.5));
         } else {
            this.a(this.fd(), $$0);
            this.a(bje.a, this.dn());
            this.f(this.dn().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if ($$0.d() instanceof cbm $$2) {
         Optional<UUID> $$3 = this.dM().c(brz.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gu $$0, dez $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dez $$2, gu $$3) {
   }

   @Override
   protected aov r() {
      return this.b(bin.a) ? aow.a : aow.b;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.d;
   }

   @Override
   protected aov h_() {
      return aow.c;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   protected void V() {
      this.dK().ad().a("allayBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("allayActivityUpdate");
      bvo.a(this);
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
            this.cj = arp.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = arp.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ga()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gb()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = arp.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         djs.c.a(this.dK(), this.cd, this.ce);
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
      return !this.b(bgp.a).b();
   }

   @Override
   public boolean f(cix $$0) {
      return false;
   }

   private boolean ge() {
      return this.dM().a(brz.aO, bsa.a);
   }

   @Override
   protected bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      cix $$3 = this.b(bgp.a);
      if (this.ga() && this.l($$2) && this.gj()) {
         this.gh();
         this.dK().a(this, (byte)18);
         this.dK().a($$0, this, aow.E, aox.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bgq.a;
      } else if ($$3.b() && !$$2.b()) {
         cix $$4 = $$2.c(1);
         this.a(bgp.a, $$4);
         this.a($$0, $$2);
         this.dK().a($$0, this, aow.e, aox.g, 2.0F, 1.0F);
         this.dM().a(brz.aL, $$0.cv());
         return bgq.a;
      } else if (!$$3.b() && $$1 == bgp.a && $$2.b()) {
         this.a(bin.a, cix.b);
         this.dK().a($$0, this, aow.f, aox.g, 2.0F, 1.0F);
         this.a(bgp.a);

         for (cix $$5 : this.t().f()) {
            bkr.a(this, $$5, this.di());
         }

         this.dM().b(brz.aL);
         $$0.i($$3);
         return bgq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gu $$0, boolean $$1) {
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
   public bgx t() {
      return this.cg;
   }

   @Override
   protected hz Q() {
      return bT;
   }

   @Override
   public boolean k(cix $$0) {
      cix $$1 = this.b(bgp.a);
      return !$$1.b() && this.dK().X().b(cph.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cix $$0, cix $$1) {
      return cix.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cix $$0, cix $$1) {
      qr $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qr $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rk $$6 = $$2.c("Potion");
            rk $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(byf $$0) {
      cax.a(this, this, $$0);
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<djg<?>, akk> $$0) {
      if (this.dK() instanceof akk $$1) {
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
      return this.ch == null || !this.ch.a(this.di(), (double)djj.E.a()) || !this.dK().a_(this.ch).a(csm.dT);
   }

   public float E(float $$0) {
      return arp.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gb() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return arp.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cix $$0, cix $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ew() {
      super.ew();
      this.cg.f().forEach(this::b);
      cix $$0 = this.c(bin.a);
      if (!$$0.b() && !cng.e($$0)) {
         this.b($$0);
         this.a(bin.a, cix.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.a_($$0);
      djs.a.a.encodeStart(rc.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gj());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         djs.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

   private boolean l(cix $$0) {
      return bX.a($$0);
   }

   private void gh() {
      bvn $$0 = bim.b.a(this.dK());
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

   private void a(cbm $$0, cix $$1) {
      if (!$$0.fR().d) {
         $$1.h(1);
      }
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(bii $$0) {
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
      this.dK().a(iv.M, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public djs.a gc() {
      return this.cd;
   }

   @Override
   public djs.d gd() {
      return this.ce;
   }

   class a implements djl {
      private final djn b;
      private final int c;

      public a(djn $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public djn a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(akk $$0, djj $$1, djj.a $$2, ehd $$3) {
         if ($$1 == djj.E) {
            bvn.this.b(gu.a($$3), true);
            return true;
         } else if ($$1 == djj.F) {
            bvn.this.b(gu.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements djs.d {
      private static final int b = 16;
      private final djn c = new djh(bvn.this, bvn.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djn b() {
         return this.c;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djj $$2, djj.a $$3) {
         if (bvn.this.fQ()) {
            return false;
         } else {
            Optional<hd> $$4 = bvn.this.dM().c(brz.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               hd $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(akk $$0, gu $$1, djj $$2, @Nullable bii $$3, @Nullable bii $$4, float $$5) {
         if ($$2 == djj.H) {
            bvo.a(bvn.this, new gu($$1));
         }
      }

      @Override
      public aqa<djj> c() {
         return apr.e;
      }
   }
}
