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

public class cak extends bxy {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final blw cf = blw.b(blz.aO.k(), blz.aO.l() - 0.4F);
   private static final agm<cak.a> cg = agp.a(cak.class, ago.z);
   private static final agm<Integer> ch = agp.a(cak.class, ago.b);
   public final blr bT = new blr();
   public final blr bU = new blr();
   public final blr bW = new blr();
   public final blr bX = new blr();
   public final blr bY = new blr();

   public static bnq.a u() {
      return bmn.C().a(bnr.m, 0.1F).a(bnr.l, 14.0);
   }

   public cak(blz<? extends bxy> $$0, ctp $$1) {
      super($$0, $$1);
      this.an.a(cg, cak.a.a);
      this.an.a(ch, 0);
      this.N().a(true);
      this.a(efc.j, -1.0F);
      this.a(efc.g, -1.0F);
      this.a(efc.y, -1.0F);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(efc.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(efc.j, -1.0F);
   }

   @Override
   public blw a(bmx $$0) {
      return this.an.a(cg) && this.gp() == cak.a.f ? cf.a(this.dZ()) : super.a($$0);
   }

   public boolean w() {
      return this.gp() == cak.a.e;
   }

   public boolean A() {
      return this.bz.c(bvn.Q).orElse(false);
   }

   public boolean ge() {
      return !this.A() && !this.gb() && !this.aZ() && !this.gi() && this.aC() && !this.bO() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == cak.a.f || this.gp() == cak.a.e;
   }

   private hx gn() {
      elt $$0 = this.go();
      return hx.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private elt go() {
      return this.dk().e(this.bH().a(2.25));
   }

   private cak.a gp() {
      return this.an.b(cg);
   }

   private cak b(cak.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(agm<?> $$0) {
      if (cg.equals($$0)) {
         cak.a $$1 = this.gp();
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

   public cak a(cak.a $$0) {
      switch ($$0) {
         case c:
            this.b(cak.a.c).gr();
            break;
         case d:
            this.a(ars.xv, 1.0F, 1.0F);
            this.b(cak.a.d);
            break;
         case f:
            this.b(cak.a.f).gs();
            break;
         case g:
            this.a(ars.xy, 1.0F, 1.0F);
            this.b(cak.a.g);
            break;
         case b:
            this.a(ars.xz, 1.0F, 1.0F);
            this.b(cak.a.b);
            break;
         case a:
            this.b(cak.a.a);
            break;
         case e:
            this.b(cak.a.e);
      }

      return this;
   }

   private cak gr() {
      this.a(ars.xu, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cak gs() {
      this.an.b(ch, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public cak w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hx> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bxg.a(this, 10 + 2 * $$0, 3))
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
      return this.dM().a_($$0).a(ash.cj)
         && this.gu().noneMatch($$1 -> ig.a(this.dM().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(efg::j).orElse(false);
   }

   private void gt() {
      if (!this.dM().y_() && this.an.b(ch) == this.ah) {
         and $$0 = (and)this.dM();
         ehe $$1 = $$0.o().aJ().getLootTable(egu.aK);
         ehc $$2 = new ehc.a($$0).a(ejh.f, this.go()).a(ejh.a, this).a(ejg.i);
         List<cmy> $$3 = $$1.a($$2);
         hx $$4 = this.gn();

         for (cmy $$5 : $$3) {
            cbu $$6 = new cbu($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(ars.xt, 1.0F, 1.0F);
      }
   }

   private cak a(blr $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hx $$2 = this.gn();
         djh $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dcv.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               elt $$5 = elt.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new jp(jx.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(dnr.u, this.gn(), dnr.a.a(this));
      }

      return this;
   }

   private cak j(hx $$0) {
      List<ig> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, ig.a(this.dM().ae(), $$0));
      this.dO().a(bvn.aP, $$1);
      return this;
   }

   private Stream<ig> gu() {
      return this.dO().c(bvn.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new elt(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(and $$0, bxy $$1) {
      cmy $$2 = new cmy(cnb.kp);
      cbu $$3 = new cbu($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(ars.xA, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bkt $$0) {
      this.a(cak.a.a);
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
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bkb $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), art.g, 1.0F, auo.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float di() {
      return super.di() + 0.3F;
   }

   private void gv() {
      if (this.dM().y_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), ars.xw, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.xo, 0.15F, 1.0F);
   }

   @Override
   public arr d(cmy $$0) {
      return ars.xp;
   }

   @Override
   protected arr y() {
      return Set.of(cak.a.f, cak.a.e).contains(this.gp()) ? null : ars.xq;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.xr;
   }

   @Override
   protected arr n_() {
      return ars.xs;
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
   public blq a(and $$0, blq $$1) {
      return blz.aO.a((ctp)$$0);
   }

   @Override
   public boolean a(bxy $$0) {
      if (!($$0 instanceof cak $$1)) {
         return false;
      } else {
         Set<cak.a> $$2 = Set.of(cak.a.a, cak.a.c, cak.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public elo i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(cmy $$0) {
      return $$0.a(asp.aK);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return cal.a(this.dP().a($$0));
   }

   @Override
   public bnl<cak> dO() {
      return (bnl<cak>)super.dO();
   }

   @Override
   protected bnl.b<cak> dP() {
      return bnl.a(cal.b, cal.a);
   }

   @Override
   protected void Z() {
      this.dM().af().a("snifferBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().b("snifferActivityUpdate");
      cal.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
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
