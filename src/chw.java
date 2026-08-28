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

public class chw extends cff {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bsx ck = bsx.b(bta.aR.l(), bta.aR.m() - 0.4F).b(0.81F);
   private static final akk<chw.a> cl = ako.a(chw.class, akm.C);
   private static final akk<Integer> cm = ako.a(chw.class, akm.b);
   public final bsp bY = new bsp();
   public final bsp bZ = new bsp();
   public final bsp cb = new bsp();
   public final bsp cc = new bsp();
   public final bsp cd = new bsp();

   public static buw.a s() {
      return btr.A().a(bux.r, 0.1F).a(bux.q, 14.0);
   }

   public chw(bta<? extends cff> $$0, dby $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eom.j, -1.0F);
      this.a(eom.g, -1.0F);
      this.a(eom.y, -1.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cl, chw.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eom.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eom.j, -1.0F);
   }

   @Override
   public bsx e(bub $$0) {
      return this.gB() == chw.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gB() == chw.a.e;
   }

   public boolean y() {
      return this.bD.c(cct.R).orElse(false);
   }

   public boolean gq() {
      return !this.y() && !this.gn() && !this.be() && !this.gu() && this.aE() && !this.bR() && !this.gd();
   }

   public boolean gw() {
      return this.gB() == chw.a.f || this.gB() == chw.a.e;
   }

   private iz gz() {
      evr $$0 = this.gA();
      return iz.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evr gA() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chw.a gB() {
      return this.ao.a(cl);
   }

   private chw b(chw.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akk<?> $$0) {
      if (cl.equals($$0)) {
         chw.a $$1 = this.gB();
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

   public chw a(chw.a $$0) {
      switch ($$0) {
         case a:
            this.b(chw.a.a);
            break;
         case b:
            this.a(awa.yt, 1.0F, 1.0F);
            this.b(chw.a.b);
            break;
         case c:
            this.b(chw.a.c).gD();
            break;
         case d:
            this.a(awa.yp, 1.0F, 1.0F);
            this.b(chw.a.d);
            break;
         case e:
            this.b(chw.a.e);
            break;
         case f:
            this.b(chw.a.f).gE();
            break;
         case g:
            this.a(awa.ys, 1.0F, 1.0F);
            this.b(chw.a.g);
      }

      return this;
   }

   private chw gD() {
      this.a(awa.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chw gE() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chw w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<iz> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cen.a(this, 10 + 2 * $$0, 3))
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
         && Optional.ofNullable(this.K().a($$0, 1)).map(eoj::j).orElse(false);
   }

   private void gF() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         arf $$0 = (arf)this.dP();
         eqn $$1 = $$0.o().be().b(eqe.aU);
         eql $$2 = new eql.a($$0).a(ete.f, this.gA()).a(ete.a, this).a(etd.j);
         List<cup> $$3 = $$1.a($$2);
         iz $$4 = this.gz();

         for (cup $$5 : $$3) {
            cjh $$6 = new cjh($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(awa.yn, 1.0F, 1.0F);
      }
   }

   private chw a(bsp $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         iz $$2 = this.gz();
         dsc $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dlf.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evr $$5 = evr.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new la(li.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dwv.u, this.gz(), dwv.a.a(this));
      }

      return this;
   }

   private chw j(iz $$0) {
      List<jh> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jh.a(this.dP().af(), $$0));
      this.dS().a(cct.aQ, $$1);
      return this;
   }

   private Stream<jh> gG() {
      return this.dS().c(cct.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evr(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arf $$0, cff $$1) {
      cup $$2 = new cup(cus.kq);
      cjh $$3 = new cjh($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(awa.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(brn $$0) {
      this.a(chw.a.a);
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
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqu $$4 = super.b($$0, $$1);
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
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.yi, 0.15F, 1.0F);
   }

   @Override
   public avz d(cup $$0) {
      return awa.yj;
   }

   @Override
   protected avz v() {
      return Set.of(chw.a.f, chw.a.e).contains(this.gB()) ? null : awa.yk;
   }

   @Override
   protected avz d(brn $$0) {
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
   public bso a(arf $$0, bso $$1) {
      return bta.aR.a((dby)$$0);
   }

   @Override
   public boolean a(cff $$0) {
      if (!($$0 instanceof chw $$1)) {
         return false;
      } else {
         Set<chw.a> $$2 = Set.of(chw.a.a, chw.a.c, chw.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public evm h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.X);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return chx.a(this.dT().a($$0));
   }

   @Override
   public bur<chw> dS() {
      return (bur<chw>)super.dS();
   }

   @Override
   protected bur.b<chw> dT() {
      return bur.a(chx.b, chx.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chx.a(this);
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

      public static final IntFunction<chw.a> h = axp.a(chw.a::a, values(), axp.a.a);
      public static final zn<ByteBuf, chw.a> i = zl.a(h, chw.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
