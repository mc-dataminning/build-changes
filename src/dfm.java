import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfm extends deu {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final dtc[] b = new dtc[]{dtb.k, dtb.l, dtb.m};
   protected static final exa c = ewx.a(dfi.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dfi.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? null : a($$2, dps.l, dpt::a);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dpt) {
            $$3.a((dpt)$$5);
            $$3.a(avr.aa);
         }

         return bqh.c;
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      bqd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
