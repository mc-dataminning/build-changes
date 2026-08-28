import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ema {
   public static final ems a = ems.a;
   public static final Codec<ema> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emf.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               emf.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ely.c.lenientOptionalFieldOf("position_predicate", elx.b).forGetter($$0x -> $$0x.e),
               dsd.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               emt.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ema::new)
   );
   private final emf c;
   private final emf d;
   private final ely e;
   private final dsd f;
   private final emt g;

   public ema(emf $$0, emf $$1, dsd $$2) {
      this($$0, $$1, elx.b, $$2);
   }

   public ema(emf $$0, emf $$1, ely $$2, dsd $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ema(emf $$0, emf $$1, ely $$2, dsd $$3, emt $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dsd $$0, dsd $$1, iz $$2, iz $$3, iz $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dsd a() {
      return this.f;
   }

   @Nullable
   public us a(azh $$0, @Nullable us $$1) {
      return this.g.a($$0, $$1);
   }
}
