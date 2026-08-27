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

public class cgx extends ceg {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final brz ck = brz.b(bsc.aR.l(), bsc.aR.m() - 0.4F).b(0.81F);
   private static final ajs<cgx.a> cl = ajw.a(cgx.class, aju.C);
   private static final ajs<Integer> cm = ajw.a(cgx.class, aju.b);
   public final brr bY = new brr();
   public final brr bZ = new brr();
   public final brr cb = new brr();
   public final brr cc = new brr();
   public final brr cd = new brr();

   public static btx.a s() {
      return bss.A().a(bty.r, 0.1F).a(bty.q, 14.0);
   }

   public cgx(bsc<? extends ceg> $$0, daz $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(enn.j, -1.0F);
      this.a(enn.g, -1.0F);
      this.a(enn.y, -1.0F);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cl, cgx.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(enn.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(enn.j, -1.0F);
   }

   @Override
   public brz e(btc $$0) {
      return this.gA() == cgx.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gA() == cgx.a.e;
   }

   public boolean y() {
      return this.bD.c(cbu.R).orElse(false);
   }

   public boolean gp() {
      return !this.y() && !this.gm() && !this.be() && !this.gt() && this.aE() && !this.bR() && !this.gc();
   }

   public boolean gv() {
      return this.gA() == cgx.a.f || this.gA() == cgx.a.e;
   }

   private io gy() {
      eum $$0 = this.gz();
      return io.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private eum gz() {
      return this.dn().e(this.bN().a(2.25));
   }

   private cgx.a gA() {
      return this.ao.a(cl);
   }

   private cgx b(cgx.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(ajs<?> $$0) {
      if (cl.equals($$0)) {
         cgx.a $$1 = this.gA();
         this.gB();
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

   private void gB() {
      this.cc.a();
      this.cb.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cgx a(cgx.a $$0) {
      switch ($$0) {
         case a:
            this.b(cgx.a.a);
            break;
         case b:
            this.a(avi.yt, 1.0F, 1.0F);
            this.b(cgx.a.b);
            break;
         case c:
            this.b(cgx.a.c).gC();
            break;
         case d:
            this.a(avi.yp, 1.0F, 1.0F);
            this.b(cgx.a.d);
            break;
         case e:
            this.b(cgx.a.e);
            break;
         case f:
            this.b(cgx.a.f).gD();
            break;
         case g:
            this.a(avi.ys, 1.0F, 1.0F);
            this.b(cgx.a.g);
      }

      return this;
   }

   private cgx gC() {
      this.a(avi.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cgx gD() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public cgx w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<io> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cdo.a(this, 10 + 2 * $$0, 3))
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
      return this.dP().a_($$0).a(avx.cr)
         && this.gF().noneMatch($$1 -> iw.a(this.dP().ae(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(enk::j).orElse(false);
   }

   private void gE() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         aqn $$0 = (aqn)this.dP();
         epm $$1 = $$0.o().be().b(epf.aS);
         epk $$2 = new epk.a($$0).a(erz.f, this.gz()).a(erz.a, this).a(ery.j);
         List<ctq> $$3 = $$1.a($$2);
         io $$4 = this.gy();

         for (ctq $$5 : $$3) {
            cii $$6 = new cii($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avi.yn, 1.0F, 1.0F);
      }
   }

   private cgx a(brr $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         io $$2 = this.gy();
         drd $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dkg.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eum $$5 = eum.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new kp(ky.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dvw.u, this.gy(), dvw.a.a(this));
      }

      return this;
   }

   private cgx j(io $$0) {
      List<iw> $$1 = this.gF().limit(20L).collect(Collectors.toList());
      $$1.add(0, iw.a(this.dP().ae(), $$0));
      this.dS().a(cbu.aQ, $$1);
      return this;
   }

   private Stream<iw> gF() {
      return this.dS().c(cbu.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eum(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqn $$0, ceg $$1) {
      ctq $$2 = new ctq(ctt.kq);
      cii $$3 = new cii($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avi.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bqp $$0) {
      this.a(cgx.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gA()) {
         case e:
            this.gG();
            break;
         case f:
            this.a(this.cc).gE();
      }

      super.l();
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bpw $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), avj.g, 1.0F, ayf.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gG() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), avi.yq, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.yi, 0.15F, 1.0F);
   }

   @Override
   public avh d(ctq $$0) {
      return avi.yj;
   }

   @Override
   protected avh v() {
      return Set.of(cgx.a.f, cgx.a.e).contains(this.gA()) ? null : avi.yk;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.yl;
   }

   @Override
   protected avh o_() {
      return avi.ym;
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
   public brq a(aqn $$0, brq $$1) {
      return bsc.aR.a((daz)$$0);
   }

   @Override
   public boolean a(ceg $$0) {
      if (!($$0 instanceof cgx $$1)) {
         return false;
      } else {
         Set<cgx.a> $$2 = Set.of(cgx.a.a, cgx.a.c, cgx.a.b);
         return $$2.contains(this.gA()) && $$2.contains($$1.gA()) && super.a($$0);
      }
   }

   @Override
   public euh h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.X);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cgy.a(this.dT().a($$0));
   }

   @Override
   public bts<cgx> dS() {
      return (bts<cgx>)super.dS();
   }

   @Override
   protected bts.b<cgx> dT() {
      return bts.a(cgy.b, cgy.a);
   }

   @Override
   protected void Y() {
      this.dP().af().a("snifferBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().b("snifferActivityUpdate");
      cgy.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cgx.a> h = aww.a(cgx.a::a, values(), aww.a.a);
      public static final yv<ByteBuf, cgx.a> i = yt.a(h, cgx.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
