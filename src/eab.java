import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eab extends dzy {
   public static final Codec<eab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzy.d.forGetter($$0x -> $$0x),
               bpg.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpg.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpg.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eab::new)
   );
   public final bpg b;
   public final bpg c;
   final bpg j;

   public eab(float $$0, egx $$1, bpg $$2, dyt $$3, dzz $$4, jn<dff> $$5, bpg $$6, bpg $$7, bpg $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eab(float $$0, egx $$1, bpg $$2, dyt $$3, jn<dff> $$4, bpg $$5, bpg $$6, bpg $$7) {
      this($$0, $$1, $$2, $$3, dzz.a, $$4, $$5, $$6, $$7);
   }

   public eab(dzy $$0, bpg $$1, bpg $$2, bpg $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
