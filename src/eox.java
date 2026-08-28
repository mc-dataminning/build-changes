import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eox {
   public static final epp a = epp.a;
   public static final Codec<eox> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epc.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               epc.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eov.c.lenientOptionalFieldOf("position_predicate", eou.b).forGetter($$0x -> $$0x.e),
               dus.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               epq.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eox::new)
   );
   private final epc c;
   private final epc d;
   private final eov e;
   private final dus f;
   private final epq g;

   public eox(epc $$0, epc $$1, dus $$2) {
      this($$0, $$1, eou.b, $$2);
   }

   public eox(epc $$0, epc $$1, eov $$2, dus $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eox(epc $$0, epc $$1, eov $$2, dus $$3, epq $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dus $$0, dus $$1, jf $$2, jf $$3, jf $$4, azn $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dus a() {
      return this.f;
   }

   @Nullable
   public ug a(azn $$0, @Nullable ug $$1) {
      return this.g.a($$0, $$1);
   }
}
