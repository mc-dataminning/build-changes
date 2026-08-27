import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqq extends dqn {
   public static final Codec<dqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqn.d.forGetter($$0x -> $$0x),
               bjd.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bjd.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bjd.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dqq::new)
   );
   public final bjd b;
   public final bjd c;
   final bjd j;

   public dqq(float $$0, dxm $$1, bjd $$2, dpj $$3, dqo $$4, il<cwp> $$5, bjd $$6, bjd $$7, bjd $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dqq(float $$0, dxm $$1, bjd $$2, dpj $$3, il<cwp> $$4, bjd $$5, bjd $$6, bjd $$7) {
      this($$0, $$1, $$2, $$3, dqo.a, $$4, $$5, $$6, $$7);
   }

   public dqq(dqn $$0, bjd $$1, bjd $$2, bjd $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
