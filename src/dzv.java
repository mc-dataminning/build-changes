import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzv extends dzs {
   public static final Codec<dzv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzs.d.forGetter($$0x -> $$0x),
               bpx.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpx.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpx.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dzv::new)
   );
   public final bpx b;
   public final bpx c;
   final bpx j;

   public dzv(float $$0, egr $$1, bpx $$2, dyo $$3, dzt $$4, jm<dez> $$5, bpx $$6, bpx $$7, bpx $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dzv(float $$0, egr $$1, bpx $$2, dyo $$3, jm<dez> $$4, bpx $$5, bpx $$6, bpx $$7) {
      this($$0, $$1, $$2, $$3, dzt.a, $$4, $$5, $$6, $$7);
   }

   public dzv(dzs $$0, bpx $$1, bpx $$2, bpx $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
