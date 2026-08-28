import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ere {
   public static final erw a = erw.a;
   public static final Codec<ere> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erj.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               erj.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               erc.c.lenientOptionalFieldOf("position_predicate", erb.b).forGetter($$0x -> $$0x.e),
               dwy.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               erx.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ere::new)
   );
   private final erj c;
   private final erj d;
   private final erc e;
   private final dwy f;
   private final erx g;

   public ere(erj $$0, erj $$1, dwy $$2) {
      this($$0, $$1, erb.b, $$2);
   }

   public ere(erj $$0, erj $$1, erc $$2, dwy $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ere(erj $$0, erj $$1, erc $$2, dwy $$3, erx $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dwy $$0, dwy $$1, ji $$2, ji $$3, ji $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dwy a() {
      return this.f;
   }

   @Nullable
   public tq a(azh $$0, @Nullable tq $$1) {
      return this.g.a($$0, $$1);
   }
}
