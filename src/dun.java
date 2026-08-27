import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dun extends duk {
   public static final Codec<dun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duk.d.forGetter($$0x -> $$0x),
               bmf.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bmf.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bmf.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dun::new)
   );
   public final bmf b;
   public final bmf c;
   final bmf j;

   public dun(float $$0, ebj $$1, bmf $$2, dtg $$3, dul $$4, ip<daa> $$5, bmf $$6, bmf $$7, bmf $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dun(float $$0, ebj $$1, bmf $$2, dtg $$3, ip<daa> $$4, bmf $$5, bmf $$6, bmf $$7) {
      this($$0, $$1, $$2, $$3, dul.a, $$4, $$5, $$6, $$7);
   }

   public dun(duk $$0, bmf $$1, bmf $$2, bmf $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
