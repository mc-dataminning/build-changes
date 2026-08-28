import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emu(eod b, boolean c) implements emc {
   public static final Codec<emu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eod.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, emu::new)
   );

   public emu(eod $$0) {
      this($$0, false);
   }

   public eod a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
