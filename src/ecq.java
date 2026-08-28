import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecq extends ecn {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecn.d.forGetter($$0x -> $$0x),
               bqv.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bqv.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bqv.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ecq::new)
   );
   public final bqv b;
   public final bqv c;
   final bqv j;

   public ecq(float $$0, ejn $$1, bqv $$2, ebi $$3, eco $$4, js<dhm> $$5, bqv $$6, bqv $$7, bqv $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ecq(float $$0, ejn $$1, bqv $$2, ebi $$3, js<dhm> $$4, bqv $$5, bqv $$6, bqv $$7) {
      this($$0, $$1, $$2, $$3, eco.a, $$4, $$5, $$6, $$7);
   }

   public ecq(ecn $$0, bqv $$1, bqv $$2, bqv $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
