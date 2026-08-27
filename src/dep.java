import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dep extends das<dna> implements diy {
   public static final MapCodec<dep> b = b(dep::new);
   public static final dpt c = dft.aE;
   public static final dpq d = dpp.C;
   protected static final est e = dby.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wg f = wg.c("container.enderchest");

   @Override
   public MapCodec<dep> a() {
      return b;
   }

   protected dep(doy.d $$0) {
      super($$0, () -> dmh.d);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public def.c<? extends dmm> a(doz $$0, cyx $$1, ib $$2, boolean $$3) {
      return def.b::b;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return e;
   }

   @Override
   protected did b_(doz $$0) {
      return did.b;
   }

   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ekt.c));
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      cob $$5 = $$3.gm();
      dmf $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dna) {
         ib $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return boa.a($$1.B);
         } else if ($$1.B) {
            return boa.a;
         } else {
            dna $$8 = (dna)$$6;
            $$5.a($$8);
            $$3.a(new bok(($$1x, $$2x, $$3x) -> cmw.a($$1x, $$2x, $$5), f));
            $$3.a(auw.aj);
            cik.a($$3, true);
            return boa.b;
         }
      } else {
         return boa.a($$1.B);
      }
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dna($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? a($$2, dmh.d, dna::a) : null;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kl.aa, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(d) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      dmf $$4 = $$1.c_($$2);
      if ($$4 instanceof dna) {
         ((dna)$$4).b();
      }
   }
}
