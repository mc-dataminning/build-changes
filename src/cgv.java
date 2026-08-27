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
   private static final int cn = 1700;
   private static final int co = 6000;
   private static final int cp = 30;
   private static final int cq = 120;
   private static final int cr = 48000;
   private static final float cs = 0.4F;
   private static final bry ct = bry.b(bsb.aU.k(), bsb.aU.l() - 0.4F).b(0.81F);
   private static final ajy<cgv.a> cu = akc.a(cgv.class, aka.C);
   private static final ajy<Integer> cv = akc.a(cgv.class, aka.b);
   public final brq ch = new brq();
   public final brq ci = new brq();
   public final brq ck = new brq();
   public final brq cl = new brq();
   public final brq cm = new brq();

   public static btu.a r() {
      return bsq.A().a(btv.r, 0.1F).a(btv.q, 14.0);
   }

   public cgv(bsb<? extends cee> $$0, dca $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.a(epv.j, -1.0F);
      this.a(epv.g, -1.0F);
      this.a(epv.y, -1.0F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cu, cgv.a.a);
      $$0.a(cv, 0);
   }

   @Override
   public void C() {
      super.C();
      if (this.bV() || this.bi()) {
         this.a(epv.j, 0.0F);
      }
   }

   @Override
   public void D() {
      this.a(epv.j, -1.0F);
   }

   @Override
   public bry e(bsz $$0) {
      return this.gJ() == cgv.a.f ? ct.a(this.el()) : super.e($$0);
   }

   public boolean t() {
      return this.gJ() == cgv.a.e;
   }

   public boolean x() {
      return this.bO.c(cbr.R).orElse(false);
   }

   public boolean gy() {
      return !this.x() && !this.gv() && !this.bi() && !this.gC() && this.aE() && !this.bW() && !this.gl();
   }

   public boolean gE() {
      return this.gJ() == cgv.a.f || this.gJ() == cgv.a.e;
   }

   private ir gH() {
      ewu $$0 = this.gI();
      return ir.a($$0.a(), this.dB() + 0.2F, $$0.c());
   }

   private ewu gI() {
      return this.ds().e(this.bS().a(2.25));
   }

   private cgv.a gJ() {
      return this.as.a(cu);
   }

   private cgv b(cgv.a $$0) {
      this.as.a(cu, $$0);
      return this;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cu.equals($$0)) {
         cgv.a $$1 = this.gJ();
         this.gK();
         switch ($$1) {
            case c:
               this.ci.b(this.am);
               break;
            case d:
               this.ck.b(this.am);
               break;
            case f:
               this.cl.b(this.am);
               break;
            case g:
               this.cm.b(this.am);
               break;
            case b:
               this.ch.b(this.am);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gK() {
      this.cl.a();
      this.ck.a();
      this.cm.a();
      this.ch.a();
      this.ci.a();
   }

   public cgv a(cgv.a $$0) {
      switch ($$0) {
         case c:
            this.b(cgv.a.c).gL();
            break;
         case d:
            this.a(avo.yN, 1.0F, 1.0F);
            this.b(cgv.a.d);
            break;
         case f:
            this.b(cgv.a.f).gM();
            break;
         case g:
            this.a(avo.yQ, 1.0F, 1.0F);
            this.b(cgv.a.g);
            break;
         case b:
            this.a(avo.yR, 1.0F, 1.0F);
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

   private cgv gL() {
      this.a(avo.yM, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cgv gM() {
      this.as.a(cv, this.am + 120);
      this.dU().a(this, (byte)63);
      return this;
   }

   public cgv w(boolean $$0) {
      if ($$0) {
         this.j(this.aO());
      }

      return this;
   }

   Optional<ir> gF() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cdl.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ir::a)
         .filter($$0 -> this.dU().D_().a($$0))
         .map(ir::d)
         .filter(this::e)
         .findFirst();
   }

   boolean gG() {
      return !this.gv() && !this.x() && !this.o_() && !this.bi() && this.aE() && !this.bW() && this.e(this.gH().d());
   }

   private boolean e(ir $$0) {
      return this.dU().a_($$0).a(awe.cu)
         && this.gO().noneMatch($$1 -> iz.a(this.dU().af(), $$0).equals($$1))
         && Optional.ofNullable(this.J().a($$0, 1)).map(eps::j).orElse(false);
   }

   private void gN() {
      if (!this.dU().x_() && this.as.a(cv) == this.am) {
         aqt $$0 = (aqt)this.dU();
         eru $$1 = $$0.o().be().b(ern.bg);
         ers $$2 = new ers.a($$0).a(eug.f, this.gI()).a(eug.a, this).a(euf.i);
         List<cuh> $$3 = $$1.a($$2);
         ir $$4 = this.gH();

         for (cuh $$5 : $$3) {
            cig $$6 = new cig($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(avo.yL, 1.0F, 1.0F);
      }
   }

   private cgv a(brq $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ir $$2 = this.gH();
         dtc $$3 = this.dU().a_($$2.d());
         if ($$3.l() != dlw.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ewu $$5 = ewu.b($$2).b(0.0, -0.65F, 0.0);
               this.dU().a(new ks(lb.b, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.am % 10 == 0) {
               this.dU().a(this.dz(), this.dB(), this.dF(), $$3.w().f(), this.dj(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.am % 10 == 0) {
         this.dU().a(dxv.u, this.gH(), dxv.a.a(this));
      }

      return this;
   }

   private cgv j(ir $$0) {
      List<iz> $$1 = this.gO().limit(20L).collect(Collectors.toList());
      $$1.add(0, iz.a(this.dU().af(), $$0));
      this.dZ().a(cbr.aQ, $$1);
      return this;
   }

   private Stream<iz> gO() {
      return this.dZ().c(cbr.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fs() {
      super.fs();
      double $$0 = this.bY.c();
      if ($$0 > 0.0) {
         double $$1 = this.dx().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ewu(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aqt $$0, cee $$1) {
      cuh $$2 = new cuh(cuk.lF);
      cig $$3 = new cig($$0, this.ds().a(), this.ds().b(), this.ds().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(avo.yS, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bqt $$0) {
      this.a(cgv.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gJ()) {
         case f:
            this.a(this.cl).gN();
            break;
         case e:
            this.gP();
      }

      super.l();
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bqa $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dU().a(null, this, this.d($$2), avq.g, 1.0F, aym.b(this.dU().A, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gP() {
      if (this.dU().x_() && this.am % 20 == 0) {
         this.dU().a(this.dz(), this.dB(), this.dF(), avo.yO, this.dj(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.yG, 0.15F, 1.0F);
   }

   @Override
   public avn d(cuh $$0) {
      return avo.yH;
   }

   @Override
   protected avn u() {
      return Set.of(cgv.a.f, cgv.a.e).contains(this.gJ()) ? null : avo.yI;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.yJ;
   }

   @Override
   protected avn n_() {
      return avo.yK;
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
   public brp a(aqt $$0, brp $$1) {
      return bsb.aU.a((dca)$$0);
   }

   @Override
   public boolean a(cee $$0) {
      if (!($$0 instanceof cgv $$1)) {
         return false;
      } else {
         Set<cgv.a> $$2 = Set.of(cgv.a.a, cgv.a.c, cgv.a.b);
         return $$2.contains(this.gJ()) && $$2.contains($$1.gJ()) && super.a($$0);
      }
   }

   @Override
   public ewp h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.X);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cgw.a(this.ea().a($$0));
   }

   @Override
   public btp<cgv> dZ() {
      return (btp<cgv>)super.dZ();
   }

   @Override
   protected btp.b<cgv> ea() {
      return btp.a(cgw.b, cgw.a);
   }

   @Override
   protected void Y() {
      this.dU().ag().a("snifferBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().b("snifferActivityUpdate");
      cgw.a(this);
      this.dU().ag().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cgv.a> h = axd.a(cgv.a::a, values(), axd.a.a);
      public static final zc<ByteBuf, cgv.a> i = za.a(h, cgv.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
