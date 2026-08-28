import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejq(ekz b, boolean c) implements eiy {
   public static final Codec<ejq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekz.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, ejq::new)
   );

   public ejq(ekz $$0) {
      this($$0, false);
   }

   public ekz a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
