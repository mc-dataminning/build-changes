import com.mojang.serialization.MapCodec;

public class deg extends dfi {
   public static final MapCodec<deg> a = b(deg::new);

   @Override
   public MapCodec<? extends deg> a() {
      return a;
   }

   public deg(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         $$0.a(null, $$4, avh.G, avi.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avh.E, avi.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
