import com.mojang.serialization.MapCodec;

public class ddd extends cxi implements cvd {
   public static final MapCodec<ddd> c = b(ddd::new);

   @Override
   public MapCodec<ddd> a() {
      return c;
   }

   public ddd(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      a($$0, $$2, new clj(this));
   }
}
