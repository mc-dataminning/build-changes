import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyh {
   public static final dyz a = dyz.a;
   public static final Codec<dyh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dym.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dym.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dyf.c.optionalFieldOf("position_predicate", dye.b).forGetter($$0x -> $$0x.e),
               dfa.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               dza.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyh::new)
   );
   private final dym c;
   private final dym d;
   private final dyf e;
   private final dfa f;
   private final dza g;

   public dyh(dym $$0, dym $$1, dfa $$2) {
      this($$0, $$1, dye.b, $$2);
   }

   public dyh(dym $$0, dym $$1, dyf $$2, dfa $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dyh(dym $$0, dym $$1, dyf $$2, dfa $$3, dza $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dfa $$0, dfa $$1, gu $$2, gu $$3, gu $$4, aru $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dfa a() {
      return this.f;
   }

   @Nullable
   public qr a(aru $$0, @Nullable qr $$1) {
      return this.g.a($$0, $$1);
   }
}
