import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsw extends dst {
   public static final Codec<dsw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.d.forGetter($$0x -> $$0x),
               bkz.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bkz.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bkz.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dsw::new)
   );
   public final bkz b;
   public final bkz c;
   final bkz j;

   public dsw(float $$0, dzs $$1, bkz $$2, drp $$3, dsu $$4, in<cys> $$5, bkz $$6, bkz $$7, bkz $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dsw(float $$0, dzs $$1, bkz $$2, drp $$3, in<cys> $$4, bkz $$5, bkz $$6, bkz $$7) {
      this($$0, $$1, $$2, $$3, dsu.a, $$4, $$5, $$6, $$7);
   }

   public dsw(dst $$0, bkz $$1, bkz $$2, bkz $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
