import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsp extends dsm {
   public static final Codec<dsp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsm.d.forGetter($$0x -> $$0x),
               bkx.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bkx.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bkx.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dsp::new)
   );
   public final bkx b;
   public final bkx c;
   final bkx j;

   public dsp(float $$0, dzl $$1, bkx $$2, dri $$3, dsn $$4, in<cyo> $$5, bkx $$6, bkx $$7, bkx $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dsp(float $$0, dzl $$1, bkx $$2, dri $$3, in<cyo> $$4, bkx $$5, bkx $$6, bkx $$7) {
      this($$0, $$1, $$2, $$3, dsn.a, $$4, $$5, $$6, $$7);
   }

   public dsp(dsm $$0, bkx $$1, bkx $$2, bkx $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
