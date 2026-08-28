import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efq extends efn {
   public static final Codec<efq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efn.d.forGetter($$0x -> $$0x),
               bsb.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bsb.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bsb.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, efq::new)
   );
   public final bsb b;
   public final bsb c;
   final bsb j;

   public efq(float $$0, emq $$1, bsb $$2, eei $$3, efo $$4, jv<dke> $$5, bsb $$6, bsb $$7, bsb $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public efq(float $$0, emq $$1, bsb $$2, eei $$3, jv<dke> $$4, bsb $$5, bsb $$6, bsb $$7) {
      this($$0, $$1, $$2, $$3, efo.a, $$4, $$5, $$6, $$7);
   }

   public efq(efn $$0, bsb $$1, bsb $$2, bsb $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
