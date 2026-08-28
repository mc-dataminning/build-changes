import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eng {
   public static final eny a = eny.a;
   public static final Codec<eng> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enl.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               enl.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ene.c.lenientOptionalFieldOf("position_predicate", end.b).forGetter($$0x -> $$0x.e),
               dtc.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               enz.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eng::new)
   );
   private final enl c;
   private final enl d;
   private final ene e;
   private final dtc f;
   private final enz g;

   public eng(enl $$0, enl $$1, dtc $$2) {
      this($$0, $$1, end.b, $$2);
   }

   public eng(enl $$0, enl $$1, ene $$2, dtc $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eng(enl $$0, enl $$1, ene $$2, dtc $$3, enz $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dtc $$0, dtc $$1, jd $$2, jd $$3, jd $$4, ayw $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dtc a() {
      return this.f;
   }

   @Nullable
   public ub a(ayw $$0, @Nullable ub $$1) {
      return this.g.a($$0, $$1);
   }
}
