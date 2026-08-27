import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyu extends dyr {
   public static final Codec<dyu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyr.d.forGetter($$0x -> $$0x),
               box.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               box.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               box.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dyu::new)
   );
   public final box b;
   public final box c;
   final box j;

   public dyu(float $$0, efq $$1, box $$2, dxn $$3, dys $$4, jb<ddy> $$5, box $$6, box $$7, box $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dyu(float $$0, efq $$1, box $$2, dxn $$3, jb<ddy> $$4, box $$5, box $$6, box $$7) {
      this($$0, $$1, $$2, $$3, dys.a, $$4, $$5, $$6, $$7);
   }

   public dyu(dyr $$0, box $$1, box $$2, box $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
