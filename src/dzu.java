import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzu extends dzr {
   public static final Codec<dzu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzr.d.forGetter($$0x -> $$0x),
               bpw.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpw.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpw.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dzu::new)
   );
   public final bpw b;
   public final bpw c;
   final bpw j;

   public dzu(float $$0, egq $$1, bpw $$2, dyn $$3, dzs $$4, jm<dey> $$5, bpw $$6, bpw $$7, bpw $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dzu(float $$0, egq $$1, bpw $$2, dyn $$3, jm<dey> $$4, bpw $$5, bpw $$6, bpw $$7) {
      this($$0, $$1, $$2, $$3, dzs.a, $$4, $$5, $$6, $$7);
   }

   public dzu(dzr $$0, bpw $$1, bpw $$2, bpw $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
