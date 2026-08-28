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
   private static final bun ck = bun.b(bur.bj.l(), bur.bj.m() - 0.4F).b(0.81F);
   private static final ajx<cjo.a> cl = akb.a(cjo.class, ajz.C);
   private static final ajx<Integer> cm = akb.a(cjo.class, ajz.b);
   public final buc bY = new buc();
   public final buc bZ = new buc();
   public final buc ca = new buc();
   public final buc cc = new buc();
   public final buc cd = new buc();

   public static bwn.a p() {
      return cgx.gu().a(bwo.v, 0.1F).a(bwo.s, 14.0);
   }

   public cjo(bur<? extends cgx> $$0, dgi $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(etq.j, -1.0F);
      this.a(etq.g, -1.0F);
      this.a(etq.y, -1.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cl, cjo.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(etq.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(etq.j, -1.0F);
   }

   @Override
   public bun e(bvs $$0) {
      return this.gC() == cjo.a.f ? ck.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gC() == cjo.a.e;
   }

   public boolean x() {
      return this.bE.c(cek.R).orElse(false);
   }

   public boolean gp() {
      return !this.x() && !this.gm() && !this.bj() && !this.gz() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gq() {
      return this.gC() == cjo.a.f || this.gC() == cjo.a.e;
   }

   private ji gt() {
      fba $$0 = this.gB();
      return ji.a($$0.a(), this.dD() + 0.2F, $$0.c());
   }

   private fba gB() {
      return this.du().e(this.bV().c(2.25));
   }

   private cjo.a gC() {
      return this.al.a(cl);
   }

   private cjo b(cjo.a $$0) {
      this.al.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (cl.equals($$0)) {
         cjo.a $$1 = this.gC();
         this.gD();
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

   private void gD() {
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
            this.a(awa.zl, 1.0F, 1.0F);
            this.b(cjo.a.b);
            break;
         case c:
            this.b(cjo.a.c).gE();
            break;
         case d:
            this.a(awa.zh, 1.0F, 1.0F);
            this.b(cjo.a.d);
            break;
         case e:
            this.b(cjo.a.e);
            break;
         case f:
            this.b(cjo.a.f).gF();
            break;
         case g:
            this.a(awa.zk, 1.0F, 1.0F);
            this.b(cjo.a.g);
      }

      return this;
   }

   private cjo gE() {
      this.a(awa.zg, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cjo gF() {
      this.al.a(cm, this.af + 120);
      this.dW().a(this, (byte)63);
      return this;
   }

   public cjo x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<ji> gr() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cge.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ji::a)
         .filter($$0 -> this.dW().F_().a($$0))
         .map(ji::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gs() {
      return !this.gm() && !this.x() && !this.e_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gt().e());
   }

   private boolean h(ji $$0) {
      return this.dW().a_($$0).a(awp.cu)
         && this.gH().noneMatch($$1 -> jq.a(this.dW().ai(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(etn::j).orElse(false);
   }

   private void gG() {
      if (this.dW() instanceof arc $$0 && this.al.a(cm) == this.af) {
         ji $$2 = this.gt();
         this.a($$0, evn.aG, ($$1x, $$2x) -> {
            clb $$3 = new clb(this.dW(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(awa.zf, 1.0F, 1.0F);
         return;
      }
   }

   private cjo a(buc $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         ji $$2 = this.gt();
         dwx $$3 = this.dW().a_($$2.e());
         if ($$3.o() != dpx.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fba $$5 = fba.b($$2).b(0.0, -0.65F, 0.0);
               this.dW().a(new ll(lt.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dW().a(this.dB(), this.dD(), this.dH(), $$3.A().f(), this.dn(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dW().a(ebt.u, this.gt(), ebt.a.a(this));
      }

      return this;
   }

   private cjo i(ji $$0) {
      List<jq> $$1 = this.gH().limit(20L).collect(Collectors.toList());
      $$1.add(0, jq.a(this.dW().ai(), $$0));
      this.ec().a(cek.aQ, $$1);
      return this;
   }

   private Stream<jq> gH() {
      return this.ec().c(cek.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fba(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arc $$0, cgx $$1) {
      cwp $$2 = new cwp(cwt.kN);
      clb $$3 = new clb($$0, this.du().a(), this.du().b(), this.du().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(awa.zm, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bta $$0) {
      this.a(cjo.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gC()) {
         case e:
            this.gI();
            break;
         case f:
            this.a(this.cc).gG();
      }

      super.h();
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsj $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gv();
      }

      return $$4;
   }

   @Override
   protected void gv() {
      this.dW().a(null, this, awa.zb, awb.g, 1.0F, ayz.b(this.dW().A, 0.8F, 1.2F));
   }

   private void gI() {
      if (this.dW().B_() && this.af % 20 == 0) {
         this.dW().a(this.dB(), this.dD(), this.dH(), awa.zi, this.dn(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.za, 0.15F, 1.0F);
   }

   @Override
   protected avz u() {
      return Set.of(cjo.a.f, cjo.a.e).contains(this.gC()) ? null : awa.zc;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.zd;
   }

   @Override
   protected avz o_() {
      return awa.ze;
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
   public bub a(arc $$0, bub $$1) {
      return bur.bj.a($$0, buq.e);
   }

   @Override
   public boolean a(cgx $$0) {
      if (!($$0 instanceof cjo $$1)) {
         return false;
      } else {
         Set<cjo.a> $$2 = Set.of(cjo.a.a, cjo.a.c, cjo.a.b);
         return $$2.contains(this.gC()) && $$2.contains($$1.gC()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.aa);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cjp.a(this.ed().a($$0));
   }

   @Override
   public bwi<cjo> ec() {
      return (bwi<cjo>)super.ec();
   }

   @Override
   protected bwi.b<cjo> ed() {
      return bwi.a(cjp.b, cjp.a);
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cjp.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
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
      public static final ym<ByteBuf, cjo.a> i = yk.a(h, cjo.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
