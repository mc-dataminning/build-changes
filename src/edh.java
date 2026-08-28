import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edh extends ede {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ede.d.forGetter($$0x -> $$0x),
               brg.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               brg.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               brg.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, edh::new)
   );
   public final brg b;
   public final brg c;
   final brg j;

   public edh(float $$0, eke $$1, brg $$2, ebz $$3, edf $$4, ju<die> $$5, brg $$6, brg $$7, brg $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public edh(float $$0, eke $$1, brg $$2, ebz $$3, ju<die> $$4, brg $$5, brg $$6, brg $$7) {
      this($$0, $$1, $$2, $$3, edf.a, $$4, $$5, $$6, $$7);
   }

   public edh(ede $$0, brg $$1, brg $$2, brg $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
