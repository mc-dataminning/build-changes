import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eke {
   public static final ekw a = ekw.a;
   public static final Codec<eke> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekj.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ekj.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ekc.c.optionalFieldOf("position_predicate", ekb.b).forGetter($$0x -> $$0x.e),
               dqh.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ekx.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eke::new)
   );
   private final ekj c;
   private final ekj d;
   private final ekc e;
   private final dqh f;
   private final ekx g;

   public eke(ekj $$0, ekj $$1, dqh $$2) {
      this($$0, $$1, ekb.b, $$2);
   }

   public eke(ekj $$0, ekj $$1, ekc $$2, dqh $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eke(ekj $$0, ekj $$1, ekc $$2, dqh $$3, ekx $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dqh $$0, dqh $$1, in $$2, in $$3, in $$4, ayg $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dqh a() {
      return this.f;
   }

   @Nullable
   public ua a(ayg $$0, @Nullable ua $$1) {
      return this.g.a($$0, $$1);
   }
}
