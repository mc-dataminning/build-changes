import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eee extends eej {
   private final jv<djl> e;
   public static final MapCodec<eee> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eee::new)
   );

   public eee(km $$0, jv<djl> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dww $$0) {
      return $$0.a(this.e);
   }

   @Override
   public edz<?> a() {
      return edz.a;
   }
}
