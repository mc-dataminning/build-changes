import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmk extends dmh {
   public static final Codec<dmk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmh.d.forGetter($$0x -> $$0x),
               bft.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bft.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bft.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmk::new)
   );
   public final bft b;
   public final bft c;
   final bft j;

   public dmk(float $$0, dtg $$1, bft $$2, dld $$3, dmi $$4, hi<csm> $$5, bft $$6, bft $$7, bft $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmk(float $$0, dtg $$1, bft $$2, dld $$3, hi<csm> $$4, bft $$5, bft $$6, bft $$7) {
      this($$0, $$1, $$2, $$3, dmi.a, $$4, $$5, $$6, $$7);
   }

   public dmk(dmh $$0, bft $$1, bft $$2, bft $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
