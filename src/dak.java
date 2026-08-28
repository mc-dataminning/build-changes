import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dak(aly<ewm> b, long c) {
   public static final Codec<dak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aly.a(mb.bf).fieldOf("loot_table").forGetter(dak::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dak::b)).apply($$0, dak::new)
   );

   public aly<ewm> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
