import com.mojang.serialization.MapCodec;

public class djb extends dfi implements dmj {
   public static final MapCodec<djb> a = b(djb::new);
   private static final exa b = dfi.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public djb(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(dtb.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(dtb.C);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(dtb.C)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(dtb.C) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return this.o().a(dtb.C, Boolean.valueOf($$1.b(eok.c)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
