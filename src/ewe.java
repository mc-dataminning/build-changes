import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewe {
   public static final eww a = eww.a;
   public static final Codec<ewe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewj.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ewj.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ewc.c.lenientOptionalFieldOf("position_predicate", ewb.b).forGetter($$0x -> $$0x.e),
               ebq.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ewx.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ewe::new)
   );
   private final ewj c;
   private final ewj d;
   private final ewc e;
   private final ebq f;
   private final ewx g;

   public ewe(ewj $$0, ewj $$1, ebq $$2) {
      this($$0, $$1, ewb.b, $$2);
   }

   public ewe(ewj $$0, ewj $$1, ewc $$2, ebq $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ewe(ewj $$0, ewj $$1, ewc $$2, ebq $$3, ewx $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(ebq $$0, ebq $$1, iw $$2, iw $$3, iw $$4, bai $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public ebq a() {
      return this.f;
   }

   @Nullable
   public ua a(bai $$0, @Nullable ua $$1) {
      return this.g.a($$0, $$1);
   }
}
