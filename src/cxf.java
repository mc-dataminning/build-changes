import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxf(akj<erb> b, long c) {
   public static final Codec<cxf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter(cxf::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxf::b)).apply($$0, cxf::new)
   );

   public akj<erb> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
