import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxe(akj<eqz> b, long c) {
   public static final Codec<cxe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter(cxe::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxe::b)).apply($$0, cxe::new)
   );

   public akj<eqz> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
