import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class car extends byc {
   private static final int ca = 1700;
   private static final int cb = 6000;
   private static final int cc = 30;
   private static final int cd = 120;
   private static final int ce = 48000;
   private static final float cf = 0.4F;
   private static final blz cg = blz.b(bmc.aP.k(), bmc.aP.l() - 0.4F).b(0.81F);
   private static final agn<car.a> ch = agq.a(car.class, agp.z);
   private static final agn<Integer> ci = agq.a(car.class, agp.b);
   public final bls bU = new bls();
   public final bls bV = new bls();
   public final bls bX = new bls();
   public final bls bY = new bls();
   public final bls bZ = new bls();

   public static bnt.a u() {
      return bmq.C().a(bnu.o, 0.1F).a(bnu.n, 14.0);
   }

   public car(bmc<? extends byc> $$0, ctx $$1) {
      super($$0, $$1);
      this.an.a(ch, car.a.a);
      this.an.a(ci, 0);
      this.N().a(true);
      this.a(efk.j, -1.0F);
      this.a(efk.g, -1.0F);
      this.a(efk.y, -1.0F);
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(efk.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(efk.j, -1.0F);
   }

   @Override
   public blz e(bna $$0) {
      return this.an.a(ch) && this.gq() == car.a.f ? cg.a(this.dY()) : super.e($$0);
   }

   public boolean w() {
      return this.gq() == car.a.e;
   }

   public boolean A() {
      return this.bz.c(bvq.R).orElse(false);
   }

   public boolean gf() {
      return !this.A() && !this.gc() && !this.aZ() && !this.gj() && this.aC() && !this.bO() && !this.fT();
   }

   public boolean gl() {
      return this.gq() == car.a.f || this.gq() == car.a.e;
   }

   private hx go() {
      emc $$0 = this.gp();
      return hx.a($$0.a(), this.ds() + 0.2F, $$0.c());
   }

   private emc gp() {
      return this.dj().e(this.bH().a(2.25));
   }

   private car.a gq() {
      return this.an.b(ch);
   }

   private car b(car.a $$0) {
      this.an.b(ch, $$0);
      return this;
   }

   @Override
   public void a(agn<?> $$0) {
      if (ch.equals($$0)) {
         car.a $$1 = this.gq();
         this.gr();
         switch ($$1) {
            case c:
               this.bV.b(this.ah);
               break;
            case d:
               this.bX.b(this.ah);
               break;
            case f:
               this.bY.b(this.ah);
               break;
            case g:
               this.bZ.b(this.ah);
               break;
            case b:
               this.bU.b(this.ah);
         }

         this.k_();
      }

      super.a($$0);
   }

   private void gr() {
      this.bY.a();
      this.bX.a();
      this.bZ.a();
      this.bU.a();
      this.bV.a();
   }

   public car a(car.a $$0) {
      switch ($$0) {
         case c:
            this.b(car.a.c).gs();
            break;
         case d:
            this.a(art.xK, 1.0F, 1.0F);
            this.b(car.a.d);
            break;
         case f:
            this.b(car.a.f).gt();
            break;
         case g:
            this.a(art.xN, 1.0F, 1.0F);
            this.b(car.a.g);
            break;
         case b:
            this.a(art.xO, 1.0F, 1.0F);
            this.b(car.a.b);
            break;
         case a:
            this.b(car.a.a);
            break;
         case e:
            this.b(car.a.e);
      }

      return this;
   }

   private car gs() {
      this.a(art.xJ, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private car gt() {
      this.an.b(ci, this.ah + 120);
      this.dL().a(this, (byte)63);
      return this;
   }

   public car w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hx> gm() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bxk.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(hx::a)
         .filter($$0 -> this.dL().D_().a($$0))
         .map(hx::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gn() {
      return !this.gc() && !this.A() && !this.o_() && !this.aZ() && this.aC() && !this.bO() && this.i(this.go().d());
   }

   private boolean i(hx $$0) {
      return this.dL().a_($$0).a(asi.cj)
         && this.gv().noneMatch($$1 -> ig.a(this.dL().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(efo::j).orElse(false);
   }

   private void gu() {
      if (!this.dL().y_() && this.an.b(ci) == this.ah) {
         ane $$0 = (ane)this.dL();
         ehn $$1 = $$0.o().aJ().getLootTable(ehd.aK);
         ehl $$2 = new ehl.a($$0).a(ejq.f, this.gp()).a(ejq.a, this).a(ejp.i);
         List<cng> $$3 = $$1.a($$2);
         hx $$4 = this.go();

         for (cng $$5 : $$3) {
            ccb $$6 = new ccb($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(art.xI, 1.0F, 1.0F);
      }
   }

   private car a(bls $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hx $$2 = this.go();
         djp $$3 = this.dL().a_($$2.d());
         if ($$3.l() != ddd.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               emc $$5 = emc.b($$2).b(0.0, -0.65F, 0.0);
               this.dL().a(new jp(jx.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dL().a(this.dq(), this.ds(), this.dw(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dL().a(dnz.u, this.go(), dnz.a.a(this));
      }

      return this;
   }

   private car j(hx $$0) {
      List<ig> $$1 = this.gv().limit(20L).collect(Collectors.toList());
      $$1.add(0, ig.a(this.dL().ae(), $$0));
      this.dN().a(bvq.aQ, $$1);
      return this;
   }

   private Stream<ig> gv() {
      return this.dN().c(bvq.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bM.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new emc(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ane $$0, byc $$1) {
      cng $$2 = new cng(cnj.kp);
      ccb $$3 = new ccb($$0, this.dj().a(), this.dj().b(), this.dj().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(art.xP, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bkv $$0) {
      this.a(car.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gq()) {
         case f:
            this.a(this.bY).gu();
            break;
         case e:
            this.gw();
      }

      super.l();
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bkc $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dL().a(null, this, this.d($$2), aru.g, 1.0F, aup.b(this.dL().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gw() {
      if (this.dL().y_() && this.ah % 20 == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), art.xL, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.xD, 0.15F, 1.0F);
   }

   @Override
   public ars d(cng $$0) {
      return art.xE;
   }

   @Override
   protected ars y() {
      return Set.of(car.a.f, car.a.e).contains(this.gq()) ? null : art.xF;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.xG;
   }

   @Override
   protected ars n_() {
      return art.xH;
   }

   @Override
   public int fH() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public blr a(ane $$0, blr $$1) {
      return bmc.aP.a((ctx)$$0);
   }

   @Override
   public boolean a(byc $$0) {
      if (!($$0 instanceof car $$1)) {
         return false;
      } else {
         Set<car.a> $$2 = Set.of(car.a.a, car.a.c, car.a.b);
         return $$2.contains(this.gq()) && $$2.contains($$1.gq()) && super.a($$0);
      }
   }

   @Override
   public elx i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(cng $$0) {
      return $$0.a(asq.aK);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return cas.a(this.dO().a($$0));
   }

   @Override
   public bno<car> dN() {
      return (bno<car>)super.dN();
   }

   @Override
   protected bno.b<car> dO() {
      return bno.a(cas.b, cas.a);
   }

   @Override
   protected void aa() {
      this.dL().af().a("snifferBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().b("snifferActivityUpdate");
      cas.a(this);
      this.dL().af().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
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
