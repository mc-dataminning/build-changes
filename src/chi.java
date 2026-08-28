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

public class chi extends cer {
   private static final int cg = 1700;
   private static final int ch = 6000;
   private static final int ci = 30;
   private static final int cj = 120;
   private static final int ck = 48000;
   private static final float cl = 0.4F;
   private static final bsj cm = bsj.b(bsm.aR.l(), bsm.aR.m() - 0.4F).b(0.81F);
   private static final ajp<chi.a> cn = ajt.a(chi.class, ajr.C);
   private static final ajp<Integer> co = ajt.a(chi.class, ajr.b);
   public final bsb ca = new bsb();
   public final bsb cb = new bsb();
   public final bsb cd = new bsb();
   public final bsb ce = new bsb();
   public final bsb cf = new bsb();

   public static bui.a s() {
      return btd.A().a(buj.v, 0.1F).a(buj.s, 14.0);
   }

   public chi(bsm<? extends cer> $$0, dcf $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eoy.j, -1.0F);
      this.a(eoy.g, -1.0F);
      this.a(eoy.y, -1.0F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cn, chi.a.a);
      $$0.a(co, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bR() || this.bf()) {
         this.a(eoy.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eoy.j, -1.0F);
   }

   @Override
   public bsj e(btn $$0) {
      return this.gz() == chi.a.f ? cm.a(this.eb()) : super.e($$0);
   }

   public boolean u() {
      return this.gz() == chi.a.e;
   }

   public boolean y() {
      return this.bF.c(ccf.R).orElse(false);
   }

   public boolean go() {
      return !this.y() && !this.gl() && !this.bf() && !this.gs() && this.aF() && !this.bS() && !this.ga();
   }

   public boolean gu() {
      return this.gz() == chi.a.f || this.gz() == chi.a.e;
   }

   private ja gx() {
      ewf $$0 = this.gy();
      return ja.a($$0.a(), this.dx() + 0.2F, $$0.c());
   }

   private ewf gy() {
      return this.do().e(this.bO().a(2.25));
   }

   private chi.a gz() {
      return this.ao.a(cn);
   }

   private chi b(chi.a $$0) {
      this.ao.a(cn, $$0);
      return this;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cn.equals($$0)) {
         chi.a $$1 = this.gz();
         this.gA();
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

   private void gA() {
      this.ce.a();
      this.cd.a();
      this.cf.a();
      this.ca.a();
      this.cb.a();
   }

   public chi a(chi.a $$0) {
      switch ($$0) {
         case a:
            this.b(chi.a.a);
            break;
         case b:
            this.a(avh.yw, 1.0F, 1.0F);
            this.b(chi.a.b);
            break;
         case c:
            this.b(chi.a.c).gB();
            break;
         case d:
            this.a(avh.ys, 1.0F, 1.0F);
            this.b(chi.a.d);
            break;
         case e:
            this.b(chi.a.e);
            break;
         case f:
            this.b(chi.a.f).gC();
            break;
         case g:
            this.a(avh.yv, 1.0F, 1.0F);
            this.b(chi.a.g);
      }

      return this;
   }

   private chi gB() {
      this.a(avh.yr, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chi gC() {
      this.ao.a(co, this.ai + 120);
      this.dQ().a(this, (byte)63);
      return this;
   }

   public chi w(boolean $$0) {
      if ($$0) {
         this.i(this.aM());
      }

      return this;
   }

   Optional<ja> gv() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cdz.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ja::a)
         .filter($$0 -> this.dQ().C_().a($$0))
         .map(ja::d)
         .filter(this::h)
         .findFirst();
   }

   boolean gw() {
      return !this.gl() && !this.y() && !this.p_() && !this.bf() && this.aF() && !this.bS() && this.h(this.gx().d());
   }

   private boolean h(ja $$0) {
      return this.dQ().a_($$0).a(avw.cr)
         && this.gE().noneMatch($$1 -> ji.a(this.dQ().af(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eov::j).orElse(false);
   }

   private void gD() {
      if (!this.dQ().x_() && this.ao.a(co) == this.ai) {
         aqm $$0 = (aqm)this.dQ();
         eqz $$1 = $$0.o().bf().b(eqq.aU);
         eqx $$2 = new eqx.a($$0).a(etq.f, this.gy()).a(etq.a, this).a(etp.j);
         List<cuc> $$3 = $$1.a($$2);
         ja $$4 = this.gx();

         for (cuc $$5 : $$3) {
            ciu $$6 = new ciu($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avh.yq, 1.0F, 1.0F);
      }
   }

   private chi a(bsb $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ja $$2 = this.gx();
         dsk $$3 = this.dQ().a_($$2.d());
         if ($$3.l() != dln.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ewf $$5 = ewf.b($$2).b(0.0, -0.65F, 0.0);
               this.dQ().a(new lb(lj.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dQ().a(this.dv(), this.dx(), this.dB(), $$3.w().f(), this.df(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dQ().a(dxg.u, this.gx(), dxg.a.a(this));
      }

      return this;
   }

   private chi i(ja $$0) {
      List<ji> $$1 = this.gE().limit(20L).collect(Collectors.toList());
      $$1.add(0, ji.a(this.dQ().af(), $$0));
      this.dU().a(ccf.aQ, $$1);
      return this;
   }

   private Stream<ji> gE() {
      return this.dU().c(ccf.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.dt().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ewf(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqm $$0, cer $$1) {
      cuc $$2 = new cuc(cuf.kq);
      ciu $$3 = new ciu($$0, this.do().a(), this.do().b(), this.do().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avh.yx, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bqz $$0) {
      this.a(chi.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gz()) {
         case e:
            this.gF();
            break;
         case f:
            this.a(this.ce).gD();
      }

      super.l();
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqg $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dQ().a(null, this, this.d($$2), avi.g, 1.0F, ayg.b(this.dQ().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gF() {
      if (this.dQ().x_() && this.ai % 20 == 0) {
         this.dQ().a(this.dv(), this.dx(), this.dB(), avh.yt, this.df(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.yl, 0.15F, 1.0F);
   }

   @Override
   public avg d(cuc $$0) {
      return avh.ym;
   }

   @Override
   protected avg v() {
      return Set.of(chi.a.f, chi.a.e).contains(this.gz()) ? null : avh.yn;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.yo;
   }

   @Override
   protected avg o_() {
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
   public bsa a(aqm $$0, bsa $$1) {
      return bsm.aR.a((dcf)$$0);
   }

   @Override
   public boolean a(cer $$0) {
      if (!($$0 instanceof chi $$1)) {
         return false;
      } else {
         Set<chi.a> $$2 = Set.of(chi.a.a, chi.a.c, chi.a.b);
         return $$2.contains(this.gz()) && $$2.contains($$1.gz()) && super.a($$0);
      }
   }

   @Override
   public ewa h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.X);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return chj.a(this.dV().a($$0));
   }

   @Override
   public bud<chi> dU() {
      return (bud<chi>)super.dU();
   }

   @Override
   protected bud.b<chi> dV() {
      return bud.a(chj.b, chj.a);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("snifferBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().b("snifferActivityUpdate");
      chj.a(this);
      this.dQ().ag().c();
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

      public static final IntFunction<chi.a> h = aww.a(chi.a::a, values(), aww.a.a);
      public static final ys<ByteBuf, chi.a> i = yq.a(h, chi.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
