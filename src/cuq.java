import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuq(ajv b, long c) {
   public static final Codec<cuq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajv.a.fieldOf("loot_table").forGetter(cuq::a), awu.a(Codec.LONG, "seed", 0L).forGetter(cuq::b)).apply($$0, cuq::new)
   );

   public ajv a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
