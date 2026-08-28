import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emn {
   public static final enf a = enf.a;
   public static final Codec<emn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ems.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ems.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eml.c.lenientOptionalFieldOf("position_predicate", emk.b).forGetter($$0x -> $$0x.e),
               dsl.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eng.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, emn::new)
   );
   private final ems c;
   private final ems d;
   private final eml e;
   private final dsl f;
   private final eng g;

   public emn(ems $$0, ems $$1, dsl $$2) {
      this($$0, $$1, emk.b, $$2);
   }

   public emn(ems $$0, ems $$1, eml $$2, dsl $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public emn(ems $$0, ems $$1, eml $$2, dsl $$3, eng $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dsl $$0, dsl $$1, ja $$2, ja $$3, ja $$4, ayo $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dsl a() {
      return this.f;
   }

   @Nullable
   public tx a(ayo $$0, @Nullable tx $$1) {
      return this.g.a($$0, $$1);
   }
}
