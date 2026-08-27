import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxh extends cyv {
   public static final MapCodec<cxh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ass.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cxh::new)
   );
   private final ass b;

   @Override
   public MapCodec<cxh> a() {
      return a;
   }

   public cxh(ass $$0, dio.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2) {
      return this.b.a();
   }
}
