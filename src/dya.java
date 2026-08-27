import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dya extends dxx {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.d.forGetter($$0x -> $$0x),
               bop.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bop.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bop.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dya::new)
   );
   public final bop b;
   public final bop c;
   final bop j;

   public dya(float $$0, eew $$1, bop $$2, dwt $$3, dxy $$4, ja<dde> $$5, bop $$6, bop $$7, bop $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dya(float $$0, eew $$1, bop $$2, dwt $$3, ja<dde> $$4, bop $$5, bop $$6, bop $$7) {
      this($$0, $$1, $$2, $$3, dxy.a, $$4, $$5, $$6, $$7);
   }

   public dya(dxx $$0, bop $$1, bop $$2, bop $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
