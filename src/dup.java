import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dup extends dum {
   public static final Codec<dup> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dum.d.forGetter($$0x -> $$0x),
               bmg.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bmg.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bmg.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dup::new)
   );
   public final bmg b;
   public final bmg c;
   final bmg j;

   public dup(float $$0, ebl $$1, bmg $$2, dti $$3, dun $$4, ip<dac> $$5, bmg $$6, bmg $$7, bmg $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dup(float $$0, ebl $$1, bmg $$2, dti $$3, ip<dac> $$4, bmg $$5, bmg $$6, bmg $$7) {
      this($$0, $$1, $$2, $$3, dun.a, $$4, $$5, $$6, $$7);
   }

   public dup(dum $$0, bmg $$1, bmg $$2, bmg $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
