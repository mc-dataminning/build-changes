import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efl extends efi {
   public static final Codec<efl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efi.d.forGetter($$0x -> $$0x),
               bsd.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bsd.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bsd.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, efl::new)
   );
   public final bsd b;
   public final bsd c;
   final bsd j;

   public efl(float $$0, emk $$1, bsd $$2, eed $$3, efj $$4, ju<dkd> $$5, bsd $$6, bsd $$7, bsd $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public efl(float $$0, emk $$1, bsd $$2, eed $$3, ju<dkd> $$4, bsd $$5, bsd $$6, bsd $$7) {
      this($$0, $$1, $$2, $$3, efj.a, $$4, $$5, $$6, $$7);
   }

   public efl(efi $$0, bsd $$1, bsd $$2, bsd $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
