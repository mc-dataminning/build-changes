import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record day(kh d, Optional<eac> e, egf f, Optional<jm<dxw>> g) implements daq {
   public static final MapCodec<day> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.f.optionalFieldOf("offset", kh.g).forGetter(day::b),
               eac.b.optionalFieldOf("predicate").forGetter(day::c),
               egf.a.fieldOf("block_state").forGetter(day::d),
               dxw.aj.optionalFieldOf("trigger_game_event").forGetter(day::e)
            )
            .apply($$0, day::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      jd $$5 = jd.a((jw)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dT(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<day> a() {
      return a;
   }

   public kh b() {
      return this.d;
   }

   public Optional<eac> c() {
      return this.e;
   }

   public egf d() {
      return this.f;
   }

   public Optional<jm<dxw>> e() {
      return this.g;
   }
}
