import com.mojang.serialization.MapCodec;

public class dmh extends dex {
   public static final MapCodec<dmh> b = b(dmh::new);
   public static final dsr c = dsq.z;

   @Override
   protected MapCodec<? extends dmh> a() {
      return b;
   }

   protected dmh(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsa $$0) {
      return $$0.a(awo.bz);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }
}
