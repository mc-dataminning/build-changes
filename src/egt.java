import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class egt {
   public static final ehl a = ehl.a;
   public static final Codec<egt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egy.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               egy.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               egr.c.optionalFieldOf("position_predicate", egq.b).forGetter($$0x -> $$0x.e),
               dnb.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ehm.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egt::new)
   );
   private final egy c;
   private final egy d;
   private final egr e;
   private final dnb f;
   private final ehm g;

   public egt(egy $$0, egy $$1, dnb $$2) {
      this($$0, $$1, egq.b, $$2);
   }

   public egt(egy $$0, egy $$1, egr $$2, dnb $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public egt(egy $$0, egy $$1, egr $$2, dnb $$3, ehm $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dnb $$0, dnb $$1, ib $$2, ib $$3, ib $$4, axd $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dnb a() {
      return this.f;
   }

   @Nullable
   public ta a(axd $$0, @Nullable ta $$1) {
      return this.g.a($$0, $$1);
   }
}
