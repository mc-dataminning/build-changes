import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiu(ekd b, boolean c) implements eic {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekd.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, eiu::new)
   );

   public eiu(ekd $$0) {
      this($$0, false);
   }

   public ekd a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
