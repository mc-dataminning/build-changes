import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egn extends egk {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egk.d.forGetter($$0x -> $$0x),
               bst.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bst.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bst.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, egn::new)
   );
   public final bst b;
   public final bst c;
   final bst j;

   public egn(float $$0, enn $$1, bst $$2, eff $$3, egl $$4, jw<dku> $$5, bst $$6, bst $$7, bst $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public egn(float $$0, enn $$1, bst $$2, eff $$3, jw<dku> $$4, bst $$5, bst $$6, bst $$7) {
      this($$0, $$1, $$2, $$3, egl.a, $$4, $$5, $$6, $$7);
   }

   public egn(egk $$0, bst $$1, bst $$2, bst $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
