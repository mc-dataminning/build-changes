import com.mojang.serialization.MapCodec;

public class cza extends dac {
   public static final MapCodec<cza> a = b(cza::new);

   @Override
   public MapCodec<? extends cza> a() {
      return a;
   }

   public cza(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         $$0.a(null, $$4, aty.G, atz.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aty.E, atz.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
