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

public class ckj extends chp {
   private static final int bL = 1700;
   private static final int bM = 6000;
   private static final int bN = 30;
   private static final int bO = 120;
   private static final int bP = 48000;
   private static final float bQ = 0.4F;
   private static final bvd bR = bvd.b(bvi.bi.l(), bvi.bi.m() - 0.4F).b(0.81F);
   private static final ajx<ckj.a> bS = akb.a(ckj.class, ajz.D);
   private static final ajx<Integer> bT = akb.a(ckj.class, ajz.b);
   public final bur bF = new bur();
   public final bur bG = new bur();
   public final bur bH = new bur();
   public final bur bJ = new bur();
   public final bur bK = new bur();

   public static bxf.a q() {
      return chp.gx().a(bxg.v, 0.1F).a(bxg.s, 14.0);
   }

   public ckj(bvi<? extends chp> $$0, dgz $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(eun.j, -1.0F);
      this.a(eun.g, -1.0F);
      this.a(eun.y, -1.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bS, ckj.a.a);
      $$0.a(bT, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bX() || this.bj()) {
         this.a(eun.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(eun.j, -1.0F);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.gF() == ckj.a.f ? bR.a(this.ei()) : super.e($$0);
   }

   public boolean t() {
      return this.gF() == ckj.a.e;
   }

   public boolean x() {
      return this.bs.c(cfc.R).orElse(false);
   }

   public boolean gs() {
      return !this.x() && !this.gp() && !this.bj() && !this.gC() && this.aJ() && !this.bY() && !this.O_();
   }

   public boolean gt() {
      return this.gF() == ckj.a.f || this.gF() == ckj.a.e;
   }

   private ji gw() {
      fbx $$0 = this.gE();
      return ji.a($$0.a(), this.dB() + 0.2F, $$0.c());
   }

   private fbx gE() {
      return this.ds().e(this.bU().c(2.25));
   }

   private ckj.a gF() {
      return this.al.a(bS);
   }

   private ckj b(ckj.a $$0) {
      this.al.a(bS, $$0);
      return this;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bS.equals($$0)) {
         ckj.a $$1 = this.gF();
         this.gG();
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

   private void gG() {
      this.bJ.a();
      this.bH.a();
      this.bK.a();
      this.bF.a();
      this.bG.a();
   }

   public ckj a(ckj.a $$0) {
      switch ($$0) {
         case a:
            this.b(ckj.a.a);
            break;
         case b:
            this.a(awa.zu, 1.0F, 1.0F);
            this.b(ckj.a.b);
            break;
         case c:
            this.b(ckj.a.c).gH();
            break;
         case d:
            this.a(awa.zq, 1.0F, 1.0F);
            this.b(ckj.a.d);
            break;
         case e:
            this.b(ckj.a.e);
            break;
         case f:
            this.b(ckj.a.f).gI();
            break;
         case g:
            this.a(awa.zt, 1.0F, 1.0F);
            this.b(ckj.a.g);
      }

      return this;
   }

   private ckj gH() {
      this.a(awa.zp, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private ckj gI() {
      this.al.a(bT, this.af + 120);
      this.dU().a(this, (byte)63);
      return this;
   }

   public ckj w(boolean $$0) {
      if ($$0) {
         this.j(this.aR());
      }

      return this;
   }

   Optional<ji> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgw.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ji::a)
         .filter($$0 -> this.dU().A_().a($$0))
         .map(ji::e)
         .filter(this::i)
         .findFirst();
   }

   boolean gv() {
      return !this.gp() && !this.x() && !this.n_() && !this.bj() && this.aJ() && !this.bY() && this.i(this.gw().e());
   }

   private boolean i(ji $$0) {
      return this.dU().a_($$0).a(awp.cw)
         && this.gK().noneMatch($$1 -> jq.a(this.dU().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(euk::j).orElse(false);
   }

   private void gJ() {
      if (this.dU() instanceof ard $$0 && this.al.a(bT) == this.af) {
         ji $$2 = this.gw();
         this.a($$0, ewk.aG, ($$1x, $$2x) -> {
            clw $$3 = new clw(this.dU(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awa.zo, 1.0F, 1.0F);
         return;
      }
   }

   private ckj a(bur $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         ji $$2 = this.gw();
         dxq $$3 = this.dU().a_($$2.e());
         if ($$3.o() != dqp.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fbx $$5 = fbx.b($$2).b(0.0, -0.65F, 0.0);
               this.dU().a(new ll(lt.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dU().a(this.dz(), this.dB(), this.dF(), $$3.A().f(), this.dl(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dU().a(ecp.u, this.gw(), ecp.a.a(this));
      }

      return this;
   }

   private ckj j(ji $$0) {
      List<jq> $$1 = this.gK().limit(20L).collect(Collectors.toList());
      $$1.add(0, jq.a(this.dU().aj(), $$0));
      this.ea().a(cfc.aQ, $$1);
      return this;
   }

   private Stream<jq> gK() {
      return this.ea().c(cfc.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bz.c();
      if ($$0 > 0.0) {
         double $$1 = this.dx().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbx(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ard $$0, chp $$1) {
      cxh $$2 = new cxh(cxl.kP);
      clw $$3 = new clw($$0, this.ds().a(), this.ds().b(), this.ds().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awa.zv, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btp $$0) {
      this.a(ckj.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gF()) {
         case e:
            this.gL();
            break;
         case f:
            this.a(this.bJ).gJ();
      }

      super.h();
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsy $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gy();
      }

      return $$4;
   }

   @Override
   protected void gy() {
      this.dU().a(null, this, awa.zk, awb.g, 1.0F, ayz.b(this.dU().A, 0.8F, 1.2F));
   }

   private void gL() {
      if (this.dU().w_() && this.af % 20 == 0) {
         this.dU().a(this.dz(), this.dB(), this.dF(), awa.zr, this.dl(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.zj, 0.15F, 1.0F);
   }

   @Override
   protected avz u() {
      return Set.of(ckj.a.f, ckj.a.e).contains(this.gF()) ? null : awa.zl;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.zm;
   }

   @Override
   protected avz l_() {
      return awa.zn;
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
   public buq a(ard $$0, buq $$1) {
      return bvi.bi.a($$0, bvh.e);
   }

   @Override
   public boolean a(chp $$0) {
      if (!($$0 instanceof ckj $$1)) {
         return false;
      } else {
         Set<ckj.a> $$2 = Set.of(ckj.a.a, ckj.a.c, ckj.a.b);
         return $$2.contains(this.gF()) && $$2.contains($$1.gF()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.aa);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return ckk.a(this.eb().a($$0));
   }

   @Override
   public bxa<ckj> ea() {
      return (bxa<ckj>)super.ea();
   }

   @Override
   protected bxa.b<ckj> eb() {
      return bxa.a(ckk.b, ckk.a);
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("snifferBrain");
      this.ea().a($$0, this);
      $$1.b("snifferActivityUpdate");
      ckk.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<ckj.a> h = axq.a(ckj.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, ckj.a> i = yl.a(h, ckj.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
