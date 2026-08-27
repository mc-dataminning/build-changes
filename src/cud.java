import com.mojang.serialization.MapCodec;

public class cud extends cvf {
   public static final MapCodec<cud> a = b(cud::new);

   @Override
   public MapCodec<? extends cud> a() {
      return a;
   }

   public cud(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         $$0.a(null, $$4, aqv.G, aqw.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aqv.E, aqw.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
