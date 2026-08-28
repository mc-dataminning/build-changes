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

public class cmb extends ciz {
   private static final int bM = 1700;
   private static final int bN = 6000;
   private static final int bO = 30;
   private static final int bP = 120;
   private static final int bQ = 48000;
   private static final float bR = 0.4F;
   private static final bwl bS = bwl.b(bwr.bj.l(), bwr.bj.m() - 0.4F).b(0.81F);
   private static final akj<cmb.a> bT = akn.a(cmb.class, akl.F);
   private static final akj<Integer> bU = akn.a(cmb.class, akl.b);
   public final bvz bG = new bvz();
   public final bvz bH = new bvz();
   public final bvz bI = new bvz();
   public final bvz bK = new bvz();
   public final bvz bL = new bvz();

   public static byo.a q() {
      return ciz.gy().a(byp.v, 0.1F).a(byp.s, 14.0);
   }

   public cmb(bwr<? extends ciz> $$0, djh $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(exm.j, -1.0F);
      this.a(exm.g, -1.0F);
      this.a(exm.y, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bT, cmb.a.a);
      $$0.a(bU, 0);
   }

   @Override
   public void G() {
      super.G();
      if (this.bW() || this.bh()) {
         this.a(exm.j, 0.0F);
      }
   }

   @Override
   public void H() {
      this.a(exm.j, -1.0F);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.gG() == cmb.a.f ? bS.a(this.ej()) : super.e($$0);
   }

   public boolean t() {
      return this.gG() == cmb.a.e;
   }

   public boolean x() {
      return this.bs.c(cgl.S).orElse(false);
   }

   public boolean gt() {
      return !this.x() && !this.gq() && !this.bh() && !this.gD() && this.aH() && !this.bX() && !this.O_();
   }

   public boolean gu() {
      return this.gG() == cmb.a.f || this.gG() == cmb.a.e;
   }

   private iv gx() {
      fex $$0 = this.gF();
      return iv.a($$0.a(), this.dB() + 0.2F, $$0.c());
   }

   private fex gF() {
      return this.ds().e(this.bT().c(2.25));
   }

   private cmb.a gG() {
      return this.al.a(bT);
   }

   private cmb b(cmb.a $$0) {
      this.al.a(bT, $$0);
      return this;
   }

