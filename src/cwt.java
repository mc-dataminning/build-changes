import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwt(akm<epm> b, long c) {
   public static final Codec<cwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akm.a(lf.aU).fieldOf("loot_table").forGetter(cwt::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cwt::b)).apply($$0, cwt::new)
   );

   public akm<epm> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
