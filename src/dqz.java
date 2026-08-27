import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqz extends dqw {
   public static final Codec<dqz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqw.d.forGetter($$0x -> $$0x),
               bjf.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bjf.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bjf.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dqz::new)
   );
   public final bjf b;
   public final bjf c;
   final bjf j;

   public dqz(float $$0, dxv $$1, bjf $$2, dps $$3, dqx $$4, il<cwy> $$5, bjf $$6, bjf $$7, bjf $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dqz(float $$0, dxv $$1, bjf $$2, dps $$3, il<cwy> $$4, bjf $$5, bjf $$6, bjf $$7) {
      this($$0, $$1, $$2, $$3, dqx.a, $$4, $$5, $$6, $$7);
   }

   public dqz(dqw $$0, bjf $$1, bjf $$2, bjf $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
