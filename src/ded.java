import com.mojang.serialization.MapCodec;

public class ded extends dff {
   public static final MapCodec<ded> a = b(ded::new);

   @Override
   public MapCodec<? extends ded> a() {
      return a;
   }

   public ded(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         $$0.a(null, $$4, avf.G, avg.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avf.E, avg.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
