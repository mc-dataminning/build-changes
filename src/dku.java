import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dku extends dmj {
   public static final MapCodec<dku> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axt.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dku::new)
   );
   private final axt b;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(axt $$0, dww.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dwx $$0, dfn $$1, ji $$2) {
      return this.b.a();
   }
}
