import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends dpi implements dgm {
   public static final MapCodec<doo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cue.q.fieldOf("color").forGetter(doo::b), u()).apply($$0, doo::new));
   private final cue c;

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(cue $$0, dtz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cue b() {
      return this.c;
   }
}
