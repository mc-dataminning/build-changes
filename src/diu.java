import com.mojang.serialization.MapCodec;

public class diu extends dfb implements dmc {
   public static final MapCodec<diu> a = b(diu::new);
   private static final ewm b = dfb.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public diu(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(dsu.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(dsu.C);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(dsu.C)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(dsu.C) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return this.o().a(dsu.C, Boolean.valueOf($$1.b(eny.c)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
