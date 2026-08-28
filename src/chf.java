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

public class chf extends ceo {
   private static final int cg = 1700;
   private static final int ch = 6000;
   private static final int ci = 30;
   private static final int cj = 120;
   private static final int ck = 48000;
   private static final float cl = 0.4F;
   private static final bsg cm = bsg.b(bsj.aR.l(), bsj.aR.m() - 0.4F).b(0.81F);
   private static final ajp<chf.a> cn = ajt.a(chf.class, ajr.C);
   private static final ajp<Integer> co = ajt.a(chf.class, ajr.b);
   public final bry ca = new bry();
   public final bry cb = new bry();
   public final bry cd = new bry();
   public final bry ce = new bry();
   public final bry cf = new bry();

   public static buf.a s() {
      return bta.A().a(bug.v, 0.1F).a(bug.s, 14.0);
   }

   public chf(bsj<? extends ceo> $$0, dcd $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eos.j, -1.0F);
      this.a(eos.g, -1.0F);
      this.a(eos.y, -1.0F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cn, chf.a.a);
      $$0.a(co, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eos.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eos.j, -1.0F);
   }

   @Override
   public bsg e(btk $$0) {
      return this.gy() == chf.a.f ? cm.a(this.ea()) : super.e($$0);
   }

   public boolean u() {
      return this.gy() == chf.a.e;
   }

   public boolean y() {
      return this.bF.c(ccc.R).orElse(false);
   }

   public boolean gn() {
      return !this.y() && !this.gk() && !this.be() && !this.gr() && this.aE() && !this.bR() && !this.fZ();
   }

   public boolean gt() {
      return this.gy() == chf.a.f || this.gy() == chf.a.e;
   }

   private ja gw() {
      evz $$0 = this.gx();
      return ja.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evz gx() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chf.a gy() {
      return this.ao.a(cn);
   }

   private chf b(chf.a $$0) {
      this.ao.a(cn, $$0);
      return this;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cn.equals($$0)) {
         chf.a $$1 = this.gy();
         this.gz();
         switch ($$1) {
            case b:
               this.ca.b(this.ai);
               break;
            case c:
               this.cb.b(this.ai);
               break;
            case d:
               this.cd.b(this.ai);
            case e:
            default:
               break;
            case f:
               this.ce.b(this.ai);
               break;
            case g:
               this.cf.b(this.ai);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gz() {
      this.ce.a();
      this.cd.a();
      this.cf.a();
      this.ca.a();
      this.cb.a();
   }

   public chf a(chf.a $$0) {
      switch ($$0) {
         case a:
            this.b(chf.a.a);
            break;
         case b:
            this.a(avf.yw, 1.0F, 1.0F);
            this.b(chf.a.b);
            break;
         case c:
            this.b(chf.a.c).gA();
            break;
         case d:
            this.a(avf.ys, 1.0F, 1.0F);
            this.b(chf.a.d);
            break;
         case e:
            this.b(chf.a.e);
            break;
         case f:
            this.b(chf.a.f).gB();
            break;
         case g:
            this.a(avf.yv, 1.0F, 1.0F);
            this.b(chf.a.g);
      }

      return this;
   }

   private chf gA() {
      this.a(avf.yr, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chf gB() {
      this.ao.a(co, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chf w(boolean $$0) {
      if ($$0) {
         this.i(this.aL());
      }

      return this;
   }

   Optional<ja> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cdw.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ja::a)
         .filter($$0 -> this.dP().C_().a($$0))
         .map(ja::d)
         .filter(this::h)
         .findFirst();
   }

   boolean gv() {
      return !this.gk() && !this.y() && !this.p_() && !this.be() && this.aE() && !this.bR() && this.h(this.gw().d());
   }

   private boolean h(ja $$0) {
      return this.dP().a_($$0).a(avu.cr)
         && this.gD().noneMatch($$1 -> ji.a(this.dP().af(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eop::j).orElse(false);
   }

   private void gC() {
      if (!this.dP().x_() && this.ao.a(co) == this.ai) {
         aqk $$0 = (aqk)this.dP();
         eqt $$1 = $$0.o().be().b(eqk.aU);
         eqr $$2 = new eqr.a($$0).a(etk.f, this.gx()).a(etk.a, this).a(etj.j);
         List<cua> $$3 = $$1.a($$2);
         ja $$4 = this.gw();

         for (cua $$5 : $$3) {
            cir $$6 = new cir($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avf.yq, 1.0F, 1.0F);
      }
   }

   private chf a(bry $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ja $$2 = this.gw();
         dsh $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dll.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evz $$5 = evz.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new lb(lj.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dxa.u, this.gw(), dxa.a.a(this));
      }

      return this;
   }

   private chf i(ja $$0) {
      List<ji> $$1 = this.gD().limit(20L).collect(Collectors.toList());
      $$1.add(0, ji.a(this.dP().af(), $$0));
      this.dT().a(ccc.aQ, $$1);
      return this;
   }

   private Stream<ji> gD() {
      return this.dT().c(ccc.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void ff() {
      super.ff();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evz(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqk $$0, ceo $$1) {
      cua $$2 = new cua(cud.kq);
      cir $$3 = new cir($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avf.yx, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bqw $$0) {
      this.a(chf.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gy()) {
         case e:
            this.gE();
            break;
         case f:
            this.a(this.ce).gC();
      }

      super.l();
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqd $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), avg.g, 1.0F, aye.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gE() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), avf.yt, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.yl, 0.15F, 1.0F);
   }

   @Override
   public ave d(cua $$0) {
      return avf.ym;
   }

   @Override
   protected ave v() {
      return Set.of(chf.a.f, chf.a.e).contains(this.gy()) ? null : avf.yn;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.yo;
   }

   @Override
   protected ave o_() {
      return avf.yp;
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
   public brx a(aqk $$0, brx $$1) {
      return bsj.aR.a((dcd)$$0);
   }

   @Override
   public boolean a(ceo $$0) {
      if (!($$0 instanceof chf $$1)) {
         return false;
      } else {
         Set<chf.a> $$2 = Set.of(chf.a.a, chf.a.c, chf.a.b);
         return $$2.contains(this.gy()) && $$2.contains($$1.gy()) && super.a($$0);
      }
   }

   @Override
   public evu h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.X);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return chg.a(this.dU().a($$0));
   }

   @Override
   public bua<chf> dT() {
      return (bua<chf>)super.dT();
   }

   @Override
   protected bua.b<chf> dU() {
      return bua.a(chg.b, chg.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chg.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<chf.a> h = awu.a(chf.a::a, values(), awu.a.a);
      public static final ys<ByteBuf, chf.a> i = yq.a(h, chf.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
