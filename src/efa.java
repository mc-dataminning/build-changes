import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class efa {
   public static final efs a = efs.a;
   public static final Codec<efa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eff.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eff.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eey.c.optionalFieldOf("position_predicate", eex.b).forGetter($$0x -> $$0x.e),
               dlj.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eft.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, efa::new)
   );
   private final eff c;
   private final eff d;
   private final eey e;
   private final dlj f;
   private final eft g;

   public efa(eff $$0, eff $$1, dlj $$2) {
      this($$0, $$1, eex.b, $$2);
   }

   public efa(eff $$0, eff $$1, eey $$2, dlj $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public efa(eff $$0, eff $$1, eey $$2, dlj $$3, eft $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dlj $$0, dlj $$1, hz $$2, hz $$3, hz $$4, awp $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dlj a() {
      return this.f;
   }

   @Nullable
   public sw a(awp $$0, @Nullable sw $$1) {
      return this.g.a($$0, $$1);
   }
}
