import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxr extends dxo {
   public static final Codec<dxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxo.d.forGetter($$0x -> $$0x),
               bnt.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bnt.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bnt.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dxr::new)
   );
   public final bnt b;
   public final bnt c;
   final bnt j;

   public dxr(float $$0, een $$1, bnt $$2, dwk $$3, dxp $$4, iz<dcv> $$5, bnt $$6, bnt $$7, bnt $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dxr(float $$0, een $$1, bnt $$2, dwk $$3, iz<dcv> $$4, bnt $$5, bnt $$6, bnt $$7) {
      this($$0, $$1, $$2, $$3, dxp.a, $$4, $$5, $$6, $$7);
   }

   public dxr(dxo $$0, bnt $$1, bnt $$2, bnt $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
