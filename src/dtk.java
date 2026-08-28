import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk extends dkc {
   public static final MapCodec<dtk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(dtk::b), t()).apply($$0, dtk::new));
   private final cvk d;

   @Override
   public MapCodec<dtk> a() {
      return c;
   }

   protected dtk(cvk $$0, dwu.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cvk b() {
      return this.d;
   }
}
