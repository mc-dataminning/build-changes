import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqk extends dqh {
   public static final Codec<dqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqh.d.forGetter($$0x -> $$0x),
               biy.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               biy.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               biy.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dqk::new)
   );
   public final biy b;
   public final biy c;
   final biy j;

   public dqk(float $$0, dxg $$1, biy $$2, dpd $$3, dqi $$4, il<cwj> $$5, biy $$6, biy $$7, biy $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dqk(float $$0, dxg $$1, biy $$2, dpd $$3, il<cwj> $$4, biy $$5, biy $$6, biy $$7) {
      this($$0, $$1, $$2, $$3, dqi.a, $$4, $$5, $$6, $$7);
   }

   public dqk(dqh $$0, biy $$1, biy $$2, biy $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
