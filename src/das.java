import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class das extends crx implements cst {
   public static final MapCodec<das> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(chz.q.fieldOf("color").forGetter(das::b), t()).apply($$0, das::new));
   private final chz b;

   @Override
   public MapCodec<das> a() {
      return a;
   }

   public das(chz $$0, dfc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public chz b() {
      return this.b;
   }
}
