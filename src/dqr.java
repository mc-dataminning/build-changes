import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqr extends dhm implements cun {
   public static final MapCodec<dqr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cue.q.fieldOf("color").forGetter(dqr::b), u()).apply($$0, dqr::new));
   private final cue d;

   @Override
   public MapCodec<dqr> a() {
      return c;
   }

   protected dqr(cue $$0, dtz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cue b() {
      return this.d;
   }

   @Override
   public btr m() {
      return btr.g;
   }

   @Override
   public jn<awc> n() {
      return awd.oh;
   }
}
