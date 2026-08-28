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

public class chv extends cfe {
   private static final int cg = 1700;
   private static final int ch = 6000;
   private static final int ci = 30;
   private static final int cj = 120;
   private static final int ck = 48000;
   private static final float cl = 0.4F;
   private static final bsu cm = bsu.b(bsx.aR.l(), bsx.aR.m() - 0.4F).b(0.81F);
   private static final ajw<chv.a> cn = aka.a(chv.class, ajy.C);
   private static final ajw<Integer> co = aka.a(chv.class, ajy.b);
   public final bsm ca = new bsm();
   public final bsm cb = new bsm();
   public final bsm cc = new bsm();
   public final bsm ce = new bsm();
   public final bsm cf = new bsm();

   public static buv.a s() {
      return btp.C().a(buw.v, 0.1F).a(buw.s, 14.0);
   }

   public chv(bsx<? extends cfe> $$0, dcw $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(epv.j, -1.0F);
      this.a(epv.g, -1.0F);
      this.a(epv.y, -1.0F);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cn, chv.a.a);
      $$0.a(co, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bR() || this.bf()) {
         this.a(epv.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(epv.j, -1.0F);
   }

   @Override
   public bsu e(bua $$0) {
      return this.gv() == chv.a.f ? cm.a(this.ea()) : super.e($$0);
   }

   public boolean t() {
      return this.gv() == chv.a.e;
   }

   public boolean x() {
      return this.bF.c(ccs.R).orElse(false);
   }

   public boolean gk() {
      return !this.x() && !this.gh() && !this.bf() && !this.gs() && this.aF() && !this.bS() && !this.N_();
   }

   public boolean gl() {
      return this.gv() == chv.a.f || this.gv() == chv.a.e;
   }

   private jd go() {
      exc $$0 = this.gu();
      return jd.a($$0.a(), this.dv() + 0.2F, $$0.c());
   }

   private exc gu() {
      return this.dm().e(this.bO().a(2.25));
   }

   private chv.a gv() {
      return this.ao.a(cn);
   }

   private chv b(chv.a $$0) {
      this.ao.a(cn, $$0);
      return this;
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cn.equals($$0)) {
         chv.a $$1 = this.gv();
         this.gw();
         switch ($$1) {
            case b:
               this.ca.b(this.ai);
               break;
            case c:
               this.cb.b(this.ai);
               break;
            case d:
               this.cc.b(this.ai);
            case e:
            default:
               break;
            case f:
               this.ce.b(this.ai);
               break;
            case g:
               this.cf.b(this.ai);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gw() {
      this.ce.a();
      this.cc.a();
      this.cf.a();
      this.ca.a();
      this.cb.a();
   }

   public chv a(chv.a $$0) {
      switch ($$0) {
         case a:
            this.b(chv.a.a);
            break;
         case b:
            this.a(avp.yw, 1.0F, 1.0F);
            this.b(chv.a.b);
            break;
         case c:
            this.b(chv.a.c).gx();
            break;
         case d:
            this.a(avp.ys, 1.0F, 1.0F);
            this.b(chv.a.d);
            break;
         case e:
            this.b(chv.a.e);
            break;
         case f:
            this.b(chv.a.f).gy();
            break;
         case g:
            this.a(avp.yv, 1.0F, 1.0F);
            this.b(chv.a.g);
      }

      return this;
   }

   private chv gx() {
      this.a(avp.yr, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private chv gy() {
      this.ao.a(co, this.ai + 120);
      this.dO().a(this, (byte)63);
      return this;
   }

   public chv x(boolean $$0) {
      if ($$0) {
         this.i(this.aM());
      }

      return this;
   }

   Optional<jd> gm() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cem.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jd::a)
         .filter($$0 -> this.dO().C_().a($$0))
         .map(jd::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gn() {
      return !this.gh() && !this.x() && !this.o_() && !this.bf() && this.aF() && !this.bS() && this.h(this.go().e());
   }

   private boolean h(jd $$0) {
      return this.dO().a_($$0).a(awe.cs)
         && this.gA().noneMatch($$1 -> jl.a(this.dO().af(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(eps::j).orElse(false);
   }

   private void gz() {
      if (!this.dO().x_() && this.ao.a(co) == this.ai) {
         aqu $$0 = (aqu)this.dO();
         erw $$1 = $$0.o().be().b(ern.aU);
         eru $$2 = new eru.a($$0).a(eun.f, this.gu()).a(eun.a, this).a(eum.j);
         List<cuq> $$3 = $$1.a($$2);
         jd $$4 = this.go();

         for (cuq $$5 : $$3) {
            cjh $$6 = new cjh($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avp.yq, 1.0F, 1.0F);
      }
   }

   private chv a(bsm $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         jd $$2 = this.go();
         dtc $$3 = this.dO().a_($$2.e());
         if ($$3.l() != dmf.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               exc $$5 = exc.b($$2).b(0.0, -0.65F, 0.0);
               this.dO().a(new le(lm.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dO().a(this.dt(), this.dv(), this.dz(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dO().a(dxz.u, this.go(), dxz.a.a(this));
      }

      return this;
   }

   private chv i(jd $$0) {
      List<jl> $$1 = this.gA().limit(20L).collect(Collectors.toList());
      $$1.add(0, jl.a(this.dO().af(), $$0));
      this.dT().a(ccs.aQ, $$1);
      return this;
   }

   private Stream<jl> gA() {
      return this.dT().c(ccs.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void ff() {
      super.ff();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.dr().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new exc(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqu $$0, cfe $$1) {
      cuq $$2 = new cuq(cut.kq);
      cjh $$3 = new cjh($$0, this.dm().a(), this.dm().b(), this.dm().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avp.yx, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(brk $$0) {
      this.a(chv.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gv()) {
         case e:
            this.gB();
            break;
         case f:
            this.a(this.ce).gz();
      }

      super.l();
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqr $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dO().a(null, this, this.d($$2), avq.g, 1.0F, ayo.b(this.dO().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gB() {
      if (this.dO().x_() && this.ai % 20 == 0) {
         this.dO().a(this.dt(), this.dv(), this.dz(), avp.yt, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.yl, 0.15F, 1.0F);
   }

   @Override
   public avo d(cuq $$0) {
      return avp.ym;
   }

   @Override
   protected avo v() {
      return Set.of(chv.a.f, chv.a.e).contains(this.gv()) ? null : avp.yn;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.yo;
   }

   @Override
   protected avo n_() {
      return avp.yp;
   }

   @Override
   public int ae() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return bsx.aR.a((dcw)$$0);
   }

   @Override
   public boolean a(cfe $$0) {
      if (!($$0 instanceof chv $$1)) {
         return false;
      } else {
         Set<chv.a> $$2 = Set.of(chv.a.a, chv.a.c, chv.a.b);
         return $$2.contains(this.gv()) && $$2.contains($$1.gv()) && super.a($$0);
      }
   }

   @Override
   public ewx h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.X);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chw.a(this.dU().a($$0));
   }

   @Override
   public buq<chv> dT() {
      return (buq<chv>)super.dT();
   }

   @Override
   protected buq.b<chv> dU() {
      return buq.a(chw.b, chw.a);
   }

   @Override
   protected void ab() {
      this.dO().ag().a("snifferBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().b("snifferActivityUpdate");
      chw.a(this);
      this.dO().ag().c();
      super.ab();
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<chv.a> h = axe.a(chv.a::a, values(), axe.a.a);
      public static final yx<ByteBuf, chv.a> i = yv.a(h, chv.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
