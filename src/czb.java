import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czb(alh<euh> b, long c) {
   public static final Codec<czb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alh.a(lz.bd).fieldOf("loot_table").forGetter(czb::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czb::b)).apply($$0, czb::new)
   );

   public alh<euh> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
