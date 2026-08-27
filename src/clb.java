import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clb(ib<aqq> b, int c, float d) {
   public static final Codec<clb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqq.b.fieldOf("sound_event").forGetter(clb::a), asu.j.fieldOf("use_duration").forGetter(clb::b), asu.k.fieldOf("range").forGetter(clb::c)
            )
            .apply($$0, clb::new)
   );

   public ib<aqq> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
