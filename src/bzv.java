import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class bzv extends bzd implements byv, cab {
   private static final aec<Boolean> d = aef.a(bzv.class, aee.k);
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
   protected static final ImmutableList<? extends bth<? extends btg<? super bzv>>> b = ImmutableList.of(bth.c, bth.d);
   protected static final ImmutableList<? extends bsc<?>> c = ImmutableList.of(bsc.g, bsc.h, bsc.k, bsc.l, bsc.n, bsc.m, bsc.E, bsc.t, bsc.o, bsc.p);

   public bzv(bip<? extends bzv> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bkb.b<bzv> dN() {
      return bkb.a(c, b);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      bkb<bzv> $$1 = this.dN().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cda.a));
      $$1.b(cda.b);
      $$1.f();
      return $$1;
   }

   private static void a(bkb<bzv> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new blx(45, 90), new bmb()));
   }

   private static void b(bkb<bzv> $$0) {
      $$0.a(
         cda.b,
         10,
         ImmutableList.of(
            bnd.a(bzv::gc),
            bmr.a(8.0F, bge.a(30, 60)),
            new bmo(ImmutableList.of(Pair.of(bmj.a(0.4F), 2), Pair.of(bmy.a(0.4F, 3), 2), Pair.of(new blc(30, 60), 1)))
         )
      );
   }

   private static void c(bkb<bzv> $$0) {
      $$0.a(cda.k, 10, ImmutableList.of(bmw.a(1.0F), boe.a(bzv::q, bly.a(40)), boe.a(bzv::i_, bly.a(15)), bng.a()), bsc.o);
   }

   private Optional<? extends bjb> gc() {
      return this.dM().c(bsc.h).orElse(bse.a()).a(this::j);
   }

   private boolean j(bjb $$0) {
      bip<?> $$1 = $$0.ag();
      return $$1 != bip.bo && $$1 != bip.u && btg.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(aec<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.e_();
      }
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 40.0).a(bkh.d, 0.3F).a(bkh.c, 0.6F).a(bkh.g, 1.0).a(bkh.f, 6.0);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   public boolean C(bil $$0) {
      if (!($$0 instanceof bjb)) {
         return false;
      } else {
         this.cc = 10;
         this.dK().a(this, (byte)4);
         this.a(aoz.AW, 1.0F, this.eV());
         return cab.a(this, (bjb)$$0);
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return !this.fO();
   }

   @Override
   protected void e(bjb $$0) {
      if (!this.i_()) {
         cab.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bjb) {
         bjb $$3 = (bjb)$$0.d();
         if (this.c($$3) && !bku.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bjb $$0) {
      this.bz.b(bsc.E);
      this.bz.a(bsc.o, $$0, 200L);
   }

   @Override
   public bkb<bzv> dM() {
      return (bkb<bzv>)super.dM();
   }

   protected void t() {
      cda $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(cda.k, cda.b));
      cda $$1 = this.bz.g().orElse(null);
      if ($$1 == cda.k && $$0 != cda.k) {
         this.gb();
      }

      this.v(this.bz.a(bsc.o));
   }

   @Override
   protected void V() {
      this.dK().ad().a("zoglinBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dK().B && $$0) {
         this.a(bkh.f).a(0.5);
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
         this.a(aoz.AW, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ga() {
      return this.cc;
   }

   @Override
   protected aoy r() {
      if (this.dK().B) {
         return null;
      } else {
         return this.bz.a(bsc.o) ? aoz.AV : aoz.AU;
      }
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.AY;
   }

   @Override
   protected aoy h_() {
      return aoz.AX;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.AZ, 0.15F, 1.0F);
   }

   protected void gb() {
      this.a(aoz.AV, 1.0F, this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      if (this.i_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
