import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmn extends dmk {
   public static final Codec<dmn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmk.d.forGetter($$0x -> $$0x),
               bgh.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bgh.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bgh.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmn::new)
   );
   public final bgh b;
   public final bgh c;
   final bgh j;

   public dmn(float $$0, dtj $$1, bgh $$2, dlg $$3, dml $$4, hi<ctc> $$5, bgh $$6, bgh $$7, bgh $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmn(float $$0, dtj $$1, bgh $$2, dlg $$3, hi<ctc> $$4, bgh $$5, bgh $$6, bgh $$7) {
      this($$0, $$1, $$2, $$3, dml.a, $$4, $$5, $$6, $$7);
   }

   public dmn(dmk $$0, bgh $$1, bgh $$2, bgh $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
