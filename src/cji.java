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

public class cji extends cgr {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final buh ck = buh.b(bul.aR.l(), bul.aR.m() - 0.4F).b(0.81F);
   private static final akl<cji.a> cl = akp.a(cji.class, akn.C);
   private static final akl<Integer> cm = akp.a(cji.class, akn.b);
   public final btw bY = new btw();
   public final btw bZ = new btw();
   public final btw ca = new btw();
   public final btw cc = new btw();
   public final btw cd = new btw();

   public static bwh.a q() {
      return cgr.gz().a(bwi.v, 0.1F).a(bwi.s, 14.0);
   }

   public cji(bul<? extends cgr> $$0, dfb $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(esb.j, -1.0F);
      this.a(esb.g, -1.0F);
      this.a(esb.y, -1.0F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cl, cji.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bZ() || this.bk()) {
         this.a(esb.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(esb.j, -1.0F);
   }

   @Override
   public buh e(bvm $$0) {
      return this.gH() == cji.a.f ? ck.a(this.ek()) : super.e($$0);
   }

   public boolean t() {
      return this.gH() == cji.a.e;
   }

   public boolean y() {
      return this.bF.c(cee.R).orElse(false);
   }

   public boolean gu() {
      return !this.y() && !this.gr() && !this.bk() && !this.gE() && this.aK() && !this.ca() && !this.M_();
   }

   public boolean gv() {
      return this.gH() == cji.a.f || this.gH() == cji.a.e;
   }

   private jh gy() {
      ezn $$0 = this.gG();
      return jh.a($$0.a(), this.dE() + 0.2F, $$0.c());
   }

   private ezn gG() {
      return this.dv().e(this.bW().c(2.25));
   }

   private cji.a gH() {
      return this.am.a(cl);
   }

   private cji b(cji.a $$0) {
      this.am.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akl<?> $$0) {
      if (cl.equals($$0)) {
         cji.a $$1 = this.gH();
         this.gI();
         switch ($$1) {
            case b:
               this.bY.b(this.ag);
               break;
            case c:
               this.bZ.b(this.ag);
               break;
            case d:
               this.ca.b(this.ag);
            case e:
            default:
               break;
            case f:
               this.cc.b(this.ag);
               break;
            case g:
               this.cd.b(this.ag);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gI() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cji a(cji.a $$0) {
      switch ($$0) {
         case a:
            this.b(cji.a.a);
            break;
         case b:
            this.a(awl.yA, 1.0F, 1.0F);
            this.b(cji.a.b);
            break;
         case c:
            this.b(cji.a.c).gJ();
            break;
         case d:
            this.a(awl.yw, 1.0F, 1.0F);
            this.b(cji.a.d);
            break;
         case e:
            this.b(cji.a.e);
            break;
         case f:
            this.b(cji.a.f).gK();
            break;
         case g:
            this.a(awl.yz, 1.0F, 1.0F);
            this.b(cji.a.g);
      }

      return this;
   }

   private cji gJ() {
      this.a(awl.yv, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cji gK() {
      this.am.a(cm, this.ag + 120);
      this.dX().a(this, (byte)63);
      return this;
   }

   public cji x(boolean $$0) {
      if ($$0) {
         this.i(this.aS());
      }

      return this;
   }

   Optional<jh> gw() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cfy.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jh::a)
         .filter($$0 -> this.dX().C_().a($$0))
         .map(jh::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gx() {
      return !this.gr() && !this.y() && !this.p_() && !this.bk() && this.aK() && !this.ca() && this.h(this.gy().e());
   }

   private boolean h(jh $$0) {
      return this.dX().a_($$0).a(axa.ct)
         && this.gM().noneMatch($$1 -> jp.a(this.dX().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(ery::j).orElse(false);
   }

   private void gL() {
      if (!this.dX().y_() && this.am.a(cm) == this.ag) {
         jh $$0 = this.gy();
         this.a(ety.aG, $$1 -> {
            ckv $$2 = new ckv(this.dX(), (double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1);
            $$2.q();
            this.dX().b($$2);
         });
         this.a(awl.yu, 1.0F, 1.0F);
      }
   }

   private cji a(btw $$0) {
      boolean $$1 = $$0.a((float)this.ag) > 1700L && $$0.a((float)this.ag) < 6000L;
      if ($$1) {
         jh $$2 = this.gy();
         dvj $$3 = this.dX().a_($$2.e());
         if ($$3.o() != dok.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ezn $$5 = ezn.b($$2).b(0.0, -0.65F, 0.0);
               this.dX().a(new lj(lr.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dX().a(this.dC(), this.dE(), this.dI(), $$3.A().f(), this.dn(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dX().a(eag.u, this.gy(), eag.a.a(this));
      }

      return this;
   }

   private cji i(jh $$0) {
      List<jp> $$1 = this.gM().limit(20L).collect(Collectors.toList());
      $$1.add(0, jp.a(this.dX().ag(), $$0));
      this.ed().a(cee.aQ, $$1);
      return this;
   }

   private Stream<jp> gM() {
      return this.ed().c(cee.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dA().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezn(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arn $$0, cgr $$1) {
      cwb $$2 = new cwb(cwf.kq);
      ckv $$3 = new ckv($$0, this.dv().a(), this.dv().b(), this.dv().c(), $$2);
      $$3.q();
      this.a($$0, $$1, null);
      this.a(awl.yB, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsu $$0) {
      this.a(cji.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gH()) {
         case e:
            this.gN();
            break;
         case f:
            this.a(this.cc).gL();
      }

      super.l();
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      boolean $$3 = this.l($$2);
      bsd $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gA();
      }

      return $$4;
   }

   @Override
   protected void gA() {
      this.dX().a(null, this, awl.yq, awm.g, 1.0F, azk.b(this.dX().A, 0.8F, 1.2F));
   }

   private void gN() {
      if (this.dX().y_() && this.ag % 20 == 0) {
         this.dX().a(this.dC(), this.dE(), this.dI(), awl.yx, this.dn(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.yp, 0.15F, 1.0F);
   }

   @Override
   protected awk w() {
      return Set.of(cji.a.f, cji.a.e).contains(this.gH()) ? null : awl.yr;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.ys;
   }

   @Override
   protected awk o_() {
      return awl.yt;
   }

   @Override
   public int ae() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public btv a(arn $$0, btv $$1) {
      return bul.aR.a($$0, buk.e);
   }

   @Override
   public boolean a(cgr $$0) {
      if (!($$0 instanceof cji $$1)) {
         return false;
      } else {
         Set<cji.a> $$2 = Set.of(cji.a.a, cji.a.c, cji.a.b);
         return $$2.contains(this.gH()) && $$2.contains($$1.gH()) && super.a($$0);
      }
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.aa);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cjj.a(this.ee().a($$0));
   }

   @Override
   public bwc<cji> ed() {
      return (bwc<cji>)super.ed();
   }

   @Override
   protected bwc.b<cji> ee() {
      return bwc.a(cjj.b, cjj.a);
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("snifferBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.b("snifferActivityUpdate");
      cjj.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cji.a> h = ayb.a(cji.a::a, values(), ayb.a.a);
      public static final zg<ByteBuf, cji.a> i = ze.a(h, cji.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
