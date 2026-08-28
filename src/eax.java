import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eax extends eau {
   public static final Codec<eax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eau.d.forGetter($$0x -> $$0x),
               bpt.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpt.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpt.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eax::new)
   );
   public final bpt b;
   public final bpt c;
   final bpt j;

   public eax(float $$0, eht $$1, bpt $$2, dzp $$3, eav $$4, jq<dfw> $$5, bpt $$6, bpt $$7, bpt $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eax(float $$0, eht $$1, bpt $$2, dzp $$3, jq<dfw> $$4, bpt $$5, bpt $$6, bpt $$7) {
      this($$0, $$1, $$2, $$3, eav.a, $$4, $$5, $$6, $$7);
   }

   public eax(eau $$0, bpt $$1, bpt $$2, bpt $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
