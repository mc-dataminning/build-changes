import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elp(emy b, boolean c) implements ekx {
   public static final Codec<elp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emy.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, elp::new)
   );

   public elp(emy $$0) {
      this($$0, false);
   }

   public emy a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
