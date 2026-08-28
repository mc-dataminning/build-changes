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

public class cht extends cfc {
   private static final int cg = 1700;
   private static final int ch = 6000;
   private static final int ci = 30;
   private static final int cj = 120;
   private static final int ck = 48000;
   private static final float cl = 0.4F;
   private static final bst cm = bst.b(bsw.aR.l(), bsw.aR.m() - 0.4F).b(0.81F);
   private static final ajv<cht.a> cn = ajz.a(cht.class, ajx.C);
   private static final ajv<Integer> co = ajz.a(cht.class, ajx.b);
   public final bsl ca = new bsl();
   public final bsl cb = new bsl();
   public final bsl cc = new bsl();
   public final bsl ce = new bsl();
   public final bsl cf = new bsl();

   public static but.a s() {
      return btn.A().a(buu.v, 0.1F).a(buu.s, 14.0);
   }

   public cht(bsw<? extends cfc> $$0, dcu $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.a(epp.j, -1.0F);
      this.a(epp.g, -1.0F);
      this.a(epp.y, -1.0F);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cn, cht.a.a);
      $$0.a(co, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bR() || this.bf()) {
         this.a(epp.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(epp.j, -1.0F);
   }

   @Override
   public bst e(bty $$0) {
      return this.gx() == cht.a.f ? cm.a(this.eb()) : super.e($$0);
   }

   public boolean t() {
      return this.gx() == cht.a.e;
   }

   public boolean x() {
      return this.bF.c(ccq.R).orElse(false);
   }

   public boolean gm() {
      return !this.x() && !this.gj() && !this.bf() && !this.gu() && this.aF() && !this.bS() && !this.fY();
   }

   public boolean gn() {
      return this.gx() == cht.a.f || this.gx() == cht.a.e;
   }

   private jd gq() {
      eww $$0 = this.gw();
      return jd.a($$0.a(), this.dx() + 0.2F, $$0.c());
   }

   private eww gw() {
      return this.do().e(this.bO().a(2.25));
   }

   private cht.a gx() {
      return this.ao.a(cn);
   }

   private cht b(cht.a $$0) {
      this.ao.a(cn, $$0);
      return this;
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cn.equals($$0)) {
         cht.a $$1 = this.gx();
         this.gy();
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

   private void gy() {
      this.ce.a();
      this.cc.a();
      this.cf.a();
      this.ca.a();
      this.cb.a();
   }

   public cht a(cht.a $$0) {
      switch ($$0) {
         case a:
            this.b(cht.a.a);
            break;
         case b:
            this.a(avo.yw, 1.0F, 1.0F);
            this.b(cht.a.b);
            break;
         case c:
            this.b(cht.a.c).gz();
            break;
         case d:
            this.a(avo.ys, 1.0F, 1.0F);
            this.b(cht.a.d);
            break;
         case e:
            this.b(cht.a.e);
            break;
         case f:
            this.b(cht.a.f).gA();
            break;
         case g:
            this.a(avo.yv, 1.0F, 1.0F);
            this.b(cht.a.g);
      }

      return this;
   }

   private cht gz() {
      this.a(avo.yr, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cht gA() {
      this.ao.a(co, this.ai + 120);
      this.dQ().a(this, (byte)63);
      return this;
   }

   public cht w(boolean $$0) {
      if ($$0) {
         this.h(this.aM());
      }

      return this;
   }

   Optional<jd> go() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cek.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jd::a)
         .filter($$0 -> this.dQ().C_().a($$0))
         .map(jd::d)
         .filter(this::g)
         .findFirst();
   }

   boolean gp() {
      return !this.gj() && !this.x() && !this.o_() && !this.bf() && this.aF() && !this.bS() && this.g(this.gq().d());
   }

   private boolean g(jd $$0) {
      return this.dQ().a_($$0).a(awd.cr)
         && this.gC().noneMatch($$1 -> jl.a(this.dQ().af(), $$0).equals($$1))
         && Optional.ofNullable(this.J().a($$0, 1)).map(epm::j).orElse(false);
   }

   private void gB() {
      if (!this.dQ().x_() && this.ao.a(co) == this.ai) {
         aqt $$0 = (aqt)this.dQ();
         erq $$1 = $$0.o().be().b(erh.aU);
         ero $$2 = new ero.a($$0).a(euh.f, this.gw()).a(euh.a, this).a(eug.j);
         List<cuo> $$3 = $$1.a($$2);
         jd $$4 = this.gq();

         for (cuo $$5 : $$3) {
            cjf $$6 = new cjf($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avo.yq, 1.0F, 1.0F);
      }
   }

   private cht a(bsl $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         jd $$2 = this.gq();
         dta $$3 = this.dQ().a_($$2.d());
         if ($$3.l() != dmd.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eww $$5 = eww.b($$2).b(0.0, -0.65F, 0.0);
               this.dQ().a(new le(lm.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dQ().a(this.dv(), this.dx(), this.dB(), $$3.w().f(), this.df(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dQ().a(dxw.u, this.gq(), dxw.a.a(this));
      }

      return this;
   }

   private cht h(jd $$0) {
      List<jl> $$1 = this.gC().limit(20L).collect(Collectors.toList());
      $$1.add(0, jl.a(this.dQ().af(), $$0));
      this.dU().a(ccq.aQ, $$1);
      return this;
   }

   private Stream<jl> gC() {
      return this.dU().c(ccq.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.dt().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eww(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqt $$0, cfc $$1) {
      cuo $$2 = new cuo(cur.kq);
      cjf $$3 = new cjf($$0, this.do().a(), this.do().b(), this.do().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avo.yx, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(brj $$0) {
      this.a(cht.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gx()) {
         case e:
            this.gD();
            break;
         case f:
            this.a(this.ce).gB();
      }

      super.l();
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqq $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dQ().a(null, this, this.d($$2), avp.g, 1.0F, ayn.b(this.dQ().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gD() {
      if (this.dQ().x_() && this.ai % 20 == 0) {
         this.dQ().a(this.dv(), this.dx(), this.dB(), avo.yt, this.df(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.yl, 0.15F, 1.0F);
   }

   @Override
   public avn d(cuo $$0) {
      return avo.ym;
   }

   @Override
   protected avn v() {
      return Set.of(cht.a.f, cht.a.e).contains(this.gx()) ? null : avo.yn;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.yo;
   }

   @Override
   protected avn n_() {
      return avo.yp;
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
   public bsk a(aqt $$0, bsk $$1) {
      return bsw.aR.a((dcu)$$0);
   }

   @Override
   public boolean a(cfc $$0) {
      if (!($$0 instanceof cht $$1)) {
         return false;
      } else {
         Set<cht.a> $$2 = Set.of(cht.a.a, cht.a.c, cht.a.b);
         return $$2.contains(this.gx()) && $$2.contains($$1.gx()) && super.a($$0);
      }
   }

   @Override
   public ewr h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.X);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return chu.a(this.dV().a($$0));
   }

   @Override
   public buo<cht> dU() {
      return (buo<cht>)super.dU();
   }

   @Override
   protected buo.b<cht> dV() {
      return buo.a(chu.b, chu.a);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("snifferBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().b("snifferActivityUpdate");
      chu.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cht.a> h = axd.a(cht.a::a, values(), axd.a.a);
      public static final yw<ByteBuf, cht.a> i = yu.a(h, cht.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
