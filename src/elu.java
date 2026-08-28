import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elu {
   public static final emm a = emm.a;
   public static final Codec<elu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elz.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               elz.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               els.c.lenientOptionalFieldOf("position_predicate", elr.b).forGetter($$0x -> $$0x.e),
               drx.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               emn.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elu::new)
   );
   private final elz c;
   private final elz d;
   private final els e;
   private final drx f;
   private final emn g;

   public elu(elz $$0, elz $$1, drx $$2) {
      this($$0, $$1, elr.b, $$2);
   }

   public elu(elz $$0, elz $$1, els $$2, drx $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public elu(elz $$0, elz $$1, els $$2, drx $$3, emn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(drx $$0, drx $$1, iz $$2, iz $$3, iz $$4, azc $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public drx a() {
      return this.f;
   }

   @Nullable
   public ur a(azc $$0, @Nullable ur $$1) {
      return this.g.a($$0, $$1);
   }
}
