import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ema extends elk {
   public static final Codec<ema> a = RecordCodecBuilder.create($$0 -> a($$0).and(tw.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ema::new));
   private final sy b;

   private ema(List<emx> $$0, sy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public elm b() {
      return eln.g;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      $$0.x().a(this.b);
      return $$0;
   }

   @Deprecated
   public static elk.a<?> a(sy $$0) {
      return a($$1 -> new ema($$1, $$0));
   }
}
