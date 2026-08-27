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

public class cae extends bxs {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final blq cf = blq.b(blt.aO.k(), blt.aO.l() - 0.4F);
   private static final agj<cae.a> cg = agm.a(cae.class, agl.z);
   private static final agj<Integer> ch = agm.a(cae.class, agl.b);
   public final bll bT = new bll();
   public final bll bU = new bll();
   public final bll bW = new bll();
   public final bll bX = new bll();
   public final bll bY = new bll();

   public static bnk.a u() {
      return bmh.C().a(bnl.m, 0.1F).a(bnl.l, 14.0);
   }

   public cae(blt<? extends bxs> $$0, cti $$1) {
      super($$0, $$1);
      this.an.a(cg, cae.a.a);
      this.an.a(ch, 0);
      this.N().a(true);
      this.a(eev.j, -1.0F);
      this.a(eev.g, -1.0F);
      this.a(eev.y, -1.0F);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(eev.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(eev.j, -1.0F);
   }

   @Override
   public blq a(bmr $$0) {
      return this.an.a(cg) && this.gp() == cae.a.f ? cf.a(this.dZ()) : super.a($$0);
   }

   public boolean w() {
      return this.gp() == cae.a.e;
   }

   public boolean A() {
      return this.bz.c(bvh.Q).orElse(false);
   }

   public boolean ge() {
      return !this.A() && !this.gb() && !this.aZ() && !this.gi() && this.aC() && !this.bO() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == cae.a.f || this.gp() == cae.a.e;
   }

   private hx gn() {
      elm $$0 = this.go();
      return hx.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private elm go() {
      return this.dk().e(this.bH().a(2.25));
   }

   private cae.a gp() {
      return this.an.b(cg);
   }

   private cae b(cae.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(agj<?> $$0) {
      if (cg.equals($$0)) {
         cae.a $$1 = this.gp();
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

         this.k_();
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

   public cae a(cae.a $$0) {
      switch ($$0) {
         case c:
            this.b(cae.a.c).gr();
            break;
         case d:
            this.a(arm.xv, 1.0F, 1.0F);
            this.b(cae.a.d);
            break;
         case f:
            this.b(cae.a.f).gs();
            break;
         case g:
            this.a(arm.xy, 1.0F, 1.0F);
            this.b(cae.a.g);
            break;
         case b:
            this.a(arm.xz, 1.0F, 1.0F);
            this.b(cae.a.b);
            break;
         case a:
            this.b(cae.a.a);
            break;
         case e:
            this.b(cae.a.e);
      }

      return this;
   }

   private cae gr() {
      this.a(arm.xu, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cae gs() {
      this.an.b(ch, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public cae w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hx> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bxa.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(hx::a)
         .filter($$0 -> this.dM().D_().a($$0))
         .map(hx::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gm() {
      return !this.gb() && !this.A() && !this.o_() && !this.aZ() && this.aC() && !this.bO() && this.i(this.gn().d());
   }

   private boolean i(hx $$0) {
      return this.dM().a_($$0).a(asb.cj)
         && this.gu().noneMatch($$1 -> ig.a(this.dM().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(eez::j).orElse(false);
   }

   private void gt() {
      if (!this.dM().y_() && this.an.b(ch) == this.ah) {
         amz $$0 = (amz)this.dM();
         egx $$1 = $$0.o().aJ().getLootTable(egn.aK);
         egv $$2 = new egv.a($$0).a(eja.f, this.go()).a(eja.a, this).a(eiz.i);
         List<cmr> $$3 = $$1.a($$2);
         hx $$4 = this.gn();

         for (cmr $$5 : $$3) {
            cbo $$6 = new cbo($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(arm.xt, 1.0F, 1.0F);
      }
   }

   private cae a(bll $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hx $$2 = this.gn();
         dja $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dco.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               elm $$5 = elm.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new jp(jx.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(dnk.u, this.gn(), dnk.a.a(this));
      }

      return this;
   }

   private cae j(hx $$0) {
      List<ig> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, ig.a(this.dM().ae(), $$0));
      this.dO().a(bvh.aP, $$1);
      return this;
   }

   private Stream<ig> gu() {
      return this.dO().c(bvh.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new elm(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(amz $$0, bxs $$1) {
      cmr $$2 = new cmr(cmu.kp);
      cbo $$3 = new cbo($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(arm.xA, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bkn $$0) {
      this.a(cae.a.a);
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
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bjv $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), arn.g, 1.0F, aui.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float di() {
      return super.di() + 0.3F;
   }

   private void gv() {
      if (this.dM().y_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), arm.xw, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.xo, 0.15F, 1.0F);
   }

   @Override
   public arl d(cmr $$0) {
      return arm.xp;
   }

   @Override
   protected arl y() {
      return Set.of(cae.a.f, cae.a.e).contains(this.gp()) ? null : arm.xq;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.xr;
   }

   @Override
   protected arl n_() {
      return arm.xs;
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
   public blk a(amz $$0, blk $$1) {
      return blt.aO.a((cti)$$0);
   }

   @Override
   public boolean a(bxs $$0) {
      if (!($$0 instanceof cae $$1)) {
         return false;
      } else {
         Set<cae.a> $$2 = Set.of(cae.a.a, cae.a.c, cae.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public elh i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(cmr $$0) {
      return $$0.a(asj.aK);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return caf.a(this.dP().a($$0));
   }

   @Override
   public bnf<cae> dO() {
      return (bnf<cae>)super.dO();
   }

   @Override
   protected bnf.b<cae> dP() {
      return bnf.a(caf.b, caf.a);
   }

   @Override
   protected void Z() {
      this.dM().af().a("snifferBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().b("snifferActivityUpdate");
      caf.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
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
