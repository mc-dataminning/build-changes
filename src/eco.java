import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eco {
   public static final edg a = edg.a;
   public static final Codec<eco> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ect.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ect.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ecm.c.optionalFieldOf("position_predicate", ecl.b).forGetter($$0x -> $$0x.e),
               dja.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               edh.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eco::new)
   );
   private final ect c;
   private final ect d;
   private final ecm e;
   private final dja f;
   private final edh g;

   public eco(ect $$0, ect $$1, dja $$2) {
      this($$0, $$1, ecl.b, $$2);
   }

   public eco(ect $$0, ect $$1, ecm $$2, dja $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eco(ect $$0, ect $$1, ecm $$2, dja $$3, edh $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dja $$0, dja $$1, hx $$2, hx $$3, hx $$4, aup $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dja a() {
      return this.f;
   }

   @Nullable
   public sl a(aup $$0, @Nullable sl $$1) {
      return this.g.a($$0, $$1);
   }
}
