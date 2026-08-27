import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class caa extends bzi implements bza, cag {
   private static final aee<Boolean> d = aeh.a(caa.class, aeg.k);
   private static final int e = 40;
   private static final int bT = 1;
   private static final float bU = 0.6F;
   private static final int bV = 6;
   private static final float bW = 0.5F;
   private static final int bX = 40;
   private static final int bY = 15;
   private static final int bZ = 200;
   private static final float ca = 0.3F;
   private static final float cb = 0.4F;
   private int cc;
   protected static final ImmutableList<? extends btm<? extends btl<? super caa>>> b = ImmutableList.of(btm.c, btm.d);
   protected static final ImmutableList<? extends bsh<?>> c = ImmutableList.of(bsh.g, bsh.h, bsh.k, bsh.l, bsh.n, bsh.m, bsh.E, bsh.t, bsh.o, bsh.p);

   public caa(biu<? extends caa> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bkg.b<caa> dO() {
      return bkg.a(c, b);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      bkg<caa> $$1 = this.dO().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cdf.a));
      $$1.b(cdf.b);
      $$1.f();
      return $$1;
   }

   private static void a(bkg<caa> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bmc(45, 90), new bmg()));
   }

   private static void b(bkg<caa> $$0) {
      $$0.a(
         cdf.b,
         10,
         ImmutableList.of(
            bni.a(caa::gf),
            bmw.a(8.0F, bgj.a(30, 60)),
            new bmt(ImmutableList.of(Pair.of(bmo.a(0.4F), 2), Pair.of(bnd.a(0.4F, 3), 2), Pair.of(new blh(30, 60), 1)))
         )
      );
   }

   private static void c(bkg<caa> $$0) {
      $$0.a(cdf.k, 10, ImmutableList.of(bnb.a(1.0F), boj.a(caa::t, bmd.a(40)), boj.a(caa::m_, bmd.a(15)), bnl.a()), bsh.o);
   }

   private Optional<? extends bjg> gf() {
      return this.dN().c(bsh.h).orElse(bsj.a()).a(this::j);
   }

   private boolean j(bjg $$0) {
      biu<?> $$1 = $$0.ag();
      return $$1 != biu.bo && $$1 != biu.u && btl.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(aee<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 40.0).a(bkm.d, 0.3F).a(bkm.c, 0.6F).a(bkm.g, 1.0).a(bkm.f, 6.0);
   }

   public boolean t() {
      return !this.m_();
   }

   @Override
   public boolean C(biq $$0) {
      if (!($$0 instanceof bjg)) {
         return false;
      } else {
         this.cc = 10;
         this.dL().a(this, (byte)4);
         this.a(apd.AW, 1.0F, this.eW());
         return cag.a(this, (bjg)$$0);
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return !this.fR();
   }

   @Override
   protected void e(bjg $$0) {
      if (!this.m_()) {
         cag.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bjg) {
         bjg $$3 = (bjg)$$0.d();
         if (this.c($$3) && !bkz.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bjg $$0) {
      this.bz.b(bsh.E);
      this.bz.a(bsh.o, $$0, 200L);
   }

   @Override
   public bkg<caa> dN() {
      return (bkg<caa>)super.dN();
   }

   protected void y() {
      cdf $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cdf.k, cdf.b));
      cdf $$1 = this.bz.g().orElse(null);
      if ($$1 == cdf.k && $$0 != cdf.k) {
         this.ge();
      }

      this.v(this.bz.a(bsh.o));
   }

   @Override
   protected void X() {
      this.dL().ad().a("zoglinBrain");
      this.dN().a((akq)this.dL(), this);
      this.dL().ad().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dL().B && $$0) {
         this.a(bkm.f).a(0.5);
      }
   }

   @Override
   public boolean m_() {
      return this.al().b(d);
   }

   @Override
   public void b_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.b_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(apd.AW, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gd() {
      return this.cc;
   }

   @Override
   protected apc w() {
      if (this.dL().B) {
         return null;
      } else {
         return this.bz.a(bsh.o) ? apd.AV : apd.AU;
      }
   }

   @Override
   protected apc d(bho $$0) {
      return apd.AY;
   }

   @Override
   protected apc l_() {
      return apd.AX;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.AZ, 0.15F, 1.0F);
   }

   protected void ge() {
      this.a(apd.AV, 1.0F, this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abb.a(this);
   }

   @Override
   public bjl eR() {
      return bjl.b;
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.m_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
