import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxn(ala<eqi> b, long c) {
   public static final Codec<cxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ala.a(lq.aU).fieldOf("loot_table").forGetter(cxn::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(cxn::b)).apply($$0, cxn::new)
   );

   public ala<eqi> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
