import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmt extends dmq {
   public static final Codec<dmt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmq.d.forGetter($$0x -> $$0x),
               bgb.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bgb.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bgb.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmt::new)
   );
   public final bgb b;
   public final bgb c;
   final bgb j;

   public dmt(float $$0, dtp $$1, bgb $$2, dlm $$3, dmr $$4, hk<csv> $$5, bgb $$6, bgb $$7, bgb $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmt(float $$0, dtp $$1, bgb $$2, dlm $$3, hk<csv> $$4, bgb $$5, bgb $$6, bgb $$7) {
      this($$0, $$1, $$2, $$3, dmr.a, $$4, $$5, $$6, $$7);
   }

   public dmt(dmq $$0, bgb $$1, bgb $$2, bgb $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
