import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvg extends dwf implements dmv {
   public static final MapCodec<dvg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(dvg::b), t()).apply($$0, dvg::new));
   private final cyy c;

   @Override
   public MapCodec<dvg> a() {
      return a;
   }

   public dvg(cyy $$0, ebf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cyy b() {
      return this.c;
   }
}
