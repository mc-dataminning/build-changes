import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eni {
   public static final eoa a = eoa.a;
   public static final Codec<eni> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enn.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               enn.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eng.c.optionalFieldOf("position_predicate", enf.b).forGetter($$0x -> $$0x.e),
               dtc.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eob.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eni::new)
   );
   private final enn c;
   private final enn d;
   private final eng e;
   private final dtc f;
   private final eob g;

   public eni(enn $$0, enn $$1, dtc $$2) {
      this($$0, $$1, enf.b, $$2);
   }

   public eni(enn $$0, enn $$1, eng $$2, dtc $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eni(enn $$0, enn $$1, eng $$2, dtc $$3, eob $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dtc $$0, dtc $$1, ir $$2, ir $$3, ir $$4, ayt $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dtc a() {
      return this.f;
   }

   @Nullable
   public uk a(ayt $$0, @Nullable uk $$1) {
      return this.g.a($$0, $$1);
   }
}
