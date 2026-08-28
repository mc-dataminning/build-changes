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

public class clu extends ciu {
   private static final int bM = 1700;
   private static final int bN = 6000;
   private static final int bO = 30;
   private static final int bP = 120;
   private static final int bQ = 48000;
   private static final float bR = 0.4F;
   private static final bwi bS = bwi.b(bwo.bj.l(), bwo.bj.m() - 0.4F).b(0.81F);
   private static final akj<clu.a> bT = akn.a(clu.class, akl.F);
   private static final akj<Integer> bU = akn.a(clu.class, akl.b);
   public final bvw bG = new bvw();
   public final bvw bH = new bvw();
   public final bvw bI = new bvw();
   public final bvw bK = new bvw();
   public final bvw bL = new bvw();

   public static byj.a q() {
      return ciu.gw().a(byk.v, 0.1F).a(byk.s, 14.0);
   }

   public clu(bwo<? extends ciu> $$0, dja $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(exf.j, -1.0F);
      this.a(exf.g, -1.0F);
      this.a(exf.y, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bT, clu.a.a);
      $$0.a(bU, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bY() || this.bj()) {
         this.a(exf.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(exf.j, -1.0F);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.gE() == clu.a.f ? bS.a(this.ek()) : super.e($$0);
   }

   public boolean t() {
      return this.gE() == clu.a.e;
   }

   public boolean x() {
      return this.bs.c(cgg.S).orElse(false);
   }

   public boolean gr() {
      return !this.x() && !this.go() && !this.bj() && !this.gB() && this.aJ() && !this.bZ() && !this.O_();
   }

   public boolean gs() {
      return this.gE() == clu.a.f || this.gE() == clu.a.e;
   }

   private iu gv() {
      feq $$0 = this.gD();
      return iu.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private feq gD() {
      return this.dt().e(this.bV().c(2.25));
   }

   private clu.a gE() {
      return this.al.a(bT);
   }

   private clu b(clu.a $$0) {
      this.al.a(bT, $$0);
      return this;
   }

   @Override
   public void a(akj<?> $$0) {
      if (bT.equals($$0)) {
         clu.a $$1 = this.gE();
         this.gF();
         switch ($$1) {
            case b:
               this.bG.b(this.af);
               break;
            case c:
               this.bH.b(this.af);
               break;
            case d:
               this.bI.b(this.af);
            case e:
            default:
               break;
            case f:
               this.bK.b(this.af);
               break;
            case g:
               this.bL.b(this.af);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gF() {
      this.bK.a();
      this.bI.a();
      this.bL.a();
      this.bG.a();
      this.bH.a();
   }

   public clu a(clu.a $$0) {
      switch ($$0) {
         case a:
            this.b(clu.a.a);
            break;
         case b:
            this.a(awn.zA, 1.0F, 1.0F);
            this.b(clu.a.b);
            break;
         case c:
            this.b(clu.a.c).gG();
            break;
         case d:
            this.a(awn.zw, 1.0F, 1.0F);
            this.b(clu.a.d);
            break;
         case e:
            this.b(clu.a.e);
            break;
         case f:
            this.b(clu.a.f).gH();
            break;
         case g:
            this.a(awn.zz, 1.0F, 1.0F);
            this.b(clu.a.g);
      }

      return this;
   }

   private clu gG() {
      this.a(awn.zv, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private clu gH() {
      this.al.a(bU, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public clu w(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<iu> gt() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cia.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iu::a)
         .filter($$0 -> this.dV().A_().a($$0))
         .map(iu::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gu() {
      return !this.go() && !this.x() && !this.n_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gv().e());
   }

   private boolean h(iu $$0) {
      return this.dV().a_($$0).a(axc.cx)
         && this.gJ().noneMatch($$1 -> jd.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(exc::j).orElse(false);
   }

   private void gI() {
      if (this.dV() instanceof arq $$0 && this.al.a(bU) == this.af) {
         iu $$2 = this.gv();
         this.a($$0, ezd.aG, ($$1x, $$2x) -> {
            cnh $$3 = new cnh(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awn.zu, 1.0F, 1.0F);
         return;
      }
   }

   private clu a(bvw $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iu $$2 = this.gv();
         eah $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dss.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               feq $$5 = feq.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lp(lx.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(efh.u, this.gv(), efh.a.a(this));
      }

      return this;
   }

   private clu i(iu $$0) {
      List<jd> $$1 = this.gJ().limit(20L).collect(Collectors.toList());
      $$1.add(0, jd.a(this.dV().aj(), $$0));
      this.ec().a(cgg.aR, $$1);
      return this;
   }

   private Stream<jd> gJ() {
      return this.ec().c(cgg.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bA.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new feq(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arq $$0, ciu $$1) {
      czd $$2 = new czd(czh.kU);
      cnh $$3 = new cnh($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awn.zB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(buu $$0) {
      this.a(clu.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gE()) {
         case e:
            this.gK();
            break;
         case f:
            this.a(this.bK).gI();
      }

      super.h();
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      boolean $$3 = this.i($$2);
      bud $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gx();
      }

      return $$4;
   }

   @Override
   protected void gx() {
      this.dV().a(null, this, awn.zq, awo.g, 1.0F, azm.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gK() {
      if (this.dV().w_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.zx, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.zp, 0.15F, 1.0F);
   }

   @Override
   protected awm u() {
      return Set.of(clu.a.f, clu.a.e).contains(this.gE()) ? null : awn.zr;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.zs;
   }

   @Override
   protected awm l_() {
      return awn.zt;
   }

   @Override
   public int ad() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.bj.a($$0, bwn.e);
   }

   @Override
   public boolean a(ciu $$0) {
      if (!($$0 instanceof clu $$1)) {
         return false;
      } else {
         Set<clu.a> $$2 = Set.of(clu.a.a, clu.a.c, clu.a.b);
         return $$2.contains(this.gE()) && $$2.contains($$1.gE()) && super.a($$0);
      }
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ab);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return clv.a(this.ed().a($$0));
   }

   @Override
   public bye<clu> ec() {
      return (bye<clu>)super.ec();
   }

   @Override
   protected bye.b<clu> ed() {
      return bye.a(clv.b, clv.a);
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      clv.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<clu.a> h = ayc.a(clu.a::a, values(), ayc.a.a);
      public static final yw<ByteBuf, clu.a> i = yu.a(h, clu.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
