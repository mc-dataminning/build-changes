import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dho extends ddr<dqa> implements dly {
   public static final MapCodec<dho> b = b(dho::new);
   public static final dsu c = dit.aE;
   public static final dsr d = dsq.C;
   protected static final ewi e = dex.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xo f = xo.c("container.enderchest");

   @Override
   public MapCodec<dho> a() {
      return b;
   }

   protected dho(drz.d $$0) {
      super($$0, () -> dph.d);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhe.c<? extends dpm> a(dsa $$0, dbw $$1, iz $$2, boolean $$3) {
      return dhe.b::b;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return e;
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.b;
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == enu.c));
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      cre $$5 = $$3.gp();
      dpf $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqa) {
         iz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqs.a($$1.B);
         } else if ($$1.B) {
            return bqs.a;
         } else {
            dqa $$8 = (dqa)$$6;
            $$5.a($$8);
            $$3.a(new brc(($$1x, $$2x, $$3x) -> cpz.a($$1x, $$2x, $$5), f));
            $$3.a(awj.aj);
            clm.a($$3, true);
            return bqs.c;
         }
      } else {
         return bqs.a($$1.B);
      }
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? a($$2, dph.d, dqa::a) : null;
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(li.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(d) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      dpf $$4 = $$1.c_($$2);
      if ($$4 instanceof dqa) {
         ((dqa)$$4).b();
      }
   }
}
