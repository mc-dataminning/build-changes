import com.mojang.serialization.MapCodec;

public class djh extends dju {
   public static final MapCodec<djh> a = b(djh::new);

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
