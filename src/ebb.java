import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ebb {
   public static final ebt a = ebt.a;
   public static final Codec<ebb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebg.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ebg.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eaz.c.optionalFieldOf("position_predicate", eay.b).forGetter($$0x -> $$0x.e),
               dhn.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ebu.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebb::new)
   );
   private final ebg c;
   private final ebg d;
   private final eaz e;
   private final dhn f;
   private final ebu g;

   public ebb(ebg $$0, ebg $$1, dhn $$2) {
      this($$0, $$1, eay.b, $$2);
   }

   public ebb(ebg $$0, ebg $$1, eaz $$2, dhn $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ebb(ebg $$0, ebg $$1, eaz $$2, dhn $$3, ebu $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dhn $$0, dhn $$1, hx $$2, hx $$3, hx $$4, atw $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dhn a() {
      return this.f;
   }

   @Nullable
   public sd a(atw $$0, @Nullable sd $$1) {
      return this.g.a($$0, $$1);
   }
}
