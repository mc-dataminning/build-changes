import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daf(akt<ewt> b, long c) {
   public static final Codec<daf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a(mc.bi).fieldOf("loot_table").forGetter(daf::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(daf::b)).apply($$0, daf::new)
   );

   public akt<ewt> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
