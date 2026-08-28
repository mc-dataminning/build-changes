import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eof {
   public static final eox a = eox.a;
   public static final Codec<eof> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eok.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eok.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eod.c.lenientOptionalFieldOf("position_predicate", eoc.b).forGetter($$0x -> $$0x.e),
               dua.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eoy.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eof::new)
   );
   private final eok c;
   private final eok d;
   private final eod e;
   private final dua f;
   private final eoy g;

   public eof(eok $$0, eok $$1, dua $$2) {
      this($$0, $$1, eoc.b, $$2);
   }

   public eof(eok $$0, eok $$1, eod $$2, dua $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eof(eok $$0, eok $$1, eod $$2, dua $$3, eoy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dua $$0, dua $$1, je $$2, je $$3, je $$4, azk $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dua a() {
      return this.f;
   }

   @Nullable
   public uf a(azk $$0, @Nullable uf $$1) {
      return this.g.a($$0, $$1);
   }
}
