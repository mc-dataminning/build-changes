import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edb extends ecy {
   public static final Codec<edb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecy.d.forGetter($$0x -> $$0x),
               brb.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               brb.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               brb.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, edb::new)
   );
   public final brb b;
   public final brb c;
   final brb j;

   public edb(float $$0, ejy $$1, brb $$2, ebt $$3, ecz $$4, jt<dhy> $$5, brb $$6, brb $$7, brb $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public edb(float $$0, ejy $$1, brb $$2, ebt $$3, jt<dhy> $$4, brb $$5, brb $$6, brb $$7) {
      this($$0, $$1, $$2, $$3, ecz.a, $$4, $$5, $$6, $$7);
   }

   public edb(ecy $$0, brb $$1, brb $$2, brb $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
