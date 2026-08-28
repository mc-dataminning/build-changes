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

public class cir extends cga {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final btr ck = btr.b(btv.aR.l(), btv.aR.m() - 0.4F).b(0.81F);
   private static final akg<cir.a> cl = akk.a(cir.class, aki.C);
   private static final akg<Integer> cm = akk.a(cir.class, aki.b);
   public final bti bY = new bti();
   public final bti bZ = new bti();
   public final bti ca = new bti();
   public final bti cc = new bti();
   public final bti cd = new bti();

   public static bvq.a q() {
      return cga.gu().a(bvr.v, 0.1F).a(bvr.s, 14.0);
   }

   public cir(btv<? extends cga> $$0, deg $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(erg.j, -1.0F);
      this.a(erg.g, -1.0F);
      this.a(erg.y, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cl, cir.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bV() || this.bi()) {
         this.a(erg.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(erg.j, -1.0F);
   }

   @Override
   public btr e(buw $$0) {
      return this.gC() == cir.a.f ? ck.a(this.ee()) : super.e($$0);
   }

   public boolean t() {
      return this.gC() == cir.a.e;
   }

   public boolean y() {
      return this.bB.c(cdn.R).orElse(false);
   }

   public boolean gp() {
      return !this.y() && !this.gm() && !this.bi() && !this.gz() && this.aH() && !this.bW() && !this.K_();
   }

   public boolean gq() {
      return this.gC() == cir.a.f || this.gC() == cir.a.e;
   }

   private je gt() {
      eys $$0 = this.gB();
      return je.a($$0.a(), this.dz() + 0.2F, $$0.c());
   }

   private eys gB() {
      return this.dq().e(this.bS().c(2.25));
   }

   private cir.a gC() {
      return this.am.a(cl);
   }

   private cir b(cir.a $$0) {
      this.am.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akg<?> $$0) {
      if (cl.equals($$0)) {
         cir.a $$1 = this.gC();
         this.gD();
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

         this.i_();
      }

      super.a($$0);
   }

   private void gD() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cir a(cir.a $$0) {
      switch ($$0) {
         case a:
            this.b(cir.a.a);
            break;
         case b:
            this.a(awe.yC, 1.0F, 1.0F);
            this.b(cir.a.b);
            break;
         case c:
            this.b(cir.a.c).gE();
            break;
         case d:
            this.a(awe.yy, 1.0F, 1.0F);
            this.b(cir.a.d);
            break;
         case e:
            this.b(cir.a.e);
            break;
         case f:
            this.b(cir.a.f).gF();
            break;
         case g:
            this.a(awe.yB, 1.0F, 1.0F);
            this.b(cir.a.g);
      }

      return this;
   }

   private cir gE() {
      this.a(awe.yx, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cir gF() {
      this.am.a(cm, this.ag + 120);
      this.dS().a(this, (byte)63);
      return this;
   }

   public cir x(boolean $$0) {
      if ($$0) {
         this.i(this.aP());
      }

      return this;
   }

   Optional<je> gr() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cfh.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(je::a)
         .filter($$0 -> this.dS().A_().a($$0))
         .map(je::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gs() {
      return !this.gm() && !this.y() && !this.o_() && !this.bi() && this.aH() && !this.bW() && this.h(this.gt().e());
   }

   private boolean h(je $$0) {
      return this.dS().a_($$0).a(awt.cs)
         && this.gH().noneMatch($$1 -> jm.a(this.dS().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(erd::j).orElse(false);
   }

   private void gG() {
      if (!this.dS().w_() && this.am.a(cm) == this.ag) {
         arh $$0 = (arh)this.dS();
         etm $$1 = $$0.o().bd().b(etd.aG);
         etk $$2 = new etk.a($$0).a(ewd.f, this.gB()).a(ewd.a, this).a(ewc.j);
         List<cvp> $$3 = $$1.a($$2);
         je $$4 = this.gt();

         for (cvp $$5 : $$3) {
            cke $$6 = new cke($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.q();
            $$0.b($$6);
         }

         this.a(awe.yw, 1.0F, 1.0F);
      }
   }

   private cir a(bti $$0) {
      boolean $$1 = $$0.a((float)this.ag) > 1700L && $$0.a((float)this.ag) < 6000L;
      if ($$1) {
         je $$2 = this.gt();
         duo $$3 = this.dS().a_($$2.e());
         if ($$3.o() != dnq.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eys $$5 = eys.b($$2).b(0.0, -0.65F, 0.0);
               this.dS().a(new lf(ln.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dS().a(this.dx(), this.dz(), this.dD(), $$3.A().f(), this.di(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dS().a(dzl.u, this.gt(), dzl.a.a(this));
      }

      return this;
   }

   private cir i(je $$0) {
      List<jm> $$1 = this.gH().limit(20L).collect(Collectors.toList());
      $$1.add(0, jm.a(this.dS().ag(), $$0));
      this.dX().a(cdn.aQ, $$1);
      return this;
   }

   private Stream<jm> gH() {
      return this.dX().c(cdn.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dv().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new eys(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arh $$0, cga $$1) {
      cvp $$2 = new cvp(cvt.kq);
      cke $$3 = new cke($$0, this.dq().a(), this.dq().b(), this.dq().c(), $$2);
      $$3.q();
      this.a($$0, $$1, null);
      this.a(awe.yD, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsg $$0) {
      this.a(cir.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gC()) {
         case e:
            this.gI();
            break;
         case f:
            this.a(this.cc).gG();
      }

      super.l();
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      boolean $$3 = this.n($$2);
      brp $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gv();
      }

      return $$4;
   }

   @Override
   protected void gv() {
      this.dS().a(null, this, awe.ys, awf.g, 1.0F, azd.b(this.dS().z, 0.8F, 1.2F));
   }

   private void gI() {
      if (this.dS().w_() && this.ag % 20 == 0) {
         this.dS().a(this.dx(), this.dz(), this.dD(), awe.yz, this.di(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.yr, 0.15F, 1.0F);
   }

   @Override
   protected awd w() {
      return Set.of(cir.a.f, cir.a.e).contains(this.gC()) ? null : awe.yt;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.yu;
   }

   @Override
   protected awd n_() {
      return awe.yv;
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
   public bth a(arh $$0, bth $$1) {
      return btv.aR.a($$0, btu.e);
   }

   @Override
   public boolean a(cga $$0) {
      if (!($$0 instanceof cir $$1)) {
         return false;
      } else {
         Set<cir.a> $$2 = Set.of(cir.a.a, cir.a.c, cir.a.b);
         return $$2.contains(this.gC()) && $$2.contains($$1.gC()) && super.a($$0);
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.X);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return cis.a(this.dY().a($$0));
   }

   @Override
   public bvl<cir> dX() {
      return (bvl<cir>)super.dX();
   }

   @Override
   protected bvl.b<cir> dY() {
      return bvl.a(cis.b, cis.a);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("snifferBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().b("snifferActivityUpdate");
      cis.a(this);
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

      public static final IntFunction<cir.a> h = axu.a(cir.a::a, values(), axu.a.a);
      public static final zb<ByteBuf, cir.a> i = yz.a(h, cir.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
