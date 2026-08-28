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

public class chy extends cfh {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bsz ck = bsz.b(btc.aR.l(), btc.aR.m() - 0.4F).b(0.81F);
   private static final akk<chy.a> cl = ako.a(chy.class, akm.C);
   private static final akk<Integer> cm = ako.a(chy.class, akm.b);
   public final bsr bY = new bsr();
   public final bsr bZ = new bsr();
   public final bsr cb = new bsr();
   public final bsr cc = new bsr();
   public final bsr cd = new bsr();

   public static buy.a s() {
      return btt.A().a(buz.r, 0.1F).a(buz.q, 14.0);
   }

   public chy(btc<? extends cfh> $$0, dca $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eoo.j, -1.0F);
      this.a(eoo.g, -1.0F);
      this.a(eoo.y, -1.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cl, chy.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eoo.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eoo.j, -1.0F);
   }

   @Override
   public bsz e(bud $$0) {
      return this.gB() == chy.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gB() == chy.a.e;
   }

   public boolean y() {
      return this.bD.c(ccv.R).orElse(false);
   }

   public boolean gq() {
      return !this.y() && !this.gn() && !this.be() && !this.gu() && this.aE() && !this.bR() && !this.gd();
   }

   public boolean gw() {
      return this.gB() == chy.a.f || this.gB() == chy.a.e;
   }

   private iz gz() {
      evt $$0 = this.gA();
      return iz.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evt gA() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chy.a gB() {
      return this.ao.a(cl);
   }

   private chy b(chy.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akk<?> $$0) {
      if (cl.equals($$0)) {
         chy.a $$1 = this.gB();
         this.gC();
         switch ($$1) {
            case b:
               this.bY.b(this.ai);
               break;
            case c:
               this.bZ.b(this.ai);
               break;
            case d:
               this.cb.b(this.ai);
            case e:
            default:
               break;
            case f:
               this.cc.b(this.ai);
               break;
            case g:
               this.cd.b(this.ai);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gC() {
      this.cc.a();
      this.cb.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public chy a(chy.a $$0) {
      switch ($$0) {
         case a:
            this.b(chy.a.a);
            break;
         case b:
            this.a(awa.yt, 1.0F, 1.0F);
            this.b(chy.a.b);
            break;
         case c:
            this.b(chy.a.c).gD();
            break;
         case d:
            this.a(awa.yp, 1.0F, 1.0F);
            this.b(chy.a.d);
            break;
         case e:
            this.b(chy.a.e);
            break;
         case f:
            this.b(chy.a.f).gE();
            break;
         case g:
            this.a(awa.ys, 1.0F, 1.0F);
            this.b(chy.a.g);
      }

      return this;
   }

   private chy gD() {
      this.a(awa.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chy gE() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chy w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<iz> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cep.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iz::a)
         .filter($$0 -> this.dP().C_().a($$0))
         .map(iz::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gy() {
      return !this.gn() && !this.y() && !this.p_() && !this.be() && this.aE() && !this.bR() && this.i(this.gz().d());
   }

   private boolean i(iz $$0) {
      return this.dP().a_($$0).a(awp.cr)
         && this.gG().noneMatch($$1 -> jh.a(this.dP().af(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eol::j).orElse(false);
   }

   private void gF() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         arf $$0 = (arf)this.dP();
         eqp $$1 = $$0.o().be().b(eqg.aU);
         eqn $$2 = new eqn.a($$0).a(etg.f, this.gA()).a(etg.a, this).a(etf.j);
         List<cur> $$3 = $$1.a($$2);
         iz $$4 = this.gz();

         for (cur $$5 : $$3) {
            cjj $$6 = new cjj($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(awa.yn, 1.0F, 1.0F);
      }
   }

   private chy a(bsr $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         iz $$2 = this.gz();
         dse $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dlh.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evt $$5 = evt.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new la(li.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dwx.u, this.gz(), dwx.a.a(this));
      }

      return this;
   }

   private chy j(iz $$0) {
      List<jh> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jh.a(this.dP().af(), $$0));
      this.dS().a(ccv.aQ, $$1);
      return this;
   }

   private Stream<jh> gG() {
      return this.dS().c(ccv.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evt(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arf $$0, cfh $$1) {
      cur $$2 = new cur(cuu.kq);
      cjj $$3 = new cjj($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(awa.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(brp $$0) {
      this.a(chy.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gB()) {
         case e:
            this.gH();
            break;
         case f:
            this.a(this.cc).gF();
      }

      super.l();
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqw $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), awb.g, 1.0F, ayz.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gH() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), awa.yq, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.yi, 0.15F, 1.0F);
   }

   @Override
   public avz d(cur $$0) {
      return awa.yj;
   }

   @Override
   protected avz v() {
      return Set.of(chy.a.f, chy.a.e).contains(this.gB()) ? null : awa.yk;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.yl;
   }

   @Override
   protected avz o_() {
      return awa.ym;
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
   public bsq a(arf $$0, bsq $$1) {
      return btc.aR.a((dca)$$0);
   }

   @Override
   public boolean a(cfh $$0) {
      if (!($$0 instanceof chy $$1)) {
         return false;
      } else {
         Set<chy.a> $$2 = Set.of(chy.a.a, chy.a.c, chy.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public evo h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.X);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return chz.a(this.dT().a($$0));
   }

   @Override
   public but<chy> dS() {
      return (but<chy>)super.dS();
   }

   @Override
   protected but.b<chy> dT() {
      return but.a(chz.b, chz.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chz.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<chy.a> h = axp.a(chy.a::a, values(), axp.a.a);
      public static final zn<ByteBuf, chy.a> i = zl.a(h, chy.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
