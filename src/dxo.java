import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxo extends dnv {
   public static final MapCodec<dxo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(dxo::b), t()).apply($$0, dxo::new));
   private final cyw c;

   @Override
   public MapCodec<dxo> a() {
      return b;
   }

   protected dxo(cyw $$0, ebd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cyw b() {
      return this.c;
   }
}
