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

public class ckn extends chw {
   private static final int cf = 1700;
   private static final int cg = 6000;
   private static final int ch = 30;
   private static final int ci = 120;
   private static final int cj = 48000;
   private static final float ck = 0.4F;
   private static final bvm cl = bvm.b(bvq.bj.l(), bvq.bj.m() - 0.4F).b(0.81F);
   private static final alc<ckn.a> cm = alg.a(ckn.class, ale.C);
   private static final alc<Integer> cn = alg.a(ckn.class, ale.b);
   public final bvb bZ = new bvb();
   public final bvb ca = new bvb();
   public final bvb cb = new bvb();
   public final bvb cd = new bvb();
   public final bvb ce = new bvb();

   public static bxm.a p() {
      return chw.gr().a(bxn.v, 0.1F).a(bxn.s, 14.0);
   }

   public ckn(bvq<? extends chw> $$0, dhh $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eun.j, -1.0F);
      this.a(eun.g, -1.0F);
      this.a(eun.y, -1.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cm, ckn.a.a);
      $$0.a(cn, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(eun.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(eun.j, -1.0F);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.gz() == ckn.a.f ? cl.a(this.ei()) : super.e($$0);
   }

   public boolean t() {
      return this.gz() == ckn.a.e;
   }

   public boolean x() {
      return this.bF.c(cfj.R).orElse(false);
   }

   public boolean gm() {
      return !this.x() && !this.gj() && !this.bj() && !this.gw() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gn() {
      return this.gz() == ckn.a.f || this.gz() == ckn.a.e;
   }

   private jh gq() {
      fbx $$0 = this.gy();
      return jh.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fbx gy() {
      return this.dt().e(this.bV().c(2.25));
   }

   private ckn.a gz() {
      return this.al.a(cm);
   }

   private ckn b(ckn.a $$0) {
      this.al.a(cm, $$0);
      return this;
   }

   @Override
   public void a(alc<?> $$0) {
      if (cm.equals($$0)) {
         ckn.a $$1 = this.gz();
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

   public ckn a(ckn.a $$0) {
      switch ($$0) {
         case a:
            this.b(ckn.a.a);
            break;
         case b:
            this.a(axf.yV, 1.0F, 1.0F);
            this.b(ckn.a.b);
            break;
         case c:
            this.b(ckn.a.c).gB();
            break;
         case d:
            this.a(axf.yR, 1.0F, 1.0F);
            this.b(ckn.a.d);
            break;
         case e:
            this.b(ckn.a.e);
            break;
         case f:
            this.b(ckn.a.f).gC();
            break;
         case g:
            this.a(axf.yU, 1.0F, 1.0F);
            this.b(ckn.a.g);
      }

      return this;
   }

   private ckn gB() {
      this.a(axf.yQ, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private ckn gC() {
      this.al.a(cn, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public ckn x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<jh> go() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> chd.a(this, 10 + 2 * $$0, 3))
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
         && Optional.ofNullable(this.L().a($$0, 1)).map(euk::j).orElse(false);
   }

   private void gD() {
      if (this.dV() instanceof ash $$0 && this.al.a(cn) == this.af) {
         jh $$2 = this.gq();
         this.a($$0, ewk.aG, ($$1x, $$2x) -> {
            cma $$3 = new cma(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(axf.yP, 1.0F, 1.0F);
         return;
      }
   }

   private ckn a(bvb $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         jh $$2 = this.gq();
         dxu $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dqu.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fbx $$5 = fbx.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lk(ls.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ecq.u, this.gq(), ecq.a.a(this));
      }

      return this;
   }

   private ckn i(jh $$0) {
      List<jp> $$1 = this.gE().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dV().ah(), $$0));
      this.eb().a(cfj.aQ, $$1);
      return this;
   }

   private Stream<jp> gE() {
      return this.eb().c(cfj.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbx(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ash $$0, chw $$1) {
      cxo $$2 = new cxo(cxs.kE);
      cma $$3 = new cma($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(axf.yW, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btz $$0) {
      this.a(ckn.a.a);
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
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bti $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gs();
      }

      return $$4;
   }

   @Override
   protected void gs() {
      this.dV().a(null, this, axf.yL, axg.g, 1.0F, bae.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gF() {
      if (this.dV().B_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), axf.yS, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.yK, 0.15F, 1.0F);
   }

   @Override
   protected axe u() {
      return Set.of(ckn.a.f, ckn.a.e).contains(this.gz()) ? null : axf.yM;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.yN;
   }

   @Override
   protected axe o_() {
      return axf.yO;
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
   public bva a(ash $$0, bva $$1) {
      return bvq.bj.a($$0, bvp.e);
   }

   @Override
   public boolean a(chw $$0) {
      if (!($$0 instanceof ckn $$1)) {
         return false;
      } else {
         Set<ckn.a> $$2 = Set.of(ckn.a.a, ckn.a.c, ckn.a.b);
         return $$2.contains(this.gz()) && $$2.contains($$1.gz()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ac);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cko.a(this.ec().a($$0));
   }

   @Override
   public bxh<ckn> eb() {
      return (bxh<ckn>)super.eb();
   }

   @Override
   protected bxh.b<ckn> ec() {
      return bxh.a(cko.b, cko.a);
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cko.a(this);
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

      public static final IntFunction<ckn.a> h = ayv.a(ckn.a::a, values(), ayv.a.a);
      public static final zt<ByteBuf, ckn.a> i = zr.a(h, ckn.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
