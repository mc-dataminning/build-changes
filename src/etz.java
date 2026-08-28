import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class etz {
   public static final eur a = eur.a;
   public static final Codec<etz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eue.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eue.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               etx.c.lenientOptionalFieldOf("position_predicate", etw.b).forGetter($$0x -> $$0x.e),
               dzo.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eus.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, etz::new)
   );
   private final eue c;
   private final eue d;
   private final etx e;
   private final dzo f;
   private final eus g;

   public etz(eue $$0, eue $$1, dzo $$2) {
      this($$0, $$1, etw.b, $$2);
   }

   public etz(eue $$0, eue $$1, etx $$2, dzo $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public etz(eue $$0, eue $$1, etx $$2, dzo $$3, eus $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dzo $$0, dzo $$1, iu $$2, iu $$3, iu $$4, azt $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dzo a() {
      return this.f;
   }

   @Nullable
   public tx a(azt $$0, @Nullable tx $$1) {
      return this.g.a($$0, $$1);
   }
}
