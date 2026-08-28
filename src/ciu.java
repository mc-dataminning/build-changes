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

public class ciu extends cgd {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final btu ck = btu.b(bty.aR.l(), bty.aR.m() - 0.4F).b(0.81F);
   private static final akh<ciu.a> cl = akl.a(ciu.class, akj.C);
   private static final akh<Integer> cm = akl.a(ciu.class, akj.b);
   public final btl bY = new btl();
   public final btl bZ = new btl();
   public final btl ca = new btl();
   public final btl cc = new btl();
   public final btl cd = new btl();

   public static bvt.a q() {
      return cgd.gt().a(bvu.v, 0.1F).a(bvu.s, 14.0);
   }

   public ciu(bty<? extends cgd> $$0, dej $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(erk.j, -1.0F);
      this.a(erk.g, -1.0F);
      this.a(erk.y, -1.0F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cl, ciu.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bV() || this.bi()) {
         this.a(erk.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(erk.j, -1.0F);
   }

   @Override
   public btu e(buz $$0) {
      return this.gB() == ciu.a.f ? ck.a(this.ef()) : super.e($$0);
   }

   public boolean t() {
      return this.gB() == ciu.a.e;
   }

   public boolean y() {
      return this.bB.c(cdq.R).orElse(false);
   }

   public boolean go() {
      return !this.y() && !this.gl() && !this.bi() && !this.gy() && this.aH() && !this.bW() && !this.L_();
   }

   public boolean gp() {
      return this.gB() == ciu.a.f || this.gB() == ciu.a.e;
   }

   private jf gs() {
      eyw $$0 = this.gA();
      return jf.a($$0.a(), this.dz() + 0.2F, $$0.c());
   }

   private eyw gA() {
      return this.dq().e(this.bS().c(2.25));
   }

   private ciu.a gB() {
      return this.am.a(cl);
   }

   private ciu b(ciu.a $$0) {
      this.am.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akh<?> $$0) {
      if (cl.equals($$0)) {
         ciu.a $$1 = this.gB();
         this.gC();
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

   private void gC() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public ciu a(ciu.a $$0) {
      switch ($$0) {
         case a:
            this.b(ciu.a.a);
            break;
         case b:
            this.a(awg.yC, 1.0F, 1.0F);
            this.b(ciu.a.b);
            break;
         case c:
            this.b(ciu.a.c).gD();
            break;
         case d:
            this.a(awg.yy, 1.0F, 1.0F);
            this.b(ciu.a.d);
            break;
         case e:
            this.b(ciu.a.e);
            break;
         case f:
            this.b(ciu.a.f).gE();
            break;
         case g:
            this.a(awg.yB, 1.0F, 1.0F);
            this.b(ciu.a.g);
      }

      return this;
   }

   private ciu gD() {
      this.a(awg.yx, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private ciu gE() {
      this.am.a(cm, this.ag + 120);
      this.dS().a(this, (byte)63);
      return this;
   }

   public ciu x(boolean $$0) {
      if ($$0) {
         this.i(this.aP());
      }

      return this;
   }

   Optional<jf> gq() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cfk.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jf::a)
         .filter($$0 -> this.dS().B_().a($$0))
         .map(jf::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gr() {
      return !this.gl() && !this.y() && !this.p_() && !this.bi() && this.aH() && !this.bW() && this.h(this.gs().e());
   }

   private boolean h(jf $$0) {
      return this.dS().a_($$0).a(awv.cs)
         && this.gG().noneMatch($$1 -> jn.a(this.dS().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(erh::j).orElse(false);
   }

   private void gF() {
      if (!this.dS().x_() && this.am.a(cm) == this.ag) {
         arj $$0 = (arj)this.dS();
         etq $$1 = $$0.o().bd().b(eth.aE);
         eto $$2 = new eto.a($$0).a(ewh.f, this.gA()).a(ewh.a, this).a(ewg.j);
         List<cvs> $$3 = $$1.a($$2);
         jf $$4 = this.gs();

         for (cvs $$5 : $$3) {
            ckh $$6 = new ckh($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.q();
            $$0.b($$6);
         }

         this.a(awg.yw, 1.0F, 1.0F);
      }
   }

   private ciu a(btl $$0) {
      boolean $$1 = $$0.a((float)this.ag) > 1700L && $$0.a((float)this.ag) < 6000L;
      if ($$1) {
         jf $$2 = this.gs();
         dus $$3 = this.dS().a_($$2.e());
         if ($$3.o() != dnt.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eyw $$5 = eyw.b($$2).b(0.0, -0.65F, 0.0);
               this.dS().a(new lg(lo.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dS().a(this.dx(), this.dz(), this.dD(), $$3.A().f(), this.di(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dS().a(dzp.u, this.gs(), dzp.a.a(this));
      }

      return this;
   }

   private ciu i(jf $$0) {
      List<jn> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jn.a(this.dS().ag(), $$0));
      this.dY().a(cdq.aQ, $$1);
      return this;
   }

   private Stream<jn> gG() {
      return this.dY().c(cdq.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dv().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new eyw(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arj $$0, cgd $$1) {
      cvs $$2 = new cvs(cvw.kq);
      ckh $$3 = new ckh($$0, this.dq().a(), this.dq().b(), this.dq().c(), $$2);
      $$3.q();
      this.a($$0, $$1, null);
      this.a(awg.yD, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsj $$0) {
      this.a(ciu.a.a);
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
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      boolean $$3 = this.n($$2);
      brs $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gu();
      }

      return $$4;
   }

   @Override
   protected void gu() {
      this.dS().a(null, this, awg.ys, awh.g, 1.0F, azf.b(this.dS().z, 0.8F, 1.2F));
   }

   private void gH() {
      if (this.dS().x_() && this.ag % 20 == 0) {
         this.dS().a(this.dx(), this.dz(), this.dD(), awg.yz, this.di(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.yr, 0.15F, 1.0F);
   }

   @Override
   protected awf w() {
      return Set.of(ciu.a.f, ciu.a.e).contains(this.gB()) ? null : awg.yt;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.yu;
   }

   @Override
   protected awf o_() {
      return awg.yv;
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
   public btk a(arj $$0, btk $$1) {
      return bty.aR.a($$0, btx.e);
   }

   @Override
   public boolean a(cgd $$0) {
      if (!($$0 instanceof ciu $$1)) {
         return false;
      } else {
         Set<ciu.a> $$2 = Set.of(ciu.a.a, ciu.a.c, ciu.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.X);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return civ.a(this.dZ().a($$0));
   }

   @Override
   public bvo<ciu> dY() {
      return (bvo<ciu>)super.dY();
   }

   @Override
   protected bvo.b<ciu> dZ() {
      return bvo.a(civ.b, civ.a);
   }

   @Override
   protected void ac() {
      this.dS().ah().a("snifferBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().b("snifferActivityUpdate");
      civ.a(this);
      this.dS().ah().c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
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

      public static final IntFunction<ciu.a> h = axw.a(ciu.a::a, values(), axw.a.a);
      public static final zc<ByteBuf, ciu.a> i = za.a(h, ciu.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
