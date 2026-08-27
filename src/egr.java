import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class egr {
   public static final ehj a = ehj.a;
   public static final Codec<egr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egw.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               egw.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               egp.c.optionalFieldOf("position_predicate", ego.b).forGetter($$0x -> $$0x.e),
               dmz.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ehk.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egr::new)
   );
   private final egw c;
   private final egw d;
   private final egp e;
   private final dmz f;
   private final ehk g;

   public egr(egw $$0, egw $$1, dmz $$2) {
      this($$0, $$1, ego.b, $$2);
   }

   public egr(egw $$0, egw $$1, egp $$2, dmz $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public egr(egw $$0, egw $$1, egp $$2, dmz $$3, ehk $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dmz $$0, dmz $$1, ib $$2, ib $$3, ib $$4, axd $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dmz a() {
      return this.f;
   }

   @Nullable
   public ta a(axd $$0, @Nullable ta $$1) {
      return this.g.a($$0, $$1);
   }
}
