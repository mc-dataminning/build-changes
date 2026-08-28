import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czm(ali<eus> b, long c) {
   public static final Codec<czm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ali.a(ma.bd).fieldOf("loot_table").forGetter(czm::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czm::b)).apply($$0, czm::new)
   );

   public ali<eus> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
