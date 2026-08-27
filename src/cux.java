import com.mojang.serialization.MapCodec;

public class cux extends cvz {
   public static final MapCodec<cux> a = b(cux::new);

   @Override
   public MapCodec<? extends cux> a() {
      return a;
   }

   public cux(dio.d $$0) {
      super($$0);
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      if (!$$0.B) {
         hv $$4 = $$2.a();
         $$0.a(null, $$4, arc.G, ard.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, arc.E, ard.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
