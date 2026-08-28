import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czq(aku<evx> b, long c) {
   public static final Codec<czq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a(mc.bg).fieldOf("loot_table").forGetter(czq::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czq::b)).apply($$0, czq::new)
   );

   public aku<evx> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
