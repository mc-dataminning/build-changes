import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmj extends dmg {
   public static final Codec<dmj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmg.d.forGetter($$0x -> $$0x),
               bft.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bft.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bft.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmj::new)
   );
   public final bft b;
   public final bft c;
   final bft j;

   public dmj(float $$0, dtf $$1, bft $$2, dlc $$3, dmh $$4, hi<csl> $$5, bft $$6, bft $$7, bft $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmj(float $$0, dtf $$1, bft $$2, dlc $$3, hi<csl> $$4, bft $$5, bft $$6, bft $$7) {
      this($$0, $$1, $$2, $$3, dmh.a, $$4, $$5, $$6, $$7);
   }

   public dmj(dmg $$0, bft $$1, bft $$2, bft $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
