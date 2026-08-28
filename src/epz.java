import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epz {
   public static final eqr a = eqr.a;
   public static final Codec<epz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eqe.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eqe.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               epx.c.lenientOptionalFieldOf("position_predicate", epw.b).forGetter($$0x -> $$0x.e),
               dvv.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eqs.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, epz::new)
   );
   private final eqe c;
   private final eqe d;
   private final epx e;
   private final dvv f;
   private final eqs g;

   public epz(eqe $$0, eqe $$1, dvv $$2) {
      this($$0, $$1, epw.b, $$2);
   }

   public epz(eqe $$0, eqe $$1, epx $$2, dvv $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public epz(eqe $$0, eqe $$1, epx $$2, dvv $$3, eqs $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dvv $$0, dvv $$1, jh $$2, jh $$3, jh $$4, azu $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dvv a() {
      return this.f;
   }

   @Nullable
   public ul a(azu $$0, @Nullable ul $$1) {
      return this.g.a($$0, $$1);
   }
}
