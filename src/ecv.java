import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecv {
   public static final edn a = edn.a;
   public static final Codec<ecv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eda.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eda.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ect.c.optionalFieldOf("position_predicate", ecs.b).forGetter($$0x -> $$0x.e),
               djh.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               edo.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ecv::new)
   );
   private final eda c;
   private final eda d;
   private final ect e;
   private final djh f;
   private final edo g;

   public ecv(eda $$0, eda $$1, djh $$2) {
      this($$0, $$1, ecs.b, $$2);
   }

   public ecv(eda $$0, eda $$1, ect $$2, djh $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ecv(eda $$0, eda $$1, ect $$2, djh $$3, edo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(djh $$0, djh $$1, hx $$2, hx $$3, hx $$4, auv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public djh a() {
      return this.f;
   }

   @Nullable
   public sn a(auv $$0, @Nullable sn $$1) {
      return this.g.a($$0, $$1);
   }
}
