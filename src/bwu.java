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

public class bwu extends bui {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bih cf = bih.b(bik.aN.k(), bik.aN.l() - 0.4F);
   private static final adx<bwu.a> cg = aea.a(bwu.class, adz.z);
   private static final adx<Integer> ch = aea.a(bwu.class, adz.b);
   public final bic bT = new bic();
   public final bic bU = new bic();
   public final bic bW = new bic();
   public final bic bX = new bic();
   public final bic bY = new bic();

   public static bkc.a p() {
      return biy.x().a(bkd.d, 0.1F).a(bkd.a, 14.0);
   }

   public bwu(bik<? extends bui> $$0, cpk $$1) {
      super($$0, $$1);
      this.an.a(cg, bwu.a.a);
      this.an.a(ch, 0);
      this.H().a(true);
      this.a(eam.j, -1.0F);
      this.a(eam.g, -1.0F);
      this.a(eam.y, -1.0F);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void z() {
      super.z();
      if (this.bM() || this.aX()) {
         this.a(eam.j, 0.0F);
      }
   }

   @Override
   public void A() {
      this.a(eam.j, -1.0F);
   }

   @Override
   public bih a(bji $$0) {
      return this.an.a(cg) && this.gk() == bwu.a.f ? cf.a(this.dX()) : super.a($$0);
   }

   public boolean q() {
      return this.gk() == bwu.a.e;
   }

   public boolean t() {
      return this.bz.c(bry.Q).orElse(false);
   }

   public boolean fZ() {
      return !this.t() && !this.fW() && !this.aX() && !this.gd() && this.aA() && !this.bN() && !this.fO();
   }

   public boolean gf() {
      return this.gk() == bwu.a.f || this.gk() == bwu.a.e;
   }

   private gv gi() {
      ehf $$0 = this.gj();
      return gv.a($$0.a(), this.dr() + 0.2F, $$0.c());
   }

   private ehf gj() {
      return this.di().e(this.bG().a(2.25));
   }

   private bwu.a gk() {
      return this.an.b(cg);
   }

   private bwu b(bwu.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(adx<?> $$0) {
      if (cg.equals($$0)) {
         bwu.a $$1 = this.gk();
         this.gl();
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

         this.e_();
      }

      super.a($$0);
   }

   private void gl() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bwu a(bwu.a $$0) {
      switch ($$0) {
         case c:
            this.b(bwu.a.c).gm();
            break;
         case d:
            this.a(aou.wF, 1.0F, 1.0F);
            this.b(bwu.a.d);
            break;
         case f:
            this.b(bwu.a.f).gn();
            break;
         case g:
            this.a(aou.wI, 1.0F, 1.0F);
            this.b(bwu.a.g);
            break;
         case b:
            this.a(aou.wJ, 1.0F, 1.0F);
            this.b(bwu.a.b);
            break;
         case a:
            this.b(bwu.a.a);
            break;
         case e:
            this.b(bwu.a.e);
      }

      return this;
   }

   private bwu gm() {
      this.a(aou.wE, 1.0F, this.i_() ? 1.3F : 1.0F);
      return this;
   }

   private bwu gn() {
      this.an.b(ch, this.ah + 120);
      this.dK().a(this, (byte)63);
      return this;
   }

   public bwu w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<gv> gg() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> btq.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(gv::a)
         .filter($$0 -> this.dK().w_().a($$0))
         .map(gv::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gh() {
      return !this.fW() && !this.t() && !this.i_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gi().d());
   }

   private boolean i(gv $$0) {
      return this.dK().a_($$0).a(apj.cj)
         && this.gp().noneMatch($$1 -> he.a(this.dK().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.H().a($$0, 1)).map(eaq::j).orElse(false);
   }

   private void go() {
      if (!this.dK().r_() && this.an.b(ch) == this.ah) {
         aki $$0 = (aki)this.dK();
         ecp $$1 = $$0.n().aH().getLootTable(ecd.aA);
         ecn $$2 = new ecn.a($$0).a(eet.f, this.gj()).a(eet.a, this).a(ees.h);
         List<ciw> $$3 = $$1.a($$2);
         gv $$4 = this.gi();

         for (ciw $$5 : $$3) {
            bye $$6 = new bye($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.o();
            $$0.b($$6);
         }

         this.a(aou.wD, 1.0F, 1.0F);
      }
   }

   private bwu a(bic $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         gv $$2 = this.gi();
         dey $$3 = this.dK().a_($$2.d());
         if ($$3.l() != cyp.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ehf $$5 = ehf.b($$2).b(0.0, -0.65F, 0.0);
               this.dK().a(new io(iw.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dK().a(this.dp(), this.dr(), this.dv(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dK().a(dji.u, this.gi(), dji.a.a(this));
      }

      return this;
   }

   private bwu j(gv $$0) {
      List<he> $$1 = this.gp().limit(20L).collect(Collectors.toList());
      $$1.add(0, he.a(this.dK().ac(), $$0));
      this.dM().a(bry.aP, $$1);
      return this;
   }

   private Stream<he> gp() {
      return this.dM().c(bry.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void eZ() {
      super.eZ();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dn().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ehf(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aki $$0, bui $$1) {
      ciw $$2 = new ciw(ciz.jU);
      bye $$3 = new bye($$0, this.di().a(), this.di().b(), this.di().c(), $$2);
      $$3.o();
      this.a($$0, $$1, null);
      this.a(aou.wK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bhe $$0) {
      this.a(bwu.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gk()) {
         case f:
            this.a(this.bX).go();
            break;
         case e:
            this.gq();
      }

      super.l();
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bgo $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dK().a(null, this, this.d($$2), aov.g, 1.0F, aro.b(this.dK().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gq() {
      if (this.dK().r_() && this.ah % 20 == 0) {
         this.dK().a(this.dp(), this.dr(), this.dv(), aou.wG, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.wy, 0.15F, 1.0F);
   }

   @Override
   public aot d(ciw $$0) {
      return aou.wz;
   }

   @Override
   protected aot r() {
      return Set.of(bwu.a.f, bwu.a.e).contains(this.gk()) ? null : aou.wA;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.wB;
   }

   @Override
   protected aot h_() {
      return aou.wC;
   }

   @Override
   public int X() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bib a(aki $$0, bib $$1) {
      return bik.aN.a((cpk)$$0);
   }

   @Override
   public boolean a(bui $$0) {
      if (!($$0 instanceof bwu $$1)) {
         return false;
      } else {
         Set<bwu.a> $$2 = Set.of(bwu.a.a, bwu.a.c, bwu.a.b);
         return $$2.contains(this.gk()) && $$2.contains($$1.gk()) && super.a($$0);
      }
   }

   @Override
   public eha k_() {
      return super.k_().g(0.6F);
   }

   @Override
   public boolean m(ciw $$0) {
      return $$0.a(apr.aK);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bwv.a(this.dN().a($$0));
   }

   @Override
   public bjx<bwu> dM() {
      return (bjx<bwu>)super.dM();
   }

   @Override
   protected bjx.b<bwu> dN() {
      return bjx.a(bwv.b, bwv.a);
   }

   @Override
   protected void V() {
      this.dK().ad().a("snifferBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().b("snifferActivityUpdate");
      bwv.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
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
