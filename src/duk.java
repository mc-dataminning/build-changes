import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk extends dle {
   public static final MapCodec<duk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.q.fieldOf("color").forGetter(duk::b), t()).apply($$0, duk::new));
   private final cwm d;

   @Override
   public MapCodec<duk> a() {
      return c;
   }

   protected duk(cwm $$0, dxu.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cwm b() {
      return this.d;
   }
}
