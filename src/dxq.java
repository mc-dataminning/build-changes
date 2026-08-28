import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxq extends dnx {
   public static final MapCodec<dxq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(dxq::b), t()).apply($$0, dxq::new));
   private final cyy c;

   @Override
   public MapCodec<dxq> a() {
      return b;
   }

   protected dxq(cyy $$0, ebf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cyy b() {
      return this.c;
   }
}
