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

public class chj extends ces {
   private static final int cg = 1700;
   private static final int ch = 6000;
   private static final int ci = 30;
   private static final int cj = 120;
   private static final int ck = 48000;
   private static final float cl = 0.4F;
   private static final bsk cm = bsk.b(bsn.aR.l(), bsn.aR.m() - 0.4F).b(0.81F);
   private static final ajp<chj.a> cn = ajt.a(chj.class, ajr.C);
   private static final ajp<Integer> co = ajt.a(chj.class, ajr.b);
   public final bsc ca = new bsc();
   public final bsc cb = new bsc();
   public final bsc cd = new bsc();
   public final bsc ce = new bsc();
   public final bsc cf = new bsc();

   public static buj.a s() {
      return bte.A().a(buk.v, 0.1F).a(buk.s, 14.0);
   }

   public chj(bsn<? extends ces> $$0, dcg $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.a(epa.j, -1.0F);
      this.a(epa.g, -1.0F);
      this.a(epa.y, -1.0F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cn, chj.a.a);
      $$0.a(co, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bS() || this.bg()) {
         this.a(epa.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(epa.j, -1.0F);
   }

   @Override
   public bsk e(bto $$0) {
      return this.gy() == chj.a.f ? cm.a(this.ec()) : super.e($$0);
   }

   public boolean t() {
      return this.gy() == chj.a.e;
   }

   public boolean x() {
      return this.bG.c(ccg.R).orElse(false);
   }

   public boolean gn() {
      return !this.x() && !this.gk() && !this.bg() && !this.gr() && this.aG() && !this.bT() && !this.fZ();
   }

   public boolean gt() {
      return this.gy() == chj.a.f || this.gy() == chj.a.e;
   }

   private ja gw() {
      ewh $$0 = this.gx();
      return ja.a($$0.a(), this.dy() + 0.2F, $$0.c());
   }

   private ewh gx() {
      return this.dp().e(this.bP().a(2.25));
   }

   private chj.a gy() {
      return this.ao.a(cn);
   }

   private chj b(chj.a $$0) {
      this.ao.a(cn, $$0);
      return this;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cn.equals($$0)) {
         chj.a $$1 = this.gy();
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

         this.i_();
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

   public chj a(chj.a $$0) {
      switch ($$0) {
         case a:
            this.b(chj.a.a);
            break;
         case b:
            this.a(avh.yw, 1.0F, 1.0F);
            this.b(chj.a.b);
            break;
         case c:
            this.b(chj.a.c).gA();
            break;
         case d:
            this.a(avh.ys, 1.0F, 1.0F);
            this.b(chj.a.d);
            break;
         case e:
            this.b(chj.a.e);
            break;
         case f:
            this.b(chj.a.f).gB();
            break;
         case g:
            this.a(avh.yv, 1.0F, 1.0F);
            this.b(chj.a.g);
      }

      return this;
   }

   private chj gA() {
      this.a(avh.yr, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private chj gB() {
      this.ao.a(co, this.ai + 120);
      this.dR().a(this, (byte)63);
      return this;
   }

   public chj w(boolean $$0) {
      if ($$0) {
         this.i(this.aN());
      }

      return this;
   }

   Optional<ja> gu() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cea.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ja::a)
         .filter($$0 -> this.dR().C_().a($$0))
         .map(ja::d)
         .filter(this::h)
         .findFirst();
   }

   boolean gv() {
      return !this.gk() && !this.x() && !this.o_() && !this.bg() && this.aG() && !this.bT() && this.h(this.gw().d());
   }

   private boolean h(ja $$0) {
      return this.dR().a_($$0).a(avw.cr)
         && this.gD().noneMatch($$1 -> ji.a(this.dR().af(), $$0).equals($$1))
         && Optional.ofNullable(this.J().a($$0, 1)).map(eox::j).orElse(false);
   }

   private void gC() {
      if (!this.dR().x_() && this.ao.a(co) == this.ai) {
         aqm $$0 = (aqm)this.dR();
         erb $$1 = $$0.o().bf().b(eqs.aU);
         eqz $$2 = new eqz.a($$0).a(ets.f, this.gx()).a(ets.a, this).a(etr.j);
         List<cud> $$3 = $$1.a($$2);
         ja $$4 = this.gw();

         for (cud $$5 : $$3) {
            civ $$6 = new civ($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avh.yq, 1.0F, 1.0F);
      }
   }

   private chj a(bsc $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ja $$2 = this.gw();
         dsl $$3 = this.dR().a_($$2.d());
         if ($$3.l() != dlo.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ewh $$5 = ewh.b($$2).b(0.0, -0.65F, 0.0);
               this.dR().a(new lb(lj.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dR().a(this.dw(), this.dy(), this.dC(), $$3.w().f(), this.dg(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dR().a(dxh.u, this.gw(), dxh.a.a(this));
      }

      return this;
   }

   private chj i(ja $$0) {
      List<ji> $$1 = this.gD().limit(20L).collect(Collectors.toList());
      $$1.add(0, ji.a(this.dR().af(), $$0));
      this.dV().a(ccg.aQ, $$1);
      return this;
   }

   private Stream<ji> gD() {
      return this.dV().c(ccg.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fh() {
      super.fh();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.du().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ewh(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqm $$0, ces $$1) {
      cud $$2 = new cud(cug.kq);
      civ $$3 = new civ($$0, this.dp().a(), this.dp().b(), this.dp().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avh.yx, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bra $$0) {
      this.a(chj.a.a);
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
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqh $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dR().a(null, this, this.d($$2), avi.g, 1.0F, ayg.b(this.dR().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gE() {
      if (this.dR().x_() && this.ai % 20 == 0) {
         this.dR().a(this.dw(), this.dy(), this.dC(), avh.yt, this.dg(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.yl, 0.15F, 1.0F);
   }

   @Override
   public avg d(cud $$0) {
      return avh.ym;
   }

   @Override
   protected avg v() {
      return Set.of(chj.a.f, chj.a.e).contains(this.gy()) ? null : avh.yn;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.yo;
   }

   @Override
   protected avg n_() {
      return avh.yp;
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
   public bsb a(aqm $$0, bsb $$1) {
      return bsn.aR.a((dcg)$$0);
   }

   @Override
   public boolean a(ces $$0) {
      if (!($$0 instanceof chj $$1)) {
         return false;
      } else {
         Set<chj.a> $$2 = Set.of(chj.a.a, chj.a.c, chj.a.b);
         return $$2.contains(this.gy()) && $$2.contains($$1.gy()) && super.a($$0);
      }
   }

   @Override
   public ewc h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.X);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return chk.a(this.dW().a($$0));
   }

   @Override
   public bue<chj> dV() {
      return (bue<chj>)super.dV();
   }

   @Override
   protected bue.b<chj> dW() {
      return bue.a(chk.b, chk.a);
   }

   @Override
   protected void Z() {
      this.dR().ag().a("snifferBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().b("snifferActivityUpdate");
      chk.a(this);
      this.dR().ag().c();
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

      public static final IntFunction<chj.a> h = aww.a(chj.a::a, values(), aww.a.a);
      public static final ys<ByteBuf, chj.a> i = yq.a(h, chj.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
