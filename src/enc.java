import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class enc {
   public static final enu a = enu.a;
   public static final Codec<enc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enh.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               enh.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ena.c.lenientOptionalFieldOf("position_predicate", emz.b).forGetter($$0x -> $$0x.e),
               dta.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               env.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, enc::new)
   );
   private final enh c;
   private final enh d;
   private final ena e;
   private final dta f;
   private final env g;

   public enc(enh $$0, enh $$1, dta $$2) {
      this($$0, $$1, emz.b, $$2);
   }

   public enc(enh $$0, enh $$1, ena $$2, dta $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public enc(enh $$0, enh $$1, ena $$2, dta $$3, env $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dta $$0, dta $$1, jd $$2, jd $$3, jd $$4, ayv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dta a() {
      return this.f;
   }

   @Nullable
   public ua a(ayv $$0, @Nullable ua $$1) {
      return this.g.a($$0, $$1);
   }
}
