import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class esa {
   public static final ess a = ess.a;
   public static final Codec<esa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               esf.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               esf.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ery.c.lenientOptionalFieldOf("position_predicate", erx.b).forGetter($$0x -> $$0x.e),
               dxu.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               est.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, esa::new)
   );
   private final esf c;
   private final esf d;
   private final ery e;
   private final dxu f;
   private final est g;

   public esa(esf $$0, esf $$1, dxu $$2) {
      this($$0, $$1, erx.b, $$2);
   }

   public esa(esf $$0, esf $$1, ery $$2, dxu $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public esa(esf $$0, esf $$1, ery $$2, dxu $$3, est $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dxu $$0, dxu $$1, jh $$2, jh $$3, jh $$4, bam $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dxu a() {
      return this.f;
   }

   @Nullable
   public ux a(bam $$0, @Nullable ux $$1) {
      return this.g.a($$0, $$1);
   }
}
