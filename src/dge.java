import com.mojang.serialization.MapCodec;

public class dge extends dgf {
   public static final MapCodec<dge> a = b(dge::new);
   protected static final float b = 6.0F;
   protected static final eyx c = dgv.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   protected dge(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }
}
