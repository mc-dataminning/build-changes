import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eai extends ean {
   private final jq<dfw> e;
   public static final MapCodec<eai> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kb.a(lu.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eai::new)
   );

   public eai(kh $$0, jq<dfw> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dta $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ead<?> a() {
      return ead.a;
   }
}
