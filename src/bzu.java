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

public class bzu extends bxi {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final blg cf = blg.b(blj.aO.k(), blj.aO.l() - 0.4F);
   private static final afz<bzu.a> cg = agc.a(bzu.class, agb.z);
   private static final afz<Integer> ch = agc.a(bzu.class, agb.b);
   public final blb bT = new blb();
   public final blb bU = new blb();
   public final blb bW = new blb();
   public final blb bX = new blb();
   public final blb bY = new blb();

   public static bna.a u() {
      return blx.C().a(bnb.m, 0.1F).a(bnb.l, 14.0);
   }

   public bzu(blj<? extends bxi> $$0, csy $$1) {
      super($$0, $$1);
      this.an.a(cg, bzu.a.a);
      this.an.a(ch, 0);
      this.N().a(true);
      this.a(eek.j, -1.0F);
      this.a(eek.g, -1.0F);
      this.a(eek.y, -1.0F);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(eek.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(eek.j, -1.0F);
   }

   @Override
   public blg a(bmh $$0) {
      return this.an.a(cg) && this.gp() == bzu.a.f ? cf.a(this.dZ()) : super.a($$0);
   }

   public boolean w() {
      return this.gp() == bzu.a.e;
   }

   public boolean A() {
      return this.bz.c(bux.Q).orElse(false);
   }

   public boolean ge() {
      return !this.A() && !this.gb() && !this.aZ() && !this.gi() && this.aC() && !this.bO() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == bzu.a.f || this.gp() == bzu.a.e;
   }

   private hv gn() {
      elb $$0 = this.go();
      return hv.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private elb go() {
      return this.dk().e(this.bH().a(2.25));
   }

   private bzu.a gp() {
      return this.an.b(cg);
   }

   private bzu b(bzu.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(afz<?> $$0) {
      if (cg.equals($$0)) {
         bzu.a $$1 = this.gp();
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

   public bzu a(bzu.a $$0) {
      switch ($$0) {
         case c:
            this.b(bzu.a.c).gr();
            break;
         case d:
            this.a(arc.xv, 1.0F, 1.0F);
            this.b(bzu.a.d);
            break;
         case f:
            this.b(bzu.a.f).gs();
            break;
         case g:
            this.a(arc.xy, 1.0F, 1.0F);
            this.b(bzu.a.g);
            break;
         case b:
            this.a(arc.xz, 1.0F, 1.0F);
            this.b(bzu.a.b);
            break;
         case a:
            this.b(bzu.a.a);
            break;
         case e:
            this.b(bzu.a.e);
      }

      return this;
   }

   private bzu gr() {
      this.a(arc.xu, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private bzu gs() {
      this.an.b(ch, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public bzu w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hv> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bwq.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(hv::a)
         .filter($$0 -> this.dM().D_().a($$0))
         .map(hv::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gm() {
      return !this.gb() && !this.A() && !this.o_() && !this.aZ() && this.aC() && !this.bO() && this.i(this.gn().d());
   }

   private boolean i(hv $$0) {
      return this.dM().a_($$0).a(arr.cj)
         && this.gu().noneMatch($$1 -> id.a(this.dM().ad(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(eeo::j).orElse(false);
   }

   private void gt() {
      if (!this.dM().y_() && this.an.b(ch) == this.ah) {
         amp $$0 = (amp)this.dM();
         egm $$1 = $$0.n().aJ().getLootTable(egc.aK);
         egk $$2 = new egk.a($$0).a(eip.f, this.go()).a(eip.a, this).a(eio.i);
         List<cmh> $$3 = $$1.a($$2);
         hv $$4 = this.gn();

         for (cmh $$5 : $$3) {
            cbe $$6 = new cbe($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(arc.xt, 1.0F, 1.0F);
      }
   }

   private bzu a(blb $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hv $$2 = this.gn();
         dip $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dce.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               elb $$5 = elb.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new jn(jv.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(dmz.u, this.gn(), dmz.a.a(this));
      }

      return this;
   }

   private bzu j(hv $$0) {
      List<id> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, id.a(this.dM().ad(), $$0));
      this.dO().a(bux.aP, $$1);
      return this;
   }

   private Stream<id> gu() {
      return this.dO().c(bux.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new elb(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(amp $$0, bxi $$1) {
      cmh $$2 = new cmh(cmk.kp);
      cbe $$3 = new cbe($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(arc.xA, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bkd $$0) {
      this.a(bzu.a.a);
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
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bjl $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), ard.g, 1.0F, aty.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float di() {
      return super.di() + 0.3F;
   }

   private void gv() {
      if (this.dM().y_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), arc.xw, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.xo, 0.15F, 1.0F);
   }

   @Override
   public arb d(cmh $$0) {
      return arc.xp;
   }

   @Override
   protected arb y() {
      return Set.of(bzu.a.f, bzu.a.e).contains(this.gp()) ? null : arc.xq;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.xr;
   }

   @Override
   protected arb n_() {
      return arc.xs;
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
   public bla a(amp $$0, bla $$1) {
      return blj.aO.a((csy)$$0);
   }

   @Override
   public boolean a(bxi $$0) {
      if (!($$0 instanceof bzu $$1)) {
         return false;
      } else {
         Set<bzu.a> $$2 = Set.of(bzu.a.a, bzu.a.c, bzu.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public ekw i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(cmh $$0) {
      return $$0.a(arz.aK);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return bzv.a(this.dP().a($$0));
   }

   @Override
   public bmv<bzu> dO() {
      return (bmv<bzu>)super.dO();
   }

   @Override
   protected bmv.b<bzu> dP() {
      return bmv.a(bzv.b, bzv.a);
   }

   @Override
   protected void Z() {
      this.dM().ae().a("snifferBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().b("snifferActivityUpdate");
      bzv.a(this);
      this.dM().ae().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
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
