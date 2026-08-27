import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmp(ih<arq> b, int c, float d) {
   public static final Codec<cmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arq.b.fieldOf("sound_event").forGetter(cmp::a), atv.j.fieldOf("use_duration").forGetter(cmp::b), atv.k.fieldOf("range").forGetter(cmp::c)
            )
            .apply($$0, cmp::new)
   );

   public ih<arq> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
