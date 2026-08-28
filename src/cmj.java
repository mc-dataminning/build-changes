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

public class cmj extends cjk {
   private static final int bO = 1700;
   private static final int bP = 6000;
   private static final int bQ = 30;
   private static final int bR = 120;
   private static final int bS = 48000;
   private static final float bT = 0.4F;
   private static final bww bU = bww.b(bxc.bk.l(), bxc.bk.m() - 0.4F).b(0.81F);
   private static final akl<cmj.a> bV = akp.a(cmj.class, akn.G);
   private static final akl<Integer> bW = akp.a(cmj.class, akn.b);
   public final bwk bI = new bwk();
   public final bwk bJ = new bwk();
   public final bwk bK = new bwk();
   public final bwk bM = new bwk();
   public final bwk bN = new bwk();

   public static byz.a q() {
      return cjk.gz().a(bza.v, 0.1F).a(bza.s, 14.0);
   }

   public cmj(bxc<? extends cjk> $$0, djx $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(eyf.j, -1.0F);
      this.a(eyf.g, -1.0F);
      this.a(eyf.y, -1.0F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bV, cmj.a.a);
      $$0.a(bW, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bX() || this.bi()) {
         this.a(eyf.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(eyf.j, -1.0F);
   }

   @Override
   public bww e(byg $$0) {
      return this.gH() == cmj.a.f ? bU.a(this.ek()) : super.e($$0);
   }

   public boolean t() {
      return this.gH() == cmj.a.e;
   }

   public boolean x() {
      return this.bs.c(cgw.S).orElse(false);
   }

   public boolean gu() {
      return !this.x() && !this.gr() && !this.bi() && !this.gE() && this.aH() && !this.bY() && !this.S_();
   }

   public boolean gv() {
      return this.gH() == cmj.a.f || this.gH() == cmj.a.e;
   }

   private iv gy() {
      ffq $$0 = this.gG();
      return iv.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private ffq gG() {
      return this.dt().e(this.bU().c(2.25));
   }

   private cmj.a gH() {
      return this.al.a(bV);
   }

   private cmj b(cmj.a $$0) {
      this.al.a(bV, $$0);
      return this;
   }

   @Override
   public void a(akl<?> $$0) {
      if (bV.equals($$0)) {
         cmj.a $$1 = this.gH();
         this.gI();
         switch ($$1) {
            case b:
               this.bI.b(this.af);
               break;
            case c:
               this.bJ.b(this.af);
               break;
            case d:
               this.bK.b(this.af);
            case e:
            default:
               break;
            case f:
               this.bM.b(this.af);
               break;
            case g:
               this.bN.b(this.af);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gI() {
      this.bM.a();
      this.bK.a();
      this.bN.a();
      this.bI.a();
      this.bJ.a();
   }

   public cmj a(cmj.a $$0) {
      switch ($$0) {
         case a:
            this.b(cmj.a.a);
            break;
         case b:
            this.a(awp.zA, 1.0F, 1.0F);
            this.b(cmj.a.b);
            break;
         case c:
            this.b(cmj.a.c).gJ();
            break;
         case d:
            this.a(awp.zw, 1.0F, 1.0F);
            this.b(cmj.a.d);
            break;
         case e:
            this.b(cmj.a.e);
            break;
         case f:
            this.b(cmj.a.f).gK();
            break;
         case g:
            this.a(awp.zz, 1.0F, 1.0F);
            this.b(cmj.a.g);
      }

      return this;
   }

   private cmj gJ() {
      this.a(awp.zv, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private cmj gK() {
      this.al.a(bW, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cmj w(boolean $$0) {
      if ($$0) {
         this.i(this.aQ());
      }

      return this;
   }

   Optional<iv> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> ciq.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iv::a)
         .filter($$0 -> this.dV().E_().a($$0))
         .map(iv::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gx() {
      return !this.gr() && !this.x() && !this.n_() && !this.bi() && this.aH() && !this.bY() && this.h(this.gy().e());
   }

   private boolean h(iv $$0) {
      return this.dV().a_($$0).a(axe.cy)
         && this.gM().noneMatch($$1 -> je.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(eyc::j).orElse(false);
   }

   private void gL() {
      if (this.dV() instanceof ars $$0 && this.al.a(bW) == this.af) {
         iv $$2 = this.gy();
         this.a($$0, fad.aG, ($$1x, $$2x) -> {
            coc $$3 = new coc(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awp.zu, 1.0F, 1.0F);
         return;
      }
   }

   private cmj a(bwk $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iv $$2 = this.gy();
         ebe $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dtp.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ffq $$5 = ffq.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lq(ly.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ege.u, this.gy(), ege.a.a(this));
      }

      return this;
   }

   private cmj i(iv $$0) {
      List<je> $$1 = this.gM().limit(20L).collect(Collectors.toList());
      $$1.add(0, je.a(this.dV().aj(), $$0));
      this.ec().a(cgw.aR, $$1);
      return this;
   }

   private Stream<je> gM() {
      return this.ec().c(cgw.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bC.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ffq(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ars $$0, cjk $$1) {
      czy $$2 = new czy(dac.kU);
      coc $$3 = new coc($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awp.zB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bvi $$0) {
      this.a(cmj.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gH()) {
         case e:
            this.gN();
            break;
         case f:
            this.a(this.bM).gL();
      }

      super.h();
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      boolean $$3 = this.i($$2);
      bur $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gA();
      }

      return $$4;
   }

   @Override
   protected void gA() {
      this.dV().a(null, this, awp.zq, awq.g, 1.0F, azo.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gN() {
      if (this.dV().A_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awp.zx, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.zp, 0.15F, 1.0F);
   }

   @Override
   protected awo u() {
      return Set.of(cmj.a.f, cmj.a.e).contains(this.gH()) ? null : awp.zr;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.zs;
   }

   @Override
   protected awo l_() {
      return awp.zt;
   }

   @Override
   public int af() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.bk.a($$0, bxb.e);
   }

   @Override
   public boolean a(cjk $$0) {
      if (!($$0 instanceof cmj $$1)) {
         return false;
      } else {
         Set<cmj.a> $$2 = Set.of(cmj.a.a, cmj.a.c, cmj.a.b);
         return $$2.contains(this.gH()) && $$2.contains($$1.gH()) && super.a($$0);
      }
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ab);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cmk.a(this.ed().a($$0));
   }

   @Override
   public byu<cmj> ec() {
      return (byu<cmj>)super.ec();
   }

   @Override
   protected byu.b<cmj> ed() {
      return byu.a(cmk.b, cmk.a);
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cmk.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cmj.a> h = aye.a(cmj.a::a, values(), aye.a.a);
      public static final yy<ByteBuf, cmj.a> i = yw.a(h, cmj.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
