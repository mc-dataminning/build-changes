import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxb extends dwy {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwy.d.forGetter($$0x -> $$0x),
               bni.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bni.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bni.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dxb::new)
   );
   public final bni b;
   public final bni c;
   final bni j;

   public dxb(float $$0, edx $$1, bni $$2, dvu $$3, dwz $$4, ir<dch> $$5, bni $$6, bni $$7, bni $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dxb(float $$0, edx $$1, bni $$2, dvu $$3, ir<dch> $$4, bni $$5, bni $$6, bni $$7) {
      this($$0, $$1, $$2, $$3, dwz.a, $$4, $$5, $$6, $$7);
   }

   public dxb(dwy $$0, bni $$1, bni $$2, bni $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
