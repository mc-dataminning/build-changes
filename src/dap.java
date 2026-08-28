import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dap(aly<ewu> b, long c) {
   public static final Codec<dap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aly.a(mb.bg).fieldOf("loot_table").forGetter(dap::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dap::b)).apply($$0, dap::new)
   );

   public aly<ewu> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
