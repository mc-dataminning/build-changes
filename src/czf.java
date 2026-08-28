import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czf(alk<eul> b, long c) {
   public static final Codec<czf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alk.a(ma.bd).fieldOf("loot_table").forGetter(czf::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czf::b)).apply($$0, czf::new)
   );

   public alk<eul> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
