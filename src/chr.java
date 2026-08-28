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

public class chr extends cfa {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bss ck = bss.b(bsv.aR.l(), bsv.aR.m() - 0.4F).b(0.81F);
   private static final akg<chr.a> cl = akk.a(chr.class, aki.C);
   private static final akg<Integer> cm = akk.a(chr.class, aki.b);
   public final bsk bY = new bsk();
   public final bsk bZ = new bsk();
   public final bsk cb = new bsk();
   public final bsk cc = new bsk();
   public final bsk cd = new bsk();

   public static bur.a s() {
      return btm.A().a(bus.r, 0.1F).a(bus.q, 14.0);
   }

   public chr(bsv<? extends cfa> $$0, dbt $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eoh.j, -1.0F);
      this.a(eoh.g, -1.0F);
      this.a(eoh.y, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cl, chr.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eoh.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eoh.j, -1.0F);
   }

   @Override
   public bss e(btw $$0) {
      return this.gB() == chr.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gB() == chr.a.e;
   }

   public boolean y() {
      return this.bD.c(cco.R).orElse(false);
   }

   public boolean gq() {
      return !this.y() && !this.gn() && !this.be() && !this.gu() && this.aE() && !this.bR() && !this.gd();
   }

   public boolean gw() {
      return this.gB() == chr.a.f || this.gB() == chr.a.e;
   }

   private iz gz() {
      evm $$0 = this.gA();
      return iz.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evm gA() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chr.a gB() {
      return this.ao.a(cl);
   }

   private chr b(chr.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akg<?> $$0) {
      if (cl.equals($$0)) {
         chr.a $$1 = this.gB();
         this.gC();
         switch ($$1) {
            case b:
               this.bY.b(this.ai);
               break;
            case c:
               this.bZ.b(this.ai);
               break;
            case d:
               this.cb.b(this.ai);
            case e:
            default:
               break;
            case f:
               this.cc.b(this.ai);
               break;
            case g:
               this.cd.b(this.ai);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gC() {
      this.cc.a();
      this.cb.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public chr a(chr.a $$0) {
      switch ($$0) {
         case a:
            this.b(chr.a.a);
            break;
         case b:
            this.a(avw.yt, 1.0F, 1.0F);
            this.b(chr.a.b);
            break;
         case c:
            this.b(chr.a.c).gD();
            break;
         case d:
            this.a(avw.yp, 1.0F, 1.0F);
            this.b(chr.a.d);
            break;
         case e:
            this.b(chr.a.e);
            break;
         case f:
            this.b(chr.a.f).gE();
            break;
         case g:
            this.a(avw.ys, 1.0F, 1.0F);
            this.b(chr.a.g);
      }

      return this;
   }

   private chr gD() {
      this.a(avw.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chr gE() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chr w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<iz> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cei.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iz::a)
         .filter($$0 -> this.dP().C_().a($$0))
         .map(iz::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gy() {
      return !this.gn() && !this.y() && !this.p_() && !this.be() && this.aE() && !this.bR() && this.i(this.gz().d());
   }

   private boolean i(iz $$0) {
      return this.dP().a_($$0).a(awl.cr)
         && this.gG().noneMatch($$1 -> jh.a(this.dP().af(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eoe::j).orElse(false);
   }

   private void gF() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         arb $$0 = (arb)this.dP();
         eqi $$1 = $$0.o().be().b(epz.aU);
         eqg $$2 = new eqg.a($$0).a(esz.f, this.gA()).a(esz.a, this).a(esy.j);
         List<cuk> $$3 = $$1.a($$2);
         iz $$4 = this.gz();

         for (cuk $$5 : $$3) {
            cjc $$6 = new cjc($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avw.yn, 1.0F, 1.0F);
      }
   }

   private chr a(bsk $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         iz $$2 = this.gz();
         drx $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dla.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evm $$5 = evm.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new la(lj.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dwq.u, this.gz(), dwq.a.a(this));
      }

      return this;
   }

   private chr j(iz $$0) {
      List<jh> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jh.a(this.dP().af(), $$0));
      this.dS().a(cco.aQ, $$1);
      return this;
   }

   private Stream<jh> gG() {
      return this.dS().c(cco.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evm(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arb $$0, cfa $$1) {
      cuk $$2 = new cuk(cun.kq);
      cjc $$3 = new cjc($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avw.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bri $$0) {
      this.a(chr.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gB()) {
         case e:
            this.gH();
            break;
         case f:
            this.a(this.cc).gF();
      }

      super.l();
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqp $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), avx.g, 1.0F, ayu.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gH() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), avw.yq, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.yi, 0.15F, 1.0F);
   }

   @Override
   public avv d(cuk $$0) {
      return avw.yj;
   }

   @Override
   protected avv v() {
      return Set.of(chr.a.f, chr.a.e).contains(this.gB()) ? null : avw.yk;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.yl;
   }

   @Override
   protected avv o_() {
      return avw.ym;
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
   public bsj a(arb $$0, bsj $$1) {
      return bsv.aR.a((dbt)$$0);
   }

   @Override
   public boolean a(cfa $$0) {
      if (!($$0 instanceof chr $$1)) {
         return false;
      } else {
         Set<chr.a> $$2 = Set.of(chr.a.a, chr.a.c, chr.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public evh h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.X);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return chs.a(this.dT().a($$0));
   }

   @Override
   public bum<chr> dS() {
      return (bum<chr>)super.dS();
   }

   @Override
   protected bum.b<chr> dT() {
      return bum.a(chs.b, chs.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chs.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<chr.a> h = axl.a(chr.a::a, values(), axl.a.a);
      public static final zj<ByteBuf, chr.a> i = zh.a(h, chr.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
