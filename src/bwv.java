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

public class bwv extends buj {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bij cf = bij.b(bim.aN.k(), bim.aN.l() - 0.4F);
   private static final adz<bwv.a> cg = aec.a(bwv.class, aeb.z);
   private static final adz<Integer> ch = aec.a(bwv.class, aeb.b);
   public final bie bT = new bie();
   public final bie bU = new bie();
   public final bie bW = new bie();
   public final bie bX = new bie();
   public final bie bY = new bie();

   public static bkd.a p() {
      return bja.x().a(bke.d, 0.1F).a(bke.a, 14.0);
   }

   public bwv(bim<? extends buj> $$0, cpl $$1) {
      super($$0, $$1);
      this.an.a(cg, bwv.a.a);
      this.an.a(ch, 0);
      this.H().a(true);
      this.a(ean.j, -1.0F);
      this.a(ean.g, -1.0F);
      this.a(ean.y, -1.0F);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void z() {
      super.z();
      if (this.bM() || this.aX()) {
         this.a(ean.j, 0.0F);
      }
   }

   @Override
   public void A() {
      this.a(ean.j, -1.0F);
   }

   @Override
   public bij a(bjk $$0) {
      return this.an.a(cg) && this.gl() == bwv.a.f ? cf.a(this.dX()) : super.a($$0);
   }

   public boolean q() {
      return this.gl() == bwv.a.e;
   }

   public boolean t() {
      return this.bz.c(brz.Q).orElse(false);
   }

   public boolean ga() {
      return !this.t() && !this.fX() && !this.aX() && !this.ge() && this.aA() && !this.bN() && !this.fO();
   }

   public boolean gg() {
      return this.gl() == bwv.a.f || this.gl() == bwv.a.e;
   }

   private gu gj() {
      ehd $$0 = this.gk();
      return gu.a($$0.a(), this.dr() + 0.2F, $$0.c());
   }

   private ehd gk() {
      return this.di().e(this.bG().a(2.25));
   }

   private bwv.a gl() {
      return this.an.b(cg);
   }

   private bwv b(bwv.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(adz<?> $$0) {
      if (cg.equals($$0)) {
         bwv.a $$1 = this.gl();
         this.gm();
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

   private void gm() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bwv a(bwv.a $$0) {
      switch ($$0) {
         case c:
            this.b(bwv.a.c).gn();
            break;
         case d:
            this.a(aow.wF, 1.0F, 1.0F);
            this.b(bwv.a.d);
            break;
         case f:
            this.b(bwv.a.f).go();
            break;
         case g:
            this.a(aow.wI, 1.0F, 1.0F);
            this.b(bwv.a.g);
            break;
         case b:
            this.a(aow.wJ, 1.0F, 1.0F);
            this.b(bwv.a.b);
            break;
         case a:
            this.b(bwv.a.a);
            break;
         case e:
            this.b(bwv.a.e);
      }

      return this;
   }

   private bwv gn() {
      this.a(aow.wE, 1.0F, this.i_() ? 1.3F : 1.0F);
      return this;
   }

   private bwv go() {
      this.an.b(ch, this.ah + 120);
      this.dK().a(this, (byte)63);
      return this;
   }

   public bwv w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gu> gh() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> btr.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gu::a)
         .filter($$0 -> this.dK().w_().a($$0))
         .map(gu::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gi() {
      return !this.fX() && !this.t() && !this.i_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gj().d());
   }

   private boolean i(gu $$0) {
      return this.dK().a_($$0).a(apl.cj)
         && this.gq().noneMatch($$1 -> hd.a(this.dK().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.H().a($$0, 1)).map(ear::j).orElse(false);
   }

   private void gp() {
      if (!this.dK().r_() && this.an.b(ch) == this.ah) {
         akk $$0 = (akk)this.dK();
         eco $$1 = $$0.n().aH().getLootTable(ece.aA);
         ecm $$2 = new ecm.a($$0).a(eer.f, this.gk()).a(eer.a, this).a(eeq.i);
         List<cix> $$3 = $$1.a($$2);
         gu $$4 = this.gj();

         for (cix $$5 : $$3) {
            byf $$6 = new byf($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.o();
            $$0.b($$6);
         }

         this.a(aow.wD, 1.0F, 1.0F);
      }
   }

   private bwv a(bie $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gu $$2 = this.gj();
         dez $$3 = this.dK().a_($$2.d());
         if ($$3.l() != cyq.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehd $$5 = ehd.b($$2).b(0.0, -0.65F, 0.0);
               this.dK().a(new in(iv.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dK().a(this.dp(), this.dr(), this.dv(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dK().a(djj.u, this.gj(), djj.a.a(this));
      }

      return this;
   }

   private bwv j(gu $$0) {
      List<hd> $$1 = this.gq().limit(20L).collect(Collectors.toList());
      $$1.add(0, hd.a(this.dK().ac(), $$0));
      this.dM().a(brz.aP, $$1);
      return this;
   }

   private Stream<hd> gq() {
      return this.dM().c(brz.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void eZ() {
      super.eZ();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dn().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehd(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(akk $$0, buj $$1) {
      cix $$2 = new cix(cja.jU);
      byf $$3 = new byf($$0, this.di().a(), this.di().b(), this.di().c(), $$2);
      $$3.o();
      this.a($$0, $$1, null);
      this.a(aow.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bhg $$0) {
      this.a(bwv.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gl()) {
         case f:
            this.a(this.bX).gp();
            break;
         case e:
            this.gr();
      }

      super.l();
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
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

   private void gr() {
      if (this.dK().r_() && this.ah % 20 == 0) {
         this.dK().a(this.dp(), this.dr(), this.dv(), aow.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.wy, 0.15F, 1.0F);
   }

   @Override
   public aov d(cix $$0) {
      return aow.wz;
   }

   @Override
   protected aov r() {
      return Set.of(bwv.a.f, bwv.a.e).contains(this.gl()) ? null : aow.wA;
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
      return bim.aN.a((cpl)$$0);
   }

   @Override
   public boolean a(buj $$0) {
      if (!($$0 instanceof bwv $$1)) {
         return false;
      } else {
         Set<bwv.a> $$2 = Set.of(bwv.a.a, bwv.a.c, bwv.a.b);
         return $$2.contains(this.gl()) && $$2.contains($$1.gl()) && super.a($$0);
      }
   }

   @Override
   public egy k_() {
      return super.k_().g(0.6F);
   }

   @Override
   public boolean m(cix $$0) {
      return $$0.a(apt.aK);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bww.a(this.dN().a($$0));
   }

   @Override
   public bjy<bwv> dM() {
      return (bjy<bwv>)super.dM();
   }

   @Override
   protected bjy.b<bwv> dN() {
      return bjy.a(bww.b, bww.a);
   }

   @Override
   protected void V() {
      this.dK().ad().a("snifferBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().b("snifferActivityUpdate");
      bww.a(this);
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
