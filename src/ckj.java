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

public class ckj extends chs {
   private static final int cf = 1700;
   private static final int cg = 6000;
   private static final int ch = 30;
   private static final int ci = 120;
   private static final int cj = 48000;
   private static final float ck = 0.4F;
   private static final bvi cl = bvi.b(bvm.bj.l(), bvm.bj.m() - 0.4F).b(0.81F);
   private static final alc<ckj.a> cm = alg.a(ckj.class, ale.C);
   private static final alc<Integer> cn = alg.a(ckj.class, ale.b);
   public final bux bZ = new bux();
   public final bux ca = new bux();
   public final bux cb = new bux();
   public final bux cd = new bux();
   public final bux ce = new bux();

   public static bxi.a p() {
      return chs.gr().a(bxj.v, 0.1F).a(bxj.s, 14.0);
   }

   public ckj(bvm<? extends chs> $$0, dha $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eug.j, -1.0F);
      this.a(eug.g, -1.0F);
      this.a(eug.y, -1.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cm, ckj.a.a);
      $$0.a(cn, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(eug.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(eug.j, -1.0F);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.gz() == ckj.a.f ? cl.a(this.ei()) : super.e($$0);
   }

   public boolean t() {
      return this.gz() == ckj.a.e;
   }

   public boolean x() {
      return this.bF.c(cff.R).orElse(false);
   }

   public boolean gm() {
      return !this.x() && !this.gj() && !this.bj() && !this.gw() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gn() {
      return this.gz() == ckj.a.f || this.gz() == ckj.a.e;
   }

   private jh gq() {
      fbs $$0 = this.gy();
      return jh.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fbs gy() {
      return this.dt().e(this.bV().c(2.25));
   }

   private ckj.a gz() {
      return this.al.a(cm);
   }

   private ckj b(ckj.a $$0) {
      this.al.a(cm, $$0);
      return this;
   }

   @Override
   public void a(alc<?> $$0) {
      if (cm.equals($$0)) {
         ckj.a $$1 = this.gz();
         this.gA();
         switch ($$1) {
            case b:
               this.bZ.b(this.af);
               break;
            case c:
               this.ca.b(this.af);
               break;
            case d:
               this.cb.b(this.af);
            case e:
            default:
               break;
            case f:
               this.cd.b(this.af);
               break;
            case g:
               this.ce.b(this.af);
         }

         this.m_();
      }

      super.a($$0);
   }

   private void gA() {
      this.cd.a();
      this.cb.a();
      this.ce.a();
      this.bZ.a();
      this.ca.a();
   }

   public ckj a(ckj.a $$0) {
      switch ($$0) {
         case a:
            this.b(ckj.a.a);
            break;
         case b:
            this.a(axf.yU, 1.0F, 1.0F);
            this.b(ckj.a.b);
            break;
         case c:
            this.b(ckj.a.c).gB();
            break;
         case d:
            this.a(axf.yQ, 1.0F, 1.0F);
            this.b(ckj.a.d);
            break;
         case e:
            this.b(ckj.a.e);
            break;
         case f:
            this.b(ckj.a.f).gC();
            break;
         case g:
            this.a(axf.yT, 1.0F, 1.0F);
            this.b(ckj.a.g);
      }

      return this;
   }

   private ckj gB() {
      this.a(axf.yP, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private ckj gC() {
      this.al.a(cn, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public ckj x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<jh> go() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgz.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jh::a)
         .filter($$0 -> this.dV().F_().a($$0))
         .map(jh::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gp() {
      return !this.gj() && !this.x() && !this.e_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gq().e());
   }

   private boolean h(jh $$0) {
      return this.dV().a_($$0).a(axu.cu)
         && this.gE().noneMatch($$1 -> jp.a(this.dV().ah(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(eud::j).orElse(false);
   }

   private void gD() {
      if (this.dV() instanceof ash $$0 && this.al.a(cn) == this.af) {
         jh $$2 = this.gq();
         this.a($$0, ewd.aG, ($$1x, $$2x) -> {
            clw $$3 = new clw(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(axf.yO, 1.0F, 1.0F);
         return;
      }
   }

   private ckj a(bux $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         jh $$2 = this.gq();
         dxn $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dqn.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fbs $$5 = fbs.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lk(ls.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ecj.u, this.gq(), ecj.a.a(this));
      }

      return this;
   }

   private ckj i(jh $$0) {
      List<jp> $$1 = this.gE().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dV().ah(), $$0));
      this.eb().a(cff.aQ, $$1);
      return this;
   }

   private Stream<jp> gE() {
      return this.eb().c(cff.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbs(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ash $$0, chs $$1) {
      cxk $$2 = new cxk(cxo.kE);
      clw $$3 = new clw($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(axf.yV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btv $$0) {
      this.a(ckj.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gz()) {
         case e:
            this.gF();
            break;
         case f:
            this.a(this.cd).gD();
      }

      super.h();
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bte $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gs();
      }

      return $$4;
   }

   @Override
   protected void gs() {
      this.dV().a(null, this, axf.yK, axg.g, 1.0F, bae.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gF() {
      if (this.dV().B_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), axf.yR, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.yJ, 0.15F, 1.0F);
   }

   @Override
   protected axe u() {
      return Set.of(ckj.a.f, ckj.a.e).contains(this.gz()) ? null : axf.yL;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.yM;
   }

   @Override
   protected axe o_() {
      return axf.yN;
   }

   @Override
   public int aa() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public buw a(ash $$0, buw $$1) {
      return bvm.bj.a($$0, bvl.e);
   }

   @Override
   public boolean a(chs $$0) {
      if (!($$0 instanceof ckj $$1)) {
         return false;
      } else {
         Set<ckj.a> $$2 = Set.of(ckj.a.a, ckj.a.c, ckj.a.b);
         return $$2.contains(this.gz()) && $$2.contains($$1.gz()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ac);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return ckk.a(this.ec().a($$0));
   }

   @Override
   public bxd<ckj> eb() {
      return (bxd<ckj>)super.eb();
   }

   @Override
   protected bxd.b<ckj> ec() {
      return bxd.a(ckk.b, ckk.a);
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      ckk.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<ckj.a> h = ayv.a(ckj.a::a, values(), ayv.a.a);
      public static final zt<ByteBuf, ckj.a> i = zr.a(h, ckj.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
