import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eaw {
   public static final ebo a = ebo.a;
   public static final Codec<eaw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebb.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ebb.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eau.c.optionalFieldOf("position_predicate", eat.b).forGetter($$0x -> $$0x.e),
               dhi.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ebp.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eaw::new)
   );
   private final ebb c;
   private final ebb d;
   private final eau e;
   private final dhi f;
   private final ebp g;

   public eaw(ebb $$0, ebb $$1, dhi $$2) {
      this($$0, $$1, eat.b, $$2);
   }

   public eaw(ebb $$0, ebb $$1, eau $$2, dhi $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eaw(ebb $$0, ebb $$1, eau $$2, dhi $$3, ebp $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dhi $$0, dhi $$1, ht $$2, ht $$3, ht $$4, ats $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dhi a() {
      return this.f;
   }

   @Nullable
   public rz a(ats $$0, @Nullable rz $$1) {
      return this.g.a($$0, $$1);
   }
}
