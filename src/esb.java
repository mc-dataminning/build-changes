import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class esb {
   public static final est a = est.a;
   public static final Codec<esb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               esg.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               esg.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               erz.c.lenientOptionalFieldOf("position_predicate", ery.b).forGetter($$0x -> $$0x.e),
               dxv.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               esu.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, esb::new)
   );
   private final esg c;
   private final esg d;
   private final erz e;
   private final dxv f;
   private final esu g;

   public esb(esg $$0, esg $$1, dxv $$2) {
      this($$0, $$1, ery.b, $$2);
   }

   public esb(esg $$0, esg $$1, erz $$2, dxv $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public esb(esg $$0, esg $$1, erz $$2, dxv $$3, esu $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dxv $$0, dxv $$1, jh $$2, jh $$3, jh $$4, bam $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dxv a() {
      return this.f;
   }

   @Nullable
   public ux a(bam $$0, @Nullable ux $$1) {
      return this.g.a($$0, $$1);
   }
}
