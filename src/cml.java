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

public class cml extends cjm {
   private static final int bO = 1700;
   private static final int bP = 6000;
   private static final int bQ = 30;
   private static final int bR = 120;
   private static final int bS = 48000;
   private static final float bT = 0.4F;
   private static final bwy bU = bwy.b(bxe.bk.l(), bxe.bk.m() - 0.4F).b(0.81F);
   private static final akn<cml.a> bV = akr.a(cml.class, akp.G);
   private static final akn<Integer> bW = akr.a(cml.class, akp.b);
   public final bwm bI = new bwm();
   public final bwm bJ = new bwm();
   public final bwm bK = new bwm();
   public final bwm bM = new bwm();
   public final bwm bN = new bwm();

   public static bzb.a q() {
      return cjm.gz().a(bzc.v, 0.1F).a(bzc.s, 14.0);
   }

   public cml(bxe<? extends cjm> $$0, djz $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(eyh.j, -1.0F);
      this.a(eyh.g, -1.0F);
      this.a(eyh.y, -1.0F);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bV, cml.a.a);
      $$0.a(bW, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bX() || this.bi()) {
         this.a(eyh.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(eyh.j, -1.0F);
   }

   @Override
   public bwy e(byi $$0) {
      return this.gH() == cml.a.f ? bU.a(this.ek()) : super.e($$0);
   }

   public boolean t() {
      return this.gH() == cml.a.e;
   }

   public boolean x() {
      return this.bs.c(cgy.S).orElse(false);
   }

   public boolean gu() {
      return !this.x() && !this.gr() && !this.bi() && !this.gE() && this.aH() && !this.bY() && !this.S_();
   }

   public boolean gv() {
      return this.gH() == cml.a.f || this.gH() == cml.a.e;
   }

   private iw gy() {
      ffs $$0 = this.gG();
      return iw.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private ffs gG() {
      return this.dt().e(this.bU().c(2.25));
   }

   private cml.a gH() {
      return this.al.a(bV);
   }

   private cml b(cml.a $$0) {
      this.al.a(bV, $$0);
      return this;
   }

   @Override
   public void a(akn<?> $$0) {
      if (bV.equals($$0)) {
         cml.a $$1 = this.gH();
         this.gI();
         switch ($$1) {
            case b:
               this.bI.b(this.af);
               break;
            case c:
               this.bJ.b(this.af);
               break;
            case d:
               this.bK.b(this.af);
            case e:
            default:
               break;
            case f:
               this.bM.b(this.af);
               break;
            case g:
               this.bN.b(this.af);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gI() {
      this.bM.a();
      this.bK.a();
      this.bN.a();
      this.bI.a();
      this.bJ.a();
   }

   public cml a(cml.a $$0) {
      switch ($$0) {
         case a:
            this.b(cml.a.a);
            break;
         case b:
            this.a(awr.zA, 1.0F, 1.0F);
            this.b(cml.a.b);
            break;
         case c:
            this.b(cml.a.c).gJ();
            break;
         case d:
            this.a(awr.zw, 1.0F, 1.0F);
            this.b(cml.a.d);
            break;
         case e:
            this.b(cml.a.e);
            break;
         case f:
            this.b(cml.a.f).gK();
            break;
         case g:
            this.a(awr.zz, 1.0F, 1.0F);
            this.b(cml.a.g);
      }

      return this;
   }

   private cml gJ() {
      this.a(awr.zv, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private cml gK() {
      this.al.a(bW, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cml w(boolean $$0) {
      if ($$0) {
         this.i(this.aQ());
      }

      return this;
   }

   Optional<iw> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cis.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iw::a)
         .filter($$0 -> this.dV().E_().a($$0))
         .map(iw::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gx() {
      return !this.gr() && !this.x() && !this.n_() && !this.bi() && this.aH() && !this.bY() && this.h(this.gy().e());
   }

   private boolean h(iw $$0) {
      return this.dV().a_($$0).a(axg.cy)
         && this.gM().noneMatch($$1 -> jf.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(eye::j).orElse(false);
   }

   private void gL() {
      if (this.dV() instanceof aru $$0 && this.al.a(bW) == this.af) {
         iw $$2 = this.gy();
         this.a($$0, faf.aG, ($$1x, $$2x) -> {
            coe $$3 = new coe(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awr.zu, 1.0F, 1.0F);
         return;
      }
   }

   private cml a(bwm $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iw $$2 = this.gy();
         ebg $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dtr.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ffs $$5 = ffs.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lr(lz.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(egg.u, this.gy(), egg.a.a(this));
      }

      return this;
   }

   private cml i(iw $$0) {
      List<jf> $$1 = this.gM().limit(20L).collect(Collectors.toList());
      $$1.add(0, jf.a(this.dV().aj(), $$0));
      this.ec().a(cgy.aR, $$1);
      return this;
   }

   private Stream<jf> gM() {
      return this.ec().c(cgy.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bC.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ffs(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aru $$0, cjm $$1) {
      daa $$2 = new daa(dae.kU);
      coe $$3 = new coe($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awr.zB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bvk $$0) {
      this.a(cml.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gH()) {
         case e:
            this.gN();
            break;
         case f:
            this.a(this.bM).gL();
      }

      super.h();
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      boolean $$3 = this.i($$2);
      but $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gA();
      }

      return $$4;
   }

   @Override
   protected void gA() {
      this.dV().a(null, this, awr.zq, aws.g, 1.0F, azq.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gN() {
      if (this.dV().A_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awr.zx, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.zp, 0.15F, 1.0F);
   }

   @Override
   protected awq u() {
      return Set.of(cml.a.f, cml.a.e).contains(this.gH()) ? null : awr.zr;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.zs;
   }

   @Override
   protected awq l_() {
      return awr.zt;
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
   public bwl a(aru $$0, bwl $$1) {
      return bxe.bk.a($$0, bxd.e);
   }

   @Override
   public boolean a(cjm $$0) {
      if (!($$0 instanceof cml $$1)) {
         return false;
      } else {
         Set<cml.a> $$2 = Set.of(cml.a.a, cml.a.c, cml.a.b);
         return $$2.contains(this.gH()) && $$2.contains($$1.gH()) && super.a($$0);
      }
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ac);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return cmm.a(this.ed().a($$0));
   }

   @Override
   public byw<cml> ec() {
      return (byw<cml>)super.ec();
   }

   @Override
   protected byw.b<cml> ed() {
      return byw.a(cmm.b, cmm.a);
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cmm.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cml.a> h = ayg.a(cml.a::a, values(), ayg.a.a);
      public static final za<ByteBuf, cml.a> i = yy.a(h, cml.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
