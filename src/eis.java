import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eis(ekb b, boolean c) implements eia {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekb.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, eis::new)
   );

   public eis(ekb $$0) {
      this($$0, false);
   }

   public ekb a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
