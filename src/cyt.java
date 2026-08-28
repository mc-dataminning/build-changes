import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyt(alb<etm> b, long c) {
   public static final Codec<cyt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a(lv.bd).fieldOf("loot_table").forGetter(cyt::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cyt::b)).apply($$0, cyt::new)
   );

   public alb<etm> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
