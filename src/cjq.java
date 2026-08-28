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

public class cjq extends cgz {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bup ck = bup.b(but.bi.l(), but.bi.m() - 0.4F).b(0.81F);
   private static final ajy<cjq.a> cl = akc.a(cjq.class, aka.C);
   private static final ajy<Integer> cm = akc.a(cjq.class, aka.b);
   public final bue bY = new bue();
   public final bue bZ = new bue();
   public final bue ca = new bue();
   public final bue cc = new bue();
   public final bue cd = new bue();

   public static bwp.a p() {
      return cgz.gx().a(bwq.v, 0.1F).a(bwq.s, 14.0);
   }

   public cjq(but<? extends cgz> $$0, dgj $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(etr.j, -1.0F);
      this.a(etr.g, -1.0F);
      this.a(etr.y, -1.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cl, cjq.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void H() {
      super.H();
      if (this.bY() || this.bj()) {
         this.a(etr.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(etr.j, -1.0F);
   }

   @Override
   public bup e(bvu $$0) {
      return this.gF() == cjq.a.f ? ck.a(this.ei()) : super.e($$0);
   }

   public boolean t() {
      return this.gF() == cjq.a.e;
   }

   public boolean x() {
      return this.bE.c(cem.R).orElse(false);
   }

   public boolean gs() {
      return !this.x() && !this.gp() && !this.bj() && !this.gC() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gt() {
      return this.gF() == cjq.a.f || this.gF() == cjq.a.e;
   }

   private ji gw() {
      fbb $$0 = this.gE();
      return ji.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fbb gE() {
      return this.dt().e(this.bV().c(2.25));
   }

   private cjq.a gF() {
      return this.al.a(cl);
   }

   private cjq b(cjq.a $$0) {
      this.al.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cl.equals($$0)) {
         cjq.a $$1 = this.gF();
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

   public cjq a(cjq.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjq.a.a);
            break;
         case b:
            this.a(awa.zk, 1.0F, 1.0F);
            this.b(cjq.a.b);
            break;
         case c:
            this.b(cjq.a.c).gH();
            break;
         case d:
            this.a(awa.zg, 1.0F, 1.0F);
            this.b(cjq.a.d);
            break;
         case e:
            this.b(cjq.a.e);
            break;
         case f:
            this.b(cjq.a.f).gI();
            break;
         case g:
            this.a(awa.zj, 1.0F, 1.0F);
            this.b(cjq.a.g);
      }

      return this;
   }

   private cjq gH() {
      this.a(awa.zf, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cjq gI() {
      this.al.a(cm, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cjq x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<ji> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgg.a(this, 10 + 2 * $$0, 3))
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
         && Optional.ofNullable(this.P().a($$0, 1)).map(eto::j).orElse(false);
   }

   private void gJ() {
      if (this.dV() instanceof ard $$0 && this.al.a(cm) == this.af) {
         ji $$2 = this.gw();
         this.a($$0, evo.aG, ($$1x, $$2x) -> {
            cld $$3 = new cld(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(awa.ze, 1.0F, 1.0F);
         return;
      }
   }

   private cjq a(bue $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         ji $$2 = this.gw();
         dwy $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dpy.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fbb $$5 = fbb.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new ll(lt.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ebu.u, this.gw(), ebu.a.a(this));
      }

      return this;
   }

   private cjq i(ji $$0) {
      List<jq> $$1 = this.gK().limit(20L).collect(Collectors.toList());
      $$1.add(0, jq.a(this.dV().ai(), $$0));
      this.eb().a(cem.aQ, $$1);
      return this;
   }

   private Stream<jq> gK() {
      return this.eb().c(cem.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbb(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ard $$0, cgz $$1) {
      cwq $$2 = new cwq(cwu.kN);
      cld $$3 = new cld($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(awa.zl, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btc $$0) {
      this.a(cjq.a.a);
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
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsl $$4 = super.b($$0, $$1);
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
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.yZ, 0.15F, 1.0F);
   }

   @Override
   protected avz u() {
      return Set.of(cjq.a.f, cjq.a.e).contains(this.gF()) ? null : awa.zb;
   }

   @Override
   protected avz e(btc $$0) {
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
   public bud a(ard $$0, bud $$1) {
      return but.bi.a($$0, bus.e);
   }

   @Override
   public boolean a(cgz $$0) {
      if (!($$0 instanceof cjq $$1)) {
         return false;
      } else {
         Set<cjq.a> $$2 = Set.of(cjq.a.a, cjq.a.c, cjq.a.b);
         return $$2.contains(this.gF()) && $$2.contains($$1.gF()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.aa);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cjr.a(this.ec().a($$0));
   }

   @Override
   public bwk<cjq> eb() {
      return (bwk<cjq>)super.eb();
   }

   @Override
   protected bwk.b<cjq> ec() {
      return bwk.a(cjr.b, cjr.a);
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cjr.a(this);
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

      public static final IntFunction<cjq.a> h = axq.a(cjq.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, cjq.a> i = yl.a(h, cjq.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
