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

public class clk extends cio {
   private static final int bL = 1700;
   private static final int bM = 6000;
   private static final int bN = 30;
   private static final int bO = 120;
   private static final int bP = 48000;
   private static final float bQ = 0.4F;
   private static final bwd bR = bwd.b(bwj.bj.l(), bwj.bj.m() - 0.4F).b(0.81F);
   private static final akh<clk.a> bS = akl.a(clk.class, akj.D);
   private static final akh<Integer> bT = akl.a(clk.class, akj.b);
   public final bvr bF = new bvr();
   public final bvr bG = new bvr();
   public final bvr bH = new bvr();
   public final bvr bJ = new bvr();
   public final bvr bK = new bvr();

   public static bye.a q() {
      return cio.gv().a(byf.v, 0.1F).a(byf.s, 14.0);
   }

   public clk(bwj<? extends cio> $$0, dip $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(ewm.j, -1.0F);
      this.a(ewm.g, -1.0F);
      this.a(ewm.y, -1.0F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bS, clk.a.a);
      $$0.a(bT, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bY() || this.bj()) {
         this.a(ewm.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(ewm.j, -1.0F);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.gD() == clk.a.f ? bR.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gD() == clk.a.e;
   }

   public boolean x() {
      return this.bs.c(cgb.S).orElse(false);
   }

   public boolean gq() {
      return !this.x() && !this.gn() && !this.bj() && !this.gA() && this.aJ() && !this.bZ() && !this.O_();
   }

   public boolean gr() {
      return this.gD() == clk.a.f || this.gD() == clk.a.e;
   }

   private iu gu() {
      fdw $$0 = this.gC();
      return iu.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fdw gC() {
      return this.dt().e(this.bV().c(2.25));
   }

   private clk.a gD() {
      return this.al.a(bS);
   }

   private clk b(clk.a $$0) {
      this.al.a(bS, $$0);
      return this;
   }

   @Override
   public void a(akh<?> $$0) {
      if (bS.equals($$0)) {
         clk.a $$1 = this.gD();
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

   public clk a(clk.a $$0) {
      switch ($$0) {
         case a:
            this.b(clk.a.a);
            break;
         case b:
            this.a(awl.zu, 1.0F, 1.0F);
            this.b(clk.a.b);
            break;
         case c:
            this.b(clk.a.c).gF();
            break;
         case d:
            this.a(awl.zq, 1.0F, 1.0F);
            this.b(clk.a.d);
            break;
         case e:
            this.b(clk.a.e);
            break;
         case f:
            this.b(clk.a.f).gG();
            break;
         case g:
            this.a(awl.zt, 1.0F, 1.0F);
            this.b(clk.a.g);
      }

      return this;
   }

   private clk gF() {
      this.a(awl.zp, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private clk gG() {
      this.al.a(bT, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public clk w(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<iu> gs() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> chv.a(this, 10 + 2 * $$0, 3))
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
      return this.dV().a_($$0).a(axa.cw)
         && this.gI().noneMatch($$1 -> jd.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(ewj::j).orElse(false);
   }

   private void gH() {
      if (this.dV() instanceof aro $$0 && this.al.a(bT) == this.af) {
         iu $$2 = this.gu();
         this.a($$0, eyj.aG, ($$1x, $$2x) -> {
            cmx $$3 = new cmx(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awl.zo, 1.0F, 1.0F);
         return;
      }
   }

   private clk a(bvr $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iu $$2 = this.gu();
         dzo $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dsf.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fdw $$5 = fdw.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lp(lx.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(eeo.u, this.gu(), eeo.a.a(this));
      }

      return this;
   }

   private clk i(iu $$0) {
      List<jd> $$1 = this.gI().limit(20L).collect(Collectors.toList());
      $$1.add(0, jd.a(this.dV().aj(), $$0));
      this.eb().a(cgb.aR, $$1);
      return this;
   }

   private Stream<jd> gI() {
      return this.eb().c(cgb.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bz.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fdw(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aro $$0, cio $$1) {
      cys $$2 = new cys(cyw.kP);
      cmx $$3 = new cmx($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awl.zv, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bup $$0) {
      this.a(clk.a.a);
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
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      boolean $$3 = this.k($$2);
      bty $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gw();
      }

      return $$4;
   }

   @Override
   protected void gw() {
      this.dV().a(null, this, awl.zk, awm.g, 1.0F, azk.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gJ() {
      if (this.dV().w_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awl.zr, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.zj, 0.15F, 1.0F);
   }

   @Override
   protected awk u() {
      return Set.of(clk.a.f, clk.a.e).contains(this.gD()) ? null : awl.zl;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.zm;
   }

   @Override
   protected awk l_() {
      return awl.zn;
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
   public bvq a(aro $$0, bvq $$1) {
      return bwj.bj.a($$0, bwi.e);
   }

   @Override
   public boolean a(cio $$0) {
      if (!($$0 instanceof clk $$1)) {
         return false;
      } else {
         Set<clk.a> $$2 = Set.of(clk.a.a, clk.a.c, clk.a.b);
         return $$2.contains(this.gD()) && $$2.contains($$1.gD()) && super.a($$0);
      }
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.aa);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cll.a(this.ec().a($$0));
   }

   @Override
   public bxz<clk> eb() {
      return (bxz<clk>)super.eb();
   }

   @Override
   protected bxz.b<clk> ec() {
      return bxz.a(cll.b, cll.a);
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cll.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<clk.a> h = aya.a(clk.a::a, values(), aya.a.a);
      public static final yu<ByteBuf, clk.a> i = ys.a(h, clk.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
