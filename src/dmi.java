import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmi extends dmf {
   public static final Codec<dmi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmf.d.forGetter($$0x -> $$0x),
               bfr.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bfr.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bfr.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmi::new)
   );
   public final bfr b;
   public final bfr c;
   final bfr j;

   public dmi(float $$0, dte $$1, bfr $$2, dlb $$3, dmg $$4, hj<csk> $$5, bfr $$6, bfr $$7, bfr $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmi(float $$0, dte $$1, bfr $$2, dlb $$3, hj<csk> $$4, bfr $$5, bfr $$6, bfr $$7) {
      this($$0, $$1, $$2, $$3, dmg.a, $$4, $$5, $$6, $$7);
   }

   public dmi(dmf $$0, bfr $$1, bfr $$2, bfr $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
