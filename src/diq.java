import com.mojang.serialization.MapCodec;

public class diq extends dex implements dly {
   public static final MapCodec<diq> a = b(diq::new);
   private static final ewi b = dex.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public diq(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(dsq.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(dsq.C);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(dsq.C)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(dsq.C) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return this.o().a(dsq.C, Boolean.valueOf($$1.b(enu.c)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
