import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class bzs extends bza implements bys, bzy {
   private static final adz<Boolean> d = aec.a(bzs.class, aeb.k);
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
   protected static final ImmutableList<? extends bte<? extends btd<? super bzs>>> b = ImmutableList.of(bte.c, bte.d);
   protected static final ImmutableList<? extends brz<?>> c = ImmutableList.of(brz.g, brz.h, brz.k, brz.l, brz.n, brz.m, brz.E, brz.t, brz.o, brz.p);

   public bzs(bim<? extends bzs> $$0, cpl $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bjy.b<bzs> dN() {
      return bjy.a(c, b);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      bjy<bzs> $$1 = this.dN().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ccx.a));
      $$1.b(ccx.b);
      $$1.f();
      return $$1;
   }

   private static void a(bjy<bzs> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new blu(45, 90), new bly()));
   }

   private static void b(bjy<bzs> $$0) {
      $$0.a(
         ccx.b,
         10,
         ImmutableList.of(
            bna.a(bzs::gc),
            bmo.a(8.0F, bgb.a(30, 60)),
            new bml(ImmutableList.of(Pair.of(bmg.a(0.4F), 2), Pair.of(bmv.a(0.4F, 3), 2), Pair.of(new bkz(30, 60), 1)))
         )
      );
   }

   private static void c(bjy<bzs> $$0) {
      $$0.a(ccx.k, 10, ImmutableList.of(bmt.a(1.0F), bob.a(bzs::q, blv.a(40)), bob.a(bzs::i_, blv.a(15)), bnd.a()), brz.o);
   }

   private Optional<? extends biy> gc() {
      return this.dM().c(brz.h).orElse(bsb.a()).a(this::j);
   }

   private boolean j(biy $$0) {
      bim<?> $$1 = $$0.ag();
      return $$1 != bim.bo && $$1 != bim.u && btd.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.e_();
      }
   }

   public static bkd.a p() {
      return bza.gg().a(bke.a, 40.0).a(bke.d, 0.3F).a(bke.c, 0.6F).a(bke.g, 1.0).a(bke.f, 6.0);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   public boolean C(bii $$0) {
      if (!($$0 instanceof biy)) {
         return false;
      } else {
         this.cc = 10;
         this.dK().a(this, (byte)4);
         this.a(aow.AW, 1.0F, this.eV());
         return bzy.a(this, (biy)$$0);
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return !this.fO();
   }

   @Override
   protected void e(biy $$0) {
      if (!this.i_()) {
         bzy.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof biy) {
         biy $$3 = (biy)$$0.d();
         if (this.c($$3) && !bkr.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(biy $$0) {
      this.bz.b(brz.E);
      this.bz.a(brz.o, $$0, 200L);
   }

   @Override
   public bjy<bzs> dM() {
      return (bjy<bzs>)super.dM();
   }

   protected void t() {
      ccx $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(ccx.k, ccx.b));
      ccx $$1 = this.bz.g().orElse(null);
      if ($$1 == ccx.k && $$0 != ccx.k) {
         this.gb();
      }

      this.v(this.bz.a(brz.o));
   }

   @Override
   protected void V() {
      this.dK().ad().a("zoglinBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dK().B && $$0) {
         this.a(bke.f).a(0.5);
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
         this.a(aow.AW, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ga() {
      return this.cc;
   }

   @Override
   protected aov r() {
      if (this.dK().B) {
         return null;
      } else {
         return this.bz.a(brz.o) ? aow.AV : aow.AU;
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.AY;
   }

   @Override
   protected aov h_() {
      return aow.AX;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.AZ, 0.15F, 1.0F);
   }

   protected void gb() {
      this.a(aow.AV, 1.0F, this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.i_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
