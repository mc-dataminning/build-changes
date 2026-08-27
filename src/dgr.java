import com.mojang.serialization.MapCodec;

public class dgr extends daw implements cyr {
   public static final MapCodec<dgr> c = b(dgr::new);

   @Override
   public MapCodec<dgr> a() {
      return c;
   }

   public dgr(dle.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      a($$0, $$2, new coz(this));
   }
}
