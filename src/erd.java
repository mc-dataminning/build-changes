import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class erd {
   public static final erv a = erv.a;
   public static final Codec<erd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eri.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eri.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               erb.c.lenientOptionalFieldOf("position_predicate", era.b).forGetter($$0x -> $$0x.e),
               dwx.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               erw.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, erd::new)
   );
   private final eri c;
   private final eri d;
   private final erb e;
   private final dwx f;
   private final erw g;

   public erd(eri $$0, eri $$1, dwx $$2) {
      this($$0, $$1, era.b, $$2);
   }

   public erd(eri $$0, eri $$1, erb $$2, dwx $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public erd(eri $$0, eri $$1, erb $$2, dwx $$3, erw $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dwx $$0, dwx $$1, ji $$2, ji $$3, ji $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dwx a() {
      return this.f;
   }

   @Nullable
   public tq a(azh $$0, @Nullable tq $$1) {
      return this.g.a($$0, $$1);
   }
}
