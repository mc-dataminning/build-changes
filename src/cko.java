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

public class cko extends chx {
   private static final int cf = 1700;
   private static final int cg = 6000;
   private static final int ch = 30;
   private static final int ci = 120;
   private static final int cj = 48000;
   private static final float ck = 0.4F;
   private static final bvn cl = bvn.b(bvr.bj.l(), bvr.bj.m() - 0.4F).b(0.81F);
   private static final alc<cko.a> cm = alg.a(cko.class, ale.C);
   private static final alc<Integer> cn = alg.a(cko.class, ale.b);
   public final bvc bZ = new bvc();
   public final bvc ca = new bvc();
   public final bvc cb = new bvc();
   public final bvc cd = new bvc();
   public final bvc ce = new bvc();

   public static bxn.a p() {
      return chx.gt().a(bxo.v, 0.1F).a(bxo.s, 14.0);
   }

   public cko(bvr<? extends chx> $$0, dhi $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(euo.j, -1.0F);
      this.a(euo.g, -1.0F);
      this.a(euo.y, -1.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cm, cko.a.a);
      $$0.a(cn, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(euo.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(euo.j, -1.0F);
   }

   @Override
   public bvn e(bws $$0) {
      return this.gB() == cko.a.f ? cl.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gB() == cko.a.e;
   }

   public boolean x() {
      return this.bF.c(cfk.R).orElse(false);
   }

   public boolean go() {
      return !this.x() && !this.gl() && !this.bj() && !this.gy() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gp() {
      return this.gB() == cko.a.f || this.gB() == cko.a.e;
   }

   private jh gs() {
      fby $$0 = this.gA();
      return jh.a($$0.a(), this.dD() + 0.2F, $$0.c());
   }

   private fby gA() {
      return this.du().e(this.bV().c(2.25));
   }

   private cko.a gB() {
      return this.al.a(cm);
   }

   private cko b(cko.a $$0) {
      this.al.a(cm, $$0);
      return this;
   }

   @Override
   public void a(alc<?> $$0) {
      if (cm.equals($$0)) {
         cko.a $$1 = this.gB();
         this.gC();
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

   private void gC() {
      this.cd.a();
      this.cb.a();
      this.ce.a();
      this.bZ.a();
      this.ca.a();
   }

   public cko a(cko.a $$0) {
      switch ($$0) {
         case a:
            this.b(cko.a.a);
            break;
         case b:
            this.a(axf.yV, 1.0F, 1.0F);
            this.b(cko.a.b);
            break;
         case c:
            this.b(cko.a.c).gD();
            break;
         case d:
            this.a(axf.yR, 1.0F, 1.0F);
            this.b(cko.a.d);
            break;
         case e:
            this.b(cko.a.e);
            break;
         case f:
            this.b(cko.a.f).gE();
            break;
         case g:
            this.a(axf.yU, 1.0F, 1.0F);
            this.b(cko.a.g);
      }

      return this;
   }

   private cko gD() {
      this.a(axf.yQ, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cko gE() {
      this.al.a(cn, this.af + 120);
      this.dW().a(this, (byte)63);
      return this;
   }

   public cko x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<jh> gq() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> che.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jh::a)
         .filter($$0 -> this.dW().F_().a($$0))
         .map(jh::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gr() {
      return !this.gl() && !this.x() && !this.e_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gs().e());
   }

   private boolean h(jh $$0) {
      return this.dW().a_($$0).a(axu.cu)
         && this.gG().noneMatch($$1 -> jp.a(this.dW().ah(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(eul::j).orElse(false);
   }

   private void gF() {
      if (this.dW() instanceof ash $$0 && this.al.a(cn) == this.af) {
         jh $$2 = this.gs();
         this.a($$0, ewl.aG, ($$1x, $$2x) -> {
            cmb $$3 = new cmb(this.dW(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(axf.yP, 1.0F, 1.0F);
         return;
      }
   }

   private cko a(bvc $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         jh $$2 = this.gs();
         dxv $$3 = this.dW().a_($$2.e());
         if ($$3.o() != dqv.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fby $$5 = fby.b($$2).b(0.0, -0.65F, 0.0);
               this.dW().a(new lk(ls.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dW().a(this.dB(), this.dD(), this.dH(), $$3.A().f(), this.dn(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dW().a(ecr.u, this.gs(), ecr.a.a(this));
      }

      return this;
   }

   private cko i(jh $$0) {
      List<jp> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dW().ah(), $$0));
      this.ec().a(cfk.aQ, $$1);
      return this;
   }

   private Stream<jp> gG() {
      return this.ec().c(cfk.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fby(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ash $$0, chx $$1) {
      cxp $$2 = new cxp(cxt.kE);
      cmb $$3 = new cmb($$0, this.du().a(), this.du().b(), this.du().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(axf.yW, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bua $$0) {
      this.a(cko.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gB()) {
         case e:
            this.gH();
            break;
         case f:
            this.a(this.cd).gF();
      }

      super.h();
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      btj $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gu();
      }

      return $$4;
   }

   @Override
   protected void gu() {
      this.dW().a(null, this, axf.yL, axg.g, 1.0F, bae.b(this.dW().A, 0.8F, 1.2F));
   }

   private void gH() {
      if (this.dW().B_() && this.af % 20 == 0) {
         this.dW().a(this.dB(), this.dD(), this.dH(), axf.yS, this.dn(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.yK, 0.15F, 1.0F);
   }

   @Override
   protected axe u() {
      return Set.of(cko.a.f, cko.a.e).contains(this.gB()) ? null : axf.yM;
   }

   @Override
   protected axe e(bua $$0) {
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
   public bvb a(ash $$0, bvb $$1) {
      return bvr.bj.a($$0, bvq.e);
   }

   @Override
   public boolean a(chx $$0) {
      if (!($$0 instanceof cko $$1)) {
         return false;
      } else {
         Set<cko.a> $$2 = Set.of(cko.a.a, cko.a.c, cko.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ac);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return ckp.a(this.ed().a($$0));
   }

   @Override
   public bxi<cko> ec() {
      return (bxi<cko>)super.ec();
   }

   @Override
   protected bxi.b<cko> ed() {
      return bxi.a(ckp.b, ckp.a);
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      ckp.a(this);
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

      public static final IntFunction<cko.a> h = ayv.a(cko.a::a, values(), ayv.a.a);
      public static final zt<ByteBuf, cko.a> i = zr.a(h, cko.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
