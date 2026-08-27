import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.joml.Vector3f;

public class bxf extends but {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bit cf = bit.b(biw.aN.k(), biw.aN.l() - 0.4F);
   private static final aeg<bxf.a> cg = aej.a(bxf.class, aei.z);
   private static final aeg<Integer> ch = aej.a(bxf.class, aei.b);
   public final bio bT = new bio();
   public final bio bU = new bio();
   public final bio bW = new bio();
   public final bio bX = new bio();
   public final bio bY = new bio();

   public static bkn.a s() {
      return bjk.A().a(bko.d, 0.1F).a(bko.a, 14.0);
   }

   public bxf(biw<? extends but> $$0, cpx $$1) {
      super($$0, $$1);
      this.an.a(cg, bxf.a.a);
      this.an.a(ch, 0);
      this.L().a(true);
      this.a(eaz.j, -1.0F);
      this.a(eaz.g, -1.0F);
      this.a(eaz.y, -1.0F);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void C() {
      super.C();
      if (this.bM() || this.aX()) {
         this.a(eaz.j, 0.0F);
      }
   }

   @Override
   public void E() {
      this.a(eaz.j, -1.0F);
   }

   @Override
   public bit a(bju $$0) {
      return this.an.a(cg) && this.go() == bxf.a.f ? cf.a(this.dY()) : super.a($$0);
   }

   public boolean t() {
      return this.go() == bxf.a.e;
   }

   public boolean y() {
      return this.bz.c(bsj.Q).orElse(false);
   }

   public boolean gd() {
      return !this.y() && !this.ga() && !this.aX() && !this.gh() && this.aA() && !this.bN() && !this.fR();
   }

   public boolean gj() {
      return this.go() == bxf.a.f || this.go() == bxf.a.e;
   }

   private gw gm() {
      ehp $$0 = this.gn();
      return gw.a($$0.a(), this.ds() + 0.2F, $$0.c());
   }

   private ehp gn() {
      return this.dj().e(this.bG().a(2.25));
   }

   private bxf.a go() {
      return this.an.b(cg);
   }

   private bxf b(bxf.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(aeg<?> $$0) {
      if (cg.equals($$0)) {
         bxf.a $$1 = this.go();
         this.gp();
         switch ($$1) {
            case c:
               this.bU.b(this.ah);
               break;
            case d:
               this.bW.b(this.ah);
               break;
            case f:
               this.bX.b(this.ah);
               break;
            case g:
               this.bY.b(this.ah);
               break;
            case b:
               this.bT.b(this.ah);
         }

         this.i_();
      }

      super.a($$0);
   }

   private void gp() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bxf a(bxf.a $$0) {
      switch ($$0) {
         case c:
            this.b(bxf.a.c).gq();
            break;
         case d:
            this.a(apf.wF, 1.0F, 1.0F);
            this.b(bxf.a.d);
            break;
         case f:
            this.b(bxf.a.f).gr();
            break;
         case g:
            this.a(apf.wI, 1.0F, 1.0F);
            this.b(bxf.a.g);
            break;
         case b:
            this.a(apf.wJ, 1.0F, 1.0F);
            this.b(bxf.a.b);
            break;
         case a:
            this.b(bxf.a.a);
            break;
         case e:
            this.b(bxf.a.e);
      }

      return this;
   }

   private bxf gq() {
      this.a(apf.wE, 1.0F, this.m_() ? 1.3F : 1.0F);
      return this;
   }

   private bxf gr() {
      this.an.b(ch, this.ah + 120);
      this.dL().a(this, (byte)63);
      return this;
   }

   public bxf w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gw> gk() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bub.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gw::a)
         .filter($$0 -> this.dL().B_().a($$0))
         .map(gw::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gl() {
      return !this.ga() && !this.y() && !this.m_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gm().d());
   }

   private boolean i(gw $$0) {
      return this.dL().a_($$0).a(apu.cj)
         && this.gt().noneMatch($$1 -> hf.a(this.dL().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(ebd::j).orElse(false);
   }

   private void gs() {
      if (!this.dL().w_() && this.an.b(ch) == this.ah) {
         aks $$0 = (aks)this.dL();
         eda $$1 = $$0.n().aH().getLootTable(ecq.aA);
         ecy $$2 = new ecy.a($$0).a(efd.f, this.gn()).a(efd.a, this).a(efc.i);
         List<cjh> $$3 = $$1.a($$2);
         gw $$4 = this.gm();

         for (cjh $$5 : $$3) {
            byp $$6 = new byp($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.t();
            $$0.b($$6);
         }

         this.a(apf.wD, 1.0F, 1.0F);
      }
   }

   private bxf a(bio $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gw $$2 = this.gm();
         dfl $$3 = this.dL().a_($$2.d());
         if ($$3.l() != czc.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehp $$5 = ehp.b($$2).b(0.0, -0.65F, 0.0);
               this.dL().a(new ip(ix.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dL().a(this.dq(), this.ds(), this.dw(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dL().a(djv.u, this.gm(), djv.a.a(this));
      }

      return this;
   }

   private bxf j(gw $$0) {
      List<hf> $$1 = this.gt().limit(20L).collect(Collectors.toList());
      $$1.add(0, hf.a(this.dL().ac(), $$0));
      this.dN().a(bsj.aP, $$1);
      return this;
   }

   private Stream<hf> gt() {
      return this.dN().c(bsj.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehp(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aks $$0, but $$1) {
      cjh $$2 = new cjh(cjk.jU);
      byp $$3 = new byp($$0, this.dj().a(), this.dj().b(), this.dj().c(), $$2);
      $$3.t();
      this.a($$0, $$1, null);
      this.a(apf.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bhq $$0) {
      this.a(bxf.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.go()) {
         case f:
            this.a(this.bX).gs();
            break;
         case e:
            this.gu();
      }

      super.l();
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bha $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dL().a(null, this, this.d($$2), apg.g, 1.0F, ary.b(this.dL().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gu() {
      if (this.dL().w_() && this.ah % 20 == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), apf.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.wy, 0.15F, 1.0F);
   }

   @Override
   public ape d(cjh $$0) {
      return apf.wz;
   }

   @Override
   protected ape w() {
      return Set.of(bxf.a.f, bxf.a.e).contains(this.go()) ? null : apf.wA;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.wB;
   }

   @Override
   protected ape l_() {
      return apf.wC;
   }

   @Override
   public int Z() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bin a(aks $$0, bin $$1) {
      return biw.aN.a((cpx)$$0);
   }

   @Override
   public boolean a(but $$0) {
      if (!($$0 instanceof bxf $$1)) {
         return false;
      } else {
         Set<bxf.a> $$2 = Set.of(bxf.a.a, bxf.a.c, bxf.a.b);
         return $$2.contains(this.go()) && $$2.contains($$1.go()) && super.a($$0);
      }
   }

   @Override
   public ehk g_() {
      return super.g_().g(0.6F);
   }

   @Override
   public boolean m(cjh $$0) {
      return $$0.a(aqc.aK);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return bxg.a(this.dO().a($$0));
   }

   @Override
   public bki<bxf> dN() {
      return (bki<bxf>)super.dN();
   }

   @Override
   protected bki.b<bxf> dO() {
      return bki.a(bxg.b, bxg.a);
   }

   @Override
   protected void X() {
      this.dL().ad().a("snifferBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().b("snifferActivityUpdate");
      bxg.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
