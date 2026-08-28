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

public class clq extends cis {
   private static final int bL = 1700;
   private static final int bM = 6000;
   private static final int bN = 30;
   private static final int bO = 120;
   private static final int bP = 48000;
   private static final float bQ = 0.4F;
   private static final bwg bR = bwg.b(bwm.bj.l(), bwm.bj.m() - 0.4F).b(0.81F);
   private static final akj<clq.a> bS = akn.a(clq.class, akl.E);
   private static final akj<Integer> bT = akn.a(clq.class, akl.b);
   public final bvu bF = new bvu();
   public final bvu bG = new bvu();
   public final bvu bH = new bvu();
   public final bvu bJ = new bvu();
   public final bvu bK = new bvu();

   public static byh.a q() {
      return cis.gv().a(byi.v, 0.1F).a(byi.s, 14.0);
   }

   public clq(bwm<? extends cis> $$0, div $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(ewx.j, -1.0F);
      this.a(ewx.g, -1.0F);
      this.a(ewx.y, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bS, clq.a.a);
      $$0.a(bT, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bY() || this.bj()) {
         this.a(ewx.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(ewx.j, -1.0F);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.gD() == clq.a.f ? bR.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gD() == clq.a.e;
   }

   public boolean x() {
      return this.bs.c(cge.S).orElse(false);
   }

   public boolean gq() {
      return !this.x() && !this.gn() && !this.bj() && !this.gA() && this.aJ() && !this.bZ() && !this.O_();
   }

   public boolean gr() {
      return this.gD() == clq.a.f || this.gD() == clq.a.e;
   }

   private iu gu() {
      fei $$0 = this.gC();
      return iu.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fei gC() {
      return this.dt().e(this.bV().c(2.25));
   }

   private clq.a gD() {
      return this.al.a(bS);
   }

   private clq b(clq.a $$0) {
      this.al.a(bS, $$0);
      return this;
   }

   @Override
   public void a(akj<?> $$0) {
      if (bS.equals($$0)) {
         clq.a $$1 = this.gD();
         this.gE();
         switch ($$1) {
            case b:
               this.bF.b(this.af);
               break;
            case c:
               this.bG.b(this.af);
               break;
            case d:
               this.bH.b(this.af);
            case e:
            default:
               break;
            case f:
               this.bJ.b(this.af);
               break;
            case g:
               this.bK.b(this.af);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gE() {
      this.bJ.a();
      this.bH.a();
      this.bK.a();
      this.bF.a();
      this.bG.a();
   }

   public clq a(clq.a $$0) {
      switch ($$0) {
         case a:
            this.b(clq.a.a);
            break;
         case b:
            this.a(awn.zx, 1.0F, 1.0F);
            this.b(clq.a.b);
            break;
         case c:
            this.b(clq.a.c).gF();
            break;
         case d:
            this.a(awn.zt, 1.0F, 1.0F);
            this.b(clq.a.d);
            break;
         case e:
            this.b(clq.a.e);
            break;
         case f:
            this.b(clq.a.f).gG();
            break;
         case g:
            this.a(awn.zw, 1.0F, 1.0F);
            this.b(clq.a.g);
      }

      return this;
   }

   private clq gF() {
      this.a(awn.zs, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private clq gG() {
      this.al.a(bT, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public clq w(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<iu> gs() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> chy.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iu::a)
         .filter($$0 -> this.dV().A_().a($$0))
         .map(iu::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gt() {
      return !this.gn() && !this.x() && !this.n_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gu().e());
   }

   private boolean h(iu $$0) {
      return this.dV().a_($$0).a(axc.cw)
         && this.gI().noneMatch($$1 -> jd.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(ewu::j).orElse(false);
   }

   private void gH() {
      if (this.dV() instanceof arq $$0 && this.al.a(bT) == this.af) {
         iu $$2 = this.gu();
         this.a($$0, eyv.aG, ($$1x, $$2x) -> {
            cnd $$3 = new cnd(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awn.zr, 1.0F, 1.0F);
         return;
      }
   }

   private clq a(bvu $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iu $$2 = this.gu();
         dzz $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dsm.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fei $$5 = fei.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lp(lx.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(eez.u, this.gu(), eez.a.a(this));
      }

      return this;
   }

   private clq i(iu $$0) {
      List<jd> $$1 = this.gI().limit(20L).collect(Collectors.toList());
      $$1.add(0, jd.a(this.dV().aj(), $$0));
      this.eb().a(cge.aR, $$1);
      return this;
   }

   private Stream<jd> gI() {
      return this.eb().c(cge.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bz.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fei(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arq $$0, cis $$1) {
      cyy $$2 = new cyy(czc.kR);
      cnd $$3 = new cnd($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awn.zy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bus $$0) {
      this.a(clq.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gD()) {
         case e:
            this.gJ();
            break;
         case f:
            this.a(this.bJ).gH();
      }

      super.h();
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bub $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gw();
      }

      return $$4;
   }

   @Override
   protected void gw() {
      this.dV().a(null, this, awn.zn, awo.g, 1.0F, azm.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gJ() {
      if (this.dV().w_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.zu, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.zm, 0.15F, 1.0F);
   }

   @Override
   protected awm u() {
      return Set.of(clq.a.f, clq.a.e).contains(this.gD()) ? null : awn.zo;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.zp;
   }

   @Override
   protected awm l_() {
      return awn.zq;
   }

   @Override
   public int ad() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bvt a(arq $$0, bvt $$1) {
      return bwm.bj.a($$0, bwl.e);
   }

   @Override
   public boolean a(cis $$0) {
      if (!($$0 instanceof clq $$1)) {
         return false;
      } else {
         Set<clq.a> $$2 = Set.of(clq.a.a, clq.a.c, clq.a.b);
         return $$2.contains(this.gD()) && $$2.contains($$1.gD()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.aa);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return clr.a(this.ec().a($$0));
   }

   @Override
   public byc<clq> eb() {
      return (byc<clq>)super.eb();
   }

   @Override
   protected byc.b<clq> ec() {
      return byc.a(clr.b, clr.a);
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      clr.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<clq.a> h = ayc.a(clq.a::a, values(), ayc.a.a);
      public static final yw<ByteBuf, clq.a> i = yu.a(h, clq.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
