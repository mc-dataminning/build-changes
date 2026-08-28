import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duc extends dkw {
   public static final MapCodec<duc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.q.fieldOf("color").forGetter(duc::b), t()).apply($$0, duc::new));
   private final cwh d;

   @Override
   public MapCodec<duc> a() {
      return c;
   }

   protected duc(cwh $$0, dxm.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cwh b() {
      return this.d;
   }
}
