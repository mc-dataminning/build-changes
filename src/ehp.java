import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehp extends ehm {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehm.d.forGetter($$0x -> $$0x),
               btb.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               btb.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               btb.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ehp::new)
   );
   public final btb b;
   public final btb c;
   final btb j;

   public ehp(float $$0, eop $$1, btb $$2, egh $$3, ehn $$4, ji<dlu> $$5, btb $$6, btb $$7, btb $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ehp(float $$0, eop $$1, btb $$2, egh $$3, ji<dlu> $$4, btb $$5, btb $$6, btb $$7) {
      this($$0, $$1, $$2, $$3, ehn.a, $$4, $$5, $$6, $$7);
   }

   public ehp(ehm $$0, btb $$1, btb $$2, btb $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
