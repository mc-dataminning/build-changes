import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.joml.Vector3f;

public class bww extends buk {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bij cf = bij.b(bim.aN.k(), bim.aN.l() - 0.4F);
   private static final adz<bww.a> cg = aec.a(bww.class, aeb.z);
   private static final adz<Integer> ch = aec.a(bww.class, aeb.b);
   public final bie bT = new bie();
   public final bie bU = new bie();
   public final bie bW = new bie();
   public final bie bX = new bie();
   public final bie bY = new bie();

   public static bke.a p() {
      return bja.x().a(bkf.d, 0.1F).a(bkf.a, 14.0);
   }

   public bww(bim<? extends buk> $$0, cpm $$1) {
      super($$0, $$1);
      this.an.a(cg, bww.a.a);
      this.an.a(ch, 0);
      this.H().a(true);
      this.a(eao.j, -1.0F);
      this.a(eao.g, -1.0F);
      this.a(eao.y, -1.0F);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void z() {
      super.z();
      if (this.bM() || this.aX()) {
         this.a(eao.j, 0.0F);
      }
   }

   @Override
   public void A() {
      this.a(eao.j, -1.0F);
   }

   @Override
   public bij a(bjk $$0) {
      return this.an.a(cg) && this.gk() == bww.a.f ? cf.a(this.dX()) : super.a($$0);
   }

   public boolean q() {
      return this.gk() == bww.a.e;
   }

   public boolean t() {
      return this.bz.c(bsa.Q).orElse(false);
   }

   public boolean fZ() {
      return !this.t() && !this.fW() && !this.aX() && !this.gd() && this.aA() && !this.bN() && !this.fO();
   }

   public boolean gf() {
      return this.gk() == bww.a.f || this.gk() == bww.a.e;
   }

   private gu gi() {
      ehe $$0 = this.gj();
      return gu.a($$0.a(), this.dr() + 0.2F, $$0.c());
   }

   private ehe gj() {
      return this.di().e(this.bG().a(2.25));
   }

   private bww.a gk() {
      return this.an.b(cg);
   }

   private bww b(bww.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(adz<?> $$0) {
      if (cg.equals($$0)) {
         bww.a $$1 = this.gk();
         this.gl();
         switch ($$1) {
            case c:
               this.bU.b(this.ah);
               break;
            case d:
               this.bW.b(this.ah);
               break;
            case f:
               this.bX.b(this.ah);
               break;
            case g:
               this.bY.b(this.ah);
               break;
            case b:
               this.bT.b(this.ah);
         }

         this.e_();
      }

      super.a($$0);
   }

   private void gl() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bww a(bww.a $$0) {
      switch ($$0) {
         case c:
            this.b(bww.a.c).gm();
            break;
         case d:
            this.a(aow.wF, 1.0F, 1.0F);
            this.b(bww.a.d);
            break;
         case f:
            this.b(bww.a.f).gn();
            break;
         case g:
            this.a(aow.wI, 1.0F, 1.0F);
            this.b(bww.a.g);
            break;
         case b:
            this.a(aow.wJ, 1.0F, 1.0F);
            this.b(bww.a.b);
            break;
         case a:
            this.b(bww.a.a);
            break;
         case e:
            this.b(bww.a.e);
      }

      return this;
   }

   private bww gm() {
      this.a(aow.wE, 1.0F, this.i_() ? 1.3F : 1.0F);
      return this;
   }

   private bww gn() {
      this.an.b(ch, this.ah + 120);
      this.dK().a(this, (byte)63);
      return this;
   }

   public bww w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gu> gg() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bts.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gu::a)
         .filter($$0 -> this.dK().w_().a($$0))
         .map(gu::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gh() {
      return !this.fW() && !this.t() && !this.i_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gi().d());
   }

   private boolean i(gu $$0) {
      return this.dK().a_($$0).a(apl.cj)
         && this.gp().noneMatch($$1 -> hd.a(this.dK().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.H().a($$0, 1)).map(eas::j).orElse(false);
   }

   private void go() {
      if (!this.dK().r_() && this.an.b(ch) == this.ah) {
         akk $$0 = (akk)this.dK();
         ecp $$1 = $$0.n().aH().getLootTable(ecf.aA);
         ecn $$2 = new ecn.a($$0).a(ees.f, this.gj()).a(ees.a, this).a(eer.i);
         List<ciy> $$3 = $$1.a($$2);
         gu $$4 = this.gi();

         for (ciy $$5 : $$3) {
            byg $$6 = new byg($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.o();
            $$0.b($$6);
         }

         this.a(aow.wD, 1.0F, 1.0F);
      }
   }

   private bww a(bie $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gu $$2 = this.gi();
         dfa $$3 = this.dK().a_($$2.d());
         if ($$3.l() != cyr.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehe $$5 = ehe.b($$2).b(0.0, -0.65F, 0.0);
               this.dK().a(new in(iv.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dK().a(this.dp(), this.dr(), this.dv(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dK().a(djk.u, this.gi(), djk.a.a(this));
      }

      return this;
   }

   private bww j(gu $$0) {
      List<hd> $$1 = this.gp().limit(20L).collect(Collectors.toList());
      $$1.add(0, hd.a(this.dK().ac(), $$0));
      this.dM().a(bsa.aP, $$1);
      return this;
   }

   private Stream<hd> gp() {
      return this.dM().c(bsa.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void eZ() {
      super.eZ();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dn().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehe(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(akk $$0, buk $$1) {
      ciy $$2 = new ciy(cjb.jU);
      byg $$3 = new byg($$0, this.di().a(), this.di().b(), this.di().c(), $$2);
      $$3.o();
      this.a($$0, $$1, null);
      this.a(aow.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bhg $$0) {
      this.a(bww.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gk()) {
         case f:
            this.a(this.bX).go();
            break;
         case e:
            this.gq();
      }

      super.l();
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bgq $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dK().a(null, this, this.d($$2), aox.g, 1.0F, arp.b(this.dK().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gq() {
      if (this.dK().r_() && this.ah % 20 == 0) {
         this.dK().a(this.dp(), this.dr(), this.dv(), aow.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.wy, 0.15F, 1.0F);
   }

   @Override
   public aov d(ciy $$0) {
      return aow.wz;
   }

   @Override
   protected aov r() {
      return Set.of(bww.a.f, bww.a.e).contains(this.gk()) ? null : aow.wA;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.wB;
   }

   @Override
   protected aov h_() {
      return aow.wC;
   }

   @Override
   public int X() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bid a(akk $$0, bid $$1) {
      return bim.aN.a((cpm)$$0);
   }

   @Override
   public boolean a(buk $$0) {
      if (!($$0 instanceof bww $$1)) {
         return false;
      } else {
         Set<bww.a> $$2 = Set.of(bww.a.a, bww.a.c, bww.a.b);
         return $$2.contains(this.gk()) && $$2.contains($$1.gk()) && super.a($$0);
      }
   }

   @Override
   public egz k_() {
      return super.k_().g(0.6F);
   }

   @Override
   public boolean m(ciy $$0) {
      return $$0.a(apt.aK);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return bwx.a(this.dN().a($$0));
   }

   @Override
   public bjz<bww> dM() {
      return (bjz<bww>)super.dM();
   }

   @Override
   protected bjz.b<bww> dN() {
      return bjz.a(bwx.b, bwx.a);
   }

   @Override
   protected void V() {
      this.dK().ad().a("snifferBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().b("snifferActivityUpdate");
      bwx.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
