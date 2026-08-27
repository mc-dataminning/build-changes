import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dws extends dwp {
   public static final Codec<dws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwp.d.forGetter($$0x -> $$0x),
               bnd.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bnd.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bnd.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dws::new)
   );
   public final bnd b;
   public final bnd c;
   final bnd j;

   public dws(float $$0, edo $$1, bnd $$2, dvl $$3, dwq $$4, ip<dby> $$5, bnd $$6, bnd $$7, bnd $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dws(float $$0, edo $$1, bnd $$2, dvl $$3, ip<dby> $$4, bnd $$5, bnd $$6, bnd $$7) {
      this($$0, $$1, $$2, $$3, dwq.a, $$4, $$5, $$6, $$7);
   }

   public dws(dwp $$0, bnd $$1, bnd $$2, bnd $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
