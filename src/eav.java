import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eav extends eas {
   public static final Codec<eav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eas.d.forGetter($$0x -> $$0x),
               bpd.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpd.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpd.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eav::new)
   );
   public final bpd b;
   public final bpd c;
   final bpd j;

   public eav(float $$0, ehz $$1, bpd $$2, dzo $$3, eat $$4, je<dfc> $$5, bpd $$6, bpd $$7, bpd $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eav(float $$0, ehz $$1, bpd $$2, dzo $$3, je<dfc> $$4, bpd $$5, bpd $$6, bpd $$7) {
      this($$0, $$1, $$2, $$3, eat.a, $$4, $$5, $$6, $$7);
   }

   public eav(eas $$0, bpd $$1, bpd $$2, bpd $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
