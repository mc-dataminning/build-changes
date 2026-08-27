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

public class cfk extends cct {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bqo ck = bqo.b(bqr.aQ.k(), bqr.aQ.l() - 0.4F).b(0.81F);
   private static final ajk<cfk.a> cl = ajo.a(cfk.class, ajm.C);
   private static final ajk<Integer> cm = ajo.a(cfk.class, ajm.b);
   public final bqg bY = new bqg();
   public final bqg bZ = new bqg();
   public final bqg cb = new bqg();
   public final bqg cc = new bqg();
   public final bqg cd = new bqg();

   public static bsk.a r() {
      return brg.A().a(bsl.r, 0.1F).a(bsl.q, 14.0);
   }

   public cfk(bqr<? extends cct> $$0, czu $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(emi.j, -1.0F);
      this.a(emi.g, -1.0F);
      this.a(emi.y, -1.0F);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cl, cfk.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bO() || this.bc()) {
         this.a(emi.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(emi.j, -1.0F);
   }

   @Override
   public bqo e(brp $$0) {
      return this.gA() == cfk.a.f ? ck.a(this.eb()) : super.e($$0);
   }

   public boolean u() {
      return this.gA() == cfk.a.e;
   }

   public boolean y() {
      return this.bE.c(cah.R).orElse(false);
   }

   public boolean gp() {
      return !this.y() && !this.gm() && !this.bc() && !this.gt() && this.aC() && !this.bP() && !this.gc();
   }

   public boolean gv() {
      return this.gA() == cfk.a.f || this.gA() == cfk.a.e;
   }

   private im gy() {
      etf $$0 = this.gz();
      return im.a($$0.a(), this.du() + 0.2F, $$0.c());
   }

   private etf gz() {
      return this.dl().e(this.bL().a(2.25));
   }

   private cfk.a gA() {
      return this.ao.a(cl);
   }

   private cfk b(cfk.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajk<?> $$0) {
      if (cl.equals($$0)) {
         cfk.a $$1 = this.gA();
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

   public cfk a(cfk.a $$0) {
      switch ($$0) {
         case c:
            this.b(cfk.a.c).gC();
            break;
         case d:
            this.a(auz.yd, 1.0F, 1.0F);
            this.b(cfk.a.d);
            break;
         case f:
            this.b(cfk.a.f).gD();
            break;
         case g:
            this.a(auz.yg, 1.0F, 1.0F);
            this.b(cfk.a.g);
            break;
         case b:
            this.a(auz.yh, 1.0F, 1.0F);
            this.b(cfk.a.b);
            break;
         case a:
            this.b(cfk.a.a);
            break;
         case e:
            this.b(cfk.a.e);
      }

      return this;
   }

   private cfk gC() {
      this.a(auz.yc, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cfk gD() {
      this.ao.a(cm, this.ai + 120);
      this.dN().a(this, (byte)63);
      return this;
   }

   public cfk w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<im> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> ccb.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(im::a)
         .filter($$0 -> this.dN().C_().a($$0))
         .map(im::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gx() {
      return !this.gm() && !this.y() && !this.p_() && !this.bc() && this.aC() && !this.bP() && this.i(this.gy().d());
   }

   private boolean i(im $$0) {
      return this.dN().a_($$0).a(avo.cl)
         && this.gF().noneMatch($$1 -> iu.a(this.dN().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(emf::j).orElse(false);
   }

   private void gE() {
      if (!this.dN().x_() && this.ao.a(cm) == this.ai) {
         aqe $$0 = (aqe)this.dN();
         eoi $$1 = $$0.o().aM().getLootTable(eny.aN);
         eog $$2 = new eog.a($$0).a(eqt.f, this.gz()).a(eqt.a, this).a(eqs.i);
         List<csd> $$3 = $$1.a($$2);
         im $$4 = this.gy();

         for (csd $$5 : $$3) {
            cgv $$6 = new cgv($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(auz.yb, 1.0F, 1.0F);
      }
   }

   private cfk a(bqg $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         im $$2 = this.gy();
         dpy $$3 = this.dN().a_($$2.d());
         if ($$3.l() != djb.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               etf $$5 = etf.b($$2).b(0.0, -0.65F, 0.0);
               this.dN().a(new kn(kw.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dN().a(this.ds(), this.du(), this.dy(), $$3.w().f(), this.dc(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dN().a(dur.u, this.gy(), dur.a.a(this));
      }

      return this;
   }

   private cfk j(im $$0) {
      List<iu> $$1 = this.gF().limit(20L).collect(Collectors.toList());
      $$1.add(0, iu.a(this.dN().ae(), $$0));
      this.dQ().a(cah.aQ, $$1);
      return this;
   }

   private Stream<iu> gF() {
      return this.dQ().c(cah.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fh() {
      super.fh();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new etf(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqe $$0, cct $$1) {
      csd $$2 = new csd(csg.kq);
      cgv $$3 = new cgv($$0, this.dl().a(), this.dl().b(), this.dl().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(auz.yi, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bpj $$0) {
      this.a(cfk.a.a);
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
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      boq $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dN().a(null, this, this.d($$2), ava.g, 1.0F, axw.b(this.dN().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gG() {
      if (this.dN().x_() && this.ai % 20 == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), auz.ye, this.dc(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.xW, 0.15F, 1.0F);
   }

   @Override
   public auy d(csd $$0) {
      return auz.xX;
   }

   @Override
   protected auy v() {
      return Set.of(cfk.a.f, cfk.a.e).contains(this.gA()) ? null : auz.xY;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.xZ;
   }

   @Override
   protected auy o_() {
      return auz.ya;
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
   public bqf a(aqe $$0, bqf $$1) {
      return bqr.aQ.a((czu)$$0);
   }

   @Override
   public boolean a(cct $$0) {
      if (!($$0 instanceof cfk $$1)) {
         return false;
      } else {
         Set<cfk.a> $$2 = Set.of(cfk.a.a, cfk.a.c, cfk.a.b);
         return $$2.contains(this.gA()) && $$2.contains($$1.gA()) && super.a($$0);
      }
   }

   @Override
   public eta h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(csd $$0) {
      return $$0.a(avw.aP);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cfl.a(this.dR().a($$0));
   }

   @Override
   public bsf<cfk> dQ() {
      return (bsf<cfk>)super.dQ();
   }

   @Override
   protected bsf.b<cfk> dR() {
      return bsf.a(cfl.b, cfl.a);
   }

   @Override
   protected void Y() {
      this.dN().af().a("snifferBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().b("snifferActivityUpdate");
      cfl.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cfk.a> h = awn.a(cfk.a::a, values(), awn.a.a);
      public static final yq<ByteBuf, cfk.a> i = yo.a(h, cfk.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
