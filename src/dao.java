import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dao(aly<ewt> b, long c) {
   public static final Codec<dao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aly.a(mb.bg).fieldOf("loot_table").forGetter(dao::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dao::b)).apply($$0, dao::new)
   );

   public aly<ewt> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
