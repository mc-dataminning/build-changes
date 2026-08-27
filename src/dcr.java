import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcr extends cyu<dlb> implements dha {
   public static final MapCodec<dcr> b = b(dcr::new);
   public static final dnt c = ddv.aE;
   public static final dnq d = dnp.C;
   protected static final eqk e = daa.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vu f = vu.c("container.enderchest");

   @Override
   public MapCodec<dcr> a() {
      return b;
   }

   protected dcr(dmy.d $$0) {
      super($$0, () -> dki.d);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dch.c<? extends dkn> a(dmz $$0, cwz $$1, ib $$2, boolean $$3) {
      return dch.b::b;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return e;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.b;
   }

   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eio.c));
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      cna $$5 = $$3.gm();
      dkg $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dlb) {
         ib $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bnc.a($$1.B);
         } else if ($$1.B) {
            return bnc.a;
         } else {
            dlb $$8 = (dlb)$$6;
            $$5.a($$8);
            $$3.a(new bnm(($$1x, $$2x, $$3x) -> clv.a($$1x, $$2x, $$5), f));
            $$3.a(aui.aj);
            chj.a($$3, true);
            return bnc.b;
         }
      } else {
         return bnc.a($$1.B);
      }
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? a($$2, dki.d, dlb::a) : null;
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kc.aa, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(d) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      dkg $$4 = $$1.c_($$2);
      if ($$4 instanceof dlb) {
         ((dlb)$$4).b();
      }
   }
}
