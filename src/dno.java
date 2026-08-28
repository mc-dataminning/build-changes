import com.mojang.serialization.MapCodec;

public class dno extends diq {
   public static final MapCodec<dno> a = b(dno::new);
   protected static final fas b = diq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return fap.b();
   }

   @Override
   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.b();
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected float c(dvv $$0, der $$1, jh $$2) {
      return 0.2F;
   }
}
