import com.mojang.serialization.MapCodec;

public class dos extends dju {
   public static final MapCodec<dos> a = b(dos::new);
   protected static final fbs b = djk.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(awo.aO) || $$0.a(djm.ek) || super.b($$0, $$1, $$2);
   }
}
