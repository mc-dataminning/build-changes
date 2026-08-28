import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtn extends dkf {
   public static final MapCodec<dtn> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(dtn::b), t()).apply($$0, dtn::new));
   private final cvn d;

   @Override
   public MapCodec<dtn> a() {
      return c;
   }

   protected dtn(cvn $$0, dwx.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cvn b() {
      return this.d;
   }
}
