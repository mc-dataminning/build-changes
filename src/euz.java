import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class euz {
   public static final evr a = evr.a;
   public static final Codec<euz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eve.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eve.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eux.c.lenientOptionalFieldOf("position_predicate", euw.b).forGetter($$0x -> $$0x.e),
               eao.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               evs.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, euz::new)
   );
   private final eve c;
   private final eve d;
   private final eux e;
   private final eao f;
   private final evs g;

   public euz(eve $$0, eve $$1, eao $$2) {
      this($$0, $$1, euw.b, $$2);
   }

   public euz(eve $$0, eve $$1, eux $$2, eao $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public euz(eve $$0, eve $$1, eux $$2, eao $$3, evs $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(eao $$0, eao $$1, iv $$2, iv $$3, iv $$4, azv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public eao a() {
      return this.f;
   }

   @Nullable
   public tz a(azv $$0, @Nullable tz $$1) {
      return this.g.a($$0, $$1);
   }
}
