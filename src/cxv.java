import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxv(akq<eru> b, long c) {
   public static final Codec<cxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akq.a(lu.bc).fieldOf("loot_table").forGetter(cxv::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxv::b)).apply($$0, cxv::new)
   );

   public akq<eru> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
