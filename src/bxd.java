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

public class bxd extends bur {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bir cf = bir.b(biu.aN.k(), biu.aN.l() - 0.4F);
   private static final aee<bxd.a> cg = aeh.a(bxd.class, aeg.z);
   private static final aee<Integer> ch = aeh.a(bxd.class, aeg.b);
   public final bim bT = new bim();
   public final bim bU = new bim();
   public final bim bW = new bim();
   public final bim bX = new bim();
   public final bim bY = new bim();

   public static bkl.a s() {
      return bji.A().a(bkm.d, 0.1F).a(bkm.a, 14.0);
   }

   public bxd(biu<? extends bur> $$0, cpv $$1) {
      super($$0, $$1);
      this.an.a(cg, bxd.a.a);
      this.an.a(ch, 0);
      this.L().a(true);
      this.a(eax.j, -1.0F);
      this.a(eax.g, -1.0F);
      this.a(eax.y, -1.0F);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void C() {
      super.C();
      if (this.bM() || this.aX()) {
         this.a(eax.j, 0.0F);
      }
   }

   @Override
   public void E() {
      this.a(eax.j, -1.0F);
   }

   @Override
   public bir a(bjs $$0) {
      return this.an.a(cg) && this.go() == bxd.a.f ? cf.a(this.dY()) : super.a($$0);
   }

   public boolean t() {
      return this.go() == bxd.a.e;
   }

   public boolean y() {
      return this.bz.c(bsh.Q).orElse(false);
   }

   public boolean gd() {
      return !this.y() && !this.ga() && !this.aX() && !this.gh() && this.aA() && !this.bN() && !this.fR();
   }

   public boolean gj() {
      return this.go() == bxd.a.f || this.go() == bxd.a.e;
   }

   private gw gm() {
      ehn $$0 = this.gn();
      return gw.a($$0.a(), this.ds() + 0.2F, $$0.c());
   }

   private ehn gn() {
      return this.dj().e(this.bG().a(2.25));
   }

   private bxd.a go() {
      return this.an.b(cg);
   }

   private bxd b(bxd.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(aee<?> $$0) {
      if (cg.equals($$0)) {
         bxd.a $$1 = this.go();
         this.gp();
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

         this.i_();
      }

      super.a($$0);
   }

   private void gp() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bxd a(bxd.a $$0) {
      switch ($$0) {
         case c:
            this.b(bxd.a.c).gq();
            break;
         case d:
            this.a(apd.wF, 1.0F, 1.0F);
            this.b(bxd.a.d);
            break;
         case f:
            this.b(bxd.a.f).gr();
            break;
         case g:
            this.a(apd.wI, 1.0F, 1.0F);
            this.b(bxd.a.g);
            break;
         case b:
            this.a(apd.wJ, 1.0F, 1.0F);
            this.b(bxd.a.b);
            break;
         case a:
            this.b(bxd.a.a);
            break;
         case e:
            this.b(bxd.a.e);
      }

      return this;
   }

   private bxd gq() {
      this.a(apd.wE, 1.0F, this.m_() ? 1.3F : 1.0F);
      return this;
   }

   private bxd gr() {
      this.an.b(ch, this.ah + 120);
      this.dL().a(this, (byte)63);
      return this;
   }

   public bxd w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gw> gk() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> btz.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gw::a)
         .filter($$0 -> this.dL().B_().a($$0))
         .map(gw::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gl() {
      return !this.ga() && !this.y() && !this.m_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gm().d());
   }

   private boolean i(gw $$0) {
      return this.dL().a_($$0).a(aps.cj)
         && this.gt().noneMatch($$1 -> hd.a(this.dL().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(ebb::j).orElse(false);
   }

   private void gs() {
      if (!this.dL().w_() && this.an.b(ch) == this.ah) {
         akq $$0 = (akq)this.dL();
         ecy $$1 = $$0.n().aH().getLootTable(eco.aA);
         ecw $$2 = new ecw.a($$0).a(efb.f, this.gn()).a(efb.a, this).a(efa.i);
         List<cjf> $$3 = $$1.a($$2);
         gw $$4 = this.gm();

         for (cjf $$5 : $$3) {
            byn $$6 = new byn($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.t();
            $$0.b($$6);
         }

         this.a(apd.wD, 1.0F, 1.0F);
      }
   }

   private bxd a(bim $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gw $$2 = this.gm();
         dfj $$3 = this.dL().a_($$2.d());
         if ($$3.l() != cza.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehn $$5 = ehn.b($$2).b(0.0, -0.65F, 0.0);
               this.dL().a(new in(iv.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dL().a(this.dq(), this.ds(), this.dw(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dL().a(djt.u, this.gm(), djt.a.a(this));
      }

      return this;
   }

   private bxd j(gw $$0) {
      List<hd> $$1 = this.gt().limit(20L).collect(Collectors.toList());
      $$1.add(0, hd.a(this.dL().ac(), $$0));
      this.dN().a(bsh.aP, $$1);
      return this;
   }

   private Stream<hd> gt() {
      return this.dN().c(bsh.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehn(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(akq $$0, bur $$1) {
      cjf $$2 = new cjf(cji.jU);
      byn $$3 = new byn($$0, this.dj().a(), this.dj().b(), this.dj().c(), $$2);
      $$3.t();
      this.a($$0, $$1, null);
      this.a(apd.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bho $$0) {
      this.a(bxd.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.go()) {
         case f:
            this.a(this.bX).gs();
            break;
         case e:
            this.gu();
      }

      super.l();
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bgy $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dL().a(null, this, this.d($$2), ape.g, 1.0F, arw.b(this.dL().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gu() {
      if (this.dL().w_() && this.ah % 20 == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), apd.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.wy, 0.15F, 1.0F);
   }

   @Override
   public apc d(cjf $$0) {
      return apd.wz;
   }

   @Override
   protected apc w() {
      return Set.of(bxd.a.f, bxd.a.e).contains(this.go()) ? null : apd.wA;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.wB;
   }

   @Override
   protected apc l_() {
      return apd.wC;
   }

   @Override
   public int Z() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bil a(akq $$0, bil $$1) {
      return biu.aN.a((cpv)$$0);
   }

   @Override
   public boolean a(bur $$0) {
      if (!($$0 instanceof bxd $$1)) {
         return false;
      } else {
         Set<bxd.a> $$2 = Set.of(bxd.a.a, bxd.a.c, bxd.a.b);
         return $$2.contains(this.go()) && $$2.contains($$1.go()) && super.a($$0);
      }
   }

   @Override
   public ehi g_() {
      return super.g_().g(0.6F);
   }

   @Override
   public boolean m(cjf $$0) {
      return $$0.a(aqa.aK);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bxe.a(this.dO().a($$0));
   }

   @Override
   public bkg<bxd> dN() {
      return (bkg<bxd>)super.dN();
   }

   @Override
   protected bkg.b<bxd> dO() {
      return bkg.a(bxe.b, bxe.a);
   }

   @Override
   protected void X() {
      this.dL().ad().a("snifferBrain");
      this.dN().a((akq)this.dL(), this);
      this.dL().ad().b("snifferActivityUpdate");
      bxe.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   protected void W() {
      super.W();
      abb.a(this);
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
