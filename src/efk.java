import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efk extends efh {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efh.d.forGetter($$0x -> $$0x),
               bsh.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bsh.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bsh.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, efk::new)
   );
   public final bsh b;
   public final bsh c;
   final bsh j;

   public efk(float $$0, emj $$1, bsh $$2, eec $$3, efi $$4, ju<dke> $$5, bsh $$6, bsh $$7, bsh $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public efk(float $$0, emj $$1, bsh $$2, eec $$3, ju<dke> $$4, bsh $$5, bsh $$6, bsh $$7) {
      this($$0, $$1, $$2, $$3, efi.a, $$4, $$5, $$6, $$7);
   }

   public efk(efh $$0, bsh $$1, bsh $$2, bsh $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
