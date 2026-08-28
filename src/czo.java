import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czo(aku<evv> b, long c) {
   public static final Codec<czo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a(mc.bg).fieldOf("loot_table").forGetter(czo::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czo::b)).apply($$0, czo::new)
   );

   public aku<evv> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
