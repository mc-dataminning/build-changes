import com.mojang.serialization.MapCodec;

public class dbf extends dch {
   public static final MapCodec<dbf> a = b(dbf::new);

   @Override
   public MapCodec<? extends dbf> a() {
      return a;
   }

   public dbf(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      if (!$$0.B) {
         id $$4 = $$2.a();
         $$0.a(null, $$4, auo.G, aup.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, auo.E, aup.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
