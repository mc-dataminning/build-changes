import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwr(akl<epk> b, long c) {
   public static final Codec<cwr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akl.a(lf.aU).fieldOf("loot_table").forGetter(cwr::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cwr::b)).apply($$0, cwr::new)
   );

   public akl<epk> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
