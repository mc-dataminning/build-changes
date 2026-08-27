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

public class bwy extends bum {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bim cf = bim.b(bip.aN.k(), bip.aN.l() - 0.4F);
   private static final aec<bwy.a> cg = aef.a(bwy.class, aee.z);
   private static final aec<Integer> ch = aef.a(bwy.class, aee.b);
   public final bih bT = new bih();
   public final bih bU = new bih();
   public final bih bW = new bih();
   public final bih bX = new bih();
   public final bih bY = new bih();

   public static bkg.a p() {
      return bjd.x().a(bkh.d, 0.1F).a(bkh.a, 14.0);
   }

   public bwy(bip<? extends bum> $$0, cpq $$1) {
      super($$0, $$1);
      this.an.a(cg, bwy.a.a);
      this.an.a(ch, 0);
      this.H().a(true);
      this.a(eas.j, -1.0F);
      this.a(eas.g, -1.0F);
      this.a(eas.y, -1.0F);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void z() {
      super.z();
      if (this.bM() || this.aX()) {
         this.a(eas.j, 0.0F);
      }
   }

   @Override
   public void A() {
      this.a(eas.j, -1.0F);
   }

   @Override
   public bim a(bjn $$0) {
      return this.an.a(cg) && this.gl() == bwy.a.f ? cf.a(this.dX()) : super.a($$0);
   }

   public boolean q() {
      return this.gl() == bwy.a.e;
   }

   public boolean t() {
      return this.bz.c(bsc.Q).orElse(false);
   }

   public boolean ga() {
      return !this.t() && !this.fX() && !this.aX() && !this.ge() && this.aA() && !this.bN() && !this.fO();
   }

   public boolean gg() {
      return this.gl() == bwy.a.f || this.gl() == bwy.a.e;
   }

   private gw gj() {
      ehi $$0 = this.gk();
      return gw.a($$0.a(), this.dr() + 0.2F, $$0.c());
   }

   private ehi gk() {
      return this.di().e(this.bG().a(2.25));
   }

   private bwy.a gl() {
      return this.an.b(cg);
   }

   private bwy b(bwy.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(aec<?> $$0) {
      if (cg.equals($$0)) {
         bwy.a $$1 = this.gl();
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

   public bwy a(bwy.a $$0) {
      switch ($$0) {
         case c:
            this.b(bwy.a.c).gn();
            break;
         case d:
            this.a(aoz.wF, 1.0F, 1.0F);
            this.b(bwy.a.d);
            break;
         case f:
            this.b(bwy.a.f).go();
            break;
         case g:
            this.a(aoz.wI, 1.0F, 1.0F);
            this.b(bwy.a.g);
            break;
         case b:
            this.a(aoz.wJ, 1.0F, 1.0F);
            this.b(bwy.a.b);
            break;
         case a:
            this.b(bwy.a.a);
            break;
         case e:
            this.b(bwy.a.e);
      }

      return this;
   }

   private bwy gn() {
      this.a(aoz.wE, 1.0F, this.i_() ? 1.3F : 1.0F);
      return this;
   }

   private bwy go() {
      this.an.b(ch, this.ah + 120);
      this.dK().a(this, (byte)63);
      return this;
   }

   public bwy w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gw> gh() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> btu.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gw::a)
         .filter($$0 -> this.dK().w_().a($$0))
         .map(gw::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gi() {
      return !this.fX() && !this.t() && !this.i_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gj().d());
   }

   private boolean i(gw $$0) {
      return this.dK().a_($$0).a(apo.cj)
         && this.gq().noneMatch($$1 -> hf.a(this.dK().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.H().a($$0, 1)).map(eaw::j).orElse(false);
   }

   private void gp() {
      if (!this.dK().r_() && this.an.b(ch) == this.ah) {
         akn $$0 = (akn)this.dK();
         ect $$1 = $$0.n().aH().getLootTable(ecj.aA);
         ecr $$2 = new ecr.a($$0).a(eew.f, this.gk()).a(eew.a, this).a(eev.i);
         List<cja> $$3 = $$1.a($$2);
         gw $$4 = this.gj();

         for (cja $$5 : $$3) {
            byi $$6 = new byi($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.o();
            $$0.b($$6);
         }

         this.a(aoz.wD, 1.0F, 1.0F);
      }
   }

   private bwy a(bih $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gw $$2 = this.gj();
         dfe $$3 = this.dK().a_($$2.d());
         if ($$3.l() != cyv.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehi $$5 = ehi.b($$2).b(0.0, -0.65F, 0.0);
               this.dK().a(new ip(ix.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dK().a(this.dp(), this.dr(), this.dv(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dK().a(djo.u, this.gj(), djo.a.a(this));
      }

      return this;
   }

   private bwy j(gw $$0) {
      List<hf> $$1 = this.gq().limit(20L).collect(Collectors.toList());
      $$1.add(0, hf.a(this.dK().ac(), $$0));
      this.dM().a(bsc.aP, $$1);
      return this;
   }

   private Stream<hf> gq() {
      return this.dM().c(bsc.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void eZ() {
      super.eZ();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dn().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehi(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(akn $$0, bum $$1) {
      cja $$2 = new cja(cjd.jU);
      byi $$3 = new byi($$0, this.di().a(), this.di().b(), this.di().c(), $$2);
      $$3.o();
      this.a($$0, $$1, null);
      this.a(aoz.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bhj $$0) {
      this.a(bwy.a.a);
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
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bgt $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dK().a(null, this, this.d($$2), apa.g, 1.0F, ars.b(this.dK().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gr() {
      if (this.dK().r_() && this.ah % 20 == 0) {
         this.dK().a(this.dp(), this.dr(), this.dv(), aoz.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.wy, 0.15F, 1.0F);
   }

   @Override
   public aoy d(cja $$0) {
      return aoz.wz;
   }

   @Override
   protected aoy r() {
      return Set.of(bwy.a.f, bwy.a.e).contains(this.gl()) ? null : aoz.wA;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.wB;
   }

   @Override
   protected aoy h_() {
      return aoz.wC;
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
   public big a(akn $$0, big $$1) {
      return bip.aN.a((cpq)$$0);
   }

   @Override
   public boolean a(bum $$0) {
      if (!($$0 instanceof bwy $$1)) {
         return false;
      } else {
         Set<bwy.a> $$2 = Set.of(bwy.a.a, bwy.a.c, bwy.a.b);
         return $$2.contains(this.gl()) && $$2.contains($$1.gl()) && super.a($$0);
      }
   }

   @Override
   public ehd k_() {
      return super.k_().g(0.6F);
   }

   @Override
   public boolean m(cja $$0) {
      return $$0.a(apw.aK);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return bwz.a(this.dN().a($$0));
   }

   @Override
   public bkb<bwy> dM() {
      return (bkb<bwy>)super.dM();
   }

   @Override
   protected bkb.b<bwy> dN() {
      return bkb.a(bwz.b, bwz.a);
   }

   @Override
   protected void V() {
      this.dK().ad().a("snifferBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().b("snifferActivityUpdate");
      bwz.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
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
