import com.mojang.serialization.MapCodec;

public class dcw extends ddy {
   public static final MapCodec<dcw> a = b(dcw::new);

   @Override
   public MapCodec<? extends dcw> a() {
      return a;
   }

   public dcw(dra.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      if (!$$0.B) {
         io $$4 = $$2.a();
         $$0.a(null, $$4, avh.G, avi.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avh.E, avi.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
