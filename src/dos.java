import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends dop {
   public static final Codec<dos> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dop.d.forGetter($$0x -> $$0x),
               bia.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bia.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bia.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dos::new)
   );
   public final bia b;
   public final bia c;
   final bia j;

   public dos(float $$0, dvo $$1, bia $$2, dnl $$3, doq $$4, ig<cva> $$5, bia $$6, bia $$7, bia $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dos(float $$0, dvo $$1, bia $$2, dnl $$3, ig<cva> $$4, bia $$5, bia $$6, bia $$7) {
      this($$0, $$1, $$2, $$3, doq.a, $$4, $$5, $$6, $$7);
   }

   public dos(dop $$0, bia $$1, bia $$2, bia $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
