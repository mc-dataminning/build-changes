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

public class cjd extends cgm {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final buc ck = buc.b(bug.aR.l(), bug.aR.m() - 0.4F).b(0.81F);
   private static final akk<cjd.a> cl = ako.a(cjd.class, akm.C);
   private static final akk<Integer> cm = ako.a(cjd.class, akm.b);
   public final btr bY = new btr();
   public final btr bZ = new btr();
   public final btr ca = new btr();
   public final btr cc = new btr();
   public final btr cd = new btr();

   public static bwc.a q() {
      return cgm.gA().a(bwd.v, 0.1F).a(bwd.s, 14.0);
   }

   public cjd(bug<? extends cgm> $$0, dev $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(erv.j, -1.0F);
      this.a(erv.g, -1.0F);
      this.a(erv.y, -1.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cl, cjd.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bZ() || this.bk()) {
         this.a(erv.j, 0.0F);
      }
   }

   @Override
   public void I() {
      this.a(erv.j, -1.0F);
   }

   @Override
   public buc e(bvh $$0) {
      return this.gI() == cjd.a.f ? ck.a(this.ek()) : super.e($$0);
   }

   public boolean t() {
      return this.gI() == cjd.a.e;
   }

   public boolean y() {
      return this.bC.c(cdz.R).orElse(false);
   }

   public boolean gv() {
      return !this.y() && !this.gs() && !this.bk() && !this.gF() && this.aJ() && !this.ca() && !this.M_();
   }

   public boolean gw() {
      return this.gI() == cjd.a.f || this.gI() == cjd.a.e;
   }

   private jg gz() {
      ezh $$0 = this.gH();
      return jg.a($$0.a(), this.dE() + 0.2F, $$0.c());
   }

   private ezh gH() {
      return this.dv().e(this.bW().c(2.25));
   }

   private cjd.a gI() {
      return this.am.a(cl);
   }

   private cjd b(cjd.a $$0) {
      this.am.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akk<?> $$0) {
      if (cl.equals($$0)) {
         cjd.a $$1 = this.gI();
         this.gJ();
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

   private void gJ() {
      this.cc.a();
      this.ca.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public cjd a(cjd.a $$0) {
      switch ($$0) {
         case a:
            this.b(cjd.a.a);
            break;
         case b:
            this.a(awk.yA, 1.0F, 1.0F);
            this.b(cjd.a.b);
            break;
         case c:
            this.b(cjd.a.c).gK();
            break;
         case d:
            this.a(awk.yw, 1.0F, 1.0F);
            this.b(cjd.a.d);
            break;
         case e:
            this.b(cjd.a.e);
            break;
         case f:
            this.b(cjd.a.f).gL();
            break;
         case g:
            this.a(awk.yz, 1.0F, 1.0F);
            this.b(cjd.a.g);
      }

      return this;
   }

   private cjd gK() {
      this.a(awk.yv, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private cjd gL() {
      this.am.a(cm, this.ag + 120);
      this.dX().a(this, (byte)63);
      return this;
   }

   public cjd x(boolean $$0) {
      if ($$0) {
         this.i(this.aR());
      }

      return this;
   }

   Optional<jg> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cft.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jg::a)
         .filter($$0 -> this.dX().C_().a($$0))
         .map(jg::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gy() {
      return !this.gs() && !this.y() && !this.p_() && !this.bk() && this.aJ() && !this.ca() && this.h(this.gz().e());
   }

   private boolean h(jg $$0) {
      return this.dX().a_($$0).a(awz.ct)
         && this.gN().noneMatch($$1 -> jo.a(this.dX().ag(), $$0).equals($$1))
         && Optional.ofNullable(this.P().a($$0, 1)).map(ers::j).orElse(false);
   }

   private void gM() {
      if (!this.dX().y_() && this.am.a(cm) == this.ag) {
         arm $$0 = (arm)this.dX();
         eub $$1 = $$0.o().bd().b(ets.aE);
         etz $$2 = new etz.a($$0).a(ews.f, this.gH()).a(ews.a, this).a(ewr.j);
         List<cvx> $$3 = $$1.a($$2);
         jg $$4 = this.gz();

         for (cvx $$5 : $$3) {
            ckq $$6 = new ckq($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.q();
            $$0.b($$6);
         }

         this.a(awk.yu, 1.0F, 1.0F);
      }
   }

   private cjd a(btr $$0) {
      boolean $$1 = $$0.a((float)this.ag) > 1700L && $$0.a((float)this.ag) < 6000L;
      if ($$1) {
         jg $$2 = this.gz();
         dvd $$3 = this.dX().a_($$2.e());
         if ($$3.o() != doe.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ezh $$5 = ezh.b($$2).b(0.0, -0.65F, 0.0);
               this.dX().a(new li(lq.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dX().a(this.dC(), this.dE(), this.dI(), $$3.A().f(), this.dn(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dX().a(eaa.u, this.gz(), eaa.a.a(this));
      }

      return this;
   }

   private cjd i(jg $$0) {
      List<jo> $$1 = this.gN().limit(20L).collect(Collectors.toList());
      $$1.add(0, jo.a(this.dX().ag(), $$0));
      this.ed().a(cdz.aQ, $$1);
      return this;
   }

   private Stream<jo> gN() {
      return this.ed().c(cdz.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dA().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezh(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arm $$0, cgm $$1) {
      cvx $$2 = new cvx(cwb.kq);
      ckq $$3 = new ckq($$0, this.dv().a(), this.dv().b(), this.dv().c(), $$2);
      $$3.q();
      this.a($$0, $$1, null);
      this.a(awk.yB, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bsp $$0) {
      this.a(cjd.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gI()) {
         case e:
            this.gO();
            break;
         case f:
            this.a(this.cc).gM();
      }

      super.l();
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      boolean $$3 = this.l($$2);
      bry $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gB();
      }

      return $$4;
   }

   @Override
   protected void gB() {
      this.dX().a(null, this, awk.yq, awl.g, 1.0F, azj.b(this.dX().A, 0.8F, 1.2F));
   }

   private void gO() {
      if (this.dX().y_() && this.ag % 20 == 0) {
         this.dX().a(this.dC(), this.dE(), this.dI(), awk.yx, this.dn(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.yp, 0.15F, 1.0F);
   }

   @Override
   protected awj w() {
      return Set.of(cjd.a.f, cjd.a.e).contains(this.gI()) ? null : awk.yr;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.ys;
   }

   @Override
   protected awj o_() {
      return awk.yt;
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
   public btq a(arm $$0, btq $$1) {
      return bug.aR.a($$0, buf.e);
   }

   @Override
   public boolean a(cgm $$0) {
      if (!($$0 instanceof cjd $$1)) {
         return false;
      } else {
         Set<cjd.a> $$2 = Set.of(cjd.a.a, cjd.a.c, cjd.a.b);
         return $$2.contains(this.gI()) && $$2.contains($$1.gI()) && super.a($$0);
      }
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.Y);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cje.a(this.ee().a($$0));
   }

   @Override
   public bvx<cjd> ed() {
      return (bvx<cjd>)super.ed();
   }

   @Override
   protected bvx.b<cjd> ee() {
      return bvx.a(cje.b, cje.a);
   }

   @Override
   protected void ac() {
      this.dX().ah().a("snifferBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().b("snifferActivityUpdate");
      cje.a(this);
      this.dX().ah().c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cjd.a> h = aya.a(cjd.a::a, values(), aya.a.a);
      public static final zf<ByteBuf, cjd.a> i = zd.a(h, cjd.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
