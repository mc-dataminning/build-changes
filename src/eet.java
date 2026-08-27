import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eet {
   public static final efl a = efl.a;
   public static final Codec<eet> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eey.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eey.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eer.c.optionalFieldOf("position_predicate", eeq.b).forGetter($$0x -> $$0x.e),
               dlf.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               efm.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eet::new)
   );
   private final eey c;
   private final eey d;
   private final eer e;
   private final dlf f;
   private final efm g;

   public eet(eey $$0, eey $$1, dlf $$2) {
      this($$0, $$1, eeq.b, $$2);
   }

   public eet(eey $$0, eey $$1, eer $$2, dlf $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eet(eey $$0, eey $$1, eer $$2, dlf $$3, efm $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dlf $$0, dlf $$1, hz $$2, hz $$3, hz $$4, awo $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dlf a() {
      return this.f;
   }

   @Nullable
   public sw a(awo $$0, @Nullable sw $$1) {
      return this.g.a($$0, $$1);
   }
}
