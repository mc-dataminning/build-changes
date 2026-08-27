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

public class ces extends ccd {
   private static final int cd = 1700;
   private static final int ce = 6000;
   private static final int cf = 30;
   private static final int cg = 120;
   private static final int ch = 48000;
   private static final float ci = 0.4F;
   private static final bpy cj = bpy.b(bqb.aQ.k(), bqb.aQ.l() - 0.4F).b(0.81F);
   private static final aiy<ces.a> ck = ajc.a(ces.class, aja.A);
   private static final aiy<Integer> cl = ajc.a(ces.class, aja.b);
   public final bpq bX = new bpq();
   public final bpq bY = new bpq();
   public final bpq ca = new bpq();
   public final bpq cb = new bpq();
   public final bpq cc = new bpq();

   public static bru.a r() {
      return bqq.A().a(brv.r, 0.1F).a(brv.q, 14.0);
   }

   public ces(bqb<? extends ccd> $$0, cyx $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(elj.j, -1.0F);
      this.a(elj.g, -1.0F);
      this.a(elj.y, -1.0F);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ck, ces.a.a);
      $$0.a(cl, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bN() || this.bc()) {
         this.a(elj.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(elj.j, -1.0F);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.gy() == ces.a.f ? cj.a(this.ea()) : super.e($$0);
   }

   public boolean u() {
      return this.gy() == ces.a.e;
   }

   public boolean y() {
      return this.bC.c(bzr.R).orElse(false);
   }

   public boolean gn() {
      return !this.y() && !this.gk() && !this.bc() && !this.gr() && this.aC() && !this.bO() && !this.gb();
   }

   public boolean gt() {
      return this.gy() == ces.a.f || this.gy() == ces.a.e;
   }

   private ib gw() {
      esa $$0 = this.gx();
      return ib.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private esa gx() {
      return this.dk().e(this.bK().a(2.25));
   }

   private ces.a gy() {
      return this.an.a(ck);
   }

   private ces b(ces.a $$0) {
      this.an.a(ck, $$0);
      return this;
   }

   @Override
   public void a(aiy<?> $$0) {
      if (ck.equals($$0)) {
         ces.a $$1 = this.gy();
         this.gz();
         switch ($$1) {
            case c:
               this.bY.b(this.ah);
               break;
            case d:
               this.ca.b(this.ah);
               break;
            case f:
               this.cb.b(this.ah);
               break;
            case g:
               this.cc.b(this.ah);
               break;
            case b:
               this.bX.b(this.ah);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gz() {
      this.cb.a();
      this.ca.a();
      this.cc.a();
      this.bX.a();
      this.bY.a();
   }

   public ces a(ces.a $$0) {
      switch ($$0) {
         case c:
            this.b(ces.a.c).gA();
            break;
         case d:
            this.a(aum.xW, 1.0F, 1.0F);
            this.b(ces.a.d);
            break;
         case f:
            this.b(ces.a.f).gB();
            break;
         case g:
            this.a(aum.xZ, 1.0F, 1.0F);
            this.b(ces.a.g);
            break;
         case b:
            this.a(aum.ya, 1.0F, 1.0F);
            this.b(ces.a.b);
            break;
         case a:
            this.b(ces.a.a);
            break;
         case e:
            this.b(ces.a.e);
      }

      return this;
   }

   private ces gA() {
      this.a(aum.xV, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private ces gB() {
      this.an.a(cl, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public ces w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<ib> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cbl.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ib::a)
         .filter($$0 -> this.dM().C_().a($$0))
         .map(ib::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gv() {
      return !this.gk() && !this.y() && !this.p_() && !this.bc() && this.aC() && !this.bO() && this.i(this.gw().d());
   }

   private boolean i(ib $$0) {
      return this.dM().a_($$0).a(avc.cl)
         && this.gD().noneMatch($$1 -> ik.a(this.dM().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(elg::j).orElse(false);
   }

   private void gC() {
      if (!this.dM().x_() && this.an.a(cl) == this.ah) {
         aps $$0 = (aps)this.dM();
         enj $$1 = $$0.o().aM().getLootTable(emz.aK);
         enh $$2 = new enh.a($$0).a(epo.f, this.gx()).a(epo.a, this).a(epn.i);
         List<crj> $$3 = $$1.a($$2);
         ib $$4 = this.gw();

         for (crj $$5 : $$3) {
            cgd $$6 = new cgd($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(aum.xU, 1.0F, 1.0F);
      }
   }

   private ces a(bpq $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ib $$2 = this.gw();
         doz $$3 = this.dM().a_($$2.d());
         if ($$3.l() != did.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               esa $$5 = esa.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new kd(kl.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(dts.u, this.gw(), dts.a.a(this));
      }

      return this;
   }

   private ces j(ib $$0) {
      List<ik> $$1 = this.gD().limit(20L).collect(Collectors.toList());
      $$1.add(0, ik.a(this.dM().ae(), $$0));
      this.dP().a(bzr.aQ, $$1);
      return this;
   }

   private Stream<ik> gD() {
      return this.dP().c(bzr.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bO.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new esa(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aps $$0, ccd $$1) {
      crj $$2 = new crj(crm.kp);
      cgd $$3 = new cgd($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(aum.yb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bot $$0) {
      this.a(ces.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gy()) {
         case f:
            this.a(this.cb).gC();
            break;
         case e:
            this.gE();
      }

      super.l();
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      boa $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), aun.g, 1.0F, axk.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gE() {
      if (this.dM().x_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), aum.xX, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.xP, 0.15F, 1.0F);
   }

   @Override
   public aul d(crj $$0) {
      return aum.xQ;
   }

   @Override
   protected aul v() {
      return Set.of(ces.a.f, ces.a.e).contains(this.gy()) ? null : aum.xR;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.xS;
   }

   @Override
   protected aul o_() {
      return aum.xT;
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
   public bpp a(aps $$0, bpp $$1) {
      return bqb.aQ.a((cyx)$$0);
   }

   @Override
   public boolean a(ccd $$0) {
      if (!($$0 instanceof ces $$1)) {
         return false;
      } else {
         Set<ces.a> $$2 = Set.of(ces.a.a, ces.a.c, ces.a.b);
         return $$2.contains(this.gy()) && $$2.contains($$1.gy()) && super.a($$0);
      }
   }

   @Override
   public erv h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(crj $$0) {
      return $$0.a(avk.aP);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cet.a(this.dQ().a($$0));
   }

   @Override
   public brp<ces> dP() {
      return (brp<ces>)super.dP();
   }

   @Override
   protected brp.b<ces> dQ() {
      return brp.a(cet.b, cet.a);
   }

   @Override
   protected void Y() {
      this.dM().af().a("snifferBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().b("snifferActivityUpdate");
      cet.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<ces.a> h = awb.a(ces.a::a, values(), awb.a.a);
      public static final ye<ByteBuf, ces.a> i = yc.a(h, ces.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
