import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emf {
   public static final emx a = emx.a;
   public static final Codec<emf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emk.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               emk.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               emd.c.lenientOptionalFieldOf("position_predicate", emc.b).forGetter($$0x -> $$0x.e),
               dsh.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               emy.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, emf::new)
   );
   private final emk c;
   private final emk d;
   private final emd e;
   private final dsh f;
   private final emy g;

   public emf(emk $$0, emk $$1, dsh $$2) {
      this($$0, $$1, emc.b, $$2);
   }

   public emf(emk $$0, emk $$1, emd $$2, dsh $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public emf(emk $$0, emk $$1, emd $$2, dsh $$3, emy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dsh $$0, dsh $$1, ja $$2, ja $$3, ja $$4, aym $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dsh a() {
      return this.f;
   }

   @Nullable
   public tx a(aym $$0, @Nullable tx $$1) {
      return this.g.a($$0, $$1);
   }
}
