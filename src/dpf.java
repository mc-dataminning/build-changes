import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpf extends dpz implements dhd {
   public static final MapCodec<dpf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cum.q.fieldOf("color").forGetter(dpf::b), t()).apply($$0, dpf::new));
   private final cum c;

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   public dpf(cum $$0, dur.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cum b() {
      return this.c;
   }
}
