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

public class cgg extends cdp {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final brk ck = brk.b(brn.aQ.k(), brn.aQ.l() - 0.4F).b(0.81F);
   private static final ajm<cgg.a> cl = ajq.a(cgg.class, ajo.C);
   private static final ajm<Integer> cm = ajq.a(cgg.class, ajo.b);
   public final brc bY = new brc();
   public final brc bZ = new brc();
   public final brc cb = new brc();
   public final brc cc = new brc();
   public final brc cd = new brc();

   public static btg.a r() {
      return bsc.A().a(bth.r, 0.1F).a(bth.q, 14.0);
   }

   public cgg(brn<? extends cdp> $$0, dad $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(emr.j, -1.0F);
      this.a(emr.g, -1.0F);
      this.a(emr.y, -1.0F);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cl, cgg.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bO() || this.bc()) {
         this.a(emr.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(emr.j, -1.0F);
   }

   @Override
   public brk e(bsl $$0) {
      return this.gA() == cgg.a.f ? ck.a(this.eb()) : super.e($$0);
   }

   public boolean u() {
      return this.gA() == cgg.a.e;
   }

   public boolean y() {
      return this.bE.c(cbd.R).orElse(false);
   }

   public boolean gp() {
      return !this.y() && !this.gm() && !this.bc() && !this.gt() && this.aC() && !this.bP() && !this.gc();
   }

   public boolean gv() {
      return this.gA() == cgg.a.f || this.gA() == cgg.a.e;
   }

   private in gy() {
      etp $$0 = this.gz();
      return in.a($$0.a(), this.du() + 0.2F, $$0.c());
   }

   private etp gz() {
      return this.dl().e(this.bL().a(2.25));
   }

   private cgg.a gA() {
      return this.ao.a(cl);
   }

   private cgg b(cgg.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajm<?> $$0) {
      if (cl.equals($$0)) {
         cgg.a $$1 = this.gA();
         this.gB();
         switch ($$1) {
            case c:
               this.bZ.b(this.ai);
               break;
            case d:
               this.cb.b(this.ai);
               break;
            case f:
               this.cc.b(this.ai);
               break;
            case g:
               this.cd.b(this.ai);
               break;
            case b:
               this.bY.b(this.ai);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gB() {
      this.cc.a();
      this.cb.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cgg a(cgg.a $$0) {
      switch ($$0) {
         case c:
            this.b(cgg.a.c).gC();
            break;
         case d:
            this.a(avc.ye, 1.0F, 1.0F);
            this.b(cgg.a.d);
            break;
         case f:
            this.b(cgg.a.f).gD();
            break;
         case g:
            this.a(avc.yh, 1.0F, 1.0F);
            this.b(cgg.a.g);
            break;
         case b:
            this.a(avc.yi, 1.0F, 1.0F);
            this.b(cgg.a.b);
            break;
         case a:
            this.b(cgg.a.a);
            break;
         case e:
            this.b(cgg.a.e);
      }

      return this;
   }

   private cgg gC() {
      this.a(avc.yd, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cgg gD() {
      this.ao.a(cm, this.ai + 120);
      this.dN().a(this, (byte)63);
      return this;
   }

   public cgg w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<in> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> ccx.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(in::a)
         .filter($$0 -> this.dN().C_().a($$0))
         .map(in::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gx() {
      return !this.gm() && !this.y() && !this.p_() && !this.bc() && this.aC() && !this.bP() && this.i(this.gy().d());
   }

   private boolean i(in $$0) {
      return this.dN().a_($$0).a(avr.cr)
         && this.gF().noneMatch($$1 -> iv.a(this.dN().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(emo::j).orElse(false);
   }

   private void gE() {
      if (!this.dN().x_() && this.ao.a(cm) == this.ai) {
         aqh $$0 = (aqh)this.dN();
         eoq $$1 = $$0.o().be().b(eoj.aN);
         eoo $$2 = new eoo.a($$0).a(erc.f, this.gz()).a(erc.a, this).a(erb.i);
         List<csz> $$3 = $$1.a($$2);
         in $$4 = this.gy();

         for (csz $$5 : $$3) {
            chr $$6 = new chr($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avc.yc, 1.0F, 1.0F);
      }
   }

   private cgg a(brc $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         in $$2 = this.gy();
         dqh $$3 = this.dN().a_($$2.d());
         if ($$3.l() != djk.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               etp $$5 = etp.b($$2).b(0.0, -0.65F, 0.0);
               this.dN().a(new ko(kx.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dN().a(this.ds(), this.du(), this.dy(), $$3.w().f(), this.dc(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dN().a(dva.u, this.gy(), dva.a.a(this));
      }

      return this;
   }

   private cgg j(in $$0) {
      List<iv> $$1 = this.gF().limit(20L).collect(Collectors.toList());
      $$1.add(0, iv.a(this.dN().ae(), $$0));
      this.dQ().a(cbd.aQ, $$1);
      return this;
   }

   private Stream<iv> gF() {
      return this.dQ().c(cbd.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fh() {
      super.fh();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new etp(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqh $$0, cdp $$1) {
      csz $$2 = new csz(ctc.kq);
      chr $$3 = new chr($$0, this.dl().a(), this.dl().b(), this.dl().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avc.yj, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bqf $$0) {
      this.a(cgg.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gA()) {
         case f:
            this.a(this.cc).gE();
            break;
         case e:
            this.gG();
      }

      super.l();
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bpm $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dN().a(null, this, this.d($$2), avd.g, 1.0F, axz.b(this.dN().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gG() {
      if (this.dN().x_() && this.ai % 20 == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), avc.yf, this.dc(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.xX, 0.15F, 1.0F);
   }

   @Override
   public avb d(csz $$0) {
      return avc.xY;
   }

   @Override
   protected avb v() {
      return Set.of(cgg.a.f, cgg.a.e).contains(this.gA()) ? null : avc.xZ;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.ya;
   }

   @Override
   protected avb o_() {
      return avc.yb;
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
   public brb a(aqh $$0, brb $$1) {
      return brn.aQ.a((dad)$$0);
   }

   @Override
   public boolean a(cdp $$0) {
      if (!($$0 instanceof cgg $$1)) {
         return false;
      } else {
         Set<cgg.a> $$2 = Set.of(cgg.a.a, cgg.a.c, cgg.a.b);
         return $$2.contains(this.gA()) && $$2.contains($$1.gA()) && super.a($$0);
      }
   }

   @Override
   public etk h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.X);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cgh.a(this.dR().a($$0));
   }

   @Override
   public btb<cgg> dQ() {
      return (btb<cgg>)super.dQ();
   }

   @Override
   protected btb.b<cgg> dR() {
      return btb.a(cgh.b, cgh.a);
   }

   @Override
   protected void Y() {
      this.dN().af().a("snifferBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().b("snifferActivityUpdate");
      cgh.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cgg.a> h = awq.a(cgg.a::a, values(), awq.a.a);
      public static final ys<ByteBuf, cgg.a> i = yq.a(h, cgg.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
