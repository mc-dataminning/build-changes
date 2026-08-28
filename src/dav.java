import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dav(alc<exq> b, long c) {
   public static final Codec<dav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a(me.bn).fieldOf("loot_table").forGetter(dav::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dav::b)).apply($$0, dav::new)
   );

   public alc<exq> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
