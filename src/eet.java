import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eet extends eeq {
   public static final Codec<eet> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eeq.d.forGetter($$0x -> $$0x),
               brm.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               brm.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               brm.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eet::new)
   );
   public final brm b;
   public final brm c;
   final brm j;

   public eet(float $$0, els $$1, brm $$2, edl $$3, eer $$4, jv<djl> $$5, brm $$6, brm $$7, brm $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eet(float $$0, els $$1, brm $$2, edl $$3, jv<djl> $$4, brm $$5, brm $$6, brm $$7) {
      this($$0, $$1, $$2, $$3, eer.a, $$4, $$5, $$6, $$7);
   }

   public eet(eeq $$0, brm $$1, brm $$2, brm $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
