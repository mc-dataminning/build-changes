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

public class bzd extends bwr {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bkr cf = bkr.b(bku.aN.k(), bku.aN.l() - 0.4F);
   private static final afo<bzd.a> cg = afr.a(bzd.class, afq.z);
   private static final afo<Integer> ch = afr.a(bzd.class, afq.b);
   public final bkm bT = new bkm();
   public final bkm bU = new bkm();
   public final bkm bW = new bkm();
   public final bkm bX = new bkm();
   public final bkm bY = new bkm();

   public static bml.a u() {
      return bli.C().a(bmm.m, 0.1F).a(bmm.l, 14.0);
   }

   public bzd(bku<? extends bwr> $$0, csa $$1) {
      super($$0, $$1);
      this.an.a(cg, bzd.a.a);
      this.an.a(ch, 0);
      this.N().a(true);
      this.a(edd.j, -1.0F);
      this.a(edd.g, -1.0F);
      this.a(edd.y, -1.0F);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(edd.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(edd.j, -1.0F);
   }

   @Override
   public bkr a(bls $$0) {
      return this.an.a(cg) && this.gq() == bzd.a.f ? cf.a(this.ea()) : super.a($$0);
   }

   public boolean w() {
      return this.gq() == bzd.a.e;
   }

   public boolean A() {
      return this.bz.c(buh.Q).orElse(false);
   }

   public boolean gf() {
      return !this.A() && !this.gc() && !this.aZ() && !this.gj() && this.aC() && !this.bO() && !this.fT();
   }

   public boolean gl() {
      return this.gq() == bzd.a.f || this.gq() == bzd.a.e;
   }

   private ht go() {
      eju $$0 = this.gp();
      return ht.a($$0.a(), this.du() + 0.2F, $$0.c());
   }

   private eju gp() {
      return this.dl().e(this.bH().a(2.25));
   }

   private bzd.a gq() {
      return this.an.b(cg);
   }

   private bzd b(bzd.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(afo<?> $$0) {
      if (cg.equals($$0)) {
         bzd.a $$1 = this.gq();
         this.gr();
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

         this.j_();
      }

      super.a($$0);
   }

   private void gr() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bzd a(bzd.a $$0) {
      switch ($$0) {
         case c:
            this.b(bzd.a.c).gs();
            break;
         case d:
            this.a(aqr.xa, 1.0F, 1.0F);
            this.b(bzd.a.d);
            break;
         case f:
            this.b(bzd.a.f).gt();
            break;
         case g:
            this.a(aqr.xd, 1.0F, 1.0F);
            this.b(bzd.a.g);
            break;
         case b:
            this.a(aqr.xe, 1.0F, 1.0F);
            this.b(bzd.a.b);
            break;
         case a:
            this.b(bzd.a.a);
            break;
         case e:
            this.b(bzd.a.e);
      }

      return this;
   }

   private bzd gs() {
      this.a(aqr.wZ, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private bzd gt() {
      this.an.b(ch, this.ah + 120);
      this.dN().a(this, (byte)63);
      return this;
   }

   public bzd w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<ht> gm() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bvz.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ht::a)
         .filter($$0 -> this.dN().C_().a($$0))
         .map(ht::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gn() {
      return !this.gc() && !this.A() && !this.n_() && !this.aZ() && this.aC() && !this.bO() && this.i(this.go().d());
   }

   private boolean i(ht $$0) {
      return this.dN().a_($$0).a(arg.cj)
         && this.gv().noneMatch($$1 -> ia.a(this.dN().ad(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(edh::j).orElse(false);
   }

   private void gu() {
      if (!this.dN().x_() && this.an.b(ch) == this.ah) {
         ame $$0 = (ame)this.dN();
         eff $$1 = $$0.n().aJ().getLootTable(eev.aA);
         efd $$2 = new efd.a($$0).a(ehi.f, this.gp()).a(ehi.a, this).a(ehh.i);
         List<clj> $$3 = $$1.a($$2);
         ht $$4 = this.go();

         for (clj $$5 : $$3) {
            can $$6 = new can($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(aqr.wY, 1.0F, 1.0F);
      }
   }

   private bzd a(bkm $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ht $$2 = this.go();
         dhi $$3 = this.dN().a_($$2.d());
         if ($$3.l() != dbf.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eju $$5 = eju.b($$2).b(0.0, -0.65F, 0.0);
               this.dN().a(new jk(js.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dN().a(this.ds(), this.du(), this.dy(), $$3.w().f(), this.dc(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dN().a(dls.u, this.go(), dls.a.a(this));
      }

      return this;
   }

   private bzd j(ht $$0) {
      List<ia> $$1 = this.gv().limit(20L).collect(Collectors.toList());
      $$1.add(0, ia.a(this.dN().ad(), $$0));
      this.dP().a(buh.aP, $$1);
      return this;
   }

   private Stream<ia> gv() {
      return this.dP().c(buh.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fc() {
      super.fc();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eju(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ame $$0, bwr $$1) {
      clj $$2 = new clj(clm.kp);
      can $$3 = new can($$0, this.dl().a(), this.dl().b(), this.dl().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(aqr.xf, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bjo $$0) {
      this.a(bzd.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gq()) {
         case f:
            this.a(this.bX).gu();
            break;
         case e:
            this.gw();
      }

      super.l();
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bix $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dN().a(null, this, this.d($$2), aqs.g, 1.0F, atm.b(this.dN().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dj() {
      return super.dj() + 0.3F;
   }

   private void gw() {
      if (this.dN().x_() && this.ah % 20 == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), aqr.xb, this.dc(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.wT, 0.15F, 1.0F);
   }

   @Override
   public aqq d(clj $$0) {
      return aqr.wU;
   }

   @Override
   protected aqq y() {
      return Set.of(bzd.a.f, bzd.a.e).contains(this.gq()) ? null : aqr.wV;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.wW;
   }

   @Override
   protected aqq m_() {
      return aqr.wX;
   }

   @Override
   public int ab() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bkl a(ame $$0, bkl $$1) {
      return bku.aN.a((csa)$$0);
   }

   @Override
   public boolean a(bwr $$0) {
      if (!($$0 instanceof bzd $$1)) {
         return false;
      } else {
         Set<bzd.a> $$2 = Set.of(bzd.a.a, bzd.a.c, bzd.a.b);
         return $$2.contains(this.gq()) && $$2.contains($$1.gq()) && super.a($$0);
      }
   }

   @Override
   public ejp h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean m(clj $$0) {
      return $$0.a(aro.aK);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return bze.a(this.dQ().a($$0));
   }

   @Override
   public bmg<bzd> dP() {
      return (bmg<bzd>)super.dP();
   }

   @Override
   protected bmg.b<bzd> dQ() {
      return bmg.a(bze.b, bze.a);
   }

   @Override
   protected void Z() {
      this.dN().ae().a("snifferBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().b("snifferActivityUpdate");
      bze.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
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
