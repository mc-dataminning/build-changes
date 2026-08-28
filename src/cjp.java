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

public class cjp extends cgy {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final buo ck = buo.b(bus.bi.l(), bus.bi.m() - 0.4F).b(0.81F);
   private static final ajy<cjp.a> cl = akc.a(cjp.class, aka.C);
   private static final ajy<Integer> cm = akc.a(cjp.class, aka.b);
   public final bud bY = new bud();
   public final bud bZ = new bud();
   public final bud ca = new bud();
   public final bud cc = new bud();
   public final bud cd = new bud();

   public static bwo.a p() {
      return cgy.gx().a(bwp.v, 0.1F).a(bwp.s, 14.0);
   }

   public cjp(bus<? extends cgy> $$0, dgi $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(etq.j, -1.0F);
      this.a(etq.g, -1.0F);
      this.a(etq.y, -1.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cl, cjp.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void H() {
      super.H();
      if (this.bY() || this.bj()) {
         this.a(etq.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(etq.j, -1.0F);
   }

   @Override
   public buo e(bvt $$0) {
      return this.gF() == cjp.a.f ? ck.a(this.ei()) : super.e($$0);
   }

   public boolean t() {
      return this.gF() == cjp.a.e;
   }

   public boolean x() {
      return this.bE.c(cel.R).orElse(false);
   }

   public boolean gs() {
      return !this.x() && !this.gp() && !this.bj() && !this.gC() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gt() {
      return this.gF() == cjp.a.f || this.gF() == cjp.a.e;
   }

   private ji gw() {
      fba $$0 = this.gE();
      return ji.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fba gE() {
      return this.dt().e(this.bV().c(2.25));
   }

   private cjp.a gF() {
      return this.al.a(cl);
   }

   private cjp b(cjp.a $$0) {
      this.al.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cl.equals($$0)) {
         cjp.a $$1 = this.gF();
         this.gG();
         switch ($$1) {
            case b:
               this.bY.b(this.af);
               break;
            case c:
               this.bZ.b(this.af);
               break;
            case d:
               this.ca.b(this.af);
            case e:
            default:
               break;
            case f:
               this.cc.b(this.af);
               break;
            case g:
               this.cd.b(this.af);
         }

         this.m_();
      }

      super.a($$0);
   }

   private void gG() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cjp a(cjp.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjp.a.a);
            break;
         case b:
            this.a(awa.zk, 1.0F, 1.0F);
            this.b(cjp.a.b);
            break;
         case c:
            this.b(cjp.a.c).gH();
            break;
         case d:
            this.a(awa.zg, 1.0F, 1.0F);
            this.b(cjp.a.d);
            break;
         case e:
            this.b(cjp.a.e);
            break;
         case f:
            this.b(cjp.a.f).gI();
            break;
         case g:
            this.a(awa.zj, 1.0F, 1.0F);
            this.b(cjp.a.g);
      }

      return this;
   }

   private cjp gH() {
      this.a(awa.zf, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cjp gI() {
      this.al.a(cm, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cjp x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<ji> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgf.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ji::a)
         .filter($$0 -> this.dV().F_().a($$0))
         .map(ji::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gv() {
      return !this.gp() && !this.x() && !this.e_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gw().e());
   }

   private boolean h(ji $$0) {
      return this.dV().a_($$0).a(awp.cu)
         && this.gK().noneMatch($$1 -> jq.a(this.dV().ai(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(etn::j).orElse(false);
   }

   private void gJ() {
      if (this.dV() instanceof ard $$0 && this.al.a(cm) == this.af) {
         ji $$2 = this.gw();
         this.a($$0, evn.aG, ($$1x, $$2x) -> {
            clc $$3 = new clc(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(awa.ze, 1.0F, 1.0F);
         return;
      }
   }

   private cjp a(bud $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         ji $$2 = this.gw();
         dwx $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dpx.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fba $$5 = fba.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new ll(lt.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ebt.u, this.gw(), ebt.a.a(this));
      }

      return this;
   }

   private cjp i(ji $$0) {
      List<jq> $$1 = this.gK().limit(20L).collect(Collectors.toList());
      $$1.add(0, jq.a(this.dV().ai(), $$0));
      this.eb().a(cel.aQ, $$1);
      return this;
   }

   private Stream<jq> gK() {
      return this.eb().c(cel.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fba(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ard $$0, cgy $$1) {
      cwp $$2 = new cwp(cwt.kN);
      clc $$3 = new clc($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(awa.zl, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btb $$0) {
      this.a(cjp.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gF()) {
         case e:
            this.gL();
            break;
         case f:
            this.a(this.cc).gJ();
      }

      super.h();
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsk $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gy();
      }

      return $$4;
   }

   @Override
   protected void gy() {
      this.dV().a(null, this, awa.za, awb.g, 1.0F, ayz.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gL() {
      if (this.dV().B_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awa.zh, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.yZ, 0.15F, 1.0F);
   }

   @Override
   protected avz u() {
      return Set.of(cjp.a.f, cjp.a.e).contains(this.gF()) ? null : awa.zb;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.zc;
   }

   @Override
   protected avz o_() {
      return awa.zd;
   }

   @Override
   public int af() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public buc a(ard $$0, buc $$1) {
      return bus.bi.a($$0, bur.e);
   }

   @Override
   public boolean a(cgy $$0) {
      if (!($$0 instanceof cjp $$1)) {
         return false;
      } else {
         Set<cjp.a> $$2 = Set.of(cjp.a.a, cjp.a.c, cjp.a.b);
         return $$2.contains(this.gF()) && $$2.contains($$1.gF()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.aa);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cjq.a(this.ec().a($$0));
   }

   @Override
   public bwj<cjp> eb() {
      return (bwj<cjp>)super.eb();
   }

   @Override
   protected bwj.b<cjp> ec() {
      return bwj.a(cjq.b, cjq.a);
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cjq.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cjp.a> h = axq.a(cjp.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, cjp.a> i = yl.a(h, cjp.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
