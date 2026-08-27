import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxt(aks<eru> b, long c) {
   public static final Codec<cxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aks.a(li.aU).fieldOf("loot_table").forGetter(cxt::a), axu.a(Codec.LONG, "seed", 0L).forGetter(cxt::b)).apply($$0, cxt::new)
   );

   public aks<eru> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
