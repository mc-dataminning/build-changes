import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epi {
   public static final eqa a = eqa.a;
   public static final Codec<epi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epn.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               epn.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               epg.c.lenientOptionalFieldOf("position_predicate", epf.b).forGetter($$0x -> $$0x.e),
               dvd.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eqb.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, epi::new)
   );
   private final epn c;
   private final epn d;
   private final epg e;
   private final dvd f;
   private final eqb g;

   public epi(epn $$0, epn $$1, dvd $$2) {
      this($$0, $$1, epf.b, $$2);
   }

   public epi(epn $$0, epn $$1, epg $$2, dvd $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public epi(epn $$0, epn $$1, epg $$2, dvd $$3, eqb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dvd $$0, dvd $$1, jg $$2, jg $$3, jg $$4, azr $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dvd a() {
      return this.f;
   }

   @Nullable
   public uj a(azr $$0, @Nullable uj $$1) {
      return this.g.a($$0, $$1);
   }
}
