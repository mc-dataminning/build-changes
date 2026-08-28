import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyo(ala<esy> b, long c) {
   public static final Codec<cyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ala.a(lv.bc).fieldOf("loot_table").forGetter(cyo::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cyo::b)).apply($$0, cyo::new)
   );

   public ala<esy> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
