import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emi(enr b, boolean c) implements elq {
   public static final Codec<emi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enr.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, emi::new)
   );

   public emi(enr $$0) {
      this($$0, false);
   }

   public enr a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
