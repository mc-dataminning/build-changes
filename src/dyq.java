import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyq {
   public static final dzi a = dzi.a;
   public static final Codec<dyq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyv.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dyv.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dyo.c.optionalFieldOf("position_predicate", dyn.b).forGetter($$0x -> $$0x.e),
               dfj.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               dzj.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyq::new)
   );
   private final dyv c;
   private final dyv d;
   private final dyo e;
   private final dfj f;
   private final dzj g;

   public dyq(dyv $$0, dyv $$1, dfj $$2) {
      this($$0, $$1, dyn.b, $$2);
   }

   public dyq(dyv $$0, dyv $$1, dyo $$2, dfj $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dyq(dyv $$0, dyv $$1, dyo $$2, dfj $$3, dzj $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dfj $$0, dfj $$1, gw $$2, gw $$3, gw $$4, asc $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dfj a() {
      return this.f;
   }

   @Nullable
   public qw a(asc $$0, @Nullable qw $$1) {
      return this.g.a($$0, $$1);
   }
}
