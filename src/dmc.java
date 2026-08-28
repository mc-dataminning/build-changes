import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends deu implements dmj {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final dtc b = dtb.F;
   public static final dtc c = dtb.C;
   public static final dtc d = dtb.G;
   protected static final exa e = dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jf.a.b);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
      if ($$0 instanceof aqm $$4) {
         aqn $$5 = dqz.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dps.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if ($$1 instanceof aqm $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dps.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dps.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return e;
   }

   @Override
   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqz($$0, $$1);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eok.c));
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpj.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return !$$0.B ? deu.a($$2, dps.L, ($$0x, $$1x, $$2x, $$3) -> dxq.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
