import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip extends eim {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eim.d.forGetter($$0x -> $$0x),
               btj.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               btj.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               btj.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eip::new)
   );
   public final btj b;
   public final btj c;
   final btj j;

   public eip(float $$0, epp $$1, btj $$2, ehh $$3, ein $$4, jj<dmm> $$5, btj $$6, btj $$7, btj $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eip(float $$0, epp $$1, btj $$2, ehh $$3, jj<dmm> $$4, btj $$5, btj $$6, btj $$7) {
      this($$0, $$1, $$2, $$3, ein.a, $$4, $$5, $$6, $$7);
   }

   public eip(eim $$0, btj $$1, btj $$2, btj $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
