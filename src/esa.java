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
               dxq.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               est.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, esa::new)
   );
   private final esf c;
   private final esf d;
   private final ery e;
   private final dxq f;
   private final est g;

   public esa(esf $$0, esf $$1, dxq $$2) {
      this($$0, $$1, erx.b, $$2);
   }

   public esa(esf $$0, esf $$1, ery $$2, dxq $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public esa(esf $$0, esf $$1, ery $$2, dxq $$3, est $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dxq $$0, dxq $$1, ji $$2, ji $$3, ji $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dxq a() {
      return this.f;
   }

   @Nullable
   public tq a(azh $$0, @Nullable tq $$1) {
      return this.g.a($$0, $$1);
   }
}
