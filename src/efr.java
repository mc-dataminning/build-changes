import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efr extends efo {
   public static final Codec<efr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efo.d.forGetter($$0x -> $$0x),
               bsl.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bsl.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bsl.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, efr::new)
   );
   public final bsl b;
   public final bsl c;
   final bsl j;

   public efr(float $$0, emq $$1, bsl $$2, eej $$3, efp $$4, ju<dkl> $$5, bsl $$6, bsl $$7, bsl $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public efr(float $$0, emq $$1, bsl $$2, eej $$3, ju<dkl> $$4, bsl $$5, bsl $$6, bsl $$7) {
      this($$0, $$1, $$2, $$3, efp.a, $$4, $$5, $$6, $$7);
   }

   public efr(efo $$0, bsl $$1, bsl $$2, bsl $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
