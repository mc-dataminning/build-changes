import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ema(enj b, boolean c) implements eli {
   public static final Codec<ema> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enj.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, ema::new)
   );

   public ema(enj $$0) {
      this($$0, false);
   }

   public enj a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
