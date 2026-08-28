import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dag(alo<ewn> b, long c) {
   public static final Codec<dag> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alo.a(mb.bg).fieldOf("loot_table").forGetter(dag::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dag::b)).apply($$0, dag::new)
   );

   public alo<ewn> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
