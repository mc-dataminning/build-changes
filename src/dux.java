import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dux extends dlm {
   public static final MapCodec<dux> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(dux::b), t()).apply($$0, dux::new));
   private final cwv c;

   @Override
   public MapCodec<dux> a() {
      return b;
   }

   protected dux(cwv $$0, dyl.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cwv b() {
      return this.c;
   }
}
