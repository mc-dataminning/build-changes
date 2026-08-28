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

public class chu extends cfd {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bsv ck = bsv.b(bsy.aR.l(), bsy.aR.m() - 0.4F).b(0.81F);
   private static final akj<chu.a> cl = akn.a(chu.class, akl.C);
   private static final akj<Integer> cm = akn.a(chu.class, akl.b);
   public final bsn bY = new bsn();
   public final bsn bZ = new bsn();
   public final bsn cb = new bsn();
   public final bsn cc = new bsn();
   public final bsn cd = new bsn();

   public static buu.a s() {
      return btp.A().a(buv.r, 0.1F).a(buv.q, 14.0);
   }

   public chu(bsy<? extends cfd> $$0, dbw $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eok.j, -1.0F);
      this.a(eok.g, -1.0F);
      this.a(eok.y, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cl, chu.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eok.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eok.j, -1.0F);
   }

   @Override
   public bsv e(btz $$0) {
      return this.gB() == chu.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gB() == chu.a.e;
   }

   public boolean y() {
      return this.bD.c(ccr.R).orElse(false);
   }

   public boolean gq() {
      return !this.y() && !this.gn() && !this.be() && !this.gu() && this.aE() && !this.bR() && !this.gd();
   }

   public boolean gw() {
      return this.gB() == chu.a.f || this.gB() == chu.a.e;
   }

   private iz gz() {
      evp $$0 = this.gA();
      return iz.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evp gA() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chu.a gB() {
      return this.ao.a(cl);
   }

   private chu b(chu.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akj<?> $$0) {
      if (cl.equals($$0)) {
         chu.a $$1 = this.gB();
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

   public chu a(chu.a $$0) {
      switch ($$0) {
         case a:
            this.b(chu.a.a);
            break;
         case b:
            this.a(avz.yt, 1.0F, 1.0F);
            this.b(chu.a.b);
            break;
         case c:
            this.b(chu.a.c).gD();
            break;
         case d:
            this.a(avz.yp, 1.0F, 1.0F);
            this.b(chu.a.d);
            break;
         case e:
            this.b(chu.a.e);
            break;
         case f:
            this.b(chu.a.f).gE();
            break;
         case g:
            this.a(avz.ys, 1.0F, 1.0F);
            this.b(chu.a.g);
      }

      return this;
   }

   private chu gD() {
      this.a(avz.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chu gE() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chu w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<iz> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cel.a(this, 10 + 2 * $$0, 3))
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
      return this.dP().a_($$0).a(awo.cr)
         && this.gG().noneMatch($$1 -> jh.a(this.dP().af(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eoh::j).orElse(false);
   }

   private void gF() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         are $$0 = (are)this.dP();
         eql $$1 = $$0.o().be().b(eqc.aU);
         eqj $$2 = new eqj.a($$0).a(etc.f, this.gA()).a(etc.a, this).a(etb.j);
         List<cun> $$3 = $$1.a($$2);
         iz $$4 = this.gz();

         for (cun $$5 : $$3) {
            cjf $$6 = new cjf($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avz.yn, 1.0F, 1.0F);
      }
   }

   private chu a(bsn $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         iz $$2 = this.gz();
         dsa $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dld.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evp $$5 = evp.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new la(li.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dwt.u, this.gz(), dwt.a.a(this));
      }

      return this;
   }

   private chu j(iz $$0) {
      List<jh> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jh.a(this.dP().af(), $$0));
      this.dS().a(ccr.aQ, $$1);
      return this;
   }

   private Stream<jh> gG() {
      return this.dS().c(ccr.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evp(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(are $$0, cfd $$1) {
      cun $$2 = new cun(cuq.kq);
      cjf $$3 = new cjf($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avz.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(brl $$0) {
      this.a(chu.a.a);
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
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqs $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), awa.g, 1.0F, ayx.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gH() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), avz.yq, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.yi, 0.15F, 1.0F);
   }

   @Override
   public avy d(cun $$0) {
      return avz.yj;
   }

   @Override
   protected avy v() {
      return Set.of(chu.a.f, chu.a.e).contains(this.gB()) ? null : avz.yk;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.yl;
   }

   @Override
   protected avy o_() {
      return avz.ym;
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
   public bsm a(are $$0, bsm $$1) {
      return bsy.aR.a((dbw)$$0);
   }

   @Override
   public boolean a(cfd $$0) {
      if (!($$0 instanceof chu $$1)) {
         return false;
      } else {
         Set<chu.a> $$2 = Set.of(chu.a.a, chu.a.c, chu.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public evk h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.X);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return chv.a(this.dT().a($$0));
   }

   @Override
   public bup<chu> dS() {
      return (bup<chu>)super.dS();
   }

   @Override
   protected bup.b<chu> dT() {
      return bup.a(chv.b, chv.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chv.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<chu.a> h = axo.a(chu.a::a, values(), axo.a.a);
      public static final zm<ByteBuf, chu.a> i = zk.a(h, chu.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
