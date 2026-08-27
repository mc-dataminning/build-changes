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

public class bxj extends bux {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bix cf = bix.b(bja.aN.k(), bja.aN.l() - 0.4F);
   private static final aef<bxj.a> cg = aei.a(bxj.class, aeh.z);
   private static final aef<Integer> ch = aei.a(bxj.class, aeh.b);
   public final bis bT = new bis();
   public final bis bU = new bis();
   public final bis bW = new bis();
   public final bis bX = new bis();
   public final bis bY = new bis();

   public static bkr.a s() {
      return bjo.A().a(bks.m, 0.1F).a(bks.l, 14.0);
   }

   public bxj(bja<? extends bux> $$0, cqb $$1) {
      super($$0, $$1);
      this.an.a(cg, bxj.a.a);
      this.an.a(ch, 0);
      this.L().a(true);
      this.a(ear.j, -1.0F);
      this.a(ear.g, -1.0F);
      this.a(ear.y, -1.0F);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void C() {
      super.C();
      if (this.bM() || this.aX()) {
         this.a(ear.j, 0.0F);
      }
   }

   @Override
   public void E() {
      this.a(ear.j, -1.0F);
   }

   @Override
   public bix a(bjy $$0) {
      return this.an.a(cg) && this.gp() == bxj.a.f ? cf.a(this.dY()) : super.a($$0);
   }

   public boolean t() {
      return this.gp() == bxj.a.e;
   }

   public boolean y() {
      return this.bz.c(bsn.Q).orElse(false);
   }

   public boolean ge() {
      return !this.y() && !this.gb() && !this.aX() && !this.gi() && this.aA() && !this.bN() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == bxj.a.f || this.gp() == bxj.a.e;
   }

   private gw gn() {
      ehh $$0 = this.go();
      return gw.a($$0.a(), this.ds() + 0.2F, $$0.c());
   }

   private ehh go() {
      return this.dj().e(this.bG().a(2.25));
   }

   private bxj.a gp() {
      return this.an.b(cg);
   }

   private bxj b(bxj.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(aef<?> $$0) {
      if (cg.equals($$0)) {
         bxj.a $$1 = this.gp();
         this.gq();
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

   private void gq() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bxj a(bxj.a $$0) {
      switch ($$0) {
         case c:
            this.b(bxj.a.c).gr();
            break;
         case d:
            this.a(apg.wF, 1.0F, 1.0F);
            this.b(bxj.a.d);
            break;
         case f:
            this.b(bxj.a.f).gs();
            break;
         case g:
            this.a(apg.wI, 1.0F, 1.0F);
            this.b(bxj.a.g);
            break;
         case b:
            this.a(apg.wJ, 1.0F, 1.0F);
            this.b(bxj.a.b);
            break;
         case a:
            this.b(bxj.a.a);
            break;
         case e:
            this.b(bxj.a.e);
      }

      return this;
   }

   private bxj gr() {
      this.a(apg.wE, 1.0F, this.m_() ? 1.3F : 1.0F);
      return this;
   }

   private bxj gs() {
      this.an.b(ch, this.ah + 120);
      this.dL().a(this, (byte)63);
      return this;
   }

   public bxj w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gw> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> buf.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gw::a)
         .filter($$0 -> this.dL().B_().a($$0))
         .map(gw::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gm() {
      return !this.gb() && !this.y() && !this.m_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gn().d());
   }

   private boolean i(gw $$0) {
      return this.dL().a_($$0).a(apv.cj)
         && this.gu().noneMatch($$1 -> hd.a(this.dL().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(eav::j).orElse(false);
   }

   private void gt() {
      if (!this.dL().w_() && this.an.b(ch) == this.ah) {
         akt $$0 = (akt)this.dL();
         ecs $$1 = $$0.n().aH().getLootTable(eci.aA);
         ecq $$2 = new ecq.a($$0).a(eev.f, this.go()).a(eev.a, this).a(eeu.i);
         List<cjl> $$3 = $$1.a($$2);
         gw $$4 = this.gn();

         for (cjl $$5 : $$3) {
            byt $$6 = new byt($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.t();
            $$0.b($$6);
         }

         this.a(apg.wD, 1.0F, 1.0F);
      }
   }

   private bxj a(bis $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gw $$2 = this.gn();
         dfd $$3 = this.dL().a_($$2.d());
         if ($$3.l() != czg.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehh $$5 = ehh.b($$2).b(0.0, -0.65F, 0.0);
               this.dL().a(new in(iv.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dL().a(this.dq(), this.ds(), this.dw(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dL().a(djn.u, this.gn(), djn.a.a(this));
      }

      return this;
   }

   private bxj j(gw $$0) {
      List<hd> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, hd.a(this.dL().ac(), $$0));
      this.dN().a(bsn.aP, $$1);
      return this;
   }

   private Stream<hd> gu() {
      return this.dN().c(bsn.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehh(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(akt $$0, bux $$1) {
      cjl $$2 = new cjl(cjo.jU);
      byt $$3 = new byt($$0, this.dj().a(), this.dj().b(), this.dj().c(), $$2);
      $$3.t();
      this.a($$0, $$1, null);
      this.a(apg.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bhu $$0) {
      this.a(bxj.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gp()) {
         case f:
            this.a(this.bX).gt();
            break;
         case e:
            this.gv();
      }

      super.l();
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bhe $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dL().a(null, this, this.d($$2), aph.g, 1.0F, asb.b(this.dL().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gv() {
      if (this.dL().w_() && this.ah % 20 == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), apg.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.wy, 0.15F, 1.0F);
   }

   @Override
   public apf d(cjl $$0) {
      return apg.wz;
   }

   @Override
   protected apf w() {
      return Set.of(bxj.a.f, bxj.a.e).contains(this.gp()) ? null : apg.wA;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.wB;
   }

   @Override
   protected apf l_() {
      return apg.wC;
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
   public bir a(akt $$0, bir $$1) {
      return bja.aN.a((cqb)$$0);
   }

   @Override
   public boolean a(bux $$0) {
      if (!($$0 instanceof bxj $$1)) {
         return false;
      } else {
         Set<bxj.a> $$2 = Set.of(bxj.a.a, bxj.a.c, bxj.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public ehc g_() {
      return super.g_().g(0.6F);
   }

   @Override
   public boolean m(cjl $$0) {
      return $$0.a(aqd.aK);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return bxk.a(this.dO().a($$0));
   }

   @Override
   public bkm<bxj> dN() {
      return (bkm<bxj>)super.dN();
   }

   @Override
   protected bkm.b<bxj> dO() {
      return bkm.a(bxk.b, bxk.a);
   }

   @Override
   protected void X() {
      this.dL().ad().a("snifferBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().b("snifferActivityUpdate");
      bxk.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
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
