import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu extends eer {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eer.d.forGetter($$0x -> $$0x),
               brn.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               brn.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               brn.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eeu::new)
   );
   public final brn b;
   public final brn c;
   final brn j;

   public eeu(float $$0, elt $$1, brn $$2, edm $$3, ees $$4, jv<djm> $$5, brn $$6, brn $$7, brn $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eeu(float $$0, elt $$1, brn $$2, edm $$3, jv<djm> $$4, brn $$5, brn $$6, brn $$7) {
      this($$0, $$1, $$2, $$3, ees.a, $$4, $$5, $$6, $$7);
   }

   public eeu(eer $$0, brn $$1, brn $$2, brn $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
