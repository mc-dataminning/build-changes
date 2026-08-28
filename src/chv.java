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

public class chv extends cfe {
   private static final int ce = 1700;
   private static final int cf = 6000;
   private static final int cg = 30;
   private static final int ch = 120;
   private static final int ci = 48000;
   private static final float cj = 0.4F;
   private static final bsw ck = bsw.b(bsz.aR.l(), bsz.aR.m() - 0.4F).b(0.81F);
   private static final akj<chv.a> cl = akn.a(chv.class, akl.C);
   private static final akj<Integer> cm = akn.a(chv.class, akl.b);
   public final bso bY = new bso();
   public final bso bZ = new bso();
   public final bso cb = new bso();
   public final bso cc = new bso();
   public final bso cd = new bso();

   public static buv.a s() {
      return btq.A().a(buw.r, 0.1F).a(buw.q, 14.0);
   }

   public chv(bsz<? extends cfe> $$0, dbx $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eol.j, -1.0F);
      this.a(eol.g, -1.0F);
      this.a(eol.y, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cl, chv.a.a);
      $$0.a(cm, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bQ() || this.be()) {
         this.a(eol.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(eol.j, -1.0F);
   }

   @Override
   public bsw e(bua $$0) {
      return this.gB() == chv.a.f ? ck.a(this.ed()) : super.e($$0);
   }

   public boolean u() {
      return this.gB() == chv.a.e;
   }

   public boolean y() {
      return this.bD.c(ccs.R).orElse(false);
   }

   public boolean gq() {
      return !this.y() && !this.gn() && !this.be() && !this.gu() && this.aE() && !this.bR() && !this.gd();
   }

   public boolean gw() {
      return this.gB() == chv.a.f || this.gB() == chv.a.e;
   }

   private iz gz() {
      evq $$0 = this.gA();
      return iz.a($$0.a(), this.dw() + 0.2F, $$0.c());
   }

   private evq gA() {
      return this.dn().e(this.bN().a(2.25));
   }

   private chv.a gB() {
      return this.ao.a(cl);
   }

   private chv b(chv.a $$0) {
      this.ao.a(cl, $$0);
      return this;
   }

   @Override
   public void a(akj<?> $$0) {
      if (cl.equals($$0)) {
         chv.a $$1 = this.gB();
         this.gC();
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

   private void gC() {
      this.cc.a();
      this.cb.a();
      this.cd.a();
      this.bY.a();
      this.bZ.a();
   }

   public chv a(chv.a $$0) {
      switch ($$0) {
         case a:
            this.b(chv.a.a);
            break;
         case b:
            this.a(avz.yt, 1.0F, 1.0F);
            this.b(chv.a.b);
            break;
         case c:
            this.b(chv.a.c).gD();
            break;
         case d:
            this.a(avz.yp, 1.0F, 1.0F);
            this.b(chv.a.d);
            break;
         case e:
            this.b(chv.a.e);
            break;
         case f:
            this.b(chv.a.f).gE();
            break;
         case g:
            this.a(avz.ys, 1.0F, 1.0F);
            this.b(chv.a.g);
      }

      return this;
   }

   private chv gD() {
      this.a(avz.yo, 1.0F, this.p_() ? 1.3F : 1.0F);
      return this;
   }

   private chv gE() {
      this.ao.a(cm, this.ai + 120);
      this.dP().a(this, (byte)63);
      return this;
   }

   public chv w(boolean $$0) {
      if ($$0) {
         this.j(this.aL());
      }

      return this;
   }

   Optional<iz> gx() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cem.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iz::a)
         .filter($$0 -> this.dP().C_().a($$0))
         .map(iz::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gy() {
      return !this.gn() && !this.y() && !this.p_() && !this.be() && this.aE() && !this.bR() && this.i(this.gz().d());
   }

   private boolean i(iz $$0) {
      return this.dP().a_($$0).a(awo.cr)
         && this.gG().noneMatch($$1 -> jh.a(this.dP().af(), $$0).equals($$1))
         && Optional.ofNullable(this.K().a($$0, 1)).map(eoi::j).orElse(false);
   }

   private void gF() {
      if (!this.dP().x_() && this.ao.a(cm) == this.ai) {
         are $$0 = (are)this.dP();
         eqm $$1 = $$0.o().be().b(eqd.aU);
         eqk $$2 = new eqk.a($$0).a(etd.f, this.gA()).a(etd.a, this).a(etc.j);
         List<cuo> $$3 = $$1.a($$2);
         iz $$4 = this.gz();

         for (cuo $$5 : $$3) {
            cjg $$6 = new cjg($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.v();
            $$0.b($$6);
         }

         this.a(avz.yn, 1.0F, 1.0F);
      }
   }

   private chv a(bso $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         iz $$2 = this.gz();
         dsb $$3 = this.dP().a_($$2.d());
         if ($$3.l() != dle.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               evq $$5 = evq.b($$2).b(0.0, -0.65F, 0.0);
               this.dP().a(new la(li.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ai % 10 == 0) {
               this.dP().a(this.du(), this.dw(), this.dA(), $$3.w().f(), this.de(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ai % 10 == 0) {
         this.dP().a(dwu.u, this.gz(), dwu.a.a(this));
      }

      return this;
   }

   private chv j(iz $$0) {
      List<jh> $$1 = this.gG().limit(20L).collect(Collectors.toList());
      $$1.add(0, jh.a(this.dP().af(), $$0));
      this.dS().a(ccs.aQ, $$1);
      return this;
   }

   private Stream<jh> gG() {
      return this.dS().c(ccs.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evq(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(are $$0, cfe $$1) {
      cuo $$2 = new cuo(cur.kq);
      cjg $$3 = new cjg($$0, this.dn().a(), this.dn().b(), this.dn().c(), $$2);
      $$3.v();
      this.a($$0, $$1, null);
      this.a(avz.yu, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(brm $$0) {
      this.a(chv.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gB()) {
         case e:
            this.gH();
            break;
         case f:
            this.a(this.cc).gF();
      }

      super.l();
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqt $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dP().a(null, this, this.d($$2), awa.g, 1.0F, ayy.b(this.dP().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gH() {
      if (this.dP().x_() && this.ai % 20 == 0) {
         this.dP().a(this.du(), this.dw(), this.dA(), avz.yq, this.de(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.yi, 0.15F, 1.0F);
   }

   @Override
   public avy d(cuo $$0) {
      return avz.yj;
   }

   @Override
   protected avy v() {
      return Set.of(chv.a.f, chv.a.e).contains(this.gB()) ? null : avz.yk;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.yl;
   }

   @Override
   protected avy o_() {
      return avz.ym;
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
   public bsn a(are $$0, bsn $$1) {
      return bsz.aR.a((dbx)$$0);
   }

   @Override
   public boolean a(cfe $$0) {
      if (!($$0 instanceof chv $$1)) {
         return false;
      } else {
         Set<chv.a> $$2 = Set.of(chv.a.a, chv.a.c, chv.a.b);
         return $$2.contains(this.gB()) && $$2.contains($$1.gB()) && super.a($$0);
      }
   }

   @Override
   public evl h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.X);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chw.a(this.dT().a($$0));
   }

   @Override
   public buq<chv> dS() {
      return (buq<chv>)super.dS();
   }

   @Override
   protected buq.b<chv> dT() {
      return buq.a(chw.b, chw.a);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("snifferBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().b("snifferActivityUpdate");
      chw.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
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

      public static final IntFunction<chv.a> h = axo.a(chv.a::a, values(), axo.a.a);
      public static final zm<ByteBuf, chv.a> i = zk.a(h, chv.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
