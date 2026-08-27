import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eiw {
   public static final ejo a = ejo.a;
   public static final Codec<eiw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejb.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ejb.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eiu.c.optionalFieldOf("position_predicate", eit.b).forGetter($$0x -> $$0x.e),
               doz.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ejp.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eiw::new)
   );
   private final ejb c;
   private final ejb d;
   private final eiu e;
   private final doz f;
   private final ejp g;

   public eiw(ejb $$0, ejb $$1, doz $$2) {
      this($$0, $$1, eit.b, $$2);
   }

   public eiw(ejb $$0, ejb $$1, eiu $$2, doz $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eiw(ejb $$0, ejb $$1, eiu $$2, doz $$3, ejp $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(doz $$0, doz $$1, ib $$2, ib $$3, ib $$4, axr $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public doz a() {
      return this.f;
   }

   @Nullable
   public tm a(axr $$0, @Nullable tm $$1) {
      return this.g.a($$0, $$1);
   }
}
