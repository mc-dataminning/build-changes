import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmv extends dms {
   public static final Codec<dmv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dms.d.forGetter($$0x -> $$0x),
               bgd.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bgd.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bgd.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmv::new)
   );
   public final bgd b;
   public final bgd c;
   final bgd j;

   public dmv(float $$0, dtr $$1, bgd $$2, dlo $$3, dmt $$4, hk<csx> $$5, bgd $$6, bgd $$7, bgd $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmv(float $$0, dtr $$1, bgd $$2, dlo $$3, hk<csx> $$4, bgd $$5, bgd $$6, bgd $$7) {
      this($$0, $$1, $$2, $$3, dmt.a, $$4, $$5, $$6, $$7);
   }

   public dmv(dms $$0, bgd $$1, bgd $$2, bgd $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
