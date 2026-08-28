import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxt(akp<erq> b, long c) {
   public static final Codec<cxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akp.a(lu.bc).fieldOf("loot_table").forGetter(cxt::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxt::b)).apply($$0, cxt::new)
   );

   public akp<erq> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
