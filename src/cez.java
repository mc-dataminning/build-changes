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

public class cez extends cci {
   private static final int cd = 1700;
   private static final int ce = 6000;
   private static final int cf = 30;
   private static final int cg = 120;
   private static final int ch = 48000;
   private static final float ci = 0.4F;
   private static final bqd cj = bqd.b(bqg.aQ.k(), bqg.aQ.l() - 0.4F).b(0.81F);
   private static final aja<cez.a> ck = aje.a(cez.class, ajc.B);
   private static final aja<Integer> cl = aje.a(cez.class, ajc.b);
   public final bpv bX = new bpv();
   public final bpv bY = new bpv();
   public final bpv ca = new bpv();
   public final bpv cb = new bpv();
   public final bpv cc = new bpv();

   public static brz.a r() {
      return bqv.A().a(bsa.r, 0.1F).a(bsa.q, 14.0);
   }

   public cez(bqg<? extends cci> $$0, czg $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(els.j, -1.0F);
      this.a(els.g, -1.0F);
      this.a(els.y, -1.0F);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ck, cez.a.a);
      $$0.a(cl, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bN() || this.bc()) {
         this.a(els.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(els.j, -1.0F);
   }

   @Override
   public bqd e(bre $$0) {
      return this.gy() == cez.a.f ? cj.a(this.ea()) : super.e($$0);
   }

   public boolean u() {
      return this.gy() == cez.a.e;
   }

   public boolean y() {
      return this.bC.c(bzw.R).orElse(false);
   }

   public boolean gn() {
      return !this.y() && !this.gk() && !this.bc() && !this.gr() && this.aC() && !this.bO() && !this.gb();
   }

   public boolean gt() {
      return this.gy() == cez.a.f || this.gy() == cez.a.e;
   }

   private id gw() {
      esj $$0 = this.gx();
      return id.a($$0.a(), this.dt() + 0.2F, $$0.c());
   }

   private esj gx() {
      return this.dk().e(this.bK().a(2.25));
   }

   private cez.a gy() {
      return this.an.a(ck);
   }

   private cez b(cez.a $$0) {
      this.an.a(ck, $$0);
      return this;
   }

   @Override
   public void a(aja<?> $$0) {
      if (ck.equals($$0)) {
         cez.a $$1 = this.gy();
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

   public cez a(cez.a $$0) {
      switch ($$0) {
         case c:
            this.b(cez.a.c).gA();
            break;
         case d:
            this.a(auo.xW, 1.0F, 1.0F);
            this.b(cez.a.d);
            break;
         case f:
            this.b(cez.a.f).gB();
            break;
         case g:
            this.a(auo.xZ, 1.0F, 1.0F);
            this.b(cez.a.g);
            break;
         case b:
            this.a(auo.ya, 1.0F, 1.0F);
            this.b(cez.a.b);
            break;
         case a:
            this.b(cez.a.a);
            break;
         case e:
            this.b(cez.a.e);
      }

      return this;
   }

   private cez gA() {
      this.a(auo.xV, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cez gB() {
      this.an.a(cl, this.ah + 120);
      this.dM().a(this, (byte)63);
      return this;
   }

   public cez w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<id> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cbq.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(id::a)
         .filter($$0 -> this.dM().C_().a($$0))
         .map(id::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gv() {
      return !this.gk() && !this.y() && !this.p_() && !this.bc() && this.aC() && !this.bO() && this.i(this.gw().d());
   }

   private boolean i(id $$0) {
      return this.dM().a_($$0).a(ave.cl)
         && this.gD().noneMatch($$1 -> im.a(this.dM().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(elp::j).orElse(false);
   }

   private void gC() {
      if (!this.dM().x_() && this.an.a(cl) == this.ah) {
         apu $$0 = (apu)this.dM();
         ens $$1 = $$0.o().aM().getLootTable(eni.aK);
         enq $$2 = new enq.a($$0).a(epx.f, this.gx()).a(epx.a, this).a(epw.i);
         List<crs> $$3 = $$1.a($$2);
         id $$4 = this.gw();

         for (crs $$5 : $$3) {
            cgk $$6 = new cgk($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(auo.xU, 1.0F, 1.0F);
      }
   }

   private cez a(bpv $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         id $$2 = this.gw();
         dpi $$3 = this.dM().a_($$2.d());
         if ($$3.l() != dim.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               esj $$5 = esj.b($$2).b(0.0, -0.65F, 0.0);
               this.dM().a(new kf(kn.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dM().a(this.dr(), this.dt(), this.dx(), $$3.w().f(), this.db(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dM().a(dub.u, this.gw(), dub.a.a(this));
      }

      return this;
   }

   private cez j(id $$0) {
      List<im> $$1 = this.gD().limit(20L).collect(Collectors.toList());
      $$1.add(0, im.a(this.dM().ae(), $$0));
      this.dP().a(bzw.aQ, $$1);
      return this;
   }

   private Stream<im> gD() {
      return this.dP().c(bzw.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bO.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new esj(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(apu $$0, cci $$1) {
      crs $$2 = new crs(crv.kp);
      cgk $$3 = new cgk($$0, this.dk().a(), this.dk().b(), this.dk().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(auo.yb, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(boy $$0) {
      this.a(cez.a.a);
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
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bof $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dM().a(null, this, this.d($$2), aup.g, 1.0F, axm.b(this.dM().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gE() {
      if (this.dM().x_() && this.ah % 20 == 0) {
         this.dM().a(this.dr(), this.dt(), this.dx(), auo.xX, this.db(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.xP, 0.15F, 1.0F);
   }

   @Override
   public aun d(crs $$0) {
      return auo.xQ;
   }

   @Override
   protected aun v() {
      return Set.of(cez.a.f, cez.a.e).contains(this.gy()) ? null : auo.xR;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.xS;
   }

   @Override
   protected aun o_() {
      return auo.xT;
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
   public bpu a(apu $$0, bpu $$1) {
      return bqg.aQ.a((czg)$$0);
   }

   @Override
   public boolean a(cci $$0) {
      if (!($$0 instanceof cez $$1)) {
         return false;
      } else {
         Set<cez.a> $$2 = Set.of(cez.a.a, cez.a.c, cez.a.b);
         return $$2.contains(this.gy()) && $$2.contains($$1.gy()) && super.a($$0);
      }
   }

   @Override
   public ese h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(crs $$0) {
      return $$0.a(avm.aP);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cfa.a(this.dQ().a($$0));
   }

   @Override
   public bru<cez> dP() {
      return (bru<cez>)super.dP();
   }

   @Override
   protected bru.b<cez> dQ() {
      return bru.a(cfa.b, cfa.a);
   }

   @Override
   protected void Y() {
      this.dM().af().a("snifferBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().b("snifferActivityUpdate");
      cfa.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cez.a> h = awd.a(cez.a::a, values(), awd.a.a);
      public static final yg<ByteBuf, cez.a> i = ye.a(h, cez.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
