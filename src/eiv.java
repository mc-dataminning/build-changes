import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiv(eke b, boolean c) implements eid {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eke.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, eiv::new)
   );

   public eiv(eke $$0) {
      this($$0, false);
   }

   public eke a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
