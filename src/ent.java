import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ent(epc b, boolean c) implements enb {
   public static final Codec<ent> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epc.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, ent::new)
   );

   public ent(epc $$0) {
      this($$0, false);
   }

   public epc a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
