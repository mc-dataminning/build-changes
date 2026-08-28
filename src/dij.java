import com.mojang.serialization.MapCodec;

public class dij extends diw {
   public static final MapCodec<dij> a = b(dij::new);

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
