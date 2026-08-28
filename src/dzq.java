import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzq extends dzn {
   public static final Codec<dzq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzn.d.forGetter($$0x -> $$0x),
               bps.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bps.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bps.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dzq::new)
   );
   public final bps b;
   public final bps c;
   final bps j;

   public dzq(float $$0, egm $$1, bps $$2, dyj $$3, dzo $$4, jm<deu> $$5, bps $$6, bps $$7, bps $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dzq(float $$0, egm $$1, bps $$2, dyj $$3, jm<deu> $$4, bps $$5, bps $$6, bps $$7) {
      this($$0, $$1, $$2, $$3, dzo.a, $$4, $$5, $$6, $$7);
   }

   public dzq(dzn $$0, bps $$1, bps $$2, bps $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
