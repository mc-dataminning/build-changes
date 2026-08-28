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

public class ckf extends cho {
   private static final int cf = 1700;
   private static final int cg = 6000;
   private static final int ch = 30;
   private static final int ci = 120;
   private static final int cj = 48000;
   private static final float ck = 0.4F;
   private static final bve cl = bve.b(bvi.bj.l(), bvi.bj.m() - 0.4F).b(0.81F);
   private static final aks<ckf.a> cm = akw.a(ckf.class, aku.C);
   private static final aks<Integer> cn = akw.a(ckf.class, aku.b);
   public final but bZ = new but();
   public final but ca = new but();
   public final but cb = new but();
   public final but cd = new but();
   public final but ce = new but();

   public static bxe.a p() {
      return cho.gt().a(bxf.v, 0.1F).a(bxf.s, 14.0);
   }

   public ckf(bvi<? extends cho> $$0, dgz $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(euh.j, -1.0F);
      this.a(euh.g, -1.0F);
      this.a(euh.y, -1.0F);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cm, ckf.a.a);
      $$0.a(cn, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(euh.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(euh.j, -1.0F);
   }

   @Override
   public bve e(bwj $$0) {
      return this.gB() == ckf.a.f ? cl.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gB() == ckf.a.e;
   }

   public boolean x() {
      return this.bF.c(cfb.R).orElse(false);
   }

   public boolean go() {
      return !this.x() && !this.gl() && !this.bj() && !this.gy() && this.aJ() && !this.bZ() && !this.P_();
   }

   public boolean gp() {
      return this.gB() == ckf.a.f || this.gB() == ckf.a.e;
   }

   private jh gs() {
      fbr $$0 = this.gA();
      return jh.a($$0.a(), this.dD() + 0.2F, $$0.c());
   }

   private fbr gA() {
      return this.du().e(this.bV().c(2.25));
   }

   private ckf.a gB() {
      return this.al.a(cm);
   }

   private ckf b(ckf.a $$0) {
      this.al.a(cm, $$0);
      return this;
   }

   @Override
   public void a(aks<?> $$0) {
      if (cm.equals($$0)) {
         ckf.a $$1 = this.gB();
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

   public ckf a(ckf.a $$0) {
      switch ($$0) {
         case a:
            this.b(ckf.a.a);
            break;
         case b:
            this.a(awv.zl, 1.0F, 1.0F);
            this.b(ckf.a.b);
            break;
         case c:
            this.b(ckf.a.c).gD();
            break;
         case d:
            this.a(awv.zh, 1.0F, 1.0F);
            this.b(ckf.a.d);
            break;
         case e:
            this.b(ckf.a.e);
            break;
         case f:
            this.b(ckf.a.f).gE();
            break;
         case g:
            this.a(awv.zk, 1.0F, 1.0F);
            this.b(ckf.a.g);
      }

      return this;
   }

   private ckf gD() {
      this.a(awv.zg, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private ckf gE() {
      this.al.a(cn, this.af + 120);
      this.dW().a(this, (byte)63);
      return this;
   }

   public ckf x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<jh> gq() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgv.a(this, 10 + 2 * $$0, 3))
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
      return this.dW().a_($$0).a(axk.cu)
         && this.gG().noneMatch($$1 -> jp.a(this.dW().ai(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(eue::j).orElse(false);
   }

   private void gF() {
      if (this.dW() instanceof arx $$0 && this.al.a(cn) == this.af) {
         jh $$2 = this.gs();
         this.a($$0, ewe.aG, ($$1x, $$2x) -> {
            cls $$3 = new cls(this.dW(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.s();
            $$1x.b($$3);
         });
         this.a(awv.zf, 1.0F, 1.0F);
         return;
      }
   }

   private ckf a(but $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         jh $$2 = this.gs();
         dxo $$3 = this.dW().a_($$2.e());
         if ($$3.o() != dqo.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fbr $$5 = fbr.b($$2).b(0.0, -0.65F, 0.0);
               this.dW().a(new lk(ls.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dW().a(this.dB(), this.dD(), this.dH(), $$3.A().f(), this.dn(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dW().a(eck.u, this.gs(), eck.a.a(this));
      }

      return this;
   }

   private ckf i(jh $$0) {
      List<jp> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dW().ai(), $$0));
      this.ec().a(cfb.aQ, $$1);
      return this;
   }

   private Stream<jp> gG() {
      return this.ec().c(cfb.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbr(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arx $$0, cho $$1) {
      cxg $$2 = new cxg(cxk.kN);
      cls $$3 = new cls($$0, this.du().a(), this.du().b(), this.du().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(awv.zm, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btr $$0) {
      this.a(ckf.a.a);
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
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bta $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gu();
      }

      return $$4;
   }

   @Override
   protected void gu() {
      this.dW().a(null, this, awv.zb, aww.g, 1.0F, azu.b(this.dW().A, 0.8F, 1.2F));
   }

   private void gH() {
      if (this.dW().B_() && this.af % 20 == 0) {
         this.dW().a(this.dB(), this.dD(), this.dH(), awv.zi, this.dn(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.za, 0.15F, 1.0F);
   }

   @Override
   protected awu u() {
      return Set.of(ckf.a.f, ckf.a.e).contains(this.gB()) ? null : awv.zc;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.zd;
   }

   @Override
   protected awu o_() {
      return awv.ze;
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
   public bus a(arx $$0, bus $$1) {
      return bvi.bj.a($$0, bvh.e);
   }

   @Override
   public boolean a(cho $$0) {
      if (!($$0 instanceof ckf $$1)) {
         return false;
      } else {
         Set<ckf.a> $$2 = Set.of(ckf.a.a, ckf.a.c, ckf.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ac);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return ckg.a(this.ed().a($$0));
   }

   @Override
   public bwz<ckf> ec() {
      return (bwz<ckf>)super.ec();
   }

   @Override
   protected bwz.b<ckf> ed() {
      return bwz.a(ckg.b, ckg.a);
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      ckg.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<ckf.a> h = ayl.a(ckf.a::a, values(), ayl.a.a);
      public static final zi<ByteBuf, ckf.a> i = zg.a(h, ckf.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
