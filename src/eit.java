import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eit(ekc b, boolean c) implements eib {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekc.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, eit::new)
   );

   public eit(ekc $$0) {
      this($$0, false);
   }

   public ekc a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
