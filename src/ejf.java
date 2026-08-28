import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejf extends ejc {
   public static final Codec<ejf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejc.d.forGetter($$0x -> $$0x),
               btu.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               btu.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               btu.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ejf::new)
   );
   public final btu b;
   public final btu c;
   final btu j;

   public ejf(float $$0, eqi $$1, btu $$2, ehx $$3, ejd $$4, jj<dnc> $$5, btu $$6, btu $$7, btu $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ejf(float $$0, eqi $$1, btu $$2, ehx $$3, jj<dnc> $$4, btu $$5, btu $$6, btu $$7) {
      this($$0, $$1, $$2, $$3, ejd.a, $$4, $$5, $$6, $$7);
   }

   public ejf(ejc $$0, btu $$1, btu $$2, btu $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