   @Override
   public void a(akj<?> $$0) {
      if (bT.equals($$0)) {
         cmb.a $$1 = this.gG();
         this.gH();
         switch ($$1) {
            case b:
               this.bG.b(this.af);
               break;
            case c:
               this.bH.b(this.af);
               break;
            case d:
               this.bI.b(this.af);
            case e:
            default:
               break;
            case f:
               this.bK.b(this.af);
               break;
            case g:
               this.bL.b(this.af);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gH() {
      this.bK.a();
      this.bI.a();
      this.bL.a();
      this.bG.a();
      this.bH.a();
   }

   public cmb a(cmb.a $$0) {
      switch ($$0) {
         case a:
            this.b(cmb.a.a);
            break;
         case b:
            this.a(awn.zA, 1.0F, 1.0F);
            this.b(cmb.a.b);
            break;
         case c:
            this.b(cmb.a.c).gI();
            break;
         case d:
            this.a(awn.zw, 1.0F, 1.0F);
            this.b(cmb.a.d);
            break;
         case e:
            this.b(cmb.a.e);
            break;
         case f:
            this.b(cmb.a.f).gJ();
            break;
         case g:
            this.a(awn.zz, 1.0F, 1.0F);
            this.b(cmb.a.g);
      }

      return this;
   }

   private cmb gI() {
      this.a(awn.zv, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private cmb gJ() {
      this.al.a(bU, this.af + 120);
      this.dU().a(this, (byte)63);
      return this;
   }

   public cmb w(boolean $$0) {
      if ($$0) {
         this.i(this.aP());
      }

      return this;
   }

   Optional<iv> gv() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> cif.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(iv::a)
         .filter($$0 -> this.dU().A_().a($$0))
         .map(iv::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gw() {
      return !this.gq() && !this.x() && !this.n_() && !this.bh() && this.aH() && !this.bX() && this.h(this.gx().e());
   }

   private boolean h(iv $$0) {
      return this.dU().a_($$0).a(axc.cy)
         && this.gL().noneMatch($$1 -> je.a(this.dU().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.O().a($$0, 1)).map(exj::j).orElse(false);
   }

   private void gK() {
      if (this.dU() instanceof arq $$0 && this.al.a(bU) == this.af) {
         iv $$2 = this.gx();
         this.a($$0, ezk.aG, ($$1x, $$2x) -> {
            cno $$3 = new cno(this.dU(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$2x);
            $$3.j();
            $$1x.b($$3);
         });
         this.a(awn.zu, 1.0F, 1.0F);
         return;
      }
   }

   private cmb a(bvz $$0) {
      boolean $$1 = $$0.a((float)this.af) > 1700L && $$0.a((float)this.af) < 6000L;
      if ($$1) {
         iv $$2 = this.gx();
         eao $$3 = this.dU().a_($$2.e());
         if ($$3.o() != dsz.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fex $$5 = fex.b($$2).b(0.0, -0.65F, 0.0);
               this.dU().a(new lq(ly.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.af % 10 == 0) {
               this.dU().a(this.dz(), this.dB(), this.dF(), $$3.A().f(), this.dl(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.af % 10 == 0) {
         this.dU().a(efo.u, this.gx(), efo.a.a(this));
      }

      return this;
   }

   private cmb i(iv $$0) {
      List<je> $$1 = this.gL().limit(20L).collect(Collectors.toList());
      $$1.add(0, je.a(this.dU().aj(), $$0));
      this.eb().a(cgl.aR, $$1);
      return this;
   }

   private Stream<je> gL() {
      return this.eb().c(cgl.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bA.c();
      if ($$0 > 0.0) {
         double $$1 = this.dx().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fex(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(arq $$0, ciz $$1) {
      czk $$2 = new czk(czo.kU);
      cno $$3 = new cno($$0, this.ds().a(), this.ds().b(), this.ds().c(), $$2);
      $$3.j();
      this.a($$0, $$1, null);
      this.a(awn.zB, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bux $$0) {
      this.a(cmb.a.a);
      super.a($$0);
   }

   @Override
   public void h() {
      switch (this.gG()) {
         case e:
            this.gM();
            break;
         case f:
            this.a(this.bK).gK();
      }

      super.h();
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      boolean $$3 = this.i($$2);
      bug $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gz();
      }

      return $$4;
   }

   @Override
   protected void gz() {
      this.dU().a(null, this, awn.zq, awo.g, 1.0F, azm.b(this.dU().A, 0.8F, 1.2F));
   }

   private void gM() {
      if (this.dU().w_() && this.af % 20 == 0) {
         this.dU().a(this.dz(), this.dB(), this.dF(), awn.zx, this.dl(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.zp, 0.15F, 1.0F);
   }

   @Override
   protected awm u() {
      return Set.of(cmb.a.f, cmb.a.e).contains(this.gG()) ? null : awn.zr;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.zs;
   }

   @Override
   protected awm l_() {
      return awn.zt;
   }

   @Override
   public int af() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.bj.a($$0, bwq.e);
   }

   @Override
   public boolean a(ciz $$0) {
      if (!($$0 instanceof cmb $$1)) {
         return false;
      } else {
         Set<cmb.a> $$2 = Set.of(cmb.a.a, cmb.a.c, cmb.a.b);
         return $$2.contains(this.gG()) && $$2.contains($$1.gG()) && super.a($$0);
      }
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.ab);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cmc.a(this.ec().a($$0));
   }

   @Override
   public byj<cmb> eb() {
      return (byj<cmb>)super.eb();
   }

   @Override
   protected byj.b<cmb> ec() {
      return byj.a(cmc.b, cmc.a);
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("snifferBrain");
      this.eb().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cmc.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cmb.a> h = ayc.a(cmb.a::a, values(), ayc.a.a);
      public static final yw<ByteBuf, cmb.a> i = yu.a(h, cmb.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
