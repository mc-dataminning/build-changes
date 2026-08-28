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

public class cjn extends cgw {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bum ck = bum.b(buq.bi.l(), buq.bi.m() - 0.4F).b(0.81F);
   private static final ajx<cjn.a> cl = akb.a(cjn.class, ajz.C);
   private static final ajx<Integer> cm = akb.a(cjn.class, ajz.b);
   public final bub bY = new bub();
   public final bub bZ = new bub();
   public final bub ca = new bub();
   public final bub cc = new bub();
   public final bub cd = new bub();

   public static bwm.a p() {
      return cgw.gu().a(bwn.v, 0.1F).a(bwn.s, 14.0);
   }

   public cjn(buq<? extends cgw> $$0, dgg $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eto.j, -1.0F);
      this.a(eto.g, -1.0F);
      this.a(eto.y, -1.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cl, cjn.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(eto.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(eto.j, -1.0F);
   }

   @Override
   public bum e(bvr $$0) {
      return this.gC() == cjn.a.f ? ck.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gC() == cjn.a.e;
   }

   public boolean x() {
      return this.bE.c(cej.R).orElse(false);
   }

   public boolean gp() {
      return !this.x() && !this.gm() && !this.bj() && !this.gz() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gq() {
      return this.gC() == cjn.a.f || this.gC() == cjn.a.e;
   }

   private ji gt() {
      fay $$0 = this.gB();
      return ji.a($$0.a(), this.dD() + 0.2F, $$0.c());
   }

   private fay gB() {
      return this.du().e(this.bV().c(2.25));
   }

   private cjn.a gC() {
      return this.al.a(cl);
   }

   private cjn b(cjn.a $$0) {
      this.al.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (cl.equals($$0)) {
         cjn.a $$1 = this.gC();
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

   public cjn a(cjn.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjn.a.a);
            break;
         case b:
            this.a(avz.zk, 1.0F, 1.0F);
            this.b(cjn.a.b);
            break;
         case c:
            this.b(cjn.a.c).gE();
            break;
         case d:
            this.a(avz.zg, 1.0F, 1.0F);
            this.b(cjn.a.d);
            break;
         case e:
            this.b(cjn.a.e);
            break;
         case f:
            this.b(cjn.a.f).gF();
            break;
         case g:
            this.a(avz.zj, 1.0F, 1.0F);
            this.b(cjn.a.g);
      }

      return this;
   }

   private cjn gE() {
      this.a(avz.zf, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cjn gF() {
      this.al.a(cm, this.af + 120);
      this.dW().a(this, (byte)63);
      return this;
   }

   public cjn x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<ji> gr() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgd.a(this, 10 + 2 * $$0, 3))
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
      return this.dW().a_($$0).a(awo.cu)
         && this.gH().noneMatch($$1 -> jq.a(this.dW().ai(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(etl::j).orElse(false);
   }

   private void gG() {
      if (this.dW() instanceof arc $$0 && this.al.a(cm) == this.af) {
         ji $$2 = this.gt();
         this.a($$0, evl.aG, ($$1x, $$2x) -> {
            cla $$3 = new cla(this.dW(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(avz.ze, 1.0F, 1.0F);
         return;
      }
   }

   private cjn a(bub $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         ji $$2 = this.gt();
         dwv $$3 = this.dW().a_($$2.e());
         if ($$3.o() != dpv.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fay $$5 = fay.b($$2).b(0.0, -0.65F, 0.0);
               this.dW().a(new ll(lt.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dW().a(this.dB(), this.dD(), this.dH(), $$3.A().f(), this.dn(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dW().a(ebr.u, this.gt(), ebr.a.a(this));
      }

      return this;
   }

   private cjn i(ji $$0) {
      List<jq> $$1 = this.gH().limit(20L).collect(Collectors.toList());
      $$1.add(0, jq.a(this.dW().ai(), $$0));
      this.ec().a(cej.aQ, $$1);
      return this;
   }

   private Stream<jq> gH() {
      return this.ec().c(cej.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fay(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arc $$0, cgw $$1) {
      cwn $$2 = new cwn(cwr.kN);
      cla $$3 = new cla($$0, this.du().a(), this.du().b(), this.du().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(avz.zl, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsz $$0) {
      this.a(cjn.a.a);
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
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsi $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gv();
      }

      return $$4;
   }

   @Override
   protected void gv() {
      this.dW().a(null, this, avz.za, awa.g, 1.0F, ayy.b(this.dW().A, 0.8F, 1.2F));
   }

   private void gI() {
      if (this.dW().B_() && this.af % 20 == 0) {
         this.dW().a(this.dB(), this.dD(), this.dH(), avz.zh, this.dn(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.yZ, 0.15F, 1.0F);
   }

   @Override
   protected avy u() {
      return Set.of(cjn.a.f, cjn.a.e).contains(this.gC()) ? null : avz.zb;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.zc;
   }

   @Override
   protected avy o_() {
      return avz.zd;
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
   public bua a(arc $$0, bua $$1) {
      return buq.bi.a($$0, bup.e);
   }

   @Override
   public boolean a(cgw $$0) {
      if (!($$0 instanceof cjn $$1)) {
         return false;
      } else {
         Set<cjn.a> $$2 = Set.of(cjn.a.a, cjn.a.c, cjn.a.b);
         return $$2.contains(this.gC()) && $$2.contains($$1.gC()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.aa);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cjo.a(this.ed().a($$0));
   }

   @Override
   public bwh<cjn> ec() {
      return (bwh<cjn>)super.ec();
   }

   @Override
   protected bwh.b<cjn> ed() {
      return bwh.a(cjo.b, cjo.a);
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cjo.a(this);
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

      public static final IntFunction<cjn.a> h = axp.a(cjn.a::a, values(), axp.a.a);
      public static final ym<ByteBuf, cjn.a> i = yk.a(h, cjn.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
