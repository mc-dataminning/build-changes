import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxu(ale<eqp> b, long c) {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter(cxu::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxu::b)).apply($$0, cxu::new)
   );

   public ale<eqp> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
