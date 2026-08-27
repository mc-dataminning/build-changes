import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class efv {
   public static final egn a = egn.a;
   public static final Codec<efv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ega.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ega.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eft.c.optionalFieldOf("position_predicate", efs.b).forGetter($$0x -> $$0x.e),
               dme.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ego.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, efv::new)
   );
   private final ega c;
   private final ega d;
   private final eft e;
   private final dme f;
   private final ego g;

   public efv(ega $$0, ega $$1, dme $$2) {
      this($$0, $$1, efs.b, $$2);
   }

   public efv(ega $$0, ega $$1, eft $$2, dme $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public efv(ega $$0, ega $$1, eft $$2, dme $$3, ego $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dme $$0, dme $$1, ib $$2, ib $$3, ib $$4, awt $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dme a() {
      return this.f;
   }

   @Nullable
   public sy a(awt $$0, @Nullable sy $$1) {
      return this.g.a($$0, $$1);
   }
}
