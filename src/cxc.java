import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxc(akj<eqt> b, long c) {
   public static final Codec<cxc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter(cxc::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxc::b)).apply($$0, cxc::new)
   );

   public akj<eqt> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
