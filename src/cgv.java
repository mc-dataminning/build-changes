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

public class cgv extends cee {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final brx ck = brx.b(bsa.aR.l(), bsa.aR.m() - 0.4F).b(0.81F);
   private static final ajr<cgv.a> cl = ajv.a(cgv.class, ajt.C);
   private static final ajr<Integer> cm = ajv.a(cgv.class, ajt.b);
   public final brp bY = new brp();
   public final brp bZ = new brp();
   public final brp cb = new brp();
   public final brp cc = new brp();
   public final brp cd = new brp();

   public static btv.a s() {
      return bsq.A().a(btw.r, 0.1F).a(btw.q, 14.0);
   }

   public cgv(bsa<? extends cee> $$0, dax $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(enl.j, -1.0F);
      this.a(enl.g, -1.0F);
      this.a(enl.y, -1.0F);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cl, cgv.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(enl.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(enl.j, -1.0F);
   }

   @Override
   public brx e(bta $$0) {
      return this.gA() == cgv.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gA() == cgv.a.e;
   }

   public boolean y() {
      return this.bE.c(cbs.R).orElse(false);
   }

   public boolean gp() {
      return !this.y() && !this.gm() && !this.be() && !this.gt() && this.aE() && !this.bR() && !this.gc();
   }

   public boolean gv() {
      return this.gA() == cgv.a.f || this.gA() == cgv.a.e;
   }

   private io gy() {
      euk $$0 = this.gz();
      return io.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private euk gz() {
      return this.dn().e(this.bN().a(2.25));
   }

   private cgv.a gA() {
      return this.ao.a(cl);
   }

   private cgv b(cgv.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajr<?> $$0) {
      if (cl.equals($$0)) {
         cgv.a $$1 = this.gA();
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

   public cgv a(cgv.a $$0) {
      switch ($$0) {
         case c:
            this.b(cgv.a.c).gC();
            break;
         case d:
            this.a(avh.yp, 1.0F, 1.0F);
            this.b(cgv.a.d);
            break;
         case f:
            this.b(cgv.a.f).gD();
            break;
         case g:
            this.a(avh.ys, 1.0F, 1.0F);
            this.b(cgv.a.g);
            break;
         case b:
            this.a(avh.yt, 1.0F, 1.0F);
            this.b(cgv.a.b);
            break;
         case a:
            this.b(cgv.a.a);
            break;
         case e:
            this.b(cgv.a.e);
      }

      return this;
   }

   private cgv gC() {
      this.a(avh.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cgv gD() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public cgv w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<io> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cdm.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(io::a)
         .filter($$0 -> this.dP().C_().a($$0))
         .map(io::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gx() {
      return !this.gm() && !this.y() && !this.p_() && !this.be() && this.aE() && !this.bR() && this.i(this.gy().d());
   }

   private boolean i(io $$0) {
      return this.dP().a_($$0).a(avw.cr)
         && this.gF().noneMatch($$1 -> iw.a(this.dP().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eni::j).orElse(false);
   }

   private void gE() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         aqm $$0 = (aqm)this.dP();
         epk $$1 = $$0.o().be().b(epd.aS);
         epi $$2 = new epi.a($$0).a(erx.f, this.gz()).a(erx.a, this).a(erw.j);
         List<cto> $$3 = $$1.a($$2);
         io $$4 = this.gy();

         for (cto $$5 : $$3) {
            cig $$6 = new cig($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avh.yn, 1.0F, 1.0F);
      }
   }

   private cgv a(brp $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         io $$2 = this.gy();
         drb $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dke.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               euk $$5 = euk.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new kp(ky.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dvu.u, this.gy(), dvu.a.a(this));
      }

      return this;
   }

   private cgv j(io $$0) {
      List<iw> $$1 = this.gF().limit(20L).collect(Collectors.toList());
      $$1.add(0, iw.a(this.dP().ae(), $$0));
      this.dS().a(cbs.aQ, $$1);
      return this;
   }

   private Stream<iw> gF() {
      return this.dS().c(cbs.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new euk(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqm $$0, cee $$1) {
      cto $$2 = new cto(ctr.kq);
      cig $$3 = new cig($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avh.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bqn $$0) {
      this.a(cgv.a.a);
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
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bpu $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), avi.g, 1.0F, ayd.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gG() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), avh.yq, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.yi, 0.15F, 1.0F);
   }

   @Override
   public avg d(cto $$0) {
      return avh.yj;
   }

   @Override
   protected avg v() {
      return Set.of(cgv.a.f, cgv.a.e).contains(this.gA()) ? null : avh.yk;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.yl;
   }

   @Override
   protected avg o_() {
      return avh.ym;
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
   public bro a(aqm $$0, bro $$1) {
      return bsa.aR.a((dax)$$0);
   }

   @Override
   public boolean a(cee $$0) {
      if (!($$0 instanceof cgv $$1)) {
         return false;
      } else {
         Set<cgv.a> $$2 = Set.of(cgv.a.a, cgv.a.c, cgv.a.b);
         return $$2.contains(this.gA()) && $$2.contains($$1.gA()) && super.a($$0);
      }
   }

   @Override
   public euf h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.X);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cgw.a(this.dT().a($$0));
   }

   @Override
   public btq<cgv> dS() {
      return (btq<cgv>)super.dS();
   }

   @Override
   protected btq.b<cgv> dT() {
      return btq.a(cgw.b, cgw.a);
   }

   @Override
   protected void Y() {
      this.dP().af().a("snifferBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().b("snifferActivityUpdate");
      cgw.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cgv.a> h = awv.a(cgv.a::a, values(), awv.a.a);
      public static final yv<ByteBuf, cgv.a> i = yt.a(h, cgv.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
