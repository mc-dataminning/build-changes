import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eia extends ehx {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehx.d.forGetter($$0x -> $$0x),
               bte.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bte.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bte.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eia::new)
   );
   public final bte b;
   public final bte c;
   final bte j;

   public eia(float $$0, epa $$1, bte $$2, egs $$3, ehy $$4, ji<dma> $$5, bte $$6, bte $$7, bte $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eia(float $$0, epa $$1, bte $$2, egs $$3, ji<dma> $$4, bte $$5, bte $$6, bte $$7) {
      this($$0, $$1, $$2, $$3, ehy.a, $$4, $$5, $$6, $$7);
   }

   public eia(ehx $$0, bte $$1, bte $$2, bte $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
