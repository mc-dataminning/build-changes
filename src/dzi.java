import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dzi {
   public static final eaa a = eaa.a;
   public static final Codec<dzi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzn.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dzn.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dzg.c.optionalFieldOf("position_predicate", dzf.b).forGetter($$0x -> $$0x.e),
               dgb.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eab.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzi::new)
   );
   private final dzn c;
   private final dzn d;
   private final dzg e;
   private final dgb f;
   private final eab g;

   public dzi(dzn $$0, dzn $$1, dgb $$2) {
      this($$0, $$1, dzf.b, $$2);
   }

   public dzi(dzn $$0, dzn $$1, dzg $$2, dgb $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dzi(dzn $$0, dzn $$1, dzg $$2, dgb $$3, eab $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dgb $$0, dgb $$1, ht $$2, ht $$3, ht $$4, ate $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dgb a() {
      return this.f;
   }

   @Nullable
   public rt a(ate $$0, @Nullable rt $$1) {
      return this.g.a($$0, $$1);
   }
}
