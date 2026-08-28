import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ees extends eep {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eep.d.forGetter($$0x -> $$0x),
               brl.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               brl.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               brl.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ees::new)
   );
   public final brl b;
   public final brl c;
   final brl j;

   public ees(float $$0, elr $$1, brl $$2, edk $$3, eeq $$4, jv<djk> $$5, brl $$6, brl $$7, brl $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ees(float $$0, elr $$1, brl $$2, edk $$3, jv<djk> $$4, brl $$5, brl $$6, brl $$7) {
      this($$0, $$1, $$2, $$3, eeq.a, $$4, $$5, $$6, $$7);
   }

   public ees(eep $$0, brl $$1, brl $$2, brl $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
