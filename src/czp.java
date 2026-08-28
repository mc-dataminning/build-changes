import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czp(aku<evw> b, long c) {
   public static final Codec<czp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a(mc.bg).fieldOf("loot_table").forGetter(czp::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czp::b)).apply($$0, czp::new)
   );

   public aku<evw> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
