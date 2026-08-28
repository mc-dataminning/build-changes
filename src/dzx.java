import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzx extends dzu {
   public static final Codec<dzx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzu.d.forGetter($$0x -> $$0x),
               bpz.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpz.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpz.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dzx::new)
   );
   public final bpz b;
   public final bpz c;
   final bpz j;

   public dzx(float $$0, egt $$1, bpz $$2, dyq $$3, dzv $$4, jm<dfb> $$5, bpz $$6, bpz $$7, bpz $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dzx(float $$0, egt $$1, bpz $$2, dyq $$3, jm<dfb> $$4, bpz $$5, bpz $$6, bpz $$7) {
      this($$0, $$1, $$2, $$3, dzv.a, $$4, $$5, $$6, $$7);
   }

   public dzx(dzu $$0, bpz $$1, bpz $$2, bpz $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
