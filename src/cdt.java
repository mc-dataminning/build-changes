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

public class cdt extends cbe {
   private static final int cd = 1700;
   private static final int ce = 6000;
   private static final int cf = 30;
   private static final int cg = 120;
   private static final int ch = 48000;
   private static final float ci = 0.4F;
   private static final bpa cj = bpa.b(bpd.aR.k(), bpd.aR.l() - 0.4F).b(0.81F);
   private static final aim<cdt.a> ck = aiq.a(cdt.class, aio.A);
   private static final aim<Integer> cl = aiq.a(cdt.class, aio.b);
   public final bot bX = new bot();
   public final bot bY = new bot();
   public final bot ca = new bot();
   public final bot cb = new bot();
   public final bot cc = new bot();

   public static bqv.a r() {
      return bpr.A().a(bqw.r, 0.1F).a(bqw.q, 14.0);
   }

   public cdt(bpd<? extends cbe> $$0, cxb $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(ejg.j, -1.0F);
      this.a(ejg.g, -1.0F);
      this.a(ejg.y, -1.0F);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ck, cdt.a.a);
      $$0.a(cl, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bN() || this.bc()) {
         this.a(ejg.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(ejg.j, -1.0F);
   }

   @Override
   public bpa e(bqa $$0) {
      return this.gy() == cdt.a.f ? cj.a(this.ea()) : super.e($$0);
   }

   public boolean s() {
      return this.gy() == cdt.a.e;
   }

   public boolean y() {
      return this.bC.c(bys.R).orElse(false);
   }

   public boolean gn() {
      return !this.y() && !this.gk() && !this.bc() && !this.gr() && this.aC() && !this.bO() && !this.gb();
   }

   public boolean gt() {
      return this.gy() == cdt.a.f || this.gy() == cdt.a.e;
   }

   private ib gw() {
      ept $$0 = this.gx();
      return ib.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private ept gx() {
      return this.dk().e(this.bK().a(2.25));
   }

   private cdt.a gy() {
      return this.an.a(ck);
   }

   private cdt b(cdt.a $$0) {
      this.an.a(ck, $$0);
      return this;
   }

   @Override
   public void a(aim<?> $$0) {
      if (ck.equals($$0)) {
         cdt.a $$1 = this.gy();
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

   public cdt a(cdt.a $$0) {
      switch ($$0) {
         case c:
            this.b(cdt.a.c).gA();
            break;
         case d:
            this.a(aty.xT, 1.0F, 1.0F);
            this.b(cdt.a.d);
            break;
         case f:
            this.b(cdt.a.f).gB();
            break;
         case g:
            this.a(aty.xW, 1.0F, 1.0F);
            this.b(cdt.a.g);
            break;
         case b:
            this.a(aty.xX, 1.0F, 1.0F);
            this.b(cdt.a.b);
            break;
         case a:
            this.b(cdt.a.a);
            break;
         case e:
            this.b(cdt.a.e);
      }

      return this;
   }

   private cdt gA() {
      this.a(aty.xS, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cdt gB() {
      this.an.a(cl, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public cdt w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<ib> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cam.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ib::a)
         .filter($$0 -> this.dM().C_().a($$0))
         .map(ib::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gv() {
      return !this.gk() && !this.y() && !this.o_() && !this.bc() && this.aC() && !this.bO() && this.i(this.gw().d());
   }

   private boolean i(ib $$0) {
      return this.dM().a_($$0).a(aun.cl)
         && this.gD().noneMatch($$1 -> ik.a(this.dM().ad(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(ejd::j).orElse(false);
   }

   private void gC() {
      if (!this.dM().x_() && this.an.a(cl) == this.ah) {
         apf $$0 = (apf)this.dM();
         ele $$1 = $$0.o().aM().getLootTable(eku.aK);
         elc $$2 = new elc.a($$0).a(enh.f, this.gx()).a(enh.a, this).a(eng.i);
         List<cqm> $$3 = $$1.a($$2);
         ib $$4 = this.gw();

         for (cqm $$5 : $$3) {
            cfe $$6 = new cfe($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.s();
            $$0.b($$6);
         }

         this.a(aty.xR, 1.0F, 1.0F);
      }
   }

   private cdt a(bot $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ib $$2 = this.gw();
         dnb $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dgh.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ept $$5 = ept.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new ju(kc.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(drp.u, this.gw(), drp.a.a(this));
      }

      return this;
   }

   private cdt j(ib $$0) {
      List<ik> $$1 = this.gD().limit(20L).collect(Collectors.toList());
      $$1.add(0, ik.a(this.dM().ad(), $$0));
      this.dP().a(bys.aQ, $$1);
      return this;
   }

   private Stream<ik> gD() {
      return this.dP().c(bys.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bO.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ept(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(apf $$0, cbe $$1) {
      cqm $$2 = new cqm(cqp.kp);
      cfe $$3 = new cfe($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.s();
      this.a($$0, $$1, null);
      this.a(aty.xY, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bnw $$0) {
      this.a(cdt.a.a);
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
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bnd $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), atz.g, 1.0F, aww.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gE() {
      if (this.dM().x_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), aty.xU, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.xM, 0.15F, 1.0F);
   }

   @Override
   public atx d(cqm $$0) {
      return aty.xN;
   }

   @Override
   protected atx v() {
      return Set.of(cdt.a.f, cdt.a.e).contains(this.gy()) ? null : aty.xO;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.xP;
   }

   @Override
   protected atx n_() {
      return aty.xQ;
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
   public bos a(apf $$0, bos $$1) {
      return bpd.aR.a((cxb)$$0);
   }

   @Override
   public boolean a(cbe $$0) {
      if (!($$0 instanceof cdt $$1)) {
         return false;
      } else {
         Set<cdt.a> $$2 = Set.of(cdt.a.a, cdt.a.c, cdt.a.b);
         return $$2.contains(this.gy()) && $$2.contains($$1.gy()) && super.a($$0);
      }
   }

   @Override
   public epo h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cqm $$0) {
      return $$0.a(auv.aP);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return cdu.a(this.dQ().a($$0));
   }

   @Override
   public bqq<cdt> dP() {
      return (bqq<cdt>)super.dP();
   }

   @Override
   protected bqq.b<cdt> dQ() {
      return bqq.a(cdu.b, cdu.a);
   }

   @Override
   protected void Y() {
      this.dM().ae().a("snifferBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().b("snifferActivityUpdate");
      cdu.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cdt.a> h = avn.a(cdt.a::a, values(), avn.a.a);
      public static final xs<ByteBuf, cdt.a> i = xq.a(h, cdt.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
