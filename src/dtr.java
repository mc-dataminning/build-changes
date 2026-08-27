import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtr extends dto {
   public static final Codec<dtr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.d.forGetter($$0x -> $$0x),
               blo.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               blo.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               blo.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dtr::new)
   );
   public final blo b;
   public final blo c;
   final blo j;

   public dtr(float $$0, ean $$1, blo $$2, dsk $$3, dtp $$4, ip<czf> $$5, blo $$6, blo $$7, blo $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dtr(float $$0, ean $$1, blo $$2, dsk $$3, ip<czf> $$4, blo $$5, blo $$6, blo $$7) {
      this($$0, $$1, $$2, $$3, dtp.a, $$4, $$5, $$6, $$7);
   }

   public dtr(dto $$0, blo $$1, blo $$2, blo $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
