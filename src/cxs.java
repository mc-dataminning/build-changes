import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxs(ale<eqn> b, long c) {
   public static final Codec<cxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter(cxs::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxs::b)).apply($$0, cxs::new)
   );

   public ale<eqn> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
