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

public class cla extends cig {
   private static final int bK = 1700;
   private static final int bL = 6000;
   private static final int bM = 30;
   private static final int bN = 120;
   private static final int bO = 48000;
   private static final float bP = 0.4F;
   private static final bvv bQ = bvv.b(bwb.bi.l(), bwb.bi.m() - 0.4F).b(0.81F);
   private static final akg<cla.a> bR = akk.a(cla.class, aki.D);
   private static final akg<Integer> bS = akk.a(cla.class, aki.b);
   public final bvj bE = new bvj();
   public final bvj bF = new bvj();
   public final bvj bG = new bvj();
   public final bvj bI = new bvj();
   public final bvj bJ = new bvj();

   public static bxw.a q() {
      return cig.gv().a(bxx.v, 0.1F).a(bxx.s, 14.0);
   }

   public cla(bwb<? extends cig> $$0, dhp $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(evk.j, -1.0F);
      this.a(evk.g, -1.0F);
      this.a(evk.y, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bR, cla.a.a);
      $$0.a(bS, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bY() || this.bj()) {
         this.a(evk.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(evk.j, -1.0F);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.gD() == cla.a.f ? bQ.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gD() == cla.a.e;
   }

   public boolean x() {
      return this.br.c(cft.S).orElse(false);
   }

   public boolean gq() {
      return !this.x() && !this.gn() && !this.bj() && !this.gA() && this.aJ() && !this.bZ() && !this.O_();
   }

   public boolean gr() {
      return this.gD() == cla.a.f || this.gD() == cla.a.e;
   }

   private jj gu() {
      fcu $$0 = this.gC();
      return jj.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private fcu gC() {
      return this.dt().e(this.bV().c(2.25));
   }

   private cla.a gD() {
      return this.al.a(bR);
   }

   private cla b(cla.a $$0) {
      this.al.a(bR, $$0);
      return this;
   }

   @Override
   public void a(akg<?> $$0) {
      if (bR.equals($$0)) {
         cla.a $$1 = this.gD();
         this.gE();
         switch ($$1) {
            case b:
               this.bE.b(this.af);
               break;
            case c:
               this.bF.b(this.af);
               break;
            case d:
               this.bG.b(this.af);
            case e:
            default:
               break;
            case f:
               this.bI.b(this.af);
               break;
            case g:
               this.bJ.b(this.af);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gE() {
      this.bI.a();
      this.bG.a();
      this.bJ.a();
      this.bE.a();
      this.bF.a();
   }

   public cla a(cla.a $$0) {
      switch ($$0) {
         case a:
            this.b(cla.a.a);
            break;
         case b:
            this.a(awk.zu, 1.0F, 1.0F);
            this.b(cla.a.b);
            break;
         case c:
            this.b(cla.a.c).gF();
            break;
         case d:
            this.a(awk.zq, 1.0F, 1.0F);
            this.b(cla.a.d);
            break;
         case e:
            this.b(cla.a.e);
            break;
         case f:
            this.b(cla.a.f).gG();
            break;
         case g:
            this.a(awk.zt, 1.0F, 1.0F);
            this.b(cla.a.g);
      }

      return this;
   }

   private cla gF() {
      this.a(awk.zp, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private cla gG() {
      this.al.a(bS, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cla w(boolean $$0) {
      if ($$0) {
         this.j(this.aR());
      }

      return this;
   }

   Optional<jj> gs() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> chn.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jj::a)
         .filter($$0 -> this.dV().A_().a($$0))
         .map(jj::e)
         .filter(this::i)
         .findFirst();
   }

   boolean gt() {
      return !this.gn() && !this.x() && !this.n_() && !this.bj() && this.aJ() && !this.bZ() && this.i(this.gu().e());
   }

   private boolean i(jj $$0) {
      return this.dV().a_($$0).a(awz.cw)
         && this.gI().noneMatch($$1 -> jr.a(this.dV().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(evh::j).orElse(false);
   }

   private void gH() {
      if (this.dV() instanceof arn $$0 && this.al.a(bS) == this.af) {
         jj $$2 = this.gu();
         this.a($$0, exh.aG, ($$1x, $$2x) -> {
            cmn $$3 = new cmn(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awk.zo, 1.0F, 1.0F);
         return;
      }
   }

   private cla a(bvj $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         jj $$2 = this.gu();
         dym $$3 = this.dV().a_($$2.e());
         if ($$3.o() != drf.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fcu $$5 = fcu.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new ln(lv.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(edm.u, this.gu(), edm.a.a(this));
      }

      return this;
   }

   private cla j(jj $$0) {
      List<jr> $$1 = this.gI().limit(20L).collect(Collectors.toList());
      $$1.add(0, jr.a(this.dV().aj(), $$0));
      this.eb().a(cft.aR, $$1);
      return this;
   }

   private Stream<jr> gI() {
      return this.eb().c(cft.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.by.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fcu(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arn $$0, cig $$1) {
      cxy $$2 = new cxy(cyc.kP);
      cmn $$3 = new cmn($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awk.zv, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(buh $$0) {
      this.a(cla.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gD()) {
         case e:
            this.gJ();
            break;
         case f:
            this.a(this.bI).gH();
      }

      super.h();
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      boolean $$3 = this.k($$2);
      btq $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gw();
      }

      return $$4;
   }

   @Override
   protected void gw() {
      this.dV().a(null, this, awk.zk, awl.g, 1.0F, azk.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gJ() {
      if (this.dV().w_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awk.zr, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.zj, 0.15F, 1.0F);
   }

   @Override
   protected awj u() {
      return Set.of(cla.a.f, cla.a.e).contains(this.gD()) ? null : awk.zl;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.zm;
   }

   @Override
   protected awj l_() {
      return awk.zn;
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
   public bvi a(arn $$0, bvi $$1) {
      return bwb.bi.a($$0, bwa.e);
   }

   @Override
   public boolean a(cig $$0) {
      if (!($$0 instanceof cla $$1)) {
         return false;
      } else {
         Set<cla.a> $$2 = Set.of(cla.a.a, cla.a.c, cla.a.b);
         return $$2.contains(this.gD()) && $$2.contains($$1.gD()) && super.a($$0);
      }
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.aa);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return clb.a(this.ec().a($$0));
   }

   @Override
   public bxr<cla> eb() {
      return (bxr<cla>)super.eb();
   }

   @Override
   protected bxr.b<cla> ec() {
      return bxr.a(clb.b, clb.a);
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      clb.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cla.a> h = aya.a(cla.a::a, values(), aya.a.a);
      public static final yt<ByteBuf, cla.a> i = yr.a(h, cla.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
