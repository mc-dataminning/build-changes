import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elx {
   public static final emp a = emp.a;
   public static final Codec<elx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emc.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               emc.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               elv.c.lenientOptionalFieldOf("position_predicate", elu.b).forGetter($$0x -> $$0x.e),
               dsa.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               emq.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elx::new)
   );
   private final emc c;
   private final emc d;
   private final elv e;
   private final dsa f;
   private final emq g;

   public elx(emc $$0, emc $$1, dsa $$2) {
      this($$0, $$1, elu.b, $$2);
   }

   public elx(emc $$0, emc $$1, elv $$2, dsa $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public elx(emc $$0, emc $$1, elv $$2, dsa $$3, emq $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dsa $$0, dsa $$1, iz $$2, iz $$3, iz $$4, azf $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dsa a() {
      return this.f;
   }

   @Nullable
   public ur a(azf $$0, @Nullable ur $$1) {
      return this.g.a($$0, $$1);
   }
}
