import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekn(elw b, boolean c) implements ejv {
   public static final Codec<ekn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elw.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, ekn::new)
   );

   public ekn(elw $$0) {
      this($$0, false);
   }

   public elw a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
