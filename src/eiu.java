import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiu extends eir {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eir.d.forGetter($$0x -> $$0x),
               btj.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               btj.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               btj.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eiu::new)
   );
   public final btj b;
   public final btj c;
   final btj j;

   public eiu(float $$0, epu $$1, btj $$2, ehm $$3, eis $$4, jj<dmr> $$5, btj $$6, btj $$7, btj $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eiu(float $$0, epu $$1, btj $$2, ehm $$3, jj<dmr> $$4, btj $$5, btj $$6, btj $$7) {
      this($$0, $$1, $$2, $$3, eis.a, $$4, $$5, $$6, $$7);
   }

   public eiu(eir $$0, btj $$1, btj $$2, btj $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
