import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eba extends eax {
   public static final Codec<eba> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eax.d.forGetter($$0x -> $$0x),
               bpu.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpu.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpu.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eba::new)
   );
   public final bpu b;
   public final bpu c;
   final bpu j;

   public eba(float $$0, ehw $$1, bpu $$2, dzs $$3, eay $$4, jq<dfy> $$5, bpu $$6, bpu $$7, bpu $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eba(float $$0, ehw $$1, bpu $$2, dzs $$3, jq<dfy> $$4, bpu $$5, bpu $$6, bpu $$7) {
      this($$0, $$1, $$2, $$3, eay.a, $$4, $$5, $$6, $$7);
   }

   public eba(eax $$0, bpu $$1, bpu $$2, bpu $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
