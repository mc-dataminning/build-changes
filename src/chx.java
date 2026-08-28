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

public class chx extends cfg {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bsy ck = bsy.b(btb.aR.l(), btb.aR.m() - 0.4F).b(0.81F);
   private static final akk<chx.a> cl = ako.a(chx.class, akm.C);
   private static final akk<Integer> cm = ako.a(chx.class, akm.b);
   public final bsq bY = new bsq();
   public final bsq bZ = new bsq();
   public final bsq cb = new bsq();
   public final bsq cc = new bsq();
   public final bsq cd = new bsq();

   public static bux.a s() {
      return bts.A().a(buy.r, 0.1F).a(buy.q, 14.0);
   }

   public chx(btb<? extends cfg> $$0, dbz $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eon.j, -1.0F);
      this.a(eon.g, -1.0F);
      this.a(eon.y, -1.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cl, chx.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eon.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eon.j, -1.0F);
   }

   @Override
   public bsy e(buc $$0) {
      return this.gB() == chx.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gB() == chx.a.e;
   }

   public boolean y() {
      return this.bD.c(ccu.R).orElse(false);
   }

   public boolean gq() {
      return !this.y() && !this.gn() && !this.be() && !this.gu() && this.aE() && !this.bR() && !this.gd();
   }

   public boolean gw() {
      return this.gB() == chx.a.f || this.gB() == chx.a.e;
   }

   private iz gz() {
      evs $$0 = this.gA();
      return iz.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evs gA() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chx.a gB() {
      return this.ao.a(cl);
   }

   private chx b(chx.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akk<?> $$0) {
      if (cl.equals($$0)) {
         chx.a $$1 = this.gB();
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

   public chx a(chx.a $$0) {
      switch ($$0) {
         case a:
            this.b(chx.a.a);
            break;
         case b:
            this.a(awa.yt, 1.0F, 1.0F);
            this.b(chx.a.b);
            break;
         case c:
            this.b(chx.a.c).gD();
            break;
         case d:
            this.a(awa.yp, 1.0F, 1.0F);
            this.b(chx.a.d);
            break;
         case e:
            this.b(chx.a.e);
            break;
         case f:
            this.b(chx.a.f).gE();
            break;
         case g:
            this.a(awa.ys, 1.0F, 1.0F);
            this.b(chx.a.g);
      }

      return this;
   }

   private chx gD() {
      this.a(awa.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chx gE() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chx w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<iz> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> ceo.a(this, 10 + 2 * $$0, 3))
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
         && Optional.ofNullable(this.K().a($$0, 1)).map(eok::j).orElse(false);
   }

   private void gF() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         arf $$0 = (arf)this.dP();
         eqo $$1 = $$0.o().be().b(eqf.aU);
         eqm $$2 = new eqm.a($$0).a(etf.f, this.gA()).a(etf.a, this).a(ete.j);
         List<cuq> $$3 = $$1.a($$2);
         iz $$4 = this.gz();

         for (cuq $$5 : $$3) {
            cji $$6 = new cji($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(awa.yn, 1.0F, 1.0F);
      }
   }

   private chx a(bsq $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         iz $$2 = this.gz();
         dsd $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dlg.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evs $$5 = evs.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new la(li.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dww.u, this.gz(), dww.a.a(this));
      }

      return this;
   }

   private chx j(iz $$0) {
      List<jh> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jh.a(this.dP().af(), $$0));
      this.dS().a(ccu.aQ, $$1);
      return this;
   }

   private Stream<jh> gG() {
      return this.dS().c(ccu.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evs(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arf $$0, cfg $$1) {
      cuq $$2 = new cuq(cut.kq);
      cji $$3 = new cji($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(awa.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bro $$0) {
      this.a(chx.a.a);
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
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqv $$4 = super.b($$0, $$1);
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
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.yi, 0.15F, 1.0F);
   }

   @Override
   public avz d(cuq $$0) {
      return awa.yj;
   }

   @Override
   protected avz v() {
      return Set.of(chx.a.f, chx.a.e).contains(this.gB()) ? null : awa.yk;
   }

   @Override
   protected avz d(bro $$0) {
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
   public bsp a(arf $$0, bsp $$1) {
      return btb.aR.a((dbz)$$0);
   }

   @Override
   public boolean a(cfg $$0) {
      if (!($$0 instanceof chx $$1)) {
         return false;
      } else {
         Set<chx.a> $$2 = Set.of(chx.a.a, chx.a.c, chx.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public evn h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.X);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return chy.a(this.dT().a($$0));
   }

   @Override
   public bus<chx> dS() {
      return (bus<chx>)super.dS();
   }

   @Override
   protected bus.b<chx> dT() {
      return bus.a(chy.b, chy.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chy.a(this);
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

      public static final IntFunction<chx.a> h = axp.a(chx.a::a, values(), axp.a.a);
      public static final zn<ByteBuf, chx.a> i = zl.a(h, chx.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
