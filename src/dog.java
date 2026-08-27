import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog extends dod {
   public static final Codec<dog> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dod.d.forGetter($$0x -> $$0x),
               bht.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bht.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bht.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dog::new)
   );
   public final bht b;
   public final bht c;
   final bht j;

   public dog(float $$0, dvc $$1, bht $$2, dmz $$3, doe $$4, ig<cut> $$5, bht $$6, bht $$7, bht $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dog(float $$0, dvc $$1, bht $$2, dmz $$3, ig<cut> $$4, bht $$5, bht $$6, bht $$7) {
      this($$0, $$1, $$2, $$3, doe.a, $$4, $$5, $$6, $$7);
   }

   public dog(dod $$0, bht $$1, bht $$2, bht $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
