import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dou {
   public static final Codec<dox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dou.d.forGetter($$0x -> $$0x),
               bie.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bie.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bie.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dox::new)
   );
   public final bie b;
   public final bie c;
   final bie j;

   public dox(float $$0, dvt $$1, bie $$2, dnq $$3, dov $$4, ik<cvf> $$5, bie $$6, bie $$7, bie $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dox(float $$0, dvt $$1, bie $$2, dnq $$3, ik<cvf> $$4, bie $$5, bie $$6, bie $$7) {
      this($$0, $$1, $$2, $$3, dov.a, $$4, $$5, $$6, $$7);
   }

   public dox(dou $$0, bie $$1, bie $$2, bie $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
