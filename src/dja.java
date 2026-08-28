import com.mojang.serialization.MapCodec;

public class dja extends dfh implements dmi {
   public static final MapCodec<dja> a = b(dja::new);
   private static final ewy b = dfh.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dja(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(dta.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(dta.C);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(dta.C)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(dta.C) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return this.o().a(dta.C, Boolean.valueOf($$1.b(eoi.c)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
