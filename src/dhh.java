import com.mojang.serialization.MapCodec;

public class dhh extends dhu {
   public static final MapCodec<dhh> a = b(dhh::new);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(dra.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(aE, $$0.g().g());
   }
}
