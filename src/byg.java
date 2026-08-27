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

public class byg extends bvu {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bju cf = bju.b(bjx.aN.k(), bjx.aN.l() - 0.4F);
   private static final afc<byg.a> cg = aff.a(byg.class, afe.z);
   private static final afc<Integer> ch = aff.a(byg.class, afe.b);
   public final bjp bT = new bjp();
   public final bjp bU = new bjp();
   public final bjp bW = new bjp();
   public final bjp bX = new bjp();
   public final bjp bY = new bjp();

   public static blo.a s() {
      return bkl.A().a(blp.m, 0.1F).a(blp.l, 14.0);
   }

   public byg(bjx<? extends bvu> $$0, cqz $$1) {
      super($$0, $$1);
      this.an.a(cg, byg.a.a);
      this.an.a(ch, 0);
      this.L().a(true);
      this.a(ebp.j, -1.0F);
      this.a(ebp.g, -1.0F);
      this.a(ebp.y, -1.0F);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void C() {
      super.C();
      if (this.bM() || this.aX()) {
         this.a(ebp.j, 0.0F);
      }
   }

   @Override
   public void E() {
      this.a(ebp.j, -1.0F);
   }

   @Override
   public bju a(bkv $$0) {
      return this.an.a(cg) && this.gp() == byg.a.f ? cf.a(this.dY()) : super.a($$0);
   }

   public boolean t() {
      return this.gp() == byg.a.e;
   }

   public boolean y() {
      return this.bz.c(btk.Q).orElse(false);
   }

   public boolean ge() {
      return !this.y() && !this.gb() && !this.aX() && !this.gi() && this.aA() && !this.bN() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == byg.a.f || this.gp() == byg.a.e;
   }

   private ht gn() {
      eif $$0 = this.go();
      return ht.a($$0.a(), this.ds() + 0.2F, $$0.c());
   }

   private eif go() {
      return this.dj().e(this.bG().a(2.25));
   }

   private byg.a gp() {
      return this.an.b(cg);
   }

   private byg b(byg.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(afc<?> $$0) {
      if (cg.equals($$0)) {
         byg.a $$1 = this.gp();
         this.gq();
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

   private void gq() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public byg a(byg.a $$0) {
      switch ($$0) {
         case c:
            this.b(byg.a.c).gr();
            break;
         case d:
            this.a(aqd.wH, 1.0F, 1.0F);
            this.b(byg.a.d);
            break;
         case f:
            this.b(byg.a.f).gs();
            break;
         case g:
            this.a(aqd.wK, 1.0F, 1.0F);
            this.b(byg.a.g);
            break;
         case b:
            this.a(aqd.wL, 1.0F, 1.0F);
            this.b(byg.a.b);
            break;
         case a:
            this.b(byg.a.a);
            break;
         case e:
            this.b(byg.a.e);
      }

      return this;
   }

   private byg gr() {
      this.a(aqd.wG, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private byg gs() {
      this.an.b(ch, this.ah + 120);
      this.dL().a(this, (byte)63);
      return this;
   }

   public byg w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<ht> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bvc.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ht::a)
         .filter($$0 -> this.dL().C_().a($$0))
         .map(ht::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gm() {
      return !this.gb() && !this.y() && !this.n_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gn().d());
   }

   private boolean i(ht $$0) {
      return this.dL().a_($$0).a(aqs.cj)
         && this.gu().noneMatch($$1 -> ia.a(this.dL().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(ebt::j).orElse(false);
   }

   private void gt() {
      if (!this.dL().x_() && this.an.b(ch) == this.ah) {
         alq $$0 = (alq)this.dL();
         edq $$1 = $$0.n().aH().getLootTable(edg.aA);
         edo $$2 = new edo.a($$0).a(eft.f, this.go()).a(eft.a, this).a(efs.i);
         List<ckj> $$3 = $$1.a($$2);
         ht $$4 = this.gn();

         for (ckj $$5 : $$3) {
            bzq $$6 = new bzq($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.t();
            $$0.b($$6);
         }

         this.a(aqd.wF, 1.0F, 1.0F);
      }
   }

   private byg a(bjp $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ht $$2 = this.gn();
         dgb $$3 = this.dL().a_($$2.d());
         if ($$3.l() != dae.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eif $$5 = eif.b($$2).b(0.0, -0.65F, 0.0);
               this.dL().a(new jk(js.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dL().a(this.dq(), this.ds(), this.dw(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dL().a(dkl.u, this.gn(), dkl.a.a(this));
      }

      return this;
   }

   private byg j(ht $$0) {
      List<ia> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, ia.a(this.dL().ac(), $$0));
      this.dN().a(btk.aP, $$1);
      return this;
   }

   private Stream<ia> gu() {
      return this.dN().c(btk.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eif(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(alq $$0, bvu $$1) {
      ckj $$2 = new ckj(ckm.jU);
      bzq $$3 = new bzq($$0, this.dj().a(), this.dj().b(), this.dj().c(), $$2);
      $$3.t();
      this.a($$0, $$1, null);
      this.a(aqd.wM, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bir $$0) {
      this.a(byg.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gp()) {
         case f:
            this.a(this.bX).gt();
            break;
         case e:
            this.gv();
      }

      super.l();
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bib $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dL().a(null, this, this.d($$2), aqe.g, 1.0F, asy.b(this.dL().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gv() {
      if (this.dL().x_() && this.ah % 20 == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), aqd.wI, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.wA, 0.15F, 1.0F);
   }

   @Override
   public aqc d(ckj $$0) {
      return aqd.wB;
   }

   @Override
   protected aqc w() {
      return Set.of(byg.a.f, byg.a.e).contains(this.gp()) ? null : aqd.wC;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.wD;
   }

   @Override
   protected aqc m_() {
      return aqd.wE;
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
   public bjo a(alq $$0, bjo $$1) {
      return bjx.aN.a((cqz)$$0);
   }

   @Override
   public boolean a(bvu $$0) {
      if (!($$0 instanceof byg $$1)) {
         return false;
      } else {
         Set<byg.a> $$2 = Set.of(byg.a.a, byg.a.c, byg.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public eia h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean m(ckj $$0) {
      return $$0.a(ara.aK);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return byh.a(this.dO().a($$0));
   }

   @Override
   public blj<byg> dN() {
      return (blj<byg>)super.dN();
   }

   @Override
   protected blj.b<byg> dO() {
      return blj.a(byh.b, byh.a);
   }

   @Override
   protected void X() {
      this.dL().ad().a("snifferBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().b("snifferActivityUpdate");
      byh.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
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
