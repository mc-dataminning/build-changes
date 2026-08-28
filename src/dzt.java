import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzt extends dzq {
   public static final Codec<dzt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzq.d.forGetter($$0x -> $$0x),
               bpv.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpv.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpv.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dzt::new)
   );
   public final bpv b;
   public final bpv c;
   final bpv j;

   public dzt(float $$0, egp $$1, bpv $$2, dym $$3, dzr $$4, jm<dex> $$5, bpv $$6, bpv $$7, bpv $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dzt(float $$0, egp $$1, bpv $$2, dym $$3, jm<dex> $$4, bpv $$5, bpv $$6, bpv $$7) {
      this($$0, $$1, $$2, $$3, dzr.a, $$4, $$5, $$6, $$7);
   }

   public dzt(dzq $$0, bpv $$1, bpv $$2, bpv $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
