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

public class cmu extends cjv {
   private static final int bO = 1700;
   private static final int bP = 6000;
   private static final int bQ = 30;
   private static final int bR = 120;
   private static final int bS = 48000;
   private static final float bT = 0.4F;
   private static final bxh bU = bxh.b(bxn.bk.l(), bxn.bk.m() - 0.4F).b(0.81F);
   private static final aku<cmu.a> bV = aky.a(cmu.class, akw.G);
   private static final aku<Integer> bW = aky.a(cmu.class, akw.b);
   public final bwv bI = new bwv();
   public final bwv bJ = new bwv();
   public final bwv bK = new bwv();
   public final bwv bM = new bwv();
   public final bwv bN = new bwv();

   public static bzk.a m() {
      return cjv.gz().a(bzl.v, 0.1F).a(bzl.s, 14.0);
   }

   public cmu(bxn<? extends cjv> $$0, dkj $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(eyr.j, -1.0F);
      this.a(eyr.g, -1.0F);
      this.a(eyr.y, -1.0F);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bV, cmu.a.a);
      $$0.a(bW, 0);
   }

   @Override
   public void F() {
      super.F();
      if (this.bX() || this.bi()) {
         this.a(eyr.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(eyr.j, -1.0F);
   }

   @Override
   public bxh e(byr $$0) {
      return this.gH() == cmu.a.f ? bU.a(this.ek()) : super.e($$0);
   }

   public boolean p() {
      return this.gH() == cmu.a.e;
   }

   public boolean u() {
      return this.bs.c(chh.S).orElse(false);
   }

   public boolean gu() {
      return !this.u() && !this.gr() && !this.bi() && !this.gE() && this.aH() && !this.bY() && !this.Q_();
   }

   public boolean gv() {
      return this.gH() == cmu.a.f || this.gH() == cmu.a.e;
   }

   private iw gy() {
      fgc $$0 = this.gG();
      return iw.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fgc gG() {
      return this.dt().e(this.bU().c(2.25));
   }

   private cmu.a gH() {
      return this.al.a(bV);
   }

   private cmu b(cmu.a $$0) {
      this.al.a(bV, $$0);
      return this;
   }

   @Override
   public void a(aku<?> $$0) {
      if (bV.equals($$0)) {
         cmu.a $$1 = this.gH();
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

         this.h_();
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

   public cmu a(cmu.a $$0) {
      switch ($$0) {
         case a:
            this.b(cmu.a.a);
            break;
         case b:
            this.a(awy.zA, 1.0F, 1.0F);
            this.b(cmu.a.b);
            break;
         case c:
            this.b(cmu.a.c).gJ();
            break;
         case d:
            this.a(awy.zw, 1.0F, 1.0F);
            this.b(cmu.a.d);
            break;
         case e:
            this.b(cmu.a.e);
            break;
         case f:
            this.b(cmu.a.f).gK();
            break;
         case g:
            this.a(awy.zz, 1.0F, 1.0F);
            this.b(cmu.a.g);
      }

      return this;
   }

   private cmu gJ() {
      this.a(awy.zv, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cmu gK() {
      this.al.a(bW, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cmu w(boolean $$0) {
      if ($$0) {
         this.i(this.aQ());
      }

      return this;
   }

   Optional<iw> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cjb.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iw::a)
         .filter($$0 -> this.dV().E_().a($$0))
         .map(iw::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gx() {
      return !this.gr() && !this.u() && !this.e_() && !this.bi() && this.aH() && !this.bY() && this.h(this.gy().e());
   }

   private boolean h(iw $$0) {
      return this.dV().a_($$0).a(axn.cy)
         && this.gM().noneMatch($$1 -> jf.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(eyo::j).orElse(false);
   }

   private void gL() {
      if (this.dV() instanceof asb $$0 && this.al.a(bW) == this.af) {
         iw $$2 = this.gy();
         this.a($$0, fap.aG, ($$1x, $$2x) -> {
            coo $$3 = new coo(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.i();
            $$1x.b($$3);
         });
         this.a(awy.zu, 1.0F, 1.0F);
         return;
      }
   }

   private cmu a(bwv $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iw $$2 = this.gy();
         ebq $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dub.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fgc $$5 = fgc.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lr(lz.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(egq.u, this.gy(), egq.a.a(this));
      }

      return this;
   }

   private cmu i(iw $$0) {
      List<jf> $$1 = this.gM().limit(20L).collect(Collectors.toList());
      $$1.add(0, jf.a(this.dV().aj(), $$0));
      this.ec().a(chh.aR, $$1);
      return this;
   }

   private Stream<jf> gM() {
      return this.ec().c(chh.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void r() {
      super.r();
      double $$0 = this.bC.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fgc(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(asb $$0, cjv $$1) {
      dak $$2 = new dak(dao.kU);
      coo $$3 = new coo($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.i();
      this.a($$0, $$1, null);
      this.a(awy.zB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bvt $$0) {
      this.a(cmu.a.a);
      super.a($$0);
   }

   @Override
   public void g() {
      switch (this.gH()) {
         case e:
            this.gN();
            break;
         case f:
            this.a(this.bM).gL();
      }

      super.g();
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      boolean $$3 = this.i($$2);
      bvc $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gA();
      }

      return $$4;
   }

   @Override
   protected void gA() {
      this.dV().a(null, this, awy.zq, awz.g, 1.0F, azz.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gN() {
      if (this.dV().A_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awy.zx, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.zp, 0.15F, 1.0F);
   }

   @Override
   protected awx s() {
      return Set.of(cmu.a.f, cmu.a.e).contains(this.gH()) ? null : awy.zr;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.zs;
   }

   @Override
   protected awx j_() {
      return awy.zt;
   }

   @Override
   public int ae() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.bk.a($$0, bxm.e);
   }

   @Override
   public boolean a(cjv $$0) {
      if (!($$0 instanceof cmu $$1)) {
         return false;
      } else {
         Set<cmu.a> $$2 = Set.of(cmu.a.a, cmu.a.c, cmu.a.b);
         return $$2.contains(this.gH()) && $$2.contains($$1.gH()) && super.a($$0);
      }
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ac);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cmv.a(this.ed().a($$0));
   }

   @Override
   public bzf<cmu> ec() {
      return (bzf<cmu>)super.ec();
   }

   @Override
   protected bzf.b<cmu> ed() {
      return bzf.a(cmv.b, cmv.a);
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("snifferBrain");
      this.ec().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cmv.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cmu.a> h = ayo.a(cmu.a::a, values(), ayo.a.a);
      public static final ze<ByteBuf, cmu.a> i = zc.a(h, cmu.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
