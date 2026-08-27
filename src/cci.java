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

public class cci extends bzt {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bnr cf = bnr.b(bnu.aP.k(), bnu.aP.l() - 0.4F).b(0.81F);
   private static final aie<cci.a> cg = aih.a(cci.class, aig.A);
   private static final aie<Integer> ch = aih.a(cci.class, aig.b);
   public final bnk bT = new bnk();
   public final bnk bU = new bnk();
   public final bnk bW = new bnk();
   public final bnk bX = new bnk();
   public final bnk bY = new bnk();

   public static bpk.a u() {
      return boi.C().a(bpl.o, 0.1F).a(bpl.n, 14.0);
   }

   public cci(bnu<? extends bzt> $$0, cvn $$1) {
      super($$0, $$1);
      this.am.a(cg, cci.a.a);
      this.am.a(ch, 0);
      this.N().a(true);
      this.a(eha.j, -1.0F);
      this.a(eha.g, -1.0F);
      this.a(eha.y, -1.0F);
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(eha.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(eha.j, -1.0F);
   }

   @Override
   public bnr e(bor $$0) {
      return this.am.a(cg) && this.gr() == cci.a.f ? cf.a(this.dZ()) : super.e($$0);
   }

   public boolean w() {
      return this.gr() == cci.a.e;
   }

   public boolean A() {
      return this.bz.c(bxh.R).orElse(false);
   }

   public boolean gg() {
      return !this.A() && !this.gd() && !this.aZ() && !this.gk() && this.aC() && !this.bO() && !this.fU();
   }

   public boolean gm() {
      return this.gr() == cci.a.f || this.gr() == cci.a.e;
   }

   private hz gp() {
      ens $$0 = this.gq();
      return hz.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private ens gq() {
      return this.dk().e(this.bH().a(2.25));
   }

   private cci.a gr() {
      return this.am.b(cg);
   }

   private cci b(cci.a $$0) {
      this.am.b(cg, $$0);
      return this;
   }

   @Override
   public void a(aie<?> $$0) {
      if (cg.equals($$0)) {
         cci.a $$1 = this.gr();
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

   public cci a(cci.a $$0) {
      switch ($$0) {
         case c:
            this.b(cci.a.c).gt();
            break;
         case d:
            this.a(atk.xK, 1.0F, 1.0F);
            this.b(cci.a.d);
            break;
         case f:
            this.b(cci.a.f).gu();
            break;
         case g:
            this.a(atk.xN, 1.0F, 1.0F);
            this.b(cci.a.g);
            break;
         case b:
            this.a(atk.xO, 1.0F, 1.0F);
            this.b(cci.a.b);
            break;
         case a:
            this.b(cci.a.a);
            break;
         case e:
            this.b(cci.a.e);
      }

      return this;
   }

   private cci gt() {
      this.a(atk.xJ, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cci gu() {
      this.am.b(ch, this.ag + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public cci w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hz> gn() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bzb.a(this, 10 + 2 * $$0, 3))
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
      return this.dM().a_($$0).a(atz.ck)
         && this.gw().noneMatch($$1 -> ii.a(this.dM().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(ehe::j).orElse(false);
   }

   private void gv() {
      if (!this.dM().y_() && this.am.b(ch) == this.ag) {
         aov $$0 = (aov)this.dM();
         ejd $$1 = $$0.o().aJ().getLootTable(eit.aK);
         ejb $$2 = new ejb.a($$0).a(elg.f, this.gq()).a(elg.a, this).a(elf.i);
         List<coz> $$3 = $$1.a($$2);
         hz $$4 = this.gp();

         for (coz $$5 : $$3) {
            cds $$6 = new cds($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(atk.xI, 1.0F, 1.0F);
      }
   }

   private cci a(bnk $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hz $$2 = this.gp();
         dlf $$3 = this.dM().a_($$2.d());
         if ($$3.l() != det.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ens $$5 = ens.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new jr(jz.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dM().a(dpp.u, this.gp(), dpp.a.a(this));
      }

      return this;
   }

   private cci j(hz $$0) {
      List<ii> $$1 = this.gw().limit(20L).collect(Collectors.toList());
      $$1.add(0, ii.a(this.dM().ae(), $$0));
      this.dO().a(bxh.aQ, $$1);
      return this;
   }

   private Stream<ii> gw() {
      return this.dO().c(bxh.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ens(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aov $$0, bzt $$1) {
      coz $$2 = new coz(cpc.kp);
      cds $$3 = new cds($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(atk.xP, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bmn $$0) {
      this.a(cci.a.a);
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
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      blu $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), atl.g, 1.0F, awh.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gx() {
      if (this.dM().y_() && this.ag % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), atk.xL, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.xD, 0.15F, 1.0F);
   }

   @Override
   public atj d(coz $$0) {
      return atk.xE;
   }

   @Override
   protected atj y() {
      return Set.of(cci.a.f, cci.a.e).contains(this.gr()) ? null : atk.xF;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.xG;
   }

   @Override
   protected atj n_() {
      return atk.xH;
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
   public bnj a(aov $$0, bnj $$1) {
      return bnu.aP.a((cvn)$$0);
   }

   @Override
   public boolean a(bzt $$0) {
      if (!($$0 instanceof cci $$1)) {
         return false;
      } else {
         Set<cci.a> $$2 = Set.of(cci.a.a, cci.a.c, cci.a.b);
         return $$2.contains(this.gr()) && $$2.contains($$1.gr()) && super.a($$0);
      }
   }

   @Override
   public enn i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(coz $$0) {
      return $$0.a(auh.aP);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return ccj.a(this.dP().a($$0));
   }

   @Override
   public bpf<cci> dO() {
      return (bpf<cci>)super.dO();
   }

   @Override
   protected bpf.b<cci> dP() {
      return bpf.a(ccj.b, ccj.a);
   }

   @Override
   protected void aa() {
      this.dM().af().a("snifferBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().b("snifferActivityUpdate");
      ccj.a(this);
      this.dM().af().c();
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

      public static final IntFunction<cci.a> h = auz.a(cci.a::a, values(), auz.a.a);
      public static final xo<ByteBuf, cci.a> i = xm.a(h, cci.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
