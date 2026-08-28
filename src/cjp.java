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

public class cjp extends cgy {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final buo ck = buo.b(bus.bf.l(), bus.bf.m() - 0.4F).b(0.81F);
   private static final akm<cjp.a> cl = akq.a(cjp.class, ako.C);
   private static final akm<Integer> cm = akq.a(cjp.class, ako.b);
   public final bud bY = new bud();
   public final bud bZ = new bud();
   public final bud ca = new bud();
   public final bud cc = new bud();
   public final bud cd = new bud();

   public static bwo.a n() {
      return cgy.gr().a(bwp.v, 0.1F).a(bwp.s, 14.0);
   }

   public cjp(bus<? extends cgy> $$0, dfm $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(esm.j, -1.0F);
      this.a(esm.g, -1.0F);
      this.a(esm.y, -1.0F);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cl, cjp.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void E() {
      super.E();
      if (this.bY() || this.bj()) {
         this.a(esm.j, 0.0F);
      }
   }

   @Override
   public void F() {
      this.a(esm.j, -1.0F);
   }

   @Override
   public buo e(bvt $$0) {
      return this.gz() == cjp.a.f ? ck.a(this.ei()) : super.e($$0);
   }

   public boolean q() {
      return this.gz() == cjp.a.e;
   }

   public boolean v() {
      return this.bE.c(cel.R).orElse(false);
   }

   public boolean gm() {
      return !this.v() && !this.gj() && !this.bj() && !this.gw() && this.aJ() && !this.bZ() && !this.N_();
   }

   public boolean gn() {
      return this.gz() == cjp.a.f || this.gz() == cjp.a.e;
   }

   private jh gq() {
      ezy $$0 = this.gy();
      return jh.a($$0.a(), this.dC() + 0.2F, $$0.c());
   }

   private ezy gy() {
      return this.dt().e(this.bV().c(2.25));
   }

   private cjp.a gz() {
      return this.al.a(cl);
   }

   private cjp b(cjp.a $$0) {
      this.al.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akm<?> $$0) {
      if (cl.equals($$0)) {
         cjp.a $$1 = this.gz();
         this.gA();
         switch ($$1) {
            case b:
               this.bY.b(this.af);
               break;
            case c:
               this.bZ.b(this.af);
               break;
            case d:
               this.ca.b(this.af);
            case e:
            default:
               break;
            case f:
               this.cc.b(this.af);
               break;
            case g:
               this.cd.b(this.af);
         }

         this.l_();
      }

      super.a($$0);
   }

   private void gA() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cjp a(cjp.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjp.a.a);
            break;
         case b:
            this.a(awn.yA, 1.0F, 1.0F);
            this.b(cjp.a.b);
            break;
         case c:
            this.b(cjp.a.c).gB();
            break;
         case d:
            this.a(awn.yw, 1.0F, 1.0F);
            this.b(cjp.a.d);
            break;
         case e:
            this.b(cjp.a.e);
            break;
         case f:
            this.b(cjp.a.f).gC();
            break;
         case g:
            this.a(awn.yz, 1.0F, 1.0F);
            this.b(cjp.a.g);
      }

      return this;
   }

   private cjp gB() {
      this.a(awn.yv, 1.0F, this.e_() ? 1.3F : 1.0F);
      return this;
   }

   private cjp gC() {
      this.al.a(cm, this.af + 120);
      this.dV().a(this, (byte)63);
      return this;
   }

   public cjp x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<jh> go() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cgf.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jh::a)
         .filter($$0 -> this.dV().E_().a($$0))
         .map(jh::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gp() {
      return !this.gj() && !this.v() && !this.e_() && !this.bj() && this.aJ() && !this.bZ() && this.h(this.gq().e());
   }

   private boolean h(jh $$0) {
      return this.dV().a_($$0).a(axc.ct)
         && this.gE().noneMatch($$1 -> jp.a(this.dV().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(esj::j).orElse(false);
   }

   private void gD() {
      if (this.dV() instanceof arp $$0 && this.al.a(cm) == this.af) {
         jh $$2 = this.gq();
         this.a($$0, euj.aG, ($$1x, $$2x) -> {
            clc $$3 = new clc(this.dV(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.n();
            $$1x.b($$3);
         });
         this.a(awn.yu, 1.0F, 1.0F);
         return;
      }
   }

   private cjp a(bud $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         jh $$2 = this.gq();
         dvv $$3 = this.dV().a_($$2.e());
         if ($$3.o() != dow.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ezy $$5 = ezy.b($$2).b(0.0, -0.65F, 0.0);
               this.dV().a(new lk(ls.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dV().a(this.dA(), this.dC(), this.dG(), $$3.A().f(), this.dm(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dV().a(ear.u, this.gq(), ear.a.a(this));
      }

      return this;
   }

   private cjp i(jh $$0) {
      List<jp> $$1 = this.gE().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dV().ag(), $$0));
      this.eb().a(cel.aQ, $$1);
      return this;
   }

   private Stream<jp> gE() {
      return this.eb().c(cel.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezy(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arp $$0, cgy $$1) {
      cwm $$2 = new cwm(cwq.kq);
      clc $$3 = new clc($$0, this.dt().a(), this.dt().b(), this.dt().c(), $$2);
      $$3.n();
      this.a($$0, $$1, null);
      this.a(awn.yB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(btb $$0) {
      this.a(cjp.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gz()) {
         case e:
            this.gF();
            break;
         case f:
            this.a(this.cc).gD();
      }

      super.h();
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      boolean $$3 = this.j($$2);
      bsk $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gs();
      }

      return $$4;
   }

   @Override
   protected void gs() {
      this.dV().a(null, this, awn.yq, awo.g, 1.0F, azm.b(this.dV().A, 0.8F, 1.2F));
   }

   private void gF() {
      if (this.dV().A_() && this.af % 20 == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.yx, this.dm(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.yp, 0.15F, 1.0F);
   }

   @Override
   protected awm t() {
      return Set.of(cjp.a.f, cjp.a.e).contains(this.gz()) ? null : awn.yr;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.ys;
   }

   @Override
   protected awm n_() {
      return awn.yt;
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
   public buc a(arp $$0, buc $$1) {
      return bus.bf.a($$0, bur.e);
   }

   @Override
   public boolean a(cgy $$0) {
      if (!($$0 instanceof cjp $$1)) {
         return false;
      } else {
         Set<cjp.a> $$2 = Set.of(cjp.a.a, cjp.a.c, cjp.a.b);
         return $$2.contains(this.gz()) && $$2.contains($$1.gz()) && super.a($$0);
      }
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ab);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cjq.a(this.ec().a($$0));
   }

   @Override
   public bwj<cjp> eb() {
      return (bwj<cjp>)super.eb();
   }

   @Override
   protected bwj.b<cjp> ec() {
      return bwj.a(cjq.b, cjq.a);
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cjq.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cjp.a> h = ayd.a(cjp.a::a, values(), ayd.a.a);
      public static final zh<ByteBuf, cjp.a> i = zf.a(h, cjp.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
