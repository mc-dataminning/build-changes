import com.mojang.serialization.MapCodec;

public class daw extends dby {
   public static final MapCodec<daw> a = b(daw::new);

   @Override
   public MapCodec<? extends daw> a() {
      return a;
   }

   public daw(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         $$0.a(null, $$4, aum.G, aun.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aum.E, aun.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
