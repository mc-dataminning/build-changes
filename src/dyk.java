import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyk {
   public static final dzc a = dzc.a;
   public static final Codec<dyk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyp.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dyp.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dyi.c.optionalFieldOf("position_predicate", dyh.b).forGetter($$0x -> $$0x.e),
               dfd.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               dzd.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyk::new)
   );
   private final dyp c;
   private final dyp d;
   private final dyi e;
   private final dfd f;
   private final dzd g;

   public dyk(dyp $$0, dyp $$1, dfd $$2) {
      this($$0, $$1, dyh.b, $$2);
   }

   public dyk(dyp $$0, dyp $$1, dyi $$2, dfd $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dyk(dyp $$0, dyp $$1, dyi $$2, dfd $$3, dzd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dfd $$0, dfd $$1, gw $$2, gw $$3, gw $$4, ash $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dfd a() {
      return this.f;
   }

   @Nullable
   public qw a(ash $$0, @Nullable qw $$1) {
      return this.g.a($$0, $$1);
   }
}
