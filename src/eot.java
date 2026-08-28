import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eot {
   public static final epl a = epl.a;
   public static final Codec<eot> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoy.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eoy.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eor.c.lenientOptionalFieldOf("position_predicate", eoq.b).forGetter($$0x -> $$0x.e),
               duo.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               epm.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eot::new)
   );
   private final eoy c;
   private final eoy d;
   private final eor e;
   private final duo f;
   private final epm g;

   public eot(eoy $$0, eoy $$1, duo $$2) {
      this($$0, $$1, eoq.b, $$2);
   }

   public eot(eoy $$0, eoy $$1, eor $$2, duo $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eot(eoy $$0, eoy $$1, eor $$2, duo $$3, epm $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(duo $$0, duo $$1, je $$2, je $$3, je $$4, azl $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public duo a() {
      return this.f;
   }

   @Nullable
   public uf a(azl $$0, @Nullable uf $$1) {
      return this.g.a($$0, $$1);
   }
}
