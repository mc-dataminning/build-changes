import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ert {
   public static final esl a = esl.a;
   public static final Codec<ert> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ery.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ery.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               err.c.lenientOptionalFieldOf("position_predicate", erq.b).forGetter($$0x -> $$0x.e),
               dxn.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               esm.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ert::new)
   );
   private final ery c;
   private final ery d;
   private final err e;
   private final dxn f;
   private final esm g;

   public ert(ery $$0, ery $$1, dxn $$2) {
      this($$0, $$1, erq.b, $$2);
   }

   public ert(ery $$0, ery $$1, err $$2, dxn $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ert(ery $$0, ery $$1, err $$2, dxn $$3, esm $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dxn $$0, dxn $$1, jh $$2, jh $$3, jh $$4, bam $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dxn a() {
      return this.f;
   }

   @Nullable
   public ux a(bam $$0, @Nullable ux $$1) {
      return this.g.a($$0, $$1);
   }
}
