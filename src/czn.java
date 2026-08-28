import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czn(akt<evu> b, long c) {
   public static final Codec<czn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a(mc.bg).fieldOf("loot_table").forGetter(czn::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(czn::b)).apply($$0, czn::new)
   );

   public akt<evu> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
