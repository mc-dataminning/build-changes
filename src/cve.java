import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cve(akf b, long c) {
   public static final Codec<cve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akf.a.fieldOf("loot_table").forGetter(cve::a), axe.a(Codec.LONG, "seed", 0L).forGetter(cve::b)).apply($$0, cve::new)
   );

   public akf a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
