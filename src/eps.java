import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eps {
   public static final eqk a = eqk.a;
   public static final Codec<eps> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epx.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               epx.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               epq.c.lenientOptionalFieldOf("position_predicate", epp.b).forGetter($$0x -> $$0x.e),
               dvo.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eql.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eps::new)
   );
   private final epx c;
   private final epx d;
   private final epq e;
   private final dvo f;
   private final eql g;

   public eps(epx $$0, epx $$1, dvo $$2) {
      this($$0, $$1, epp.b, $$2);
   }

   public eps(epx $$0, epx $$1, epq $$2, dvo $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eps(epx $$0, epx $$1, epq $$2, dvo $$3, eql $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dvo $$0, dvo $$1, jh $$2, jh $$3, jh $$4, azv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dvo a() {
      return this.f;
   }

   @Nullable
   public un a(azv $$0, @Nullable un $$1) {
      return this.g.a($$0, $$1);
   }
}
