import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diz extends czw {
   public static final MapCodec<diz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cog.q.fieldOf("color").forGetter(diz::b), u()).apply($$0, diz::new));
   private final cog d;

   @Override
   public MapCodec<diz> a() {
      return c;
   }

   protected diz(cog $$0, dmd.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cog b() {
      return this.d;
   }
}
