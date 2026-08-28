import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxq(ald<eql> b, long c) {
   public static final Codec<cxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(lq.aU).fieldOf("loot_table").forGetter(cxq::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxq::b)).apply($$0, cxq::new)
   );

   public ald<eql> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
