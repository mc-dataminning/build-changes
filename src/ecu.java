import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecu {
   public static final edm a = edm.a;
   public static final Codec<ecu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ecz.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ecs.c.optionalFieldOf("position_predicate", ecr.b).forGetter($$0x -> $$0x.e),
               djg.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               edn.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ecu::new)
   );
   private final ecz c;
   private final ecz d;
   private final ecs e;
   private final djg f;
   private final edn g;

   public ecu(ecz $$0, ecz $$1, djg $$2) {
      this($$0, $$1, ecr.b, $$2);
   }

   public ecu(ecz $$0, ecz $$1, ecs $$2, djg $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ecu(ecz $$0, ecz $$1, ecs $$2, djg $$3, edn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(djg $$0, djg $$1, hx $$2, hx $$3, hx $$4, auu $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public djg a() {
      return this.f;
   }

   @Nullable
   public sn a(auu $$0, @Nullable sn $$1) {
      return this.g.a($$0, $$1);
   }
}
