import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dew extends cvw {
   public static final MapCodec<dew> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckc.q.fieldOf("color").forGetter(dew::b), u()).apply($$0, dew::new));
   private final ckc d;

   @Override
   public MapCodec<dew> a() {
      return c;
   }

   protected dew(ckc $$0, dhm.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ckc b() {
      return this.d;
   }
}
