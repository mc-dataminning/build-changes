import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ckb(ib<aqc> b, int c, float d) {
   public static final Codec<ckb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqc.b.fieldOf("sound_event").forGetter(ckb::a), asg.j.fieldOf("use_duration").forGetter(ckb::b), asg.k.fieldOf("range").forGetter(ckb::c)
            )
            .apply($$0, ckb::new)
   );

   public ib<aqc> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
