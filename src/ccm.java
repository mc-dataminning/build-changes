import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ccm extends bzx {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bnt cf = bnt.b(bnw.aP.k(), bnw.aP.l() - 0.4F).b(0.81F);
   private static final aie<ccm.a> cg = aih.a(ccm.class, aig.A);
   private static final aie<Integer> ch = aih.a(ccm.class, aig.b);
   public final bnm bT = new bnm();
   public final bnm bU = new bnm();
   public final bnm bW = new bnm();
   public final bnm bX = new bnm();
   public final bnm bY = new bnm();

   public static bpo.a u() {
      return bok.C().a(bpp.o, 0.1F).a(bpp.n, 14.0);
   }

   public ccm(bnw<? extends bzx> $$0, cvr $$1) {
      super($$0, $$1);
      this.am.a(cg, ccm.a.a);
      this.am.a(ch, 0);
      this.N().a(true);
      this.a(ehh.j, -1.0F);
      this.a(ehh.g, -1.0F);
      this.a(ehh.y, -1.0F);
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(ehh.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(ehh.j, -1.0F);
   }

   @Override
   public bnt e(bot $$0) {
      return this.am.a(cg) && this.gr() == ccm.a.f ? cf.a(this.dZ()) : super.e($$0);
   }

   public boolean w() {
      return this.gr() == ccm.a.e;
   }

   public boolean A() {
      return this.bz.c(bxl.R).orElse(false);
   }

   public boolean gg() {
      return !this.A() && !this.gd() && !this.aZ() && !this.gk() && this.aC() && !this.bO() && !this.fU();
   }

   public boolean gm() {
      return this.gr() == ccm.a.f || this.gr() == ccm.a.e;
   }

   private hz gp() {
      enz $$0 = this.gq();
      return hz.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private enz gq() {
      return this.dk().e(this.bH().a(2.25));
   }

   private ccm.a gr() {
      return this.am.b(cg);
   }

   private ccm b(ccm.a $$0) {
      this.am.b(cg, $$0);
      return this;
   }

   @Override
   public void a(aie<?> $$0) {
      if (cg.equals($$0)) {
         ccm.a $$1 = this.gr();
         this.gs();
         switch ($$1) {
            case c:
               this.bU.b(this.ag);
               break;
            case d:
               this.bW.b(this.ag);
               break;
            case f:
               this.bX.b(this.ag);
               break;
            case g:
               this.bY.b(this.ag);
               break;
            case b:
               this.bT.b(this.ag);
         }

         this.k_();
      }

      super.a($$0);
   }

   private void gs() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public ccm a(ccm.a $$0) {
      switch ($$0) {
         case c:
            this.b(ccm.a.c).gt();
            break;
         case d:
            this.a(atl.xL, 1.0F, 1.0F);
            this.b(ccm.a.d);
            break;
         case f:
            this.b(ccm.a.f).gu();
            break;
         case g:
            this.a(atl.xO, 1.0F, 1.0F);
            this.b(ccm.a.g);
            break;
         case b:
            this.a(atl.xP, 1.0F, 1.0F);
            this.b(ccm.a.b);
            break;
         case a:
            this.b(ccm.a.a);
            break;
         case e:
            this.b(ccm.a.e);
      }

      return this;
   }

   private ccm gt() {
      this.a(atl.xK, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private ccm gu() {
      this.am.b(ch, this.ag + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public ccm w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hz> gn() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bzf.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(hz::a)
         .filter($$0 -> this.dM().D_().a($$0))
         .map(hz::d)
         .filter(this::i)
         .findFirst();
   }

   boolean go() {
      return !this.gd() && !this.A() && !this.o_() && !this.aZ() && this.aC() && !this.bO() && this.i(this.gp().d());
   }

   private boolean i(hz $$0) {
      return this.dM().a_($$0).a(aua.ck)
         && this.gw().noneMatch($$1 -> ii.a(this.dM().ad(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(ehl::j).orElse(false);
   }

   private void gv() {
      if (!this.dM().y_() && this.am.b(ch) == this.ag) {
         aow $$0 = (aow)this.dM();
         ejk $$1 = $$0.o().aL().getLootTable(eja.aK);
         eji $$2 = new eji.a($$0).a(eln.f, this.gq()).a(eln.a, this).a(elm.i);
         List<cpd> $$3 = $$1.a($$2);
         hz $$4 = this.gp();

         for (cpd $$5 : $$3) {
            cdw $$6 = new cdw($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(atl.xJ, 1.0F, 1.0F);
      }
   }

   private ccm a(bnm $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hz $$2 = this.gp();
         dlj $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dex.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               enz $$5 = enz.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new jr(jz.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dM().a(dpw.u, this.gp(), dpw.a.a(this));
      }

      return this;
   }

   private ccm j(hz $$0) {
      List<ii> $$1 = this.gw().limit(20L).collect(Collectors.toList());
      $$1.add(0, ii.a(this.dM().ad(), $$0));
      this.dO().a(bxl.aQ, $$1);
      return this;
   }

   private Stream<ii> gw() {
      return this.dO().c(bxl.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new enz(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aow $$0, bzx $$1) {
      cpd $$2 = new cpd(cpg.kp);
      cdw $$3 = new cdw($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(atl.xQ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bmp $$0) {
      this.a(ccm.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gr()) {
         case f:
            this.a(this.bX).gv();
            break;
         case e:
            this.gx();
      }

      super.l();
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      blw $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), atm.g, 1.0F, awi.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gx() {
      if (this.dM().y_() && this.ag % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), atl.xM, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.xE, 0.15F, 1.0F);
   }

   @Override
   public atk d(cpd $$0) {
      return atl.xF;
   }

   @Override
   protected atk y() {
      return Set.of(ccm.a.f, ccm.a.e).contains(this.gr()) ? null : atl.xG;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.xH;
   }

   @Override
   protected atk n_() {
      return atl.xI;
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
   public bnl a(aow $$0, bnl $$1) {
      return bnw.aP.a((cvr)$$0);
   }

   @Override
   public boolean a(bzx $$0) {
      if (!($$0 instanceof ccm $$1)) {
         return false;
      } else {
         Set<ccm.a> $$2 = Set.of(ccm.a.a, ccm.a.c, ccm.a.b);
         return $$2.contains(this.gr()) && $$2.contains($$1.gr()) && super.a($$0);
      }
   }

   @Override
   public enu i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(cpd $$0) {
      return $$0.a(aui.aP);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return ccn.a(this.dP().a($$0));
   }

   @Override
   public bpj<ccm> dO() {
      return (bpj<ccm>)super.dO();
   }

   @Override
   protected bpj.b<ccm> dP() {
      return bpj.a(ccn.b, ccn.a);
   }

   @Override
   protected void aa() {
      this.dM().ae().a("snifferBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().b("snifferActivityUpdate");
      ccn.a(this);
      this.dM().ae().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<ccm.a> h = ava.a(ccm.a::a, values(), ava.a.a);
      public static final xo<ByteBuf, ccm.a> i = xm.a(h, ccm.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
