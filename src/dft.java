import com.mojang.serialization.MapCodec;

public class dft extends dgv {
   public static final MapCodec<dft> a = b(dft::new);

   @Override
   public MapCodec<? extends dft> a() {
      return a;
   }

   public dft(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      if (!$$0.B) {
         je $$4 = $$2.a();
         $$0.a(null, $$4, awd.G, awe.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, awd.E, awe.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
