import com.mojang.serialization.MapCodec;

public class dgd extends dgf {
   public static final MapCodec<dgd> a = b(dgd::new);
   private static final eyx b = dgv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dgd> a() {
      return a;
   }

   protected dgd(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }
}
