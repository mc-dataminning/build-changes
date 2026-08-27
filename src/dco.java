import com.mojang.serialization.MapCodec;

public class dco extends dda {
   public static final MapCodec<dco> a = b(dco::new);

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   public dco(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
