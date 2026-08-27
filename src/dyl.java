import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyl {
   public static final dzd a = dzd.a;
   public static final Codec<dyl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyq.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dyq.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dyj.c.optionalFieldOf("position_predicate", dyi.b).forGetter($$0x -> $$0x.e),
               dfe.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               dze.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyl::new)
   );
   private final dyq c;
   private final dyq d;
   private final dyj e;
   private final dfe f;
   private final dze g;

   public dyl(dyq $$0, dyq $$1, dfe $$2) {
      this($$0, $$1, dyi.b, $$2);
   }

   public dyl(dyq $$0, dyq $$1, dyj $$2, dfe $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dyl(dyq $$0, dyq $$1, dyj $$2, dfe $$3, dze $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dfe $$0, dfe $$1, gw $$2, gw $$3, gw $$4, arx $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dfe a() {
      return this.f;
   }

   @Nullable
   public qu a(arx $$0, @Nullable qu $$1) {
      return this.g.a($$0, $$1);
   }
}
