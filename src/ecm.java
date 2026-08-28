import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecm extends ecj {
   public static final Codec<ecm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.d.forGetter($$0x -> $$0x),
               bqs.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bqs.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bqs.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ecm::new)
   );
   public final bqs b;
   public final bqs c;
   final bqs j;

   public ecm(float $$0, ejj $$1, bqs $$2, ebe $$3, eck $$4, jr<dhj> $$5, bqs $$6, bqs $$7, bqs $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ecm(float $$0, ejj $$1, bqs $$2, ebe $$3, jr<dhj> $$4, bqs $$5, bqs $$6, bqs $$7) {
      this($$0, $$1, $$2, $$3, eck.a, $$4, $$5, $$6, $$7);
   }

   public ecm(ecj $$0, bqs $$1, bqs $$2, bqs $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
