import com.mojang.serialization.MapCodec;

public class dcy extends dea {
   public static final MapCodec<dcy> a = b(dcy::new);

   @Override
   public MapCodec<? extends dcy> a() {
      return a;
   }

   public dcy(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      if (!$$0.B) {
         io $$4 = $$2.a();
         $$0.a(null, $$4, avi.G, avj.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avi.E, avj.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
