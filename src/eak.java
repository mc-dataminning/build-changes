import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eak {
   public static final ebc a = ebc.a;
   public static final Codec<eak> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eap.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eap.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eai.c.optionalFieldOf("position_predicate", eah.b).forGetter($$0x -> $$0x.e),
               dgw.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ebd.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eak::new)
   );
   private final eap c;
   private final eap d;
   private final eai e;
   private final dgw f;
   private final ebd g;

   public eak(eap $$0, eap $$1, dgw $$2) {
      this($$0, $$1, eah.b, $$2);
   }

   public eak(eap $$0, eap $$1, eai $$2, dgw $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eak(eap $$0, eap $$1, eai $$2, dgw $$3, ebd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dgw $$0, dgw $$1, ht $$2, ht $$3, ht $$4, ato $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dgw a() {
      return this.f;
   }

   @Nullable
   public rz a(ato $$0, @Nullable rz $$1) {
      return this.g.a($$0, $$1);
   }
}
