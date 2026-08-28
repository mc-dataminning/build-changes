import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eev extends ees {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ees.d.forGetter($$0x -> $$0x),
               bro.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bro.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bro.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eev::new)
   );
   public final bro b;
   public final bro c;
   final bro j;

   public eev(float $$0, elu $$1, bro $$2, edn $$3, eet $$4, jv<djn> $$5, bro $$6, bro $$7, bro $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eev(float $$0, elu $$1, bro $$2, edn $$3, jv<djn> $$4, bro $$5, bro $$6, bro $$7) {
      this($$0, $$1, $$2, $$3, eet.a, $$4, $$5, $$6, $$7);
   }

   public eev(ees $$0, bro $$1, bro $$2, bro $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
