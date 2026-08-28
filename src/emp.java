import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emp(eny b, boolean c) implements elx {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eny.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, emp::new)
   );

   public emp(eny $$0) {
      this($$0, false);
   }

   public eny a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
