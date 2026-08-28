import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends det implements dmi {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final dtb b = dta.F;
   public static final dtb c = dta.C;
   public static final dtb d = dta.G;
   protected static final ewy e = dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jf.a.b);

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
      if ($$0 instanceof aqm $$4) {
         aqn $$5 = dqy.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpr.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if ($$1 instanceof aqm $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpr.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpr.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return e;
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqy($$0, $$1);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eoi.c));
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpi.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return !$$0.B ? det.a($$2, dpr.L, ($$0x, $$1x, $$2x, $$3) -> dxp.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }
}
