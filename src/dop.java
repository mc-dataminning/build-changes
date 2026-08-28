import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dkw implements dgm {
   public static final MapCodec<dop> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cue.q.fieldOf("color").forGetter(dop::b), u()).apply($$0, dop::new));
   private final cue k;

   @Override
   public MapCodec<dop> a() {
      return j;
   }

   public dop(cue $$0, dtz.d $$1) {
      super($$1);
      this.k = $$0;
      this.l(
         this.E
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cue b() {
      return this.k;
   }
}
