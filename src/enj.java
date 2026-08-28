import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enj(eos b, boolean c) implements emr {
   public static final Codec<enj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eos.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, enj::new)
   );

   public enj(eos $$0) {
      this($$0, false);
   }

   public eos a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
