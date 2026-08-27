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

public class caj extends bxx {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final blv cf = blv.b(bly.aO.k(), bly.aO.l() - 0.4F);
   private static final agm<caj.a> cg = agp.a(caj.class, ago.z);
   private static final agm<Integer> ch = agp.a(caj.class, ago.b);
   public final blq bT = new blq();
   public final blq bU = new blq();
   public final blq bW = new blq();
   public final blq bX = new blq();
   public final blq bY = new blq();

   public static bnp.a u() {
      return bmm.C().a(bnq.m, 0.1F).a(bnq.l, 14.0);
   }

   public caj(bly<? extends bxx> $$0, cto $$1) {
      super($$0, $$1);
      this.an.a(cg, caj.a.a);
      this.an.a(ch, 0);
      this.N().a(true);
      this.a(efb.j, -1.0F);
      this.a(efb.g, -1.0F);
      this.a(efb.y, -1.0F);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(efb.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(efb.j, -1.0F);
   }

   @Override
   public blv a(bmw $$0) {
      return this.an.a(cg) && this.gp() == caj.a.f ? cf.a(this.dZ()) : super.a($$0);
   }

   public boolean w() {
      return this.gp() == caj.a.e;
   }

   public boolean A() {
      return this.bz.c(bvm.Q).orElse(false);
   }

   public boolean ge() {
      return !this.A() && !this.gb() && !this.aZ() && !this.gi() && this.aC() && !this.bO() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == caj.a.f || this.gp() == caj.a.e;
   }

   private hx gn() {
      els $$0 = this.go();
      return hx.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private els go() {
      return this.dk().e(this.bH().a(2.25));
   }

   private caj.a gp() {
      return this.an.b(cg);
   }

   private caj b(caj.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(agm<?> $$0) {
      if (cg.equals($$0)) {
         caj.a $$1 = this.gp();
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

   public caj a(caj.a $$0) {
      switch ($$0) {
         case c:
            this.b(caj.a.c).gr();
            break;
         case d:
            this.a(arr.xv, 1.0F, 1.0F);
            this.b(caj.a.d);
            break;
         case f:
            this.b(caj.a.f).gs();
            break;
         case g:
            this.a(arr.xy, 1.0F, 1.0F);
            this.b(caj.a.g);
            break;
         case b:
            this.a(arr.xz, 1.0F, 1.0F);
            this.b(caj.a.b);
            break;
         case a:
            this.b(caj.a.a);
            break;
         case e:
            this.b(caj.a.e);
      }

      return this;
   }

   private caj gr() {
      this.a(arr.xu, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private caj gs() {
      this.an.b(ch, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public caj w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hx> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bxf.a(this, 10 + 2 * $$0, 3))
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
      return this.dM().a_($$0).a(asg.cj)
         && this.gu().noneMatch($$1 -> ig.a(this.dM().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(eff::j).orElse(false);
   }

   private void gt() {
      if (!this.dM().y_() && this.an.b(ch) == this.ah) {
         and $$0 = (and)this.dM();
         ehd $$1 = $$0.o().aJ().getLootTable(egt.aK);
         ehb $$2 = new ehb.a($$0).a(ejg.f, this.go()).a(ejg.a, this).a(ejf.i);
         List<cmx> $$3 = $$1.a($$2);
         hx $$4 = this.gn();

         for (cmx $$5 : $$3) {
            cbt $$6 = new cbt($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(arr.xt, 1.0F, 1.0F);
      }
   }

   private caj a(blq $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hx $$2 = this.gn();
         djg $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dcu.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               els $$5 = els.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new jp(jx.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(dnq.u, this.gn(), dnq.a.a(this));
      }

      return this;
   }

   private caj j(hx $$0) {
      List<ig> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, ig.a(this.dM().ae(), $$0));
      this.dO().a(bvm.aP, $$1);
      return this;
   }

   private Stream<ig> gu() {
      return this.dO().c(bvm.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new els(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(and $$0, bxx $$1) {
      cmx $$2 = new cmx(cna.kp);
      cbt $$3 = new cbt($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(arr.xA, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bks $$0) {
      this.a(caj.a.a);
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
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bka $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), ars.g, 1.0F, aun.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float di() {
      return super.di() + 0.3F;
   }

   private void gv() {
      if (this.dM().y_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), arr.xw, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.xo, 0.15F, 1.0F);
   }

   @Override
   public arq d(cmx $$0) {
      return arr.xp;
   }

   @Override
   protected arq y() {
      return Set.of(caj.a.f, caj.a.e).contains(this.gp()) ? null : arr.xq;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.xr;
   }

   @Override
   protected arq n_() {
      return arr.xs;
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
   public blp a(and $$0, blp $$1) {
      return bly.aO.a((cto)$$0);
   }

   @Override
   public boolean a(bxx $$0) {
      if (!($$0 instanceof caj $$1)) {
         return false;
      } else {
         Set<caj.a> $$2 = Set.of(caj.a.a, caj.a.c, caj.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public eln i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(cmx $$0) {
      return $$0.a(aso.aK);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return cak.a(this.dP().a($$0));
   }

   @Override
   public bnk<caj> dO() {
      return (bnk<caj>)super.dO();
   }

   @Override
   protected bnk.b<caj> dP() {
      return bnk.a(cak.b, cak.a);
   }

   @Override
   protected void Z() {
      this.dM().af().a("snifferBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().b("snifferActivityUpdate");
      cak.a(this);
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
