import com.mojang.serialization.MapCodec;

public class dnf extends dnj {
   public static final MapCodec<dnf> a = b(dnf::new);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(drz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return false;
   }

   @Override
   protected int g(dsa $$0, dbc $$1, iz $$2) {
      return $$1.Q();
   }
}
