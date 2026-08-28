import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxr(ald<eqm> b, long c) {
   public static final Codec<cxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(lq.aU).fieldOf("loot_table").forGetter(cxr::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxr::b)).apply($$0, cxr::new)
   );

   public ald<eqm> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
