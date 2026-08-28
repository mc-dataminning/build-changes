import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eal extends eaq {
   private final jq<dfy> e;
   public static final MapCodec<eal> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kb.a(lu.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eal::new)
   );

   public eal(kh $$0, jq<dfy> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eag<?> a() {
      return eag.a;
   }
}
