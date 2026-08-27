import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clz(ie<arb> b, int c, float d) {
   public static final Codec<clz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.b.fieldOf("sound_event").forGetter(clz::a), atg.j.fieldOf("use_duration").forGetter(clz::b), atg.k.fieldOf("range").forGetter(clz::c)
            )
            .apply($$0, clz::new)
   );

   public ie<arb> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
