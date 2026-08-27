import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpz extends dpw {
   public static final Codec<dpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpw.d.forGetter($$0x -> $$0x),
               bio.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bio.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bio.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dpz::new)
   );
   public final bio b;
   public final bio c;
   final bio j;

   public dpz(float $$0, dwv $$1, bio $$2, dos $$3, dpx $$4, ij<cvz> $$5, bio $$6, bio $$7, bio $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dpz(float $$0, dwv $$1, bio $$2, dos $$3, ij<cvz> $$4, bio $$5, bio $$6, bio $$7) {
      this($$0, $$1, $$2, $$3, dpx.a, $$4, $$5, $$6, $$7);
   }

   public dpz(dpw $$0, bio $$1, bio $$2, bio $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
