import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyv(alg<eub> b, long c) {
   public static final Codec<cyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a(ly.bd).fieldOf("loot_table").forGetter(cyv::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cyv::b)).apply($$0, cyv::new)
   );

   public alg<eub> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
