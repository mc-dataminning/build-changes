import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dah(ke d, Optional<dzg> e, efj f) implements czz {
   public static final MapCodec<dah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dah::b),
               dzg.b.optionalFieldOf("predicate").forGetter(dah::c),
               efj.a.fieldOf("block_state").forGetter(dah::d)
            )
            .apply($$0, dah::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      ja $$5 = ja.a($$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true)) {
         $$0.b($$5, this.f.a($$3.dS(), $$5));
      }
   }

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public ke b() {
      return this.d;
   }

   public Optional<dzg> c() {
      return this.e;
   }

   public efj d() {
      return this.f;
   }
}
