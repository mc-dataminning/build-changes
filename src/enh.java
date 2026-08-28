import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enh(eoq b, boolean c) implements emp {
   public static final Codec<enh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoq.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, enh::new)
   );

   public enh(eoq $$0) {
      this($$0, false);
   }

   public eoq a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
