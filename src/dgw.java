import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgw extends dhq implements cyw {
   public static final MapCodec<dgw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cog.q.fieldOf("color").forGetter(dgw::b), u()).apply($$0, dgw::new));
   private final cog c;

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   public dgw(cog $$0, dmd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cog b() {
      return this.c;
   }
}
