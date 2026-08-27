import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuh(ajt b, long c) {
   public static final Codec<cuh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajt.a.fieldOf("loot_table").forGetter(cuh::a), aws.a(Codec.LONG, "seed", 0L).forGetter(cuh::b)).apply($$0, cuh::new)
   );

   public ajt a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
