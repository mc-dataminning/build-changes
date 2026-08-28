import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eby extends ebv {
   public static final Codec<eby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebv.d.forGetter($$0x -> $$0x),
               bqn.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bqn.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bqn.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eby::new)
   );
   public final bqn b;
   public final bqn c;
   final bqn j;

   public eby(float $$0, eiv $$1, bqn $$2, eaq $$3, ebw $$4, jr<dgv> $$5, bqn $$6, bqn $$7, bqn $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eby(float $$0, eiv $$1, bqn $$2, eaq $$3, jr<dgv> $$4, bqn $$5, bqn $$6, bqn $$7) {
      this($$0, $$1, $$2, $$3, ebw.a, $$4, $$5, $$6, $$7);
   }

   public eby(ebv $$0, bqn $$1, bqn $$2, bqn $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
