import com.mojang.serialization.MapCodec;

public class dnu extends diz {
   public static final MapCodec<dnu> a = b(dnu::new);
   protected static final fas b = diq.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(axc.aN) || $$0.a(dis.dX) || super.b($$0, $$1, $$2);
   }
}
