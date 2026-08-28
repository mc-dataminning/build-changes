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

public class cjo extends cgx {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bun ck = bun.b(bur.bi.l(), bur.bi.m() - 0.4F).b(0.81F);
   private static final ajy<cjo.a> cl = akc.a(cjo.class, aka.C);
   private static final ajy<Integer> cm = akc.a(cjo.class, aka.b);
   public final buc bY = new buc();
   public final buc bZ = new buc();
   public final buc ca = new buc();
   public final buc cc = new buc();
   public final buc cd = new buc();

   public static bwn.a p() {
      return cgx.gx().a(bwo.v, 0.1F).a(bwo.s, 14.0);
   }

   public cjo(bur<? extends cgx> $$0, dgh $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(etp.j, -1.0F);
      this.a(etp.g, -1.0F);
      this.a(etp.y, -1.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cl, cjo.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void H() {
      super.H();
      if (this.bY() || this.bj()) {
         this.a(etp.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(etp.j, -1.0F);
   }

   @Override
   public bun e(bvs $$0) {
      return this.gF() == cjo.a.f ? ck.a(this.ei()) : super.e($$0);
   }

   public boolean t() {
      return this.gF() == cjo.a.e;
   }

   public boolean x() {
      return this.bE.c(cek.R).orElse(false);
   }

   public boolean gs() {
      return !this.x() && !this.gp() && !this.bj() && !this.gC() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gt() {
      return this.gF() == cjo.a.f || this.gF() == cjo.a.e;
   }

   private ji gw() {
      faz $$0 = this.gE();
      return ji.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private faz gE() {
      return this.dt().e(this.bV().c(2.25));
   }

   private cjo.a gF() {
      return this.al.a(cl);
   }

   private cjo b(cjo.a $$0) {
      this.al.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cl.equals($$0)) {
         cjo.a $$1 = this.gF();
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

   public cjo a(cjo.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjo.a.a);
            break;
         case b:
            this.a(awa.zk, 1.0F, 1.0F);
            this.b(cjo.a.b);
            break;
         case c:
            this.b(cjo.a.c).gH();
            break;
         case d:
            this.a(awa.zg, 1.0F, 1.0F);
            this.b(cjo.a.d);
            break;
         case e:
            this.b(cjo.a.e);
            break;
         case f:
            this.b(cjo.a.f).gI();
            break;
         case g:
            this.a(awa.zj, 1.0F, 1.0F);
            this.b(cjo.a.g);
      }

      return this;
   }

   private cjo gH() {
      this.a(awa.zf, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cjo gI() {
      this.al.a(cm, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cjo x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<ji> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cge.a(this, 10 + 2 * $$0, 3))
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
         && Optional.ofNullable(this.P().a($$0, 1)).map(etm::j).orElse(false);
   }

   private void gJ() {
      if (this.dV() instanceof ard $$0 && this.al.a(cm) == this.af) {
         ji $$2 = this.gw();
         this.a($$0, evm.aG, ($$1x, $$2x) -> {
            clb $$3 = new clb(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(awa.ze, 1.0F, 1.0F);
         return;
      }
   }

   private cjo a(buc $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         ji $$2 = this.gw();
         dww $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dpw.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               faz $$5 = faz.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new ll(lt.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ebs.u, this.gw(), ebs.a.a(this));
      }

      return this;
   }

   private cjo i(ji $$0) {
      List<jq> $$1 = this.gK().limit(20L).collect(Collectors.toList());
      $$1.add(0, jq.a(this.dV().ai(), $$0));
      this.eb().a(cek.aQ, $$1);
      return this;
   }

   private Stream<jq> gK() {
      return this.eb().c(cek.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new faz(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ard $$0, cgx $$1) {
      cwo $$2 = new cwo(cws.kN);
      clb $$3 = new clb($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(awa.zl, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bta $$0) {
      this.a(cjo.a.a);
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
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsj $$4 = super.b($$0, $$1);
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
   protected void b(ji $$0, dww $$1) {
      this.a(awa.yZ, 0.15F, 1.0F);
   }

   @Override
   protected avz u() {
      return Set.of(cjo.a.f, cjo.a.e).contains(this.gF()) ? null : awa.zb;
   }

   @Override
   protected avz e(bta $$0) {
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
   public bub a(ard $$0, bub $$1) {
      return bur.bi.a($$0, buq.e);
   }

   @Override
   public boolean a(cgx $$0) {
      if (!($$0 instanceof cjo $$1)) {
         return false;
      } else {
         Set<cjo.a> $$2 = Set.of(cjo.a.a, cjo.a.c, cjo.a.b);
         return $$2.contains(this.gF()) && $$2.contains($$1.gF()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.aa);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cjp.a(this.ec().a($$0));
   }

   @Override
   public bwi<cjo> eb() {
      return (bwi<cjo>)super.eb();
   }

   @Override
   protected bwi.b<cjo> ec() {
      return bwi.a(cjp.b, cjp.a);
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cjp.a(this);
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

      public static final IntFunction<cjo.a> h = axq.a(cjo.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, cjo.a> i = yl.a(h, cjo.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
