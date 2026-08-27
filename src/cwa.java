import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwa(akg<eoq> b, long c) {
   public static final Codec<cwa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akg.a(le.aU).fieldOf("loot_table").forGetter(cwa::a), axh.a(Codec.LONG, "seed", 0L).forGetter(cwa::b)).apply($$0, cwa::new)
   );

   public akg<eoq> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
