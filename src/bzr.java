import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class bzr extends byz implements byr, bzx {
   private static final adx<Boolean> d = aea.a(bzr.class, adz.k);
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
   protected static final ImmutableList<? extends btd<? extends btc<? super bzr>>> b = ImmutableList.of(btd.c, btd.d);
   protected static final ImmutableList<? extends bry<?>> c = ImmutableList.of(bry.g, bry.h, bry.k, bry.l, bry.n, bry.m, bry.E, bry.t, bry.o, bry.p);

   public bzr(bik<? extends bzr> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bjx.b<bzr> dN() {
      return bjx.a(c, b);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      bjx<bzr> $$1 = this.dN().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ccw.a));
      $$1.b(ccw.b);
      $$1.f();
      return $$1;
   }

   private static void a(bjx<bzr> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new blt(45, 90), new blx()));
   }

   private static void b(bjx<bzr> $$0) {
      $$0.a(
         ccw.b,
         10,
         ImmutableList.of(
            bmz.a(bzr::gb),
            bmn.a(8.0F, bfz.a(30, 60)),
            new bmk(ImmutableList.of(Pair.of(bmf.a(0.4F), 2), Pair.of(bmu.a(0.4F, 3), 2), Pair.of(new bky(30, 60), 1)))
         )
      );
   }

   private static void c(bjx<bzr> $$0) {
      $$0.a(ccw.k, 10, ImmutableList.of(bms.a(1.0F), boa.a(bzr::q, blu.a(40)), boa.a(bzr::i_, blu.a(15)), bnc.a()), bry.o);
   }

   private Optional<? extends biw> gb() {
      return this.dM().c(bry.h).orElse(bsa.a()).a(this::l);
   }

   private boolean l(biw $$0) {
      bik<?> $$1 = $$0.ag();
      return $$1 != bik.bo && $$1 != bik.u && btc.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(adx<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.e_();
      }
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 40.0).a(bkd.d, 0.3F).a(bkd.c, 0.6F).a(bkd.g, 1.0).a(bkd.f, 6.0);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   public boolean C(big $$0) {
      if (!($$0 instanceof biw)) {
         return false;
      } else {
         this.cc = 10;
         this.dK().a(this, (byte)4);
         this.a(aou.AM, 1.0F, this.eV());
         return bzx.a(this, (biw)$$0);
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return !this.fO();
   }

   @Override
   protected void e(biw $$0) {
      if (!this.i_()) {
         bzx.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof biw) {
         biw $$3 = (biw)$$0.d();
         if (this.c($$3) && !bkq.a(this, $$3, 4.0)) {
            this.m($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void m(biw $$0) {
      this.bz.b(bry.E);
      this.bz.a(bry.o, $$0, 200L);
   }

   @Override
   public bjx<bzr> dM() {
      return (bjx<bzr>)super.dM();
   }

   protected void t() {
      ccw $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(ccw.k, ccw.b));
      ccw $$1 = this.bz.g().orElse(null);
      if ($$1 == ccw.k && $$0 != ccw.k) {
         this.ga();
      }

      this.v(this.bz.a(bry.o));
   }

   @Override
   protected void V() {
      this.dK().ad().a("zoglinBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dK().B && $$0) {
         this.a(bkd.f).a(0.5);
      }
   }

   @Override
   public boolean i_() {
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
         this.a(aou.AM, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int fZ() {
      return this.cc;
   }

   @Override
   protected aot r() {
      if (this.dK().B) {
         return null;
      } else {
         return this.bz.a(bry.o) ? aou.AL : aou.AK;
      }
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.AO;
   }

   @Override
   protected aot h_() {
      return aou.AN;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.AP, 0.15F, 1.0F);
   }

   protected void ga() {
      this.a(aou.AL, 1.0F, this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.i_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
