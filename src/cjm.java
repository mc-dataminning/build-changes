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

public class cjm extends cgv {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bul ck = bul.b(bup.aR.l(), bup.aR.m() - 0.4F).b(0.81F);
   private static final ako<cjm.a> cl = aks.a(cjm.class, akq.C);
   private static final ako<Integer> cm = aks.a(cjm.class, akq.b);
   public final bua bY = new bua();
   public final bua bZ = new bua();
   public final bua ca = new bua();
   public final bua cc = new bua();
   public final bua cd = new bua();

   public static bwl.a q() {
      return cgv.gA().a(bwm.v, 0.1F).a(bwm.s, 14.0);
   }

   public cjm(bup<? extends cgv> $$0, dff $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(esf.j, -1.0F);
      this.a(esf.g, -1.0F);
      this.a(esf.y, -1.0F);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cl, cjm.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.ca() || this.bl()) {
         this.a(esf.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(esf.j, -1.0F);
   }

   @Override
   public bul e(bvq $$0) {
      return this.gI() == cjm.a.f ? ck.a(this.el()) : super.e($$0);
   }

   public boolean t() {
      return this.gI() == cjm.a.e;
   }

   public boolean y() {
      return this.bF.c(cei.R).orElse(false);
   }

   public boolean gv() {
      return !this.y() && !this.gs() && !this.bl() && !this.gF() && this.aL() && !this.cb() && !this.M_();
   }

   public boolean gw() {
      return this.gI() == cjm.a.f || this.gI() == cjm.a.e;
   }

   private jh gz() {
      ezr $$0 = this.gH();
      return jh.a($$0.a(), this.dF() + 0.2F, $$0.c());
   }

   private ezr gH() {
      return this.dw().e(this.bX().c(2.25));
   }

   private cjm.a gI() {
      return this.am.a(cl);
   }

   private cjm b(cjm.a $$0) {
      this.am.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ako<?> $$0) {
      if (cl.equals($$0)) {
         cjm.a $$1 = this.gI();
         this.gJ();
         switch ($$1) {
            case b:
               this.bY.b(this.ag);
               break;
            case c:
               this.bZ.b(this.ag);
               break;
            case d:
               this.ca.b(this.ag);
            case e:
            default:
               break;
            case f:
               this.cc.b(this.ag);
               break;
            case g:
               this.cd.b(this.ag);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gJ() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cjm a(cjm.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjm.a.a);
            break;
         case b:
            this.a(awo.yA, 1.0F, 1.0F);
            this.b(cjm.a.b);
            break;
         case c:
            this.b(cjm.a.c).gK();
            break;
         case d:
            this.a(awo.yw, 1.0F, 1.0F);
            this.b(cjm.a.d);
            break;
         case e:
            this.b(cjm.a.e);
            break;
         case f:
            this.b(cjm.a.f).gL();
            break;
         case g:
            this.a(awo.yz, 1.0F, 1.0F);
            this.b(cjm.a.g);
      }

      return this;
   }

   private cjm gK() {
      this.a(awo.yv, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cjm gL() {
      this.am.a(cm, this.ag + 120);
      this.dY().a(this, (byte)63);
      return this;
   }

   public cjm x(boolean $$0) {
      if ($$0) {
         this.i(this.aT());
      }

      return this;
   }

   Optional<jh> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgc.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jh::a)
         .filter($$0 -> this.dY().C_().a($$0))
         .map(jh::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gy() {
      return !this.gs() && !this.y() && !this.p_() && !this.bl() && this.aL() && !this.cb() && this.h(this.gz().e());
   }

   private boolean h(jh $$0) {
      return this.dY().a_($$0).a(axd.ct)
         && this.gN().noneMatch($$1 -> jp.a(this.dY().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(esc::j).orElse(false);
   }

   private void gM() {
      if (!this.dY().y_() && this.am.a(cm) == this.ag) {
         jh $$0 = this.gz();
         this.a(euc.aG, $$1 -> {
            ckz $$2 = new ckz(this.dY(), (double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1);
            $$2.q();
            this.dY().b($$2);
         });
         this.a(awo.yu, 1.0F, 1.0F);
      }
   }

   private cjm a(bua $$0) {
      boolean $$1 = $$0.a((float)this.ag) > 1700L && $$0.a((float)this.ag) < 6000L;
      if ($$1) {
         jh $$2 = this.gz();
         dvo $$3 = this.dY().a_($$2.e());
         if ($$3.o() != dop.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ezr $$5 = ezr.b($$2).b(0.0, -0.65F, 0.0);
               this.dY().a(new lk(ls.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dY().a(this.dD(), this.dF(), this.dJ(), $$3.A().f(), this.do(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dY().a(eak.u, this.gz(), eak.a.a(this));
      }

      return this;
   }

   private cjm i(jh $$0) {
      List<jp> $$1 = this.gN().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dY().ag(), $$0));
      this.ee().a(cei.aQ, $$1);
      return this;
   }

   private Stream<jp> gN() {
      return this.ee().c(cei.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dB().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezr(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arq $$0, cgv $$1) {
      cwf $$2 = new cwf(cwj.kq);
      ckz $$3 = new ckz($$0, this.dw().a(), this.dw().b(), this.dw().c(), $$2);
      $$3.q();
      this.a($$0, $$1, null);
      this.a(awo.yB, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsy $$0) {
      this.a(cjm.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gI()) {
         case e:
            this.gO();
            break;
         case f:
            this.a(this.cc).gM();
      }

      super.l();
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      boolean $$3 = this.l($$2);
      bsh $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gB();
      }

      return $$4;
   }

   @Override
   protected void gB() {
      this.dY().a(null, this, awo.yq, awp.g, 1.0F, azn.b(this.dY().A, 0.8F, 1.2F));
   }

   private void gO() {
      if (this.dY().y_() && this.ag % 20 == 0) {
         this.dY().a(this.dD(), this.dF(), this.dJ(), awo.yx, this.do(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.yp, 0.15F, 1.0F);
   }

   @Override
   protected awn w() {
      return Set.of(cjm.a.f, cjm.a.e).contains(this.gI()) ? null : awo.yr;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.ys;
   }

   @Override
   protected awn o_() {
      return awo.yt;
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
   public btz a(arq $$0, btz $$1) {
      return bup.aR.a($$0, buo.e);
   }

   @Override
   public boolean a(cgv $$0) {
      if (!($$0 instanceof cjm $$1)) {
         return false;
      } else {
         Set<cjm.a> $$2 = Set.of(cjm.a.a, cjm.a.c, cjm.a.b);
         return $$2.contains(this.gI()) && $$2.contains($$1.gI()) && super.a($$0);
      }
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ab);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cjn.a(this.ef().a($$0));
   }

   @Override
   public bwg<cjm> ee() {
      return (bwg<cjm>)super.ee();
   }

   @Override
   protected bwg.b<cjm> ef() {
      return bwg.a(cjn.b, cjn.a);
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("snifferBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.b("snifferActivityUpdate");
      cjn.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cjm.a> h = aye.a(cjm.a::a, values(), aye.a.a);
      public static final zj<ByteBuf, cjm.a> i = zh.a(h, cjm.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
