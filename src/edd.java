import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class edd {
   public static final edv a = edv.a;
   public static final Codec<edd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               edi.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               edb.c.optionalFieldOf("position_predicate", eda.b).forGetter($$0x -> $$0x.e),
               djp.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               edw.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, edd::new)
   );
   private final edi c;
   private final edi d;
   private final edb e;
   private final djp f;
   private final edw g;

   public edd(edi $$0, edi $$1, djp $$2) {
      this($$0, $$1, eda.b, $$2);
   }

   public edd(edi $$0, edi $$1, edb $$2, djp $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public edd(edi $$0, edi $$1, edb $$2, djp $$3, edw $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(djp $$0, djp $$1, hx $$2, hx $$3, hx $$4, auw $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public djp a() {
      return this.f;
   }

   @Nullable
   public so a(auw $$0, @Nullable so $$1) {
      return this.g.a($$0, $$1);
   }
}
