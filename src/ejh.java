import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejh extends eje {
   public static final Codec<ejh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eje.d.forGetter($$0x -> $$0x),
               btw.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               btw.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               btw.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ejh::new)
   );
   public final btw b;
   public final btw c;
   final btw j;

   public ejh(float $$0, eqk $$1, btw $$2, ehz $$3, ejf $$4, jk<dne> $$5, btw $$6, btw $$7, btw $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ejh(float $$0, eqk $$1, btw $$2, ehz $$3, jk<dne> $$4, btw $$5, btw $$6, btw $$7) {
      this($$0, $$1, $$2, $$3, ejf.a, $$4, $$5, $$6, $$7);
   }

   public ejh(eje $$0, btw $$1, btw $$2, btw $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
