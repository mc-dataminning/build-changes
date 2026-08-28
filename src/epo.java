import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epo {
   public static final eqg a = eqg.a;
   public static final Codec<epo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ept.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ept.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               epm.c.lenientOptionalFieldOf("position_predicate", epl.b).forGetter($$0x -> $$0x.e),
               dvj.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eqh.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, epo::new)
   );
   private final ept c;
   private final ept d;
   private final epm e;
   private final dvj f;
   private final eqh g;

   public epo(ept $$0, ept $$1, dvj $$2) {
      this($$0, $$1, epl.b, $$2);
   }

   public epo(ept $$0, ept $$1, epm $$2, dvj $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public epo(ept $$0, ept $$1, epm $$2, dvj $$3, eqh $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dvj $$0, dvj $$1, jh $$2, jh $$3, jh $$4, azs $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dvj a() {
      return this.f;
   }

   @Nullable
   public uk a(azs $$0, @Nullable uk $$1) {
      return this.g.a($$0, $$1);
   }
}
