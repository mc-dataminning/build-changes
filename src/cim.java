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

public class cim extends cfv {
   private static final int cf = 1700;
   private static final int cg = 6000;
   private static final int ch = 30;
   private static final int ci = 120;
   private static final int cj = 48000;
   private static final float ck = 0.4F;
   private static final btm cl = btm.b(btq.aR.l(), btq.aR.m() - 0.4F).b(0.81F);
   private static final akg<cim.a> cm = akk.a(cim.class, aki.C);
   private static final akg<Integer> cn = akk.a(cim.class, aki.b);
   public final btd bZ = new btd();
   public final btd ca = new btd();
   public final btd cb = new btd();
   public final btd cd = new btd();
   public final btd ce = new btd();

   public static bvl.a q() {
      return cfv.gt().a(bvm.v, 0.1F).a(bvm.s, 14.0);
   }

   public cim(btq<? extends cfv> $$0, dds $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(eqs.j, -1.0F);
      this.a(eqs.g, -1.0F);
      this.a(eqs.y, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cm, cim.a.a);
      $$0.a(cn, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bV() || this.bi()) {
         this.a(eqs.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(eqs.j, -1.0F);
   }

   @Override
   public btm e(bur $$0) {
      return this.gB() == cim.a.f ? cl.a(this.ee()) : super.e($$0);
   }

   public boolean t() {
      return this.gB() == cim.a.e;
   }

   public boolean y() {
      return this.bC.c(cdi.R).orElse(false);
   }

   public boolean go() {
      return !this.y() && !this.gl() && !this.bi() && !this.gy() && this.aH() && !this.bW() && !this.K_();
   }

   public boolean gp() {
      return this.gB() == cim.a.f || this.gB() == cim.a.e;
   }

   private je gs() {
      eye $$0 = this.gA();
      return je.a($$0.a(), this.dz() + 0.2F, $$0.c());
   }

   private eye gA() {
      return this.dq().e(this.bS().c(2.25));
   }

   private cim.a gB() {
      return this.am.a(cm);
   }

   private cim b(cim.a $$0) {
      this.am.a(cm, $$0);
      return this;
   }

   @Override
   public void a(akg<?> $$0) {
      if (cm.equals($$0)) {
         cim.a $$1 = this.gB();
         this.gC();
         switch ($$1) {
            case b:
               this.bZ.b(this.ag);
               break;
            case c:
               this.ca.b(this.ag);
               break;
            case d:
               this.cb.b(this.ag);
            case e:
            default:
               break;
            case f:
               this.cd.b(this.ag);
               break;
            case g:
               this.ce.b(this.ag);
         }

         this.i_();
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

   public cim a(cim.a $$0) {
      switch ($$0) {
         case a:
            this.b(cim.a.a);
            break;
         case b:
            this.a(awd.yC, 1.0F, 1.0F);
            this.b(cim.a.b);
            break;
         case c:
            this.b(cim.a.c).gD();
            break;
         case d:
            this.a(awd.yy, 1.0F, 1.0F);
            this.b(cim.a.d);
            break;
         case e:
            this.b(cim.a.e);
            break;
         case f:
            this.b(cim.a.f).gE();
            break;
         case g:
            this.a(awd.yB, 1.0F, 1.0F);
            this.b(cim.a.g);
      }

      return this;
   }

   private cim gD() {
      this.a(awd.yx, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cim gE() {
      this.am.a(cn, this.ag + 120);
      this.dS().a(this, (byte)63);
      return this;
   }

   public cim x(boolean $$0) {
      if ($$0) {
         this.i(this.aP());
      }

      return this;
   }

   Optional<je> gq() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cfc.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(je::a)
         .filter($$0 -> this.dS().A_().a($$0))
         .map(je::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gr() {
      return !this.gl() && !this.y() && !this.o_() && !this.bi() && this.aH() && !this.bW() && this.h(this.gs().e());
   }

   private boolean h(je $$0) {
      return this.dS().a_($$0).a(aws.cs)
         && this.gG().noneMatch($$1 -> jm.a(this.dS().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(eqp::j).orElse(false);
   }

   private void gF() {
      if (!this.dS().w_() && this.am.a(cn) == this.ag) {
         arg $$0 = (arg)this.dS();
         esy $$1 = $$0.o().bd().b(esp.aG);
         esw $$2 = new esw.a($$0).a(evp.f, this.gA()).a(evp.a, this).a(evo.j);
         List<cvl> $$3 = $$1.a($$2);
         je $$4 = this.gs();

         for (cvl $$5 : $$3) {
            cjz $$6 = new cjz($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.q();
            $$0.b($$6);
         }

         this.a(awd.yw, 1.0F, 1.0F);
      }
   }

   private cim a(btd $$0) {
      boolean $$1 = $$0.a((float)this.ag) > 1700L && $$0.a((float)this.ag) < 6000L;
      if ($$1) {
         je $$2 = this.gs();
         dua $$3 = this.dS().a_($$2.e());
         if ($$3.o() != dnc.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eye $$5 = eye.b($$2).b(0.0, -0.65F, 0.0);
               this.dS().a(new lf(ln.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dS().a(this.dx(), this.dz(), this.dD(), $$3.A().f(), this.di(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dS().a(dyx.u, this.gs(), dyx.a.a(this));
      }

      return this;
   }

   private cim i(je $$0) {
      List<jm> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jm.a(this.dS().ag(), $$0));
      this.dX().a(cdi.aQ, $$1);
      return this;
   }

   private Stream<jm> gG() {
      return this.dX().c(cdi.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dv().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new eye(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arg $$0, cfv $$1) {
      cvl $$2 = new cvl(cvo.kq);
      cjz $$3 = new cjz($$0, this.dq().a(), this.dq().b(), this.dq().c(), $$2);
      $$3.q();
      this.a($$0, $$1, null);
      this.a(awd.yD, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsb $$0) {
      this.a(cim.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gB()) {
         case e:
            this.gH();
            break;
         case f:
            this.a(this.cd).gF();
      }

      super.l();
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      boolean $$3 = this.p($$2);
      brk $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gu();
      }

      return $$4;
   }

   @Override
   protected void gu() {
      this.dS().a(null, this, awd.ys, awe.g, 1.0F, azc.b(this.dS().z, 0.8F, 1.2F));
   }

   private void gH() {
      if (this.dS().w_() && this.ag % 20 == 0) {
         this.dS().a(this.dx(), this.dz(), this.dD(), awd.yz, this.di(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.yr, 0.15F, 1.0F);
   }

   @Override
   protected awc w() {
      return Set.of(cim.a.f, cim.a.e).contains(this.gB()) ? null : awd.yt;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.yu;
   }

   @Override
   protected awc n_() {
      return awd.yv;
   }

   @Override
   public int ag() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.aR.a($$0, btp.e);
   }

   @Override
   public boolean a(cfv $$0) {
      if (!($$0 instanceof cim $$1)) {
         return false;
      } else {
         Set<cim.a> $$2 = Set.of(cim.a.a, cim.a.c, cim.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.X);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cin.a(this.dY().a($$0));
   }

   @Override
   public bvg<cim> dX() {
      return (bvg<cim>)super.dX();
   }

   @Override
   protected bvg.b<cim> dY() {
      return bvg.a(cin.b, cin.a);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("snifferBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().b("snifferActivityUpdate");
      cin.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cim.a> h = axt.a(cim.a::a, values(), axt.a.a);
      public static final zb<ByteBuf, cim.a> i = yz.a(h, cim.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
