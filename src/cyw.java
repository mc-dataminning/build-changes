import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyw(ald<etq> b, long c) {
   public static final Codec<cyw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(lw.be).fieldOf("loot_table").forGetter(cyw::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cyw::b)).apply($$0, cyw::new)
   );

   public ald<etq> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
